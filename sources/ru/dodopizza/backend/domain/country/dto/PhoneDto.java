package ru.dodopizza.backend.domain.country.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PhoneDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/PhoneDto;", "", "mask", "", "internationalCode", "localCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "code", "getCode", "()Ljava/lang/String;", "getInternationalCode", "getLocalCode", "getMask", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PhoneDto {
    @uca("code")
    private final String internationalCode;
    @uca("localCode")
    private final String localCode;
    @uca("mask")
    private final String mask;

    public PhoneDto() {
        this(null, null, null, 7, null);
    }

    public final String getCode() {
        if (z65.c(this.internationalCode, "+4")) {
            return "+40";
        }
        return this.internationalCode;
    }

    public final String getInternationalCode() {
        return this.internationalCode;
    }

    public final String getLocalCode() {
        return this.localCode;
    }

    public final String getMask() {
        return this.mask;
    }

    public PhoneDto(String str, String str2, String str3) {
        this.mask = str;
        this.internationalCode = str2;
        this.localCode = str3;
    }

    public /* synthetic */ PhoneDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
