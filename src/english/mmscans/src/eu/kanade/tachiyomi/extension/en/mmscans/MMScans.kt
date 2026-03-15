package eu.kanade.tachiyomi.extension.en.mmscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MMScans : Madara("MMScans", "https://mm-scans.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
