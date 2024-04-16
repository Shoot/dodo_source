package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class u implements Runnable {
    private final /* synthetic */ u6 a;
    private final /* synthetic */ r b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(r rVar, u6 u6Var) {
        this.a = u6Var;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d();
        if (c.a()) {
            this.a.k().C(this);
            return;
        }
        boolean e = this.b.e();
        this.b.c = 0L;
        if (e) {
            this.b.d();
        }
    }
}
