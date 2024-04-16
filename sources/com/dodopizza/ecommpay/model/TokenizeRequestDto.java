package com.dodopizza.ecommpay.model;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: TokenizeRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/ecommpay/model/TokenizeRequestDto;", "", "cryptoMessage", "", "projectId", "", "(Ljava/lang/String;I)V", "getCryptoMessage", "()Ljava/lang/String;", "getProjectId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ecommpaypayments_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TokenizeRequestDto {
    @uca("crypto_message")
    private final String cryptoMessage;
    @uca("project_id")
    private final int projectId;

    public TokenizeRequestDto(String str, int i) {
        z65.h(str, "cryptoMessage");
        this.cryptoMessage = str;
        this.projectId = i;
    }

    public static /* synthetic */ TokenizeRequestDto copy$default(TokenizeRequestDto tokenizeRequestDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tokenizeRequestDto.cryptoMessage;
        }
        if ((i2 & 2) != 0) {
            i = tokenizeRequestDto.projectId;
        }
        return tokenizeRequestDto.copy(str, i);
    }

    public final String component1() {
        return this.cryptoMessage;
    }

    public final int component2() {
        return this.projectId;
    }

    public final TokenizeRequestDto copy(String str, int i) {
        z65.h(str, "cryptoMessage");
        return new TokenizeRequestDto(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenizeRequestDto)) {
            return false;
        }
        TokenizeRequestDto tokenizeRequestDto = (TokenizeRequestDto) obj;
        if (z65.c(this.cryptoMessage, tokenizeRequestDto.cryptoMessage) && this.projectId == tokenizeRequestDto.projectId) {
            return true;
        }
        return false;
    }

    public final String getCryptoMessage() {
        return this.cryptoMessage;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public int hashCode() {
        return (this.cryptoMessage.hashCode() * 31) + this.projectId;
    }

    public String toString() {
        return "TokenizeRequestDto(cryptoMessage=" + this.cryptoMessage + ", projectId=" + this.projectId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
