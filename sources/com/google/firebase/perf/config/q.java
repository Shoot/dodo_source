package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class q extends v<Long> {
    private static q a;

    private q() {
    }

    public static synchronized q f() {
        q qVar;
        synchronized (q.class) {
            try {
                if (a == null) {
                    a = new q();
                }
                qVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 100L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
