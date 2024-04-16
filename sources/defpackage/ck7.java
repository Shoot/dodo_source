package defpackage;

import com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter;
/* compiled from: OrderSummaryPresenter_Factory.java */
/* renamed from: ck7  reason: default package */
/* loaded from: classes.dex */
public final class ck7 implements no3<OrderSummaryPresenter> {
    private final as8<ej7> a;
    private final as8<f63> b;
    private final as8<fj7> c;
    private final as8<mj7> d;
    private final as8<pr5> e;
    private final as8<m37> f;
    private final as8<hq3> g;
    private final as8<gc> h;
    private final as8<jgb> i;
    private final as8<i00> j;
    private final as8<wt6> k;
    private final as8<ah7> l;
    private final as8<dq3> m;

    public ck7(as8<ej7> as8Var, as8<f63> as8Var2, as8<fj7> as8Var3, as8<mj7> as8Var4, as8<pr5> as8Var5, as8<m37> as8Var6, as8<hq3> as8Var7, as8<gc> as8Var8, as8<jgb> as8Var9, as8<i00> as8Var10, as8<wt6> as8Var11, as8<ah7> as8Var12, as8<dq3> as8Var13) {
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
    }

    public static ck7 a(as8<ej7> as8Var, as8<f63> as8Var2, as8<fj7> as8Var3, as8<mj7> as8Var4, as8<pr5> as8Var5, as8<m37> as8Var6, as8<hq3> as8Var7, as8<gc> as8Var8, as8<jgb> as8Var9, as8<i00> as8Var10, as8<wt6> as8Var11, as8<ah7> as8Var12, as8<dq3> as8Var13) {
        return new ck7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, as8Var13);
    }

    public static OrderSummaryPresenter c(ej7 ej7Var, f63 f63Var, fj7 fj7Var, mj7 mj7Var, pr5 pr5Var, m37 m37Var, hq3 hq3Var, gc gcVar, jgb jgbVar, i00 i00Var, wt6 wt6Var, ah7 ah7Var, dq3 dq3Var) {
        return new OrderSummaryPresenter(ej7Var, f63Var, fj7Var, mj7Var, pr5Var, m37Var, hq3Var, gcVar, jgbVar, i00Var, wt6Var, ah7Var, dq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public OrderSummaryPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get());
    }
}
