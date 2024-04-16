package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
/* compiled from: SetDeliveryTableNumberRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/SetDeliveryTableNumberRequestDto;", "", "stateId", "", "tableNumber", "", "(Ljava/lang/String;I)V", "getStateId", "()Ljava/lang/String;", "getTableNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetDeliveryTableNumberRequestDto {
    @uca("stateId")
    private final String stateId;
    @uca("tableNumber")
    private final int tableNumber;

    public SetDeliveryTableNumberRequestDto(String str, int i) {
        z65.h(str, "stateId");
        this.stateId = str;
        this.tableNumber = i;
    }

    public static /* synthetic */ SetDeliveryTableNumberRequestDto copy$default(SetDeliveryTableNumberRequestDto setDeliveryTableNumberRequestDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = setDeliveryTableNumberRequestDto.stateId;
        }
        if ((i2 & 2) != 0) {
            i = setDeliveryTableNumberRequestDto.tableNumber;
        }
        return setDeliveryTableNumberRequestDto.copy(str, i);
    }

    public final String component1() {
        return this.stateId;
    }

    public final int component2() {
        return this.tableNumber;
    }

    public final SetDeliveryTableNumberRequestDto copy(String str, int i) {
        z65.h(str, "stateId");
        return new SetDeliveryTableNumberRequestDto(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDeliveryTableNumberRequestDto)) {
            return false;
        }
        SetDeliveryTableNumberRequestDto setDeliveryTableNumberRequestDto = (SetDeliveryTableNumberRequestDto) obj;
        if (z65.c(this.stateId, setDeliveryTableNumberRequestDto.stateId) && this.tableNumber == setDeliveryTableNumberRequestDto.tableNumber) {
            return true;
        }
        return false;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final int getTableNumber() {
        return this.tableNumber;
    }

    public int hashCode() {
        return (this.stateId.hashCode() * 31) + this.tableNumber;
    }

    public String toString() {
        String str = this.stateId;
        int i = this.tableNumber;
        return "SetDeliveryTableNumberRequestDto(stateId=" + str + ", tableNumber=" + i + ")";
    }
}
