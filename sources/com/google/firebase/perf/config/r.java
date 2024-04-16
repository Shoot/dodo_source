package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class r extends v<Double> {
    private static r a;

    private r() {
    }

    public static synchronized r f() {
        r rVar;
        synchronized (r.class) {
            try {
                if (a == null) {
                    a = new r();
                }
                rVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(0.01d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
