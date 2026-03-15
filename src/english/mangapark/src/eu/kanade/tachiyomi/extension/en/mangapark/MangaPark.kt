package eu.kanade.tachiyomi.extension.en.mangapark

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaPark : Madara("MangaPark", "https://mangapark.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
