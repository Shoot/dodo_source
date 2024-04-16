package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class b extends v<Boolean> {
    private static b a;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            try {
                if (a == null) {
                    a = new b();
                }
                bVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
