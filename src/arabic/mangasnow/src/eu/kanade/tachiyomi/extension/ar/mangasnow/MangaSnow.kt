package eu.kanade.tachiyomi.extension.ar.mangasnow

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaSnow : Madara("MangaSnow", "https://mangasnow.net", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
