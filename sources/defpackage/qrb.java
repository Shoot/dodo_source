package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: UpdateCountriesInteractor_Factory.java */
/* renamed from: qrb  reason: default package */
/* loaded from: classes.dex */
public final class qrb implements no3<prb> {
    private final as8<CountryService> a;
    private final as8<s80> b;
    private final as8<kx1> c;

    public qrb(as8<CountryService> as8Var, as8<s80> as8Var2, as8<kx1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static qrb a(as8<CountryService> as8Var, as8<s80> as8Var2, as8<kx1> as8Var3) {
        return new qrb(as8Var, as8Var2, as8Var3);
    }

    public static prb c(CountryService countryService, s80 s80Var, kx1 kx1Var) {
        return new prb(countryService, s80Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public prb get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
