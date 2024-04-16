package defpackage;

import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
/* compiled from: CheckoutDetailsPresenter_Factory.java */
/* renamed from: r41  reason: default package */
/* loaded from: classes4.dex */
public final class r41 implements no3<CheckoutDetailsPresenter> {
    private final as8<b61> a;
    private final as8<i41> b;
    private final as8<dt5> c;
    private final as8<f63> d;
    private final as8<f63> e;
    private final as8<hq3> f;
    private final as8<ay1> g;
    private final as8<xtb> h;
    private final as8<gc> i;
    private final as8<wt9> j;
    private final as8<s41> k;
    private final as8<ih4> l;

    public r41(as8<b61> as8Var, as8<i41> as8Var2, as8<dt5> as8Var3, as8<f63> as8Var4, as8<f63> as8Var5, as8<hq3> as8Var6, as8<ay1> as8Var7, as8<xtb> as8Var8, as8<gc> as8Var9, as8<wt9> as8Var10, as8<s41> as8Var11, as8<ih4> as8Var12) {
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

    public static r41 a(as8<b61> as8Var, as8<i41> as8Var2, as8<dt5> as8Var3, as8<f63> as8Var4, as8<f63> as8Var5, as8<hq3> as8Var6, as8<ay1> as8Var7, as8<xtb> as8Var8, as8<gc> as8Var9, as8<wt9> as8Var10, as8<s41> as8Var11, as8<ih4> as8Var12) {
        return new r41(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12);
    }

    public static CheckoutDetailsPresenter c(b61 b61Var, i41 i41Var, dt5 dt5Var, f63 f63Var, f63 f63Var2, hq3 hq3Var, ay1 ay1Var, xtb xtbVar, gc gcVar, wt9 wt9Var, s41 s41Var, ih4 ih4Var) {
        return new CheckoutDetailsPresenter(b61Var, i41Var, dt5Var, f63Var, f63Var2, hq3Var, ay1Var, xtbVar, gcVar, wt9Var, s41Var, ih4Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CheckoutDetailsPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
