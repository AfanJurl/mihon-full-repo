package eu.kanade.tachiyomi.extension.ar.mangatak

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangaTak : Madara("MangaTak", "https://mangatak.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
