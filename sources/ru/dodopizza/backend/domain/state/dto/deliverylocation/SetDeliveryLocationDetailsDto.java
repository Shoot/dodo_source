package ru.dodopizza.backend.domain.state.dto.deliverylocation;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: SetDeliveryLocationDetailsDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetDeliveryLocationDetailsDto;", "", "stateId", "", "additions", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAdditions", "()Ljava/util/Map;", "getStateId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetDeliveryLocationDetailsDto {
    @uca("additions")
    private final Map<String, String> additions;
    @uca("stateId")
    private final String stateId;

    public SetDeliveryLocationDetailsDto(String str, Map<String, String> map) {
        z65.h(str, "stateId");
        this.stateId = str;
        this.additions = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetDeliveryLocationDetailsDto copy$default(SetDeliveryLocationDetailsDto setDeliveryLocationDetailsDto, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setDeliveryLocationDetailsDto.stateId;
        }
        if ((i & 2) != 0) {
            map = setDeliveryLocationDetailsDto.additions;
        }
        return setDeliveryLocationDetailsDto.copy(str, map);
    }

    public final String component1() {
        return this.stateId;
    }

    public final Map<String, String> component2() {
        return this.additions;
    }

    public final SetDeliveryLocationDetailsDto copy(String str, Map<String, String> map) {
        z65.h(str, "stateId");
        return new SetDeliveryLocationDetailsDto(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDeliveryLocationDetailsDto)) {
            return false;
        }
        SetDeliveryLocationDetailsDto setDeliveryLocationDetailsDto = (SetDeliveryLocationDetailsDto) obj;
        if (z65.c(this.stateId, setDeliveryLocationDetailsDto.stateId) && z65.c(this.additions, setDeliveryLocationDetailsDto.additions)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAdditions() {
        return this.additions;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.stateId.hashCode() * 31;
        Map<String, String> map = this.additions;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.stateId;
        Map<String, String> map = this.additions;
        return "SetDeliveryLocationDetailsDto(stateId=" + str + ", additions=" + map + ")";
    }
}
