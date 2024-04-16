package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class p6 implements Callable<List<gb>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ y5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p6(y5 y5Var, String str) {
        this.a = str;
        this.b = y5Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<gb> call() throws Exception {
        va vaVar;
        va vaVar2;
        vaVar = this.b.a;
        vaVar.o0();
        vaVar2 = this.b.a;
        return vaVar2.e0().L0(this.a);
    }
}
