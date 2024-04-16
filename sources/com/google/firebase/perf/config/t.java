package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class t extends v<Long> {
    private static t a;

    private t() {
    }

    public static synchronized t e() {
        t tVar;
        synchronized (t.class) {
            try {
                if (a == null) {
                    a = new t();
                }
                tVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 300L;
    }
}
