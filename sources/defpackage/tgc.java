package defpackage;

import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
import com.dodopizza.persistence.entity.menu.PromoActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxyInterface.java */
/* renamed from: tgc  reason: default package */
/* loaded from: classes3.dex */
public interface tgc {
    String realmGet$category();

    String realmGet$compositeDescription();

    k0<ShoppingInfoEntity> realmGet$customShoppingItems();

    String realmGet$description();

    String realmGet$forwardCompatibilityId();

    String realmGet$id();

    String realmGet$imageUrl();

    boolean realmGet$isEnabled();

    boolean realmGet$isPizza();

    String realmGet$menuCategoryId();

    String realmGet$name();

    PersonalPriceEntity realmGet$personalPrice();

    int realmGet$priority();

    k0<PromoActionEntity> realmGet$promoActions();

    k0<ShoppingInfoEntity> realmGet$shoppingInfo();

    String realmGet$sizeMeasure();

    String realmGet$sizeValue();

    k0<String> realmGet$subMenuCategoryIds();

    String realmGet$type();

    void realmSet$category(String str);

    void realmSet$compositeDescription(String str);

    void realmSet$customShoppingItems(k0<ShoppingInfoEntity> k0Var);

    void realmSet$description(String str);

    void realmSet$forwardCompatibilityId(String str);

    void realmSet$id(String str);

    void realmSet$imageUrl(String str);

    void realmSet$isEnabled(boolean z);

    void realmSet$isPizza(boolean z);

    void realmSet$menuCategoryId(String str);

    void realmSet$name(String str);

    void realmSet$personalPrice(PersonalPriceEntity personalPriceEntity);

    void realmSet$priority(int i);

    void realmSet$promoActions(k0<PromoActionEntity> k0Var);

    void realmSet$shoppingInfo(k0<ShoppingInfoEntity> k0Var);

    void realmSet$sizeMeasure(String str);

    void realmSet$sizeValue(String str);

    void realmSet$subMenuCategoryIds(k0<String> k0Var);

    void realmSet$type(String str);
}
