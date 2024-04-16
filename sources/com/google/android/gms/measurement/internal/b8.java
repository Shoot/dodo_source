package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class b8 implements Runnable {
    private final /* synthetic */ Boolean a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b8(z6 z6Var, Boolean bool) {
        this.a = bool;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.Q(this.a, true);
    }
}
