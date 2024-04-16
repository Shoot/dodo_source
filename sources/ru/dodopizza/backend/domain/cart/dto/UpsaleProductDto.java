package ru.dodopizza.backend.domain.cart.dto;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: UpsaleProductDto.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003JX\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\nHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/UpsaleProductDto;", "", "id", "", Action.NAME_ATTRIBUTE, ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "price", "", "orderInCart", "", "category", "upsaleSizeDetailsDto", "Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;", "(Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;DILjava/lang/Integer;Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;)V", "getCategory", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "setImage", "(Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;)V", "getName", "setName", "getOrderInCart", "()I", "getPrice", "()D", "setPrice", "(D)V", "getUpsaleSizeDetailsDto", "()Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;DILjava/lang/Integer;Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;)Lru/dodopizza/backend/domain/cart/dto/UpsaleProductDto;", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpsaleProductDto {
    @uca("category")
    private final Integer category;
    @uca("id")
    private String id;
    @uca(ElementGenerator.TYPE_IMAGE)
    private ProductImageDto image;
    @uca(Action.NAME_ATTRIBUTE)
    private String name;
    @uca("orderInCart")
    private final int orderInCart;
    @uca("price")
    private double price;
    @uca("sizeDetails")
    private final UpsaleSizeDetailsDto upsaleSizeDetailsDto;

    public UpsaleProductDto(String str, String str2, ProductImageDto productImageDto, double d, int i, Integer num, UpsaleSizeDetailsDto upsaleSizeDetailsDto) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(productImageDto, ElementGenerator.TYPE_IMAGE);
        this.id = str;
        this.name = str2;
        this.image = productImageDto;
        this.price = d;
        this.orderInCart = i;
        this.category = num;
        this.upsaleSizeDetailsDto = upsaleSizeDetailsDto;
    }

    public static /* synthetic */ UpsaleProductDto copy$default(UpsaleProductDto upsaleProductDto, String str, String str2, ProductImageDto productImageDto, double d, int i, Integer num, UpsaleSizeDetailsDto upsaleSizeDetailsDto, int i2, Object obj) {
        String str3;
        String str4;
        ProductImageDto productImageDto2;
        double d2;
        int i3;
        Integer num2;
        UpsaleSizeDetailsDto upsaleSizeDetailsDto2;
        if ((i2 & 1) != 0) {
            str3 = upsaleProductDto.id;
        } else {
            str3 = str;
        }
        if ((i2 & 2) != 0) {
            str4 = upsaleProductDto.name;
        } else {
            str4 = str2;
        }
        if ((i2 & 4) != 0) {
            productImageDto2 = upsaleProductDto.image;
        } else {
            productImageDto2 = productImageDto;
        }
        if ((i2 & 8) != 0) {
            d2 = upsaleProductDto.price;
        } else {
            d2 = d;
        }
        if ((i2 & 16) != 0) {
            i3 = upsaleProductDto.orderInCart;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            num2 = upsaleProductDto.category;
        } else {
            num2 = num;
        }
        if ((i2 & 64) != 0) {
            upsaleSizeDetailsDto2 = upsaleProductDto.upsaleSizeDetailsDto;
        } else {
            upsaleSizeDetailsDto2 = upsaleSizeDetailsDto;
        }
        return upsaleProductDto.copy(str3, str4, productImageDto2, d2, i3, num2, upsaleSizeDetailsDto2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final ProductImageDto component3() {
        return this.image;
    }

    public final double component4() {
        return this.price;
    }

    public final int component5() {
        return this.orderInCart;
    }

    public final Integer component6() {
        return this.category;
    }

    public final UpsaleSizeDetailsDto component7() {
        return this.upsaleSizeDetailsDto;
    }

    public final UpsaleProductDto copy(String str, String str2, ProductImageDto productImageDto, double d, int i, Integer num, UpsaleSizeDetailsDto upsaleSizeDetailsDto) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(productImageDto, ElementGenerator.TYPE_IMAGE);
        return new UpsaleProductDto(str, str2, productImageDto, d, i, num, upsaleSizeDetailsDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpsaleProductDto)) {
            return false;
        }
        UpsaleProductDto upsaleProductDto = (UpsaleProductDto) obj;
        if (z65.c(this.id, upsaleProductDto.id) && z65.c(this.name, upsaleProductDto.name) && z65.c(this.image, upsaleProductDto.image) && Double.compare(this.price, upsaleProductDto.price) == 0 && this.orderInCart == upsaleProductDto.orderInCart && z65.c(this.category, upsaleProductDto.category) && z65.c(this.upsaleSizeDetailsDto, upsaleProductDto.upsaleSizeDetailsDto)) {
            return true;
        }
        return false;
    }

    public final Integer getCategory() {
        return this.category;
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

    public final int getOrderInCart() {
        return this.orderInCart;
    }

    public final double getPrice() {
        return this.price;
    }

    public final UpsaleSizeDetailsDto getUpsaleSizeDetailsDto() {
        return this.upsaleSizeDetailsDto;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.image.hashCode()) * 31) + nkb.a(this.price)) * 31) + this.orderInCart) * 31;
        Integer num = this.category;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        UpsaleSizeDetailsDto upsaleSizeDetailsDto = this.upsaleSizeDetailsDto;
        if (upsaleSizeDetailsDto != null) {
            i = upsaleSizeDetailsDto.hashCode();
        }
        return i2 + i;
    }

    public final void setId(String str) {
        z65.h(str, "<set-?>");
        this.id = str;
    }

    public final void setImage(ProductImageDto productImageDto) {
        z65.h(productImageDto, "<set-?>");
        this.image = productImageDto;
    }

    public final void setName(String str) {
        z65.h(str, "<set-?>");
        this.name = str;
    }

    public final void setPrice(double d) {
        this.price = d;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        ProductImageDto productImageDto = this.image;
        double d = this.price;
        int i = this.orderInCart;
        Integer num = this.category;
        UpsaleSizeDetailsDto upsaleSizeDetailsDto = this.upsaleSizeDetailsDto;
        return "UpsaleProductDto(id=" + str + ", name=" + str2 + ", image=" + productImageDto + ", price=" + d + ", orderInCart=" + i + ", category=" + num + ", upsaleSizeDetailsDto=" + upsaleSizeDetailsDto + ")";
    }

    public /* synthetic */ UpsaleProductDto(String str, String str2, ProductImageDto productImageDto, double d, int i, Integer num, UpsaleSizeDetailsDto upsaleSizeDetailsDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new ProductImageDto(0, 0, null, null, 15, null) : productImageDto, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? 0 : i, num, upsaleSizeDetailsDto);
    }
}
