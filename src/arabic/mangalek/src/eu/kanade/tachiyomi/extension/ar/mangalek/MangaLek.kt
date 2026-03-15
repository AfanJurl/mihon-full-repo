package eu.kanade.tachiyomi.extension.ar.mangalek

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaLek : Madara("MangaLek", "https://mangalek.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
