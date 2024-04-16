package ru.dodopizza.backend.domain.customer.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SecretActionDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;", "", "isOpenByUser", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lru/dodopizza/backend/domain/customer/dto/SecretActionDto;", "equals", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SecretActionDto {
    @uca("isOpenByUser")
    private final Boolean isOpenByUser;

    public SecretActionDto() {
        this(null, 1, null);
    }

    public static /* synthetic */ SecretActionDto copy$default(SecretActionDto secretActionDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = secretActionDto.isOpenByUser;
        }
        return secretActionDto.copy(bool);
    }

    public final Boolean component1() {
        return this.isOpenByUser;
    }

    public final SecretActionDto copy(Boolean bool) {
        return new SecretActionDto(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SecretActionDto) && z65.c(this.isOpenByUser, ((SecretActionDto) obj).isOpenByUser)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.isOpenByUser;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isOpenByUser() {
        return this.isOpenByUser;
    }

    public String toString() {
        Boolean bool = this.isOpenByUser;
        return "SecretActionDto(isOpenByUser=" + bool + ")";
    }

    public SecretActionDto(Boolean bool) {
        this.isOpenByUser = bool;
    }

    public /* synthetic */ SecretActionDto(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
