package ru.dodopizza.backend.domain.loyalty.dto.mission;

import kotlin.Metadata;
/* compiled from: LoyaltyMissionAcceptRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionAcceptRequestDto;", "", "missionId", "", "isAccepted", "", "(Ljava/lang/String;Z)V", "()Z", "getMissionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyMissionAcceptRequestDto {
    @uca("accept")
    private final boolean isAccepted;
    @uca("id")
    private final String missionId;

    public LoyaltyMissionAcceptRequestDto(String str, boolean z) {
        z65.h(str, "missionId");
        this.missionId = str;
        this.isAccepted = z;
    }

    public static /* synthetic */ LoyaltyMissionAcceptRequestDto copy$default(LoyaltyMissionAcceptRequestDto loyaltyMissionAcceptRequestDto, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyMissionAcceptRequestDto.missionId;
        }
        if ((i & 2) != 0) {
            z = loyaltyMissionAcceptRequestDto.isAccepted;
        }
        return loyaltyMissionAcceptRequestDto.copy(str, z);
    }

    public final String component1() {
        return this.missionId;
    }

    public final boolean component2() {
        return this.isAccepted;
    }

    public final LoyaltyMissionAcceptRequestDto copy(String str, boolean z) {
        z65.h(str, "missionId");
        return new LoyaltyMissionAcceptRequestDto(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMissionAcceptRequestDto)) {
            return false;
        }
        LoyaltyMissionAcceptRequestDto loyaltyMissionAcceptRequestDto = (LoyaltyMissionAcceptRequestDto) obj;
        if (z65.c(this.missionId, loyaltyMissionAcceptRequestDto.missionId) && this.isAccepted == loyaltyMissionAcceptRequestDto.isAccepted) {
            return true;
        }
        return false;
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public int hashCode() {
        return (this.missionId.hashCode() * 31) + a91.a(this.isAccepted);
    }

    public final boolean isAccepted() {
        return this.isAccepted;
    }

    public String toString() {
        String str = this.missionId;
        boolean z = this.isAccepted;
        return "LoyaltyMissionAcceptRequestDto(missionId=" + str + ", isAccepted=" + z + ")";
    }
}
