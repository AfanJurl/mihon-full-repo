package eu.kanade.tachiyomi.extension.en.readmanhwa

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ReadManhwa : Madara("ReadManhwa", "https://readmanhwa.com", "en",
    SimpleDateFormat("MMMM dd, yyyy", Locale.US))
