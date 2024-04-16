package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: CreatePaymentResponseDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/CreatePaymentResponseDto;", "", "paymentId", "", "(Ljava/lang/String;)V", "getPaymentId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CreatePaymentResponseDto {
    private final String paymentId;

    public CreatePaymentResponseDto(String str) {
        z65.h(str, "paymentId");
        this.paymentId = str;
    }

    public static /* synthetic */ CreatePaymentResponseDto copy$default(CreatePaymentResponseDto createPaymentResponseDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createPaymentResponseDto.paymentId;
        }
        return createPaymentResponseDto.copy(str);
    }

    public final String component1() {
        return this.paymentId;
    }

    public final CreatePaymentResponseDto copy(String str) {
        z65.h(str, "paymentId");
        return new CreatePaymentResponseDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CreatePaymentResponseDto) && z65.c(this.paymentId, ((CreatePaymentResponseDto) obj).paymentId)) {
            return true;
        }
        return false;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        return this.paymentId.hashCode();
    }

    public String toString() {
        return "CreatePaymentResponseDto(paymentId=" + this.paymentId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
