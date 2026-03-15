package eu.kanade.tachiyomi.extension.ar.hizomanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class HizoManga : Madara("HizoManga", "https://hizomanga.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
