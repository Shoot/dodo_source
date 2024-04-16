package defpackage;

import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxyInterface.java */
/* renamed from: yfc  reason: default package */
/* loaded from: classes3.dex */
public interface yfc {
    k0<AppliedBonusActionEntity> realmGet$appliedBonusActions();

    double realmGet$discount();

    int realmGet$freeSaucesCount();

    String realmGet$id();

    boolean realmGet$isReadyToCheckout();

    k0<CartItemEntity> realmGet$items();

    int realmGet$orderType();

    double realmGet$rawPrice();

    double realmGet$rawPriceWithoutGoods();

    double realmGet$saucesCost();

    int realmGet$saucesCount();

    double realmGet$total();

    void realmSet$appliedBonusActions(k0<AppliedBonusActionEntity> k0Var);

    void realmSet$discount(double d);

    void realmSet$freeSaucesCount(int i);

    void realmSet$id(String str);

    void realmSet$isReadyToCheckout(boolean z);

    void realmSet$items(k0<CartItemEntity> k0Var);

    void realmSet$orderType(int i);

    void realmSet$rawPrice(double d);

    void realmSet$rawPriceWithoutGoods(double d);

    void realmSet$saucesCost(double d);

    void realmSet$saucesCount(int i);

    void realmSet$total(double d);
}
