package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class da implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ ea b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public da(ea eaVar, long j) {
        this.a = j;
        this.b = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ea.H(this.b, this.a);
    }
}
