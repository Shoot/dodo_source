package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.phonenumberlogin.b;
/* compiled from: PhoneNumberLoginModule_ProvideInteractorFactory.java */
/* renamed from: u38  reason: default package */
/* loaded from: classes3.dex */
public final class u38 implements no3<r38> {
    private final as8<hq3> a;
    private final as8<dt5> b;
    private final as8<rt5> c;
    private final as8<CountryService> d;
    private final as8<g00> e;
    private final as8<b> f;

    public u38(as8<hq3> as8Var, as8<dt5> as8Var2, as8<rt5> as8Var3, as8<CountryService> as8Var4, as8<g00> as8Var5, as8<b> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static u38 a(as8<hq3> as8Var, as8<dt5> as8Var2, as8<rt5> as8Var3, as8<CountryService> as8Var4, as8<g00> as8Var5, as8<b> as8Var6) {
        return new u38(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static r38 c(hq3 hq3Var, dt5 dt5Var, rt5 rt5Var, CountryService countryService, g00 g00Var, b bVar) {
        return (r38) jh8.e(s38.a.b(hq3Var, dt5Var, rt5Var, countryService, g00Var, bVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public r38 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
