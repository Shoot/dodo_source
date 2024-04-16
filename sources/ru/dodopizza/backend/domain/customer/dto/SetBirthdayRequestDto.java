package ru.dodopizza.backend.domain.customer.dto;

import kotlin.Metadata;
/* compiled from: SetBirthdayRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/SetBirthdayRequestDto;", "", "day", "", "month", "year", "(III)V", "getDay", "()I", "getMonth", "getYear", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetBirthdayRequestDto {
    @uca("Day")
    private final int day;
    @uca("Month")
    private final int month;
    @uca("year")
    private final int year;

    public SetBirthdayRequestDto(int i, int i2, int i3) {
        this.day = i;
        this.month = i2;
        this.year = i3;
    }

    public static /* synthetic */ SetBirthdayRequestDto copy$default(SetBirthdayRequestDto setBirthdayRequestDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = setBirthdayRequestDto.day;
        }
        if ((i4 & 2) != 0) {
            i2 = setBirthdayRequestDto.month;
        }
        if ((i4 & 4) != 0) {
            i3 = setBirthdayRequestDto.year;
        }
        return setBirthdayRequestDto.copy(i, i2, i3);
    }

    public final int component1() {
        return this.day;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.year;
    }

    public final SetBirthdayRequestDto copy(int i, int i2, int i3) {
        return new SetBirthdayRequestDto(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetBirthdayRequestDto)) {
            return false;
        }
        SetBirthdayRequestDto setBirthdayRequestDto = (SetBirthdayRequestDto) obj;
        if (this.day == setBirthdayRequestDto.day && this.month == setBirthdayRequestDto.month && this.year == setBirthdayRequestDto.year) {
            return true;
        }
        return false;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((this.day * 31) + this.month) * 31) + this.year;
    }

    public String toString() {
        int i = this.day;
        int i2 = this.month;
        int i3 = this.year;
        return "SetBirthdayRequestDto(day=" + i + ", month=" + i2 + ", year=" + i3 + ")";
    }
}
