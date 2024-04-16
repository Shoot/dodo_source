package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: CountryResolver_Factory.java */
/* renamed from: uy1  reason: default package */
/* loaded from: classes3.dex */
public final class uy1 implements no3<ty1> {
    private final as8<dt5> a;
    private final as8<CountryService> b;

    public uy1(as8<dt5> as8Var, as8<CountryService> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static uy1 a(as8<dt5> as8Var, as8<CountryService> as8Var2) {
        return new uy1(as8Var, as8Var2);
    }

    public static ty1 c(dt5 dt5Var, CountryService countryService) {
        return new ty1(dt5Var, countryService);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ty1 get() {
        return c(this.a.get(), this.b.get());
    }
}
