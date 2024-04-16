package ru.dodopizza.backend.domain.menu.dto;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: CustomShoppingItemDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/CustomShoppingItemDto;", "", "id", "", "price", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, ShoppingInfoEntity.FIELD_SHOPPING_ID, "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPrice", "()D", "getProductId", "getShoppingId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomShoppingItemDto {
    @uca("id")
    private final String id;
    @uca("price")
    private final double price;
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;
    @uca("shoppingItemId")
    private final String shoppingId;

    public CustomShoppingItemDto(String str, double d, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str3, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        this.id = str;
        this.price = d;
        this.productId = str2;
        this.shoppingId = str3;
    }

    public static /* synthetic */ CustomShoppingItemDto copy$default(CustomShoppingItemDto customShoppingItemDto, String str, double d, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customShoppingItemDto.id;
        }
        if ((i & 2) != 0) {
            d = customShoppingItemDto.price;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str2 = customShoppingItemDto.productId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = customShoppingItemDto.shoppingId;
        }
        return customShoppingItemDto.copy(str, d2, str4, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final double component2() {
        return this.price;
    }

    public final String component3() {
        return this.productId;
    }

    public final String component4() {
        return this.shoppingId;
    }

    public final CustomShoppingItemDto copy(String str, double d, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str3, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        return new CustomShoppingItemDto(str, d, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomShoppingItemDto)) {
            return false;
        }
        CustomShoppingItemDto customShoppingItemDto = (CustomShoppingItemDto) obj;
        if (z65.c(this.id, customShoppingItemDto.id) && Double.compare(this.price, customShoppingItemDto.price) == 0 && z65.c(this.productId, customShoppingItemDto.productId) && z65.c(this.shoppingId, customShoppingItemDto.shoppingId)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getShoppingId() {
        return this.shoppingId;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + nkb.a(this.price)) * 31) + this.productId.hashCode()) * 31) + this.shoppingId.hashCode();
    }

    public String toString() {
        String str = this.id;
        double d = this.price;
        String str2 = this.productId;
        String str3 = this.shoppingId;
        return "CustomShoppingItemDto(id=" + str + ", price=" + d + ", productId=" + str2 + ", shoppingId=" + str3 + ")";
    }
}
