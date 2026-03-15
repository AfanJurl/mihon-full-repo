package eu.kanade.tachiyomi.extension.en.mangaread

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaRead : Madara("MangaRead", "https://www.mangaread.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
