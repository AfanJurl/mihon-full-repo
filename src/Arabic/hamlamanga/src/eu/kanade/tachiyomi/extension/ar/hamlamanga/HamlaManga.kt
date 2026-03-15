package eu.kanade.tachiyomi.extension.ar.hamlamanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class HamlaManga : Madara("HamlaManga", "https://hamlamanga.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
