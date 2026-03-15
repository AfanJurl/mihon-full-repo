package eu.kanade.tachiyomi.extension.en.mangahere

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaHere : Madara("MangaHere", "https://www.mangahere.cc", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
