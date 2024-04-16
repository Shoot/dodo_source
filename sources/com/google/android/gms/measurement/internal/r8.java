package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class r8 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ p8 b;
    private final /* synthetic */ p8 c;
    private final /* synthetic */ long d;
    private final /* synthetic */ o8 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r8(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j) {
        this.a = bundle;
        this.b = p8Var;
        this.c = p8Var2;
        this.d = j;
        this.e = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o8.I(this.e, this.a, this.b, this.c, this.d);
    }
}
