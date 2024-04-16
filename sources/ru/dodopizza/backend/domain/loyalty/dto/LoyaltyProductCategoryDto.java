package ru.dodopizza.backend.domain.loyalty.dto;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: LoyaltyProductCategoryDto.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/LoyaltyProductCategoryDto;", "", "id", "", Action.NAME_ATTRIBUTE, ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "price", "", "products", "", "Lru/dodopizza/backend/domain/loyalty/dto/LoyaltyProductDto;", "(Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;DLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "getName", "getPrice", "()D", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyProductCategoryDto {
    @uca("id")
    private final String id;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final ProductImageDto image;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("loyaltyPrice")
    private final double price;
    @uca("products")
    private final List<LoyaltyProductDto> products;

    public LoyaltyProductCategoryDto(String str, String str2, ProductImageDto productImageDto, double d, List<LoyaltyProductDto> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(list, "products");
        this.id = str;
        this.name = str2;
        this.image = productImageDto;
        this.price = d;
        this.products = list;
    }

    public static /* synthetic */ LoyaltyProductCategoryDto copy$default(LoyaltyProductCategoryDto loyaltyProductCategoryDto, String str, String str2, ProductImageDto productImageDto, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyProductCategoryDto.id;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyProductCategoryDto.name;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            productImageDto = loyaltyProductCategoryDto.image;
        }
        ProductImageDto productImageDto2 = productImageDto;
        if ((i & 8) != 0) {
            d = loyaltyProductCategoryDto.price;
        }
        double d2 = d;
        List<LoyaltyProductDto> list2 = list;
        if ((i & 16) != 0) {
            list2 = loyaltyProductCategoryDto.products;
        }
        return loyaltyProductCategoryDto.copy(str, str3, productImageDto2, d2, list2);
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

    public final List<LoyaltyProductDto> component5() {
        return this.products;
    }

    public final LoyaltyProductCategoryDto copy(String str, String str2, ProductImageDto productImageDto, double d, List<LoyaltyProductDto> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(list, "products");
        return new LoyaltyProductCategoryDto(str, str2, productImageDto, d, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyProductCategoryDto)) {
            return false;
        }
        LoyaltyProductCategoryDto loyaltyProductCategoryDto = (LoyaltyProductCategoryDto) obj;
        if (z65.c(this.id, loyaltyProductCategoryDto.id) && z65.c(this.name, loyaltyProductCategoryDto.name) && z65.c(this.image, loyaltyProductCategoryDto.image) && Double.compare(this.price, loyaltyProductCategoryDto.price) == 0 && z65.c(this.products, loyaltyProductCategoryDto.products)) {
            return true;
        }
        return false;
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

    public final List<LoyaltyProductDto> getProducts() {
        return this.products;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        ProductImageDto productImageDto = this.image;
        if (productImageDto == null) {
            hashCode = 0;
        } else {
            hashCode = productImageDto.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + nkb.a(this.price)) * 31) + this.products.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        ProductImageDto productImageDto = this.image;
        double d = this.price;
        List<LoyaltyProductDto> list = this.products;
        return "LoyaltyProductCategoryDto(id=" + str + ", name=" + str2 + ", image=" + productImageDto + ", price=" + d + ", products=" + list + ")";
    }
}
