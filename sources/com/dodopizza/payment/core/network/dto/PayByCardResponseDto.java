package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: PayByCardResponseDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PayByCardResponseDto;", "", "code", "", "md", "paReq", "navigateUrl", "termUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMd", "getNavigateUrl", "getPaReq", "getTermUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PayByCardResponseDto {
    private final String code;
    private final String md;
    private final String navigateUrl;
    private final String paReq;
    private final String termUrl;

    public PayByCardResponseDto(String str, String str2, String str3, String str4, String str5) {
        z65.h(str, "code");
        this.code = str;
        this.md = str2;
        this.paReq = str3;
        this.navigateUrl = str4;
        this.termUrl = str5;
    }

    public static /* synthetic */ PayByCardResponseDto copy$default(PayByCardResponseDto payByCardResponseDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payByCardResponseDto.code;
        }
        if ((i & 2) != 0) {
            str2 = payByCardResponseDto.md;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = payByCardResponseDto.paReq;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = payByCardResponseDto.navigateUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = payByCardResponseDto.termUrl;
        }
        return payByCardResponseDto.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.md;
    }

    public final String component3() {
        return this.paReq;
    }

    public final String component4() {
        return this.navigateUrl;
    }

    public final String component5() {
        return this.termUrl;
    }

    public final PayByCardResponseDto copy(String str, String str2, String str3, String str4, String str5) {
        z65.h(str, "code");
        return new PayByCardResponseDto(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayByCardResponseDto)) {
            return false;
        }
        PayByCardResponseDto payByCardResponseDto = (PayByCardResponseDto) obj;
        if (z65.c(this.code, payByCardResponseDto.code) && z65.c(this.md, payByCardResponseDto.md) && z65.c(this.paReq, payByCardResponseDto.paReq) && z65.c(this.navigateUrl, payByCardResponseDto.navigateUrl) && z65.c(this.termUrl, payByCardResponseDto.termUrl)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMd() {
        return this.md;
    }

    public final String getNavigateUrl() {
        return this.navigateUrl;
    }

    public final String getPaReq() {
        return this.paReq;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.code.hashCode() * 31;
        String str = this.md;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.paReq;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.navigateUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.termUrl;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "PayByCardResponseDto(code=" + this.code + ", md=" + this.md + ", paReq=" + this.paReq + ", navigateUrl=" + this.navigateUrl + ", termUrl=" + this.termUrl + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
