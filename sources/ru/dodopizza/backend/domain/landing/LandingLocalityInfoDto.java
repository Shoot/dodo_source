package ru.dodopizza.backend.domain.landing;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LandingDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/landing/LandingLocalityInfoDto;", "", Action.NAME_ATTRIBUTE, "", "socialLinks", "", "Lru/dodopizza/backend/domain/landing/LandingLocalitySocialLinkDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getSocialLinks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingLocalityInfoDto {
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("socialLinks")
    private final List<LandingLocalitySocialLinkDto> socialLinks;

    public LandingLocalityInfoDto(String str, List<LandingLocalitySocialLinkDto> list) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "socialLinks");
        this.name = str;
        this.socialLinks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LandingLocalityInfoDto copy$default(LandingLocalityInfoDto landingLocalityInfoDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landingLocalityInfoDto.name;
        }
        if ((i & 2) != 0) {
            list = landingLocalityInfoDto.socialLinks;
        }
        return landingLocalityInfoDto.copy(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<LandingLocalitySocialLinkDto> component2() {
        return this.socialLinks;
    }

    public final LandingLocalityInfoDto copy(String str, List<LandingLocalitySocialLinkDto> list) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "socialLinks");
        return new LandingLocalityInfoDto(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingLocalityInfoDto)) {
            return false;
        }
        LandingLocalityInfoDto landingLocalityInfoDto = (LandingLocalityInfoDto) obj;
        if (z65.c(this.name, landingLocalityInfoDto.name) && z65.c(this.socialLinks, landingLocalityInfoDto.socialLinks)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final List<LandingLocalitySocialLinkDto> getSocialLinks() {
        return this.socialLinks;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.socialLinks.hashCode();
    }

    public String toString() {
        String str = this.name;
        List<LandingLocalitySocialLinkDto> list = this.socialLinks;
        return "LandingLocalityInfoDto(name=" + str + ", socialLinks=" + list + ")";
    }
}
