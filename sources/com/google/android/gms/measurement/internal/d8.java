package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class d8 implements Runnable {
    private final /* synthetic */ w6 a;
    private final /* synthetic */ long b;
    private final /* synthetic */ long c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ w6 e;
    private final /* synthetic */ z6 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d8(z6 z6Var, w6 w6Var, long j, long j2, boolean z, w6 w6Var2) {
        this.a = w6Var;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = w6Var2;
        this.f = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.J(this.a);
        this.f.D(this.b, false);
        z6.L(this.f, this.a, this.c, true, this.d);
        if (s8d.a() && this.f.a().s(b0.s0)) {
            z6.M(this.f, this.a, this.e);
        }
    }
}
