package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class t8 implements Runnable {
    private final /* synthetic */ o8 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t8(o8 o8Var) {
        this.a = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p8 p8Var;
        o8 o8Var = this.a;
        p8Var = o8Var.j;
        o8Var.e = p8Var;
    }
}
