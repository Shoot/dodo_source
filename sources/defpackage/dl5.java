package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: LandingSMSInputModule.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J$\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\b\u0010\u001a\u001a\u00020\u0006H\u0007¨\u0006\u001d"}, d2 = {"Ldl5;", "", "", "phoneNumber", "address", MessageAttributes.UUID, "Lvfb;", "tickerInteractor", "Lbl5;", "landingSMSInputInteractor", "Lpl5;", "landingStateManager", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter;", "b", LocalityEntity.FIELD_COUNTRY_CODE, "localityId", "Lil5;", "landingSMSInputService", "a", "Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "authorizationAPI", "Lru/dodopizza/backend/domain/landing/LandingApi;", "landingAPI", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", c.a, DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: dl5  reason: default package */
/* loaded from: classes3.dex */
public final class dl5 {
    public static final dl5 a = new dl5();

    private dl5() {
    }

    public final bl5 a(String str, String str2, il5 il5Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "localityId");
        z65.h(il5Var, "landingSMSInputService");
        return new cl5(str, str2, il5Var);
    }

    public final LandingSMSInputPresenter b(String str, String str2, String str3, vfb vfbVar, bl5 bl5Var, pl5 pl5Var) {
        z65.h(str, "phoneNumber");
        z65.h(str2, "address");
        z65.h(str3, MessageAttributes.UUID);
        z65.h(vfbVar, "tickerInteractor");
        z65.h(bl5Var, "landingSMSInputInteractor");
        z65.h(pl5Var, "landingStateManager");
        return new LandingSMSInputPresenter(str, str2, str3, vfbVar, bl5Var, pl5Var);
    }

    public final il5 c(AuthorizationAPI authorizationAPI, LandingApi landingApi, CountryService countryService) {
        z65.h(authorizationAPI, "authorizationAPI");
        z65.h(landingApi, "landingAPI");
        z65.h(countryService, "countryService");
        return new jl5(authorizationAPI, landingApi, countryService);
    }

    public final vfb d() {
        return new ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c();
    }
}
