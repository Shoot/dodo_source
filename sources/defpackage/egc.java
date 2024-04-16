package defpackage;

import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxyInterface.java */
/* renamed from: egc  reason: default package */
/* loaded from: classes3.dex */
public interface egc {
    String realmGet$cartItemId();

    k0<CartComboSlotProductEntity> realmGet$comboProducts();

    int realmGet$count();

    CustomizationEntity realmGet$customization();

    DiscountEntity realmGet$discount();

    int realmGet$doughId();

    String realmGet$doughTypeName();

    String realmGet$id();

    String realmGet$imageUrl();

    boolean realmGet$isCartItemPersisted();

    boolean realmGet$isGift();

    String realmGet$name();

    String realmGet$operation();

    k0<CartProductEntity> realmGet$pizzaHalves();

    double realmGet$price();

    String realmGet$productCategory();

    String realmGet$shoppingItemId();

    String realmGet$sizeGroupName();

    int realmGet$sizeId();

    void realmSet$cartItemId(String str);

    void realmSet$comboProducts(k0<CartComboSlotProductEntity> k0Var);

    void realmSet$count(int i);

    void realmSet$customization(CustomizationEntity customizationEntity);

    void realmSet$discount(DiscountEntity discountEntity);

    void realmSet$doughId(int i);

    void realmSet$doughTypeName(String str);

    void realmSet$id(String str);

    void realmSet$imageUrl(String str);

    void realmSet$isCartItemPersisted(boolean z);

    void realmSet$isGift(boolean z);

    void realmSet$name(String str);

    void realmSet$operation(String str);

    void realmSet$pizzaHalves(k0<CartProductEntity> k0Var);

    void realmSet$price(double d);

    void realmSet$productCategory(String str);

    void realmSet$shoppingItemId(String str);

    void realmSet$sizeGroupName(String str);

    void realmSet$sizeId(int i);
}
