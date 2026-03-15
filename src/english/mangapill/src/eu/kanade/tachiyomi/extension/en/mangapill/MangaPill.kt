package eu.kanade.tachiyomi.extension.en.mangapill

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaPill : Madara("MangaPill", "https://mangapill.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
