package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.dodopizza.app.domain.menu.promo.PromoActionsRepository;
import ru.dodopizza.app.domain.menu.promo.PromoActionsRepositoryImpl;
import ru.dodopizza.app.domain.menu.promo.PromoActionsService;
import ru.dodopizza.app.domain.menu.promo.PromoActionsServiceImpl;
import ru.dodopizza.backend.domain.menu.MenuAPI;
/* compiled from: MenuModule.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bC\u0010DJ \u0001\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0007J\b\u0010-\u001a\u00020\u0018H\u0007J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007J\b\u00101\u001a\u00020\nH\u0007J\b\u00102\u001a\u00020\u0006H\u0007J\b\u00104\u001a\u000203H\u0007J\b\u00106\u001a\u000205H\u0007J\u0018\u00108\u001a\u00020\u001e2\u0006\u00107\u001a\u0002052\u0006\u0010/\u001a\u00020.H\u0007J\b\u0010:\u001a\u000209H\u0007JP\u0010B\u001a\u00020\u00162\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u0002092\u0006\u0010?\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0007¨\u0006E"}, d2 = {"Ljf6;", "", "Lru/dodopizza/backend/domain/menu/MenuAPI;", "menuApi", "Lne6;", "menuItemRepository", "Lpf8;", "popularProductRepository", "Lyl8;", "productRepository", "Lll8;", "productCategoryCacheRepository", "Ldt5;", "locality", "Lo63;", "domainState", "Lk63;", "domainEvents", "Lmxa;", "stopRepository", "Luja;", "shoppingItemRepository", "Lgp4;", "hotAndReadyService", "Lgd6;", "menuCategoryRepository", "Lid6;", "menuConverter", "Lkd6;", "menuConverterV5", "Lru/dodopizza/app/domain/menu/promo/PromoActionsService;", "promoActionsService", "Lyg6;", "menuSectionRepositoryV5", "Lpe6;", "menuItemRepositoryV5", "Lee6;", "menuItemForwardCompatibilityRepository", "Lbia;", "sharedTraces", "Lah6;", "g", "Lretrofit2/Retrofit;", "retrofit", DateTokenConverter.CONVERTER_KEY, e.a, "Lhq3;", "featureService", "f", "i", Image.TYPE_HIGH, "Lwr2;", "a", "Lru/dodopizza/app/domain/menu/promo/PromoActionsRepository;", "j", "promoActionsRepository", "k", "Lcp4;", "b", "Lava;", "stateProvider", "hotAndReadyRepository", "Lep4;", "hotAndReadyRepositoryV5", "Lip4;", "hotAndReadyUpdater", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: jf6  reason: default package */
/* loaded from: classes3.dex */
public final class jf6 {
    public static final jf6 a = new jf6();

    private jf6() {
    }

    public final wr2 a() {
        return new xr2();
    }

    public final cp4 b() {
        return new dp4();
    }

    public final gp4 c(ava avaVar, cp4 cp4Var, ep4 ep4Var, MenuAPI menuAPI, ne6 ne6Var, pe6 pe6Var, ip4 ip4Var, k63 k63Var, hq3 hq3Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(cp4Var, "hotAndReadyRepository");
        z65.h(ep4Var, "hotAndReadyRepositoryV5");
        z65.h(menuAPI, "menuApi");
        z65.h(ne6Var, "menuItemRepository");
        z65.h(pe6Var, "menuItemRepositoryV5");
        z65.h(ip4Var, "hotAndReadyUpdater");
        z65.h(k63Var, "domainEvents");
        z65.h(hq3Var, "featureService");
        return new hp4(avaVar, cp4Var, ep4Var, menuAPI, ne6Var, pe6Var, ip4Var, k63Var, hq3Var);
    }

    public final MenuAPI d(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        Object create = retrofit.create(MenuAPI.class);
        z65.g(create, "create(...)");
        return (MenuAPI) create;
    }

    public final gd6 e() {
        return new hd6();
    }

    public final id6 f(hq3 hq3Var, PromoActionsService promoActionsService) {
        z65.h(hq3Var, "featureService");
        z65.h(promoActionsService, "promoActionsService");
        return new jd6(new sg6(hq3Var), new vd6(hq3Var), hq3Var, promoActionsService);
    }

    public final ah6 g(MenuAPI menuAPI, ne6 ne6Var, pf8 pf8Var, yl8 yl8Var, ll8 ll8Var, dt5 dt5Var, o63 o63Var, k63 k63Var, mxa mxaVar, uja ujaVar, gp4 gp4Var, gd6 gd6Var, id6 id6Var, kd6 kd6Var, PromoActionsService promoActionsService, yg6 yg6Var, pe6 pe6Var, ee6 ee6Var, bia biaVar) {
        z65.h(menuAPI, "menuApi");
        z65.h(ne6Var, "menuItemRepository");
        z65.h(pf8Var, "popularProductRepository");
        z65.h(yl8Var, "productRepository");
        z65.h(ll8Var, "productCategoryCacheRepository");
        z65.h(dt5Var, "locality");
        z65.h(o63Var, "domainState");
        z65.h(k63Var, "domainEvents");
        z65.h(mxaVar, "stopRepository");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(gd6Var, "menuCategoryRepository");
        z65.h(id6Var, "menuConverter");
        z65.h(kd6Var, "menuConverterV5");
        z65.h(promoActionsService, "promoActionsService");
        z65.h(yg6Var, "menuSectionRepositoryV5");
        z65.h(pe6Var, "menuItemRepositoryV5");
        z65.h(ee6Var, "menuItemForwardCompatibilityRepository");
        z65.h(biaVar, "sharedTraces");
        return new bh6(menuAPI, ne6Var, pf8Var, yl8Var, ll8Var, dt5Var, o63Var, k63Var, mxaVar, ujaVar, gp4Var, gd6Var, id6Var, kd6Var, promoActionsService, yg6Var, pe6Var, ee6Var, biaVar);
    }

    public final pf8 h() {
        return new qf8();
    }

    public final ll8 i() {
        return ml8.a;
    }

    public final PromoActionsRepository j() {
        return new PromoActionsRepositoryImpl();
    }

    public final PromoActionsService k(PromoActionsRepository promoActionsRepository, hq3 hq3Var) {
        z65.h(promoActionsRepository, "promoActionsRepository");
        z65.h(hq3Var, "featureService");
        return new PromoActionsServiceImpl(promoActionsRepository, hq3Var);
    }
}
