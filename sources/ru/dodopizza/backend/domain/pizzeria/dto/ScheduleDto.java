package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ScheduleDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006*"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;", "", "monday", "Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "(Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;)V", "getFriday", "()Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;", "setFriday", "(Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;)V", "getMonday", "setMonday", "getSaturday", "setSaturday", "getSunday", "setSunday", "getThursday", "setThursday", "getTuesday", "setTuesday", "getWednesday", "setWednesday", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScheduleDto {
    @uca("Friday")
    private DayOfWeekDto friday;
    @uca("Monday")
    private DayOfWeekDto monday;
    @uca("Saturday")
    private DayOfWeekDto saturday;
    @uca("Sunday")
    private DayOfWeekDto sunday;
    @uca("Thursday")
    private DayOfWeekDto thursday;
    @uca("Tuesday")
    private DayOfWeekDto tuesday;
    @uca("Wednesday")
    private DayOfWeekDto wednesday;

    public ScheduleDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ScheduleDto copy$default(ScheduleDto scheduleDto, DayOfWeekDto dayOfWeekDto, DayOfWeekDto dayOfWeekDto2, DayOfWeekDto dayOfWeekDto3, DayOfWeekDto dayOfWeekDto4, DayOfWeekDto dayOfWeekDto5, DayOfWeekDto dayOfWeekDto6, DayOfWeekDto dayOfWeekDto7, int i, Object obj) {
        if ((i & 1) != 0) {
            dayOfWeekDto = scheduleDto.monday;
        }
        if ((i & 2) != 0) {
            dayOfWeekDto2 = scheduleDto.tuesday;
        }
        DayOfWeekDto dayOfWeekDto8 = dayOfWeekDto2;
        if ((i & 4) != 0) {
            dayOfWeekDto3 = scheduleDto.wednesday;
        }
        DayOfWeekDto dayOfWeekDto9 = dayOfWeekDto3;
        if ((i & 8) != 0) {
            dayOfWeekDto4 = scheduleDto.thursday;
        }
        DayOfWeekDto dayOfWeekDto10 = dayOfWeekDto4;
        if ((i & 16) != 0) {
            dayOfWeekDto5 = scheduleDto.friday;
        }
        DayOfWeekDto dayOfWeekDto11 = dayOfWeekDto5;
        if ((i & 32) != 0) {
            dayOfWeekDto6 = scheduleDto.saturday;
        }
        DayOfWeekDto dayOfWeekDto12 = dayOfWeekDto6;
        if ((i & 64) != 0) {
            dayOfWeekDto7 = scheduleDto.sunday;
        }
        return scheduleDto.copy(dayOfWeekDto, dayOfWeekDto8, dayOfWeekDto9, dayOfWeekDto10, dayOfWeekDto11, dayOfWeekDto12, dayOfWeekDto7);
    }

    public final DayOfWeekDto component1() {
        return this.monday;
    }

    public final DayOfWeekDto component2() {
        return this.tuesday;
    }

    public final DayOfWeekDto component3() {
        return this.wednesday;
    }

    public final DayOfWeekDto component4() {
        return this.thursday;
    }

    public final DayOfWeekDto component5() {
        return this.friday;
    }

    public final DayOfWeekDto component6() {
        return this.saturday;
    }

    public final DayOfWeekDto component7() {
        return this.sunday;
    }

    public final ScheduleDto copy(DayOfWeekDto dayOfWeekDto, DayOfWeekDto dayOfWeekDto2, DayOfWeekDto dayOfWeekDto3, DayOfWeekDto dayOfWeekDto4, DayOfWeekDto dayOfWeekDto5, DayOfWeekDto dayOfWeekDto6, DayOfWeekDto dayOfWeekDto7) {
        return new ScheduleDto(dayOfWeekDto, dayOfWeekDto2, dayOfWeekDto3, dayOfWeekDto4, dayOfWeekDto5, dayOfWeekDto6, dayOfWeekDto7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleDto)) {
            return false;
        }
        ScheduleDto scheduleDto = (ScheduleDto) obj;
        if (z65.c(this.monday, scheduleDto.monday) && z65.c(this.tuesday, scheduleDto.tuesday) && z65.c(this.wednesday, scheduleDto.wednesday) && z65.c(this.thursday, scheduleDto.thursday) && z65.c(this.friday, scheduleDto.friday) && z65.c(this.saturday, scheduleDto.saturday) && z65.c(this.sunday, scheduleDto.sunday)) {
            return true;
        }
        return false;
    }

    public final DayOfWeekDto getFriday() {
        return this.friday;
    }

    public final DayOfWeekDto getMonday() {
        return this.monday;
    }

    public final DayOfWeekDto getSaturday() {
        return this.saturday;
    }

    public final DayOfWeekDto getSunday() {
        return this.sunday;
    }

    public final DayOfWeekDto getThursday() {
        return this.thursday;
    }

    public final DayOfWeekDto getTuesday() {
        return this.tuesday;
    }

    public final DayOfWeekDto getWednesday() {
        return this.wednesday;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        DayOfWeekDto dayOfWeekDto = this.monday;
        int i = 0;
        if (dayOfWeekDto == null) {
            hashCode = 0;
        } else {
            hashCode = dayOfWeekDto.hashCode();
        }
        int i2 = hashCode * 31;
        DayOfWeekDto dayOfWeekDto2 = this.tuesday;
        if (dayOfWeekDto2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = dayOfWeekDto2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        DayOfWeekDto dayOfWeekDto3 = this.wednesday;
        if (dayOfWeekDto3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dayOfWeekDto3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        DayOfWeekDto dayOfWeekDto4 = this.thursday;
        if (dayOfWeekDto4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = dayOfWeekDto4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        DayOfWeekDto dayOfWeekDto5 = this.friday;
        if (dayOfWeekDto5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = dayOfWeekDto5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        DayOfWeekDto dayOfWeekDto6 = this.saturday;
        if (dayOfWeekDto6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dayOfWeekDto6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        DayOfWeekDto dayOfWeekDto7 = this.sunday;
        if (dayOfWeekDto7 != null) {
            i = dayOfWeekDto7.hashCode();
        }
        return i7 + i;
    }

    public final void setFriday(DayOfWeekDto dayOfWeekDto) {
        this.friday = dayOfWeekDto;
    }

    public final void setMonday(DayOfWeekDto dayOfWeekDto) {
        this.monday = dayOfWeekDto;
    }

    public final void setSaturday(DayOfWeekDto dayOfWeekDto) {
        this.saturday = dayOfWeekDto;
    }

    public final void setSunday(DayOfWeekDto dayOfWeekDto) {
        this.sunday = dayOfWeekDto;
    }

    public final void setThursday(DayOfWeekDto dayOfWeekDto) {
        this.thursday = dayOfWeekDto;
    }

    public final void setTuesday(DayOfWeekDto dayOfWeekDto) {
        this.tuesday = dayOfWeekDto;
    }

    public final void setWednesday(DayOfWeekDto dayOfWeekDto) {
        this.wednesday = dayOfWeekDto;
    }

    public String toString() {
        DayOfWeekDto dayOfWeekDto = this.monday;
        DayOfWeekDto dayOfWeekDto2 = this.tuesday;
        DayOfWeekDto dayOfWeekDto3 = this.wednesday;
        DayOfWeekDto dayOfWeekDto4 = this.thursday;
        DayOfWeekDto dayOfWeekDto5 = this.friday;
        DayOfWeekDto dayOfWeekDto6 = this.saturday;
        DayOfWeekDto dayOfWeekDto7 = this.sunday;
        return "ScheduleDto(monday=" + dayOfWeekDto + ", tuesday=" + dayOfWeekDto2 + ", wednesday=" + dayOfWeekDto3 + ", thursday=" + dayOfWeekDto4 + ", friday=" + dayOfWeekDto5 + ", saturday=" + dayOfWeekDto6 + ", sunday=" + dayOfWeekDto7 + ")";
    }

    public ScheduleDto(DayOfWeekDto dayOfWeekDto, DayOfWeekDto dayOfWeekDto2, DayOfWeekDto dayOfWeekDto3, DayOfWeekDto dayOfWeekDto4, DayOfWeekDto dayOfWeekDto5, DayOfWeekDto dayOfWeekDto6, DayOfWeekDto dayOfWeekDto7) {
        this.monday = dayOfWeekDto;
        this.tuesday = dayOfWeekDto2;
        this.wednesday = dayOfWeekDto3;
        this.thursday = dayOfWeekDto4;
        this.friday = dayOfWeekDto5;
        this.saturday = dayOfWeekDto6;
        this.sunday = dayOfWeekDto7;
    }

    public /* synthetic */ ScheduleDto(DayOfWeekDto dayOfWeekDto, DayOfWeekDto dayOfWeekDto2, DayOfWeekDto dayOfWeekDto3, DayOfWeekDto dayOfWeekDto4, DayOfWeekDto dayOfWeekDto5, DayOfWeekDto dayOfWeekDto6, DayOfWeekDto dayOfWeekDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dayOfWeekDto, (i & 2) != 0 ? null : dayOfWeekDto2, (i & 4) != 0 ? null : dayOfWeekDto3, (i & 8) != 0 ? null : dayOfWeekDto4, (i & 16) != 0 ? null : dayOfWeekDto5, (i & 32) != 0 ? null : dayOfWeekDto6, (i & 64) != 0 ? null : dayOfWeekDto7);
    }
}
