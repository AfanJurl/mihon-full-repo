package eu.kanade.tachiyomi.extension.en.mangatown

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaTown : Madara("MangaTown", "https://www.mangatown.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
