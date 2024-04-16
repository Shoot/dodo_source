package ru.dodopizza.backend.domain.loyalty.dto.mission;

import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyMissionsInfoDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionsInfoDto;", "", "aboutMissionUrl", "", "missions", "", "Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getAboutMissionUrl", "()Ljava/lang/String;", "getMissions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyMissionsInfoDto {
    @uca("infoUrl")
    private final String aboutMissionUrl;
    @uca("missions")
    private final List<LoyaltyMissionDto> missions;

    public LoyaltyMissionsInfoDto(String str, List<LoyaltyMissionDto> list) {
        z65.h(str, "aboutMissionUrl");
        z65.h(list, "missions");
        this.aboutMissionUrl = str;
        this.missions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoyaltyMissionsInfoDto copy$default(LoyaltyMissionsInfoDto loyaltyMissionsInfoDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyMissionsInfoDto.aboutMissionUrl;
        }
        if ((i & 2) != 0) {
            list = loyaltyMissionsInfoDto.missions;
        }
        return loyaltyMissionsInfoDto.copy(str, list);
    }

    public final String component1() {
        return this.aboutMissionUrl;
    }

    public final List<LoyaltyMissionDto> component2() {
        return this.missions;
    }

    public final LoyaltyMissionsInfoDto copy(String str, List<LoyaltyMissionDto> list) {
        z65.h(str, "aboutMissionUrl");
        z65.h(list, "missions");
        return new LoyaltyMissionsInfoDto(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMissionsInfoDto)) {
            return false;
        }
        LoyaltyMissionsInfoDto loyaltyMissionsInfoDto = (LoyaltyMissionsInfoDto) obj;
        if (z65.c(this.aboutMissionUrl, loyaltyMissionsInfoDto.aboutMissionUrl) && z65.c(this.missions, loyaltyMissionsInfoDto.missions)) {
            return true;
        }
        return false;
    }

    public final String getAboutMissionUrl() {
        return this.aboutMissionUrl;
    }

    public final List<LoyaltyMissionDto> getMissions() {
        return this.missions;
    }

    public int hashCode() {
        return (this.aboutMissionUrl.hashCode() * 31) + this.missions.hashCode();
    }

    public String toString() {
        String str = this.aboutMissionUrl;
        List<LoyaltyMissionDto> list = this.missions;
        return "LoyaltyMissionsInfoDto(aboutMissionUrl=" + str + ", missions=" + list + ")";
    }
}
