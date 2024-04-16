package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class q8 implements Runnable {
    private final /* synthetic */ p8 a;
    private final /* synthetic */ p8 b;
    private final /* synthetic */ long c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ o8 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q8(o8 o8Var, p8 p8Var, p8 p8Var2, long j, boolean z) {
        this.a = p8Var;
        this.b = p8Var2;
        this.c = j;
        this.d = z;
        this.e = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.M(this.a, this.b, this.c, this.d, null);
    }
}
