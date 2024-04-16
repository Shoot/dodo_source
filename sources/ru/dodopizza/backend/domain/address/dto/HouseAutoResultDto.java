package ru.dodopizza.backend.domain.address.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HouseAutoResultDto.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lru/dodopizza/backend/domain/address/dto/HouseAutoResultDto;", "", "wasSearchPerformed", "", "numbers", "", "", "(ZLjava/util/List;)V", "getNumbers", "()Ljava/util/List;", "setNumbers", "(Ljava/util/List;)V", "getWasSearchPerformed", "()Z", "setWasSearchPerformed", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HouseAutoResultDto {
    @uca("result")
    private List<String> numbers;
    @uca("wasSearchPerformed")
    private boolean wasSearchPerformed;

    public HouseAutoResultDto() {
        this(false, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HouseAutoResultDto copy$default(HouseAutoResultDto houseAutoResultDto, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = houseAutoResultDto.wasSearchPerformed;
        }
        if ((i & 2) != 0) {
            list = houseAutoResultDto.numbers;
        }
        return houseAutoResultDto.copy(z, list);
    }

    public final boolean component1() {
        return this.wasSearchPerformed;
    }

    public final List<String> component2() {
        return this.numbers;
    }

    public final HouseAutoResultDto copy(boolean z, List<String> list) {
        z65.h(list, "numbers");
        return new HouseAutoResultDto(z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HouseAutoResultDto)) {
            return false;
        }
        HouseAutoResultDto houseAutoResultDto = (HouseAutoResultDto) obj;
        if (this.wasSearchPerformed == houseAutoResultDto.wasSearchPerformed && z65.c(this.numbers, houseAutoResultDto.numbers)) {
            return true;
        }
        return false;
    }

    public final List<String> getNumbers() {
        return this.numbers;
    }

    public final boolean getWasSearchPerformed() {
        return this.wasSearchPerformed;
    }

    public int hashCode() {
        return (a91.a(this.wasSearchPerformed) * 31) + this.numbers.hashCode();
    }

    public final void setNumbers(List<String> list) {
        z65.h(list, "<set-?>");
        this.numbers = list;
    }

    public final void setWasSearchPerformed(boolean z) {
        this.wasSearchPerformed = z;
    }

    public String toString() {
        boolean z = this.wasSearchPerformed;
        List<String> list = this.numbers;
        return "HouseAutoResultDto(wasSearchPerformed=" + z + ", numbers=" + list + ")";
    }

    public HouseAutoResultDto(boolean z, List<String> list) {
        z65.h(list, "numbers");
        this.wasSearchPerformed = z;
        this.numbers = list;
    }

    public /* synthetic */ HouseAutoResultDto(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kc1.l() : list);
    }
}
