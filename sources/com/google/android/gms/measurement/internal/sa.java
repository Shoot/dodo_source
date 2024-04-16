package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class sa extends r {
    private final /* synthetic */ pa e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(pa paVar, u6 u6Var) {
        super(u6Var);
        this.e = paVar;
    }

    @Override // com.google.android.gms.measurement.internal.r
    public final void d() {
        this.e.y();
        this.e.n().J().a("Starting upload from DelayedRunnable");
        this.e.b.t0();
    }
}
