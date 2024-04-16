package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class j6 implements Callable<zzaj> {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ y5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j6(y5 y5Var, zzo zzoVar) {
        this.a = zzoVar;
        this.b = y5Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzaj call() throws Exception {
        va vaVar;
        va vaVar2;
        vaVar = this.b.a;
        vaVar.o0();
        vaVar2 = this.b.a;
        return new zzaj(vaVar2.c(this.a.a));
    }
}
