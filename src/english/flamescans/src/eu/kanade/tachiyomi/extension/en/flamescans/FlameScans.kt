package eu.kanade.tachiyomi.extension.en.flamescans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class FlameScans : Madara("FlameScans", "https://flamescans.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
