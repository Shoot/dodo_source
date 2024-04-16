package ru.dodopizza.backend.domain.cart.dto;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: CustomizationDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/PizzaHalfOrderDto;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "price", "", "imageUrl", "imageUrls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "(Ljava/lang/String;DLjava/lang/String;Lru/dodopizza/backend/domain/common/ImageUrls;)V", "getImageUrl", "()Ljava/lang/String;", "getImageUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "getPrice", "()D", "getProductId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PizzaHalfOrderDto {
    @uca("imageUrl")
    private final String imageUrl;
    @uca("imageUrls")
    private final ImageUrls imageUrls;
    @uca("price")
    private final double price;
    @uca("productUUId")
    private final String productId;

    public PizzaHalfOrderDto(String str, double d, String str2, ImageUrls imageUrls) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        this.productId = str;
        this.price = d;
        this.imageUrl = str2;
        this.imageUrls = imageUrls;
    }

    public static /* synthetic */ PizzaHalfOrderDto copy$default(PizzaHalfOrderDto pizzaHalfOrderDto, String str, double d, String str2, ImageUrls imageUrls, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pizzaHalfOrderDto.productId;
        }
        if ((i & 2) != 0) {
            d = pizzaHalfOrderDto.price;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str2 = pizzaHalfOrderDto.imageUrl;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            imageUrls = pizzaHalfOrderDto.imageUrls;
        }
        return pizzaHalfOrderDto.copy(str, d2, str3, imageUrls);
    }

    public final String component1() {
        return this.productId;
    }

    public final double component2() {
        return this.price;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final ImageUrls component4() {
        return this.imageUrls;
    }

    public final PizzaHalfOrderDto copy(String str, double d, String str2, ImageUrls imageUrls) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        return new PizzaHalfOrderDto(str, d, str2, imageUrls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PizzaHalfOrderDto)) {
            return false;
        }
        PizzaHalfOrderDto pizzaHalfOrderDto = (PizzaHalfOrderDto) obj;
        if (z65.c(this.productId, pizzaHalfOrderDto.productId) && Double.compare(this.price, pizzaHalfOrderDto.price) == 0 && z65.c(this.imageUrl, pizzaHalfOrderDto.imageUrl) && z65.c(this.imageUrls, pizzaHalfOrderDto.imageUrls)) {
            return true;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ImageUrls getImageUrls() {
        return this.imageUrls;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.productId.hashCode() * 31) + nkb.a(this.price)) * 31;
        String str = this.imageUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        ImageUrls imageUrls = this.imageUrls;
        if (imageUrls != null) {
            i = imageUrls.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.productId;
        double d = this.price;
        String str2 = this.imageUrl;
        ImageUrls imageUrls = this.imageUrls;
        return "PizzaHalfOrderDto(productId=" + str + ", price=" + d + ", imageUrl=" + str2 + ", imageUrls=" + imageUrls + ")";
    }

    public /* synthetic */ PizzaHalfOrderDto(String str, double d, String str2, ImageUrls imageUrls, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : imageUrls);
    }
}
