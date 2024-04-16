package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class v8 implements Runnable {
    private final /* synthetic */ p8 a;
    private final /* synthetic */ long b;
    private final /* synthetic */ o8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v8(o8 o8Var, p8 p8Var, long j) {
        this.a = p8Var;
        this.b = j;
        this.c = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.N(this.a, false, this.b);
        o8 o8Var = this.c;
        o8Var.e = null;
        o8Var.s().E(null);
    }
}
