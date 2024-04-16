package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class o6 implements Callable<byte[]> {
    private final /* synthetic */ zzbe a;
    private final /* synthetic */ String b;
    private final /* synthetic */ y5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6(y5 y5Var, zzbe zzbeVar, String str) {
        this.a = zzbeVar;
        this.b = str;
        this.c = y5Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        va vaVar;
        va vaVar2;
        vaVar = this.c.a;
        vaVar.o0();
        vaVar2 = this.c.a;
        return vaVar2.j0().x(this.a, this.b);
    }
}
