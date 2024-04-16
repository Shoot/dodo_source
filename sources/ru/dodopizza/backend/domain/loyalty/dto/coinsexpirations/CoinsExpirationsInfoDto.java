package ru.dodopizza.backend.domain.loyalty.dto.coinsexpirations;

import java.util.List;
import kotlin.Metadata;
/* compiled from: CoinsExpirationsInfoDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/coinsexpirations/CoinsExpirationsInfoDto;", "", "expirationPeriodInDays", "", "extraExpirationPeriodInDays", "coinsExpirations", "", "Lru/dodopizza/backend/domain/loyalty/dto/coinsexpirations/CoinExpirationDto;", "(IILjava/util/List;)V", "getCoinsExpirations", "()Ljava/util/List;", "getExpirationPeriodInDays", "()I", "getExtraExpirationPeriodInDays", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoinsExpirationsInfoDto {
    @uca("expirations")
    private final List<CoinExpirationDto> coinsExpirations;
    @uca("expirationPeriodInDays")
    private final int expirationPeriodInDays;
    @uca("extraCashbackExpirationPeriodInDays")
    private final int extraExpirationPeriodInDays;

    public CoinsExpirationsInfoDto(int i, int i2, List<CoinExpirationDto> list) {
        z65.h(list, "coinsExpirations");
        this.expirationPeriodInDays = i;
        this.extraExpirationPeriodInDays = i2;
        this.coinsExpirations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinsExpirationsInfoDto copy$default(CoinsExpirationsInfoDto coinsExpirationsInfoDto, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = coinsExpirationsInfoDto.expirationPeriodInDays;
        }
        if ((i3 & 2) != 0) {
            i2 = coinsExpirationsInfoDto.extraExpirationPeriodInDays;
        }
        if ((i3 & 4) != 0) {
            list = coinsExpirationsInfoDto.coinsExpirations;
        }
        return coinsExpirationsInfoDto.copy(i, i2, list);
    }

    public final int component1() {
        return this.expirationPeriodInDays;
    }

    public final int component2() {
        return this.extraExpirationPeriodInDays;
    }

    public final List<CoinExpirationDto> component3() {
        return this.coinsExpirations;
    }

    public final CoinsExpirationsInfoDto copy(int i, int i2, List<CoinExpirationDto> list) {
        z65.h(list, "coinsExpirations");
        return new CoinsExpirationsInfoDto(i, i2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinsExpirationsInfoDto)) {
            return false;
        }
        CoinsExpirationsInfoDto coinsExpirationsInfoDto = (CoinsExpirationsInfoDto) obj;
        if (this.expirationPeriodInDays == coinsExpirationsInfoDto.expirationPeriodInDays && this.extraExpirationPeriodInDays == coinsExpirationsInfoDto.extraExpirationPeriodInDays && z65.c(this.coinsExpirations, coinsExpirationsInfoDto.coinsExpirations)) {
            return true;
        }
        return false;
    }

    public final List<CoinExpirationDto> getCoinsExpirations() {
        return this.coinsExpirations;
    }

    public final int getExpirationPeriodInDays() {
        return this.expirationPeriodInDays;
    }

    public final int getExtraExpirationPeriodInDays() {
        return this.extraExpirationPeriodInDays;
    }

    public int hashCode() {
        return (((this.expirationPeriodInDays * 31) + this.extraExpirationPeriodInDays) * 31) + this.coinsExpirations.hashCode();
    }

    public String toString() {
        int i = this.expirationPeriodInDays;
        int i2 = this.extraExpirationPeriodInDays;
        List<CoinExpirationDto> list = this.coinsExpirations;
        return "CoinsExpirationsInfoDto(expirationPeriodInDays=" + i + ", extraExpirationPeriodInDays=" + i2 + ", coinsExpirations=" + list + ")";
    }
}
