package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class o7 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ long d;
    private final /* synthetic */ z6 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o7(z6 z6Var, String str, String str2, Object obj, long j) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
        this.e = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.Y(this.a, this.b, this.c, this.d);
    }
}
