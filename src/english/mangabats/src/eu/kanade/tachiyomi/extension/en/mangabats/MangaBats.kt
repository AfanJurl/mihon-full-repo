package eu.kanade.tachiyomi.extension.en.mangabats

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaBats : Madara("MangaBats", "https://www.mangabats.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
