package ru.dodopizza.app.di;

import android.app.Application;
import com.dodopizza.chat.feature.initializer.NativeChatInitializerDependencies;
import com.dodopizza.controlling.feature.fullscreenimage.FullscreenImageFeatureDependencies;
import com.dodopizza.controlling.feature.photopickerbutton.PhotoPickerButtonFeatureDependencies;
import com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies;
import com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies;
import com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies;
import com.dodopizza.feature.imagepicker.ImagePickerDialogFeatureDependencies;
import com.dodopizza.feature.webinfo.WebInfoFeatureDependencies;
import com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies;
import com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies;
import com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListRoutingFeatureDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapRoutingFeatureDependencies;
import com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies;
import com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies;
import com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressRoutingFeatureDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureServiceDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies;
import com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies;
import com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies;
import defpackage.d3a;
import defpackage.ib1;
import defpackage.l48;
import defpackage.mn2;
import kotlin.Metadata;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies;
import ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies;
import ru.dodopizza.app.di.onboarding.OnboardingRouterFeatureDependencies;
import ru.dodopizza.app.infrastracture.language.AppResourceLocalesInitializerDependencies;
import ru.dodopizza.app.presentation.pincodelogin.d;
import ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies;
/* compiled from: AppComponent.kt */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001d2\u00020\u001e:\u0002BCJ\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH&J\b\u0010$\u001a\u00020#H&J\b\u0010&\u001a\u00020%H&J\b\u0010(\u001a\u00020'H&J\b\u0010*\u001a\u00020)H&J\b\u0010,\u001a\u00020+H&J\b\u0010.\u001a\u00020-H&J\b\u00100\u001a\u00020/H&J\b\u00102\u001a\u000201H&J\b\u00104\u001a\u000203H&J\b\u00106\u001a\u000205H&J\b\u00108\u001a\u000207H&J\b\u0010:\u001a\u000209H&J\b\u0010<\u001a\u00020;H&R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lru/dodopizza/app/di/AppComponent;", "Luw9;", "Lwo;", "Ljm1;", "Lru/dodopizza/app/infrastracture/language/AppResourceLocalesInitializerDependencies;", "Lcom/dodopizza/core/feature/captcha/CaptchaFeatureDependencies;", "Lcom/dodopizza/core/feature/remoteconfig/RemoteConfigFeatureDependencies;", "Lcom/dodopizza/chat/feature/initializer/NativeChatInitializerDependencies;", "Lru/dodopizza/app/di/modules/presentation/main/MainActivityFeatureDependencies;", "Lru/dodopizza/app/di/modules/presentation/notification/NotificationFeatureDependencies;", "Lcom/dodopizza/feature/webinfo/WebInfoFeatureDependencies;", "Lcom/dodopizza/feature/imagepicker/ImagePickerDialogFeatureDependencies;", "Lru/dodopizza/app/di/onboarding/OnboardingFeatureDependencies;", "Lru/dodopizza/app/di/onboarding/OnboardingRouterFeatureDependencies;", "Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaFeatureDependencies;", "Lcom/dodopizza/controlling/feature/fullscreenimage/FullscreenImageFeatureDependencies;", "Lcom/dodopizza/controlling/feature/photopickerbutton/PhotoPickerButtonFeatureDependencies;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/EditAddressMapFeatureDependencies;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/EditAddressMapRoutingFeatureDependencies;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/DeliveryAddressListFeatureDependencies;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/DeliveryAddressListRoutingFeatureDependencies;", "Lcom/dodopizza/geo/domain/OnDeliveryLocationSelectedDependencies;", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsFeatureDependencies;", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsFeatureServiceDependencies;", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsRouterFeatureDependencies;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressFeatureDependencies;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressRoutingFeatureDependencies;", "Lcom/dodopizza/profile/feature/profilelocalelist/ProfileLocaleListFeatureDependencies;", "Lcom/dodopizza/geo/feature/phonenumbercollector/PhoneNumberCollectorDependencies;", "Lcom/dodopizza/core/feature/debugtools/toggles/FeatureTogglesFeatureDependencies;", "Lcom/dodopizza/order/feature/delivery/address/DeliveryAddressFeatureDependencies;", "Lli0;", "buyMoreBottomFragment", "", "D3", "Lr68;", "F3", "Lru/dodopizza/app/presentation/pincodelogin/d;", "B3", "Lih;", "C1", "Lvc6;", "b4", "Lf63;", "A1", "Lru/dodopizza/app/di/locality/LocalityComponent$a;", "E2", "Ld3a$a;", "Z1", "Lwra;", "n3", "Lmn2$a;", "y3", "Lmb;", "e2", "Ly8b;", "e3", "Ll48$a;", "u3", "Lib1$a;", "Y1", "Lth5;", "t0", "()Lth5;", "kustoConfiguration", "f", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface AppComponent extends uw9<wo>, jm1, AppResourceLocalesInitializerDependencies, CaptchaFeatureDependencies, RemoteConfigFeatureDependencies, NativeChatInitializerDependencies, MainActivityFeatureDependencies, NotificationFeatureDependencies, WebInfoFeatureDependencies, ImagePickerDialogFeatureDependencies, OnboardingFeatureDependencies, OnboardingRouterFeatureDependencies, SelectPizzeriaFeatureDependencies, FullscreenImageFeatureDependencies, PhotoPickerButtonFeatureDependencies, EditAddressMapFeatureDependencies, EditAddressMapRoutingFeatureDependencies, DeliveryAddressListFeatureDependencies, DeliveryAddressListRoutingFeatureDependencies, OnDeliveryLocationSelectedDependencies, DeliveryLocationSuggestionsFeatureDependencies, DeliveryLocationSuggestionsFeatureServiceDependencies, DeliveryLocationSuggestionsRouterFeatureDependencies, SelectDeliveryAddressFeatureDependencies, SelectDeliveryAddressRoutingFeatureDependencies, ProfileLocaleListFeatureDependencies, PhoneNumberCollectorDependencies, FeatureTogglesFeatureDependencies, DeliveryAddressFeatureDependencies {
    public static final a f = a.a;

    /* compiled from: AppComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/di/AppComponent$a;", "", "Lru/dodopizza/app/di/AppComponent$b;", "a", "()Lru/dodopizza/app/di/AppComponent$b;", "factory", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = DaggerAppComponent.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: AppComponent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J0\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\bH'¨\u0006\f"}, d2 = {"Lru/dodopizza/app/di/AppComponent$b;", "", "Landroid/app/Application;", "application", "Ltj3;", "environmentProvider", "Lgl9;", "retrofitModule", "Lm15;", "infrastructureModule", "Lru/dodopizza/app/di/AppComponent;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface b {

        /* compiled from: AppComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a {
            public static /* synthetic */ AppComponent a(b bVar, Application application, tj3 tj3Var, gl9 gl9Var, m15 m15Var, int i, Object obj) {
                if (obj == null) {
                    if ((i & 4) != 0) {
                        gl9Var = new gl9();
                    }
                    if ((i & 8) != 0) {
                        m15Var = new m15();
                    }
                    return bVar.a(application, tj3Var, gl9Var, m15Var);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
        }

        AppComponent a(Application application, tj3 tj3Var, gl9 gl9Var, m15 m15Var);
    }

    f63 A1();

    d B3();

    ih C1();

    void D3(li0 li0Var);

    LocalityComponent.a E2();

    r68 F3();

    ib1.a Y1();

    d3a.a Z1();

    vc6 b4();

    mb e2();

    y8b e3();

    wra n3();

    th5 t0();

    l48.a u3();

    mn2.a y3();
}
