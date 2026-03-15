package eu.kanade.tachiyomi.extension.en.manhwatop

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ManhwaTop : Madara("ManhwaTop", "https://manhwatop.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
