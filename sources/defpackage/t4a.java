package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: SelectCountryInteractorImpl_Factory.java */
/* renamed from: t4a  reason: default package */
/* loaded from: classes2.dex */
public final class t4a implements no3<s4a> {
    private final as8<CountryService> a;
    private final as8<jv5> b;
    private final as8<gy1> c;
    private final as8<prb> d;
    private final as8<kx1> e;

    public t4a(as8<CountryService> as8Var, as8<jv5> as8Var2, as8<gy1> as8Var3, as8<prb> as8Var4, as8<kx1> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static t4a a(as8<CountryService> as8Var, as8<jv5> as8Var2, as8<gy1> as8Var3, as8<prb> as8Var4, as8<kx1> as8Var5) {
        return new t4a(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static s4a c(CountryService countryService, jv5 jv5Var, gy1 gy1Var, prb prbVar, kx1 kx1Var) {
        return new s4a(countryService, jv5Var, gy1Var, prbVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public s4a get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
