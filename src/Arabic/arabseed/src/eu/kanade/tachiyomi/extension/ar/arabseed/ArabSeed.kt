package eu.kanade.tachiyomi.extension.ar.arabseed

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ArabSeed : Madara("ArabSeed", "https://arabseed.ws", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
