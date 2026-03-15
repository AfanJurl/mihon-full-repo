package eu.kanade.tachiyomi.extension.en.suryascans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class SuryaScans : Madara("SuryaScans", "https://suryascans.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
