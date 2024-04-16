package ru.dodopizza.backend.domain.state.dto.payment;

import kotlin.Metadata;
/* compiled from: PaymentMethodRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\fJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodRequestDto;", "", "stateId", "", "paymentType", "", "cardId", "isRedirectSaveCardEnabled", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)V", "getCardId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymentType", "()I", "getStateId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodRequestDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentMethodRequestDto {
    @uca("cardId")
    private final String cardId;
    @uca("isRedirectSaveCardEnabled")
    private final Boolean isRedirectSaveCardEnabled;
    @uca("paymentType")
    private final int paymentType;
    @uca("stateId")
    private final String stateId;

    public PaymentMethodRequestDto(String str, int i, String str2, Boolean bool) {
        z65.h(str, "stateId");
        this.stateId = str;
        this.paymentType = i;
        this.cardId = str2;
        this.isRedirectSaveCardEnabled = bool;
    }

    public static /* synthetic */ PaymentMethodRequestDto copy$default(PaymentMethodRequestDto paymentMethodRequestDto, String str, int i, String str2, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentMethodRequestDto.stateId;
        }
        if ((i2 & 2) != 0) {
            i = paymentMethodRequestDto.paymentType;
        }
        if ((i2 & 4) != 0) {
            str2 = paymentMethodRequestDto.cardId;
        }
        if ((i2 & 8) != 0) {
            bool = paymentMethodRequestDto.isRedirectSaveCardEnabled;
        }
        return paymentMethodRequestDto.copy(str, i, str2, bool);
    }

    public final String component1() {
        return this.stateId;
    }

    public final int component2() {
        return this.paymentType;
    }

    public final String component3() {
        return this.cardId;
    }

    public final Boolean component4() {
        return this.isRedirectSaveCardEnabled;
    }

    public final PaymentMethodRequestDto copy(String str, int i, String str2, Boolean bool) {
        z65.h(str, "stateId");
        return new PaymentMethodRequestDto(str, i, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodRequestDto)) {
            return false;
        }
        PaymentMethodRequestDto paymentMethodRequestDto = (PaymentMethodRequestDto) obj;
        if (z65.c(this.stateId, paymentMethodRequestDto.stateId) && this.paymentType == paymentMethodRequestDto.paymentType && z65.c(this.cardId, paymentMethodRequestDto.cardId) && z65.c(this.isRedirectSaveCardEnabled, paymentMethodRequestDto.isRedirectSaveCardEnabled)) {
            return true;
        }
        return false;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final int getPaymentType() {
        return this.paymentType;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.stateId.hashCode() * 31) + this.paymentType) * 31;
        String str = this.cardId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Boolean bool = this.isRedirectSaveCardEnabled;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final Boolean isRedirectSaveCardEnabled() {
        return this.isRedirectSaveCardEnabled;
    }

    public String toString() {
        String str = this.stateId;
        int i = this.paymentType;
        String str2 = this.cardId;
        Boolean bool = this.isRedirectSaveCardEnabled;
        return "PaymentMethodRequestDto(stateId=" + str + ", paymentType=" + i + ", cardId=" + str2 + ", isRedirectSaveCardEnabled=" + bool + ")";
    }
}
