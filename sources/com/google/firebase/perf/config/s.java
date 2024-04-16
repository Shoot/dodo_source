package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class s extends v<Long> {
    private static s a;

    private s() {
    }

    public static synchronized s e() {
        s sVar;
        synchronized (s.class) {
            try {
                if (a == null) {
                    a = new s();
                }
                sVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 30L;
    }
}
