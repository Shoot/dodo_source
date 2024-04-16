package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.mk2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import ru.dodopizza.app.domain.blockstore.WorkflowIdBlockStoreDataSource;
import ru.dodopizza.backend.domain.upload.UploadAPI;
/* compiled from: RepositoryModule.kt */
@Metadata(d1 = {"\u0000\u0084\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0007J0\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#H\u0007J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0006H\u0007J\u0010\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0007J\u0010\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0015H\u0007J\u0010\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0007J\u0010\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0007J\u0010\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u000207H\u0007J\u0010\u0010?\u001a\u00020>2\u0006\u0010)\u001a\u00020(H\u0007J\u0018\u0010A\u001a\u00020@2\u0006\u0010;\u001a\u0002072\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010C\u001a\u00020B2\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010E\u001a\u00020D2\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010G\u001a\u00020F2\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020HH\u0007J\u0010\u0010N\u001a\u00020M2\u0006\u0010-\u001a\u00020LH\u0007J\u0010\u0010Q\u001a\u00020#2\u0006\u0010P\u001a\u00020OH\u0007J\u0010\u0010T\u001a\u00020S2\u0006\u0010-\u001a\u00020RH\u0007J\u0018\u0010V\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\tH\u0007J\u0010\u0010Z\u001a\u00020Y2\u0006\u0010X\u001a\u00020WH\u0007J\u0010\u0010\\\u001a\u00020[2\u0006\u0010X\u001a\u00020WH\u0007J(\u0010e\u001a\u00020W2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020cH\u0007J\u0010\u0010g\u001a\u00020f2\u0006\u0010)\u001a\u00020(H\u0007J\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010\u000e\u001a\u00020\rH\u0007J&\u0010q\u001a\u00020p2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0007J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020r0h2\u0006\u0010\u000e\u001a\u00020\rH\u0007J6\u0010{\u001a\u00020z2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020r0h2\u0006\u0010v\u001a\u00020u2\u0006\u0010w\u001a\u00020p2\u0006\u0010m\u001a\u00020l2\u0006\u0010y\u001a\u00020xH\u0007J\u0016\u0010}\u001a\b\u0012\u0004\u0012\u00020|0h2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0016\u0010\u007f\u001a\u00020u2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020|0hH\u0007J\u0012\u0010\u0081\u0001\u001a\u00020l2\u0007\u0010\u0080\u0001\u001a\u00020[H\u0007J\u0014\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0007J\u0014\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0007R\u0016\u0010U\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bT\u0010\u0089\u0001¨\u0006\u008c\u0001"}, d2 = {"Ltg9;", "", "Ljv5;", "localityService", "Lg00;", "authorizationService", "Lv53;", "i", "dodoDomain", "Lo63;", "j", "Lk63;", "k", "Ljk2;", "daoFactory", "Lhtb;", "K", "Lbtb;", "I", "upsaleStateRepository", "upsaleProductRepository", "Lktb;", "J", "Lcs0;", "cartRepo", "Lfs0;", "cartUpdateService", "Lija;", "shoppingCartRepository", "Loq0;", "cartItemConverter", "Lbq;", "applyedPromoOfferRepository", "Lko5;", DateTokenConverter.CONVERTER_KEY, "Lx23;", "discountConverter", "b", "domainState", c.a, "Lml0;", "cacheInspector", "Lfi7;", "t", "Leua;", "impl", "Ldua;", "C", "upsaleStateService", "Ltsb;", "H", "Lru/dodopizza/backend/domain/upload/UploadAPI;", "uploadAPI", "Lku3;", Image.TYPE_MEDIUM, "Lci8;", "prefs", "Lv52;", "g", "preferencesAssetsDataSource", "Ln52;", "f", "Lh08;", "u", "Lv06;", "o", "Lu16;", "p", "Lbb1;", e.a, "Ltb9;", "z", "Lfda;", "serverDateTimeParser", "Lxf6;", "v", "Lhua;", "Lgua;", "D", "Lhq3;", "featureService", Image.TYPE_HIGH, "Liq0;", "Lhq0;", "a", "domainEvents", "y", "Lcva;", "stateRepository", "Lf8c;", "L", "Lava;", "E", "Lf89;", "realmDataSource", "Ldv5;", "localityRepository", "Lry1;", "countryRepository", "Lru/dodopizza/app/domain/blockstore/WorkflowIdBlockStoreDataSource;", "blockStoreDataSource", "F", "Ljp3;", "l", "Lgk2;", "Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;", "q", "menuItemDao", "Lmxa;", "stopRepository", "Lme6;", "menuItemPersonalizerProvider", "Lne6;", "r", "Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "A", "shoppingInfoDao", "Lyl8;", "productRepository", "menuItemRepository", "Lzf6;", "menuPersonalPriceInfoRepository", "Luja;", "B", "Lcom/dodopizza/persistence/entity/menu/ProductEntity;", "w", "productDao", "x", "stateProvider", "G", "Lxu8;", "queryHandler", "Lih6;", Image.TYPE_SMALL, "Lip4;", "n", "Lu53;", "Lu53;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: tg9  reason: default package */
/* loaded from: classes3.dex */
public final class tg9 {
    private final u53 a = new u53();

    public final gk2<ShoppingInfoEntity> A(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return jk2Var.a(bc9.b(ShoppingInfoEntity.class), mk2.b.a);
    }

    public final uja B(gk2<ShoppingInfoEntity> gk2Var, yl8 yl8Var, ne6 ne6Var, mxa mxaVar, zf6 zf6Var) {
        z65.h(gk2Var, "shoppingInfoDao");
        z65.h(yl8Var, "productRepository");
        z65.h(ne6Var, "menuItemRepository");
        z65.h(mxaVar, "stopRepository");
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        return new vja(gk2Var, yl8Var, ne6Var, mxaVar, zf6Var);
    }

    public final dua C(eua euaVar) {
        z65.h(euaVar, "impl");
        return euaVar;
    }

    public final gua D(hua huaVar) {
        z65.h(huaVar, "impl");
        return huaVar;
    }

    public final ava E(cva cvaVar) {
        z65.h(cvaVar, "stateRepository");
        return cvaVar;
    }

    public final cva F(f89 f89Var, dv5 dv5Var, ry1 ry1Var, WorkflowIdBlockStoreDataSource workflowIdBlockStoreDataSource) {
        z65.h(f89Var, "realmDataSource");
        z65.h(dv5Var, "localityRepository");
        z65.h(ry1Var, "countryRepository");
        z65.h(workflowIdBlockStoreDataSource, "blockStoreDataSource");
        return new cva(f89Var, dv5Var, ry1Var, workflowIdBlockStoreDataSource);
    }

    public final mxa G(ava avaVar) {
        z65.h(avaVar, "stateProvider");
        return new nxa(avaVar);
    }

    public final tsb H(ktb ktbVar) {
        z65.h(ktbVar, "upsaleStateService");
        return (dtb) ktbVar;
    }

    public final btb I() {
        return new ctb();
    }

    public final ktb J(htb htbVar, btb btbVar) {
        z65.h(htbVar, "upsaleStateRepository");
        z65.h(btbVar, "upsaleProductRepository");
        return new dtb(btbVar, htbVar, this.a);
    }

    public final htb K(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new itb(jk2Var);
    }

    public final f8c L(cva cvaVar) {
        z65.h(cvaVar, "stateRepository");
        return cvaVar;
    }

    public final hq0 a(iq0 iq0Var) {
        z65.h(iq0Var, "impl");
        return iq0Var;
    }

    public final oq0 b(x23 x23Var) {
        z65.h(x23Var, "discountConverter");
        return new pq0(x23Var);
    }

    public final cs0 c(v53 v53Var) {
        z65.h(v53Var, "domainState");
        return v53Var;
    }

    public final ko5 d(cs0 cs0Var, fs0 fs0Var, ija ijaVar, oq0 oq0Var, bq bqVar) {
        z65.h(cs0Var, "cartRepo");
        z65.h(fs0Var, "cartUpdateService");
        z65.h(ijaVar, "shoppingCartRepository");
        z65.h(oq0Var, "cartItemConverter");
        z65.h(bqVar, "applyedPromoOfferRepository");
        return new lo5(cs0Var, ijaVar, fs0Var, this.a, oq0Var, bqVar);
    }

    public final bb1 e(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        return new cb1(ml0Var);
    }

    public final n52 f(ci8 ci8Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        return new o52(ci8Var);
    }

    public final v52 g(ci8 ci8Var) {
        z65.h(ci8Var, "prefs");
        return new w52(ci8Var);
    }

    public final x23 h(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new y23(hq3Var);
    }

    public final v53 i(jv5 jv5Var, g00 g00Var) {
        z65.h(jv5Var, "localityService");
        z65.h(g00Var, "authorizationService");
        return new v53(this.a, jv5Var, g00Var);
    }

    public final o63 j(v53 v53Var) {
        z65.h(v53Var, "dodoDomain");
        return v53Var;
    }

    public final k63 k() {
        return this.a;
    }

    public final jp3 l(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        return new kp3(ml0Var);
    }

    public final ku3 m(UploadAPI uploadAPI) {
        z65.h(uploadAPI, "uploadAPI");
        return new lu3(uploadAPI, new et3());
    }

    public final ip4 n(xu8 xu8Var) {
        z65.h(xu8Var, "queryHandler");
        return new jp4(xu8Var);
    }

    public final v06 o(ci8 ci8Var, ml0 ml0Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(ml0Var, "cacheInspector");
        return new w06(ci8Var, ml0Var);
    }

    public final u16 p(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        return new v16(ml0Var);
    }

    public final gk2<MenuItemEntity> q(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return jk2Var.a(bc9.b(MenuItemEntity.class), mk2.b.a);
    }

    public final ne6 r(gk2<MenuItemEntity> gk2Var, mxa mxaVar, me6 me6Var) {
        z65.h(gk2Var, "menuItemDao");
        z65.h(mxaVar, "stopRepository");
        z65.h(me6Var, "menuItemPersonalizerProvider");
        return new oe6(gk2Var, mxaVar, me6Var);
    }

    public final ih6 s(xu8 xu8Var) {
        z65.h(xu8Var, "queryHandler");
        return new jh6(xu8Var);
    }

    public final fi7 t(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        return new gi7(ml0Var);
    }

    public final h08 u(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        return new i08(ml0Var);
    }

    public final xf6 v(fda fdaVar) {
        z65.h(fdaVar, "serverDateTimeParser");
        return new yf6(fdaVar);
    }

    public final gk2<ProductEntity> w(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return jk2Var.a(bc9.b(ProductEntity.class), mk2.b.a);
    }

    public final yl8 x(gk2<ProductEntity> gk2Var) {
        z65.h(gk2Var, "productDao");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        z65.g(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return new am8(gk2Var, newSingleThreadExecutor);
    }

    public final bq y(k63 k63Var, o63 o63Var) {
        z65.h(k63Var, "domainEvents");
        z65.h(o63Var, "domainState");
        return new cq(k63Var, o63Var);
    }

    public final tb9 z(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        return new tb9(ml0Var);
    }
}
