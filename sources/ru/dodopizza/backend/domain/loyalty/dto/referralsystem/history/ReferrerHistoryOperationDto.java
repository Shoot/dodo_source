package ru.dodopizza.backend.domain.loyalty.dto.referralsystem.history;

import kotlin.Metadata;
/* compiled from: ReferrerHistoryOperationDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/history/ReferrerHistoryOperationDto;", "", "referralUuid", "", "operationDateTimeUtc", "earnedCoinsAmount", "", "(Ljava/lang/String;Ljava/lang/String;D)V", "getEarnedCoinsAmount", "()D", "getOperationDateTimeUtc", "()Ljava/lang/String;", "getReferralUuid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferrerHistoryOperationDto {
    @uca("coinsAmount")
    private final double earnedCoinsAmount;
    @uca("dateTimeUtc")
    private final String operationDateTimeUtc;
    @uca("referralId")
    private final String referralUuid;

    public ReferrerHistoryOperationDto(String str, String str2, double d) {
        z65.h(str, "referralUuid");
        z65.h(str2, "operationDateTimeUtc");
        this.referralUuid = str;
        this.operationDateTimeUtc = str2;
        this.earnedCoinsAmount = d;
    }

    public static /* synthetic */ ReferrerHistoryOperationDto copy$default(ReferrerHistoryOperationDto referrerHistoryOperationDto, String str, String str2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = referrerHistoryOperationDto.referralUuid;
        }
        if ((i & 2) != 0) {
            str2 = referrerHistoryOperationDto.operationDateTimeUtc;
        }
        if ((i & 4) != 0) {
            d = referrerHistoryOperationDto.earnedCoinsAmount;
        }
        return referrerHistoryOperationDto.copy(str, str2, d);
    }

    public final String component1() {
        return this.referralUuid;
    }

    public final String component2() {
        return this.operationDateTimeUtc;
    }

    public final double component3() {
        return this.earnedCoinsAmount;
    }

    public final ReferrerHistoryOperationDto copy(String str, String str2, double d) {
        z65.h(str, "referralUuid");
        z65.h(str2, "operationDateTimeUtc");
        return new ReferrerHistoryOperationDto(str, str2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferrerHistoryOperationDto)) {
            return false;
        }
        ReferrerHistoryOperationDto referrerHistoryOperationDto = (ReferrerHistoryOperationDto) obj;
        if (z65.c(this.referralUuid, referrerHistoryOperationDto.referralUuid) && z65.c(this.operationDateTimeUtc, referrerHistoryOperationDto.operationDateTimeUtc) && Double.compare(this.earnedCoinsAmount, referrerHistoryOperationDto.earnedCoinsAmount) == 0) {
            return true;
        }
        return false;
    }

    public final double getEarnedCoinsAmount() {
        return this.earnedCoinsAmount;
    }

    public final String getOperationDateTimeUtc() {
        return this.operationDateTimeUtc;
    }

    public final String getReferralUuid() {
        return this.referralUuid;
    }

    public int hashCode() {
        return (((this.referralUuid.hashCode() * 31) + this.operationDateTimeUtc.hashCode()) * 31) + nkb.a(this.earnedCoinsAmount);
    }

    public String toString() {
        String str = this.referralUuid;
        String str2 = this.operationDateTimeUtc;
        double d = this.earnedCoinsAmount;
        return "ReferrerHistoryOperationDto(referralUuid=" + str + ", operationDateTimeUtc=" + str2 + ", earnedCoinsAmount=" + d + ")";
    }
}
