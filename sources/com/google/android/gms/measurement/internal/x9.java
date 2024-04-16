package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class x9 implements Runnable {
    private final /* synthetic */ q9 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x9(q9 q9Var) {
        this.a = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.d = null;
        this.a.c.f0();
    }
}
