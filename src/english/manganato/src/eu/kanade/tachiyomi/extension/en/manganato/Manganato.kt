package eu.kanade.tachiyomi.extension.en.manganato

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Manganato : Madara("Manganato", "https://manganato.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
