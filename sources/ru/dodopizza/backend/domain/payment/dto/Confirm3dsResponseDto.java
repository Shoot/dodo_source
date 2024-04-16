package ru.dodopizza.backend.domain.payment.dto;

import kotlin.Metadata;
/* compiled from: Confirm3dsResponseDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/Confirm3dsResponseDto;", "", "md", "", "navigateUrl", "paReq", "termUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMd", "()Ljava/lang/String;", "getNavigateUrl", "getPaReq", "setPaReq", "(Ljava/lang/String;)V", "getTermUrl", "setTermUrl", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Confirm3dsResponseDto {
    @uca("md")
    private final String md;
    @uca("navigateUrl")
    private final String navigateUrl;
    @uca("paReq")
    private String paReq;
    @uca("termUrl")
    private String termUrl;

    public Confirm3dsResponseDto(String str, String str2, String str3, String str4) {
        z65.h(str, "md");
        z65.h(str2, "navigateUrl");
        z65.h(str3, "paReq");
        z65.h(str4, "termUrl");
        this.md = str;
        this.navigateUrl = str2;
        this.paReq = str3;
        this.termUrl = str4;
    }

    public final String getMd() {
        return this.md;
    }

    public final String getNavigateUrl() {
        return this.navigateUrl;
    }

    public final String getPaReq() {
        return this.paReq;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public final void setPaReq(String str) {
        z65.h(str, "<set-?>");
        this.paReq = str;
    }

    public final void setTermUrl(String str) {
        z65.h(str, "<set-?>");
        this.termUrl = str;
    }
}
