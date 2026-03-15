package eu.kanade.tachiyomi.extension.ar.mangaarab

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaArab : Madara("MangaArab", "https://mangaarab.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
