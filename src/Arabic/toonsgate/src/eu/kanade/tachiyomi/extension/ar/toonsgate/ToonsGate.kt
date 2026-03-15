package eu.kanade.tachiyomi.extension.ar.toonsgate

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ToonsGate : Madara("ToonsGate", "https://toonsgate.com", "ar",
    SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()))
