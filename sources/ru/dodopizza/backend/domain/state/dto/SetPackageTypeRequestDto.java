package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
/* compiled from: SetPackageTypeRequestDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/SetPackageTypeRequestDto;", "", "stateId", "", "packageType", "Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "(Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;)V", "getPackageType", "()Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "getStateId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetPackageTypeRequestDto {
    @uca("packageType")
    private final PackageTypeDto packageType;
    @uca("stateId")
    private final String stateId;

    public SetPackageTypeRequestDto(String str, PackageTypeDto packageTypeDto) {
        z65.h(str, "stateId");
        z65.h(packageTypeDto, "packageType");
        this.stateId = str;
        this.packageType = packageTypeDto;
    }

    public static /* synthetic */ SetPackageTypeRequestDto copy$default(SetPackageTypeRequestDto setPackageTypeRequestDto, String str, PackageTypeDto packageTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setPackageTypeRequestDto.stateId;
        }
        if ((i & 2) != 0) {
            packageTypeDto = setPackageTypeRequestDto.packageType;
        }
        return setPackageTypeRequestDto.copy(str, packageTypeDto);
    }

    public final String component1() {
        return this.stateId;
    }

    public final PackageTypeDto component2() {
        return this.packageType;
    }

    public final SetPackageTypeRequestDto copy(String str, PackageTypeDto packageTypeDto) {
        z65.h(str, "stateId");
        z65.h(packageTypeDto, "packageType");
        return new SetPackageTypeRequestDto(str, packageTypeDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPackageTypeRequestDto)) {
            return false;
        }
        SetPackageTypeRequestDto setPackageTypeRequestDto = (SetPackageTypeRequestDto) obj;
        if (z65.c(this.stateId, setPackageTypeRequestDto.stateId) && this.packageType == setPackageTypeRequestDto.packageType) {
            return true;
        }
        return false;
    }

    public final PackageTypeDto getPackageType() {
        return this.packageType;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return (this.stateId.hashCode() * 31) + this.packageType.hashCode();
    }

    public String toString() {
        String str = this.stateId;
        PackageTypeDto packageTypeDto = this.packageType;
        return "SetPackageTypeRequestDto(stateId=" + str + ", packageType=" + packageTypeDto + ")";
    }
}
