package ru.dodopizza.backend.domain.inapp;

import kotlin.Metadata;
/* compiled from: InAppNotificationDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/inapp/AnimatedImageDto;", "", "darkThemeUrl", "", "lightThemeUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getDarkThemeUrl", "()Ljava/lang/String;", "getLightThemeUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedImageDto {
    @uca("darkThemeUrl")
    private final String darkThemeUrl;
    @uca("lightThemeUrl")
    private final String lightThemeUrl;

    public AnimatedImageDto(String str, String str2) {
        z65.h(str, "darkThemeUrl");
        z65.h(str2, "lightThemeUrl");
        this.darkThemeUrl = str;
        this.lightThemeUrl = str2;
    }

    public static /* synthetic */ AnimatedImageDto copy$default(AnimatedImageDto animatedImageDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = animatedImageDto.darkThemeUrl;
        }
        if ((i & 2) != 0) {
            str2 = animatedImageDto.lightThemeUrl;
        }
        return animatedImageDto.copy(str, str2);
    }

    public final String component1() {
        return this.darkThemeUrl;
    }

    public final String component2() {
        return this.lightThemeUrl;
    }

    public final AnimatedImageDto copy(String str, String str2) {
        z65.h(str, "darkThemeUrl");
        z65.h(str2, "lightThemeUrl");
        return new AnimatedImageDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatedImageDto)) {
            return false;
        }
        AnimatedImageDto animatedImageDto = (AnimatedImageDto) obj;
        if (z65.c(this.darkThemeUrl, animatedImageDto.darkThemeUrl) && z65.c(this.lightThemeUrl, animatedImageDto.lightThemeUrl)) {
            return true;
        }
        return false;
    }

    public final String getDarkThemeUrl() {
        return this.darkThemeUrl;
    }

    public final String getLightThemeUrl() {
        return this.lightThemeUrl;
    }

    public int hashCode() {
        return (this.darkThemeUrl.hashCode() * 31) + this.lightThemeUrl.hashCode();
    }

    public String toString() {
        String str = this.darkThemeUrl;
        String str2 = this.lightThemeUrl;
        return "AnimatedImageDto(darkThemeUrl=" + str + ", lightThemeUrl=" + str2 + ")";
    }
}
