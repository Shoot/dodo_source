package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class k extends v<String> {
    private static k a;

    protected k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized k e() {
        k kVar;
        synchronized (k.class) {
            try {
                if (a == null) {
                    a = new k();
                }
                kVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_disabled_android_versions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return "";
    }
}
