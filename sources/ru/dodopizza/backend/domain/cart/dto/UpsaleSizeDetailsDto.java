package ru.dodopizza.backend.domain.cart.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleSizeDetailsDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006&"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/UpsaleSizeDetailsDto;", "", "doughTypeId", "", "doughTypeName", "", "sizeGroupId", "sizeGroupName", "measureInfo", "Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;", "(ILjava/lang/String;ILjava/lang/String;Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;)V", "getDoughTypeId", "()I", "setDoughTypeId", "(I)V", "getDoughTypeName", "()Ljava/lang/String;", "setDoughTypeName", "(Ljava/lang/String;)V", "getMeasureInfo", "()Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;", "setMeasureInfo", "(Lru/dodopizza/backend/domain/cart/dto/UpsaleMeasureInfoDto;)V", "getSizeGroupId", "setSizeGroupId", "getSizeGroupName", "setSizeGroupName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpsaleSizeDetailsDto {
    @uca("doughType")
    private int doughTypeId;
    @uca("doughTypeName")
    private String doughTypeName;
    @uca("size")
    private UpsaleMeasureInfoDto measureInfo;
    @uca("sizeGroup")
    private int sizeGroupId;
    @uca("sizeGroupName")
    private String sizeGroupName;

    public UpsaleSizeDetailsDto() {
        this(0, null, 0, null, null, 31, null);
    }

    public static /* synthetic */ UpsaleSizeDetailsDto copy$default(UpsaleSizeDetailsDto upsaleSizeDetailsDto, int i, String str, int i2, String str2, UpsaleMeasureInfoDto upsaleMeasureInfoDto, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = upsaleSizeDetailsDto.doughTypeId;
        }
        if ((i3 & 2) != 0) {
            str = upsaleSizeDetailsDto.doughTypeName;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            i2 = upsaleSizeDetailsDto.sizeGroupId;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = upsaleSizeDetailsDto.sizeGroupName;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            upsaleMeasureInfoDto = upsaleSizeDetailsDto.measureInfo;
        }
        return upsaleSizeDetailsDto.copy(i, str3, i4, str4, upsaleMeasureInfoDto);
    }

    public final int component1() {
        return this.doughTypeId;
    }

    public final String component2() {
        return this.doughTypeName;
    }

    public final int component3() {
        return this.sizeGroupId;
    }

    public final String component4() {
        return this.sizeGroupName;
    }

    public final UpsaleMeasureInfoDto component5() {
        return this.measureInfo;
    }

    public final UpsaleSizeDetailsDto copy(int i, String str, int i2, String str2, UpsaleMeasureInfoDto upsaleMeasureInfoDto) {
        return new UpsaleSizeDetailsDto(i, str, i2, str2, upsaleMeasureInfoDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpsaleSizeDetailsDto)) {
            return false;
        }
        UpsaleSizeDetailsDto upsaleSizeDetailsDto = (UpsaleSizeDetailsDto) obj;
        if (this.doughTypeId == upsaleSizeDetailsDto.doughTypeId && z65.c(this.doughTypeName, upsaleSizeDetailsDto.doughTypeName) && this.sizeGroupId == upsaleSizeDetailsDto.sizeGroupId && z65.c(this.sizeGroupName, upsaleSizeDetailsDto.sizeGroupName) && z65.c(this.measureInfo, upsaleSizeDetailsDto.measureInfo)) {
            return true;
        }
        return false;
    }

    public final int getDoughTypeId() {
        return this.doughTypeId;
    }

    public final String getDoughTypeName() {
        return this.doughTypeName;
    }

    public final UpsaleMeasureInfoDto getMeasureInfo() {
        return this.measureInfo;
    }

    public final int getSizeGroupId() {
        return this.sizeGroupId;
    }

    public final String getSizeGroupName() {
        return this.sizeGroupName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.doughTypeId * 31;
        String str = this.doughTypeName;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (((i + hashCode) * 31) + this.sizeGroupId) * 31;
        String str2 = this.sizeGroupName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        UpsaleMeasureInfoDto upsaleMeasureInfoDto = this.measureInfo;
        if (upsaleMeasureInfoDto != null) {
            i2 = upsaleMeasureInfoDto.hashCode();
        }
        return i4 + i2;
    }

    public final void setDoughTypeId(int i) {
        this.doughTypeId = i;
    }

    public final void setDoughTypeName(String str) {
        this.doughTypeName = str;
    }

    public final void setMeasureInfo(UpsaleMeasureInfoDto upsaleMeasureInfoDto) {
        this.measureInfo = upsaleMeasureInfoDto;
    }

    public final void setSizeGroupId(int i) {
        this.sizeGroupId = i;
    }

    public final void setSizeGroupName(String str) {
        this.sizeGroupName = str;
    }

    public String toString() {
        int i = this.doughTypeId;
        String str = this.doughTypeName;
        int i2 = this.sizeGroupId;
        String str2 = this.sizeGroupName;
        UpsaleMeasureInfoDto upsaleMeasureInfoDto = this.measureInfo;
        return "UpsaleSizeDetailsDto(doughTypeId=" + i + ", doughTypeName=" + str + ", sizeGroupId=" + i2 + ", sizeGroupName=" + str2 + ", measureInfo=" + upsaleMeasureInfoDto + ")";
    }

    public UpsaleSizeDetailsDto(int i, String str, int i2, String str2, UpsaleMeasureInfoDto upsaleMeasureInfoDto) {
        this.doughTypeId = i;
        this.doughTypeName = str;
        this.sizeGroupId = i2;
        this.sizeGroupName = str2;
        this.measureInfo = upsaleMeasureInfoDto;
    }

    public /* synthetic */ UpsaleSizeDetailsDto(int i, String str, int i2, String str2, UpsaleMeasureInfoDto upsaleMeasureInfoDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : upsaleMeasureInfoDto);
    }
}
