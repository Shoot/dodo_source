package com.dodopizza.geo.feature.suggestions;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationSuggestionsFeatureDependencies.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsFeatureDependencies;", "Ljm1;", "Ljv5;", "f", "()Ljv5;", "localityService", "Lru/dodopizza/app/domain/country/CountryService;", e.a, "()Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lih4;", "A", "()Lih4;", "googlePlayServicesHelper", "Lx42;", "n", "()Lx42;", "customerAddressService", "Li00;", "g", "()Li00;", "authorizationState", "Lh7;", "P0", "()Lh7;", "addressDetailsFieldDesignService", "Lgc;", "a", "()Lgc;", "analytics", "Lwv5;", "p", "()Lwv5;", "locationPermissionChecker", "Lew5;", "D", "()Lew5;", "locationSettingsChecker", "Lmh0;", "i", "()Lmh0;", "buildInfo", "Lje4;", "k", "()Lje4;", "geoLocationProviderFactory", "Lk6a;", "K", "()Lk6a;", "selectLocationService", "Lru/dodopizza/backend/domain/geo/GeoApi;", "B0", "()Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "Ln43;", "v", "()Ln43;", "distanceFormatter", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface DeliveryLocationSuggestionsFeatureDependencies extends jm1 {
    ih4 A();

    GeoApi B0();

    ew5 D();

    k6a K();

    h7 P0();

    gc a();

    CountryService e();

    jv5 f();

    i00 g();

    mh0 i();

    je4 k();

    x42 n();

    wv5 p();

    n43 v();
}
