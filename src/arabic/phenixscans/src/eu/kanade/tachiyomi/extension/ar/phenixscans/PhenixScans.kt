package eu.kanade.tachiyomi.extension.ar.phenixscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class PhenixScans : Madara("PhenixScans", "https://phenixscans.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
