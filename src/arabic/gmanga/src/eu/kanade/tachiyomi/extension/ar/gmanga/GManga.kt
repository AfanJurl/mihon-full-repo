package eu.kanade.tachiyomi.extension.ar.gmanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class GManga : Madara("GManga", "https://gmanga.me", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
