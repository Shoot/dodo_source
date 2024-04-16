package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.MoneyType;
import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
import com.dodopizza.persistence.entity.menu.PromoActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
/* compiled from: shoppinginfotransforms.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u001a\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b\"#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00160\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u001b"}, d2 = {"", "index", "Lqja;", "shoppingInfo", "Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "g", "Ll18;", "personalPrice", "Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", e.a, "", "", "stopProductIdsList", "Lkotlin/Function1;", "f", "entity", DateTokenConverter.CONVERTER_KEY, "a", "Lkotlin/jvm/functions/Function1;", com.huawei.hms.opendevice.c.a, "()Lkotlin/jvm/functions/Function1;", "shoppingInfoToShoppingInfoEntity", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;", "b", "promoActionToPromoActionEntity", "promoActionEntityToPromoAction", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: xja  reason: default package */
/* loaded from: classes4.dex */
public final class xja {
    private static final Function1<qja, ShoppingInfoEntity> a = d.a;
    private static final Function1<ProductPromoAction, PromoActionEntity> b = b.a;
    private static final Function1<PromoActionEntity, ProductPromoAction> c = a.a;

    /* compiled from: shoppinginfotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;", "it", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "a", "(Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;)Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xja$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<PromoActionEntity, ProductPromoAction> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ProductPromoAction invoke(PromoActionEntity promoActionEntity) {
            z65.h(promoActionEntity, "it");
            return new ProductPromoAction(promoActionEntity.getProductId(), promoActionEntity.getCode(), promoActionEntity.getKind(), promoActionEntity.getParams());
        }
    }

    /* compiled from: shoppinginfotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "it", "Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;", "a", "(Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;)Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xja$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<ProductPromoAction, PromoActionEntity> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PromoActionEntity invoke(ProductPromoAction productPromoAction) {
            z65.h(productPromoAction, "it");
            return new PromoActionEntity(productPromoAction.getProductId(), productPromoAction.getCode(), productPromoAction.getKind(), productPromoAction.getParams());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: shoppinginfotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "shoppingInfoEntity", "Lrja;", "a", "(Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;)Lrja;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xja$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<ShoppingInfoEntity, rja> {
        final /* synthetic */ Collection<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Collection<String> collection) {
            super(1);
            this.a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final rja invoke(ShoppingInfoEntity shoppingInfoEntity) {
            List y0;
            Object Z;
            l18 l18Var;
            z65.h(shoppingInfoEntity, "shoppingInfoEntity");
            Collection<String> collection = this.a;
            String externalId = shoppingInfoEntity.getExternalId();
            z65.e(externalId);
            y0 = m0b.y0(externalId, new String[]{"/"}, false, 0, 6, null);
            Z = sc1.Z(y0);
            String str = (String) Z;
            MoneyType price = shoppingInfoEntity.getPrice();
            z65.e(price);
            hn6 b = wn6.b(price);
            String productId = shoppingInfoEntity.getProductId();
            PersonalPriceEntity personalPrice = shoppingInfoEntity.getPersonalPrice();
            if (personalPrice != null) {
                l18Var = xja.d(personalPrice);
            } else {
                l18Var = null;
            }
            return new rja(str, b, productId, l18Var, collection.contains(shoppingInfoEntity.getProductId()), shoppingInfoEntity.getShoppingId());
        }
    }

    /* compiled from: shoppinginfotransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqja;", "shoppingInfo", "Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "a", "(Lqja;)Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xja$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<qja, ShoppingInfoEntity> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ShoppingInfoEntity invoke(qja qjaVar) {
            PersonalPriceEntity personalPriceEntity;
            z65.h(qjaVar, "shoppingInfo");
            String id = qjaVar.getId();
            MoneyType a2 = wn6.a(qjaVar.h());
            String t = qjaVar.t();
            l18 v = qjaVar.v();
            if (v != null) {
                personalPriceEntity = xja.e(v);
            } else {
                personalPriceEntity = null;
            }
            return new ShoppingInfoEntity(id, a2, t, personalPriceEntity, qjaVar.G0());
        }
    }

    public static final Function1<PromoActionEntity, ProductPromoAction> a() {
        return c;
    }

    public static final Function1<ProductPromoAction, PromoActionEntity> b() {
        return b;
    }

    public static final Function1<qja, ShoppingInfoEntity> c() {
        return a;
    }

    public static final l18 d(PersonalPriceEntity personalPriceEntity) {
        z65.h(personalPriceEntity, "entity");
        String productId = personalPriceEntity.getProductId();
        MoneyType personalPrice = personalPriceEntity.getPersonalPrice();
        z65.e(personalPrice);
        return new l18(productId, wn6.b(personalPrice), personalPriceEntity.getPersonalDiscount(), z23.b.a(personalPriceEntity.getDiscountMode()), personalPriceEntity.getDiscountEndTime());
    }

    public static final PersonalPriceEntity e(l18 l18Var) {
        z65.h(l18Var, "personalPrice");
        return new PersonalPriceEntity(l18Var.e(), wn6.a(l18Var.c()), l18Var.d(), l18Var.b(), l18Var.a().i());
    }

    public static final Function1<ShoppingInfoEntity, qja> f(Collection<String> collection) {
        z65.h(collection, "stopProductIdsList");
        return new c(collection);
    }

    public static final ShoppingInfoEntity g(int i, qja qjaVar) {
        PersonalPriceEntity personalPriceEntity;
        z65.h(qjaVar, "shoppingInfo");
        String str = qjaVar.getId() + "/" + i;
        MoneyType a2 = wn6.a(qjaVar.h());
        String t = qjaVar.t();
        l18 v = qjaVar.v();
        if (v != null) {
            personalPriceEntity = e(v);
        } else {
            personalPriceEntity = null;
        }
        return new ShoppingInfoEntity(str, a2, t, personalPriceEntity, qjaVar.G0());
    }
}
