package eu.kanade.tachiyomi.extension.en.nightscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class NightScans : Madara("NightScans", "https://nightscans.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
