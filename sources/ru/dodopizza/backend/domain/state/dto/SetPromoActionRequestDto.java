package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
/* compiled from: SetPromoActionRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/SetPromoActionRequestDto;", "", "stateId", "", "personalActionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getPersonalActionId", "()Ljava/lang/String;", "getStateId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetPromoActionRequestDto {
    @uca("personalActionId")
    private final String personalActionId;
    @uca("stateId")
    private final String stateId;

    public SetPromoActionRequestDto(String str, String str2) {
        z65.h(str, "stateId");
        z65.h(str2, "personalActionId");
        this.stateId = str;
        this.personalActionId = str2;
    }

    public static /* synthetic */ SetPromoActionRequestDto copy$default(SetPromoActionRequestDto setPromoActionRequestDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setPromoActionRequestDto.stateId;
        }
        if ((i & 2) != 0) {
            str2 = setPromoActionRequestDto.personalActionId;
        }
        return setPromoActionRequestDto.copy(str, str2);
    }

    public final String component1() {
        return this.stateId;
    }

    public final String component2() {
        return this.personalActionId;
    }

    public final SetPromoActionRequestDto copy(String str, String str2) {
        z65.h(str, "stateId");
        z65.h(str2, "personalActionId");
        return new SetPromoActionRequestDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPromoActionRequestDto)) {
            return false;
        }
        SetPromoActionRequestDto setPromoActionRequestDto = (SetPromoActionRequestDto) obj;
        if (z65.c(this.stateId, setPromoActionRequestDto.stateId) && z65.c(this.personalActionId, setPromoActionRequestDto.personalActionId)) {
            return true;
        }
        return false;
    }

    public final String getPersonalActionId() {
        return this.personalActionId;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return (this.stateId.hashCode() * 31) + this.personalActionId.hashCode();
    }

    public String toString() {
        String str = this.stateId;
        String str2 = this.personalActionId;
        return "SetPromoActionRequestDto(stateId=" + str + ", personalActionId=" + str2 + ")";
    }
}
