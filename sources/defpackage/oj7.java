package defpackage;
/* compiled from: OrderSummaryInteractorImpl_Factory.java */
/* renamed from: oj7  reason: default package */
/* loaded from: classes.dex */
public final class oj7 implements no3<nj7> {
    private final as8<gc> a;
    private final as8<qi7> b;
    private final as8<li7> c;
    private final as8<f5b> d;
    private final as8<e78> e;
    private final as8<kr3> f;
    private final as8<cz6> g;
    private final as8<hk7> h;
    private final as8<ava> i;
    private final as8<hq3> j;
    private final as8<x26> k;
    private final as8<kx1> l;

    public oj7(as8<gc> as8Var, as8<qi7> as8Var2, as8<li7> as8Var3, as8<f5b> as8Var4, as8<e78> as8Var5, as8<kr3> as8Var6, as8<cz6> as8Var7, as8<hk7> as8Var8, as8<ava> as8Var9, as8<hq3> as8Var10, as8<x26> as8Var11, as8<kx1> as8Var12) {
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

    public static oj7 a(as8<gc> as8Var, as8<qi7> as8Var2, as8<li7> as8Var3, as8<f5b> as8Var4, as8<e78> as8Var5, as8<kr3> as8Var6, as8<cz6> as8Var7, as8<hk7> as8Var8, as8<ava> as8Var9, as8<hq3> as8Var10, as8<x26> as8Var11, as8<kx1> as8Var12) {
        return new oj7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12);
    }

    public static nj7 c(gc gcVar, qi7 qi7Var, li7 li7Var, f5b f5bVar, e78 e78Var, kr3 kr3Var, cz6 cz6Var, hk7 hk7Var, ava avaVar, hq3 hq3Var, x26 x26Var, kx1 kx1Var) {
        return new nj7(gcVar, qi7Var, li7Var, f5bVar, e78Var, kr3Var, cz6Var, hk7Var, avaVar, hq3Var, x26Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nj7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
