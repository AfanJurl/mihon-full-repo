package eu.kanade.tachiyomi.extension.en.mangabuddy

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaBuddy : Madara("MangaBuddy", "https://mangabuddy.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
