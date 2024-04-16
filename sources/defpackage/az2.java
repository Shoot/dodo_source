package defpackage;

import com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideDeliveryLocationPresenterLiteFactory.java */
/* renamed from: az2  reason: default package */
/* loaded from: classes2.dex */
public final class az2 implements no3<DeliveryLocationSuggestionsPresenterLiteImpl> {
    private final as8<ny2> a;
    private final as8<gc> b;
    private final as8<sy2> c;
    private final as8<jz2> d;
    private final as8<wv5> e;
    private final as8<ew5> f;
    private final as8<hq3> g;

    public az2(as8<ny2> as8Var, as8<gc> as8Var2, as8<sy2> as8Var3, as8<jz2> as8Var4, as8<wv5> as8Var5, as8<ew5> as8Var6, as8<hq3> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static az2 a(as8<ny2> as8Var, as8<gc> as8Var2, as8<sy2> as8Var3, as8<jz2> as8Var4, as8<wv5> as8Var5, as8<ew5> as8Var6, as8<hq3> as8Var7) {
        return new az2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static DeliveryLocationSuggestionsPresenterLiteImpl c(ny2 ny2Var, gc gcVar, sy2 sy2Var, jz2 jz2Var, wv5 wv5Var, ew5 ew5Var, hq3 hq3Var) {
        return (DeliveryLocationSuggestionsPresenterLiteImpl) jh8.e(vy2.a.e(ny2Var, gcVar, sy2Var, jz2Var, wv5Var, ew5Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeliveryLocationSuggestionsPresenterLiteImpl get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
