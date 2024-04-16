package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
/* compiled from: PrizotekaLevelDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/PrizotekaLevelDto;", "", "minCartValue", "", "progressDescription", "", "giftDescription", "(DLjava/lang/String;Ljava/lang/String;)V", "getGiftDescription", "()Ljava/lang/String;", "getMinCartValue", "()D", "getProgressDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PrizotekaLevelDto {
    @uca("giftDescription")
    private final String giftDescription;
    @uca("minCartValue")
    private final double minCartValue;
    @uca("progressDescription")
    private final String progressDescription;

    public PrizotekaLevelDto(double d, String str, String str2) {
        z65.h(str, "progressDescription");
        z65.h(str2, "giftDescription");
        this.minCartValue = d;
        this.progressDescription = str;
        this.giftDescription = str2;
    }

    public static /* synthetic */ PrizotekaLevelDto copy$default(PrizotekaLevelDto prizotekaLevelDto, double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = prizotekaLevelDto.minCartValue;
        }
        if ((i & 2) != 0) {
            str = prizotekaLevelDto.progressDescription;
        }
        if ((i & 4) != 0) {
            str2 = prizotekaLevelDto.giftDescription;
        }
        return prizotekaLevelDto.copy(d, str, str2);
    }

    public final double component1() {
        return this.minCartValue;
    }

    public final String component2() {
        return this.progressDescription;
    }

    public final String component3() {
        return this.giftDescription;
    }

    public final PrizotekaLevelDto copy(double d, String str, String str2) {
        z65.h(str, "progressDescription");
        z65.h(str2, "giftDescription");
        return new PrizotekaLevelDto(d, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrizotekaLevelDto)) {
            return false;
        }
        PrizotekaLevelDto prizotekaLevelDto = (PrizotekaLevelDto) obj;
        if (Double.compare(this.minCartValue, prizotekaLevelDto.minCartValue) == 0 && z65.c(this.progressDescription, prizotekaLevelDto.progressDescription) && z65.c(this.giftDescription, prizotekaLevelDto.giftDescription)) {
            return true;
        }
        return false;
    }

    public final String getGiftDescription() {
        return this.giftDescription;
    }

    public final double getMinCartValue() {
        return this.minCartValue;
    }

    public final String getProgressDescription() {
        return this.progressDescription;
    }

    public int hashCode() {
        return (((nkb.a(this.minCartValue) * 31) + this.progressDescription.hashCode()) * 31) + this.giftDescription.hashCode();
    }

    public String toString() {
        double d = this.minCartValue;
        String str = this.progressDescription;
        String str2 = this.giftDescription;
        return "PrizotekaLevelDto(minCartValue=" + d + ", progressDescription=" + str + ", giftDescription=" + str2 + ")";
    }
}
