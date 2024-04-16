package ru.dodopizza.backend.domain.menu.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: HotAndReadyDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/HotAndReadyDto;", "", "products", "", "Lru/dodopizza/backend/domain/menu/dto/HotAndReadyItemDto;", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotAndReadyDto {
    @uca("products")
    private final List<HotAndReadyItemDto> products;

    public HotAndReadyDto(List<HotAndReadyItemDto> list) {
        this.products = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotAndReadyDto copy$default(HotAndReadyDto hotAndReadyDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hotAndReadyDto.products;
        }
        return hotAndReadyDto.copy(list);
    }

    public final List<HotAndReadyItemDto> component1() {
        return this.products;
    }

    public final HotAndReadyDto copy(List<HotAndReadyItemDto> list) {
        return new HotAndReadyDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HotAndReadyDto) && z65.c(this.products, ((HotAndReadyDto) obj).products)) {
            return true;
        }
        return false;
    }

    public final List<HotAndReadyItemDto> getProducts() {
        return this.products;
    }

    public int hashCode() {
        List<HotAndReadyItemDto> list = this.products;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<HotAndReadyItemDto> list = this.products;
        return "HotAndReadyDto(products=" + list + ")";
    }
}
