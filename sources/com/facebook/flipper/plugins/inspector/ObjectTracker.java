package com.facebook.flipper.plugins.inspector;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class ObjectTracker {
    private final Map<String, SoftReference<Object>> mObjects = new HashMap();

    public void clear() {
        this.mObjects.clear();
    }

    public boolean contains(String str) {
        return this.mObjects.containsKey(str);
    }

    public Object get(String str) {
        SoftReference<Object> softReference = this.mObjects.get(str);
        if (softReference == null) {
            return null;
        }
        Object obj = softReference.get();
        if (obj == null) {
            this.mObjects.remove(str);
        }
        return obj;
    }

    public void put(String str, Object obj) {
        this.mObjects.put(str, new SoftReference<>(obj));
    }

    public void remove(String str) {
        this.mObjects.remove(str);
    }
}
