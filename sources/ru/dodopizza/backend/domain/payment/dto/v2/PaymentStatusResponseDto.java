package ru.dodopizza.backend.domain.payment.dto.v2;

import kotlin.Metadata;
/* compiled from: PaymentStatusResponseDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/v2/PaymentStatusResponseDto;", "", "status", "", "navigateUrl", "", "md", "paReq", "termUrl", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMd", "()Ljava/lang/String;", "getNavigateUrl", "getPaReq", "getStatus", "()I", "getTermUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentStatusResponseDto {
    @uca("md")
    private final String md;
    @uca("navigateUrl")
    private final String navigateUrl;
    @uca("paReq")
    private final String paReq;
    @uca("status")
    private final int status;
    @uca("termUrl")
    private final String termUrl;

    public PaymentStatusResponseDto(int i, String str, String str2, String str3, String str4) {
        this.status = i;
        this.navigateUrl = str;
        this.md = str2;
        this.paReq = str3;
        this.termUrl = str4;
    }

    public static /* synthetic */ PaymentStatusResponseDto copy$default(PaymentStatusResponseDto paymentStatusResponseDto, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paymentStatusResponseDto.status;
        }
        if ((i2 & 2) != 0) {
            str = paymentStatusResponseDto.navigateUrl;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = paymentStatusResponseDto.md;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = paymentStatusResponseDto.paReq;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = paymentStatusResponseDto.termUrl;
        }
        return paymentStatusResponseDto.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.status;
    }

    public final String component2() {
        return this.navigateUrl;
    }

    public final String component3() {
        return this.md;
    }

    public final String component4() {
        return this.paReq;
    }

    public final String component5() {
        return this.termUrl;
    }

    public final PaymentStatusResponseDto copy(int i, String str, String str2, String str3, String str4) {
        return new PaymentStatusResponseDto(i, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentStatusResponseDto)) {
            return false;
        }
        PaymentStatusResponseDto paymentStatusResponseDto = (PaymentStatusResponseDto) obj;
        if (this.status == paymentStatusResponseDto.status && z65.c(this.navigateUrl, paymentStatusResponseDto.navigateUrl) && z65.c(this.md, paymentStatusResponseDto.md) && z65.c(this.paReq, paymentStatusResponseDto.paReq) && z65.c(this.termUrl, paymentStatusResponseDto.termUrl)) {
            return true;
        }
        return false;
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

    public final int getStatus() {
        return this.status;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.status * 31;
        String str = this.navigateUrl;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.md;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.paReq;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str4 = this.termUrl;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i5 + i2;
    }

    public String toString() {
        int i = this.status;
        String str = this.navigateUrl;
        String str2 = this.md;
        String str3 = this.paReq;
        String str4 = this.termUrl;
        return "PaymentStatusResponseDto(status=" + i + ", navigateUrl=" + str + ", md=" + str2 + ", paReq=" + str3 + ", termUrl=" + str4 + ")";
    }
}
