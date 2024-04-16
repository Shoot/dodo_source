package ru.dodopizza.backend.domain.state.dto.cart.response;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: CartComboSlotProductResponseDto.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\bHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00064"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/CartComboSlotProductResponseDto;", "", "id", "", "category", "price", "", "size", "", "sizeGroupName", ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", Action.NAME_ATTRIBUTE, "dough", "doughTypeName", "errorCode", "customization", "Lru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;Ljava/lang/String;ILjava/lang/String;ILru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;)V", "getCategory", "()Ljava/lang/String;", "getCustomization", "()Lru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;", "getDough", "()I", "getDoughTypeName", "getErrorCode", "getId", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "getName", "getPrice", "()D", "getSize", "getSizeGroupName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartComboSlotProductResponseDto {
    @uca("category")
    private final String category;
    @uca("customization")
    private final CustomizationResponseDto customization;
    @uca("dough")
    private final int dough;
    @uca("doughTypeName")
    private final String doughTypeName;
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
    @uca("sizeGroupName")
    private final String sizeGroupName;

    public CartComboSlotProductResponseDto(String str, String str2, double d, int i, String str3, ProductImageDto productImageDto, String str4, int i2, String str5, int i3, CustomizationResponseDto customizationResponseDto) {
        z65.h(str, "id");
        z65.h(str2, "category");
        z65.h(str4, Action.NAME_ATTRIBUTE);
        this.id = str;
        this.category = str2;
        this.price = d;
        this.size = i;
        this.sizeGroupName = str3;
        this.image = productImageDto;
        this.name = str4;
        this.dough = i2;
        this.doughTypeName = str5;
        this.errorCode = i3;
        this.customization = customizationResponseDto;
    }

    public static /* synthetic */ CartComboSlotProductResponseDto copy$default(CartComboSlotProductResponseDto cartComboSlotProductResponseDto, String str, String str2, double d, int i, String str3, ProductImageDto productImageDto, String str4, int i2, String str5, int i3, CustomizationResponseDto customizationResponseDto, int i4, Object obj) {
        String str6;
        String str7;
        double d2;
        int i5;
        String str8;
        ProductImageDto productImageDto2;
        String str9;
        int i6;
        String str10;
        int i7;
        CustomizationResponseDto customizationResponseDto2;
        if ((i4 & 1) != 0) {
            str6 = cartComboSlotProductResponseDto.id;
        } else {
            str6 = str;
        }
        if ((i4 & 2) != 0) {
            str7 = cartComboSlotProductResponseDto.category;
        } else {
            str7 = str2;
        }
        if ((i4 & 4) != 0) {
            d2 = cartComboSlotProductResponseDto.price;
        } else {
            d2 = d;
        }
        if ((i4 & 8) != 0) {
            i5 = cartComboSlotProductResponseDto.size;
        } else {
            i5 = i;
        }
        if ((i4 & 16) != 0) {
            str8 = cartComboSlotProductResponseDto.sizeGroupName;
        } else {
            str8 = str3;
        }
        if ((i4 & 32) != 0) {
            productImageDto2 = cartComboSlotProductResponseDto.image;
        } else {
            productImageDto2 = productImageDto;
        }
        if ((i4 & 64) != 0) {
            str9 = cartComboSlotProductResponseDto.name;
        } else {
            str9 = str4;
        }
        if ((i4 & 128) != 0) {
            i6 = cartComboSlotProductResponseDto.dough;
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            str10 = cartComboSlotProductResponseDto.doughTypeName;
        } else {
            str10 = str5;
        }
        if ((i4 & 512) != 0) {
            i7 = cartComboSlotProductResponseDto.errorCode;
        } else {
            i7 = i3;
        }
        if ((i4 & 1024) != 0) {
            customizationResponseDto2 = cartComboSlotProductResponseDto.customization;
        } else {
            customizationResponseDto2 = customizationResponseDto;
        }
        return cartComboSlotProductResponseDto.copy(str6, str7, d2, i5, str8, productImageDto2, str9, i6, str10, i7, customizationResponseDto2);
    }

    public final String component1() {
        return this.id;
    }

    public final int component10() {
        return this.errorCode;
    }

    public final CustomizationResponseDto component11() {
        return this.customization;
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

    public final String component5() {
        return this.sizeGroupName;
    }

    public final ProductImageDto component6() {
        return this.image;
    }

    public final String component7() {
        return this.name;
    }

    public final int component8() {
        return this.dough;
    }

    public final String component9() {
        return this.doughTypeName;
    }

    public final CartComboSlotProductResponseDto copy(String str, String str2, double d, int i, String str3, ProductImageDto productImageDto, String str4, int i2, String str5, int i3, CustomizationResponseDto customizationResponseDto) {
        z65.h(str, "id");
        z65.h(str2, "category");
        z65.h(str4, Action.NAME_ATTRIBUTE);
        return new CartComboSlotProductResponseDto(str, str2, d, i, str3, productImageDto, str4, i2, str5, i3, customizationResponseDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartComboSlotProductResponseDto)) {
            return false;
        }
        CartComboSlotProductResponseDto cartComboSlotProductResponseDto = (CartComboSlotProductResponseDto) obj;
        if (z65.c(this.id, cartComboSlotProductResponseDto.id) && z65.c(this.category, cartComboSlotProductResponseDto.category) && Double.compare(this.price, cartComboSlotProductResponseDto.price) == 0 && this.size == cartComboSlotProductResponseDto.size && z65.c(this.sizeGroupName, cartComboSlotProductResponseDto.sizeGroupName) && z65.c(this.image, cartComboSlotProductResponseDto.image) && z65.c(this.name, cartComboSlotProductResponseDto.name) && this.dough == cartComboSlotProductResponseDto.dough && z65.c(this.doughTypeName, cartComboSlotProductResponseDto.doughTypeName) && this.errorCode == cartComboSlotProductResponseDto.errorCode && z65.c(this.customization, cartComboSlotProductResponseDto.customization)) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final CustomizationResponseDto getCustomization() {
        return this.customization;
    }

    public final int getDough() {
        return this.dough;
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

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getSize() {
        return this.size;
    }

    public final String getSizeGroupName() {
        return this.sizeGroupName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((this.id.hashCode() * 31) + this.category.hashCode()) * 31) + nkb.a(this.price)) * 31) + this.size) * 31;
        String str = this.sizeGroupName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        ProductImageDto productImageDto = this.image;
        if (productImageDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = productImageDto.hashCode();
        }
        int hashCode5 = (((((i2 + hashCode2) * 31) + this.name.hashCode()) * 31) + this.dough) * 31;
        String str2 = this.doughTypeName;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (((hashCode5 + hashCode3) * 31) + this.errorCode) * 31;
        CustomizationResponseDto customizationResponseDto = this.customization;
        if (customizationResponseDto != null) {
            i = customizationResponseDto.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.category;
        double d = this.price;
        int i = this.size;
        String str3 = this.sizeGroupName;
        ProductImageDto productImageDto = this.image;
        String str4 = this.name;
        int i2 = this.dough;
        String str5 = this.doughTypeName;
        int i3 = this.errorCode;
        CustomizationResponseDto customizationResponseDto = this.customization;
        return "CartComboSlotProductResponseDto(id=" + str + ", category=" + str2 + ", price=" + d + ", size=" + i + ", sizeGroupName=" + str3 + ", image=" + productImageDto + ", name=" + str4 + ", dough=" + i2 + ", doughTypeName=" + str5 + ", errorCode=" + i3 + ", customization=" + customizationResponseDto + ")";
    }

    public /* synthetic */ CartComboSlotProductResponseDto(String str, String str2, double d, int i, String str3, ProductImageDto productImageDto, String str4, int i2, String str5, int i3, CustomizationResponseDto customizationResponseDto, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, i, str3, productImageDto, str4, i2, str5, i3, (i4 & 1024) != 0 ? null : customizationResponseDto);
    }
}
