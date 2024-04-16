package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class g extends v<Long> {
    private static g a;

    private g() {
    }

    public static synchronized g e() {
        g gVar;
        synchronized (g.class) {
            try {
                if (a == null) {
                    a = new g();
                }
                gVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 70L;
    }
}
