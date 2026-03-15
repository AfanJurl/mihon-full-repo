package eu.kanade.tachiyomi.extension.en.luminousscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class LuminousScans : Madara("LuminousScans", "https://luminousscans.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
