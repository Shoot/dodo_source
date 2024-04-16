package ru.dodopizza.backend.domain.orderhistory.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MeasureInfoDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/dodopizza/backend/domain/orderhistory/dto/MeasureInfoDto;", "", "measure", "", "value", "", "(IF)V", "getMeasure", "()I", "setMeasure", "(I)V", "getValue", "()F", "setValue", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MeasureInfoDto {
    @uca("unit")
    private int measure;
    @uca("value")
    private float value;

    public MeasureInfoDto() {
        this(0, 0.0f, 3, null);
    }

    public static /* synthetic */ MeasureInfoDto copy$default(MeasureInfoDto measureInfoDto, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = measureInfoDto.measure;
        }
        if ((i2 & 2) != 0) {
            f = measureInfoDto.value;
        }
        return measureInfoDto.copy(i, f);
    }

    public final int component1() {
        return this.measure;
    }

    public final float component2() {
        return this.value;
    }

    public final MeasureInfoDto copy(int i, float f) {
        return new MeasureInfoDto(i, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeasureInfoDto)) {
            return false;
        }
        MeasureInfoDto measureInfoDto = (MeasureInfoDto) obj;
        if (this.measure == measureInfoDto.measure && Float.compare(this.value, measureInfoDto.value) == 0) {
            return true;
        }
        return false;
    }

    public final int getMeasure() {
        return this.measure;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.measure * 31) + Float.floatToIntBits(this.value);
    }

    public final void setMeasure(int i) {
        this.measure = i;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    public String toString() {
        int i = this.measure;
        float f = this.value;
        return "MeasureInfoDto(measure=" + i + ", value=" + f + ")";
    }

    public MeasureInfoDto(int i, float f) {
        this.measure = i;
        this.value = f;
    }

    public /* synthetic */ MeasureInfoDto(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MIN_VALUE : i, (i2 & 2) != 0 ? 0.0f : f);
    }
}
