package com.google.android.gms.common.api.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class q implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ t b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(t tVar, int i) {
        this.b = tVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h(this.a);
    }
}
