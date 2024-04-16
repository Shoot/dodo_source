package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class u extends v<Double> {
    private static u a;

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized u f() {
        u uVar;
        synchronized (u.class) {
            try {
                if (a == null) {
                    a = new u();
                }
                uVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(1.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
