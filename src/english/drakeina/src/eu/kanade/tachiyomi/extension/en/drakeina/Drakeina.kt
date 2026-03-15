package eu.kanade.tachiyomi.extension.en.drakeina

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Drakeina : Madara("Drakeina", "https://drakeina.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
