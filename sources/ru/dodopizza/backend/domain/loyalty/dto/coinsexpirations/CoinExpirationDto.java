package ru.dodopizza.backend.domain.loyalty.dto.coinsexpirations;

import kotlin.Metadata;
/* compiled from: CoinExpirationDto.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/coinsexpirations/CoinExpirationDto;", "", "expirationDateTimeUtc", "", "expirationAmount", "", "(Ljava/lang/String;D)V", "getExpirationAmount", "()D", "getExpirationDateTimeUtc", "()Ljava/lang/String;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoinExpirationDto {
    @uca("amount")
    private final double expirationAmount;
    @uca("expirationDateTimeUtc")
    private final String expirationDateTimeUtc;

    public CoinExpirationDto(String str, double d) {
        z65.h(str, "expirationDateTimeUtc");
        this.expirationDateTimeUtc = str;
        this.expirationAmount = d;
    }

    public final double getExpirationAmount() {
        return this.expirationAmount;
    }

    public final String getExpirationDateTimeUtc() {
        return this.expirationDateTimeUtc;
    }
}
