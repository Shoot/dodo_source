package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class h extends v<Long> {
    private static h a;

    private h() {
    }

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            try {
                if (a == null) {
                    a = new h();
                }
                hVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 700L;
    }
}
