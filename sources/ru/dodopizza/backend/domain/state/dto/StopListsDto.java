package ru.dodopizza.backend.domain.state.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StopListsDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/StopListsDto;", "", "productIds", "", "", "toppingIds", "(Ljava/util/List;Ljava/util/List;)V", "getProductIds", "()Ljava/util/List;", "getToppingIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StopListsDto {
    @uca("productIds")
    private final List<String> productIds;
    @uca("toppingIds")
    private final List<String> toppingIds;

    public StopListsDto() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StopListsDto copy$default(StopListsDto stopListsDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stopListsDto.productIds;
        }
        if ((i & 2) != 0) {
            list2 = stopListsDto.toppingIds;
        }
        return stopListsDto.copy(list, list2);
    }

    public final List<String> component1() {
        return this.productIds;
    }

    public final List<String> component2() {
        return this.toppingIds;
    }

    public final StopListsDto copy(List<String> list, List<String> list2) {
        z65.h(list, "productIds");
        z65.h(list2, "toppingIds");
        return new StopListsDto(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopListsDto)) {
            return false;
        }
        StopListsDto stopListsDto = (StopListsDto) obj;
        if (z65.c(this.productIds, stopListsDto.productIds) && z65.c(this.toppingIds, stopListsDto.toppingIds)) {
            return true;
        }
        return false;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final List<String> getToppingIds() {
        return this.toppingIds;
    }

    public int hashCode() {
        return (this.productIds.hashCode() * 31) + this.toppingIds.hashCode();
    }

    public String toString() {
        List<String> list = this.productIds;
        List<String> list2 = this.toppingIds;
        return "StopListsDto(productIds=" + list + ", toppingIds=" + list2 + ")";
    }

    public StopListsDto(List<String> list, List<String> list2) {
        z65.h(list, "productIds");
        z65.h(list2, "toppingIds");
        this.productIds = list;
        this.toppingIds = list2;
    }

    public /* synthetic */ StopListsDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list, (i & 2) != 0 ? kc1.l() : list2);
    }
}
