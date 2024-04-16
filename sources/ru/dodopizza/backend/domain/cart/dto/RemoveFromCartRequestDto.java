package ru.dodopizza.backend.domain.cart.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RemoveFromCartRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/RemoveFromCartRequestDto;", "", "count", "", "cartItemId", "", "stateId", "(ILjava/lang/String;Ljava/lang/String;)V", "getCartItemId", "()Ljava/lang/String;", "getCount", "()I", "getStateId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoveFromCartRequestDto {
    @uca("cartItemId")
    private final String cartItemId;
    @uca("count")
    private final int count;
    @uca("stateId")
    private final String stateId;

    public RemoveFromCartRequestDto() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ RemoveFromCartRequestDto copy$default(RemoveFromCartRequestDto removeFromCartRequestDto, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = removeFromCartRequestDto.count;
        }
        if ((i2 & 2) != 0) {
            str = removeFromCartRequestDto.cartItemId;
        }
        if ((i2 & 4) != 0) {
            str2 = removeFromCartRequestDto.stateId;
        }
        return removeFromCartRequestDto.copy(i, str, str2);
    }

    public final int component1() {
        return this.count;
    }

    public final String component2() {
        return this.cartItemId;
    }

    public final String component3() {
        return this.stateId;
    }

    public final RemoveFromCartRequestDto copy(int i, String str, String str2) {
        z65.h(str, "cartItemId");
        z65.h(str2, "stateId");
        return new RemoveFromCartRequestDto(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveFromCartRequestDto)) {
            return false;
        }
        RemoveFromCartRequestDto removeFromCartRequestDto = (RemoveFromCartRequestDto) obj;
        if (this.count == removeFromCartRequestDto.count && z65.c(this.cartItemId, removeFromCartRequestDto.cartItemId) && z65.c(this.stateId, removeFromCartRequestDto.stateId)) {
            return true;
        }
        return false;
    }

    public final String getCartItemId() {
        return this.cartItemId;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return (((this.count * 31) + this.cartItemId.hashCode()) * 31) + this.stateId.hashCode();
    }

    public String toString() {
        int i = this.count;
        String str = this.cartItemId;
        String str2 = this.stateId;
        return "RemoveFromCartRequestDto(count=" + i + ", cartItemId=" + str + ", stateId=" + str2 + ")";
    }

    public RemoveFromCartRequestDto(int i, String str, String str2) {
        z65.h(str, "cartItemId");
        z65.h(str2, "stateId");
        this.count = i;
        this.cartItemId = str;
        this.stateId = str2;
    }

    public /* synthetic */ RemoveFromCartRequestDto(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
