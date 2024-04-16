package ru.dodopizza.app.di.onboarding;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureServiceDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies;
import com.dodopizza.onboarding.feature.apprestartapprove.AppRestartApproveFeatureDependencies;
import com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies;
import com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies;
import com.dodopizza.order.feature.combinedmap.CombinedSelectionMapFeatureDependencies;
import com.dodopizza.order.feature.pizzeriasuggestions.PizzeriaSuggestionsDependencies;
import com.dodopizza.order.feature.selectionmap.SelectionMapFeatureDependencies;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.di.modules.presentation.landing.LandingFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.landing.phoneinput.LandingPhoneInputDependencies;
import ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies;
import ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies;
/* compiled from: OnboardingComponent.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f:\u0001\u0014R\u0014\u0010\u0013\u001a\u00020\u00108gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/di/onboarding/OnboardingComponent;", "Lcom/dodopizza/onboarding/feature/apprestartapprove/AppRestartApproveFeatureDependencies;", "Lcom/dodopizza/onboarding/feature/chooseordertype/GeoChooseOrderTypeFeatureDependencies;", "Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/landing/LandingFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/landing/phoneinput/LandingPhoneInputDependencies;", "Lru/dodopizza/app/di/modules/presentation/landing/smsinput/LandingSMSInputFeatureDependencies;", "Lcom/dodopizza/geo/feature/deliveryaddressmap/DeliveryAddressMapFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/selectlocation/localitylist/LocalityListFeatureDependencies;", "Lcom/dodopizza/onboarding/feature/selectcountry/SelectCountryDependencies;", "Lru/dodopizza/app/di/modules/presentation/selectlocation/SelectLocationFeatureDependencies;", "Lcom/dodopizza/order/feature/combinedmap/CombinedSelectionMapFeatureDependencies;", "Lcom/dodopizza/order/feature/selectionmap/SelectionMapFeatureDependencies;", "Lcom/dodopizza/order/feature/pizzeriasuggestions/PizzeriaSuggestionsDependencies;", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsRouterFeatureDependencies;", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsFeatureServiceDependencies;", "Lf63;", "b", "()Lf63;", "router", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface OnboardingComponent extends AppRestartApproveFeatureDependencies, GeoChooseOrderTypeFeatureDependencies, SelectPizzeriaFeatureDependencies, LandingFeatureDependencies, LandingPhoneInputDependencies, LandingSMSInputFeatureDependencies, DeliveryAddressMapFeatureDependencies, LocalityListFeatureDependencies, SelectCountryDependencies, SelectLocationFeatureDependencies, CombinedSelectionMapFeatureDependencies, SelectionMapFeatureDependencies, PizzeriaSuggestionsDependencies, DeliveryLocationSuggestionsRouterFeatureDependencies, DeliveryLocationSuggestionsFeatureServiceDependencies {

    /* compiled from: OnboardingComponent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH'J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lru/dodopizza/app/di/onboarding/OnboardingComponent$a;", "", "Lru/dodopizza/app/di/onboarding/OnboardingFeatureDependencies;", "dependencies", c.a, "Lru/dodopizza/app/di/onboarding/OnboardingRouterFeatureDependencies;", "routerDependencies", "b", "Lh97;", "onboardingData", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/di/onboarding/OnboardingComponent;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface a {
        OnboardingComponent a();

        a b(OnboardingRouterFeatureDependencies onboardingRouterFeatureDependencies);

        a c(OnboardingFeatureDependencies onboardingFeatureDependencies);

        a d(h97 h97Var);
    }

    @Override // com.dodopizza.onboarding.feature.apprestartapprove.AppRestartApproveFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.controlling.feature.fullscreenimage.FullscreenImageFeatureDependencies, com.dodopizza.controlling.feature.photopickerbutton.PhotoPickerButtonFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies
    f63 b();
}
