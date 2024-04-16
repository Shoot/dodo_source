package com.dodopizza.ecommpay.model;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: TokenizeResponseDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/ecommpay/model/TokenizeResponseDto;", "", "token", "", "status", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ecommpaypayments_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TokenizeResponseDto {
    @uca("status")
    private final String status;
    @uca("token")
    private final String token;

    public TokenizeResponseDto(String str, String str2) {
        this.token = str;
        this.status = str2;
    }

    public static /* synthetic */ TokenizeResponseDto copy$default(TokenizeResponseDto tokenizeResponseDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenizeResponseDto.token;
        }
        if ((i & 2) != 0) {
            str2 = tokenizeResponseDto.status;
        }
        return tokenizeResponseDto.copy(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.status;
    }

    public final TokenizeResponseDto copy(String str, String str2) {
        return new TokenizeResponseDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenizeResponseDto)) {
            return false;
        }
        TokenizeResponseDto tokenizeResponseDto = (TokenizeResponseDto) obj;
        if (z65.c(this.token, tokenizeResponseDto.token) && z65.c(this.status, tokenizeResponseDto.status)) {
            return true;
        }
        return false;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode;
        String str = this.token;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.status;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "TokenizeResponseDto(token=" + this.token + ", status=" + this.status + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
