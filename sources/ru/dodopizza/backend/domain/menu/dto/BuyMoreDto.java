package ru.dodopizza.backend.domain.menu.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: BuyMoreDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/BuyMoreDto;", "", "shoppingItemIds", "", "", "(Ljava/util/List;)V", "getShoppingItemIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyMoreDto {
    @uca("shoppingItemIds")
    private final List<String> shoppingItemIds;

    public BuyMoreDto(List<String> list) {
        z65.h(list, "shoppingItemIds");
        this.shoppingItemIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyMoreDto copy$default(BuyMoreDto buyMoreDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = buyMoreDto.shoppingItemIds;
        }
        return buyMoreDto.copy(list);
    }

    public final List<String> component1() {
        return this.shoppingItemIds;
    }

    public final BuyMoreDto copy(List<String> list) {
        z65.h(list, "shoppingItemIds");
        return new BuyMoreDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BuyMoreDto) && z65.c(this.shoppingItemIds, ((BuyMoreDto) obj).shoppingItemIds)) {
            return true;
        }
        return false;
    }

    public final List<String> getShoppingItemIds() {
        return this.shoppingItemIds;
    }

    public int hashCode() {
        return this.shoppingItemIds.hashCode();
    }

    public String toString() {
        List<String> list = this.shoppingItemIds;
        return "BuyMoreDto(shoppingItemIds=" + list + ")";
    }
}
