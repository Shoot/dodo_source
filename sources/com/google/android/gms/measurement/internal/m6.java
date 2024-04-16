package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class m6 implements Runnable {
    private final /* synthetic */ zzbe a;
    private final /* synthetic */ zzo b;
    private final /* synthetic */ y5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6(y5 y5Var, zzbe zzbeVar, zzo zzoVar) {
        this.a = zzbeVar;
        this.b = zzoVar;
        this.c = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.Y1(this.c.W1(this.a, this.b), this.b);
    }
}
