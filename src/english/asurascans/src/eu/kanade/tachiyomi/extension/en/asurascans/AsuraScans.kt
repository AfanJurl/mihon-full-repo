package eu.kanade.tachiyomi.extension.en.asurascans
import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale
class AsuraScans : Madara("AsuraScans", "https://asuracomic.net", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
