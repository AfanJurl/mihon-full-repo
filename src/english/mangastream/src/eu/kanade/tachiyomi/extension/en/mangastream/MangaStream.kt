package eu.kanade.tachiyomi.extension.en.mangastream

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaStream : Madara("MangaStream", "https://readms.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
