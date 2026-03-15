package eu.kanade.tachiyomi.extension.ar.galaxymanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class GalaxyManga : Madara("GalaxyManga", "https://galaxymanga.org", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
