package eu.kanade.tachiyomi.extension.en.toonily

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Toonily : Madara("Toonily", "https://toonily.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
