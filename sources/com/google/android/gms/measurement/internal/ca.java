package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class ca implements Runnable {
    private final /* synthetic */ va a;
    private final /* synthetic */ Runnable b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ca(y9 y9Var, va vaVar, Runnable runnable) {
        this.a = vaVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o0();
        this.a.x(this.b);
        this.a.t0();
    }
}
