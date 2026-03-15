package eu.kanade.tachiyomi.extension.en.manhwaclan

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ManhwaClan : Madara("ManhwaClan", "https://manhwaclan.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
