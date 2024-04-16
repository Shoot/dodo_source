package defpackage;
/* compiled from: Density.kt */
/* renamed from: zz2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zz2 {
    public static int a(a03 a03Var, float f) {
        int c;
        float n0 = a03Var.n0(f);
        if (!Float.isInfinite(n0)) {
            c = la6.c(n0);
            return c;
        }
        return Integer.MAX_VALUE;
    }

    public static float b(a03 a03Var, long j) {
        if (ycb.g(wcb.g(j), ycb.b.b())) {
            return wcb.h(j) * a03Var.k0() * a03Var.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float c(a03 a03Var, float f) {
        return f * a03Var.getDensity();
    }

    public static long d(a03 a03Var, long j) {
        if (j != l73.a.a()) {
            return ina.a(a03Var.n0(l73.e(j)), a03Var.n0(l73.d(j)));
        }
        return cna.b.a();
    }

    public static long e(a03 a03Var, float f) {
        return xcb.d(f / (a03Var.k0() * a03Var.getDensity()));
    }
}
