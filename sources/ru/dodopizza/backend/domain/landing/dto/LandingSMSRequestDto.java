package ru.dodopizza.backend.domain.landing.dto;

import kotlin.Metadata;
/* compiled from: LandingSMSRequestDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/dodopizza/backend/domain/landing/dto/LandingSMSRequestDto;", "", "phone", "", "pinCode", "localityUuid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLocalityUuid", "()Ljava/lang/String;", "getPhone", "getPinCode", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingSMSRequestDto {
    @uca("LocalityUUId")
    private final String localityUuid;
    @uca("Phone")
    private final String phone;
    @uca("PinCode")
    private final String pinCode;

    public LandingSMSRequestDto(String str, String str2, String str3) {
        z65.h(str, "phone");
        z65.h(str2, "pinCode");
        z65.h(str3, "localityUuid");
        this.phone = str;
        this.pinCode = str2;
        this.localityUuid = str3;
    }

    public final String getLocalityUuid() {
        return this.localityUuid;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPinCode() {
        return this.pinCode;
    }
}
