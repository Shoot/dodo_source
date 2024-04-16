package ru.dodopizza.backend.domain.address.dto;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StreetResultDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/dodopizza/backend/domain/address/dto/StreetResultDto;", "", "id", "", Action.NAME_ATTRIBUTE, "shortName", "hasHouseFilter", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getHasHouseFilter", "()Z", "setHasHouseFilter", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getShortName", "setShortName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StreetResultDto {
    @uca("hasHouseFilter")
    private boolean hasHouseFilter;
    @uca("id")
    private String id;
    @uca(Action.NAME_ATTRIBUTE)
    private String name;
    @uca("shortName")
    private String shortName;

    public StreetResultDto() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ StreetResultDto copy$default(StreetResultDto streetResultDto, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streetResultDto.id;
        }
        if ((i & 2) != 0) {
            str2 = streetResultDto.name;
        }
        if ((i & 4) != 0) {
            str3 = streetResultDto.shortName;
        }
        if ((i & 8) != 0) {
            z = streetResultDto.hasHouseFilter;
        }
        return streetResultDto.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.shortName;
    }

    public final boolean component4() {
        return this.hasHouseFilter;
    }

    public final StreetResultDto copy(String str, String str2, String str3, boolean z) {
        return new StreetResultDto(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetResultDto)) {
            return false;
        }
        StreetResultDto streetResultDto = (StreetResultDto) obj;
        if (z65.c(this.id, streetResultDto.id) && z65.c(this.name, streetResultDto.name) && z65.c(this.shortName, streetResultDto.shortName) && this.hasHouseFilter == streetResultDto.hasHouseFilter) {
            return true;
        }
        return false;
    }

    public final boolean getHasHouseFilter() {
        return this.hasHouseFilter;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.shortName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i3 + i) * 31) + a91.a(this.hasHouseFilter);
    }

    public final void setHasHouseFilter(boolean z) {
        this.hasHouseFilter = z;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setShortName(String str) {
        this.shortName = str;
    }

    public String toString() {
        String str = this.name;
        boolean z = this.hasHouseFilter;
        return str + ", " + z;
    }

    public StreetResultDto(String str, String str2, String str3, boolean z) {
        this.id = str;
        this.name = str2;
        this.shortName = str3;
        this.hasHouseFilter = z;
    }

    public /* synthetic */ StreetResultDto(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }
}
