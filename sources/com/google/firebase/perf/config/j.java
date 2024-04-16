package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class j extends v<Long> {
    private static j a;

    private j() {
    }

    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            try {
                if (a == null) {
                    a = new j();
                }
                jVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 600L;
    }
}
