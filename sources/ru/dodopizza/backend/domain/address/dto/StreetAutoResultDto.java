package ru.dodopizza.backend.domain.address.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StreetAutoResultDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/address/dto/StreetAutoResultDto;", "", "wasSearchPerformed", "", "resultDto", "", "Lru/dodopizza/backend/domain/address/dto/StreetResultDto;", "(ZLjava/util/List;)V", "getResultDto", "()Ljava/util/List;", "setResultDto", "(Ljava/util/List;)V", "getWasSearchPerformed", "()Z", "setWasSearchPerformed", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StreetAutoResultDto {
    @uca("result")
    private List<StreetResultDto> resultDto;
    @uca("wasSearchPerformed")
    private boolean wasSearchPerformed;

    public StreetAutoResultDto() {
        this(false, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreetAutoResultDto copy$default(StreetAutoResultDto streetAutoResultDto, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = streetAutoResultDto.wasSearchPerformed;
        }
        if ((i & 2) != 0) {
            list = streetAutoResultDto.resultDto;
        }
        return streetAutoResultDto.copy(z, list);
    }

    public final boolean component1() {
        return this.wasSearchPerformed;
    }

    public final List<StreetResultDto> component2() {
        return this.resultDto;
    }

    public final StreetAutoResultDto copy(boolean z, List<StreetResultDto> list) {
        z65.h(list, "resultDto");
        return new StreetAutoResultDto(z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetAutoResultDto)) {
            return false;
        }
        StreetAutoResultDto streetAutoResultDto = (StreetAutoResultDto) obj;
        if (this.wasSearchPerformed == streetAutoResultDto.wasSearchPerformed && z65.c(this.resultDto, streetAutoResultDto.resultDto)) {
            return true;
        }
        return false;
    }

    public final List<StreetResultDto> getResultDto() {
        return this.resultDto;
    }

    public final boolean getWasSearchPerformed() {
        return this.wasSearchPerformed;
    }

    public int hashCode() {
        return (a91.a(this.wasSearchPerformed) * 31) + this.resultDto.hashCode();
    }

    public final void setResultDto(List<StreetResultDto> list) {
        z65.h(list, "<set-?>");
        this.resultDto = list;
    }

    public final void setWasSearchPerformed(boolean z) {
        this.wasSearchPerformed = z;
    }

    public String toString() {
        boolean z = this.wasSearchPerformed;
        List<StreetResultDto> list = this.resultDto;
        return "StreetAutoResultDto(wasSearchPerformed=" + z + ", resultDto=" + list + ")";
    }

    public StreetAutoResultDto(boolean z, List<StreetResultDto> list) {
        z65.h(list, "resultDto");
        this.wasSearchPerformed = z;
        this.resultDto = list;
    }

    public /* synthetic */ StreetAutoResultDto(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kc1.l() : list);
    }
}
