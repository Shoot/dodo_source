package ru.dodopizza.backend.domain.loyalty.dto.referralsystem;

import kotlin.Metadata;
/* compiled from: EnterCodeAvailabilityDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/EnterCodeAvailabilityDto;", "", "isEnterCodeAvailable", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnterCodeAvailabilityDto {
    @uca("codeInputAvailable")
    private final boolean isEnterCodeAvailable;

    public EnterCodeAvailabilityDto(boolean z) {
        this.isEnterCodeAvailable = z;
    }

    public static /* synthetic */ EnterCodeAvailabilityDto copy$default(EnterCodeAvailabilityDto enterCodeAvailabilityDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = enterCodeAvailabilityDto.isEnterCodeAvailable;
        }
        return enterCodeAvailabilityDto.copy(z);
    }

    public final boolean component1() {
        return this.isEnterCodeAvailable;
    }

    public final EnterCodeAvailabilityDto copy(boolean z) {
        return new EnterCodeAvailabilityDto(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EnterCodeAvailabilityDto) && this.isEnterCodeAvailable == ((EnterCodeAvailabilityDto) obj).isEnterCodeAvailable) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return a91.a(this.isEnterCodeAvailable);
    }

    public final boolean isEnterCodeAvailable() {
        return this.isEnterCodeAvailable;
    }

    public String toString() {
        boolean z = this.isEnterCodeAvailable;
        return "EnterCodeAvailabilityDto(isEnterCodeAvailable=" + z + ")";
    }
}
