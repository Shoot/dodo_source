package ru.dodopizza.backend.domain.state.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.cart.dto.UpsaleProductDto;
/* compiled from: UpsaleDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/UpsaleDto;", "", "products", "", "Lru/dodopizza/backend/domain/cart/dto/UpsaleProductDto;", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "setProducts", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpsaleDto {
    @uca("products")
    private List<UpsaleProductDto> products;

    public UpsaleDto() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpsaleDto copy$default(UpsaleDto upsaleDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = upsaleDto.products;
        }
        return upsaleDto.copy(list);
    }

    public final List<UpsaleProductDto> component1() {
        return this.products;
    }

    public final UpsaleDto copy(List<UpsaleProductDto> list) {
        z65.h(list, "products");
        return new UpsaleDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UpsaleDto) && z65.c(this.products, ((UpsaleDto) obj).products)) {
            return true;
        }
        return false;
    }

    public final List<UpsaleProductDto> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.products.hashCode();
    }

    public final void setProducts(List<UpsaleProductDto> list) {
        z65.h(list, "<set-?>");
        this.products = list;
    }

    public String toString() {
        List<UpsaleProductDto> list = this.products;
        return "UpsaleDto(products=" + list + ")";
    }

    public UpsaleDto(List<UpsaleProductDto> list) {
        z65.h(list, "products");
        this.products = list;
    }

    public /* synthetic */ UpsaleDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list);
    }
}
