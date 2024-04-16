package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class e extends v<Double> {
    private static e a;

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            try {
                if (a == null) {
                    a = new e();
                }
                eVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "fragment_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(0.0d);
    }
}
