package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class k6 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ y5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k6(y5 y5Var, zzo zzoVar) {
        this.a = zzoVar;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        int i;
        vaVar = this.b.a;
        vaVar.o0();
        vaVar2 = this.b.a;
        zzo zzoVar = this.a;
        vaVar2.k().l();
        vaVar2.p0();
        gh8.f(zzoVar.a);
        if (y5d.a() && vaVar2.c0().s(b0.Q0)) {
            i = zzoVar.A;
        } else {
            i = 100;
        }
        w6 f = w6.f(zzoVar.v, i);
        w6 Q = vaVar2.Q(zzoVar.a);
        vaVar2.n().J().c("Setting consent, package, consent", zzoVar.a, f);
        vaVar2.C(zzoVar.a, f);
        if (f.t(Q)) {
            vaVar2.b0(zzoVar);
        }
        if (y5d.a() && vaVar2.c0().s(b0.Q0)) {
            t c = t.c(zzoVar.B);
            if (!t.f.equals(c)) {
                vaVar2.n().J().c("Setting DMA consent. package, consent", zzoVar.a, c);
                vaVar2.B(zzoVar.a, c);
            }
        }
    }
}
