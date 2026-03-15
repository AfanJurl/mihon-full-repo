package eu.kanade.tachiyomi.extension.en.reaperscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ReaperScans : Madara("ReaperScans", "https://reaperscans.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
