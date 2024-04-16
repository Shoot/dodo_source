package ru.dodopizza.backend.domain.cart.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: ComboCartItemDto.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/ComboCartItemDto;", "", "comboGuid", "", "totalPrice", "", "products", "", "Lru/dodopizza/backend/domain/cart/dto/ProductCartItemDto;", "(Ljava/lang/String;DLjava/util/List;)V", "getComboGuid", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "getTotalPrice", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboCartItemDto {
    @uca("comboId")
    private final String comboGuid;
    @uca("products")
    private final List<ProductCartItemDto> products;
    @uca("totalPrice")
    private final double totalPrice;

    public ComboCartItemDto(String str, double d, List<ProductCartItemDto> list) {
        z65.h(str, "comboGuid");
        z65.h(list, "products");
        this.comboGuid = str;
        this.totalPrice = d;
        this.products = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComboCartItemDto copy$default(ComboCartItemDto comboCartItemDto, String str, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comboCartItemDto.comboGuid;
        }
        if ((i & 2) != 0) {
            d = comboCartItemDto.totalPrice;
        }
        if ((i & 4) != 0) {
            list = comboCartItemDto.products;
        }
        return comboCartItemDto.copy(str, d, list);
    }

    public final String component1() {
        return this.comboGuid;
    }

    public final double component2() {
        return this.totalPrice;
    }

    public final List<ProductCartItemDto> component3() {
        return this.products;
    }

    public final ComboCartItemDto copy(String str, double d, List<ProductCartItemDto> list) {
        z65.h(str, "comboGuid");
        z65.h(list, "products");
        return new ComboCartItemDto(str, d, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboCartItemDto)) {
            return false;
        }
        ComboCartItemDto comboCartItemDto = (ComboCartItemDto) obj;
        if (z65.c(this.comboGuid, comboCartItemDto.comboGuid) && Double.compare(this.totalPrice, comboCartItemDto.totalPrice) == 0 && z65.c(this.products, comboCartItemDto.products)) {
            return true;
        }
        return false;
    }

    public final String getComboGuid() {
        return this.comboGuid;
    }

    public final List<ProductCartItemDto> getProducts() {
        return this.products;
    }

    public final double getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        return (((this.comboGuid.hashCode() * 31) + nkb.a(this.totalPrice)) * 31) + this.products.hashCode();
    }

    public String toString() {
        String str = this.comboGuid;
        double d = this.totalPrice;
        List<ProductCartItemDto> list = this.products;
        return "ComboCartItemDto(comboGuid=" + str + ", totalPrice=" + d + ", products=" + list + ")";
    }
}
