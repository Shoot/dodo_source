package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.inapp.InAppNotificationApi;
import ru.dodopizza.backend.domain.menu.MenuAPI;
/* compiled from: FoodMenuModule.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bT\u0010UJÐ\u0001\u00105\u001a\u0002042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0007J\u0018\u00109\u001a\u0002082\u0006\u00107\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J \u0010>\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<H\u0007J\u0010\u0010?\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@H\u0007J\u0018\u0010E\u001a\u0002062\u0006\u0010D\u001a\u00020B2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u0010H\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH\u0007J\u0010\u0010J\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010L\u001a\u00020KH\u0007J \u0010S\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0007¨\u0006V"}, d2 = {"Lf44;", "", "Lah6;", "menuService", "Lfq0;", "cartContentService", "Lt52;", "customerService", "Li00;", "authorizationState", "Ldt5;", "locality", "Ljv5;", "localityService", "Lava;", "stateProvider", "Lhq3;", "featureService", "Lqra;", "specialOfferService", "Lds0;", "cartService", "Lgc;", "analytics", "Lsq0;", "cartItemDataFactory", "Lhe6;", "menuItemImageUrlProvider", "Llp3;", "favoriteProductService", "Le78;", "pizzaConceptService", "Lzd6;", "menuItemDescriptionUpdater", "Lli7;", "orderService", "Lfj6;", "minDeliveryPriceProvider", "Lze6;", "menuItemVOConverter", "Lgp4;", "hotAndReadyService", "Lld9;", "remoteConfigService", "Lff6;", "menuItemVOConverterV5", "Lyg6;", "menuSectionRepositoryV5", "Llh6;", "menuV5AvailabilityChecker", "Lbia;", "sharedTraces", "Ld44;", "b", "Lsy4;", "inAppNotificationService", "Lpy4;", "f", "Luja;", "shoppingItemRepository", "Lwr2;", "defaultShoppingItemSelectorFactory", Image.TYPE_HIGH, "g", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/inapp/InAppNotificationApi;", DateTokenConverter.CONVERTER_KEY, "inAppNotificationApi", e.a, "Lej6;", "minDeliveryPriceInfoProvider", "i", "Lo5b;", "j", "Lvu4;", c.a, "Lru/dodopizza/backend/domain/menu/MenuAPI;", "menuAPI", "Ljp3;", "repository", "Ln52;", "customerRepository", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: f44  reason: default package */
/* loaded from: classes3.dex */
public final class f44 {
    public static final f44 a = new f44();

    private f44() {
    }

    public final lp3 a(MenuAPI menuAPI, jp3 jp3Var, n52 n52Var) {
        z65.h(menuAPI, "menuAPI");
        z65.h(jp3Var, "repository");
        z65.h(n52Var, "customerRepository");
        return new lp3(menuAPI, jp3Var, n52Var);
    }

    public final d44 b(ah6 ah6Var, fq0 fq0Var, t52 t52Var, i00 i00Var, dt5 dt5Var, jv5 jv5Var, ava avaVar, hq3 hq3Var, qra qraVar, ds0 ds0Var, gc gcVar, sq0 sq0Var, he6 he6Var, lp3 lp3Var, e78 e78Var, zd6 zd6Var, li7 li7Var, fj6 fj6Var, ze6 ze6Var, gp4 gp4Var, ld9 ld9Var, ff6 ff6Var, yg6 yg6Var, lh6 lh6Var, bia biaVar) {
        z65.h(ah6Var, "menuService");
        z65.h(fq0Var, "cartContentService");
        z65.h(t52Var, "customerService");
        z65.h(i00Var, "authorizationState");
        z65.h(dt5Var, "locality");
        z65.h(jv5Var, "localityService");
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(qraVar, "specialOfferService");
        z65.h(ds0Var, "cartService");
        z65.h(gcVar, "analytics");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(he6Var, "menuItemImageUrlProvider");
        z65.h(lp3Var, "favoriteProductService");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(zd6Var, "menuItemDescriptionUpdater");
        z65.h(li7Var, "orderService");
        z65.h(fj6Var, "minDeliveryPriceProvider");
        z65.h(ze6Var, "menuItemVOConverter");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(ld9Var, "remoteConfigService");
        z65.h(ff6Var, "menuItemVOConverterV5");
        z65.h(yg6Var, "menuSectionRepositoryV5");
        z65.h(lh6Var, "menuV5AvailabilityChecker");
        z65.h(biaVar, "sharedTraces");
        return new e44(ah6Var, fq0Var, t52Var, i00Var, dt5Var, jv5Var, avaVar, hq3Var, qraVar, ds0Var, gcVar, sq0Var, he6Var, lp3Var, e78Var, zd6Var, li7Var, fj6Var, ze6Var, gp4Var, ld9Var, ff6Var, yg6Var, lh6Var, biaVar, null, 33554432, null);
    }

    public final vu4 c() {
        return new j78();
    }

    public final InAppNotificationApi d(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (InAppNotificationApi) retrofit.create(InAppNotificationApi.class);
    }

    public final sy4 e(InAppNotificationApi inAppNotificationApi, hq3 hq3Var) {
        z65.h(inAppNotificationApi, "inAppNotificationApi");
        z65.h(hq3Var, "featureService");
        return new sy4(inAppNotificationApi, hq3Var);
    }

    public final py4 f(sy4 sy4Var, hq3 hq3Var) {
        z65.h(sy4Var, "inAppNotificationService");
        z65.h(hq3Var, "featureService");
        return new qy4(sy4Var, hq3Var);
    }

    public final zd6 g(ah6 ah6Var) {
        z65.h(ah6Var, "menuService");
        return new ae6(ah6Var);
    }

    public final he6 h(uja ujaVar, ah6 ah6Var, wr2 wr2Var) {
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(ah6Var, "menuService");
        z65.h(wr2Var, "defaultShoppingItemSelectorFactory");
        return new ie6(ujaVar, ah6Var, wr2Var);
    }

    public final fj6 i(ava avaVar, hq3 hq3Var, fq0 fq0Var, ej6 ej6Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(fq0Var, "cartContentService");
        z65.h(ej6Var, "minDeliveryPriceInfoProvider");
        return new fj6(avaVar, hq3Var, fq0Var, ej6Var);
    }

    public final o5b j(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new o5b(hq3Var);
    }
}
