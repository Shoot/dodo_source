package ru.dodopizza.backend.domain.checkout.dto;

import kotlin.Metadata;
/* compiled from: CheckoutInfoDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/checkout/dto/CheckoutInfoDto;", "", "deferredIntervalsV1", "Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalsV1Dto;", "(Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalsV1Dto;)V", "getDeferredIntervalsV1", "()Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalsV1Dto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutInfoDto {
    @uca("deferredIntervalsV1")
    private final DeferredIntervalsV1Dto deferredIntervalsV1;

    public CheckoutInfoDto(DeferredIntervalsV1Dto deferredIntervalsV1Dto) {
        z65.h(deferredIntervalsV1Dto, "deferredIntervalsV1");
        this.deferredIntervalsV1 = deferredIntervalsV1Dto;
    }

    public static /* synthetic */ CheckoutInfoDto copy$default(CheckoutInfoDto checkoutInfoDto, DeferredIntervalsV1Dto deferredIntervalsV1Dto, int i, Object obj) {
        if ((i & 1) != 0) {
            deferredIntervalsV1Dto = checkoutInfoDto.deferredIntervalsV1;
        }
        return checkoutInfoDto.copy(deferredIntervalsV1Dto);
    }

    public final DeferredIntervalsV1Dto component1() {
        return this.deferredIntervalsV1;
    }

    public final CheckoutInfoDto copy(DeferredIntervalsV1Dto deferredIntervalsV1Dto) {
        z65.h(deferredIntervalsV1Dto, "deferredIntervalsV1");
        return new CheckoutInfoDto(deferredIntervalsV1Dto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CheckoutInfoDto) && z65.c(this.deferredIntervalsV1, ((CheckoutInfoDto) obj).deferredIntervalsV1)) {
            return true;
        }
        return false;
    }

    public final DeferredIntervalsV1Dto getDeferredIntervalsV1() {
        return this.deferredIntervalsV1;
    }

    public int hashCode() {
        return this.deferredIntervalsV1.hashCode();
    }

    public String toString() {
        DeferredIntervalsV1Dto deferredIntervalsV1Dto = this.deferredIntervalsV1;
        return "CheckoutInfoDto(deferredIntervalsV1=" + deferredIntervalsV1Dto + ")";
    }
}
