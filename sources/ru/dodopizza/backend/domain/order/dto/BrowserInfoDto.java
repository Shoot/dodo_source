package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
/* compiled from: BrowserInfoDto.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/BrowserInfoDto;", "", "acceptHeader", "", "language", "colorDepth", "", "screenHeight", "screenWidth", "timeZone", "userAgent", "(Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)V", "getAcceptHeader", "()Ljava/lang/String;", "getColorDepth", "()I", "getLanguage", "getScreenHeight", "getScreenWidth", "getTimeZone", "getUserAgent", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrowserInfoDto {
    @uca("acceptHeader")
    private final String acceptHeader;
    @uca("colorDepth")
    private final int colorDepth;
    @uca("language")
    private final String language;
    @uca("screenHeight")
    private final int screenHeight;
    @uca("screenWidth")
    private final int screenWidth;
    @uca("timeZone")
    private final int timeZone;
    @uca("userAgent")
    private final String userAgent;

    public BrowserInfoDto(String str, String str2, int i, int i2, int i3, int i4, String str3) {
        z65.h(str, "acceptHeader");
        z65.h(str2, "language");
        z65.h(str3, "userAgent");
        this.acceptHeader = str;
        this.language = str2;
        this.colorDepth = i;
        this.screenHeight = i2;
        this.screenWidth = i3;
        this.timeZone = i4;
        this.userAgent = str3;
    }

    public final String getAcceptHeader() {
        return this.acceptHeader;
    }

    public final int getColorDepth() {
        return this.colorDepth;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }
}
