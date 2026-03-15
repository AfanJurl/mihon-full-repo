package eu.kanade.tachiyomi.extension.ar.mangaflame

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaFlame : Madara("MangaFlame", "https://mangaflame.org", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
