package ru.dodopizza.backend.domain.state.dto.cart;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DiscountDto.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/DiscountDto;", "", "bonusActionId", "", "title", "description", "amount", "", "loyaltyCoinsUsed", "", "personalPriceDiscount", "Lru/dodopizza/backend/domain/state/dto/cart/PersonalPriceDiscountDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJLru/dodopizza/backend/domain/state/dto/cart/PersonalPriceDiscountDto;)V", "getAmount", "()D", "getBonusActionId", "()Ljava/lang/String;", "getDescription", "getLoyaltyCoinsUsed", "()J", "getPersonalPriceDiscount", "()Lru/dodopizza/backend/domain/state/dto/cart/PersonalPriceDiscountDto;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiscountDto {
    @uca("amount")
    private final double amount;
    @uca("bonusActionId")
    private final String bonusActionId;
    @uca("description")
    private final String description;
    @uca("loyaltyCoinsUsed")
    private final long loyaltyCoinsUsed;
    @uca("personalPrice")
    private final PersonalPriceDiscountDto personalPriceDiscount;
    @uca("title")
    private final String title;

    public DiscountDto() {
        this(null, null, null, 0.0d, 0L, null, 63, null);
    }

    public static /* synthetic */ DiscountDto copy$default(DiscountDto discountDto, String str, String str2, String str3, double d, long j, PersonalPriceDiscountDto personalPriceDiscountDto, int i, Object obj) {
        String str4;
        String str5;
        String str6;
        double d2;
        long j2;
        PersonalPriceDiscountDto personalPriceDiscountDto2;
        if ((i & 1) != 0) {
            str4 = discountDto.bonusActionId;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            str5 = discountDto.title;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            str6 = discountDto.description;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            d2 = discountDto.amount;
        } else {
            d2 = d;
        }
        if ((i & 16) != 0) {
            j2 = discountDto.loyaltyCoinsUsed;
        } else {
            j2 = j;
        }
        if ((i & 32) != 0) {
            personalPriceDiscountDto2 = discountDto.personalPriceDiscount;
        } else {
            personalPriceDiscountDto2 = personalPriceDiscountDto;
        }
        return discountDto.copy(str4, str5, str6, d2, j2, personalPriceDiscountDto2);
    }

    public final String component1() {
        return this.bonusActionId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final double component4() {
        return this.amount;
    }

    public final long component5() {
        return this.loyaltyCoinsUsed;
    }

    public final PersonalPriceDiscountDto component6() {
        return this.personalPriceDiscount;
    }

    public final DiscountDto copy(String str, String str2, String str3, double d, long j, PersonalPriceDiscountDto personalPriceDiscountDto) {
        z65.h(str, "bonusActionId");
        z65.h(str2, "title");
        z65.h(str3, "description");
        return new DiscountDto(str, str2, str3, d, j, personalPriceDiscountDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountDto)) {
            return false;
        }
        DiscountDto discountDto = (DiscountDto) obj;
        if (z65.c(this.bonusActionId, discountDto.bonusActionId) && z65.c(this.title, discountDto.title) && z65.c(this.description, discountDto.description) && Double.compare(this.amount, discountDto.amount) == 0 && this.loyaltyCoinsUsed == discountDto.loyaltyCoinsUsed && z65.c(this.personalPriceDiscount, discountDto.personalPriceDiscount)) {
            return true;
        }
        return false;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getBonusActionId() {
        return this.bonusActionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getLoyaltyCoinsUsed() {
        return this.loyaltyCoinsUsed;
    }

    public final PersonalPriceDiscountDto getPersonalPriceDiscount() {
        return this.personalPriceDiscount;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.bonusActionId.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + nkb.a(this.amount)) * 31) + ax1.a(this.loyaltyCoinsUsed)) * 31;
        PersonalPriceDiscountDto personalPriceDiscountDto = this.personalPriceDiscount;
        if (personalPriceDiscountDto == null) {
            hashCode = 0;
        } else {
            hashCode = personalPriceDiscountDto.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.bonusActionId;
        String str2 = this.title;
        String str3 = this.description;
        double d = this.amount;
        long j = this.loyaltyCoinsUsed;
        PersonalPriceDiscountDto personalPriceDiscountDto = this.personalPriceDiscount;
        return "DiscountDto(bonusActionId=" + str + ", title=" + str2 + ", description=" + str3 + ", amount=" + d + ", loyaltyCoinsUsed=" + j + ", personalPriceDiscount=" + personalPriceDiscountDto + ")";
    }

    public DiscountDto(String str, String str2, String str3, double d, long j, PersonalPriceDiscountDto personalPriceDiscountDto) {
        z65.h(str, "bonusActionId");
        z65.h(str2, "title");
        z65.h(str3, "description");
        this.bonusActionId = str;
        this.title = str2;
        this.description = str3;
        this.amount = d;
        this.loyaltyCoinsUsed = j;
        this.personalPriceDiscount = personalPriceDiscountDto;
    }

    public /* synthetic */ DiscountDto(String str, String str2, String str3, double d, long j, PersonalPriceDiscountDto personalPriceDiscountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : personalPriceDiscountDto);
    }
}
