package ru.dodopizza.backend.domain.country.dto;

import kotlin.Metadata;
/* compiled from: CurrencyDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/CurrencyDto;", "", "code", "", "customSymbol", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCustomSymbol", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CurrencyDto {
    @uca("code")
    private final String code;
    @uca("customSymbol")
    private final String customSymbol;

    public CurrencyDto(String str, String str2) {
        z65.h(str, "code");
        this.code = str;
        this.customSymbol = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCustomSymbol() {
        return this.customSymbol;
    }
}
