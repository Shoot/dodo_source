package com.dodopizza.persistence.entity.cart.queue;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartQueueItemEntity.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB×\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\r\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\u0003\u0012\b\b\u0002\u0010@\u001a\u00020\u0003\u0012\b\b\u0002\u0010C\u001a\u000204\u0012\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E\u0012\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020M0E\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bX\u0010YR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\"\u0010\u0017\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\"\u0010\u001a\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\"\u0010\u001d\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\"\u0010 \u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\"\u0010#\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0005\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\"\u0010'\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b5\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0005\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\"\u0010=\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0005\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR\"\u0010@\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0005\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\"\u0010C\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u00106\u001a\u0004\bC\u00107\"\u0004\bD\u00109R(\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010N\u001a\b\u0012\u0004\u0012\u00020M0E8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR$\u0010R\u001a\u0004\u0018\u00010Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/dodopizza/persistence/entity/cart/queue/CartQueueItemEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "operation", "getOperation", "setOperation", "", "count", "I", "getCount", "()I", "setCount", "(I)V", Action.NAME_ATTRIBUTE, "getName", "setName", "imageUrl", "getImageUrl", "setImageUrl", "doughId", "getDoughId", "setDoughId", "doughTypeName", "getDoughTypeName", "setDoughTypeName", "sizeId", "getSizeId", "setSizeId", "sizeGroupName", "getSizeGroupName", "setSizeGroupName", "", "price", "D", "getPrice", "()D", "setPrice", "(D)V", "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "customization", "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "getCustomization", "()Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "setCustomization", "(Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;)V", "", "isGift", "Z", "()Z", "setGift", "(Z)V", "shoppingItemId", "getShoppingItemId", "setShoppingItemId", "productCategory", "getProductCategory", "setProductCategory", "cartItemId", "getCartItemId", "setCartItemId", "isCartItemPersisted", "setCartItemPersisted", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/cart/CartProductEntity;", "pizzaHalves", "Lio/realm/k0;", "getPizzaHalves", "()Lio/realm/k0;", "setPizzaHalves", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/cart/CartComboSlotProductEntity;", "comboProducts", "getComboProducts", "setComboProducts", "Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "discount", "Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "getDiscount", "()Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "setDiscount", "(Lcom/dodopizza/persistence/entity/cart/DiscountEntity;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;DLcom/dodopizza/persistence/entity/cart/CustomizationEntity;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/realm/k0;Lio/realm/k0;Lcom/dodopizza/persistence/entity/cart/DiscountEntity;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CartQueueItemEntity extends n0 implements yi3, egc {
    public static final Companion Companion = new Companion(null);
    public static final String OPERATION_ADD = "add";
    public static final String OPERATION_EDIT = "edit";
    public static final String OPERATION_REMOVE = "remove";
    private String cartItemId;
    private k0<CartComboSlotProductEntity> comboProducts;
    private int count;
    private CustomizationEntity customization;
    private DiscountEntity discount;
    private int doughId;
    private String doughTypeName;
    private String id;
    private String imageUrl;
    private boolean isCartItemPersisted;
    private boolean isGift;
    private String name;
    private String operation;
    private k0<CartProductEntity> pizzaHalves;
    private double price;
    private String productCategory;
    private String shoppingItemId;
    private String sizeGroupName;
    private int sizeId;

    /* compiled from: CartQueueItemEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/queue/CartQueueItemEntity$Companion;", "", "()V", "OPERATION_ADD", "", "OPERATION_EDIT", "OPERATION_REMOVE", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CartQueueItemEntity() {
        this(null, null, 0, null, null, 0, null, 0, null, 0.0d, null, false, null, null, null, false, null, null, null, 524287, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCartItemId() {
        return realmGet$cartItemId();
    }

    public k0<CartComboSlotProductEntity> getComboProducts() {
        return realmGet$comboProducts();
    }

    public int getCount() {
        return realmGet$count();
    }

    public CustomizationEntity getCustomization() {
        return realmGet$customization();
    }

    public DiscountEntity getDiscount() {
        return realmGet$discount();
    }

    public int getDoughId() {
        return realmGet$doughId();
    }

    public String getDoughTypeName() {
        return realmGet$doughTypeName();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getImageUrl() {
        return realmGet$imageUrl();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getOperation() {
        return realmGet$operation();
    }

    public k0<CartProductEntity> getPizzaHalves() {
        return realmGet$pizzaHalves();
    }

    public double getPrice() {
        return realmGet$price();
    }

    public String getProductCategory() {
        return realmGet$productCategory();
    }

    public String getShoppingItemId() {
        return realmGet$shoppingItemId();
    }

    public String getSizeGroupName() {
        return realmGet$sizeGroupName();
    }

    public int getSizeId() {
        return realmGet$sizeId();
    }

    public boolean isCartItemPersisted() {
        return realmGet$isCartItemPersisted();
    }

    public boolean isGift() {
        return realmGet$isGift();
    }

    @Override // defpackage.egc
    public String realmGet$cartItemId() {
        return this.cartItemId;
    }

    @Override // defpackage.egc
    public k0 realmGet$comboProducts() {
        return this.comboProducts;
    }

    @Override // defpackage.egc
    public int realmGet$count() {
        return this.count;
    }

    @Override // defpackage.egc
    public CustomizationEntity realmGet$customization() {
        return this.customization;
    }

    @Override // defpackage.egc
    public DiscountEntity realmGet$discount() {
        return this.discount;
    }

    @Override // defpackage.egc
    public int realmGet$doughId() {
        return this.doughId;
    }

    @Override // defpackage.egc
    public String realmGet$doughTypeName() {
        return this.doughTypeName;
    }

    @Override // defpackage.egc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.egc
    public String realmGet$imageUrl() {
        return this.imageUrl;
    }

    @Override // defpackage.egc
    public boolean realmGet$isCartItemPersisted() {
        return this.isCartItemPersisted;
    }

    @Override // defpackage.egc
    public boolean realmGet$isGift() {
        return this.isGift;
    }

    @Override // defpackage.egc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.egc
    public String realmGet$operation() {
        return this.operation;
    }

    @Override // defpackage.egc
    public k0 realmGet$pizzaHalves() {
        return this.pizzaHalves;
    }

    @Override // defpackage.egc
    public double realmGet$price() {
        return this.price;
    }

    @Override // defpackage.egc
    public String realmGet$productCategory() {
        return this.productCategory;
    }

    @Override // defpackage.egc
    public String realmGet$shoppingItemId() {
        return this.shoppingItemId;
    }

    @Override // defpackage.egc
    public String realmGet$sizeGroupName() {
        return this.sizeGroupName;
    }

    @Override // defpackage.egc
    public int realmGet$sizeId() {
        return this.sizeId;
    }

    @Override // defpackage.egc
    public void realmSet$cartItemId(String str) {
        this.cartItemId = str;
    }

    @Override // defpackage.egc
    public void realmSet$comboProducts(k0 k0Var) {
        this.comboProducts = k0Var;
    }

    @Override // defpackage.egc
    public void realmSet$count(int i) {
        this.count = i;
    }

    @Override // defpackage.egc
    public void realmSet$customization(CustomizationEntity customizationEntity) {
        this.customization = customizationEntity;
    }

    @Override // defpackage.egc
    public void realmSet$discount(DiscountEntity discountEntity) {
        this.discount = discountEntity;
    }

    @Override // defpackage.egc
    public void realmSet$doughId(int i) {
        this.doughId = i;
    }

    @Override // defpackage.egc
    public void realmSet$doughTypeName(String str) {
        this.doughTypeName = str;
    }

    @Override // defpackage.egc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.egc
    public void realmSet$imageUrl(String str) {
        this.imageUrl = str;
    }

    @Override // defpackage.egc
    public void realmSet$isCartItemPersisted(boolean z) {
        this.isCartItemPersisted = z;
    }

    @Override // defpackage.egc
    public void realmSet$isGift(boolean z) {
        this.isGift = z;
    }

    @Override // defpackage.egc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.egc
    public void realmSet$operation(String str) {
        this.operation = str;
    }

    @Override // defpackage.egc
    public void realmSet$pizzaHalves(k0 k0Var) {
        this.pizzaHalves = k0Var;
    }

    @Override // defpackage.egc
    public void realmSet$price(double d) {
        this.price = d;
    }

    @Override // defpackage.egc
    public void realmSet$productCategory(String str) {
        this.productCategory = str;
    }

    @Override // defpackage.egc
    public void realmSet$shoppingItemId(String str) {
        this.shoppingItemId = str;
    }

    @Override // defpackage.egc
    public void realmSet$sizeGroupName(String str) {
        this.sizeGroupName = str;
    }

    @Override // defpackage.egc
    public void realmSet$sizeId(int i) {
        this.sizeId = i;
    }

    public void setCartItemId(String str) {
        z65.h(str, "<set-?>");
        realmSet$cartItemId(str);
    }

    public void setCartItemPersisted(boolean z) {
        realmSet$isCartItemPersisted(z);
    }

    public void setComboProducts(k0<CartComboSlotProductEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$comboProducts(k0Var);
    }

    public void setCount(int i) {
        realmSet$count(i);
    }

    public void setCustomization(CustomizationEntity customizationEntity) {
        realmSet$customization(customizationEntity);
    }

    public void setDiscount(DiscountEntity discountEntity) {
        realmSet$discount(discountEntity);
    }

    public void setDoughId(int i) {
        realmSet$doughId(i);
    }

    public void setDoughTypeName(String str) {
        z65.h(str, "<set-?>");
        realmSet$doughTypeName(str);
    }

    public void setGift(boolean z) {
        realmSet$isGift(z);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setImageUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$imageUrl(str);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setOperation(String str) {
        z65.h(str, "<set-?>");
        realmSet$operation(str);
    }

    public void setPizzaHalves(k0<CartProductEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$pizzaHalves(k0Var);
    }

    public void setPrice(double d) {
        realmSet$price(d);
    }

    public void setProductCategory(String str) {
        z65.h(str, "<set-?>");
        realmSet$productCategory(str);
    }

    public void setShoppingItemId(String str) {
        z65.h(str, "<set-?>");
        realmSet$shoppingItemId(str);
    }

    public void setSizeGroupName(String str) {
        z65.h(str, "<set-?>");
        realmSet$sizeGroupName(str);
    }

    public void setSizeId(int i) {
        realmSet$sizeId(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CartQueueItemEntity(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, int r29, java.lang.String r30, double r31, com.dodopizza.persistence.entity.cart.CustomizationEntity r33, boolean r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, boolean r38, io.realm.k0 r39, io.realm.k0 r40, com.dodopizza.persistence.entity.cart.DiscountEntity r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, double, com.dodopizza.persistence.entity.cart.CustomizationEntity, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, io.realm.k0, io.realm.k0, com.dodopizza.persistence.entity.cart.DiscountEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public CartQueueItemEntity(String str, String str2, int i, String str3, String str4, int i2, String str5, int i3, String str6, double d, CustomizationEntity customizationEntity, boolean z, String str7, String str8, String str9, boolean z2, k0<CartProductEntity> k0Var, k0<CartComboSlotProductEntity> k0Var2, DiscountEntity discountEntity) {
        z65.h(str2, "operation");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "imageUrl");
        z65.h(str5, "doughTypeName");
        z65.h(str6, "sizeGroupName");
        z65.h(str7, "shoppingItemId");
        z65.h(str8, "productCategory");
        z65.h(str9, "cartItemId");
        z65.h(k0Var, "pizzaHalves");
        z65.h(k0Var2, "comboProducts");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$operation(str2);
        realmSet$count(i);
        realmSet$name(str3);
        realmSet$imageUrl(str4);
        realmSet$doughId(i2);
        realmSet$doughTypeName(str5);
        realmSet$sizeId(i3);
        realmSet$sizeGroupName(str6);
        realmSet$price(d);
        realmSet$customization(customizationEntity);
        realmSet$isGift(z);
        realmSet$shoppingItemId(str7);
        realmSet$productCategory(str8);
        realmSet$cartItemId(str9);
        realmSet$isCartItemPersisted(z2);
        realmSet$pizzaHalves(k0Var);
        realmSet$comboProducts(k0Var2);
        realmSet$discount(discountEntity);
    }
}
