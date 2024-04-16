package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class n extends v<Long> {
    private static n a;

    private n() {
    }

    public static synchronized n f() {
        n nVar;
        synchronized (n.class) {
            try {
                if (a == null) {
                    a = new n();
                }
                nVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
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
