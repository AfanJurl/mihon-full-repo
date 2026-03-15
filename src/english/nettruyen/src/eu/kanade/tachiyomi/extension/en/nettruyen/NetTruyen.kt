package eu.kanade.tachiyomi.extension.en.nettruyen

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class NetTruyen : Madara("NetTruyen", "https://nettruyen.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
