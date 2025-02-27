package ru.dodopizza.backend.domain.menu.dtov5;

import java.util.List;
import kotlin.Metadata;
/* compiled from: HotAndReadyDtoV5.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/HotAndReadyDtoV5;", "", "items", "", "Lru/dodopizza/backend/domain/menu/dtov5/HotAndReadyItemDtoV5;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotAndReadyDtoV5 {
    @uca("items")
    private final List<HotAndReadyItemDtoV5> items;

    public HotAndReadyDtoV5(List<HotAndReadyItemDtoV5> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotAndReadyDtoV5 copy$default(HotAndReadyDtoV5 hotAndReadyDtoV5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hotAndReadyDtoV5.items;
        }
        return hotAndReadyDtoV5.copy(list);
    }

    public final List<HotAndReadyItemDtoV5> component1() {
        return this.items;
    }

    public final HotAndReadyDtoV5 copy(List<HotAndReadyItemDtoV5> list) {
        return new HotAndReadyDtoV5(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HotAndReadyDtoV5) && z65.c(this.items, ((HotAndReadyDtoV5) obj).items)) {
            return true;
        }
        return false;
    }

    public final List<HotAndReadyItemDtoV5> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<HotAndReadyItemDtoV5> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<HotAndReadyItemDtoV5> list = this.items;
        return "HotAndReadyDtoV5(items=" + list + ")";
    }
}
