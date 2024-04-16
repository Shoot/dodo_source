package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriaAddressInfoDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaAddressInfoDto;", "", "fullAddress", "", "shortAddress", "localityName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFullAddress", "()Ljava/lang/String;", "setFullAddress", "(Ljava/lang/String;)V", "getLocalityName", "setLocalityName", "getShortAddress", "setShortAddress", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PizzeriaAddressInfoDto {
    @uca("fullAddress")
    private String fullAddress;
    @uca("localityName")
    private String localityName;
    @uca("shortAddress")
    private String shortAddress;

    public PizzeriaAddressInfoDto() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PizzeriaAddressInfoDto copy$default(PizzeriaAddressInfoDto pizzeriaAddressInfoDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pizzeriaAddressInfoDto.fullAddress;
        }
        if ((i & 2) != 0) {
            str2 = pizzeriaAddressInfoDto.shortAddress;
        }
        if ((i & 4) != 0) {
            str3 = pizzeriaAddressInfoDto.localityName;
        }
        return pizzeriaAddressInfoDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.fullAddress;
    }

    public final String component2() {
        return this.shortAddress;
    }

    public final String component3() {
        return this.localityName;
    }

    public final PizzeriaAddressInfoDto copy(String str, String str2, String str3) {
        return new PizzeriaAddressInfoDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PizzeriaAddressInfoDto)) {
            return false;
        }
        PizzeriaAddressInfoDto pizzeriaAddressInfoDto = (PizzeriaAddressInfoDto) obj;
        if (z65.c(this.fullAddress, pizzeriaAddressInfoDto.fullAddress) && z65.c(this.shortAddress, pizzeriaAddressInfoDto.shortAddress) && z65.c(this.localityName, pizzeriaAddressInfoDto.localityName)) {
            return true;
        }
        return false;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final String getLocalityName() {
        return this.localityName;
    }

    public final String getShortAddress() {
        return this.shortAddress;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.fullAddress;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.shortAddress;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.localityName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final void setFullAddress(String str) {
        this.fullAddress = str;
    }

    public final void setLocalityName(String str) {
        this.localityName = str;
    }

    public final void setShortAddress(String str) {
        this.shortAddress = str;
    }

    public String toString() {
        String str = this.fullAddress;
        String str2 = this.shortAddress;
        String str3 = this.localityName;
        return "PizzeriaAddressInfoDto(fullAddress=" + str + ", shortAddress=" + str2 + ", localityName=" + str3 + ")";
    }

    public PizzeriaAddressInfoDto(String str, String str2, String str3) {
        this.fullAddress = str;
        this.shortAddress = str2;
        this.localityName = str3;
    }

    public /* synthetic */ PizzeriaAddressInfoDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
