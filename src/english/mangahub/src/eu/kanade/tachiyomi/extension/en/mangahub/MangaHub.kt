package eu.kanade.tachiyomi.extension.en.mangahub

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaHub : Madara("MangaHub", "https://mangahub.io", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
