package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideSuggestionServiceFactory.java */
/* renamed from: iz2  reason: default package */
/* loaded from: classes2.dex */
public final class iz2 implements no3<c2b> {
    private final as8<GeoApi> a;
    private final as8<CountryService> b;

    public iz2(as8<GeoApi> as8Var, as8<CountryService> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static iz2 a(as8<GeoApi> as8Var, as8<CountryService> as8Var2) {
        return new iz2(as8Var, as8Var2);
    }

    public static c2b c(GeoApi geoApi, CountryService countryService) {
        return (c2b) jh8.e(vy2.a.k(geoApi, countryService));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c2b get() {
        return c(this.a.get(), this.b.get());
    }
}
