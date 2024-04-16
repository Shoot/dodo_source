package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class g6 implements Callable<List<gb>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ y5 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g6(y5 y5Var, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = y5Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<gb> call() throws Exception {
        va vaVar;
        va vaVar2;
        vaVar = this.d.a;
        vaVar.o0();
        vaVar2 = this.d.a;
        return vaVar2.e0().x0(this.a, this.b, this.c);
    }
}
