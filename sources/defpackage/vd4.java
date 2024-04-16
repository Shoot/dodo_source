package defpackage;

import com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter;
import com.dodopizza.onboarding.feature.chooseordertype.presentation.a;
/* compiled from: GeoChooseOrderTypeModule_ProvideGeoChooseOrderTypePresenterFactory.java */
/* renamed from: vd4  reason: default package */
/* loaded from: classes2.dex */
public final class vd4 implements no3<GeoChooseOrderTypePresenter> {
    private final as8<a> a;
    private final as8<rd4> b;
    private final as8<String> c;
    private final as8<h97> d;
    private final as8<gc> e;
    private final as8<hq3> f;
    private final as8<ih4> g;
    private final as8<jv5> h;
    private final as8<Cdo> i;

    public vd4(as8<a> as8Var, as8<rd4> as8Var2, as8<String> as8Var3, as8<h97> as8Var4, as8<gc> as8Var5, as8<hq3> as8Var6, as8<ih4> as8Var7, as8<jv5> as8Var8, as8<Cdo> as8Var9) {
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

    public static vd4 a(as8<a> as8Var, as8<rd4> as8Var2, as8<String> as8Var3, as8<h97> as8Var4, as8<gc> as8Var5, as8<hq3> as8Var6, as8<ih4> as8Var7, as8<jv5> as8Var8, as8<Cdo> as8Var9) {
        return new vd4(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static GeoChooseOrderTypePresenter c(a aVar, rd4 rd4Var, String str, h97 h97Var, gc gcVar, hq3 hq3Var, ih4 ih4Var, jv5 jv5Var, Cdo cdo) {
        return (GeoChooseOrderTypePresenter) jh8.e(td4.a.b(aVar, rd4Var, str, h97Var, gcVar, hq3Var, ih4Var, jv5Var, cdo));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public GeoChooseOrderTypePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
