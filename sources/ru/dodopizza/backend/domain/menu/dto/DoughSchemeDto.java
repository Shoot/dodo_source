package ru.dodopizza.backend.domain.menu.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: DoughSchemeDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/DoughSchemeDto;", "", "id", "", "doughTypes", "", "Lru/dodopizza/backend/domain/menu/dto/DoughTypeDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getDoughTypes", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DoughSchemeDto {
    @uca("doughTypes")
    private final List<DoughTypeDto> doughTypes;
    @uca("id")
    private final String id;

    public DoughSchemeDto(String str, List<DoughTypeDto> list) {
        z65.h(str, "id");
        z65.h(list, "doughTypes");
        this.id = str;
        this.doughTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DoughSchemeDto copy$default(DoughSchemeDto doughSchemeDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = doughSchemeDto.id;
        }
        if ((i & 2) != 0) {
            list = doughSchemeDto.doughTypes;
        }
        return doughSchemeDto.copy(str, list);
    }

    public final String component1() {
        return this.id;
    }

    public final List<DoughTypeDto> component2() {
        return this.doughTypes;
    }

    public final DoughSchemeDto copy(String str, List<DoughTypeDto> list) {
        z65.h(str, "id");
        z65.h(list, "doughTypes");
        return new DoughSchemeDto(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoughSchemeDto)) {
            return false;
        }
        DoughSchemeDto doughSchemeDto = (DoughSchemeDto) obj;
        if (z65.c(this.id, doughSchemeDto.id) && z65.c(this.doughTypes, doughSchemeDto.doughTypes)) {
            return true;
        }
        return false;
    }

    public final List<DoughTypeDto> getDoughTypes() {
        return this.doughTypes;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.doughTypes.hashCode();
    }

    public String toString() {
        String str = this.id;
        List<DoughTypeDto> list = this.doughTypes;
        return "DoughSchemeDto(id=" + str + ", doughTypes=" + list + ")";
    }
}
