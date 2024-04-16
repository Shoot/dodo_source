package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: GeoChooseOrderTypeModule_ProvideGeoChooseOrderTypeInteractorFactory.java */
/* renamed from: ud4  reason: default package */
/* loaded from: classes2.dex */
public final class ud4 implements no3<rd4> {
    private final as8<CountryService> a;
    private final as8<jv5> b;
    private final as8<ny1> c;
    private final as8<py1> d;

    public ud4(as8<CountryService> as8Var, as8<jv5> as8Var2, as8<ny1> as8Var3, as8<py1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ud4 a(as8<CountryService> as8Var, as8<jv5> as8Var2, as8<ny1> as8Var3, as8<py1> as8Var4) {
        return new ud4(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static rd4 c(CountryService countryService, jv5 jv5Var, ny1 ny1Var, py1 py1Var) {
        return (rd4) jh8.e(td4.a.a(countryService, jv5Var, ny1Var, py1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rd4 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
