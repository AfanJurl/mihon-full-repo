package eu.kanade.tachiyomi.extension.ar.starmanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class StarManga : Madara("StarManga", "https://starmanga.net", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
