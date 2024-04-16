package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class l6 implements Runnable {
    private final /* synthetic */ zzbe a;
    private final /* synthetic */ String b;
    private final /* synthetic */ y5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l6(y5 y5Var, zzbe zzbeVar, String str) {
        this.a = zzbeVar;
        this.b = str;
        this.c = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.c.a;
        vaVar.o0();
        vaVar2 = this.c.a;
        vaVar2.t(this.a, this.b);
    }
}
