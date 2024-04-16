package ru.dodopizza.backend.domain.customer.dto;

import kotlin.Metadata;
/* compiled from: NeedSubscriptionRequestDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/NeedSubscriptionRequestDto;", "", "needSubscription", "", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedSubscriptionRequestDto {
    @uca("NeedSubscribe")
    private final boolean needSubscription;

    public NeedSubscriptionRequestDto(boolean z) {
        this.needSubscription = z;
    }

    private final boolean component1() {
        return this.needSubscription;
    }

    public static /* synthetic */ NeedSubscriptionRequestDto copy$default(NeedSubscriptionRequestDto needSubscriptionRequestDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = needSubscriptionRequestDto.needSubscription;
        }
        return needSubscriptionRequestDto.copy(z);
    }

    public final NeedSubscriptionRequestDto copy(boolean z) {
        return new NeedSubscriptionRequestDto(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof NeedSubscriptionRequestDto) && this.needSubscription == ((NeedSubscriptionRequestDto) obj).needSubscription) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return a91.a(this.needSubscription);
    }

    public String toString() {
        boolean z = this.needSubscription;
        return "NeedSubscriptionRequestDto(needSubscription=" + z + ")";
    }
}
