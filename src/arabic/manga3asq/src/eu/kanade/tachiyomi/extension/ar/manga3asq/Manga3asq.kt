package eu.kanade.tachiyomi.extension.ar.manga3asq

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Manga3asq : Madara("Manga3asq", "https://3asq.org", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
