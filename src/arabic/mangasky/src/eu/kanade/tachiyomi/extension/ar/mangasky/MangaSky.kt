package eu.kanade.tachiyomi.extension.ar.mangasky

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaSky : Madara("MangaSky", "https://mangasky.net", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
