package eu.kanade.tachiyomi.extension.ar.teamx

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class TeamX : Madara("TeamX", "https://teamxmanga.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
