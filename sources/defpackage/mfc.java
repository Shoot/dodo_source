package defpackage;

import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxyInterface.java */
/* renamed from: mfc  reason: default package */
/* loaded from: classes3.dex */
public interface mfc {
    int realmGet$availableMore();

    k0<CartComboSlotProductEntity> realmGet$cartComboProducts();

    String realmGet$category();

    int realmGet$count();

    CustomizationEntity realmGet$customizationEntity();

    String realmGet$description();

    DiscountEntity realmGet$discount();

    int realmGet$doughTypeId();

    String realmGet$doughTypeName();

    int realmGet$errorCode();

    String realmGet$id();

    ImageEntity realmGet$image();

    boolean realmGet$isEditable();

    boolean realmGet$isGift();

    int realmGet$maxCount();

    String realmGet$name();

    int realmGet$order();

    PizzaHalvesEntity realmGet$pizzaHalves();

    double realmGet$price();

    String realmGet$productId();

    String realmGet$shoppingItemId();

    int realmGet$sizeGroupId();

    String realmGet$sizeGroupName();

    int realmGet$sizeMeasurement();

    float realmGet$sizeValue();

    double realmGet$totalPrice();

    void realmSet$availableMore(int i);

    void realmSet$cartComboProducts(k0<CartComboSlotProductEntity> k0Var);

    void realmSet$category(String str);

    void realmSet$count(int i);

    void realmSet$customizationEntity(CustomizationEntity customizationEntity);

    void realmSet$description(String str);

    void realmSet$discount(DiscountEntity discountEntity);

    void realmSet$doughTypeId(int i);

    void realmSet$doughTypeName(String str);

    void realmSet$errorCode(int i);

    void realmSet$id(String str);

    void realmSet$image(ImageEntity imageEntity);

    void realmSet$isEditable(boolean z);

    void realmSet$isGift(boolean z);

    void realmSet$maxCount(int i);

    void realmSet$name(String str);

    void realmSet$order(int i);

    void realmSet$pizzaHalves(PizzaHalvesEntity pizzaHalvesEntity);

    void realmSet$price(double d);

    void realmSet$productId(String str);

    void realmSet$shoppingItemId(String str);

    void realmSet$sizeGroupId(int i);

    void realmSet$sizeGroupName(String str);

    void realmSet$sizeMeasurement(int i);

    void realmSet$sizeValue(float f);

    void realmSet$totalPrice(double d);
}
