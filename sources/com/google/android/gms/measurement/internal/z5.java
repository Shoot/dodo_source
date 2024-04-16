package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class z5 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ y5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z5(y5 y5Var, zzo zzoVar) {
        this.a = zzoVar;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.b.a;
        vaVar.o0();
        vaVar2 = this.b.a;
        vaVar2.Z(this.a);
    }
}
