# Mihon Extension Repository

A full-featured Mihon/Tachiyomi extension repository with **84** real manga sources —
51 English and 33 Arabic.

---

## ➕ Add to Mihon

1. Open **Mihon**
2. Go to **Settings → Browse → Extension repos**
3. Tap **+** and paste:

```
https://afanjurl.github.io/mihon-full-repo/index.min.json
```

---

## 🚀 Deploy in 3 Steps

### 1. Create a GitHub repo
```bash
git init
git remote add origin https://github.com/YOUR_USERNAME/mihon-full-repo.git
```

### 2. Enable GitHub Pages
- Go to your repo → **Settings → Pages**
- Set source to **GitHub Actions**

### 3. Push the code
```bash
git add .
git commit -m "Initial commit"
git push -u origin main
```

GitHub Actions will automatically:
- Build all APKs (~15 minutes)
- Publish them to GitHub Pages
- Create a release with all APKs attached

Your `index.min.json` URL will be:
```
https://afanjurl.github.io/mihon-full-repo/index.min.json
```

---

## 📦 Sources Included

### English Sources (51)
| Name | URL |
|------|-----|
| Mangakakalot | https://www.mangakakalot.gg |
| MangaBats | https://www.mangabats.com |
| MangaRead | https://www.mangaread.org |
| XBato | https://xbato.org |
| Comick | https://comick.io |
| FlameScans | https://flamescans.org |
| MangaDex | https://mangadex.org |
| MangaSee | https://mangasee123.com |
| MangaPark | https://mangapark.net |
| MangaHere | https://www.mangahere.cc |
| FanFox | https://fanfox.net |
| MangaTown | https://www.mangatown.com |
| Manganato | https://manganato.com |
| ReadM | https://readm.org |
| AsuraScans | https://asuracomic.net |
| ReaperScans | https://reaperscans.com |
| LuminousScans | https://luminousscans.com |
| AlphaScans | https://alphascans.org |
| ZeroScans | https://zeroscans.com |
| MangaHub | https://mangahub.io |
| ManhwaTop | https://manhwatop.com |
| ManhwaClan | https://manhwaclan.com |
| ZinManga | https://zinmanga.net |
| IsekaiScan | https://isekaiscan.top |
| ManhuaPlus | https://manhuaplus.org |
| TCBScans | https://tcbscans.me |
| NightScans | https://nightscans.org |
| VoidScans | https://void-scans.com |
| MangaBuddy | https://mangabuddy.com |
| Toonily | https://toonily.com |
| Dynasty | https://dynasty-scans.com |
| Bato | https://bato.to |
| MMScans | https://mm-scans.org |
| MangaLife | https://manga4life.com |
| HatigarmScans | https://hatigarmscans.net |
| Drakeina | https://drakeina.com |
| MangaPill | https://mangapill.com |
| MangaFreak | https://w15.mangafreak.net |
| ReadManhwa | https://readmanhwa.com |
| MangaOwl | https://mangaowl.to |
| MangaInn | https://www.mangainn.net |
| MangaGo | https://www.mangago.me |
| NetTruyen | https://nettruyen.com |
| ComicExtra | https://comicextra.me |
| MangaStream | https://readms.net |
| Tapas | https://tapas.io |
| Webtoons | https://www.webtoons.com |
| MangaPlus | https://mangaplus.shueisha.com |
| Manhwa18 | https://manhwa18.net |
| GigaScans | https://gigascans.com |
| SuryaScans | https://suryascans.com |

### Arabic Sources (33)
| Name | URL |
|------|-----|
| AzoraMoon | https://azoramoon.com |
| MangaSwat | https://mangaswat.com |
| MangaLek | https://mangalek.com |
| Manga3asq | https://3asq.org |
| AresManga | https://aresmanga.com |
| GManga | https://gmanga.me |
| MangaArab | https://mangaarab.com |
| ArabianScan | https://arabianscan.com |
| TeamX | https://teamxmanga.com |
| GalaxyManga | https://galaxymanga.org |
| MangaInkAR | https://mangaink.net |
| MangaGTR | https://mangagtr.com |
| HizoManga | https://hizomanga.com |
| OzulScans | https://ozulscans.com |
| PhenixScans | https://phenixscans.com |
| TajManga | https://tajmanga.com |
| MangaJY | https://mangajy.com |
| Scan4Arab | https://scan4arab.com |
| ToonsGate | https://toonsgate.com |
| MangaMasr | https://mangamasr.com |
| MangaOr | https://mangaor.com |
| AlwatanManga | https://alwatanmanga.com |
| MangaSky | https://mangasky.net |
| MangaFlame | https://mangaflame.org |
| StarManga | https://starmanga.net |
| KonohaManga | https://konohamanga.net |
| HamlaManga | https://hamlamanga.com |
| MangaSnow | https://mangasnow.net |
| MangaTak | https://mangatak.com |
| ElarabScans | https://elarab-scans.com |
| DonghuaAR | https://donghua-ar.com |
| MangaHolics | https://mangaholics.net |
| ArabSeed | https://arabseed.ws |

---

## 🛠 Build Locally

Requirements: JDK 17, Android SDK

```bash
./gradlew assembleRelease --parallel
```

APKs will be in each module's `build/outputs/apk/release/` folder.

---

## ⚡ Cloudflare Bypass

All sources use `network.cloudflareClient` from the Tachiyomi extensions library,
which handles Cloudflare challenges automatically via a built-in WebView challenge solver.

---

## 📄 License

Apache 2.0 — see [LICENSE](LICENSE)
