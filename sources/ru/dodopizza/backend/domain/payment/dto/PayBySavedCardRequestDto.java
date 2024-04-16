package ru.dodopizza.backend.domain.payment.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PayBySavedCardRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/PayBySavedCardRequestDto;", "", "stateId", "", "(Ljava/lang/String;)V", "getStateId", "()Ljava/lang/String;", "setStateId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayBySavedCardRequestDto {
    @uca("stateId")
    private String stateId;

    public PayBySavedCardRequestDto() {
        this(null, 1, null);
    }

    public static /* synthetic */ PayBySavedCardRequestDto copy$default(PayBySavedCardRequestDto payBySavedCardRequestDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payBySavedCardRequestDto.stateId;
        }
        return payBySavedCardRequestDto.copy(str);
    }

    public final String component1() {
        return this.stateId;
    }

    public final PayBySavedCardRequestDto copy(String str) {
        z65.h(str, "stateId");
        return new PayBySavedCardRequestDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PayBySavedCardRequestDto) && z65.c(this.stateId, ((PayBySavedCardRequestDto) obj).stateId)) {
            return true;
        }
        return false;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return this.stateId.hashCode();
    }

    public final void setStateId(String str) {
        z65.h(str, "<set-?>");
        this.stateId = str;
    }

    public String toString() {
        String str = this.stateId;
        return "PayBySavedCardRequestDto(stateId=" + str + ")";
    }

    public PayBySavedCardRequestDto(String str) {
        z65.h(str, "stateId");
        this.stateId = str;
    }

    public /* synthetic */ PayBySavedCardRequestDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
