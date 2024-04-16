package defpackage;

import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
/* compiled from: EditDeliveryAddressMapPresenter_Factory.java */
/* renamed from: od3  reason: default package */
/* loaded from: classes2.dex */
public final class od3 implements no3<EditDeliveryAddressMapPresenter> {
    private final as8<e> a;
    private final as8<Cdo> b;
    private final as8<pd3> c;
    private final as8<wv5> d;
    private final as8<gc> e;
    private final as8<a> f;
    private final as8<hq3> g;
    private final as8<i00> h;
    private final as8<m52> i;
    private final as8<f63> j;

    public od3(as8<e> as8Var, as8<Cdo> as8Var2, as8<pd3> as8Var3, as8<wv5> as8Var4, as8<gc> as8Var5, as8<a> as8Var6, as8<hq3> as8Var7, as8<i00> as8Var8, as8<m52> as8Var9, as8<f63> as8Var10) {
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
    }

    public static od3 a(as8<e> as8Var, as8<Cdo> as8Var2, as8<pd3> as8Var3, as8<wv5> as8Var4, as8<gc> as8Var5, as8<a> as8Var6, as8<hq3> as8Var7, as8<i00> as8Var8, as8<m52> as8Var9, as8<f63> as8Var10) {
        return new od3(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10);
    }

    public static EditDeliveryAddressMapPresenter c(e eVar, Cdo cdo, pd3 pd3Var, wv5 wv5Var, gc gcVar, a aVar, hq3 hq3Var, i00 i00Var, m52 m52Var, f63 f63Var) {
        return new EditDeliveryAddressMapPresenter(eVar, cdo, pd3Var, wv5Var, gcVar, aVar, hq3Var, i00Var, m52Var, f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public EditDeliveryAddressMapPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
