package ru.dodopizza.app.di.onboarding;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.geo.GeoApi;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: OnboardingFeatureDependencies.kt */
@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J0\u0010\r\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n`\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u001aH&J\b\u0010\u001d\u001a\u00020\u001cH&R\u0014\u0010!\u001a\u00020\u001e8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8gX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0092\u0001"}, d2 = {"Lru/dodopizza/app/di/onboarding/OnboardingFeatureDependencies;", "Ljm1;", "Lhq3;", "z0", "Lry1;", "C3", "Lgy3;", "Y0", "Ljava/util/HashMap;", "", "", "Lbq3;", "Lkotlin/collections/HashMap;", "D1", "Ln52;", "r1", "Lml5;", "Z", "Lv28;", "A0", "Lm28;", "T0", "Lpl5;", "L0", "Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "t3", "Lru/dodopizza/backend/domain/landing/LandingApi;", "Z3", "Lny1;", "b1", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "()Lkx1;", "ioDispatcher", "Lqx1;", "q", "()Lqx1;", "processScope", "Ljv5;", "f", "()Ljv5;", "localityService", "Ldo;", "j", "()Ldo;", "appInitializer", "Lprb;", "q0", "()Lprb;", "updateCountriesInteractor", "Ls80;", "T", "()Ls80;", "baseUrlService", "Lru/dodopizza/app/domain/country/CountryService;", e.a, "()Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lyhb;", "u0", "()Lyhb;", "toggleService", "Lmh0;", "i", "()Lmh0;", "buildInfo", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lih4;", "A", "()Lih4;", "googlePlayServicesHelper", "Lpy1;", "C", "()Lpy1;", "countryNameService", "Lx42;", "n", "()Lx42;", "customerAddressService", "Li00;", "g", "()Li00;", "authorizationState", "Lla8;", "a0", "()Lla8;", "pizzeriasFiltersService", "Le98;", "z", "()Le98;", "pizzeriaService", "Lvg7;", "B", "()Lvg7;", "orderPizzeriaStateService", "Lpv9;", "H", "()Lpv9;", "scheduleHelper", "Lr43;", "L", "()Lr43;", "distanceMeasurer", "Lwv5;", "p", "()Lwv5;", "locationPermissionChecker", "Lew5;", "D", "()Lew5;", "locationSettingsChecker", "Lje4;", "k", "()Lje4;", "geoLocationProviderFactory", "Ln43;", "v", "()Ln43;", "distanceFormatter", "Lwc;", "L1", "()Lwc;", "analyticsFactory", "Lk6a;", "K", "()Lk6a;", "selectLocationService", "Lru/dodopizza/backend/domain/geo/GeoApi;", "B0", "()Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "Lbo;", "x", "()Lbo;", "appInitializationStateProvider", "Ley7;", "C0", "()Ley7;", "corePermissionChecker", "Lci8;", "d3", "()Lci8;", "corePreferencesAssetsDataSource", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface OnboardingFeatureDependencies extends jm1 {
    ih4 A();

    v28 A0();

    vg7 B();

    GeoApi B0();

    py1 C();

    ey7 C0();

    ry1 C3();

    ew5 D();

    HashMap<String, List<bq3>> D1();

    pv9 H();

    k6a K();

    r43 L();

    pl5 L0();

    wc L1();

    s80 T();

    m28 T0();

    gy3 Y0();

    ml5 Z();

    LandingApi Z3();

    la8 a0();

    ny1 b1();

    kx1 d();

    ci8 d3();

    CountryService e();

    jv5 f();

    i00 g();

    Context getContext();

    mh0 i();

    Cdo j();

    je4 k();

    x42 n();

    wv5 p();

    qx1 q();

    prb q0();

    n52 r1();

    AuthorizationAPI t3();

    yhb u0();

    n43 v();

    bo x();

    e98 z();

    hq3 z0();
}
