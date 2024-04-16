package ru.dodopizza.backend.domain.cart.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleMeasureInfoDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;", "", "measure", "", "value", "", "(IF)V", "getMeasure", "()I", "getValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpsaleMeasureInfoDto {
    @uca("measure")
    private final int measure;
    @uca("value")
    private final float value;

    public UpsaleMeasureInfoDto() {
        this(0, 0.0f, 3, null);
    }

    public static /* synthetic */ UpsaleMeasureInfoDto copy$default(UpsaleMeasureInfoDto upsaleMeasureInfoDto, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = upsaleMeasureInfoDto.measure;
        }
        if ((i2 & 2) != 0) {
            f = upsaleMeasureInfoDto.value;
        }
        return upsaleMeasureInfoDto.copy(i, f);
    }

    public final int component1() {
        return this.measure;
    }

    public final float component2() {
        return this.value;
    }

    public final UpsaleMeasureInfoDto copy(int i, float f) {
        return new UpsaleMeasureInfoDto(i, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpsaleMeasureInfoDto)) {
            return false;
        }
        UpsaleMeasureInfoDto upsaleMeasureInfoDto = (UpsaleMeasureInfoDto) obj;
        if (this.measure == upsaleMeasureInfoDto.measure && Float.compare(this.value, upsaleMeasureInfoDto.value) == 0) {
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

    public String toString() {
        int i = this.measure;
        float f = this.value;
        return "UpsaleMeasureInfoDto(measure=" + i + ", value=" + f + ")";
    }

    public UpsaleMeasureInfoDto(int i, float f) {
        this.measure = i;
        this.value = f;
    }

    public /* synthetic */ UpsaleMeasureInfoDto(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }
}
