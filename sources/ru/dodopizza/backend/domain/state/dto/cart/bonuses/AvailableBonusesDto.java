package ru.dodopizza.backend.domain.state.dto.cart.bonuses;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.cart.response.CartItemResponseDto;
/* compiled from: AvailableBonusesDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AvailableBonusesDto;", "", "giftItems", "", "Lru/dodopizza/backend/domain/state/dto/cart/response/CartItemResponseDto;", "(Ljava/util/List;)V", "getGiftItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvailableBonusesDto {
    @uca("giftItems")
    private final List<CartItemResponseDto> giftItems;

    public AvailableBonusesDto() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableBonusesDto copy$default(AvailableBonusesDto availableBonusesDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = availableBonusesDto.giftItems;
        }
        return availableBonusesDto.copy(list);
    }

    public final List<CartItemResponseDto> component1() {
        return this.giftItems;
    }

    public final AvailableBonusesDto copy(List<CartItemResponseDto> list) {
        z65.h(list, "giftItems");
        return new AvailableBonusesDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AvailableBonusesDto) && z65.c(this.giftItems, ((AvailableBonusesDto) obj).giftItems)) {
            return true;
        }
        return false;
    }

    public final List<CartItemResponseDto> getGiftItems() {
        return this.giftItems;
    }

    public int hashCode() {
        return this.giftItems.hashCode();
    }

    public String toString() {
        List<CartItemResponseDto> list = this.giftItems;
        return "AvailableBonusesDto(giftItems=" + list + ")";
    }

    public AvailableBonusesDto(List<CartItemResponseDto> list) {
        z65.h(list, "giftItems");
        this.giftItems = list;
    }

    public /* synthetic */ AvailableBonusesDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list);
    }
}
