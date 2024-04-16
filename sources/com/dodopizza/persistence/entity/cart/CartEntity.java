package com.dodopizza.persistence.entity.cart;

import io.realm.k0;
import io.realm.n0;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartEntity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0017\u0018\u0000 12\u00020\u0001:\u00011B[\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0012J\b\u0010\u0004\u001a\u00020\u0002H\u0012J\b\u0010\u0005\u001a\u00020\u0002H\u0012J\b\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\n\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/CartEntity;", "Lio/realm/n0;", "", "hasItemInStop", "hasToppingInStop", "hasHalvesInStop", "hasProductsInStop", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", "cartItems", "Lio/realm/k0;", "getCartItems", "()Lio/realm/k0;", "setCartItems", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/cart/PriceEntity;", "price", "Lcom/dodopizza/persistence/entity/cart/PriceEntity;", "getPrice", "()Lcom/dodopizza/persistence/entity/cart/PriceEntity;", "setPrice", "(Lcom/dodopizza/persistence/entity/cart/PriceEntity;)V", "giftItems", "getGiftItems", "setGiftItems", "Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;", "promoCode", "Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;", "getPromoCode", "()Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;", "setPromoCode", "(Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;)V", "Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;", "promoAction", "Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;", "getPromoAction", "()Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;", "setPromoAction", "(Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;)V", "Lcom/dodopizza/persistence/entity/cart/AppliedBonusActionEntity;", "appliedBonusActions", "getAppliedBonusActions", "setAppliedBonusActions", "", "getDiscountAmount", "()D", "discountAmount", "<init>", "(Lio/realm/k0;Lcom/dodopizza/persistence/entity/cart/PriceEntity;Lio/realm/k0;Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;Lio/realm/k0;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CartEntity extends n0 implements lfc {
    public static final Companion Companion = new Companion(null);
    public static final int ERROR_CODE_SUCCESS = 1;
    private k0<AppliedBonusActionEntity> appliedBonusActions;
    private k0<CartItemEntity> cartItems;
    private k0<CartItemEntity> giftItems;
    private PriceEntity price;
    private PersonalPromoActionEntity promoAction;
    private DataPromoCodeEntity promoCode;

    /* compiled from: CartEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/CartEntity$Companion;", "", "()V", "ERROR_CODE_SUCCESS", "", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CartEntity() {
        this(null, null, null, null, null, null, 63, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    private boolean hasHalvesInStop() {
        CartProductEntity left;
        CartProductEntity right;
        k0<CartItemEntity> cartItems = getCartItems();
        if ((cartItems instanceof Collection) && cartItems.isEmpty()) {
            return false;
        }
        for (CartItemEntity cartItemEntity : cartItems) {
            PizzaHalvesEntity pizzaHalves = cartItemEntity.getPizzaHalves();
            if (pizzaHalves != null && (((left = pizzaHalves.getLeft()) != null && left.isInStop()) || ((right = pizzaHalves.getRight()) != null && right.isInStop()))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasItemInStop() {
        k0<CartItemEntity> cartItems = getCartItems();
        if ((cartItems instanceof Collection) && cartItems.isEmpty()) {
            return false;
        }
        for (CartItemEntity cartItemEntity : cartItems) {
            if (cartItemEntity.getErrorCode() == 21) {
                return true;
            }
        }
        return false;
    }

    private boolean hasToppingInStop() {
        k0<AddedIngredientEntity> addedIngredients;
        k0<CartItemEntity> cartItems = getCartItems();
        if ((cartItems instanceof Collection) && cartItems.isEmpty()) {
            return false;
        }
        for (CartItemEntity cartItemEntity : cartItems) {
            CustomizationEntity customizationEntity = cartItemEntity.getCustomizationEntity();
            if (customizationEntity != null && (addedIngredients = customizationEntity.getAddedIngredients()) != null && !addedIngredients.isEmpty()) {
                for (AddedIngredientEntity addedIngredientEntity : addedIngredients) {
                    if (addedIngredientEntity.isInStop()) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public k0<AppliedBonusActionEntity> getAppliedBonusActions() {
        return realmGet$appliedBonusActions();
    }

    public k0<CartItemEntity> getCartItems() {
        return realmGet$cartItems();
    }

    public double getDiscountAmount() {
        Double d;
        PriceEntity price = getPrice();
        if (price != null) {
            d = Double.valueOf(price.getTotalDiscount());
        } else {
            d = null;
        }
        return ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
    }

    public k0<CartItemEntity> getGiftItems() {
        return realmGet$giftItems();
    }

    public PriceEntity getPrice() {
        return realmGet$price();
    }

    public PersonalPromoActionEntity getPromoAction() {
        return realmGet$promoAction();
    }

    public DataPromoCodeEntity getPromoCode() {
        return realmGet$promoCode();
    }

    public boolean hasProductsInStop() {
        if (!hasItemInStop() && !hasToppingInStop() && !hasHalvesInStop()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.lfc
    public k0 realmGet$appliedBonusActions() {
        return this.appliedBonusActions;
    }

    @Override // defpackage.lfc
    public k0 realmGet$cartItems() {
        return this.cartItems;
    }

    @Override // defpackage.lfc
    public k0 realmGet$giftItems() {
        return this.giftItems;
    }

    @Override // defpackage.lfc
    public PriceEntity realmGet$price() {
        return this.price;
    }

    @Override // defpackage.lfc
    public PersonalPromoActionEntity realmGet$promoAction() {
        return this.promoAction;
    }

    @Override // defpackage.lfc
    public DataPromoCodeEntity realmGet$promoCode() {
        return this.promoCode;
    }

    @Override // defpackage.lfc
    public void realmSet$appliedBonusActions(k0 k0Var) {
        this.appliedBonusActions = k0Var;
    }

    @Override // defpackage.lfc
    public void realmSet$cartItems(k0 k0Var) {
        this.cartItems = k0Var;
    }

    @Override // defpackage.lfc
    public void realmSet$giftItems(k0 k0Var) {
        this.giftItems = k0Var;
    }

    @Override // defpackage.lfc
    public void realmSet$price(PriceEntity priceEntity) {
        this.price = priceEntity;
    }

    @Override // defpackage.lfc
    public void realmSet$promoAction(PersonalPromoActionEntity personalPromoActionEntity) {
        this.promoAction = personalPromoActionEntity;
    }

    @Override // defpackage.lfc
    public void realmSet$promoCode(DataPromoCodeEntity dataPromoCodeEntity) {
        this.promoCode = dataPromoCodeEntity;
    }

    public void setAppliedBonusActions(k0<AppliedBonusActionEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$appliedBonusActions(k0Var);
    }

    public void setCartItems(k0<CartItemEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$cartItems(k0Var);
    }

    public void setGiftItems(k0<CartItemEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$giftItems(k0Var);
    }

    public void setPrice(PriceEntity priceEntity) {
        realmSet$price(priceEntity);
    }

    public void setPromoAction(PersonalPromoActionEntity personalPromoActionEntity) {
        realmSet$promoAction(personalPromoActionEntity);
    }

    public void setPromoCode(DataPromoCodeEntity dataPromoCodeEntity) {
        realmSet$promoCode(dataPromoCodeEntity);
    }

    public /* synthetic */ CartEntity(k0 k0Var, PriceEntity priceEntity, k0 k0Var2, DataPromoCodeEntity dataPromoCodeEntity, PersonalPromoActionEntity personalPromoActionEntity, k0 k0Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new k0() : k0Var, (i & 2) != 0 ? new PriceEntity(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null) : priceEntity, (i & 4) != 0 ? new k0() : k0Var2, (i & 8) != 0 ? new DataPromoCodeEntity(null, 0, null, null, null, 31, null) : dataPromoCodeEntity, (i & 16) != 0 ? new PersonalPromoActionEntity(null, 0, null, null, null, 31, null) : personalPromoActionEntity, (i & 32) != 0 ? new k0() : k0Var3);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CartEntity(k0<CartItemEntity> k0Var, PriceEntity priceEntity, k0<CartItemEntity> k0Var2, DataPromoCodeEntity dataPromoCodeEntity, PersonalPromoActionEntity personalPromoActionEntity, k0<AppliedBonusActionEntity> k0Var3) {
        z65.h(k0Var, "cartItems");
        z65.h(k0Var2, "giftItems");
        z65.h(k0Var3, "appliedBonusActions");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$cartItems(k0Var);
        realmSet$price(priceEntity);
        realmSet$giftItems(k0Var2);
        realmSet$promoCode(dataPromoCodeEntity);
        realmSet$promoAction(personalPromoActionEntity);
        realmSet$appliedBonusActions(k0Var3);
    }
}
