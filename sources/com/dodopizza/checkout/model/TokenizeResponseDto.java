package com.dodopizza.checkout.model;

import ch.qos.logback.core.CoreConstants;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: TokenizeResponseDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/checkout/model/TokenizeResponseDto;", "", MessageAttributes.TYPE, "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TokenizeResponseDto {
    private final String token;
    private final String type;

    public TokenizeResponseDto(String str, String str2) {
        z65.h(str, MessageAttributes.TYPE);
        z65.h(str2, "token");
        this.type = str;
        this.token = str2;
    }

    public static /* synthetic */ TokenizeResponseDto copy$default(TokenizeResponseDto tokenizeResponseDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenizeResponseDto.type;
        }
        if ((i & 2) != 0) {
            str2 = tokenizeResponseDto.token;
        }
        return tokenizeResponseDto.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.token;
    }

    public final TokenizeResponseDto copy(String str, String str2) {
        z65.h(str, MessageAttributes.TYPE);
        z65.h(str2, "token");
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
        if (z65.c(this.type, tokenizeResponseDto.type) && z65.c(this.token, tokenizeResponseDto.token)) {
            return true;
        }
        return false;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.token.hashCode();
    }

    public String toString() {
        return "TokenizeResponseDto(type=" + this.type + ", token=" + this.token + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
