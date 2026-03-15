package eu.kanade.tachiyomi.extension.en.comick

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Comick : Madara("Comick", "https://comick.io", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
