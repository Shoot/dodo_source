package ru.dodopizza.backend.domain.menu.dto;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: ShoppingItemDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ShoppingItemDto;", "", "id", "", "price", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "(Ljava/lang/String;DLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPrice", "()D", "getProductId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingItemDto {
    @uca("id")
    private final String id;
    @uca("price")
    private final double price;
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;

    public ShoppingItemDto(String str, double d, String str2) {
        z65.h(str, "id");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        this.id = str;
        this.price = d;
        this.productId = str2;
    }

    public static /* synthetic */ ShoppingItemDto copy$default(ShoppingItemDto shoppingItemDto, String str, double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingItemDto.id;
        }
        if ((i & 2) != 0) {
            d = shoppingItemDto.price;
        }
        if ((i & 4) != 0) {
            str2 = shoppingItemDto.productId;
        }
        return shoppingItemDto.copy(str, d, str2);
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

    public final ShoppingItemDto copy(String str, double d, String str2) {
        z65.h(str, "id");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        return new ShoppingItemDto(str, d, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingItemDto)) {
            return false;
        }
        ShoppingItemDto shoppingItemDto = (ShoppingItemDto) obj;
        if (z65.c(this.id, shoppingItemDto.id) && Double.compare(this.price, shoppingItemDto.price) == 0 && z65.c(this.productId, shoppingItemDto.productId)) {
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

    public int hashCode() {
        return (((this.id.hashCode() * 31) + nkb.a(this.price)) * 31) + this.productId.hashCode();
    }

    public String toString() {
        String str = this.id;
        double d = this.price;
        String str2 = this.productId;
        return "ShoppingItemDto(id=" + str + ", price=" + d + ", productId=" + str2 + ")";
    }
}
