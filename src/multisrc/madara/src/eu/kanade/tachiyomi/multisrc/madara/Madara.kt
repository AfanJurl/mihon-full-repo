package eu.kanade.tachiyomi.multisrc.madara

import eu.kanade.tachiyomi.network.GET
import eu.kanade.tachiyomi.network.POST
import eu.kanade.tachiyomi.network.interceptor.rateLimit
import eu.kanade.tachiyomi.source.model.Filter
import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.online.ParsedHttpSource
import okhttp3.FormBody
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.concurrent.TimeUnit

abstract class Madara(
    override val name: String,
    override val baseUrl: String,
    override val lang: String,
    private val dateFormat: SimpleDateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.US),
) : ParsedHttpSource() {

    override val supportsLatest = true
    open val mangaSubString = "manga/"

    override val client: OkHttpClient = network.cloudflareClient.newBuilder()
        .rateLimit(3, 1, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor { chain ->
            chain.proceed(
                chain.request().newBuilder()
                    .addHeader("User-Agent", UA)
                    .addHeader("Referer", baseUrl)
                    .build()
            )
        }
        .build()

    override fun popularMangaRequest(page: Int): Request =
        GET("$baseUrl/${mangaSubString}${if (page > 1) "page/$page/" else ""}?m_orderby=views", headers)

    override fun popularMangaSelector() = "div.page-item-detail.manga"

    override fun popularMangaFromElement(element: Element): SManga = SManga.create().apply {
        thumbnail_url = element.select("img").firstOrNull()
            ?.let { it.attr("data-src").ifEmpty { it.attr("src") } }
        element.select("a").firstOrNull()?.let {
            setUrlWithoutDomain(it.attr("href"))
            title = it.attr("title").ifEmpty { it.text() }
        }
    }

    override fun popularMangaNextPageSelector() = "div.nav-previous, nav.navigation-ajax, a.nextpostslink"

    override fun latestUpdatesRequest(page: Int): Request =
        GET("$baseUrl/${mangaSubString}${if (page > 1) "page/$page/" else ""}?m_orderby=latest", headers)

    override fun latestUpdatesSelector() = popularMangaSelector()
    override fun latestUpdatesFromElement(element: Element) = popularMangaFromElement(element)
    override fun latestUpdatesNextPageSelector() = popularMangaNextPageSelector()

    override fun searchMangaRequest(page: Int, query: String, filters: FilterList): Request {
        val url = "$baseUrl/".toHttpUrl().newBuilder().apply {
            if (query.isNotEmpty()) {
                addQueryParameter("s", query)
                addQueryParameter("post_type", "wp-manga")
            } else {
                addPathSegments(mangaSubString)
                if (page > 1) addPathSegments("page/$page/")
                filters.forEach { filter ->
                    when (filter) {
                        is GenreFilter -> filter.state.filter { it.state }
                            .forEach { addQueryParameter("genre[]", it.id) }
                        is StatusFilter -> if (filter.state != 0)
                            addQueryParameter("status", filter.toUriPart())
                        is OrderByFilter -> if (filter.state != 0)
                            addQueryParameter("m_orderby", filter.toUriPart())
                        else -> {}
                    }
                }
            }
        }.build()
        return GET(url.toString(), headers)
    }

    override fun searchMangaSelector() = popularMangaSelector()
    override fun searchMangaFromElement(element: Element) = popularMangaFromElement(element)
    override fun searchMangaNextPageSelector() = popularMangaNextPageSelector()

    override fun mangaDetailsParse(document: Document): SManga = SManga.create().apply {
        val info = document.select("div.summary__content, div.post-content")
        title = document.select("div.post-title h1").text()
        author = info.select("div.author-content a").joinToString { it.text() }
        artist = info.select("div.artist-content a").joinToString { it.text() }.ifEmpty { author }
        genre = info.select("div.genres-content a").joinToString { it.text() }
        description = document.select("div.description-summary, div.summary__content p")
            .joinToString("\n") { it.text() }.trim()
        thumbnail_url = document.select("div.summary_image img")
            .firstOrNull()?.let { it.attr("data-src").ifEmpty { it.attr("src") } }
        status = when (info.select("div.summary-content").lastOrNull()?.text()?.lowercase()) {
            "ongoing", "مستمر" -> SManga.ONGOING
            "completed", "مكتمل" -> SManga.COMPLETED
            "dropped" -> SManga.CANCELLED
            "hiatus" -> SManga.ON_HIATUS
            else -> SManga.UNKNOWN
        }
    }

    override fun chapterListRequest(manga: SManga): Request {
        val mangaId = manga.url.trimEnd('/').substringAfterLast('/')
        return POST(
            "$baseUrl/wp-admin/admin-ajax.php", headers,
            FormBody.Builder()
                .add("action", "manga_get_chapters")
                .add("manga", mangaId)
                .build(),
        )
    }

    override fun chapterListSelector() = "li.wp-manga-chapter"

    override fun chapterFromElement(element: Element): SChapter = SChapter.create().apply {
        element.select("a").first()!!.let {
            setUrlWithoutDomain(it.attr("href"))
            name = it.text()
        }
        date_upload = try {
            dateFormat.parse(
                element.select("span.chapter-release-date i").text().trim()
            )?.time ?: 0L
        } catch (_: Exception) { 0L }
    }

    override fun pageListParse(document: Document): List<Page> =
        document.select("div.page-break img, div.reading-content img").mapIndexed { i, img ->
            Page(i, "", img.attr("data-src").ifEmpty { img.attr("src") }.trim())
        }

    override fun imageUrlParse(document: Document) = ""

    override fun getFilterList() = FilterList(
        OrderByFilter(), StatusFilter(), GenreFilter(getGenreList()),
    )

    open fun getGenreList() = listOf(
        Genre("Action", "action"), Genre("Adventure", "adventure"),
        Genre("Comedy", "comedy"), Genre("Drama", "drama"),
        Genre("Fantasy", "fantasy"), Genre("Horror", "horror"),
        Genre("Isekai", "isekai"), Genre("Manhwa", "manhwa"),
        Genre("Manhua", "manhua"), Genre("Martial Arts", "martial-arts"),
        Genre("Mystery", "mystery"), Genre("Romance", "romance"),
        Genre("Sci-fi", "sci-fi"), Genre("Seinen", "seinen"),
        Genre("Shoujo", "shoujo"), Genre("Shounen", "shounen"),
        Genre("Slice of Life", "slice-of-life"), Genre("Supernatural", "supernatural"),
        Genre("Tragedy", "tragedy"), Genre("Webtoons", "webtoons"),
    )

    class Genre(val displayName: String, val id: String) : Filter.CheckBox(displayName)
    class GenreFilter(genres: List<Genre>) : Filter.Group<Genre>("Genre", genres)
    open class StatusFilter : Filter.Select<String>(
        "Status", arrayOf("Any", "Ongoing", "Completed", "Hiatus", "Cancelled"),
    ) { fun toUriPart() = arrayOf("", "ongoing", "end", "hiatus", "canceled")[state] }
    open class OrderByFilter : Filter.Select<String>(
        "Order By", arrayOf("Default", "Latest", "A-Z", "Rating", "Trending", "Most Views", "New"),
    ) { fun toUriPart() = arrayOf("", "latest", "alphabet", "rating", "trending", "views", "new-manga")[state] }

    companion object {
        const val UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
            "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36"
    }
}
