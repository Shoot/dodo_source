package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class v0 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ x b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(x xVar, long j) {
        this.a = j;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.A(this.a);
    }
}
