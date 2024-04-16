package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: DoughTypeDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/DoughTypeDto;", "", "doughTypeId", "", "shortName", "", Action.NAME_ATTRIBUTE, "(ILjava/lang/String;Ljava/lang/String;)V", "getDoughTypeId", "()I", "getName", "()Ljava/lang/String;", "getShortName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DoughTypeDto {
    @uca("dough")
    private final int doughTypeId;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("shortName")
    private final String shortName;

    public DoughTypeDto(int i, String str, String str2) {
        z65.h(str, "shortName");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.doughTypeId = i;
        this.shortName = str;
        this.name = str2;
    }

    public static /* synthetic */ DoughTypeDto copy$default(DoughTypeDto doughTypeDto, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = doughTypeDto.doughTypeId;
        }
        if ((i2 & 2) != 0) {
            str = doughTypeDto.shortName;
        }
        if ((i2 & 4) != 0) {
            str2 = doughTypeDto.name;
        }
        return doughTypeDto.copy(i, str, str2);
    }

    public final int component1() {
        return this.doughTypeId;
    }

    public final String component2() {
        return this.shortName;
    }

    public final String component3() {
        return this.name;
    }

    public final DoughTypeDto copy(int i, String str, String str2) {
        z65.h(str, "shortName");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        return new DoughTypeDto(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoughTypeDto)) {
            return false;
        }
        DoughTypeDto doughTypeDto = (DoughTypeDto) obj;
        if (this.doughTypeId == doughTypeDto.doughTypeId && z65.c(this.shortName, doughTypeDto.shortName) && z65.c(this.name, doughTypeDto.name)) {
            return true;
        }
        return false;
    }

    public final int getDoughTypeId() {
        return this.doughTypeId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        return (((this.doughTypeId * 31) + this.shortName.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        int i = this.doughTypeId;
        String str = this.shortName;
        String str2 = this.name;
        return "DoughTypeDto(doughTypeId=" + i + ", shortName=" + str + ", name=" + str2 + ")";
    }
}
