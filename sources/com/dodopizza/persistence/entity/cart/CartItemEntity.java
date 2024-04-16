package com.dodopizza.persistence.entity.cart;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartItemEntity.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0001zB¡\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010-\u001a\u00020\n\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K\u0012\b\b\u0002\u0010S\u001a\u00020\n\u0012\b\b\u0002\u0010W\u001a\u00020V\u0012\b\b\u0002\u0010]\u001a\u00020\\\u0012\b\b\u0002\u0010c\u001a\u00020\n\u0012\b\b\u0002\u0010f\u001a\u00020\u0003\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010l\u0012\b\b\u0002\u0010s\u001a\u00020\\\u0012\b\b\u0002\u0010v\u001a\u00020V¢\u0006\u0004\bx\u0010yR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\"\u0010\u001a\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\"\u0010\u001d\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\"\u0010!\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R$\u0010*\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0005\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\"\u0010-\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R$\u00100\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0005\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR$\u00104\u001a\u0004\u0018\u0001038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0005\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR$\u0010>\u001a\u0004\u0018\u00010=8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010S\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010\f\u001a\u0004\bT\u0010\u000e\"\u0004\bU\u0010\u0010R\"\u0010W\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bW\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010c\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010\f\u001a\u0004\bd\u0010\u000e\"\u0004\be\u0010\u0010R\"\u0010f\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0005\u001a\u0004\bg\u0010\u0007\"\u0004\bh\u0010\tR$\u0010i\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010\u0005\u001a\u0004\bj\u0010\u0007\"\u0004\bk\u0010\tR$\u0010m\u001a\u0004\u0018\u00010l8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010s\u001a\u00020\\8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010^\u001a\u0004\bt\u0010`\"\u0004\bu\u0010bR\"\u0010v\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010X\u001a\u0004\bv\u0010Y\"\u0004\bw\u0010[¨\u0006{"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "", "count", "I", "getCount", "()I", "setCount", "(I)V", "maxCount", "getMaxCount", "setMaxCount", "availableMore", "getAvailableMore", "setAvailableMore", Action.NAME_ATTRIBUTE, "getName", "setName", "description", "getDescription", "setDescription", "sizeMeasurement", "getSizeMeasurement", "setSizeMeasurement", "", "sizeValue", "F", "getSizeValue", "()F", "setSizeValue", "(F)V", "doughTypeId", "getDoughTypeId", "setDoughTypeId", "doughTypeName", "getDoughTypeName", "setDoughTypeName", "sizeGroupId", "getSizeGroupId", "setSizeGroupId", "sizeGroupName", "getSizeGroupName", "setSizeGroupName", "Lcom/dodopizza/persistence/entity/ImageEntity;", ElementGenerator.TYPE_IMAGE, "Lcom/dodopizza/persistence/entity/ImageEntity;", "getImage", "()Lcom/dodopizza/persistence/entity/ImageEntity;", "setImage", "(Lcom/dodopizza/persistence/entity/ImageEntity;)V", "category", "getCategory", "setCategory", "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "customizationEntity", "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "getCustomizationEntity", "()Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "setCustomizationEntity", "(Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;)V", "Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;", "pizzaHalves", "Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;", "getPizzaHalves", "()Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;", "setPizzaHalves", "(Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;)V", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/cart/CartComboSlotProductEntity;", "cartComboProducts", "Lio/realm/k0;", "getCartComboProducts", "()Lio/realm/k0;", "setCartComboProducts", "(Lio/realm/k0;)V", "errorCode", "getErrorCode", "setErrorCode", "", "isGift", "Z", "()Z", "setGift", "(Z)V", "", "price", "D", "getPrice", "()D", "setPrice", "(D)V", BonusActionEntity.ORDER, "getOrder", "setOrder", "shoppingItemId", "getShoppingItemId", "setShoppingItemId", ShoppingInfoEntity.FIELD_PRODUCT_ID, "getProductId", "setProductId", "Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "discount", "Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "getDiscount", "()Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "setDiscount", "(Lcom/dodopizza/persistence/entity/cart/DiscountEntity;)V", "totalPrice", "getTotalPrice", "setTotalPrice", "isEditable", "setEditable", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;IFILjava/lang/String;ILjava/lang/String;Lcom/dodopizza/persistence/entity/ImageEntity;Ljava/lang/String;Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;Lio/realm/k0;IZDILjava/lang/String;Ljava/lang/String;Lcom/dodopizza/persistence/entity/cart/DiscountEntity;DZ)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CartItemEntity extends n0 implements yi3, mfc {
    public static final Companion Companion = new Companion(null);
    public static final String MENU_CATEGORY_UNKNOWN_ID = "";
    private int availableMore;
    private k0<CartComboSlotProductEntity> cartComboProducts;
    private String category;
    private int count;
    private CustomizationEntity customizationEntity;
    private String description;
    private DiscountEntity discount;
    private int doughTypeId;
    private String doughTypeName;
    private int errorCode;
    private String id;
    private ImageEntity image;
    private boolean isEditable;
    private boolean isGift;
    private int maxCount;
    private String name;
    private int order;
    private PizzaHalvesEntity pizzaHalves;
    private double price;
    private String productId;
    private String shoppingItemId;
    private int sizeGroupId;
    private String sizeGroupName;
    private int sizeMeasurement;
    private float sizeValue;
    private double totalPrice;

    /* compiled from: CartItemEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/CartItemEntity$Companion;", "", "()V", "MENU_CATEGORY_UNKNOWN_ID", "", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CartItemEntity() {
        this(null, 0, 0, 0, null, null, 0, 0.0f, 0, null, 0, null, null, null, null, null, null, 0, false, 0.0d, 0, null, null, null, 0.0d, false, 67108863, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public int getAvailableMore() {
        return realmGet$availableMore();
    }

    public k0<CartComboSlotProductEntity> getCartComboProducts() {
        return realmGet$cartComboProducts();
    }

    public String getCategory() {
        return realmGet$category();
    }

    public int getCount() {
        return realmGet$count();
    }

    public CustomizationEntity getCustomizationEntity() {
        return realmGet$customizationEntity();
    }

    public String getDescription() {
        return realmGet$description();
    }

    public DiscountEntity getDiscount() {
        return realmGet$discount();
    }

    public int getDoughTypeId() {
        return realmGet$doughTypeId();
    }

    public String getDoughTypeName() {
        return realmGet$doughTypeName();
    }

    public int getErrorCode() {
        return realmGet$errorCode();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public ImageEntity getImage() {
        return realmGet$image();
    }

    public int getMaxCount() {
        return realmGet$maxCount();
    }

    public String getName() {
        return realmGet$name();
    }

    public int getOrder() {
        return realmGet$order();
    }

    public PizzaHalvesEntity getPizzaHalves() {
        return realmGet$pizzaHalves();
    }

    public double getPrice() {
        return realmGet$price();
    }

    public String getProductId() {
        return realmGet$productId();
    }

    public String getShoppingItemId() {
        return realmGet$shoppingItemId();
    }

    public int getSizeGroupId() {
        return realmGet$sizeGroupId();
    }

    public String getSizeGroupName() {
        return realmGet$sizeGroupName();
    }

    public int getSizeMeasurement() {
        return realmGet$sizeMeasurement();
    }

    public float getSizeValue() {
        return realmGet$sizeValue();
    }

    public double getTotalPrice() {
        return realmGet$totalPrice();
    }

    public boolean isEditable() {
        return realmGet$isEditable();
    }

    public boolean isGift() {
        return realmGet$isGift();
    }

    @Override // defpackage.mfc
    public int realmGet$availableMore() {
        return this.availableMore;
    }

    @Override // defpackage.mfc
    public k0 realmGet$cartComboProducts() {
        return this.cartComboProducts;
    }

    @Override // defpackage.mfc
    public String realmGet$category() {
        return this.category;
    }

    @Override // defpackage.mfc
    public int realmGet$count() {
        return this.count;
    }

    @Override // defpackage.mfc
    public CustomizationEntity realmGet$customizationEntity() {
        return this.customizationEntity;
    }

    @Override // defpackage.mfc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.mfc
    public DiscountEntity realmGet$discount() {
        return this.discount;
    }

    @Override // defpackage.mfc
    public int realmGet$doughTypeId() {
        return this.doughTypeId;
    }

    @Override // defpackage.mfc
    public String realmGet$doughTypeName() {
        return this.doughTypeName;
    }

    @Override // defpackage.mfc
    public int realmGet$errorCode() {
        return this.errorCode;
    }

    @Override // defpackage.mfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.mfc
    public ImageEntity realmGet$image() {
        return this.image;
    }

    @Override // defpackage.mfc
    public boolean realmGet$isEditable() {
        return this.isEditable;
    }

    @Override // defpackage.mfc
    public boolean realmGet$isGift() {
        return this.isGift;
    }

    @Override // defpackage.mfc
    public int realmGet$maxCount() {
        return this.maxCount;
    }

    @Override // defpackage.mfc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.mfc
    public int realmGet$order() {
        return this.order;
    }

    @Override // defpackage.mfc
    public PizzaHalvesEntity realmGet$pizzaHalves() {
        return this.pizzaHalves;
    }

    @Override // defpackage.mfc
    public double realmGet$price() {
        return this.price;
    }

    @Override // defpackage.mfc
    public String realmGet$productId() {
        return this.productId;
    }

    @Override // defpackage.mfc
    public String realmGet$shoppingItemId() {
        return this.shoppingItemId;
    }

    @Override // defpackage.mfc
    public int realmGet$sizeGroupId() {
        return this.sizeGroupId;
    }

    @Override // defpackage.mfc
    public String realmGet$sizeGroupName() {
        return this.sizeGroupName;
    }

    @Override // defpackage.mfc
    public int realmGet$sizeMeasurement() {
        return this.sizeMeasurement;
    }

    @Override // defpackage.mfc
    public float realmGet$sizeValue() {
        return this.sizeValue;
    }

    @Override // defpackage.mfc
    public double realmGet$totalPrice() {
        return this.totalPrice;
    }

    @Override // defpackage.mfc
    public void realmSet$availableMore(int i) {
        this.availableMore = i;
    }

    @Override // defpackage.mfc
    public void realmSet$cartComboProducts(k0 k0Var) {
        this.cartComboProducts = k0Var;
    }

    @Override // defpackage.mfc
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // defpackage.mfc
    public void realmSet$count(int i) {
        this.count = i;
    }

    @Override // defpackage.mfc
    public void realmSet$customizationEntity(CustomizationEntity customizationEntity) {
        this.customizationEntity = customizationEntity;
    }

    @Override // defpackage.mfc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.mfc
    public void realmSet$discount(DiscountEntity discountEntity) {
        this.discount = discountEntity;
    }

    @Override // defpackage.mfc
    public void realmSet$doughTypeId(int i) {
        this.doughTypeId = i;
    }

    @Override // defpackage.mfc
    public void realmSet$doughTypeName(String str) {
        this.doughTypeName = str;
    }

    @Override // defpackage.mfc
    public void realmSet$errorCode(int i) {
        this.errorCode = i;
    }

    @Override // defpackage.mfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.mfc
    public void realmSet$image(ImageEntity imageEntity) {
        this.image = imageEntity;
    }

    @Override // defpackage.mfc
    public void realmSet$isEditable(boolean z) {
        this.isEditable = z;
    }

    @Override // defpackage.mfc
    public void realmSet$isGift(boolean z) {
        this.isGift = z;
    }

    @Override // defpackage.mfc
    public void realmSet$maxCount(int i) {
        this.maxCount = i;
    }

    @Override // defpackage.mfc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.mfc
    public void realmSet$order(int i) {
        this.order = i;
    }

    @Override // defpackage.mfc
    public void realmSet$pizzaHalves(PizzaHalvesEntity pizzaHalvesEntity) {
        this.pizzaHalves = pizzaHalvesEntity;
    }

    @Override // defpackage.mfc
    public void realmSet$price(double d) {
        this.price = d;
    }

    @Override // defpackage.mfc
    public void realmSet$productId(String str) {
        this.productId = str;
    }

    @Override // defpackage.mfc
    public void realmSet$shoppingItemId(String str) {
        this.shoppingItemId = str;
    }

    @Override // defpackage.mfc
    public void realmSet$sizeGroupId(int i) {
        this.sizeGroupId = i;
    }

    @Override // defpackage.mfc
    public void realmSet$sizeGroupName(String str) {
        this.sizeGroupName = str;
    }

    @Override // defpackage.mfc
    public void realmSet$sizeMeasurement(int i) {
        this.sizeMeasurement = i;
    }

    @Override // defpackage.mfc
    public void realmSet$sizeValue(float f) {
        this.sizeValue = f;
    }

    @Override // defpackage.mfc
    public void realmSet$totalPrice(double d) {
        this.totalPrice = d;
    }

    public void setAvailableMore(int i) {
        realmSet$availableMore(i);
    }

    public void setCartComboProducts(k0<CartComboSlotProductEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$cartComboProducts(k0Var);
    }

    public void setCategory(String str) {
        z65.h(str, "<set-?>");
        realmSet$category(str);
    }

    public void setCount(int i) {
        realmSet$count(i);
    }

    public void setCustomizationEntity(CustomizationEntity customizationEntity) {
        realmSet$customizationEntity(customizationEntity);
    }

    public void setDescription(String str) {
        z65.h(str, "<set-?>");
        realmSet$description(str);
    }

    public void setDiscount(DiscountEntity discountEntity) {
        realmSet$discount(discountEntity);
    }

    public void setDoughTypeId(int i) {
        realmSet$doughTypeId(i);
    }

    public void setDoughTypeName(String str) {
        realmSet$doughTypeName(str);
    }

    public void setEditable(boolean z) {
        realmSet$isEditable(z);
    }

    public void setErrorCode(int i) {
        realmSet$errorCode(i);
    }

    public void setGift(boolean z) {
        realmSet$isGift(z);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setImage(ImageEntity imageEntity) {
        realmSet$image(imageEntity);
    }

    public void setMaxCount(int i) {
        realmSet$maxCount(i);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setOrder(int i) {
        realmSet$order(i);
    }

    public void setPizzaHalves(PizzaHalvesEntity pizzaHalvesEntity) {
        realmSet$pizzaHalves(pizzaHalvesEntity);
    }

    public void setPrice(double d) {
        realmSet$price(d);
    }

    public void setProductId(String str) {
        realmSet$productId(str);
    }

    public void setShoppingItemId(String str) {
        z65.h(str, "<set-?>");
        realmSet$shoppingItemId(str);
    }

    public void setSizeGroupId(int i) {
        realmSet$sizeGroupId(i);
    }

    public void setSizeGroupName(String str) {
        realmSet$sizeGroupName(str);
    }

    public void setSizeMeasurement(int i) {
        realmSet$sizeMeasurement(i);
    }

    public void setSizeValue(float f) {
        realmSet$sizeValue(f);
    }

    public void setTotalPrice(double d) {
        realmSet$totalPrice(d);
    }

    public /* synthetic */ CartItemEntity(String str, int i, int i2, int i3, String str2, String str3, int i4, float f, int i5, String str4, int i6, String str5, ImageEntity imageEntity, String str6, CustomizationEntity customizationEntity, PizzaHalvesEntity pizzaHalvesEntity, k0 k0Var, int i7, boolean z, double d, int i8, String str7, String str8, DiscountEntity discountEntity, double d2, boolean z2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? 0 : i3, (i9 & 16) != 0 ? "" : str2, (i9 & 32) != 0 ? "" : str3, (i9 & 64) != 0 ? 0 : i4, (i9 & 128) != 0 ? 0.0f : f, (i9 & 256) != 0 ? 0 : i5, (i9 & 512) != 0 ? null : str4, (i9 & 1024) != 0 ? 0 : i6, (i9 & 2048) != 0 ? null : str5, (i9 & 4096) != 0 ? null : imageEntity, (i9 & 8192) != 0 ? "" : str6, (i9 & 16384) != 0 ? null : customizationEntity, (i9 & 32768) != 0 ? null : pizzaHalvesEntity, (i9 & 65536) != 0 ? new k0() : k0Var, (i9 & 131072) != 0 ? 1 : i7, (i9 & 262144) != 0 ? false : z, (i9 & 524288) != 0 ? 0.0d : d, (i9 & 1048576) != 0 ? 0 : i8, (i9 & 2097152) != 0 ? "" : str7, (i9 & 4194304) != 0 ? "" : str8, (i9 & 8388608) != 0 ? null : discountEntity, (i9 & 16777216) == 0 ? d2 : 0.0d, (i9 & 33554432) != 0 ? false : z2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CartItemEntity(String str, int i, int i2, int i3, String str2, String str3, int i4, float f, int i5, String str4, int i6, String str5, ImageEntity imageEntity, String str6, CustomizationEntity customizationEntity, PizzaHalvesEntity pizzaHalvesEntity, k0<CartComboSlotProductEntity> k0Var, int i7, boolean z, double d, int i8, String str7, String str8, DiscountEntity discountEntity, double d2, boolean z2) {
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(str6, "category");
        z65.h(k0Var, "cartComboProducts");
        z65.h(str7, "shoppingItemId");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$count(i);
        realmSet$maxCount(i2);
        realmSet$availableMore(i3);
        realmSet$name(str2);
        realmSet$description(str3);
        realmSet$sizeMeasurement(i4);
        realmSet$sizeValue(f);
        realmSet$doughTypeId(i5);
        realmSet$doughTypeName(str4);
        realmSet$sizeGroupId(i6);
        realmSet$sizeGroupName(str5);
        realmSet$image(imageEntity);
        realmSet$category(str6);
        realmSet$customizationEntity(customizationEntity);
        realmSet$pizzaHalves(pizzaHalvesEntity);
        realmSet$cartComboProducts(k0Var);
        realmSet$errorCode(i7);
        realmSet$isGift(z);
        realmSet$price(d);
        realmSet$order(i8);
        realmSet$shoppingItemId(str7);
        realmSet$productId(str8);
        realmSet$discount(discountEntity);
        realmSet$totalPrice(d2);
        realmSet$isEditable(z2);
    }
}
