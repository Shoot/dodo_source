package ru.dodopizza.backend.domain.stories.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InfoStoryDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/stories/dto/InfoStoryDto;", "", "menu", "", "profile", "cart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCart", "()Ljava/lang/String;", "setCart", "(Ljava/lang/String;)V", "getMenu", "setMenu", "getProfile", "setProfile", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoStoryDto {
    @uca("cart")
    private String cart;
    @uca("menu")
    private String menu;
    @uca("profile")
    private String profile;

    public InfoStoryDto() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InfoStoryDto copy$default(InfoStoryDto infoStoryDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoStoryDto.menu;
        }
        if ((i & 2) != 0) {
            str2 = infoStoryDto.profile;
        }
        if ((i & 4) != 0) {
            str3 = infoStoryDto.cart;
        }
        return infoStoryDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.menu;
    }

    public final String component2() {
        return this.profile;
    }

    public final String component3() {
        return this.cart;
    }

    public final InfoStoryDto copy(String str, String str2, String str3) {
        return new InfoStoryDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStoryDto)) {
            return false;
        }
        InfoStoryDto infoStoryDto = (InfoStoryDto) obj;
        if (z65.c(this.menu, infoStoryDto.menu) && z65.c(this.profile, infoStoryDto.profile) && z65.c(this.cart, infoStoryDto.cart)) {
            return true;
        }
        return false;
    }

    public final String getCart() {
        return this.cart;
    }

    public final String getMenu() {
        return this.menu;
    }

    public final String getProfile() {
        return this.profile;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.menu;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.profile;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.cart;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final void setCart(String str) {
        this.cart = str;
    }

    public final void setMenu(String str) {
        this.menu = str;
    }

    public final void setProfile(String str) {
        this.profile = str;
    }

    public String toString() {
        String str = this.menu;
        String str2 = this.profile;
        String str3 = this.cart;
        return "InfoStoryDto(menu=" + str + ", profile=" + str2 + ", cart=" + str3 + ")";
    }

    public InfoStoryDto(String str, String str2, String str3) {
        this.menu = str;
        this.profile = str2;
        this.cart = str3;
    }

    public /* synthetic */ InfoStoryDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
