package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class s8 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ o8 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s8(o8 o8Var, long j) {
        this.a = j;
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.m().u(this.a);
        this.b.e = null;
    }
}
