package eu.kanade.tachiyomi.extension.en.voidscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class VoidScans : Madara("VoidScans", "https://void-scans.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
