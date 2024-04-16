package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class w7 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b = null;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ z6 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w7(z6 z6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.a = atomicReference;
        this.c = str2;
        this.d = str3;
        this.e = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.I().L(this.a, null, this.c, this.d);
    }
}
