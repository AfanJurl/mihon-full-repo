package eu.kanade.tachiyomi.extension.en.manhuaplus

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ManhuaPlus : Madara("ManhuaPlus", "https://manhuaplus.org", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
