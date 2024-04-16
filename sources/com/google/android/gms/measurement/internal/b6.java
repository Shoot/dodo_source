package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class b6 implements Runnable {
    private final /* synthetic */ zzae a;
    private final /* synthetic */ zzo b;
    private final /* synthetic */ y5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b6(y5 y5Var, zzae zzaeVar, zzo zzoVar) {
        this.a = zzaeVar;
        this.b = zzoVar;
        this.c = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        va vaVar3;
        vaVar = this.c.a;
        vaVar.o0();
        if (this.a.c.h() == null) {
            vaVar3 = this.c.a;
            vaVar3.r(this.a, this.b);
            return;
        }
        vaVar2 = this.c.a;
        vaVar2.T(this.a, this.b);
    }
}
