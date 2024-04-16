package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class ya implements Runnable {
    private final /* synthetic */ fb a;
    private final /* synthetic */ va b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ya(va vaVar, fb fbVar) {
        this.a = fbVar;
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va.v(this.b, this.a);
        this.b.s0();
    }
}
