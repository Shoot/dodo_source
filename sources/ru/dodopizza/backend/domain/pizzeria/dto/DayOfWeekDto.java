package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DayOfWeekDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;", "", "openLocalTimeSpan", "", "closeLocalTimeSpan", "isFullDay", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCloseLocalTimeSpan", "()Ljava/lang/String;", "setCloseLocalTimeSpan", "(Ljava/lang/String;)V", "()Z", "setFullDay", "(Z)V", "getOpenLocalTimeSpan", "setOpenLocalTimeSpan", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DayOfWeekDto {
    @uca("closeLocalTimeSpan")
    private String closeLocalTimeSpan;
    @uca("isFullDay")
    private boolean isFullDay;
    @uca("openLocalTimeSpan")
    private String openLocalTimeSpan;

    public DayOfWeekDto() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ DayOfWeekDto copy$default(DayOfWeekDto dayOfWeekDto, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dayOfWeekDto.openLocalTimeSpan;
        }
        if ((i & 2) != 0) {
            str2 = dayOfWeekDto.closeLocalTimeSpan;
        }
        if ((i & 4) != 0) {
            z = dayOfWeekDto.isFullDay;
        }
        return dayOfWeekDto.copy(str, str2, z);
    }

    public final String component1() {
        return this.openLocalTimeSpan;
    }

    public final String component2() {
        return this.closeLocalTimeSpan;
    }

    public final boolean component3() {
        return this.isFullDay;
    }

    public final DayOfWeekDto copy(String str, String str2, boolean z) {
        return new DayOfWeekDto(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayOfWeekDto)) {
            return false;
        }
        DayOfWeekDto dayOfWeekDto = (DayOfWeekDto) obj;
        if (z65.c(this.openLocalTimeSpan, dayOfWeekDto.openLocalTimeSpan) && z65.c(this.closeLocalTimeSpan, dayOfWeekDto.closeLocalTimeSpan) && this.isFullDay == dayOfWeekDto.isFullDay) {
            return true;
        }
        return false;
    }

    public final String getCloseLocalTimeSpan() {
        return this.closeLocalTimeSpan;
    }

    public final String getOpenLocalTimeSpan() {
        return this.openLocalTimeSpan;
    }

    public int hashCode() {
        int hashCode;
        String str = this.openLocalTimeSpan;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.closeLocalTimeSpan;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i2 + i) * 31) + a91.a(this.isFullDay);
    }

    public final boolean isFullDay() {
        return this.isFullDay;
    }

    public final void setCloseLocalTimeSpan(String str) {
        this.closeLocalTimeSpan = str;
    }

    public final void setFullDay(boolean z) {
        this.isFullDay = z;
    }

    public final void setOpenLocalTimeSpan(String str) {
        this.openLocalTimeSpan = str;
    }

    public String toString() {
        String str = this.openLocalTimeSpan;
        String str2 = this.closeLocalTimeSpan;
        boolean z = this.isFullDay;
        return "DayOfWeekDto(openLocalTimeSpan=" + str + ", closeLocalTimeSpan=" + str2 + ", isFullDay=" + z + ")";
    }

    public DayOfWeekDto(String str, String str2, boolean z) {
        this.openLocalTimeSpan = str;
        this.closeLocalTimeSpan = str2;
        this.isFullDay = z;
    }

    public /* synthetic */ DayOfWeekDto(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
