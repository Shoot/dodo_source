package defpackage;
/* compiled from: DeferredTimeModule_ProvideInteractorFactory.java */
/* renamed from: jt2  reason: default package */
/* loaded from: classes3.dex */
public final class jt2 implements no3<dt2> {
    private final as8<nt2> a;
    private final as8<vs2> b;
    private final as8<pt2> c;
    private final as8<Integer> d;
    private final as8<hq3> e;
    private final as8<x51> f;
    private final as8<f8c> g;
    private final as8<ps2> h;

    public jt2(as8<nt2> as8Var, as8<vs2> as8Var2, as8<pt2> as8Var3, as8<Integer> as8Var4, as8<hq3> as8Var5, as8<x51> as8Var6, as8<f8c> as8Var7, as8<ps2> as8Var8) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
    }

    public static jt2 a(as8<nt2> as8Var, as8<vs2> as8Var2, as8<pt2> as8Var3, as8<Integer> as8Var4, as8<hq3> as8Var5, as8<x51> as8Var6, as8<f8c> as8Var7, as8<ps2> as8Var8) {
        return new jt2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static dt2 c(nt2 nt2Var, vs2 vs2Var, pt2 pt2Var, int i, hq3 hq3Var, x51 x51Var, f8c f8cVar, ps2 ps2Var) {
        return (dt2) jh8.e(gt2.a.c(nt2Var, vs2Var, pt2Var, i, hq3Var, x51Var, f8cVar, ps2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dt2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get().intValue(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
