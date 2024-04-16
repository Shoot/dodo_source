package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: SizeGroupDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/SizeGroupDto;", "", "sizeGroupId", "", "shortName", "", Action.NAME_ATTRIBUTE, "(ILjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getShortName", "getSizeGroupId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SizeGroupDto {
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("shortName")
    private final String shortName;
    @uca("size")
    private final int sizeGroupId;

    public SizeGroupDto(int i, String str, String str2) {
        z65.h(str, "shortName");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.sizeGroupId = i;
        this.shortName = str;
        this.name = str2;
    }

    public static /* synthetic */ SizeGroupDto copy$default(SizeGroupDto sizeGroupDto, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sizeGroupDto.sizeGroupId;
        }
        if ((i2 & 2) != 0) {
            str = sizeGroupDto.shortName;
        }
        if ((i2 & 4) != 0) {
            str2 = sizeGroupDto.name;
        }
        return sizeGroupDto.copy(i, str, str2);
    }

    public final int component1() {
        return this.sizeGroupId;
    }

    public final String component2() {
        return this.shortName;
    }

    public final String component3() {
        return this.name;
    }

    public final SizeGroupDto copy(int i, String str, String str2) {
        z65.h(str, "shortName");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        return new SizeGroupDto(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeGroupDto)) {
            return false;
        }
        SizeGroupDto sizeGroupDto = (SizeGroupDto) obj;
        if (this.sizeGroupId == sizeGroupDto.sizeGroupId && z65.c(this.shortName, sizeGroupDto.shortName) && z65.c(this.name, sizeGroupDto.name)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final int getSizeGroupId() {
        return this.sizeGroupId;
    }

    public int hashCode() {
        return (((this.sizeGroupId * 31) + this.shortName.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        int i = this.sizeGroupId;
        String str = this.shortName;
        String str2 = this.name;
        return "SizeGroupDto(sizeGroupId=" + i + ", shortName=" + str + ", name=" + str2 + ")";
    }
}
