package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class r7 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r7(z6 z6Var, long j) {
        this.a = j;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.D(this.a, true);
        this.b.s().J(new AtomicReference<>());
    }
}
