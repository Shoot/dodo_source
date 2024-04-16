package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DeliveryAddressMapInteractorImpl_Factory.java */
/* renamed from: ow2  reason: default package */
/* loaded from: classes2.dex */
public final class ow2 implements no3<nw2> {
    private final as8<rw2> a;
    private final as8<String> b;
    private final as8<CountryService> c;
    private final as8<i00> d;
    private final as8<x42> e;
    private final as8<hq3> f;
    private final as8<b7> g;

    public ow2(as8<rw2> as8Var, as8<String> as8Var2, as8<CountryService> as8Var3, as8<i00> as8Var4, as8<x42> as8Var5, as8<hq3> as8Var6, as8<b7> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static ow2 a(as8<rw2> as8Var, as8<String> as8Var2, as8<CountryService> as8Var3, as8<i00> as8Var4, as8<x42> as8Var5, as8<hq3> as8Var6, as8<b7> as8Var7) {
        return new ow2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static nw2 c(rw2 rw2Var, String str, CountryService countryService, i00 i00Var, x42 x42Var, hq3 hq3Var, b7 b7Var) {
        return new nw2(rw2Var, str, countryService, i00Var, x42Var, hq3Var, b7Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nw2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
