package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class x4 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ t4 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x4(t4 t4Var, boolean z) {
        this.a = z;
        this.b = t4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        vaVar = this.b.a;
        vaVar.H(this.a);
    }
}
