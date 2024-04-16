package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: LandingSMSInputModule_ProvideLandingSMSInputServiceFactory.java */
/* renamed from: gl5  reason: default package */
/* loaded from: classes3.dex */
public final class gl5 implements no3<il5> {
    private final as8<AuthorizationAPI> a;
    private final as8<LandingApi> b;
    private final as8<CountryService> c;

    public gl5(as8<AuthorizationAPI> as8Var, as8<LandingApi> as8Var2, as8<CountryService> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static gl5 a(as8<AuthorizationAPI> as8Var, as8<LandingApi> as8Var2, as8<CountryService> as8Var3) {
        return new gl5(as8Var, as8Var2, as8Var3);
    }

    public static il5 c(AuthorizationAPI authorizationAPI, LandingApi landingApi, CountryService countryService) {
        return (il5) jh8.e(dl5.a.c(authorizationAPI, landingApi, countryService));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public il5 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
