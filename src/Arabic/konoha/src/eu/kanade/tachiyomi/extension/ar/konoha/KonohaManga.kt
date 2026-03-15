package eu.kanade.tachiyomi.extension.ar.konoha

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class KonohaManga : Madara("KonohaManga", "https://konohamanga.net", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
