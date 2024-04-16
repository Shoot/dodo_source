package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CancelOrderResponseDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/CancelOrderResponseDto;", "", "error", "", "(Ljava/lang/Integer;)V", "getError", "()Ljava/lang/Integer;", "setError", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lru/dodopizza/backend/domain/order/dto/CancelOrderResponseDto;", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CancelOrderResponseDto {
    @uca("error")
    private Integer error;

    public CancelOrderResponseDto() {
        this(null, 1, null);
    }

    public static /* synthetic */ CancelOrderResponseDto copy$default(CancelOrderResponseDto cancelOrderResponseDto, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = cancelOrderResponseDto.error;
        }
        return cancelOrderResponseDto.copy(num);
    }

    public final Integer component1() {
        return this.error;
    }

    public final CancelOrderResponseDto copy(Integer num) {
        return new CancelOrderResponseDto(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CancelOrderResponseDto) && z65.c(this.error, ((CancelOrderResponseDto) obj).error)) {
            return true;
        }
        return false;
    }

    public final Integer getError() {
        return this.error;
    }

    public int hashCode() {
        Integer num = this.error;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setError(Integer num) {
        this.error = num;
    }

    public String toString() {
        Integer num = this.error;
        return "CancelOrderResponseDto(error=" + num + ")";
    }

    public CancelOrderResponseDto(Integer num) {
        this.error = num;
    }

    public /* synthetic */ CancelOrderResponseDto(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
