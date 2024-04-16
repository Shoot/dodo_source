package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class p extends v<Long> {
    private static p a;

    private p() {
    }

    public static synchronized p e() {
        p pVar;
        synchronized (p.class) {
            try {
                if (a == null) {
                    a = new p();
                }
                pVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}
