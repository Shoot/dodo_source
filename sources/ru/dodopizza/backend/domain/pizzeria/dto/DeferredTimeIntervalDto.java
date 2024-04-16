package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
/* compiled from: DeferredTimeIntervalDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/DeferredTimeIntervalDto;", "", "startDate", "", "endDate", "isOverloaded", "", "isDisabled", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getEndDate", "()Ljava/lang/String;", "()Z", "getStartDate", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredTimeIntervalDto {
    @uca("endDate")
    private final String endDate;
    @uca("disabled")
    private final boolean isDisabled;
    @uca("overloaded")
    private final boolean isOverloaded;
    @uca("startDate")
    private final String startDate;

    public DeferredTimeIntervalDto(String str, String str2, boolean z, boolean z2) {
        z65.h(str, "startDate");
        this.startDate = str;
        this.endDate = str2;
        this.isOverloaded = z;
        this.isDisabled = z2;
    }

    public static /* synthetic */ DeferredTimeIntervalDto copy$default(DeferredTimeIntervalDto deferredTimeIntervalDto, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deferredTimeIntervalDto.startDate;
        }
        if ((i & 2) != 0) {
            str2 = deferredTimeIntervalDto.endDate;
        }
        if ((i & 4) != 0) {
            z = deferredTimeIntervalDto.isOverloaded;
        }
        if ((i & 8) != 0) {
            z2 = deferredTimeIntervalDto.isDisabled;
        }
        return deferredTimeIntervalDto.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.startDate;
    }

    public final String component2() {
        return this.endDate;
    }

    public final boolean component3() {
        return this.isOverloaded;
    }

    public final boolean component4() {
        return this.isDisabled;
    }

    public final DeferredTimeIntervalDto copy(String str, String str2, boolean z, boolean z2) {
        z65.h(str, "startDate");
        return new DeferredTimeIntervalDto(str, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeferredTimeIntervalDto)) {
            return false;
        }
        DeferredTimeIntervalDto deferredTimeIntervalDto = (DeferredTimeIntervalDto) obj;
        if (z65.c(this.startDate, deferredTimeIntervalDto.startDate) && z65.c(this.endDate, deferredTimeIntervalDto.endDate) && this.isOverloaded == deferredTimeIntervalDto.isOverloaded && this.isDisabled == deferredTimeIntervalDto.isDisabled) {
            return true;
        }
        return false;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.startDate.hashCode() * 31;
        String str = this.endDate;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + a91.a(this.isOverloaded)) * 31) + a91.a(this.isDisabled);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final boolean isOverloaded() {
        return this.isOverloaded;
    }

    public String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        boolean z = this.isOverloaded;
        boolean z2 = this.isDisabled;
        return "DeferredTimeIntervalDto(startDate=" + str + ", endDate=" + str2 + ", isOverloaded=" + z + ", isDisabled=" + z2 + ")";
    }
}
