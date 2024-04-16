package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class n4 implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ Object d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ k4 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n4(k4 k4Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        w4 E = this.f.a.E();
        if (E.r()) {
            c = this.f.c;
            if (c == 0) {
                if (this.f.a().T()) {
                    this.f.c = 'C';
                } else {
                    this.f.c = 'c';
                }
            }
            j = this.f.d;
            if (j < 0) {
                this.f.d = 84002L;
            }
            char charAt = "01VDIWEA?".charAt(this.a);
            c2 = this.f.c;
            j2 = this.f.d;
            String str = "2" + charAt + c2 + j2 + ":" + k4.w(true, this.b, this.c, this.d, this.e);
            if (str.length() > 1024) {
                str = this.b.substring(0, 1024);
            }
            a5 a5Var = E.f;
            if (a5Var != null) {
                a5Var.b(str, 1L);
                return;
            }
            return;
        }
        this.f.x(6, "Persisted config not initialized. Not logging error/warn");
    }
}
