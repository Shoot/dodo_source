package ru.dodopizza.backend.domain.state.dto.deliverylocation;

import kotlin.Metadata;
/* compiled from: SetClientDeliveryLocationDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetClientDeliveryLocationDto;", "", "stateId", "", "clientDeliveryLocationId", "setDeliveryLocationDto", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetDeliveryLocationDto;", "setDeliveryOrderType", "", "(Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetDeliveryLocationDto;Z)V", "getClientDeliveryLocationId", "()Ljava/lang/String;", "getSetDeliveryLocationDto", "()Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetDeliveryLocationDto;", "getSetDeliveryOrderType", "()Z", "getStateId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetClientDeliveryLocationDto {
    @uca("clientDeliveryLocationId")
    private final String clientDeliveryLocationId;
    @uca("deliveryLocation")
    private final SetDeliveryLocationDto setDeliveryLocationDto;
    @uca("setDeliveryOrderType")
    private final boolean setDeliveryOrderType;
    @uca("stateId")
    private final String stateId;

    public SetClientDeliveryLocationDto(String str, String str2, SetDeliveryLocationDto setDeliveryLocationDto, boolean z) {
        z65.h(str, "stateId");
        z65.h(str2, "clientDeliveryLocationId");
        z65.h(setDeliveryLocationDto, "setDeliveryLocationDto");
        this.stateId = str;
        this.clientDeliveryLocationId = str2;
        this.setDeliveryLocationDto = setDeliveryLocationDto;
        this.setDeliveryOrderType = z;
    }

    public static /* synthetic */ SetClientDeliveryLocationDto copy$default(SetClientDeliveryLocationDto setClientDeliveryLocationDto, String str, String str2, SetDeliveryLocationDto setDeliveryLocationDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setClientDeliveryLocationDto.stateId;
        }
        if ((i & 2) != 0) {
            str2 = setClientDeliveryLocationDto.clientDeliveryLocationId;
        }
        if ((i & 4) != 0) {
            setDeliveryLocationDto = setClientDeliveryLocationDto.setDeliveryLocationDto;
        }
        if ((i & 8) != 0) {
            z = setClientDeliveryLocationDto.setDeliveryOrderType;
        }
        return setClientDeliveryLocationDto.copy(str, str2, setDeliveryLocationDto, z);
    }

    public final String component1() {
        return this.stateId;
    }

    public final String component2() {
        return this.clientDeliveryLocationId;
    }

    public final SetDeliveryLocationDto component3() {
        return this.setDeliveryLocationDto;
    }

    public final boolean component4() {
        return this.setDeliveryOrderType;
    }

    public final SetClientDeliveryLocationDto copy(String str, String str2, SetDeliveryLocationDto setDeliveryLocationDto, boolean z) {
        z65.h(str, "stateId");
        z65.h(str2, "clientDeliveryLocationId");
        z65.h(setDeliveryLocationDto, "setDeliveryLocationDto");
        return new SetClientDeliveryLocationDto(str, str2, setDeliveryLocationDto, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetClientDeliveryLocationDto)) {
            return false;
        }
        SetClientDeliveryLocationDto setClientDeliveryLocationDto = (SetClientDeliveryLocationDto) obj;
        if (z65.c(this.stateId, setClientDeliveryLocationDto.stateId) && z65.c(this.clientDeliveryLocationId, setClientDeliveryLocationDto.clientDeliveryLocationId) && z65.c(this.setDeliveryLocationDto, setClientDeliveryLocationDto.setDeliveryLocationDto) && this.setDeliveryOrderType == setClientDeliveryLocationDto.setDeliveryOrderType) {
            return true;
        }
        return false;
    }

    public final String getClientDeliveryLocationId() {
        return this.clientDeliveryLocationId;
    }

    public final SetDeliveryLocationDto getSetDeliveryLocationDto() {
        return this.setDeliveryLocationDto;
    }

    public final boolean getSetDeliveryOrderType() {
        return this.setDeliveryOrderType;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return (((((this.stateId.hashCode() * 31) + this.clientDeliveryLocationId.hashCode()) * 31) + this.setDeliveryLocationDto.hashCode()) * 31) + a91.a(this.setDeliveryOrderType);
    }

    public String toString() {
        String str = this.stateId;
        String str2 = this.clientDeliveryLocationId;
        SetDeliveryLocationDto setDeliveryLocationDto = this.setDeliveryLocationDto;
        boolean z = this.setDeliveryOrderType;
        return "SetClientDeliveryLocationDto(stateId=" + str + ", clientDeliveryLocationId=" + str2 + ", setDeliveryLocationDto=" + setDeliveryLocationDto + ", setDeliveryOrderType=" + z + ")";
    }
}
