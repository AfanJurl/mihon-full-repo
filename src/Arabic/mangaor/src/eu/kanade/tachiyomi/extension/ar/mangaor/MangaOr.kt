package eu.kanade.tachiyomi.extension.ar.mangaor

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaOr : Madara("MangaOr", "https://mangaor.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
