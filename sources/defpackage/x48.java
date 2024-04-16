package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: PhonePrefixModule_ProvidePhonePrefixServiceFactory.java */
/* renamed from: x48  reason: default package */
/* loaded from: classes3.dex */
public final class x48 implements no3<z48> {
    private final as8<CountryService> a;
    private final as8<py1> b;
    private final as8<hq3> c;
    private final as8<m28> d;

    public x48(as8<CountryService> as8Var, as8<py1> as8Var2, as8<hq3> as8Var3, as8<m28> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static x48 a(as8<CountryService> as8Var, as8<py1> as8Var2, as8<hq3> as8Var3, as8<m28> as8Var4) {
        return new x48(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static z48 c(CountryService countryService, py1 py1Var, hq3 hq3Var, m28 m28Var) {
        return (z48) jh8.e(v48.a.b(countryService, py1Var, hq3Var, m28Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public z48 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
