package eu.kanade.tachiyomi.extension.ar.donghuaar

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class DonghuaAR : Madara("DonghuaAR", "https://donghua-ar.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
