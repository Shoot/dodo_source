package ru.dodopizza.backend.domain.state.dto.cart.response;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.cart.dto.SizeDto;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
import ru.dodopizza.backend.domain.state.dto.cart.DiscountDto;
/* compiled from: CartItemResponseDto.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bA\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\u001d\u0012\b\b\u0002\u0010$\u001a\u00020\u001b¢\u0006\u0002\u0010%J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u001bHÆ\u0003J\t\u0010O\u001a\u00020\u001dHÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010U\u001a\u00020\u001dHÆ\u0003J\t\u0010V\u001a\u00020\u001bHÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\u008f\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020\u001bHÆ\u0001J\u0013\u0010_\u001a\u00020\u001b2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u0005HÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010$\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u00107R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00107R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0016\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010'R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010#\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010>¨\u0006c"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/CartItemResponseDto;", "", "id", "", "count", "", "maxCount", Action.NAME_ATTRIBUTE, "description", "sizeInfo", "Lru/dodopizza/backend/domain/cart/dto/SizeDto;", "doughType", "doughTypeName", "sizeGroup", "sizeGroupName", ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "category", "customization", "Lru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;", "comboProducts", "", "Lru/dodopizza/backend/domain/state/dto/cart/response/CartComboSlotProductResponseDto;", "pizzaHalves", "Lru/dodopizza/backend/domain/state/dto/cart/response/PizzaHalvesResponseDto;", "errorCode", "isGift", "", "price", "", BonusActionEntity.ORDER, "shoppingItemId", ShoppingInfoEntity.FIELD_PRODUCT_ID, "discount", "Lru/dodopizza/backend/domain/state/dto/cart/DiscountDto;", "totalPrice", "isEditable", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/cart/dto/SizeDto;ILjava/lang/String;ILjava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;Ljava/util/List;Lru/dodopizza/backend/domain/state/dto/cart/response/PizzaHalvesResponseDto;IZDILjava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/cart/DiscountDto;DZ)V", "getCategory", "()Ljava/lang/String;", "getComboProducts", "()Ljava/util/List;", "getCount", "()I", "getCustomization", "()Lru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;", "getDescription", "getDiscount", "()Lru/dodopizza/backend/domain/state/dto/cart/DiscountDto;", "getDoughType", "getDoughTypeName", "getErrorCode", "getId", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "()Z", "getMaxCount", "getName", "getOrder", "getPizzaHalves", "()Lru/dodopizza/backend/domain/state/dto/cart/response/PizzaHalvesResponseDto;", "getPrice", "()D", "getProductId", "getShoppingItemId", "getSizeGroup", "getSizeGroupName", "getSizeInfo", "()Lru/dodopizza/backend/domain/cart/dto/SizeDto;", "getTotalPrice", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartItemResponseDto {
    @uca("category")
    private final String category;
    @uca("comboProducts")
    private final List<CartComboSlotProductResponseDto> comboProducts;
    @uca("count")
    private final int count;
    @uca("customization")
    private final CustomizationResponseDto customization;
    @uca("description")
    private final String description;
    @uca("discount")
    private final DiscountDto discount;
    @uca("doughType")
    private final int doughType;
    @uca("doughTypeName")
    private final String doughTypeName;
    @uca("errorCode")
    private final int errorCode;
    @uca("id")
    private final String id;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final ProductImageDto image;
    @uca("isEditable")
    private final boolean isEditable;
    @uca("isGift")
    private final boolean isGift;
    @uca("maxCount")
    private final int maxCount;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca(BonusActionEntity.ORDER)
    private final int order;
    @uca("pizzaHalves")
    private final PizzaHalvesResponseDto pizzaHalves;
    @uca("price")
    private final double price;
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;
    @uca("shoppingItemId")
    private final String shoppingItemId;
    @uca("sizeGroup")
    private final int sizeGroup;
    @uca("sizeGroupName")
    private final String sizeGroupName;
    @uca("size")
    private final SizeDto sizeInfo;
    @uca("totalPrice")
    private final double totalPrice;

    public CartItemResponseDto(String str, int i, int i2, String str2, String str3, SizeDto sizeDto, int i3, String str4, int i4, String str5, ProductImageDto productImageDto, String str6, CustomizationResponseDto customizationResponseDto, List<CartComboSlotProductResponseDto> list, PizzaHalvesResponseDto pizzaHalvesResponseDto, int i5, boolean z, double d, int i6, String str7, String str8, DiscountDto discountDto, double d2, boolean z2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(str6, "category");
        z65.h(list, "comboProducts");
        z65.h(str7, "shoppingItemId");
        this.id = str;
        this.count = i;
        this.maxCount = i2;
        this.name = str2;
        this.description = str3;
        this.sizeInfo = sizeDto;
        this.doughType = i3;
        this.doughTypeName = str4;
        this.sizeGroup = i4;
        this.sizeGroupName = str5;
        this.image = productImageDto;
        this.category = str6;
        this.customization = customizationResponseDto;
        this.comboProducts = list;
        this.pizzaHalves = pizzaHalvesResponseDto;
        this.errorCode = i5;
        this.isGift = z;
        this.price = d;
        this.order = i6;
        this.shoppingItemId = str7;
        this.productId = str8;
        this.discount = discountDto;
        this.totalPrice = d2;
        this.isEditable = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartItemResponseDto copy$default(CartItemResponseDto cartItemResponseDto, String str, int i, int i2, String str2, String str3, SizeDto sizeDto, int i3, String str4, int i4, String str5, ProductImageDto productImageDto, String str6, CustomizationResponseDto customizationResponseDto, List list, PizzaHalvesResponseDto pizzaHalvesResponseDto, int i5, boolean z, double d, int i6, String str7, String str8, DiscountDto discountDto, double d2, boolean z2, int i7, Object obj) {
        String str9 = (i7 & 1) != 0 ? cartItemResponseDto.id : str;
        int i8 = (i7 & 2) != 0 ? cartItemResponseDto.count : i;
        int i9 = (i7 & 4) != 0 ? cartItemResponseDto.maxCount : i2;
        String str10 = (i7 & 8) != 0 ? cartItemResponseDto.name : str2;
        String str11 = (i7 & 16) != 0 ? cartItemResponseDto.description : str3;
        SizeDto sizeDto2 = (i7 & 32) != 0 ? cartItemResponseDto.sizeInfo : sizeDto;
        int i10 = (i7 & 64) != 0 ? cartItemResponseDto.doughType : i3;
        String str12 = (i7 & 128) != 0 ? cartItemResponseDto.doughTypeName : str4;
        int i11 = (i7 & 256) != 0 ? cartItemResponseDto.sizeGroup : i4;
        String str13 = (i7 & 512) != 0 ? cartItemResponseDto.sizeGroupName : str5;
        ProductImageDto productImageDto2 = (i7 & 1024) != 0 ? cartItemResponseDto.image : productImageDto;
        String str14 = (i7 & 2048) != 0 ? cartItemResponseDto.category : str6;
        CustomizationResponseDto customizationResponseDto2 = (i7 & 4096) != 0 ? cartItemResponseDto.customization : customizationResponseDto;
        return cartItemResponseDto.copy(str9, i8, i9, str10, str11, sizeDto2, i10, str12, i11, str13, productImageDto2, str14, customizationResponseDto2, (i7 & 8192) != 0 ? cartItemResponseDto.comboProducts : list, (i7 & 16384) != 0 ? cartItemResponseDto.pizzaHalves : pizzaHalvesResponseDto, (i7 & 32768) != 0 ? cartItemResponseDto.errorCode : i5, (i7 & 65536) != 0 ? cartItemResponseDto.isGift : z, (i7 & 131072) != 0 ? cartItemResponseDto.price : d, (i7 & 262144) != 0 ? cartItemResponseDto.order : i6, (524288 & i7) != 0 ? cartItemResponseDto.shoppingItemId : str7, (i7 & 1048576) != 0 ? cartItemResponseDto.productId : str8, (i7 & 2097152) != 0 ? cartItemResponseDto.discount : discountDto, (i7 & 4194304) != 0 ? cartItemResponseDto.totalPrice : d2, (i7 & 8388608) != 0 ? cartItemResponseDto.isEditable : z2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.sizeGroupName;
    }

    public final ProductImageDto component11() {
        return this.image;
    }

    public final String component12() {
        return this.category;
    }

    public final CustomizationResponseDto component13() {
        return this.customization;
    }

    public final List<CartComboSlotProductResponseDto> component14() {
        return this.comboProducts;
    }

    public final PizzaHalvesResponseDto component15() {
        return this.pizzaHalves;
    }

    public final int component16() {
        return this.errorCode;
    }

    public final boolean component17() {
        return this.isGift;
    }

    public final double component18() {
        return this.price;
    }

    public final int component19() {
        return this.order;
    }

    public final int component2() {
        return this.count;
    }

    public final String component20() {
        return this.shoppingItemId;
    }

    public final String component21() {
        return this.productId;
    }

    public final DiscountDto component22() {
        return this.discount;
    }

    public final double component23() {
        return this.totalPrice;
    }

    public final boolean component24() {
        return this.isEditable;
    }

    public final int component3() {
        return this.maxCount;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final SizeDto component6() {
        return this.sizeInfo;
    }

    public final int component7() {
        return this.doughType;
    }

    public final String component8() {
        return this.doughTypeName;
    }

    public final int component9() {
        return this.sizeGroup;
    }

    public final CartItemResponseDto copy(String str, int i, int i2, String str2, String str3, SizeDto sizeDto, int i3, String str4, int i4, String str5, ProductImageDto productImageDto, String str6, CustomizationResponseDto customizationResponseDto, List<CartComboSlotProductResponseDto> list, PizzaHalvesResponseDto pizzaHalvesResponseDto, int i5, boolean z, double d, int i6, String str7, String str8, DiscountDto discountDto, double d2, boolean z2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(str6, "category");
        z65.h(list, "comboProducts");
        z65.h(str7, "shoppingItemId");
        return new CartItemResponseDto(str, i, i2, str2, str3, sizeDto, i3, str4, i4, str5, productImageDto, str6, customizationResponseDto, list, pizzaHalvesResponseDto, i5, z, d, i6, str7, str8, discountDto, d2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartItemResponseDto)) {
            return false;
        }
        CartItemResponseDto cartItemResponseDto = (CartItemResponseDto) obj;
        if (z65.c(this.id, cartItemResponseDto.id) && this.count == cartItemResponseDto.count && this.maxCount == cartItemResponseDto.maxCount && z65.c(this.name, cartItemResponseDto.name) && z65.c(this.description, cartItemResponseDto.description) && z65.c(this.sizeInfo, cartItemResponseDto.sizeInfo) && this.doughType == cartItemResponseDto.doughType && z65.c(this.doughTypeName, cartItemResponseDto.doughTypeName) && this.sizeGroup == cartItemResponseDto.sizeGroup && z65.c(this.sizeGroupName, cartItemResponseDto.sizeGroupName) && z65.c(this.image, cartItemResponseDto.image) && z65.c(this.category, cartItemResponseDto.category) && z65.c(this.customization, cartItemResponseDto.customization) && z65.c(this.comboProducts, cartItemResponseDto.comboProducts) && z65.c(this.pizzaHalves, cartItemResponseDto.pizzaHalves) && this.errorCode == cartItemResponseDto.errorCode && this.isGift == cartItemResponseDto.isGift && Double.compare(this.price, cartItemResponseDto.price) == 0 && this.order == cartItemResponseDto.order && z65.c(this.shoppingItemId, cartItemResponseDto.shoppingItemId) && z65.c(this.productId, cartItemResponseDto.productId) && z65.c(this.discount, cartItemResponseDto.discount) && Double.compare(this.totalPrice, cartItemResponseDto.totalPrice) == 0 && this.isEditable == cartItemResponseDto.isEditable) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<CartComboSlotProductResponseDto> getComboProducts() {
        return this.comboProducts;
    }

    public final int getCount() {
        return this.count;
    }

    public final CustomizationResponseDto getCustomization() {
        return this.customization;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DiscountDto getDiscount() {
        return this.discount;
    }

    public final int getDoughType() {
        return this.doughType;
    }

    public final String getDoughTypeName() {
        return this.doughTypeName;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getId() {
        return this.id;
    }

    public final ProductImageDto getImage() {
        return this.image;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final PizzaHalvesResponseDto getPizzaHalves() {
        return this.pizzaHalves;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getShoppingItemId() {
        return this.shoppingItemId;
    }

    public final int getSizeGroup() {
        return this.sizeGroup;
    }

    public final String getSizeGroupName() {
        return this.sizeGroupName;
    }

    public final SizeDto getSizeInfo() {
        return this.sizeInfo;
    }

    public final double getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((((((((this.id.hashCode() * 31) + this.count) * 31) + this.maxCount) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31;
        SizeDto sizeDto = this.sizeInfo;
        int i = 0;
        if (sizeDto == null) {
            hashCode = 0;
        } else {
            hashCode = sizeDto.hashCode();
        }
        int i2 = (((hashCode8 + hashCode) * 31) + this.doughType) * 31;
        String str = this.doughTypeName;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.sizeGroup) * 31;
        String str2 = this.sizeGroupName;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ProductImageDto productImageDto = this.image;
        if (productImageDto == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = productImageDto.hashCode();
        }
        int hashCode9 = (((i4 + hashCode4) * 31) + this.category.hashCode()) * 31;
        CustomizationResponseDto customizationResponseDto = this.customization;
        if (customizationResponseDto == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = customizationResponseDto.hashCode();
        }
        int hashCode10 = (((hashCode9 + hashCode5) * 31) + this.comboProducts.hashCode()) * 31;
        PizzaHalvesResponseDto pizzaHalvesResponseDto = this.pizzaHalves;
        if (pizzaHalvesResponseDto == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = pizzaHalvesResponseDto.hashCode();
        }
        int a = (((((((((((hashCode10 + hashCode6) * 31) + this.errorCode) * 31) + a91.a(this.isGift)) * 31) + nkb.a(this.price)) * 31) + this.order) * 31) + this.shoppingItemId.hashCode()) * 31;
        String str3 = this.productId;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i5 = (a + hashCode7) * 31;
        DiscountDto discountDto = this.discount;
        if (discountDto != null) {
            i = discountDto.hashCode();
        }
        return ((((i5 + i) * 31) + nkb.a(this.totalPrice)) * 31) + a91.a(this.isEditable);
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public final boolean isGift() {
        return this.isGift;
    }

    public String toString() {
        String str = this.id;
        int i = this.count;
        int i2 = this.maxCount;
        String str2 = this.name;
        String str3 = this.description;
        SizeDto sizeDto = this.sizeInfo;
        int i3 = this.doughType;
        String str4 = this.doughTypeName;
        int i4 = this.sizeGroup;
        String str5 = this.sizeGroupName;
        ProductImageDto productImageDto = this.image;
        String str6 = this.category;
        CustomizationResponseDto customizationResponseDto = this.customization;
        List<CartComboSlotProductResponseDto> list = this.comboProducts;
        PizzaHalvesResponseDto pizzaHalvesResponseDto = this.pizzaHalves;
        int i5 = this.errorCode;
        boolean z = this.isGift;
        double d = this.price;
        int i6 = this.order;
        String str7 = this.shoppingItemId;
        String str8 = this.productId;
        DiscountDto discountDto = this.discount;
        double d2 = this.totalPrice;
        boolean z2 = this.isEditable;
        return "CartItemResponseDto(id=" + str + ", count=" + i + ", maxCount=" + i2 + ", name=" + str2 + ", description=" + str3 + ", sizeInfo=" + sizeDto + ", doughType=" + i3 + ", doughTypeName=" + str4 + ", sizeGroup=" + i4 + ", sizeGroupName=" + str5 + ", image=" + productImageDto + ", category=" + str6 + ", customization=" + customizationResponseDto + ", comboProducts=" + list + ", pizzaHalves=" + pizzaHalvesResponseDto + ", errorCode=" + i5 + ", isGift=" + z + ", price=" + d + ", order=" + i6 + ", shoppingItemId=" + str7 + ", productId=" + str8 + ", discount=" + discountDto + ", totalPrice=" + d2 + ", isEditable=" + z2 + ")";
    }

    public /* synthetic */ CartItemResponseDto(String str, int i, int i2, String str2, String str3, SizeDto sizeDto, int i3, String str4, int i4, String str5, ProductImageDto productImageDto, String str6, CustomizationResponseDto customizationResponseDto, List list, PizzaHalvesResponseDto pizzaHalvesResponseDto, int i5, boolean z, double d, int i6, String str7, String str8, DiscountDto discountDto, double d2, boolean z2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 0 : i, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? "" : str2, (i7 & 16) != 0 ? "" : str3, (i7 & 32) != 0 ? null : sizeDto, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? null : str4, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) != 0 ? null : str5, (i7 & 1024) != 0 ? null : productImageDto, (i7 & 2048) != 0 ? "" : str6, (i7 & 4096) != 0 ? null : customizationResponseDto, (i7 & 8192) != 0 ? kc1.l() : list, (i7 & 16384) != 0 ? null : pizzaHalvesResponseDto, (i7 & 32768) != 0 ? 0 : i5, (i7 & 65536) != 0 ? false : z, (i7 & 131072) != 0 ? 0.0d : d, (i7 & 262144) != 0 ? 0 : i6, (i7 & 524288) != 0 ? "" : str7, (i7 & 1048576) == 0 ? str8 : "", (i7 & 2097152) != 0 ? null : discountDto, (i7 & 4194304) == 0 ? d2 : 0.0d, (i7 & 8388608) != 0 ? false : z2);
    }
}
