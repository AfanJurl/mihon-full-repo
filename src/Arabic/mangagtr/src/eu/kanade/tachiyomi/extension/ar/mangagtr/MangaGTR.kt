package eu.kanade.tachiyomi.extension.ar.mangagtr

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaGTR : Madara("MangaGTR", "https://mangagtr.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
