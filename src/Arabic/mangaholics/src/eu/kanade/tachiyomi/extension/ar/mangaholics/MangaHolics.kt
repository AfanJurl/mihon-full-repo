package eu.kanade.tachiyomi.extension.ar.mangaholics

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaHolics : Madara("MangaHolics", "https://mangaholics.net", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
