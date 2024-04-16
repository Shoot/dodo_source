package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: BaseUrlInteractor_Factory.java */
/* renamed from: o80  reason: default package */
/* loaded from: classes.dex */
public final class o80 implements no3<n80> {
    private final as8<jv5> a;
    private final as8<CountryService> b;
    private final as8<s80> c;
    private final as8<pd0> d;
    private final as8<prb> e;
    private final as8<kx1> f;

    public o80(as8<jv5> as8Var, as8<CountryService> as8Var2, as8<s80> as8Var3, as8<pd0> as8Var4, as8<prb> as8Var5, as8<kx1> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static o80 a(as8<jv5> as8Var, as8<CountryService> as8Var2, as8<s80> as8Var3, as8<pd0> as8Var4, as8<prb> as8Var5, as8<kx1> as8Var6) {
        return new o80(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static n80 c(jv5 jv5Var, CountryService countryService, s80 s80Var, pd0 pd0Var, prb prbVar, kx1 kx1Var) {
        return new n80(jv5Var, countryService, s80Var, pd0Var, prbVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public n80 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
