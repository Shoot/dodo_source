package defpackage;

import com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter;
/* compiled from: ShoppingCartPresenter_Factory.java */
/* renamed from: hja  reason: default package */
/* loaded from: classes2.dex */
public final class hja implements no3<ShoppingCartPresenter> {
    private final as8<Cdo> a;
    private final as8<df4> b;
    private final as8<nfa> c;
    private final as8<o63> d;
    private final as8<i00> e;
    private final as8<k63> f;
    private final as8<cs0> g;
    private final as8<wg6> h;
    private final as8<wia> i;
    private final as8<zxa> j;
    private final as8<bo> k;
    private final as8<hq3> l;
    private final as8<bq> m;
    private final as8<nia> n;
    private final as8<f5b> o;
    private final as8<f63> p;

    public hja(as8<Cdo> as8Var, as8<df4> as8Var2, as8<nfa> as8Var3, as8<o63> as8Var4, as8<i00> as8Var5, as8<k63> as8Var6, as8<cs0> as8Var7, as8<wg6> as8Var8, as8<wia> as8Var9, as8<zxa> as8Var10, as8<bo> as8Var11, as8<hq3> as8Var12, as8<bq> as8Var13, as8<nia> as8Var14, as8<f5b> as8Var15, as8<f63> as8Var16) {
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
        this.m = as8Var13;
        this.n = as8Var14;
        this.o = as8Var15;
        this.p = as8Var16;
    }

    public static hja a(as8<Cdo> as8Var, as8<df4> as8Var2, as8<nfa> as8Var3, as8<o63> as8Var4, as8<i00> as8Var5, as8<k63> as8Var6, as8<cs0> as8Var7, as8<wg6> as8Var8, as8<wia> as8Var9, as8<zxa> as8Var10, as8<bo> as8Var11, as8<hq3> as8Var12, as8<bq> as8Var13, as8<nia> as8Var14, as8<f5b> as8Var15, as8<f63> as8Var16) {
        return new hja(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, as8Var13, as8Var14, as8Var15, as8Var16);
    }

    public static ShoppingCartPresenter c(Cdo cdo, df4 df4Var, nfa nfaVar, o63 o63Var, i00 i00Var, k63 k63Var, cs0 cs0Var, wg6 wg6Var, wia wiaVar, zxa zxaVar, bo boVar, hq3 hq3Var, bq bqVar, nia niaVar, f5b f5bVar, f63 f63Var) {
        return new ShoppingCartPresenter(cdo, df4Var, nfaVar, o63Var, i00Var, k63Var, cs0Var, wg6Var, wiaVar, zxaVar, boVar, hq3Var, bqVar, niaVar, f5bVar, f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ShoppingCartPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get());
    }
}
