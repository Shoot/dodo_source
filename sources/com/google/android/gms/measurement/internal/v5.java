package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class v5 implements Runnable {
    private final /* synthetic */ y6 a;
    private final /* synthetic */ u5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v5(u5 u5Var, y6 y6Var) {
        this.a = y6Var;
        this.b = u5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u5.f(this.b, this.a);
        this.b.c(this.a.g);
    }
}
