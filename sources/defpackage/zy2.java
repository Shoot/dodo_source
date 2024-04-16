package defpackage;

import com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideDeliveryLocationPresenterFactory.java */
/* renamed from: zy2  reason: default package */
/* loaded from: classes2.dex */
public final class zy2 implements no3<DeliveryLocationSuggestionsPresenterImpl> {
    private final as8<ny2> a;
    private final as8<sy2> b;
    private final as8<jz2> c;
    private final as8<gc> d;
    private final as8<hq3> e;
    private final as8<ih4> f;
    private final as8<wv5> g;
    private final as8<ew5> h;

    public zy2(as8<ny2> as8Var, as8<sy2> as8Var2, as8<jz2> as8Var3, as8<gc> as8Var4, as8<hq3> as8Var5, as8<ih4> as8Var6, as8<wv5> as8Var7, as8<ew5> as8Var8) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
    }

    public static zy2 a(as8<ny2> as8Var, as8<sy2> as8Var2, as8<jz2> as8Var3, as8<gc> as8Var4, as8<hq3> as8Var5, as8<ih4> as8Var6, as8<wv5> as8Var7, as8<ew5> as8Var8) {
        return new zy2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static DeliveryLocationSuggestionsPresenterImpl c(ny2 ny2Var, sy2 sy2Var, jz2 jz2Var, gc gcVar, hq3 hq3Var, ih4 ih4Var, wv5 wv5Var, ew5 ew5Var) {
        return (DeliveryLocationSuggestionsPresenterImpl) jh8.e(vy2.a.d(ny2Var, sy2Var, jz2Var, gcVar, hq3Var, ih4Var, wv5Var, ew5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeliveryLocationSuggestionsPresenterImpl get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
