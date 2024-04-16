package ru.dodopizza.backend.domain.loyalty.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyMenuDto.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/LoyaltyMenuDto;", "", "minimalLegalPrice", "", "loyaltyGuideURL", "", "categories", "", "Lru/dodopizza/backend/domain/loyalty/dto/LoyaltyProductCategoryDto;", "(DLjava/lang/String;Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "getLoyaltyGuideURL", "()Ljava/lang/String;", "getMinimalLegalPrice", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyMenuDto {
    @uca("categories")
    private final List<LoyaltyProductCategoryDto> categories;
    @uca("guideURL")
    private final String loyaltyGuideURL;
    @uca("productsPrice")
    private final double minimalLegalPrice;

    public LoyaltyMenuDto(double d, String str, List<LoyaltyProductCategoryDto> list) {
        z65.h(list, "categories");
        this.minimalLegalPrice = d;
        this.loyaltyGuideURL = str;
        this.categories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoyaltyMenuDto copy$default(LoyaltyMenuDto loyaltyMenuDto, double d, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = loyaltyMenuDto.minimalLegalPrice;
        }
        if ((i & 2) != 0) {
            str = loyaltyMenuDto.loyaltyGuideURL;
        }
        if ((i & 4) != 0) {
            list = loyaltyMenuDto.categories;
        }
        return loyaltyMenuDto.copy(d, str, list);
    }

    public final double component1() {
        return this.minimalLegalPrice;
    }

    public final String component2() {
        return this.loyaltyGuideURL;
    }

    public final List<LoyaltyProductCategoryDto> component3() {
        return this.categories;
    }

    public final LoyaltyMenuDto copy(double d, String str, List<LoyaltyProductCategoryDto> list) {
        z65.h(list, "categories");
        return new LoyaltyMenuDto(d, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMenuDto)) {
            return false;
        }
        LoyaltyMenuDto loyaltyMenuDto = (LoyaltyMenuDto) obj;
        if (Double.compare(this.minimalLegalPrice, loyaltyMenuDto.minimalLegalPrice) == 0 && z65.c(this.loyaltyGuideURL, loyaltyMenuDto.loyaltyGuideURL) && z65.c(this.categories, loyaltyMenuDto.categories)) {
            return true;
        }
        return false;
    }

    public final List<LoyaltyProductCategoryDto> getCategories() {
        return this.categories;
    }

    public final String getLoyaltyGuideURL() {
        return this.loyaltyGuideURL;
    }

    public final double getMinimalLegalPrice() {
        return this.minimalLegalPrice;
    }

    public int hashCode() {
        int hashCode;
        int a = nkb.a(this.minimalLegalPrice) * 31;
        String str = this.loyaltyGuideURL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((a + hashCode) * 31) + this.categories.hashCode();
    }

    public String toString() {
        double d = this.minimalLegalPrice;
        String str = this.loyaltyGuideURL;
        List<LoyaltyProductCategoryDto> list = this.categories;
        return "LoyaltyMenuDto(minimalLegalPrice=" + d + ", loyaltyGuideURL=" + str + ", categories=" + list + ")";
    }
}
