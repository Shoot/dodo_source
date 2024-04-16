package ru.dodopizza.backend.domain.payment.dto;

import kotlin.Metadata;
/* compiled from: Confirm3dsRequestDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/Confirm3dsRequestDto;", "", "paRes", "", "md", "(Ljava/lang/String;Ljava/lang/String;)V", "getMd", "()Ljava/lang/String;", "getPaRes", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Confirm3dsRequestDto {
    @uca("md")
    private final String md;
    @uca("paRes")
    private final String paRes;

    public Confirm3dsRequestDto(String str, String str2) {
        z65.h(str, "paRes");
        z65.h(str2, "md");
        this.paRes = str;
        this.md = str2;
    }

    public final String getMd() {
        return this.md;
    }

    public final String getPaRes() {
        return this.paRes;
    }
}
