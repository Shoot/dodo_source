package ru.dodopizza.backend.domain.cart.dto;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: ProductCartItemDto.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J©\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006B"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/ProductCartItemDto;", "", "category", "", Action.NAME_ATTRIBUTE, "", "description", "imageUrl", "productGuid", ShoppingInfoEntity.FIELD_PRODUCT_ID, "totalPrice", "", "count", "customization", "Lru/dodopizza/backend/domain/cart/dto/CustomizationOrderResponseDto;", "doughType", "doughTypeName", "sizeGroup", "sizeGroupName", "size", "Lru/dodopizza/backend/domain/cart/dto/SizeDto;", "imageUrls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILru/dodopizza/backend/domain/cart/dto/CustomizationOrderResponseDto;ILjava/lang/String;ILjava/lang/String;Lru/dodopizza/backend/domain/cart/dto/SizeDto;Lru/dodopizza/backend/domain/common/ImageUrls;)V", "getCategory", "()I", "getCount", "getCustomization", "()Lru/dodopizza/backend/domain/cart/dto/CustomizationOrderResponseDto;", "getDescription", "()Ljava/lang/String;", "getDoughType", "getDoughTypeName", "getImageUrl", "getImageUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "getName", "getProductGuid", "getProductId", "getSize", "()Lru/dodopizza/backend/domain/cart/dto/SizeDto;", "getSizeGroup", "getSizeGroupName", "getTotalPrice", "()D", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCartItemDto {
    @uca("category")
    private final int category;
    @uca("count")
    private final int count;
    @uca("customization")
    private final CustomizationOrderResponseDto customization;
    @uca("description")
    private final String description;
    @uca("doughType")
    private final int doughType;
    @uca("doughTypeName")
    private final String doughTypeName;
    @uca("imageUrl")
    private final String imageUrl;
    @uca("imageUrls")
    private final ImageUrls imageUrls;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("productGuid")
    private final String productGuid;
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;
    @uca("size")
    private final SizeDto size;
    @uca("sizeGroup")
    private final int sizeGroup;
    @uca("sizeGroupName")
    private final String sizeGroupName;
    @uca("totalPrice")
    private final double totalPrice;

    public ProductCartItemDto(int i, String str, String str2, String str3, String str4, String str5, double d, int i2, CustomizationOrderResponseDto customizationOrderResponseDto, int i3, String str6, int i4, String str7, SizeDto sizeDto, ImageUrls imageUrls) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str3, "imageUrl");
        z65.h(str4, "productGuid");
        z65.h(str5, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(customizationOrderResponseDto, "customization");
        this.category = i;
        this.name = str;
        this.description = str2;
        this.imageUrl = str3;
        this.productGuid = str4;
        this.productId = str5;
        this.totalPrice = d;
        this.count = i2;
        this.customization = customizationOrderResponseDto;
        this.doughType = i3;
        this.doughTypeName = str6;
        this.sizeGroup = i4;
        this.sizeGroupName = str7;
        this.size = sizeDto;
        this.imageUrls = imageUrls;
    }

    public final int component1() {
        return this.category;
    }

    public final int component10() {
        return this.doughType;
    }

    public final String component11() {
        return this.doughTypeName;
    }

    public final int component12() {
        return this.sizeGroup;
    }

    public final String component13() {
        return this.sizeGroupName;
    }

    public final SizeDto component14() {
        return this.size;
    }

    public final ImageUrls component15() {
        return this.imageUrls;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.productGuid;
    }

    public final String component6() {
        return this.productId;
    }

    public final double component7() {
        return this.totalPrice;
    }

    public final int component8() {
        return this.count;
    }

    public final CustomizationOrderResponseDto component9() {
        return this.customization;
    }

    public final ProductCartItemDto copy(int i, String str, String str2, String str3, String str4, String str5, double d, int i2, CustomizationOrderResponseDto customizationOrderResponseDto, int i3, String str6, int i4, String str7, SizeDto sizeDto, ImageUrls imageUrls) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str3, "imageUrl");
        z65.h(str4, "productGuid");
        z65.h(str5, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(customizationOrderResponseDto, "customization");
        return new ProductCartItemDto(i, str, str2, str3, str4, str5, d, i2, customizationOrderResponseDto, i3, str6, i4, str7, sizeDto, imageUrls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCartItemDto)) {
            return false;
        }
        ProductCartItemDto productCartItemDto = (ProductCartItemDto) obj;
        if (this.category == productCartItemDto.category && z65.c(this.name, productCartItemDto.name) && z65.c(this.description, productCartItemDto.description) && z65.c(this.imageUrl, productCartItemDto.imageUrl) && z65.c(this.productGuid, productCartItemDto.productGuid) && z65.c(this.productId, productCartItemDto.productId) && Double.compare(this.totalPrice, productCartItemDto.totalPrice) == 0 && this.count == productCartItemDto.count && z65.c(this.customization, productCartItemDto.customization) && this.doughType == productCartItemDto.doughType && z65.c(this.doughTypeName, productCartItemDto.doughTypeName) && this.sizeGroup == productCartItemDto.sizeGroup && z65.c(this.sizeGroupName, productCartItemDto.sizeGroupName) && z65.c(this.size, productCartItemDto.size) && z65.c(this.imageUrls, productCartItemDto.imageUrls)) {
            return true;
        }
        return false;
    }

    public final int getCategory() {
        return this.category;
    }

    public final int getCount() {
        return this.count;
    }

    public final CustomizationOrderResponseDto getCustomization() {
        return this.customization;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDoughType() {
        return this.doughType;
    }

    public final String getDoughTypeName() {
        return this.doughTypeName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ImageUrls getImageUrls() {
        return this.imageUrls;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductGuid() {
        return this.productGuid;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final SizeDto getSize() {
        return this.size;
    }

    public final int getSizeGroup() {
        return this.sizeGroup;
    }

    public final String getSizeGroupName() {
        return this.sizeGroupName;
    }

    public final double getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((this.category * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((((((((((((((hashCode5 + hashCode) * 31) + this.imageUrl.hashCode()) * 31) + this.productGuid.hashCode()) * 31) + this.productId.hashCode()) * 31) + nkb.a(this.totalPrice)) * 31) + this.count) * 31) + this.customization.hashCode()) * 31) + this.doughType) * 31;
        String str2 = this.doughTypeName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (((hashCode6 + hashCode2) * 31) + this.sizeGroup) * 31;
        String str3 = this.sizeGroupName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        SizeDto sizeDto = this.size;
        if (sizeDto == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = sizeDto.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        ImageUrls imageUrls = this.imageUrls;
        if (imageUrls != null) {
            i = imageUrls.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        int i = this.category;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.imageUrl;
        String str4 = this.productGuid;
        String str5 = this.productId;
        double d = this.totalPrice;
        int i2 = this.count;
        CustomizationOrderResponseDto customizationOrderResponseDto = this.customization;
        int i3 = this.doughType;
        String str6 = this.doughTypeName;
        int i4 = this.sizeGroup;
        String str7 = this.sizeGroupName;
        SizeDto sizeDto = this.size;
        ImageUrls imageUrls = this.imageUrls;
        return "ProductCartItemDto(category=" + i + ", name=" + str + ", description=" + str2 + ", imageUrl=" + str3 + ", productGuid=" + str4 + ", productId=" + str5 + ", totalPrice=" + d + ", count=" + i2 + ", customization=" + customizationOrderResponseDto + ", doughType=" + i3 + ", doughTypeName=" + str6 + ", sizeGroup=" + i4 + ", sizeGroupName=" + str7 + ", size=" + sizeDto + ", imageUrls=" + imageUrls + ")";
    }
}
