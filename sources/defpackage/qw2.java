package defpackage;

import com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter;
/* compiled from: DeliveryAddressMapPresenter_Factory.java */
/* renamed from: qw2  reason: default package */
/* loaded from: classes2.dex */
public final class qw2 implements no3<DeliveryAddressMapPresenter> {
    private final as8<f63> a;
    private final as8<gc> b;
    private final as8<mw2> c;
    private final as8<wv5> d;
    private final as8<hq3> e;
    private final as8<ck1> f;
    private final as8<m37> g;
    private final as8<i00> h;
    private final as8<m52> i;

    public qw2(as8<f63> as8Var, as8<gc> as8Var2, as8<mw2> as8Var3, as8<wv5> as8Var4, as8<hq3> as8Var5, as8<ck1> as8Var6, as8<m37> as8Var7, as8<i00> as8Var8, as8<m52> as8Var9) {
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

    public static qw2 a(as8<f63> as8Var, as8<gc> as8Var2, as8<mw2> as8Var3, as8<wv5> as8Var4, as8<hq3> as8Var5, as8<ck1> as8Var6, as8<m37> as8Var7, as8<i00> as8Var8, as8<m52> as8Var9) {
        return new qw2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static DeliveryAddressMapPresenter c(f63 f63Var, gc gcVar, mw2 mw2Var, wv5 wv5Var, hq3 hq3Var, ck1 ck1Var, m37 m37Var, i00 i00Var, m52 m52Var) {
        return new DeliveryAddressMapPresenter(f63Var, gcVar, mw2Var, wv5Var, hq3Var, ck1Var, m37Var, i00Var, m52Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeliveryAddressMapPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
