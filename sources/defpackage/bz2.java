package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideDeliveryLocationServiceFactory.java */
/* renamed from: bz2  reason: default package */
/* loaded from: classes2.dex */
public final class bz2 implements no3<mz2> {
    private final as8<GeoApi> a;
    private final as8<CountryService> b;

    public bz2(as8<GeoApi> as8Var, as8<CountryService> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static bz2 a(as8<GeoApi> as8Var, as8<CountryService> as8Var2) {
        return new bz2(as8Var, as8Var2);
    }

    public static mz2 c(GeoApi geoApi, CountryService countryService) {
        return (mz2) jh8.e(vy2.a.f(geoApi, countryService));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mz2 get() {
        return c(this.a.get(), this.b.get());
    }
}
