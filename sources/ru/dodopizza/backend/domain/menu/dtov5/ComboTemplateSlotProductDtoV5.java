package ru.dodopizza.backend.domain.menu.dtov5;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: ComboTemplateSlotProductDtoV5.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/ComboTemplateSlotProductDtoV5;", "", "product", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/ProductDtoV5;", "extraPrice", "", "index", "", "(Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;DI)V", "getExtraPrice", "()D", "getIndex", "()I", "getProduct", "()Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboTemplateSlotProductDtoV5 {
    @uca("extraPrice")
    private final double extraPrice;
    @uca("index")
    private final int index;
    @uca("product")
    private final ReferenceWrapper<ProductDtoV5> product;

    public ComboTemplateSlotProductDtoV5(ReferenceWrapper<ProductDtoV5> referenceWrapper, double d, int i) {
        z65.h(referenceWrapper, "product");
        this.product = referenceWrapper;
        this.extraPrice = d;
        this.index = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComboTemplateSlotProductDtoV5 copy$default(ComboTemplateSlotProductDtoV5 comboTemplateSlotProductDtoV5, ReferenceWrapper referenceWrapper, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            referenceWrapper = comboTemplateSlotProductDtoV5.product;
        }
        if ((i2 & 2) != 0) {
            d = comboTemplateSlotProductDtoV5.extraPrice;
        }
        if ((i2 & 4) != 0) {
            i = comboTemplateSlotProductDtoV5.index;
        }
        return comboTemplateSlotProductDtoV5.copy(referenceWrapper, d, i);
    }

    public final ReferenceWrapper<ProductDtoV5> component1() {
        return this.product;
    }

    public final double component2() {
        return this.extraPrice;
    }

    public final int component3() {
        return this.index;
    }

    public final ComboTemplateSlotProductDtoV5 copy(ReferenceWrapper<ProductDtoV5> referenceWrapper, double d, int i) {
        z65.h(referenceWrapper, "product");
        return new ComboTemplateSlotProductDtoV5(referenceWrapper, d, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboTemplateSlotProductDtoV5)) {
            return false;
        }
        ComboTemplateSlotProductDtoV5 comboTemplateSlotProductDtoV5 = (ComboTemplateSlotProductDtoV5) obj;
        if (z65.c(this.product, comboTemplateSlotProductDtoV5.product) && Double.compare(this.extraPrice, comboTemplateSlotProductDtoV5.extraPrice) == 0 && this.index == comboTemplateSlotProductDtoV5.index) {
            return true;
        }
        return false;
    }

    public final double getExtraPrice() {
        return this.extraPrice;
    }

    public final int getIndex() {
        return this.index;
    }

    public final ReferenceWrapper<ProductDtoV5> getProduct() {
        return this.product;
    }

    public int hashCode() {
        return (((this.product.hashCode() * 31) + nkb.a(this.extraPrice)) * 31) + this.index;
    }

    public String toString() {
        ReferenceWrapper<ProductDtoV5> referenceWrapper = this.product;
        double d = this.extraPrice;
        int i = this.index;
        return "ComboTemplateSlotProductDtoV5(product=" + referenceWrapper + ", extraPrice=" + d + ", index=" + i + ")";
    }
}
