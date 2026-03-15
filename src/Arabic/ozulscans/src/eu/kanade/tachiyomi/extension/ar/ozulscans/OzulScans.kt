package eu.kanade.tachiyomi.extension.ar.ozulscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class OzulScans : Madara("OzulScans", "https://ozulscans.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
