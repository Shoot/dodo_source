package ru.dodopizza.backend.domain.menu.dtov5;

import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: VariationDtoV5.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/VariationDtoV5;", "", "product", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/ProductDtoV5;", "index", "", "isDefault", "", "additionalData", "", "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "(Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;IZLjava/util/List;)V", "getAdditionalData", "()Ljava/util/List;", "getIndex", "()I", "()Z", "getProduct", "()Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VariationDtoV5 {
    @uca("additionalData")
    private final List<AdditionalDataDtoV5> additionalData;
    @uca("index")
    private final int index;
    @uca("isDefault")
    private final boolean isDefault;
    @uca("product")
    private final ReferenceWrapper<ProductDtoV5> product;

    public VariationDtoV5(ReferenceWrapper<ProductDtoV5> referenceWrapper, int i, boolean z, List<AdditionalDataDtoV5> list) {
        z65.h(referenceWrapper, "product");
        z65.h(list, "additionalData");
        this.product = referenceWrapper;
        this.index = i;
        this.isDefault = z;
        this.additionalData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VariationDtoV5 copy$default(VariationDtoV5 variationDtoV5, ReferenceWrapper referenceWrapper, int i, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            referenceWrapper = variationDtoV5.product;
        }
        if ((i2 & 2) != 0) {
            i = variationDtoV5.index;
        }
        if ((i2 & 4) != 0) {
            z = variationDtoV5.isDefault;
        }
        if ((i2 & 8) != 0) {
            list = variationDtoV5.additionalData;
        }
        return variationDtoV5.copy(referenceWrapper, i, z, list);
    }

    public final ReferenceWrapper<ProductDtoV5> component1() {
        return this.product;
    }

    public final int component2() {
        return this.index;
    }

    public final boolean component3() {
        return this.isDefault;
    }

    public final List<AdditionalDataDtoV5> component4() {
        return this.additionalData;
    }

    public final VariationDtoV5 copy(ReferenceWrapper<ProductDtoV5> referenceWrapper, int i, boolean z, List<AdditionalDataDtoV5> list) {
        z65.h(referenceWrapper, "product");
        z65.h(list, "additionalData");
        return new VariationDtoV5(referenceWrapper, i, z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariationDtoV5)) {
            return false;
        }
        VariationDtoV5 variationDtoV5 = (VariationDtoV5) obj;
        if (z65.c(this.product, variationDtoV5.product) && this.index == variationDtoV5.index && this.isDefault == variationDtoV5.isDefault && z65.c(this.additionalData, variationDtoV5.additionalData)) {
            return true;
        }
        return false;
    }

    public final List<AdditionalDataDtoV5> getAdditionalData() {
        return this.additionalData;
    }

    public final int getIndex() {
        return this.index;
    }

    public final ReferenceWrapper<ProductDtoV5> getProduct() {
        return this.product;
    }

    public int hashCode() {
        return (((((this.product.hashCode() * 31) + this.index) * 31) + a91.a(this.isDefault)) * 31) + this.additionalData.hashCode();
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        ReferenceWrapper<ProductDtoV5> referenceWrapper = this.product;
        int i = this.index;
        boolean z = this.isDefault;
        List<AdditionalDataDtoV5> list = this.additionalData;
        return "VariationDtoV5(product=" + referenceWrapper + ", index=" + i + ", isDefault=" + z + ", additionalData=" + list + ")";
    }
}
