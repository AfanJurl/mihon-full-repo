package eu.kanade.tachiyomi.extension.ar.mangamasr

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaMasr : Madara("MangaMasr", "https://mangamasr.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
