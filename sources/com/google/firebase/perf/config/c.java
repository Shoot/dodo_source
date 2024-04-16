package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class c extends v<Boolean> {
    private static c a;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            try {
                if (a == null) {
                    a = new c();
                }
                cVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "isEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
