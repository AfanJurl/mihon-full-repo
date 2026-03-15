package eu.kanade.tachiyomi.extension.ar.elarabscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ElarabScans : Madara("ElarabScans", "https://elarab-scans.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
