package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: GlideExperiments.java */
/* loaded from: classes.dex */
public class e {
    private final Map<Class<?>, Object> a;

    /* compiled from: GlideExperiments.java */
    /* loaded from: classes.dex */
    static final class a {
        private final Map<Class<?>, Object> a = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        public e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }

    public boolean a(Class<Object> cls) {
        return this.a.containsKey(cls);
    }
}
