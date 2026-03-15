package eu.kanade.tachiyomi.extension.en.comicextra

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ComicExtra : Madara("ComicExtra", "https://comicextra.me", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
