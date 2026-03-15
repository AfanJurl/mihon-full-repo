package eu.kanade.tachiyomi.extension.en.readm

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ReadM : Madara("ReadM", "https://readm.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
