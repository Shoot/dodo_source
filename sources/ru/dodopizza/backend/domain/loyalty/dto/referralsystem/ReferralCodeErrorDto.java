package ru.dodopizza.backend.domain.loyalty.dto.referralsystem;

import kotlin.Metadata;
/* compiled from: ReferralCodeErrorDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeErrorDto;", "", "errorMessage", "", "errorDescription", "errorCode", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getErrorCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferralCodeErrorDto {
    @uca("code")
    private final int errorCode;
    @uca("description")
    private final String errorDescription;
    @uca("message")
    private final String errorMessage;

    public ReferralCodeErrorDto(String str, String str2, int i) {
        z65.h(str, "errorMessage");
        z65.h(str2, "errorDescription");
        this.errorMessage = str;
        this.errorDescription = str2;
        this.errorCode = i;
    }

    public static /* synthetic */ ReferralCodeErrorDto copy$default(ReferralCodeErrorDto referralCodeErrorDto, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = referralCodeErrorDto.errorMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = referralCodeErrorDto.errorDescription;
        }
        if ((i2 & 4) != 0) {
            i = referralCodeErrorDto.errorCode;
        }
        return referralCodeErrorDto.copy(str, str2, i);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final String component2() {
        return this.errorDescription;
    }

    public final int component3() {
        return this.errorCode;
    }

    public final ReferralCodeErrorDto copy(String str, String str2, int i) {
        z65.h(str, "errorMessage");
        z65.h(str2, "errorDescription");
        return new ReferralCodeErrorDto(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralCodeErrorDto)) {
            return false;
        }
        ReferralCodeErrorDto referralCodeErrorDto = (ReferralCodeErrorDto) obj;
        if (z65.c(this.errorMessage, referralCodeErrorDto.errorMessage) && z65.c(this.errorDescription, referralCodeErrorDto.errorDescription) && this.errorCode == referralCodeErrorDto.errorCode) {
            return true;
        }
        return false;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return (((this.errorMessage.hashCode() * 31) + this.errorDescription.hashCode()) * 31) + this.errorCode;
    }

    public String toString() {
        String str = this.errorMessage;
        String str2 = this.errorDescription;
        int i = this.errorCode;
        return "ReferralCodeErrorDto(errorMessage=" + str + ", errorDescription=" + str2 + ", errorCode=" + i + ")";
    }
}
