package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
/* compiled from: LocationIconsDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/LocationIconsDto;", "", "iconType", "", "lightThemeUrl", "", "darkThemeUrl", "(ILjava/lang/String;Ljava/lang/String;)V", "getDarkThemeUrl", "()Ljava/lang/String;", "getIconType", "()I", "getLightThemeUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocationIconsDto {
    @uca("darkThemeUrl")
    private final String darkThemeUrl;
    @uca("iconType")
    private final int iconType;
    @uca("lightThemeUrl")
    private final String lightThemeUrl;

    public LocationIconsDto(int i, String str, String str2) {
        z65.h(str, "lightThemeUrl");
        z65.h(str2, "darkThemeUrl");
        this.iconType = i;
        this.lightThemeUrl = str;
        this.darkThemeUrl = str2;
    }

    public static /* synthetic */ LocationIconsDto copy$default(LocationIconsDto locationIconsDto, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = locationIconsDto.iconType;
        }
        if ((i2 & 2) != 0) {
            str = locationIconsDto.lightThemeUrl;
        }
        if ((i2 & 4) != 0) {
            str2 = locationIconsDto.darkThemeUrl;
        }
        return locationIconsDto.copy(i, str, str2);
    }

    public final int component1() {
        return this.iconType;
    }

    public final String component2() {
        return this.lightThemeUrl;
    }

    public final String component3() {
        return this.darkThemeUrl;
    }

    public final LocationIconsDto copy(int i, String str, String str2) {
        z65.h(str, "lightThemeUrl");
        z65.h(str2, "darkThemeUrl");
        return new LocationIconsDto(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationIconsDto)) {
            return false;
        }
        LocationIconsDto locationIconsDto = (LocationIconsDto) obj;
        if (this.iconType == locationIconsDto.iconType && z65.c(this.lightThemeUrl, locationIconsDto.lightThemeUrl) && z65.c(this.darkThemeUrl, locationIconsDto.darkThemeUrl)) {
            return true;
        }
        return false;
    }

    public final String getDarkThemeUrl() {
        return this.darkThemeUrl;
    }

    public final int getIconType() {
        return this.iconType;
    }

    public final String getLightThemeUrl() {
        return this.lightThemeUrl;
    }

    public int hashCode() {
        return (((this.iconType * 31) + this.lightThemeUrl.hashCode()) * 31) + this.darkThemeUrl.hashCode();
    }

    public String toString() {
        int i = this.iconType;
        String str = this.lightThemeUrl;
        String str2 = this.darkThemeUrl;
        return "LocationIconsDto(iconType=" + i + ", lightThemeUrl=" + str + ", darkThemeUrl=" + str2 + ")";
    }
}
