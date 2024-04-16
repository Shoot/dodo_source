package defpackage;

import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
/* compiled from: EditDeliveryAddressMapFSMPresenter_Factory.java */
/* renamed from: gd3  reason: default package */
/* loaded from: classes2.dex */
public final class gd3 implements no3<EditDeliveryAddressMapFSMPresenter> {
    private final as8<e> a;
    private final as8<pd3> b;
    private final as8<wv5> c;
    private final as8<gc> d;
    private final as8<a> e;
    private final as8<hq3> f;
    private final as8<Cdo> g;

    public gd3(as8<e> as8Var, as8<pd3> as8Var2, as8<wv5> as8Var3, as8<gc> as8Var4, as8<a> as8Var5, as8<hq3> as8Var6, as8<Cdo> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static gd3 a(as8<e> as8Var, as8<pd3> as8Var2, as8<wv5> as8Var3, as8<gc> as8Var4, as8<a> as8Var5, as8<hq3> as8Var6, as8<Cdo> as8Var7) {
        return new gd3(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static EditDeliveryAddressMapFSMPresenter c(e eVar, pd3 pd3Var, wv5 wv5Var, gc gcVar, a aVar, hq3 hq3Var, Cdo cdo) {
        return new EditDeliveryAddressMapFSMPresenter(eVar, pd3Var, wv5Var, gcVar, aVar, hq3Var, cdo);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public EditDeliveryAddressMapFSMPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
