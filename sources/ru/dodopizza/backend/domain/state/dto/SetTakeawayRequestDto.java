package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
/* compiled from: SetTakeawayRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/SetTakeawayRequestDto;", "", "stateId", "", "isTakeaway", "", "(Ljava/lang/String;Z)V", "()Z", "getStateId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetTakeawayRequestDto {
    @uca("isTakeaway")
    private final boolean isTakeaway;
    @uca("stateId")
    private final String stateId;

    public SetTakeawayRequestDto(String str, boolean z) {
        z65.h(str, "stateId");
        this.stateId = str;
        this.isTakeaway = z;
    }

    public static /* synthetic */ SetTakeawayRequestDto copy$default(SetTakeawayRequestDto setTakeawayRequestDto, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setTakeawayRequestDto.stateId;
        }
        if ((i & 2) != 0) {
            z = setTakeawayRequestDto.isTakeaway;
        }
        return setTakeawayRequestDto.copy(str, z);
    }

    public final String component1() {
        return this.stateId;
    }

    public final boolean component2() {
        return this.isTakeaway;
    }

    public final SetTakeawayRequestDto copy(String str, boolean z) {
        z65.h(str, "stateId");
        return new SetTakeawayRequestDto(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetTakeawayRequestDto)) {
            return false;
        }
        SetTakeawayRequestDto setTakeawayRequestDto = (SetTakeawayRequestDto) obj;
        if (z65.c(this.stateId, setTakeawayRequestDto.stateId) && this.isTakeaway == setTakeawayRequestDto.isTakeaway) {
            return true;
        }
        return false;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return (this.stateId.hashCode() * 31) + a91.a(this.isTakeaway);
    }

    public final boolean isTakeaway() {
        return this.isTakeaway;
    }

    public String toString() {
        String str = this.stateId;
        boolean z = this.isTakeaway;
        return "SetTakeawayRequestDto(stateId=" + str + ", isTakeaway=" + z + ")";
    }
}
