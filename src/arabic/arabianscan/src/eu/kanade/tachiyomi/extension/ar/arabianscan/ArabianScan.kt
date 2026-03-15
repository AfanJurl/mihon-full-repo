package eu.kanade.tachiyomi.extension.ar.arabianscan

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ArabianScan : Madara("ArabianScan", "https://arabianscan.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
