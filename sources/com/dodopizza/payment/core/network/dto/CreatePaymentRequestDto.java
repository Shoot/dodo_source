package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CreatePaymentRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/CreatePaymentRequestDto;", "", "orderId", "", "paymentMethodId", "mobileOsType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMobileOsType", "()Ljava/lang/String;", "getOrderId", "getPaymentMethodId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CreatePaymentRequestDto {
    private final String mobileOsType;
    private final String orderId;
    private final String paymentMethodId;

    public CreatePaymentRequestDto(String str, String str2, String str3) {
        z65.h(str, "orderId");
        z65.h(str2, "paymentMethodId");
        z65.h(str3, "mobileOsType");
        this.orderId = str;
        this.paymentMethodId = str2;
        this.mobileOsType = str3;
    }

    public static /* synthetic */ CreatePaymentRequestDto copy$default(CreatePaymentRequestDto createPaymentRequestDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createPaymentRequestDto.orderId;
        }
        if ((i & 2) != 0) {
            str2 = createPaymentRequestDto.paymentMethodId;
        }
        if ((i & 4) != 0) {
            str3 = createPaymentRequestDto.mobileOsType;
        }
        return createPaymentRequestDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.paymentMethodId;
    }

    public final String component3() {
        return this.mobileOsType;
    }

    public final CreatePaymentRequestDto copy(String str, String str2, String str3) {
        z65.h(str, "orderId");
        z65.h(str2, "paymentMethodId");
        z65.h(str3, "mobileOsType");
        return new CreatePaymentRequestDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePaymentRequestDto)) {
            return false;
        }
        CreatePaymentRequestDto createPaymentRequestDto = (CreatePaymentRequestDto) obj;
        if (z65.c(this.orderId, createPaymentRequestDto.orderId) && z65.c(this.paymentMethodId, createPaymentRequestDto.paymentMethodId) && z65.c(this.mobileOsType, createPaymentRequestDto.mobileOsType)) {
            return true;
        }
        return false;
    }

    public final String getMobileOsType() {
        return this.mobileOsType;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public int hashCode() {
        return (((this.orderId.hashCode() * 31) + this.paymentMethodId.hashCode()) * 31) + this.mobileOsType.hashCode();
    }

    public String toString() {
        return "CreatePaymentRequestDto(orderId=" + this.orderId + ", paymentMethodId=" + this.paymentMethodId + ", mobileOsType=" + this.mobileOsType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ CreatePaymentRequestDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "android" : str3);
    }
}
