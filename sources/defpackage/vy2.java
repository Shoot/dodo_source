package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl;
import com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl;
import com.dodopizza.geo.feature.suggestions.presentation.f;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationSuggestionsModule.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BJH\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J@\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0007J`\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0007J\u0018\u00100\u001a\u00020 2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0007J \u00105\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0007J\u0018\u0010:\u001a\u00020\u00182\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0007J\u0018\u0010;\u001a\u00020\u001a2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0007J\u0018\u0010>\u001a\u0002032\u0006\u0010/\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0007J\b\u0010?\u001a\u00020.H\u0007J\b\u0010@\u001a\u00020<H\u0007¨\u0006C"}, d2 = {"Lvy2;", "", "Lny2;", "args", "Lsy2;", "deliveryLocationSuggestionsInteractor", "Ljz2;", "router", "Lgc;", "analytics", "Lhq3;", "featureService", "Lih4;", "googlePlayServicesHelper", "Lwv5;", "locationPermissionChecker", "Lew5;", "locationSettingsChecker", "Lcom/dodopizza/geo/feature/suggestions/presentation/DeliveryLocationSuggestionsPresenterImpl;", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/geo/feature/suggestions/presentation/DeliveryLocationSuggestionsPresenterLiteImpl;", e.a, "La2b;", "mapper", "Lc2b;", "suggestionService", "Lmz2;", "deliveryLocationSuggestionsService", "Lk6a;", "selectLocationService", "Lx42;", "customerAddressService", "Lmh4;", "googleSessionIdRepository", "Lcom/dodopizza/geo/feature/suggestions/presentation/f;", "selectedSuggestionFactory", "Li00;", "authorizationState", "Lh7;", "addressDetailsFieldDesignService", "b", "Ln43;", "distanceFormatter", c.a, "Lmh0;", "buildInfo", "Lht4;", "identifierGenerator", "g", "Ljv5;", "localityService", "Lg91;", "clientDeliveryLocationFactory", "j", "Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "k", "f", "Lq9a;", "selectedSuggestionConverter", "a", Image.TYPE_HIGH, "i", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vy2  reason: default package */
/* loaded from: classes2.dex */
public final class vy2 {
    public static final vy2 a = new vy2();

    private vy2() {
    }

    public final g91 a(ht4 ht4Var, q9a q9aVar) {
        z65.h(ht4Var, "identifierGenerator");
        z65.h(q9aVar, "selectedSuggestionConverter");
        return new h91(ht4Var, q9aVar);
    }

    public final sy2 b(ny2 ny2Var, a2b a2bVar, c2b c2bVar, mz2 mz2Var, hq3 hq3Var, k6a k6aVar, x42 x42Var, mh4 mh4Var, f fVar, i00 i00Var, h7 h7Var) {
        z65.h(ny2Var, "args");
        z65.h(a2bVar, "mapper");
        z65.h(c2bVar, "suggestionService");
        z65.h(mz2Var, "deliveryLocationSuggestionsService");
        z65.h(hq3Var, "featureService");
        z65.h(k6aVar, "selectLocationService");
        z65.h(x42Var, "customerAddressService");
        z65.h(mh4Var, "googleSessionIdRepository");
        z65.h(fVar, "selectedSuggestionFactory");
        z65.h(i00Var, "authorizationState");
        z65.h(h7Var, "addressDetailsFieldDesignService");
        return new ty2(a2bVar, c2bVar, mz2Var, hq3Var, k6aVar, x42Var, ny2Var.a(), ny2Var.m(), mh4Var, fVar, i00Var, h7Var);
    }

    public final a2b c(n43 n43Var) {
        z65.h(n43Var, "distanceFormatter");
        return new b2b(n43Var);
    }

    public final DeliveryLocationSuggestionsPresenterImpl d(ny2 ny2Var, sy2 sy2Var, jz2 jz2Var, gc gcVar, hq3 hq3Var, ih4 ih4Var, wv5 wv5Var, ew5 ew5Var) {
        z65.h(ny2Var, "args");
        z65.h(sy2Var, "deliveryLocationSuggestionsInteractor");
        z65.h(jz2Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(ih4Var, "googlePlayServicesHelper");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        return new DeliveryLocationSuggestionsPresenterImpl(ny2Var.e(), sy2Var, gcVar, jz2Var, hq3Var, ny2Var.a(), ih4Var, ny2Var.n(), ny2Var.m(), wv5Var, ew5Var, ny2Var.k(), ny2Var.b(), ny2Var.j(), ny2Var.i());
    }

    public final DeliveryLocationSuggestionsPresenterLiteImpl e(ny2 ny2Var, gc gcVar, sy2 sy2Var, jz2 jz2Var, wv5 wv5Var, ew5 ew5Var, hq3 hq3Var) {
        ov5 ov5Var;
        z65.h(ny2Var, "args");
        z65.h(gcVar, "analytics");
        z65.h(sy2Var, "deliveryLocationSuggestionsInteractor");
        z65.h(jz2Var, "router");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        z65.h(hq3Var, "featureService");
        int e = ny2Var.e();
        String n = ny2Var.n();
        qw1 d = ny2Var.d();
        if (d != null) {
            ov5Var = d.i();
        } else {
            ov5Var = null;
        }
        return new DeliveryLocationSuggestionsPresenterLiteImpl(e, gcVar, n, ov5Var, sy2Var, jz2Var, wv5Var, ew5Var, hq3Var, ny2Var.b(), ny2Var.j(), ny2Var.i());
    }

    public final mz2 f(GeoApi geoApi, CountryService countryService) {
        z65.h(geoApi, "geoApi");
        z65.h(countryService, "countryService");
        return new nz2(geoApi, countryService);
    }

    public final mh4 g(mh0 mh0Var, ht4 ht4Var) {
        z65.h(mh0Var, "buildInfo");
        z65.h(ht4Var, "identifierGenerator");
        if (z65.c(mh0Var.d(), "default")) {
            return new nh4(ht4Var);
        }
        return new oh4();
    }

    public final ht4 h() {
        return ht4.a;
    }

    public final q9a i() {
        return new q9a();
    }

    public final f j(ny2 ny2Var, jv5 jv5Var, g91 g91Var) {
        z65.h(ny2Var, "args");
        z65.h(jv5Var, "localityService");
        z65.h(g91Var, "clientDeliveryLocationFactory");
        return new f(jv5Var, g91Var, ny2Var.a(), ny2Var.c(), ny2Var.f());
    }

    public final c2b k(GeoApi geoApi, CountryService countryService) {
        z65.h(geoApi, "geoApi");
        z65.h(countryService, "countryService");
        return new d2b(geoApi, countryService);
    }
}
