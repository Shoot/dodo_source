package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: PaymentCardResponseDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PaymentCardResponseDto;", "", "id", "", Action.NAME_ATTRIBUTE, "providerName", "providerCode", MessageAttributes.TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getProviderCode", "getProviderName", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentCardResponseDto {
    private final String id;
    private final String name;
    private final String providerCode;
    private final String providerName;
    private final String type;

    public PaymentCardResponseDto(String str, String str2, String str3, String str4, String str5) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "providerName");
        z65.h(str4, "providerCode");
        z65.h(str5, MessageAttributes.TYPE);
        this.id = str;
        this.name = str2;
        this.providerName = str3;
        this.providerCode = str4;
        this.type = str5;
    }

    public static /* synthetic */ PaymentCardResponseDto copy$default(PaymentCardResponseDto paymentCardResponseDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentCardResponseDto.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentCardResponseDto.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = paymentCardResponseDto.providerName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = paymentCardResponseDto.providerCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = paymentCardResponseDto.type;
        }
        return paymentCardResponseDto.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.providerName;
    }

    public final String component4() {
        return this.providerCode;
    }

    public final String component5() {
        return this.type;
    }

    public final PaymentCardResponseDto copy(String str, String str2, String str3, String str4, String str5) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "providerName");
        z65.h(str4, "providerCode");
        z65.h(str5, MessageAttributes.TYPE);
        return new PaymentCardResponseDto(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCardResponseDto)) {
            return false;
        }
        PaymentCardResponseDto paymentCardResponseDto = (PaymentCardResponseDto) obj;
        if (z65.c(this.id, paymentCardResponseDto.id) && z65.c(this.name, paymentCardResponseDto.name) && z65.c(this.providerName, paymentCardResponseDto.providerName) && z65.c(this.providerCode, paymentCardResponseDto.providerCode) && z65.c(this.type, paymentCardResponseDto.type)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProviderCode() {
        return this.providerCode;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.providerName.hashCode()) * 31) + this.providerCode.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PaymentCardResponseDto(id=" + this.id + ", name=" + this.name + ", providerName=" + this.providerName + ", providerCode=" + this.providerCode + ", type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
