package eu.kanade.tachiyomi.extension.en.xbato

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class XBato : Madara("XBato", "https://xbato.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
