package eu.kanade.tachiyomi.extension.en.tcbscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class TCBScans : Madara("TCBScans", "https://tcbscans.me", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
