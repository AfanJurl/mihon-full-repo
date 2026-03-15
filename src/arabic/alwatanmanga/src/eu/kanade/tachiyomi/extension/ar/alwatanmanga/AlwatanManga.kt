package eu.kanade.tachiyomi.extension.ar.alwatanmanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class AlwatanManga : Madara("AlwatanManga", "https://alwatanmanga.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
