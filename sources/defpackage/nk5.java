package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter;
/* compiled from: LandingPhoneInputModule.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007J,\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0016"}, d2 = {"Lnk5;", "", "Lf63;", "router", "Lv28;", "phoneInputHandler", "Lm28;", "phoneFormatRepository", "Llk5;", "landingPhoneInputInteractor", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter;", "b", "Lml5;", "landingService", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "locationId", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: nk5  reason: default package */
/* loaded from: classes3.dex */
public final class nk5 {
    public static final nk5 a = new nk5();

    private nk5() {
    }

    public final lk5 a(ml5 ml5Var, CountryService countryService, String str, String str2) {
        z65.h(ml5Var, "landingService");
        z65.h(countryService, "countryService");
        z65.h(str, "locationId");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        return new mk5(ml5Var, countryService, str, str2);
    }

    public final LandingPhoneInputPresenter b(f63 f63Var, v28 v28Var, m28 m28Var, lk5 lk5Var, String str) {
        List F0;
        z65.h(f63Var, "router");
        z65.h(v28Var, "phoneInputHandler");
        z65.h(m28Var, "phoneFormatRepository");
        z65.h(lk5Var, "landingPhoneInputInteractor");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        Function1<g48, g48> d = xi8.a.d("+76661223443");
        F0 = sc1.F0(m28Var.getAll().values());
        return new LandingPhoneInputPresenter(f63Var, d, v28Var, F0, lk5Var, str);
    }
}
