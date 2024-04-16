package ru.dodopizza.backend.domain.state.dto.cart.response;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: CartProductResponseDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006)"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/CartProductResponseDto;", "", "id", "", "category", "price", "", "size", "", ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", Action.NAME_ATTRIBUTE, "dough", "errorCode", "(Ljava/lang/String;Ljava/lang/String;DILru/dodopizza/backend/domain/menu/dto/ProductImageDto;Ljava/lang/String;II)V", "getCategory", "()Ljava/lang/String;", "getDough", "()I", "getErrorCode", "getId", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "getName", "getPrice", "()D", "getSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductResponseDto {
    @uca("category")
    private final String category;
    @uca("dough")
    private final int dough;
    @uca("errorCode")
    private final int errorCode;
    @uca("id")
    private final String id;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final ProductImageDto image;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("price")
    private final double price;
    @uca("size")
    private final int size;

    public CartProductResponseDto(String str, String str2, double d, int i, ProductImageDto productImageDto, String str3, int i2, int i3) {
        z65.h(str, "id");
        z65.h(str2, "category");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        this.id = str;
        this.category = str2;
        this.price = d;
        this.size = i;
        this.image = productImageDto;
        this.name = str3;
        this.dough = i2;
        this.errorCode = i3;
    }

    public static /* synthetic */ CartProductResponseDto copy$default(CartProductResponseDto cartProductResponseDto, String str, String str2, double d, int i, ProductImageDto productImageDto, String str3, int i2, int i3, int i4, Object obj) {
        String str4;
        String str5;
        double d2;
        int i5;
        ProductImageDto productImageDto2;
        String str6;
        int i6;
        int i7;
        if ((i4 & 1) != 0) {
            str4 = cartProductResponseDto.id;
        } else {
            str4 = str;
        }
        if ((i4 & 2) != 0) {
            str5 = cartProductResponseDto.category;
        } else {
            str5 = str2;
        }
        if ((i4 & 4) != 0) {
            d2 = cartProductResponseDto.price;
        } else {
            d2 = d;
        }
        if ((i4 & 8) != 0) {
            i5 = cartProductResponseDto.size;
        } else {
            i5 = i;
        }
        if ((i4 & 16) != 0) {
            productImageDto2 = cartProductResponseDto.image;
        } else {
            productImageDto2 = productImageDto;
        }
        if ((i4 & 32) != 0) {
            str6 = cartProductResponseDto.name;
        } else {
            str6 = str3;
        }
        if ((i4 & 64) != 0) {
            i6 = cartProductResponseDto.dough;
        } else {
            i6 = i2;
        }
        if ((i4 & 128) != 0) {
            i7 = cartProductResponseDto.errorCode;
        } else {
            i7 = i3;
        }
        return cartProductResponseDto.copy(str4, str5, d2, i5, productImageDto2, str6, i6, i7);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.category;
    }

    public final double component3() {
        return this.price;
    }

    public final int component4() {
        return this.size;
    }

    public final ProductImageDto component5() {
        return this.image;
    }

    public final String component6() {
        return this.name;
    }

    public final int component7() {
        return this.dough;
    }

    public final int component8() {
        return this.errorCode;
    }

    public final CartProductResponseDto copy(String str, String str2, double d, int i, ProductImageDto productImageDto, String str3, int i2, int i3) {
        z65.h(str, "id");
        z65.h(str2, "category");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        return new CartProductResponseDto(str, str2, d, i, productImageDto, str3, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductResponseDto)) {
            return false;
        }
        CartProductResponseDto cartProductResponseDto = (CartProductResponseDto) obj;
        if (z65.c(this.id, cartProductResponseDto.id) && z65.c(this.category, cartProductResponseDto.category) && Double.compare(this.price, cartProductResponseDto.price) == 0 && this.size == cartProductResponseDto.size && z65.c(this.image, cartProductResponseDto.image) && z65.c(this.name, cartProductResponseDto.name) && this.dough == cartProductResponseDto.dough && this.errorCode == cartProductResponseDto.errorCode) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getDough() {
        return this.dough;
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

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.id.hashCode() * 31) + this.category.hashCode()) * 31) + nkb.a(this.price)) * 31) + this.size) * 31;
        ProductImageDto productImageDto = this.image;
        if (productImageDto == null) {
            hashCode = 0;
        } else {
            hashCode = productImageDto.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.name.hashCode()) * 31) + this.dough) * 31) + this.errorCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.category;
        double d = this.price;
        int i = this.size;
        ProductImageDto productImageDto = this.image;
        String str3 = this.name;
        int i2 = this.dough;
        int i3 = this.errorCode;
        return "CartProductResponseDto(id=" + str + ", category=" + str2 + ", price=" + d + ", size=" + i + ", image=" + productImageDto + ", name=" + str3 + ", dough=" + i2 + ", errorCode=" + i3 + ")";
    }
}
