package defpackage;

import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
import com.dodopizza.persistence.entity.menu.PromoActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qd6;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
/* compiled from: menuitemtransforms.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u001a \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r\u001a\u001a\u0010\u0011\u001a\u00020\u0010*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001a\u0010\u0013\u001a\u00020\u0012*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0014*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001a\u0010\u0017\u001a\u00020\u0016*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001a\u0010\u0019\u001a\u00020\u0018*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002¨\u0006\u001a"}, d2 = {"Lkotlin/Function1;", "Lqd6;", "Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;", "l", "menuItem", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;", "j", "Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", Image.TYPE_HIGH, "", "i", "g", "", "stopList", "k", "Lqd6$e;", "p", "Lqd6$f;", "q", "Lqd6$d;", "o", "Lqd6$b;", Image.TYPE_MEDIUM, "Lqd6$c;", "n", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: qh6  reason: default package */
/* loaded from: classes4.dex */
public final class qh6 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: menuitemtransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;", "menuItemEntity", "Lqd6;", "a", "(Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;)Lqd6;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qh6$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<MenuItemEntity, qd6> {
        final /* synthetic */ Collection<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Collection<String> collection) {
            super(1);
            this.a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final qd6 invoke(MenuItemEntity menuItemEntity) {
            z65.h(menuItemEntity, "menuItemEntity");
            Collection<String> collection = this.a;
            String type = menuItemEntity.getType();
            switch (type.hashCode()) {
                case -1405309941:
                    if (type.equals("combo_template")) {
                        return qh6.n(menuItemEntity, collection);
                    }
                    break;
                case -1349088399:
                    if (type.equals(MenuItemEntity.TYPE_CUSTOM)) {
                        return qh6.o(menuItemEntity, collection);
                    }
                    break;
                case -1249586564:
                    if (type.equals("variable")) {
                        return qh6.q(menuItemEntity, collection);
                    }
                    break;
                case -902286926:
                    if (type.equals(MenuItemEntity.TYPE_SIMPLE)) {
                        return qh6.p(menuItemEntity, collection);
                    }
                    break;
                case 1429828318:
                    if (type.equals(MenuItemEntity.TYPE_ASSISTANT)) {
                        return qh6.m(menuItemEntity, collection);
                    }
                    break;
            }
            String type2 = menuItemEntity.getType();
            throw new IllegalArgumentException("Entity transformation for menu type " + type2 + " not found");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: menuitemtransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqd6;", "menuItem", "Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;", "a", "(Lqd6;)Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qh6$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<qd6, MenuItemEntity> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final MenuItemEntity invoke(qd6 qd6Var) {
            String str;
            String str2;
            boolean z;
            PersonalPriceEntity personalPriceEntity;
            z65.h(qd6Var, "menuItem");
            String f = qd6Var.f();
            String e = qd6Var.e();
            String i = qh6.i(qd6Var);
            String name = qd6Var.b().name();
            String i2 = qd6Var.i();
            String d = qd6Var.d();
            String c = qd6Var.c();
            String g = qd6Var.g();
            int l = qd6Var.l();
            k0<ShoppingInfoEntity> h = qh6.h(qd6Var);
            k0<ShoppingInfoEntity> g2 = qh6.g(qd6Var);
            boolean o = qd6Var.o();
            boolean z2 = qd6Var instanceof qd6.e;
            if (!z2) {
                str = "";
            } else {
                str = ((qd6.e) qd6Var).u().a();
            }
            if (!z2) {
                str2 = "";
            } else {
                str2 = ((qd6.e) qd6Var).u().getValue();
            }
            String h2 = qd6Var.h();
            String str3 = str;
            String[] strArr = (String[]) qd6Var.n().toArray(new String[0]);
            k0 k0Var = new k0(Arrays.copyOf(strArr, strArr.length));
            if (qd6Var instanceof qd6.f) {
                z = ((qd6.f) qd6Var).u();
            } else {
                z = false;
            }
            k0 j = qh6.j(qd6Var);
            l18 j2 = qd6Var.j();
            if (j2 != null) {
                personalPriceEntity = xja.e(j2);
            } else {
                personalPriceEntity = null;
            }
            return new MenuItemEntity(f, e, i, name, i2, d, c, g, l, h, g2, o, str3, str2, h2, k0Var, z, j, personalPriceEntity);
        }
    }

    public static final k0<ShoppingInfoEntity> g(qd6 qd6Var) {
        z65.h(qd6Var, "menuItem");
        if (qd6Var instanceof qd6.d) {
            k0<ShoppingInfoEntity> k0Var = new k0<>();
            int i = 0;
            for (Object obj : ((qd6.d) qd6Var).u()) {
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                k0Var.add(xja.g(i, (qja) obj));
                i = i2;
            }
            return k0Var;
        } else if (qd6Var instanceof qd6.e) {
            return new k0<>();
        } else {
            if (qd6Var instanceof qd6.c) {
                return new k0<>();
            }
            if (qd6Var instanceof qd6.f) {
                return new k0<>();
            }
            if (qd6Var instanceof qd6.b) {
                return new k0<>();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final k0<ShoppingInfoEntity> h(qd6 qd6Var) {
        z65.h(qd6Var, "menuItem");
        if (qd6Var instanceof qd6.d) {
            k0<ShoppingInfoEntity> k0Var = new k0<>();
            Function1<qja, ShoppingInfoEntity> c = xja.c();
            for (Object obj : ((qd6.d) qd6Var).v()) {
                k0Var.add(c.invoke(obj));
            }
            return k0Var;
        } else if (qd6Var instanceof qd6.e) {
            return new k0<>(xja.c().invoke(((qd6.e) qd6Var).t()));
        } else {
            if (qd6Var instanceof qd6.c) {
                return new k0<>(xja.c().invoke(((qd6.c) qd6Var).u()));
            }
            if (qd6Var instanceof qd6.f) {
                k0<ShoppingInfoEntity> k0Var2 = new k0<>();
                Function1<qja, ShoppingInfoEntity> c2 = xja.c();
                for (Object obj2 : ((qd6.f) qd6Var).t()) {
                    k0Var2.add(c2.invoke(obj2));
                }
                return k0Var2;
            } else if (qd6Var instanceof qd6.b) {
                return new k0<>(xja.c().invoke(((qd6.b) qd6Var).u()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final String i(qd6 qd6Var) {
        z65.h(qd6Var, "menuItem");
        if (qd6Var instanceof qd6.d) {
            return MenuItemEntity.TYPE_CUSTOM;
        }
        if (qd6Var instanceof qd6.e) {
            return MenuItemEntity.TYPE_SIMPLE;
        }
        if (qd6Var instanceof qd6.c) {
            return "combo_template";
        }
        if (qd6Var instanceof qd6.f) {
            return "variable";
        }
        if (qd6Var instanceof qd6.b) {
            return MenuItemEntity.TYPE_ASSISTANT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final k0<PromoActionEntity> j(qd6 qd6Var) {
        k0<PromoActionEntity> k0Var = new k0<>();
        Function1<ProductPromoAction, PromoActionEntity> b2 = xja.b();
        for (Object obj : qd6Var.m()) {
            k0Var.add(b2.invoke(obj));
        }
        return k0Var;
    }

    public static final Function1<MenuItemEntity, qd6> k(Collection<String> collection) {
        z65.h(collection, "stopList");
        return new a(collection);
    }

    public static final Function1<qd6, MenuItemEntity> l() {
        return b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qd6.b m(MenuItemEntity menuItemEntity, Collection<String> collection) {
        int w;
        Object Z;
        int w2;
        k0<ShoppingInfoEntity> shoppingInfo = menuItemEntity.getShoppingInfo();
        Function1<ShoppingInfoEntity, qja> f = xja.f(collection);
        w = lc1.w(shoppingInfo, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ShoppingInfoEntity shoppingInfoEntity : shoppingInfo) {
            arrayList.add(f.invoke(shoppingInfoEntity));
        }
        Z = sc1.Z(arrayList);
        qja qjaVar = (qja) Z;
        String id = menuItemEntity.getId();
        z65.e(id);
        String forwardCompatibilityId = menuItemEntity.getForwardCompatibilityId();
        String name = menuItemEntity.getName();
        kl8 valueOf = kl8.valueOf(menuItemEntity.getCategory());
        String description = menuItemEntity.getDescription();
        String compositeDescription = menuItemEntity.getCompositeDescription();
        int priority = menuItemEntity.getPriority();
        String imageUrl = menuItemEntity.getImageUrl();
        String menuCategoryId = menuItemEntity.getMenuCategoryId();
        k0<String> subMenuCategoryIds = menuItemEntity.getSubMenuCategoryIds();
        k0<PromoActionEntity> promoActions = menuItemEntity.getPromoActions();
        Function1<PromoActionEntity, ProductPromoAction> a2 = xja.a();
        w2 = lc1.w(promoActions, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (PromoActionEntity promoActionEntity : promoActions) {
            arrayList2.add(a2.invoke(promoActionEntity));
        }
        return new qd6.b(id, forwardCompatibilityId, name, valueOf, description, compositeDescription, priority, imageUrl, qjaVar, menuCategoryId, subMenuCategoryIds, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qd6.c n(MenuItemEntity menuItemEntity, Collection<String> collection) {
        int w;
        Object Z;
        int w2;
        int w3;
        String id = menuItemEntity.getId();
        z65.e(id);
        String forwardCompatibilityId = menuItemEntity.getForwardCompatibilityId();
        String name = menuItemEntity.getName();
        kl8 valueOf = kl8.valueOf(menuItemEntity.getCategory());
        String description = menuItemEntity.getDescription();
        String compositeDescription = menuItemEntity.getCompositeDescription();
        String imageUrl = menuItemEntity.getImageUrl();
        int priority = menuItemEntity.getPriority();
        k0<ShoppingInfoEntity> shoppingInfo = menuItemEntity.getShoppingInfo();
        Function1<ShoppingInfoEntity, qja> f = xja.f(collection);
        w = lc1.w(shoppingInfo, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ShoppingInfoEntity shoppingInfoEntity : shoppingInfo) {
            arrayList.add(f.invoke(shoppingInfoEntity));
        }
        Z = sc1.Z(arrayList);
        qja qjaVar = (qja) Z;
        km8 km8Var = new km8(menuItemEntity.getSizeMeasure(), km8.c.a(menuItemEntity.getSizeValue()));
        String menuCategoryId = menuItemEntity.getMenuCategoryId();
        k0<String> subMenuCategoryIds = menuItemEntity.getSubMenuCategoryIds();
        w2 = lc1.w(subMenuCategoryIds, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (String str : subMenuCategoryIds) {
            arrayList2.add(str);
        }
        k0<PromoActionEntity> promoActions = menuItemEntity.getPromoActions();
        Function1<PromoActionEntity, ProductPromoAction> a2 = xja.a();
        w3 = lc1.w(promoActions, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (PromoActionEntity promoActionEntity : promoActions) {
            arrayList3.add(a2.invoke(promoActionEntity));
        }
        return new qd6.c(id, forwardCompatibilityId, name, valueOf, description, compositeDescription, imageUrl, priority, qjaVar, km8Var, menuCategoryId, arrayList2, arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qd6.d o(MenuItemEntity menuItemEntity, Collection<String> collection) {
        int w;
        int w2;
        int w3;
        int w4;
        String id = menuItemEntity.getId();
        z65.e(id);
        String forwardCompatibilityId = menuItemEntity.getForwardCompatibilityId();
        String name = menuItemEntity.getName();
        kl8 valueOf = kl8.valueOf(menuItemEntity.getCategory());
        String description = menuItemEntity.getDescription();
        String compositeDescription = menuItemEntity.getCompositeDescription();
        int priority = menuItemEntity.getPriority();
        String imageUrl = menuItemEntity.getImageUrl();
        k0<ShoppingInfoEntity> shoppingInfo = menuItemEntity.getShoppingInfo();
        Function1<ShoppingInfoEntity, qja> f = xja.f(collection);
        w = lc1.w(shoppingInfo, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ShoppingInfoEntity shoppingInfoEntity : shoppingInfo) {
            arrayList.add(f.invoke(shoppingInfoEntity));
        }
        k0<ShoppingInfoEntity> customShoppingItems = menuItemEntity.getCustomShoppingItems();
        Function1<ShoppingInfoEntity, qja> f2 = xja.f(collection);
        w2 = lc1.w(customShoppingItems, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ShoppingInfoEntity shoppingInfoEntity2 : customShoppingItems) {
            arrayList2.add(f2.invoke(shoppingInfoEntity2));
        }
        String menuCategoryId = menuItemEntity.getMenuCategoryId();
        k0<String> subMenuCategoryIds = menuItemEntity.getSubMenuCategoryIds();
        w3 = lc1.w(subMenuCategoryIds, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (String str : subMenuCategoryIds) {
            arrayList3.add(str);
        }
        k0<PromoActionEntity> promoActions = menuItemEntity.getPromoActions();
        Function1<PromoActionEntity, ProductPromoAction> a2 = xja.a();
        w4 = lc1.w(promoActions, 10);
        ArrayList arrayList4 = new ArrayList(w4);
        for (PromoActionEntity promoActionEntity : promoActions) {
            arrayList4.add(a2.invoke(promoActionEntity));
        }
        return new qd6.d(id, forwardCompatibilityId, name, valueOf, description, compositeDescription, priority, imageUrl, arrayList, arrayList2, menuCategoryId, arrayList3, arrayList4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qd6.e p(MenuItemEntity menuItemEntity, Collection<String> collection) {
        int w;
        Object Z;
        int w2;
        int w3;
        l18 l18Var;
        String id = menuItemEntity.getId();
        z65.e(id);
        String forwardCompatibilityId = menuItemEntity.getForwardCompatibilityId();
        String name = menuItemEntity.getName();
        kl8 valueOf = kl8.valueOf(menuItemEntity.getCategory());
        String description = menuItemEntity.getDescription();
        String compositeDescription = menuItemEntity.getCompositeDescription();
        String imageUrl = menuItemEntity.getImageUrl();
        int priority = menuItemEntity.getPriority();
        k0<ShoppingInfoEntity> shoppingInfo = menuItemEntity.getShoppingInfo();
        Function1<ShoppingInfoEntity, qja> f = xja.f(collection);
        w = lc1.w(shoppingInfo, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ShoppingInfoEntity shoppingInfoEntity : shoppingInfo) {
            arrayList.add(f.invoke(shoppingInfoEntity));
        }
        Z = sc1.Z(arrayList);
        qja qjaVar = (qja) Z;
        km8 km8Var = new km8(menuItemEntity.getSizeMeasure(), km8.c.a(menuItemEntity.getSizeValue()));
        String menuCategoryId = menuItemEntity.getMenuCategoryId();
        k0<String> subMenuCategoryIds = menuItemEntity.getSubMenuCategoryIds();
        w2 = lc1.w(subMenuCategoryIds, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (String str : subMenuCategoryIds) {
            arrayList2.add(str);
        }
        k0<PromoActionEntity> promoActions = menuItemEntity.getPromoActions();
        Function1<PromoActionEntity, ProductPromoAction> a2 = xja.a();
        w3 = lc1.w(promoActions, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (PromoActionEntity promoActionEntity : promoActions) {
            arrayList3.add(a2.invoke(promoActionEntity));
        }
        PersonalPriceEntity personalPrice = menuItemEntity.getPersonalPrice();
        if (personalPrice != null) {
            l18Var = xja.d(personalPrice);
        } else {
            l18Var = null;
        }
        return new qd6.e(id, forwardCompatibilityId, name, valueOf, description, compositeDescription, imageUrl, priority, qjaVar, km8Var, menuCategoryId, arrayList2, arrayList3, l18Var, menuItemEntity.isEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qd6.f q(MenuItemEntity menuItemEntity, Collection<String> collection) {
        int w;
        int w2;
        int w3;
        l18 l18Var;
        String id = menuItemEntity.getId();
        z65.e(id);
        String forwardCompatibilityId = menuItemEntity.getForwardCompatibilityId();
        String name = menuItemEntity.getName();
        kl8 valueOf = kl8.valueOf(menuItemEntity.getCategory());
        String description = menuItemEntity.getDescription();
        String compositeDescription = menuItemEntity.getCompositeDescription();
        String imageUrl = menuItemEntity.getImageUrl();
        int priority = menuItemEntity.getPriority();
        k0<ShoppingInfoEntity> shoppingInfo = menuItemEntity.getShoppingInfo();
        Function1<ShoppingInfoEntity, qja> f = xja.f(collection);
        w = lc1.w(shoppingInfo, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ShoppingInfoEntity shoppingInfoEntity : shoppingInfo) {
            arrayList.add(f.invoke(shoppingInfoEntity));
        }
        String menuCategoryId = menuItemEntity.getMenuCategoryId();
        k0<String> subMenuCategoryIds = menuItemEntity.getSubMenuCategoryIds();
        w2 = lc1.w(subMenuCategoryIds, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (String str : subMenuCategoryIds) {
            arrayList2.add(str);
        }
        boolean isPizza = menuItemEntity.isPizza();
        k0<PromoActionEntity> promoActions = menuItemEntity.getPromoActions();
        Function1<PromoActionEntity, ProductPromoAction> a2 = xja.a();
        w3 = lc1.w(promoActions, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (PromoActionEntity promoActionEntity : promoActions) {
            arrayList3.add(a2.invoke(promoActionEntity));
        }
        PersonalPriceEntity personalPrice = menuItemEntity.getPersonalPrice();
        if (personalPrice != null) {
            l18Var = xja.d(personalPrice);
        } else {
            l18Var = null;
        }
        return new qd6.f(id, forwardCompatibilityId, name, valueOf, description, compositeDescription, imageUrl, priority, arrayList, menuCategoryId, arrayList2, isPizza, arrayList3, l18Var, menuItemEntity.isEnabled());
    }
}
