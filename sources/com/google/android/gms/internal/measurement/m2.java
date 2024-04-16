package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class m2 implements l3 {
    private static final y2 b = new p2();
    private final y2 a;

    public m2() {
        this(new r2(c2.c(), b()));
    }

    private static y2 b() {
        try {
            return (y2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean c(w2 w2Var) {
        if (o2.a[w2Var.b().ordinal()] != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final <T> j3<T> a(Class<T> cls) {
        k3.o(cls);
        w2 a = this.a.a(cls);
        if (a.c()) {
            if (b2.class.isAssignableFrom(cls)) {
                return b3.i(k3.u(), u1.b(), a.zza());
            }
            return b3.i(k3.f(), u1.a(), a.zza());
        } else if (b2.class.isAssignableFrom(cls)) {
            if (c(a)) {
                return z2.m(cls, a, d3.b(), k2.c(), k3.u(), u1.b(), x2.b());
            }
            return z2.m(cls, a, d3.b(), k2.c(), k3.u(), null, x2.b());
        } else if (c(a)) {
            return z2.m(cls, a, d3.a(), k2.a(), k3.f(), u1.a(), x2.a());
        } else {
            return z2.m(cls, a, d3.a(), k2.a(), k3.f(), null, x2.a());
        }
    }

    private m2(y2 y2Var) {
        this.a = (y2) d2.f(y2Var, "messageInfoFactory");
    }
}
