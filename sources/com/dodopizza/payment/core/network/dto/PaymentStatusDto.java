package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentStatusDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PaymentStatusDto;", "", "id", "", "status", "errorCode", "threeDsPayload", "Lcom/dodopizza/payment/core/network/dto/ThreeDsPayload;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dodopizza/payment/core/network/dto/ThreeDsPayload;)V", "getErrorCode", "()Ljava/lang/String;", "getId", "getStatus", "getThreeDsPayload", "()Lcom/dodopizza/payment/core/network/dto/ThreeDsPayload;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentStatusDto {
    public static final Companion Companion = new Companion(null);
    public static final String PAYMENT_STATUS_CREATED = "Created";
    public static final String PAYMENT_STATUS_FAILED = "Failed";
    public static final String PAYMENT_STATUS_PAID = "Paid";
    public static final String PAYMENT_STATUS_STARTED = "Started";
    public static final String PAYMENT_THREE_DS_REQUIRED = "ThreeDsRequired";
    private final String errorCode;
    private final String id;
    private final String status;
    private final ThreeDsPayload threeDsPayload;

    /* compiled from: PaymentStatusDto.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PaymentStatusDto$Companion;", "", "()V", "PAYMENT_STATUS_CREATED", "", "PAYMENT_STATUS_FAILED", "PAYMENT_STATUS_PAID", "PAYMENT_STATUS_STARTED", "PAYMENT_THREE_DS_REQUIRED", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PaymentStatusDto(String str, String str2, String str3, ThreeDsPayload threeDsPayload) {
        z65.h(str, "id");
        z65.h(str2, "status");
        z65.h(threeDsPayload, "threeDsPayload");
        this.id = str;
        this.status = str2;
        this.errorCode = str3;
        this.threeDsPayload = threeDsPayload;
    }

    public static /* synthetic */ PaymentStatusDto copy$default(PaymentStatusDto paymentStatusDto, String str, String str2, String str3, ThreeDsPayload threeDsPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentStatusDto.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentStatusDto.status;
        }
        if ((i & 4) != 0) {
            str3 = paymentStatusDto.errorCode;
        }
        if ((i & 8) != 0) {
            threeDsPayload = paymentStatusDto.threeDsPayload;
        }
        return paymentStatusDto.copy(str, str2, str3, threeDsPayload);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.errorCode;
    }

    public final ThreeDsPayload component4() {
        return this.threeDsPayload;
    }

    public final PaymentStatusDto copy(String str, String str2, String str3, ThreeDsPayload threeDsPayload) {
        z65.h(str, "id");
        z65.h(str2, "status");
        z65.h(threeDsPayload, "threeDsPayload");
        return new PaymentStatusDto(str, str2, str3, threeDsPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentStatusDto)) {
            return false;
        }
        PaymentStatusDto paymentStatusDto = (PaymentStatusDto) obj;
        if (z65.c(this.id, paymentStatusDto.id) && z65.c(this.status, paymentStatusDto.status) && z65.c(this.errorCode, paymentStatusDto.errorCode) && z65.c(this.threeDsPayload, paymentStatusDto.threeDsPayload)) {
            return true;
        }
        return false;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final ThreeDsPayload getThreeDsPayload() {
        return this.threeDsPayload;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.id.hashCode() * 31) + this.status.hashCode()) * 31;
        String str = this.errorCode;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.threeDsPayload.hashCode();
    }

    public String toString() {
        return "PaymentStatusDto(id=" + this.id + ", status=" + this.status + ", errorCode=" + this.errorCode + ", threeDsPayload=" + this.threeDsPayload + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
