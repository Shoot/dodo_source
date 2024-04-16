package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class j7 implements Executor {
    private final /* synthetic */ z6 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j7(z6 z6Var) {
        this.a = z6Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.k().C(runnable);
    }
}
