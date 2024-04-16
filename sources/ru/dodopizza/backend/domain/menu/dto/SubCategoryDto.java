package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: SubCategoryDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/SubCategoryDto;", "", "id", "", Action.NAME_ATTRIBUTE, "position", "", "analyticsName", "displayType", "showHeroProduct", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getAnalyticsName", "()Ljava/lang/String;", "getDisplayType", "getId", "getName", "getPosition", "()I", "getShowHeroProduct", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubCategoryDto {
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

    public SubCategoryDto(String str, String str2, int i, String str3, String str4, boolean z) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "analyticsName");
        this.id = str;
        this.name = str2;
        this.position = i;
        this.analyticsName = str3;
        this.displayType = str4;
        this.showHeroProduct = z;
    }

    public static /* synthetic */ SubCategoryDto copy$default(SubCategoryDto subCategoryDto, String str, String str2, int i, String str3, String str4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subCategoryDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = subCategoryDto.name;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = subCategoryDto.position;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = subCategoryDto.analyticsName;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = subCategoryDto.displayType;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            z = subCategoryDto.showHeroProduct;
        }
        return subCategoryDto.copy(str, str5, i3, str6, str7, z);
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

    public final SubCategoryDto copy(String str, String str2, int i, String str3, String str4, boolean z) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "analyticsName");
        return new SubCategoryDto(str, str2, i, str3, str4, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubCategoryDto)) {
            return false;
        }
        SubCategoryDto subCategoryDto = (SubCategoryDto) obj;
        if (z65.c(this.id, subCategoryDto.id) && z65.c(this.name, subCategoryDto.name) && this.position == subCategoryDto.position && z65.c(this.analyticsName, subCategoryDto.analyticsName) && z65.c(this.displayType, subCategoryDto.displayType) && this.showHeroProduct == subCategoryDto.showHeroProduct) {
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

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.position) * 31) + this.analyticsName.hashCode()) * 31;
        String str = this.displayType;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + a91.a(this.showHeroProduct);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        int i = this.position;
        String str3 = this.analyticsName;
        String str4 = this.displayType;
        boolean z = this.showHeroProduct;
        return "SubCategoryDto(id=" + str + ", name=" + str2 + ", position=" + i + ", analyticsName=" + str3 + ", displayType=" + str4 + ", showHeroProduct=" + z + ")";
    }
}
