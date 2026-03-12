#!/usr/bin/env python3
"""Updates index.min.json with real APK hashes and sizes after build."""
import os, sys, json, hashlib

apk_dir   = sys.argv[1]
index_path = sys.argv[2]

with open(index_path, encoding="utf-8") as f:
    index = json.load(f)

apk_map = {}
if os.path.isdir(apk_dir):
    for fn in os.listdir(apk_dir):
        if fn.endswith(".apk"):
            fp = os.path.join(apk_dir, fn)
            data = open(fp, "rb").read()
            apk_map[fn] = {
                "size": len(data),
                "md5":  hashlib.md5(data).hexdigest(),
                "sha256": hashlib.sha256(data).hexdigest(),
            }

for entry in index:
    apk = entry.get("apk", "")
    if apk in apk_map:
        entry.update(apk_map[apk])

with open(index_path, "w", encoding="utf-8") as f:
    json.dump(index, f, ensure_ascii=False, separators=(',', ':'))

print(f"Updated index with {len(apk_map)} APK entries.")
