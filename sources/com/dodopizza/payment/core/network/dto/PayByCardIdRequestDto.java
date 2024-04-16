package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: PayByCardIdRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PayByCardIdRequestDto;", "", "paymentId", "", "cardId", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getPaymentId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PayByCardIdRequestDto {
    private final String cardId;
    private final String paymentId;

    public PayByCardIdRequestDto(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, "cardId");
        this.paymentId = str;
        this.cardId = str2;
    }

    public static /* synthetic */ PayByCardIdRequestDto copy$default(PayByCardIdRequestDto payByCardIdRequestDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payByCardIdRequestDto.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = payByCardIdRequestDto.cardId;
        }
        return payByCardIdRequestDto.copy(str, str2);
    }

    public final String component1() {
        return this.paymentId;
    }

    public final String component2() {
        return this.cardId;
    }

    public final PayByCardIdRequestDto copy(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, "cardId");
        return new PayByCardIdRequestDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayByCardIdRequestDto)) {
            return false;
        }
        PayByCardIdRequestDto payByCardIdRequestDto = (PayByCardIdRequestDto) obj;
        if (z65.c(this.paymentId, payByCardIdRequestDto.paymentId) && z65.c(this.cardId, payByCardIdRequestDto.cardId)) {
            return true;
        }
        return false;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        return (this.paymentId.hashCode() * 31) + this.cardId.hashCode();
    }

    public String toString() {
        return "PayByCardIdRequestDto(paymentId=" + this.paymentId + ", cardId=" + this.cardId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
