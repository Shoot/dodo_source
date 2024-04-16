package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: LandingPhoneInputModule_ProvideLandingPhoneInputInteractorFactory.java */
/* renamed from: ok5  reason: default package */
/* loaded from: classes3.dex */
public final class ok5 implements no3<lk5> {
    private final as8<ml5> a;
    private final as8<CountryService> b;
    private final as8<String> c;
    private final as8<String> d;

    public ok5(as8<ml5> as8Var, as8<CountryService> as8Var2, as8<String> as8Var3, as8<String> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ok5 a(as8<ml5> as8Var, as8<CountryService> as8Var2, as8<String> as8Var3, as8<String> as8Var4) {
        return new ok5(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static lk5 c(ml5 ml5Var, CountryService countryService, String str, String str2) {
        return (lk5) jh8.e(nk5.a.a(ml5Var, countryService, str, str2));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lk5 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
