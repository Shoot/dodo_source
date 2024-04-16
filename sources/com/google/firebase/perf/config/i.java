package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class i extends v<Double> {
    private static i a;

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized i f() {
        i iVar;
        synchronized (i.class) {
            try {
                if (a == null) {
                    a = new i();
                }
                iVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
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
