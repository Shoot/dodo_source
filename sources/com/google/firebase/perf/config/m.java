package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class m extends v<Long> {
    private static m a;

    private m() {
    }

    public static synchronized m e() {
        m mVar;
        synchronized (m.class) {
            try {
                if (a == null) {
                    a = new m();
                }
                mVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}
