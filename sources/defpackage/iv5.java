package defpackage;
/* compiled from: LocalityScopeLifecycleHandler_Factory.java */
/* renamed from: iv5  reason: default package */
/* loaded from: classes3.dex */
public final class iv5 implements no3<hv5> {
    private final as8<dt5> a;
    private final as8<ay1> b;
    private final as8<k63> c;
    private final as8<jv5> d;
    private final as8<rt5> e;
    private final as8<dq3> f;
    private final as8<i00> g;
    private final as8<t52> h;
    private final as8<i32> i;
    private final as8<bo> j;
    private final as8<kx1> k;
    private final as8<qx1> l;

    public iv5(as8<dt5> as8Var, as8<ay1> as8Var2, as8<k63> as8Var3, as8<jv5> as8Var4, as8<rt5> as8Var5, as8<dq3> as8Var6, as8<i00> as8Var7, as8<t52> as8Var8, as8<i32> as8Var9, as8<bo> as8Var10, as8<kx1> as8Var11, as8<qx1> as8Var12) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
        this.j = as8Var10;
        this.k = as8Var11;
        this.l = as8Var12;
    }

    public static iv5 a(as8<dt5> as8Var, as8<ay1> as8Var2, as8<k63> as8Var3, as8<jv5> as8Var4, as8<rt5> as8Var5, as8<dq3> as8Var6, as8<i00> as8Var7, as8<t52> as8Var8, as8<i32> as8Var9, as8<bo> as8Var10, as8<kx1> as8Var11, as8<qx1> as8Var12) {
        return new iv5(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12);
    }

    public static hv5 c(dt5 dt5Var, as8<ay1> as8Var, k63 k63Var, jv5 jv5Var, rt5 rt5Var, dq3 dq3Var, i00 i00Var, t52 t52Var, i32 i32Var, bo boVar, kx1 kx1Var, qx1 qx1Var) {
        return new hv5(dt5Var, as8Var, k63Var, jv5Var, rt5Var, dq3Var, i00Var, t52Var, i32Var, boVar, kx1Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hv5 get() {
        return c(this.a.get(), this.b, this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
