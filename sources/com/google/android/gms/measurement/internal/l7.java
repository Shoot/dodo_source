package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class l7 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7(z6 z6Var, boolean z) {
        this.a = z;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o = this.b.a.o();
        boolean m = this.b.a.m();
        this.b.a.j(this.a);
        if (m == this.a) {
            this.b.a.n().J().b("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.a.o() == o || this.b.a.o() != this.b.a.m()) {
            this.b.a.n().L().c("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(o));
        }
        this.b.v0();
    }
}
