package eu.kanade.tachiyomi.extension.en.alphascans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class AlphaScans : Madara("AlphaScans", "https://alphascans.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
