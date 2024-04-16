package ru.dodopizza.backend.domain.state.dto.cart.bonuses;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AppliedInfoDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedInfoDto;", "", "description", "", "status", "", "(Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppliedInfoDto {
    @uca("description")
    private final String description;
    @uca("status")
    private final int status;

    public AppliedInfoDto() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ AppliedInfoDto copy$default(AppliedInfoDto appliedInfoDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appliedInfoDto.description;
        }
        if ((i2 & 2) != 0) {
            i = appliedInfoDto.status;
        }
        return appliedInfoDto.copy(str, i);
    }

    public final String component1() {
        return this.description;
    }

    public final int component2() {
        return this.status;
    }

    public final AppliedInfoDto copy(String str, int i) {
        z65.h(str, "description");
        return new AppliedInfoDto(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedInfoDto)) {
            return false;
        }
        AppliedInfoDto appliedInfoDto = (AppliedInfoDto) obj;
        if (z65.c(this.description, appliedInfoDto.description) && this.status == appliedInfoDto.status) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.status;
    }

    public String toString() {
        String str = this.description;
        int i = this.status;
        return "AppliedInfoDto(description=" + str + ", status=" + i + ")";
    }

    public AppliedInfoDto(String str, int i) {
        z65.h(str, "description");
        this.description = str;
        this.status = i;
    }

    public /* synthetic */ AppliedInfoDto(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
