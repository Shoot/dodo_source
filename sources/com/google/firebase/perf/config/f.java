package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class f extends v<String> {
    private static f a;
    private static final Map<Long, String> b = Collections.unmodifiableMap(new a());

    /* compiled from: ConfigurationConstants.java */
    /* loaded from: classes2.dex */
    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        f fVar;
        synchronized (f.class) {
            try {
                if (a == null) {
                    a = new f();
                }
                fVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String f(long j) {
        return b.get(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean g(long j) {
        return b.containsKey(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_log_source";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return ih0.c;
    }
}
