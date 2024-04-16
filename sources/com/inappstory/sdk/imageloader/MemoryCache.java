package com.inappstory.sdk.imageloader;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class MemoryCache {
    public Map<String, SoftReference<Bitmap>> cache = Collections.synchronizedMap(new HashMap());
    public Map<String, String> cacheSettings = Collections.synchronizedMap(new HashMap());

    public void clear() {
        this.cache.clear();
        this.cacheSettings.clear();
    }

    public Bitmap get(String str) {
        if (!this.cache.containsKey(str)) {
            return null;
        }
        return this.cache.get(str).get();
    }

    public String getSettings(String str) {
        if (!this.cacheSettings.containsKey(str)) {
            return null;
        }
        return this.cacheSettings.get(str);
    }

    public void put(String str, Bitmap bitmap) {
        this.cache.put(str, new SoftReference<>(bitmap));
    }

    public void putSettings(String str, String str2) {
        this.cacheSettings.put(str, str2);
    }
}
