package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ErrorDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/ErrorDto;", "", "description", "", "errorCode", "", "(Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorDto {
    @uca("description")
    private final String description;
    @uca("errorCode")
    private final int errorCode;

    public ErrorDto() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ ErrorDto copy$default(ErrorDto errorDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorDto.description;
        }
        if ((i2 & 2) != 0) {
            i = errorDto.errorCode;
        }
        return errorDto.copy(str, i);
    }

    public final String component1() {
        return this.description;
    }

    public final int component2() {
        return this.errorCode;
    }

    public final ErrorDto copy(String str, int i) {
        z65.h(str, "description");
        return new ErrorDto(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorDto)) {
            return false;
        }
        ErrorDto errorDto = (ErrorDto) obj;
        if (z65.c(this.description, errorDto.description) && this.errorCode == errorDto.errorCode) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.errorCode;
    }

    public String toString() {
        String str = this.description;
        int i = this.errorCode;
        return "ErrorDto(description=" + str + ", errorCode=" + i + ")";
    }

    public ErrorDto(String str, int i) {
        z65.h(str, "description");
        this.description = str;
        this.errorCode = i;
    }

    public /* synthetic */ ErrorDto(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
