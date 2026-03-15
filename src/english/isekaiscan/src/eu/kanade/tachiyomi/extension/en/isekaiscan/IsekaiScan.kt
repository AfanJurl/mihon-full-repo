package eu.kanade.tachiyomi.extension.en.isekaiscan

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class IsekaiScan : Madara("IsekaiScan", "https://isekaiscan.top", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
