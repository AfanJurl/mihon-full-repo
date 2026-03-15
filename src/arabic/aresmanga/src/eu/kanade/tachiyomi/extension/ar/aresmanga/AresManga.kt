package eu.kanade.tachiyomi.extension.ar.aresmanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class AresManga : Madara("AresManga", "https://aresmanga.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
