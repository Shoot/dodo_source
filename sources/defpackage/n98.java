package defpackage;
/* compiled from: PizzeriaSuggestionInteractor_Factory.java */
/* renamed from: n98  reason: default package */
/* loaded from: classes2.dex */
public final class n98 implements no3<m98> {
    private final as8<i98> a;
    private final as8<e98> b;
    private final as8<la8> c;
    private final as8<x88> d;
    private final as8<gc> e;
    private final as8<hq3> f;
    private final as8<kx1> g;

    public n98(as8<i98> as8Var, as8<e98> as8Var2, as8<la8> as8Var3, as8<x88> as8Var4, as8<gc> as8Var5, as8<hq3> as8Var6, as8<kx1> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static n98 a(as8<i98> as8Var, as8<e98> as8Var2, as8<la8> as8Var3, as8<x88> as8Var4, as8<gc> as8Var5, as8<hq3> as8Var6, as8<kx1> as8Var7) {
        return new n98(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static m98 c(i98 i98Var, e98 e98Var, la8 la8Var, x88 x88Var, gc gcVar, hq3 hq3Var, kx1 kx1Var) {
        return new m98(i98Var, e98Var, la8Var, x88Var, gcVar, hq3Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public m98 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
