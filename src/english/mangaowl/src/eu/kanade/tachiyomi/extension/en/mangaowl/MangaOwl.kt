package eu.kanade.tachiyomi.extension.en.mangaowl

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaOwl : Madara("MangaOwl", "https://mangaowl.to", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
