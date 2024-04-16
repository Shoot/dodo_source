package ru.dodopizza.backend.domain.authorization.dto;

import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: AuthorizeRequestDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lru/dodopizza/backend/domain/authorization/dto/AuthorizeRequestDto;", "", "phone", "", "pin", tmb.c.COUNTRY_JSON_NAME, "localityId", "appsFlyerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppsFlyerId", "()Ljava/lang/String;", "getCountry", "getLocalityId", "getPhone", "getPin", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthorizeRequestDto {
    @uca("AppsFlyerId")
    @mn3
    private final String appsFlyerId;
    @uca("Country")
    @mn3
    private final String country;
    @uca("LocalityId")
    @mn3
    private final String localityId;
    @uca("Phone")
    @mn3
    private final String phone;
    @uca("Password")
    @mn3
    private final String pin;

    public AuthorizeRequestDto(String str, String str2, String str3, String str4, String str5) {
        z65.h(str, "phone");
        z65.h(str2, "pin");
        z65.h(str3, tmb.c.COUNTRY_JSON_NAME);
        z65.h(str4, "localityId");
        z65.h(str5, "appsFlyerId");
        this.phone = str;
        this.pin = str2;
        this.country = str3;
        this.localityId = str4;
        this.appsFlyerId = str5;
    }

    public final String getAppsFlyerId() {
        return this.appsFlyerId;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPin() {
        return this.pin;
    }
}
