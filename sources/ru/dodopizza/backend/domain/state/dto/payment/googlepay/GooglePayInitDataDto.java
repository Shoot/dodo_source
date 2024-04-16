package ru.dodopizza.backend.domain.state.dto.payment.googlepay;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GooglePayInitDataDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayInitDataDto;", "", "paymentOptions", "Lru/dodopizza/backend/domain/state/dto/payment/googlepay/PaymentOptionsDto;", "isReadyToPayRequest", "", "(Lru/dodopizza/backend/domain/state/dto/payment/googlepay/PaymentOptionsDto;Ljava/lang/String;)V", "()Ljava/lang/String;", "getPaymentOptions", "()Lru/dodopizza/backend/domain/state/dto/payment/googlepay/PaymentOptionsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GooglePayInitDataDto {
    @uca("isReadyToPayRequestV2")
    private final String isReadyToPayRequest;
    @uca("paymentOptionsV2")
    private final PaymentOptionsDto paymentOptions;

    public GooglePayInitDataDto() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ GooglePayInitDataDto copy$default(GooglePayInitDataDto googlePayInitDataDto, PaymentOptionsDto paymentOptionsDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentOptionsDto = googlePayInitDataDto.paymentOptions;
        }
        if ((i & 2) != 0) {
            str = googlePayInitDataDto.isReadyToPayRequest;
        }
        return googlePayInitDataDto.copy(paymentOptionsDto, str);
    }

    public final PaymentOptionsDto component1() {
        return this.paymentOptions;
    }

    public final String component2() {
        return this.isReadyToPayRequest;
    }

    public final GooglePayInitDataDto copy(PaymentOptionsDto paymentOptionsDto, String str) {
        return new GooglePayInitDataDto(paymentOptionsDto, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayInitDataDto)) {
            return false;
        }
        GooglePayInitDataDto googlePayInitDataDto = (GooglePayInitDataDto) obj;
        if (z65.c(this.paymentOptions, googlePayInitDataDto.paymentOptions) && z65.c(this.isReadyToPayRequest, googlePayInitDataDto.isReadyToPayRequest)) {
            return true;
        }
        return false;
    }

    public final PaymentOptionsDto getPaymentOptions() {
        return this.paymentOptions;
    }

    public int hashCode() {
        int hashCode;
        PaymentOptionsDto paymentOptionsDto = this.paymentOptions;
        int i = 0;
        if (paymentOptionsDto == null) {
            hashCode = 0;
        } else {
            hashCode = paymentOptionsDto.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.isReadyToPayRequest;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String isReadyToPayRequest() {
        return this.isReadyToPayRequest;
    }

    public String toString() {
        PaymentOptionsDto paymentOptionsDto = this.paymentOptions;
        String str = this.isReadyToPayRequest;
        return "GooglePayInitDataDto(paymentOptions=" + paymentOptionsDto + ", isReadyToPayRequest=" + str + ")";
    }

    public GooglePayInitDataDto(PaymentOptionsDto paymentOptionsDto, String str) {
        this.paymentOptions = paymentOptionsDto;
        this.isReadyToPayRequest = str;
    }

    public /* synthetic */ GooglePayInitDataDto(PaymentOptionsDto paymentOptionsDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentOptionsDto, (i & 2) != 0 ? null : str);
    }
}
