package eu.kanade.tachiyomi.extension.en.zinmanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ZinManga : Madara("ZinManga", "https://zinmanga.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
