package eu.kanade.tachiyomi.extension.en.mangainn

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaInn : Madara("MangaInn", "https://www.mangainn.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
