package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class n6 implements Runnable {
    private final /* synthetic */ zznb a;
    private final /* synthetic */ zzo b;
    private final /* synthetic */ y5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n6(y5 y5Var, zznb zznbVar, zzo zzoVar) {
        this.a = zznbVar;
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
        if (this.a.h() == null) {
            vaVar3 = this.c.a;
            vaVar3.E(this.a.b, this.b);
            return;
        }
        vaVar2 = this.c.a;
        vaVar2.w(this.a, this.b);
    }
}
