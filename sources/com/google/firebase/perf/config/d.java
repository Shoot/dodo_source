package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class d extends v<Boolean> {
    private static d a;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            try {
                if (a == null) {
                    a = new d();
                }
                dVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
