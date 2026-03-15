package eu.kanade.tachiyomi.extension.en.mangakakalot

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Mangakakalot : Madara("Mangakakalot", "https://www.mangakakalot.gg", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
