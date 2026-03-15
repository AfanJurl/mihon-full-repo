package eu.kanade.tachiyomi.extension.en.mangadex

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaDex : Madara("MangaDex", "https://mangadex.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
