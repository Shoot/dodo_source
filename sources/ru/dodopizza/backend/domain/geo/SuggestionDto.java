package ru.dodopizza.backend.domain.geo;

import kotlin.Metadata;
/* compiled from: SuggestionDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/geo/SuggestionDto;", "", "address", "", "addressId", "mainText", "secondaryText", "distanceToUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAddress", "()Ljava/lang/String;", "getAddressId", "getDistanceToUser", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMainText", "getSecondaryText", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/dodopizza/backend/domain/geo/SuggestionDto;", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestionDto {
    @uca("addressString")
    private final String address;
    @uca("addressId")
    private final String addressId;
    @uca("distanceToUser")
    private final Integer distanceToUser;
    @uca("mainText")
    private final String mainText;
    @uca("secondaryText")
    private final String secondaryText;

    public SuggestionDto(String str, String str2, String str3, String str4, Integer num) {
        z65.h(str, "address");
        z65.h(str2, "addressId");
        z65.h(str3, "mainText");
        z65.h(str4, "secondaryText");
        this.address = str;
        this.addressId = str2;
        this.mainText = str3;
        this.secondaryText = str4;
        this.distanceToUser = num;
    }

    public static /* synthetic */ SuggestionDto copy$default(SuggestionDto suggestionDto, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestionDto.address;
        }
        if ((i & 2) != 0) {
            str2 = suggestionDto.addressId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = suggestionDto.mainText;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = suggestionDto.secondaryText;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            num = suggestionDto.distanceToUser;
        }
        return suggestionDto.copy(str, str5, str6, str7, num);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.addressId;
    }

    public final String component3() {
        return this.mainText;
    }

    public final String component4() {
        return this.secondaryText;
    }

    public final Integer component5() {
        return this.distanceToUser;
    }

    public final SuggestionDto copy(String str, String str2, String str3, String str4, Integer num) {
        z65.h(str, "address");
        z65.h(str2, "addressId");
        z65.h(str3, "mainText");
        z65.h(str4, "secondaryText");
        return new SuggestionDto(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestionDto)) {
            return false;
        }
        SuggestionDto suggestionDto = (SuggestionDto) obj;
        if (z65.c(this.address, suggestionDto.address) && z65.c(this.addressId, suggestionDto.addressId) && z65.c(this.mainText, suggestionDto.mainText) && z65.c(this.secondaryText, suggestionDto.secondaryText) && z65.c(this.distanceToUser, suggestionDto.distanceToUser)) {
            return true;
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public final Integer getDistanceToUser() {
        return this.distanceToUser;
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.address.hashCode() * 31) + this.addressId.hashCode()) * 31) + this.mainText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31;
        Integer num = this.distanceToUser;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.address;
        String str2 = this.addressId;
        String str3 = this.mainText;
        String str4 = this.secondaryText;
        Integer num = this.distanceToUser;
        return "SuggestionDto(address=" + str + ", addressId=" + str2 + ", mainText=" + str3 + ", secondaryText=" + str4 + ", distanceToUser=" + num + ")";
    }
}
