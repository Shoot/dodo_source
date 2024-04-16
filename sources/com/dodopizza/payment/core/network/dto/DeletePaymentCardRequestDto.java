package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: DeletePaymentCardRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/DeletePaymentCardRequestDto;", "", "cardId", "", "(Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeletePaymentCardRequestDto {
    private final String cardId;

    public DeletePaymentCardRequestDto(String str) {
        z65.h(str, "cardId");
        this.cardId = str;
    }

    public static /* synthetic */ DeletePaymentCardRequestDto copy$default(DeletePaymentCardRequestDto deletePaymentCardRequestDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deletePaymentCardRequestDto.cardId;
        }
        return deletePaymentCardRequestDto.copy(str);
    }

    public final String component1() {
        return this.cardId;
    }

    public final DeletePaymentCardRequestDto copy(String str) {
        z65.h(str, "cardId");
        return new DeletePaymentCardRequestDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DeletePaymentCardRequestDto) && z65.c(this.cardId, ((DeletePaymentCardRequestDto) obj).cardId)) {
            return true;
        }
        return false;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public int hashCode() {
        return this.cardId.hashCode();
    }

    public String toString() {
        return "DeletePaymentCardRequestDto(cardId=" + this.cardId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
