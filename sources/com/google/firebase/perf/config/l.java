package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class l extends v<Boolean> {
    private static l a;

    protected l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            try {
                if (a == null) {
                    a = new l();
                }
                lVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.TRUE;
    }
}
