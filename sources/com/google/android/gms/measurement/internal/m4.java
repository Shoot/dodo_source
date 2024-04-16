package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class m4 {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final /* synthetic */ k4 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m4(k4 k4Var, int i, boolean z, boolean z2) {
        this.d = k4Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.y(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.d.y(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.y(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.y(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
