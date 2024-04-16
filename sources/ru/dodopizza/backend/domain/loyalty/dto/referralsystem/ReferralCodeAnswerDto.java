package ru.dodopizza.backend.domain.loyalty.dto.referralsystem;

import kotlin.Metadata;
/* compiled from: ReferralCodeAnswerDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeAnswerDto;", "", "promoTypes", "", "countryId", "referrerReward", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerRewardDto;", "applyingError", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeErrorDto;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerRewardDto;Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeErrorDto;)V", "getApplyingError", "()Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeErrorDto;", "getCountryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPromoTypes", "getReferrerReward", "()Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerRewardDto;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerRewardDto;Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeErrorDto;)Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeAnswerDto;", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferralCodeAnswerDto {
    @uca("error")
    private final ReferralCodeErrorDto applyingError;
    @uca("countryId")
    private final Integer countryId;
    @uca("promoType")
    private final Integer promoTypes;
    @uca("rewardedCoins")
    private final ReferrerRewardDto referrerReward;

    public ReferralCodeAnswerDto(Integer num, Integer num2, ReferrerRewardDto referrerRewardDto, ReferralCodeErrorDto referralCodeErrorDto) {
        this.promoTypes = num;
        this.countryId = num2;
        this.referrerReward = referrerRewardDto;
        this.applyingError = referralCodeErrorDto;
    }

    public static /* synthetic */ ReferralCodeAnswerDto copy$default(ReferralCodeAnswerDto referralCodeAnswerDto, Integer num, Integer num2, ReferrerRewardDto referrerRewardDto, ReferralCodeErrorDto referralCodeErrorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            num = referralCodeAnswerDto.promoTypes;
        }
        if ((i & 2) != 0) {
            num2 = referralCodeAnswerDto.countryId;
        }
        if ((i & 4) != 0) {
            referrerRewardDto = referralCodeAnswerDto.referrerReward;
        }
        if ((i & 8) != 0) {
            referralCodeErrorDto = referralCodeAnswerDto.applyingError;
        }
        return referralCodeAnswerDto.copy(num, num2, referrerRewardDto, referralCodeErrorDto);
    }

    public final Integer component1() {
        return this.promoTypes;
    }

    public final Integer component2() {
        return this.countryId;
    }

    public final ReferrerRewardDto component3() {
        return this.referrerReward;
    }

    public final ReferralCodeErrorDto component4() {
        return this.applyingError;
    }

    public final ReferralCodeAnswerDto copy(Integer num, Integer num2, ReferrerRewardDto referrerRewardDto, ReferralCodeErrorDto referralCodeErrorDto) {
        return new ReferralCodeAnswerDto(num, num2, referrerRewardDto, referralCodeErrorDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralCodeAnswerDto)) {
            return false;
        }
        ReferralCodeAnswerDto referralCodeAnswerDto = (ReferralCodeAnswerDto) obj;
        if (z65.c(this.promoTypes, referralCodeAnswerDto.promoTypes) && z65.c(this.countryId, referralCodeAnswerDto.countryId) && z65.c(this.referrerReward, referralCodeAnswerDto.referrerReward) && z65.c(this.applyingError, referralCodeAnswerDto.applyingError)) {
            return true;
        }
        return false;
    }

    public final ReferralCodeErrorDto getApplyingError() {
        return this.applyingError;
    }

    public final Integer getCountryId() {
        return this.countryId;
    }

    public final Integer getPromoTypes() {
        return this.promoTypes;
    }

    public final ReferrerRewardDto getReferrerReward() {
        return this.referrerReward;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.promoTypes;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.countryId;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ReferrerRewardDto referrerRewardDto = this.referrerReward;
        if (referrerRewardDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = referrerRewardDto.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ReferralCodeErrorDto referralCodeErrorDto = this.applyingError;
        if (referralCodeErrorDto != null) {
            i = referralCodeErrorDto.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        Integer num = this.promoTypes;
        Integer num2 = this.countryId;
        ReferrerRewardDto referrerRewardDto = this.referrerReward;
        ReferralCodeErrorDto referralCodeErrorDto = this.applyingError;
        return "ReferralCodeAnswerDto(promoTypes=" + num + ", countryId=" + num2 + ", referrerReward=" + referrerRewardDto + ", applyingError=" + referralCodeErrorDto + ")";
    }
}
