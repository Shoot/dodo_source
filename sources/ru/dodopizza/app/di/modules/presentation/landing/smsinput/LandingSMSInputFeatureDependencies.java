package ru.dodopizza.app.di.modules.presentation.landing.smsinput;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: LandingSMSInputFeatureDependencies.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/dodopizza/app/di/modules/presentation/landing/smsinput/LandingSMSInputFeatureDependencies;", "Ljm1;", "Lpl5;", "L0", "()Lpl5;", "landingStateManager", "Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "O2", "()Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "authorizationAPI", "Lru/dodopizza/backend/domain/landing/LandingApi;", "s1", "()Lru/dodopizza/backend/domain/landing/LandingApi;", "landingAPI", "Lru/dodopizza/app/domain/country/CountryService;", e.a, "()Lru/dodopizza/app/domain/country/CountryService;", "countryService", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface LandingSMSInputFeatureDependencies extends jm1 {
    pl5 L0();

    AuthorizationAPI O2();

    CountryService e();

    LandingApi s1();
}
