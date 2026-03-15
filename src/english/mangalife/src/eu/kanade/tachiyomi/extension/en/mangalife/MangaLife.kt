package eu.kanade.tachiyomi.extension.en.mangalife

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaLife : Madara("MangaLife", "https://manga4life.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
