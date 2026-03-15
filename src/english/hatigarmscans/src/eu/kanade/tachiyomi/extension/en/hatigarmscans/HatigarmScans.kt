package eu.kanade.tachiyomi.extension.en.hatigarmscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class HatigarmScans : Madara("HatigarmScans", "https://hatigarmscans.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
