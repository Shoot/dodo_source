package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: WarningDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/WarningDto;", "", "description", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WarningDto {
    @uca("code")
    private final int code;
    @uca("description")
    private final String description;

    public WarningDto() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ WarningDto copy$default(WarningDto warningDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = warningDto.description;
        }
        if ((i2 & 2) != 0) {
            i = warningDto.code;
        }
        return warningDto.copy(str, i);
    }

    public final String component1() {
        return this.description;
    }

    public final int component2() {
        return this.code;
    }

    public final WarningDto copy(String str, int i) {
        z65.h(str, "description");
        return new WarningDto(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningDto)) {
            return false;
        }
        WarningDto warningDto = (WarningDto) obj;
        if (z65.c(this.description, warningDto.description) && this.code == warningDto.code) {
            return true;
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.code;
    }

    public String toString() {
        String str = this.description;
        int i = this.code;
        return "WarningDto(description=" + str + ", code=" + i + ")";
    }

    public WarningDto(String str, int i) {
        z65.h(str, "description");
        this.description = str;
        this.code = i;
    }

    public /* synthetic */ WarningDto(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
