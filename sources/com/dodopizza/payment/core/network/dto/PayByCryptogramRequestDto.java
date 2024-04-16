package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: PayByCryptogramRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PayByCryptogramRequestDto;", "", "paymentId", "", "cryptogram", "saveCard", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCryptogram", "()Ljava/lang/String;", "getPaymentId", "getSaveCard", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PayByCryptogramRequestDto {
    private final String cryptogram;
    private final String paymentId;
    private final boolean saveCard;

    public PayByCryptogramRequestDto(String str, String str2, boolean z) {
        z65.h(str, "paymentId");
        z65.h(str2, "cryptogram");
        this.paymentId = str;
        this.cryptogram = str2;
        this.saveCard = z;
    }

    public static /* synthetic */ PayByCryptogramRequestDto copy$default(PayByCryptogramRequestDto payByCryptogramRequestDto, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payByCryptogramRequestDto.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = payByCryptogramRequestDto.cryptogram;
        }
        if ((i & 4) != 0) {
            z = payByCryptogramRequestDto.saveCard;
        }
        return payByCryptogramRequestDto.copy(str, str2, z);
    }

    public final String component1() {
        return this.paymentId;
    }

    public final String component2() {
        return this.cryptogram;
    }

    public final boolean component3() {
        return this.saveCard;
    }

    public final PayByCryptogramRequestDto copy(String str, String str2, boolean z) {
        z65.h(str, "paymentId");
        z65.h(str2, "cryptogram");
        return new PayByCryptogramRequestDto(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayByCryptogramRequestDto)) {
            return false;
        }
        PayByCryptogramRequestDto payByCryptogramRequestDto = (PayByCryptogramRequestDto) obj;
        if (z65.c(this.paymentId, payByCryptogramRequestDto.paymentId) && z65.c(this.cryptogram, payByCryptogramRequestDto.cryptogram) && this.saveCard == payByCryptogramRequestDto.saveCard) {
            return true;
        }
        return false;
    }

    public final String getCryptogram() {
        return this.cryptogram;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final boolean getSaveCard() {
        return this.saveCard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.paymentId.hashCode() * 31) + this.cryptogram.hashCode()) * 31;
        boolean z = this.saveCard;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "PayByCryptogramRequestDto(paymentId=" + this.paymentId + ", cryptogram=" + this.cryptogram + ", saveCard=" + this.saveCard + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
