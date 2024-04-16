package ru.dodopizza.backend.domain.checkout.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: DeferredIntervalsV1Dto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalsV1Dto;", "", "information", "", "items", "", "Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalItemDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getInformation", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredIntervalsV1Dto {
    @uca("information")
    private final String information;
    @uca("items")
    private final List<DeferredIntervalItemDto> items;

    public DeferredIntervalsV1Dto(String str, List<DeferredIntervalItemDto> list) {
        z65.h(list, "items");
        this.information = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeferredIntervalsV1Dto copy$default(DeferredIntervalsV1Dto deferredIntervalsV1Dto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deferredIntervalsV1Dto.information;
        }
        if ((i & 2) != 0) {
            list = deferredIntervalsV1Dto.items;
        }
        return deferredIntervalsV1Dto.copy(str, list);
    }

    public final String component1() {
        return this.information;
    }

    public final List<DeferredIntervalItemDto> component2() {
        return this.items;
    }

    public final DeferredIntervalsV1Dto copy(String str, List<DeferredIntervalItemDto> list) {
        z65.h(list, "items");
        return new DeferredIntervalsV1Dto(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeferredIntervalsV1Dto)) {
            return false;
        }
        DeferredIntervalsV1Dto deferredIntervalsV1Dto = (DeferredIntervalsV1Dto) obj;
        if (z65.c(this.information, deferredIntervalsV1Dto.information) && z65.c(this.items, deferredIntervalsV1Dto.items)) {
            return true;
        }
        return false;
    }

    public final String getInformation() {
        return this.information;
    }

    public final List<DeferredIntervalItemDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        int hashCode;
        String str = this.information;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.items.hashCode();
    }

    public String toString() {
        String str = this.information;
        List<DeferredIntervalItemDto> list = this.items;
        return "DeferredIntervalsV1Dto(information=" + str + ", items=" + list + ")";
    }
}
