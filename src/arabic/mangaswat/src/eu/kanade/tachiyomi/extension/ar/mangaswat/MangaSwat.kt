package eu.kanade.tachiyomi.extension.ar.mangaswat

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaSwat : Madara("MangaSwat", "https://mangaswat.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
