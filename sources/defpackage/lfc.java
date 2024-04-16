package defpackage;

import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_cart_CartEntityRealmProxyInterface.java */
/* renamed from: lfc  reason: default package */
/* loaded from: classes3.dex */
public interface lfc {
    k0<AppliedBonusActionEntity> realmGet$appliedBonusActions();

    k0<CartItemEntity> realmGet$cartItems();

    k0<CartItemEntity> realmGet$giftItems();

    PriceEntity realmGet$price();

    PersonalPromoActionEntity realmGet$promoAction();

    DataPromoCodeEntity realmGet$promoCode();

    void realmSet$appliedBonusActions(k0<AppliedBonusActionEntity> k0Var);

    void realmSet$cartItems(k0<CartItemEntity> k0Var);

    void realmSet$giftItems(k0<CartItemEntity> k0Var);

    void realmSet$price(PriceEntity priceEntity);

    void realmSet$promoAction(PersonalPromoActionEntity personalPromoActionEntity);

    void realmSet$promoCode(DataPromoCodeEntity dataPromoCodeEntity);
}
