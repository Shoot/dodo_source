package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class p7 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ long c;
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ String h;
    private final /* synthetic */ z6 i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p7(z6 z6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str3;
        this.i = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.T(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
