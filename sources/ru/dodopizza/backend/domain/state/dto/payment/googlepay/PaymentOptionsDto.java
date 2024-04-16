package ru.dodopizza.backend.domain.state.dto.payment.googlepay;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentOptionsDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/googlepay/PaymentOptionsDto;", "", "environment", "", "(Ljava/lang/String;)V", "getEnvironment", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentOptionsDto {
    @uca("environment")
    private final String environment;

    public PaymentOptionsDto() {
        this(null, 1, null);
    }

    public static /* synthetic */ PaymentOptionsDto copy$default(PaymentOptionsDto paymentOptionsDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentOptionsDto.environment;
        }
        return paymentOptionsDto.copy(str);
    }

    public final String component1() {
        return this.environment;
    }

    public final PaymentOptionsDto copy(String str) {
        return new PaymentOptionsDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PaymentOptionsDto) && z65.c(this.environment, ((PaymentOptionsDto) obj).environment)) {
            return true;
        }
        return false;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public int hashCode() {
        String str = this.environment;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.environment;
        return "PaymentOptionsDto(environment=" + str + ")";
    }

    public PaymentOptionsDto(String str) {
        this.environment = str;
    }

    public /* synthetic */ PaymentOptionsDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
