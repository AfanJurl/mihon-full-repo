package eu.kanade.tachiyomi.extension.en.zeroscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ZeroScans : Madara("ZeroScans", "https://zeroscans.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
