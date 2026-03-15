package eu.kanade.tachiyomi.extension.en.fanfox

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class FanFox : Madara("FanFox", "https://fanfox.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
