package eu.kanade.tachiyomi.extension.en.gigascans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class GigaScans : Madara("GigaScans", "https://gigascans.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
