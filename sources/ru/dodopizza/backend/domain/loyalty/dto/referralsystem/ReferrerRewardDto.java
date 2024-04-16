package ru.dodopizza.backend.domain.loyalty.dto.referralsystem;

import kotlin.Metadata;
/* compiled from: ReferrerRewardDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerRewardDto;", "", "coinsAmount", "", "expirationDateUtc", "", "expirationInDays", "", "(DLjava/lang/String;I)V", "getCoinsAmount", "()D", "getExpirationDateUtc", "()Ljava/lang/String;", "getExpirationInDays", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferrerRewardDto {
    @uca("amount")
    private final double coinsAmount;
    @uca("expirationDateTimeUtc")
    private final String expirationDateUtc;
    @uca("expirationDays")
    private final int expirationInDays;

    public ReferrerRewardDto(double d, String str, int i) {
        z65.h(str, "expirationDateUtc");
        this.coinsAmount = d;
        this.expirationDateUtc = str;
        this.expirationInDays = i;
    }

    public static /* synthetic */ ReferrerRewardDto copy$default(ReferrerRewardDto referrerRewardDto, double d, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = referrerRewardDto.coinsAmount;
        }
        if ((i2 & 2) != 0) {
            str = referrerRewardDto.expirationDateUtc;
        }
        if ((i2 & 4) != 0) {
            i = referrerRewardDto.expirationInDays;
        }
        return referrerRewardDto.copy(d, str, i);
    }

    public final double component1() {
        return this.coinsAmount;
    }

    public final String component2() {
        return this.expirationDateUtc;
    }

    public final int component3() {
        return this.expirationInDays;
    }

    public final ReferrerRewardDto copy(double d, String str, int i) {
        z65.h(str, "expirationDateUtc");
        return new ReferrerRewardDto(d, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferrerRewardDto)) {
            return false;
        }
        ReferrerRewardDto referrerRewardDto = (ReferrerRewardDto) obj;
        if (Double.compare(this.coinsAmount, referrerRewardDto.coinsAmount) == 0 && z65.c(this.expirationDateUtc, referrerRewardDto.expirationDateUtc) && this.expirationInDays == referrerRewardDto.expirationInDays) {
            return true;
        }
        return false;
    }

    public final double getCoinsAmount() {
        return this.coinsAmount;
    }

    public final String getExpirationDateUtc() {
        return this.expirationDateUtc;
    }

    public final int getExpirationInDays() {
        return this.expirationInDays;
    }

    public int hashCode() {
        return (((nkb.a(this.coinsAmount) * 31) + this.expirationDateUtc.hashCode()) * 31) + this.expirationInDays;
    }

    public String toString() {
        double d = this.coinsAmount;
        String str = this.expirationDateUtc;
        int i = this.expirationInDays;
        return "ReferrerRewardDto(coinsAmount=" + d + ", expirationDateUtc=" + str + ", expirationInDays=" + i + ")";
    }
}
