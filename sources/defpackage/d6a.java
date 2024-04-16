package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.selectlocation.b;
/* compiled from: SelectLocationInteractorImpl_Factory.java */
/* renamed from: d6a  reason: default package */
/* loaded from: classes4.dex */
public final class d6a implements no3<b> {
    private final as8<j97> a;
    private final as8<hq3> b;
    private final as8<CountryService> c;
    private final as8<s80> d;
    private final as8<jv5> e;
    private final as8<k6a> f;
    private final as8<v97> g;
    private final as8<mh0> h;
    private final as8<kx1> i;

    public d6a(as8<j97> as8Var, as8<hq3> as8Var2, as8<CountryService> as8Var3, as8<s80> as8Var4, as8<jv5> as8Var5, as8<k6a> as8Var6, as8<v97> as8Var7, as8<mh0> as8Var8, as8<kx1> as8Var9) {
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

    public static d6a a(as8<j97> as8Var, as8<hq3> as8Var2, as8<CountryService> as8Var3, as8<s80> as8Var4, as8<jv5> as8Var5, as8<k6a> as8Var6, as8<v97> as8Var7, as8<mh0> as8Var8, as8<kx1> as8Var9) {
        return new d6a(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static b c(j97 j97Var, hq3 hq3Var, CountryService countryService, s80 s80Var, jv5 jv5Var, k6a k6aVar, v97 v97Var, mh0 mh0Var, kx1 kx1Var) {
        return new b(j97Var, hq3Var, countryService, s80Var, jv5Var, k6aVar, v97Var, mh0Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
