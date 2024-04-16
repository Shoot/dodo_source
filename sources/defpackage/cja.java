package defpackage;
/* compiled from: ShoppingCartModule_ProvideShoppingCartVOBuilderFactory.java */
/* renamed from: cja  reason: default package */
/* loaded from: classes2.dex */
public final class cja implements no3<mja> {
    private final as8<fq0> a;
    private final as8<g78> b;
    private final as8<uja> c;
    private final as8<e78> d;
    private final as8<hq3> e;
    private final as8<ava> f;
    private final as8<ej6> g;
    private final as8<ah6> h;
    private final as8<jn6> i;

    public cja(as8<fq0> as8Var, as8<g78> as8Var2, as8<uja> as8Var3, as8<e78> as8Var4, as8<hq3> as8Var5, as8<ava> as8Var6, as8<ej6> as8Var7, as8<ah6> as8Var8, as8<jn6> as8Var9) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
    }

    public static cja a(as8<fq0> as8Var, as8<g78> as8Var2, as8<uja> as8Var3, as8<e78> as8Var4, as8<hq3> as8Var5, as8<ava> as8Var6, as8<ej6> as8Var7, as8<ah6> as8Var8, as8<jn6> as8Var9) {
        return new cja(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static mja c(fq0 fq0Var, g78 g78Var, uja ujaVar, e78 e78Var, hq3 hq3Var, ava avaVar, ej6 ej6Var, ah6 ah6Var, jn6 jn6Var) {
        return (mja) jh8.e(yia.a.d(fq0Var, g78Var, ujaVar, e78Var, hq3Var, avaVar, ej6Var, ah6Var, jn6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mja get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
