package eu.kanade.tachiyomi.extension.ar.tajmanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class TajManga : Madara("TajManga", "https://tajmanga.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
