package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class h7 implements r94<Object> {
    private final /* synthetic */ zzmh a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h7(z6 z6Var, zzmh zzmhVar) {
        this.a = zzmhVar;
        this.b = z6Var;
    }

    @Override // defpackage.r94
    public final void onFailure(Throwable th) {
        this.b.l();
        this.b.i = false;
        this.b.s0();
        this.b.n().F().b("registerTriggerAsync failed with throwable", th);
    }

    @Override // defpackage.r94
    public final void onSuccess(Object obj) {
        this.b.l();
        this.b.i = false;
        this.b.s0();
        this.b.n().E().b("registerTriggerAsync ran. uri", this.a.a);
    }
}
