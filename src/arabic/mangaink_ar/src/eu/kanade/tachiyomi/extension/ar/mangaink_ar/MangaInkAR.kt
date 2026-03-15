package eu.kanade.tachiyomi.extension.ar.mangaink_ar

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaInkAR : Madara("MangaInkAR", "https://mangaink.net", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
