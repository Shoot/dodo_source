package ru.dodopizza.backend.domain.loyalty.dto;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: LoyaltyProductDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/LoyaltyProductDto;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", ShoppingInfoEntity.FIELD_SHOPPING_ID, Action.NAME_ATTRIBUTE, "description", ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;)V", "getDescription", "()Ljava/lang/String;", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "getName", "getProductId", "getShoppingId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyProductDto {
    @uca("description")
    private final String description;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final ProductImageDto image;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;
    @uca(ShoppingInfoEntity.FIELD_SHOPPING_ID)
    private final String shoppingId;

    public LoyaltyProductDto(String str, String str2, String str3, String str4, ProductImageDto productImageDto) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(str3, Action.NAME_ATTRIBUTE);
        this.productId = str;
        this.shoppingId = str2;
        this.name = str3;
        this.description = str4;
        this.image = productImageDto;
    }

    public static /* synthetic */ LoyaltyProductDto copy$default(LoyaltyProductDto loyaltyProductDto, String str, String str2, String str3, String str4, ProductImageDto productImageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyProductDto.productId;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyProductDto.shoppingId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = loyaltyProductDto.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = loyaltyProductDto.description;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            productImageDto = loyaltyProductDto.image;
        }
        return loyaltyProductDto.copy(str, str5, str6, str7, productImageDto);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.shoppingId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final ProductImageDto component5() {
        return this.image;
    }

    public final LoyaltyProductDto copy(String str, String str2, String str3, String str4, ProductImageDto productImageDto) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(str3, Action.NAME_ATTRIBUTE);
        return new LoyaltyProductDto(str, str2, str3, str4, productImageDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyProductDto)) {
            return false;
        }
        LoyaltyProductDto loyaltyProductDto = (LoyaltyProductDto) obj;
        if (z65.c(this.productId, loyaltyProductDto.productId) && z65.c(this.shoppingId, loyaltyProductDto.shoppingId) && z65.c(this.name, loyaltyProductDto.name) && z65.c(this.description, loyaltyProductDto.description) && z65.c(this.image, loyaltyProductDto.image)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ProductImageDto getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getShoppingId() {
        return this.shoppingId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.productId.hashCode() * 31) + this.shoppingId.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        ProductImageDto productImageDto = this.image;
        if (productImageDto != null) {
            i = productImageDto.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.shoppingId;
        String str3 = this.name;
        String str4 = this.description;
        ProductImageDto productImageDto = this.image;
        return "LoyaltyProductDto(productId=" + str + ", shoppingId=" + str2 + ", name=" + str3 + ", description=" + str4 + ", image=" + productImageDto + ")";
    }
}
