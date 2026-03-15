package eu.kanade.tachiyomi.extension.ar.azoramoon

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class AzoraMoon : Madara("AzoraMoon", "https://azoramoon.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
