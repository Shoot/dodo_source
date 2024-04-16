package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class e6 implements Runnable {
    private final /* synthetic */ zzae a;
    private final /* synthetic */ y5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e6(y5 y5Var, zzae zzaeVar) {
        this.a = zzaeVar;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        va vaVar3;
        vaVar = this.b.a;
        vaVar.o0();
        if (this.a.c.h() == null) {
            vaVar3 = this.b.a;
            vaVar3.q(this.a);
            return;
        }
        vaVar2 = this.b.a;
        vaVar2.S(this.a);
    }
}
