package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class c6 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ long d;
    private final /* synthetic */ y5 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c6(y5 y5Var, String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        String str = this.a;
        if (str == null) {
            vaVar2 = this.e.a;
            vaVar2.D(this.b, null);
            return;
        }
        p8 p8Var = new p8(this.c, str, this.d);
        vaVar = this.e.a;
        vaVar.D(this.b, p8Var);
    }
}
