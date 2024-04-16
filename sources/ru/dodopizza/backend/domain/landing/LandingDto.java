package ru.dodopizza.backend.domain.landing;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: LandingDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/landing/LandingDto;", "", "landingContent", "Lru/dodopizza/backend/domain/landing/LandingContentDto;", "landingLocalityInfo", "Lru/dodopizza/backend/domain/landing/LandingLocalityInfoDto;", "(Lru/dodopizza/backend/domain/landing/LandingContentDto;Lru/dodopizza/backend/domain/landing/LandingLocalityInfoDto;)V", "getLandingContent", "()Lru/dodopizza/backend/domain/landing/LandingContentDto;", "getLandingLocalityInfo", "()Lru/dodopizza/backend/domain/landing/LandingLocalityInfoDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingDto {
    @uca(RemoteMessageConst.Notification.CONTENT)
    private final LandingContentDto landingContent;
    @uca("locality")
    private final LandingLocalityInfoDto landingLocalityInfo;

    public LandingDto(LandingContentDto landingContentDto, LandingLocalityInfoDto landingLocalityInfoDto) {
        z65.h(landingContentDto, "landingContent");
        z65.h(landingLocalityInfoDto, "landingLocalityInfo");
        this.landingContent = landingContentDto;
        this.landingLocalityInfo = landingLocalityInfoDto;
    }

    public static /* synthetic */ LandingDto copy$default(LandingDto landingDto, LandingContentDto landingContentDto, LandingLocalityInfoDto landingLocalityInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            landingContentDto = landingDto.landingContent;
        }
        if ((i & 2) != 0) {
            landingLocalityInfoDto = landingDto.landingLocalityInfo;
        }
        return landingDto.copy(landingContentDto, landingLocalityInfoDto);
    }

    public final LandingContentDto component1() {
        return this.landingContent;
    }

    public final LandingLocalityInfoDto component2() {
        return this.landingLocalityInfo;
    }

    public final LandingDto copy(LandingContentDto landingContentDto, LandingLocalityInfoDto landingLocalityInfoDto) {
        z65.h(landingContentDto, "landingContent");
        z65.h(landingLocalityInfoDto, "landingLocalityInfo");
        return new LandingDto(landingContentDto, landingLocalityInfoDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingDto)) {
            return false;
        }
        LandingDto landingDto = (LandingDto) obj;
        if (z65.c(this.landingContent, landingDto.landingContent) && z65.c(this.landingLocalityInfo, landingDto.landingLocalityInfo)) {
            return true;
        }
        return false;
    }

    public final LandingContentDto getLandingContent() {
        return this.landingContent;
    }

    public final LandingLocalityInfoDto getLandingLocalityInfo() {
        return this.landingLocalityInfo;
    }

    public int hashCode() {
        return (this.landingContent.hashCode() * 31) + this.landingLocalityInfo.hashCode();
    }

    public String toString() {
        LandingContentDto landingContentDto = this.landingContent;
        LandingLocalityInfoDto landingLocalityInfoDto = this.landingLocalityInfo;
        return "LandingDto(landingContent=" + landingContentDto + ", landingLocalityInfo=" + landingLocalityInfoDto + ")";
    }
}
