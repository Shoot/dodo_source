package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class g8 implements Runnable {
    private final /* synthetic */ w6 a;
    private final /* synthetic */ long b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ w6 d;
    private final /* synthetic */ z6 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g8(z6 z6Var, w6 w6Var, long j, boolean z, w6 w6Var2) {
        this.a = w6Var;
        this.b = j;
        this.c = z;
        this.d = w6Var2;
        this.e = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.J(this.a);
        z6.L(this.e, this.a, this.b, false, this.c);
        if (s8d.a() && this.e.a().s(b0.s0)) {
            z6.M(this.e, this.a, this.d);
        }
    }
}
