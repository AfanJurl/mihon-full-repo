package eu.kanade.tachiyomi.extension.en.mangasee

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaSee : Madara("MangaSee", "https://mangasee123.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
