package ru.dodopizza.backend.domain.state.dto.personalization;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: MenuPersonalPriceInfoDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006'"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/personalization/MenuPersonalPriceInfoDto;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "rawPrice", "", "discountedPrice", "discountInPercent", "", "discountMode", "endDateTimeUtc", "priority", "menuCategoryId", "(Ljava/lang/String;DDIILjava/lang/String;ILjava/lang/String;)V", "getDiscountInPercent", "()I", "getDiscountMode", "getDiscountedPrice", "()D", "getEndDateTimeUtc", "()Ljava/lang/String;", "getMenuCategoryId", "getPriority", "getProductId", "getRawPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MenuPersonalPriceInfoDto {
    @uca("discountPercentage")
    private final int discountInPercent;
    @uca("discountMode")
    private final int discountMode;
    @uca("personalPrice")
    private final double discountedPrice;
    @uca("endDateTimeUtc")
    private final String endDateTimeUtc;
    @uca("menuCategoryId")
    private final String menuCategoryId;
    @uca("priority")
    private final int priority;
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;
    @uca("price")
    private final double rawPrice;

    public MenuPersonalPriceInfoDto(String str, double d, double d2, int i, int i2, String str2, int i3, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, "endDateTimeUtc");
        z65.h(str3, "menuCategoryId");
        this.productId = str;
        this.rawPrice = d;
        this.discountedPrice = d2;
        this.discountInPercent = i;
        this.discountMode = i2;
        this.endDateTimeUtc = str2;
        this.priority = i3;
        this.menuCategoryId = str3;
    }

    public static /* synthetic */ MenuPersonalPriceInfoDto copy$default(MenuPersonalPriceInfoDto menuPersonalPriceInfoDto, String str, double d, double d2, int i, int i2, String str2, int i3, String str3, int i4, Object obj) {
        String str4;
        double d3;
        double d4;
        int i5;
        int i6;
        String str5;
        int i7;
        String str6;
        if ((i4 & 1) != 0) {
            str4 = menuPersonalPriceInfoDto.productId;
        } else {
            str4 = str;
        }
        if ((i4 & 2) != 0) {
            d3 = menuPersonalPriceInfoDto.rawPrice;
        } else {
            d3 = d;
        }
        if ((i4 & 4) != 0) {
            d4 = menuPersonalPriceInfoDto.discountedPrice;
        } else {
            d4 = d2;
        }
        if ((i4 & 8) != 0) {
            i5 = menuPersonalPriceInfoDto.discountInPercent;
        } else {
            i5 = i;
        }
        if ((i4 & 16) != 0) {
            i6 = menuPersonalPriceInfoDto.discountMode;
        } else {
            i6 = i2;
        }
        if ((i4 & 32) != 0) {
            str5 = menuPersonalPriceInfoDto.endDateTimeUtc;
        } else {
            str5 = str2;
        }
        if ((i4 & 64) != 0) {
            i7 = menuPersonalPriceInfoDto.priority;
        } else {
            i7 = i3;
        }
        if ((i4 & 128) != 0) {
            str6 = menuPersonalPriceInfoDto.menuCategoryId;
        } else {
            str6 = str3;
        }
        return menuPersonalPriceInfoDto.copy(str4, d3, d4, i5, i6, str5, i7, str6);
    }

    public final String component1() {
        return this.productId;
    }

    public final double component2() {
        return this.rawPrice;
    }

    public final double component3() {
        return this.discountedPrice;
    }

    public final int component4() {
        return this.discountInPercent;
    }

    public final int component5() {
        return this.discountMode;
    }

    public final String component6() {
        return this.endDateTimeUtc;
    }

    public final int component7() {
        return this.priority;
    }

    public final String component8() {
        return this.menuCategoryId;
    }

    public final MenuPersonalPriceInfoDto copy(String str, double d, double d2, int i, int i2, String str2, int i3, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, "endDateTimeUtc");
        z65.h(str3, "menuCategoryId");
        return new MenuPersonalPriceInfoDto(str, d, d2, i, i2, str2, i3, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuPersonalPriceInfoDto)) {
            return false;
        }
        MenuPersonalPriceInfoDto menuPersonalPriceInfoDto = (MenuPersonalPriceInfoDto) obj;
        if (z65.c(this.productId, menuPersonalPriceInfoDto.productId) && Double.compare(this.rawPrice, menuPersonalPriceInfoDto.rawPrice) == 0 && Double.compare(this.discountedPrice, menuPersonalPriceInfoDto.discountedPrice) == 0 && this.discountInPercent == menuPersonalPriceInfoDto.discountInPercent && this.discountMode == menuPersonalPriceInfoDto.discountMode && z65.c(this.endDateTimeUtc, menuPersonalPriceInfoDto.endDateTimeUtc) && this.priority == menuPersonalPriceInfoDto.priority && z65.c(this.menuCategoryId, menuPersonalPriceInfoDto.menuCategoryId)) {
            return true;
        }
        return false;
    }

    public final int getDiscountInPercent() {
        return this.discountInPercent;
    }

    public final int getDiscountMode() {
        return this.discountMode;
    }

    public final double getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final String getEndDateTimeUtc() {
        return this.endDateTimeUtc;
    }

    public final String getMenuCategoryId() {
        return this.menuCategoryId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final double getRawPrice() {
        return this.rawPrice;
    }

    public int hashCode() {
        return (((((((((((((this.productId.hashCode() * 31) + nkb.a(this.rawPrice)) * 31) + nkb.a(this.discountedPrice)) * 31) + this.discountInPercent) * 31) + this.discountMode) * 31) + this.endDateTimeUtc.hashCode()) * 31) + this.priority) * 31) + this.menuCategoryId.hashCode();
    }

    public String toString() {
        String str = this.productId;
        double d = this.rawPrice;
        double d2 = this.discountedPrice;
        int i = this.discountInPercent;
        int i2 = this.discountMode;
        String str2 = this.endDateTimeUtc;
        int i3 = this.priority;
        String str3 = this.menuCategoryId;
        return "MenuPersonalPriceInfoDto(productId=" + str + ", rawPrice=" + d + ", discountedPrice=" + d2 + ", discountInPercent=" + i + ", discountMode=" + i2 + ", endDateTimeUtc=" + str2 + ", priority=" + i3 + ", menuCategoryId=" + str3 + ")";
    }
}
