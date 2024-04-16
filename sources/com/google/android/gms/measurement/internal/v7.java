package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class v7 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b = null;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ z6 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v7(z6 z6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.a = atomicReference;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a.I().M(this.a, null, this.c, this.d, this.e);
    }
}
