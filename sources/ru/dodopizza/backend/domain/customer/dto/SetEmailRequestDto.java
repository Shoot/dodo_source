package ru.dodopizza.backend.domain.customer.dto;

import kotlin.Metadata;
/* compiled from: SetEmailRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/SetEmailRequestDto;", "", "email", "", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetEmailRequestDto {
    @uca("Email")
    private final String email;

    public SetEmailRequestDto(String str) {
        z65.h(str, "email");
        this.email = str;
    }

    private final String component1() {
        return this.email;
    }

    public static /* synthetic */ SetEmailRequestDto copy$default(SetEmailRequestDto setEmailRequestDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setEmailRequestDto.email;
        }
        return setEmailRequestDto.copy(str);
    }

    public final SetEmailRequestDto copy(String str) {
        z65.h(str, "email");
        return new SetEmailRequestDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetEmailRequestDto) && z65.c(this.email, ((SetEmailRequestDto) obj).email)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        String str = this.email;
        return "SetEmailRequestDto(email=" + str + ")";
    }
}
