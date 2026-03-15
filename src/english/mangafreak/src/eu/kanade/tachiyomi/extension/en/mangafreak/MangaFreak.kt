package eu.kanade.tachiyomi.extension.en.mangafreak

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaFreak : Madara("MangaFreak", "https://w15.mangafreak.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
