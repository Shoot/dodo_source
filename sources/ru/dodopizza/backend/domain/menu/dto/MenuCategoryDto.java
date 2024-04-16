package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuCategoryDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/MenuCategoryDto;", "", "id", "", Action.NAME_ATTRIBUTE, "position", "", "analyticsName", "displayType", "showHeroProduct", "", "subCategories", "", "Lru/dodopizza/backend/domain/menu/dto/SubCategoryDto;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getAnalyticsName", "()Ljava/lang/String;", "getDisplayType", "getId", "getName", "getPosition", "()I", "getShowHeroProduct", "()Z", "getSubCategories", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MenuCategoryDto {
    @uca("analyticsName")
    private final String analyticsName;
    @uca("displayType")
    private final String displayType;
    @uca("id")
    private final String id;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("position")
    private final int position;
    @uca("showHeroProduct")
    private final boolean showHeroProduct;
    @uca("subCategories")
    private final List<SubCategoryDto> subCategories;

    public MenuCategoryDto(String str, String str2, int i, String str3, String str4, boolean z, List<SubCategoryDto> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "analyticsName");
        this.id = str;
        this.name = str2;
        this.position = i;
        this.analyticsName = str3;
        this.displayType = str4;
        this.showHeroProduct = z;
        this.subCategories = list;
    }

    public static /* synthetic */ MenuCategoryDto copy$default(MenuCategoryDto menuCategoryDto, String str, String str2, int i, String str3, String str4, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = menuCategoryDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = menuCategoryDto.name;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = menuCategoryDto.position;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = menuCategoryDto.analyticsName;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = menuCategoryDto.displayType;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            z = menuCategoryDto.showHeroProduct;
        }
        boolean z2 = z;
        List<SubCategoryDto> list2 = list;
        if ((i2 & 64) != 0) {
            list2 = menuCategoryDto.subCategories;
        }
        return menuCategoryDto.copy(str, str5, i3, str6, str7, z2, list2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.position;
    }

    public final String component4() {
        return this.analyticsName;
    }

    public final String component5() {
        return this.displayType;
    }

    public final boolean component6() {
        return this.showHeroProduct;
    }

    public final List<SubCategoryDto> component7() {
        return this.subCategories;
    }

    public final MenuCategoryDto copy(String str, String str2, int i, String str3, String str4, boolean z, List<SubCategoryDto> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "analyticsName");
        return new MenuCategoryDto(str, str2, i, str3, str4, z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuCategoryDto)) {
            return false;
        }
        MenuCategoryDto menuCategoryDto = (MenuCategoryDto) obj;
        if (z65.c(this.id, menuCategoryDto.id) && z65.c(this.name, menuCategoryDto.name) && this.position == menuCategoryDto.position && z65.c(this.analyticsName, menuCategoryDto.analyticsName) && z65.c(this.displayType, menuCategoryDto.displayType) && this.showHeroProduct == menuCategoryDto.showHeroProduct && z65.c(this.subCategories, menuCategoryDto.subCategories)) {
            return true;
        }
        return false;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getDisplayType() {
        return this.displayType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getShowHeroProduct() {
        return this.showHeroProduct;
    }

    public final List<SubCategoryDto> getSubCategories() {
        return this.subCategories;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.position) * 31) + this.analyticsName.hashCode()) * 31;
        String str = this.displayType;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a = (((hashCode2 + hashCode) * 31) + a91.a(this.showHeroProduct)) * 31;
        List<SubCategoryDto> list = this.subCategories;
        if (list != null) {
            i = list.hashCode();
        }
        return a + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        int i = this.position;
        String str3 = this.analyticsName;
        String str4 = this.displayType;
        boolean z = this.showHeroProduct;
        List<SubCategoryDto> list = this.subCategories;
        return "MenuCategoryDto(id=" + str + ", name=" + str2 + ", position=" + i + ", analyticsName=" + str3 + ", displayType=" + str4 + ", showHeroProduct=" + z + ", subCategories=" + list + ")";
    }
}
