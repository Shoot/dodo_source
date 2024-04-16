package ru.dodopizza.backend.domain.state.dto.payment.googlepay;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GooglePayPaymentDataDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayPaymentDataDto;", "", "paymentRequest", "", "(Ljava/lang/String;)V", "getPaymentRequest", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GooglePayPaymentDataDto {
    @uca("paymentRequestV2")
    private final String paymentRequest;

    public GooglePayPaymentDataDto() {
        this(null, 1, null);
    }

    public static /* synthetic */ GooglePayPaymentDataDto copy$default(GooglePayPaymentDataDto googlePayPaymentDataDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePayPaymentDataDto.paymentRequest;
        }
        return googlePayPaymentDataDto.copy(str);
    }

    public final String component1() {
        return this.paymentRequest;
    }

    public final GooglePayPaymentDataDto copy(String str) {
        return new GooglePayPaymentDataDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GooglePayPaymentDataDto) && z65.c(this.paymentRequest, ((GooglePayPaymentDataDto) obj).paymentRequest)) {
            return true;
        }
        return false;
    }

    public final String getPaymentRequest() {
        return this.paymentRequest;
    }

    public int hashCode() {
        String str = this.paymentRequest;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.paymentRequest;
        return "GooglePayPaymentDataDto(paymentRequest=" + str + ")";
    }

    public GooglePayPaymentDataDto(String str) {
        this.paymentRequest = str;
    }

    public /* synthetic */ GooglePayPaymentDataDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
