package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class u9 implements Runnable {
    private final /* synthetic */ q9 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u9(q9 q9Var) {
        this.a = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x8.F(this.a.c, new ComponentName(this.a.c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
