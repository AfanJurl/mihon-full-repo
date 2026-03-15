package eu.kanade.tachiyomi.extension.ar.mangajy

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaJY : Madara("MangaJY", "https://mangajy.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
