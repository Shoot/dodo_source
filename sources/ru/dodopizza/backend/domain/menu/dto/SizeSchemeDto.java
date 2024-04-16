package ru.dodopizza.backend.domain.menu.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: SizeSchemeDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/SizeSchemeDto;", "", "id", "", "sizeGroups", "", "Lru/dodopizza/backend/domain/menu/dto/SizeGroupDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getSizeGroups", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SizeSchemeDto {
    @uca("id")
    private final String id;
    @uca("sizeGroups")
    private final List<SizeGroupDto> sizeGroups;

    public SizeSchemeDto(String str, List<SizeGroupDto> list) {
        z65.h(str, "id");
        z65.h(list, "sizeGroups");
        this.id = str;
        this.sizeGroups = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SizeSchemeDto copy$default(SizeSchemeDto sizeSchemeDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sizeSchemeDto.id;
        }
        if ((i & 2) != 0) {
            list = sizeSchemeDto.sizeGroups;
        }
        return sizeSchemeDto.copy(str, list);
    }

    public final String component1() {
        return this.id;
    }

    public final List<SizeGroupDto> component2() {
        return this.sizeGroups;
    }

    public final SizeSchemeDto copy(String str, List<SizeGroupDto> list) {
        z65.h(str, "id");
        z65.h(list, "sizeGroups");
        return new SizeSchemeDto(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeSchemeDto)) {
            return false;
        }
        SizeSchemeDto sizeSchemeDto = (SizeSchemeDto) obj;
        if (z65.c(this.id, sizeSchemeDto.id) && z65.c(this.sizeGroups, sizeSchemeDto.sizeGroups)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final List<SizeGroupDto> getSizeGroups() {
        return this.sizeGroups;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.sizeGroups.hashCode();
    }

    public String toString() {
        String str = this.id;
        List<SizeGroupDto> list = this.sizeGroups;
        return "SizeSchemeDto(id=" + str + ", sizeGroups=" + list + ")";
    }
}
