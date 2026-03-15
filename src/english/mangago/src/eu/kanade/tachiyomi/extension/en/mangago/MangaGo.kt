package eu.kanade.tachiyomi.extension.en.mangago

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaGo : Madara("MangaGo", "https://www.mangago.me", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
