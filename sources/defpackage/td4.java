package defpackage;

import com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter;
import com.dodopizza.onboarding.feature.chooseordertype.presentation.a;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: GeoChooseOrderTypeModule.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJR\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J(\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¨\u0006\u001f"}, d2 = {"Ltd4;", "", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a;", "router", "Lrd4;", "geoChooseOrderTypeInteractor", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lh97;", "onboardingData", "Lgc;", "analytics", "Lhq3;", "featureService", "Lih4;", "googlePlayServicesHelper", "Ljv5;", "localityService", "Ldo;", "appInitializer", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/GeoChooseOrderTypePresenter;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lny1;", "localeListService", "Lpy1;", "countryNameService", "a", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: td4  reason: default package */
/* loaded from: classes2.dex */
public final class td4 {
    public static final td4 a = new td4();

    private td4() {
    }

    public final rd4 a(CountryService countryService, jv5 jv5Var, ny1 ny1Var, py1 py1Var) {
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(ny1Var, "localeListService");
        z65.h(py1Var, "countryNameService");
        return new sd4(countryService, jv5Var, ny1Var, py1Var, null, 16, null);
    }

    public final GeoChooseOrderTypePresenter b(a aVar, rd4 rd4Var, String str, h97 h97Var, gc gcVar, hq3 hq3Var, ih4 ih4Var, jv5 jv5Var, Cdo cdo) {
        z65.h(aVar, "router");
        z65.h(rd4Var, "geoChooseOrderTypeInteractor");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(h97Var, "onboardingData");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(ih4Var, "googlePlayServicesHelper");
        z65.h(jv5Var, "localityService");
        z65.h(cdo, "appInitializer");
        return new GeoChooseOrderTypePresenter(aVar, rd4Var, str, h97Var, gcVar, hq3Var, ih4Var, jv5Var, cdo);
    }
}
