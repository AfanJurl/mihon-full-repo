package eu.kanade.tachiyomi.extension.ar.scan4arab

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Scan4Arab : Madara("Scan4Arab", "https://scan4arab.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
