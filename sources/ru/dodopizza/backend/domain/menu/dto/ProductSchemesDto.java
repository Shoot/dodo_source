package ru.dodopizza.backend.domain.menu.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: ProductSchemesDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ProductSchemesDto;", "", "sizeSchemes", "", "Lru/dodopizza/backend/domain/menu/dto/SizeSchemeDto;", "doughSchemes", "Lru/dodopizza/backend/domain/menu/dto/DoughSchemeDto;", "(Ljava/util/List;Ljava/util/List;)V", "getDoughSchemes", "()Ljava/util/List;", "getSizeSchemes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductSchemesDto {
    @uca("doughSchemes")
    private final List<DoughSchemeDto> doughSchemes;
    @uca("sizeSchemes")
    private final List<SizeSchemeDto> sizeSchemes;

    public ProductSchemesDto(List<SizeSchemeDto> list, List<DoughSchemeDto> list2) {
        z65.h(list, "sizeSchemes");
        z65.h(list2, "doughSchemes");
        this.sizeSchemes = list;
        this.doughSchemes = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductSchemesDto copy$default(ProductSchemesDto productSchemesDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productSchemesDto.sizeSchemes;
        }
        if ((i & 2) != 0) {
            list2 = productSchemesDto.doughSchemes;
        }
        return productSchemesDto.copy(list, list2);
    }

    public final List<SizeSchemeDto> component1() {
        return this.sizeSchemes;
    }

    public final List<DoughSchemeDto> component2() {
        return this.doughSchemes;
    }

    public final ProductSchemesDto copy(List<SizeSchemeDto> list, List<DoughSchemeDto> list2) {
        z65.h(list, "sizeSchemes");
        z65.h(list2, "doughSchemes");
        return new ProductSchemesDto(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSchemesDto)) {
            return false;
        }
        ProductSchemesDto productSchemesDto = (ProductSchemesDto) obj;
        if (z65.c(this.sizeSchemes, productSchemesDto.sizeSchemes) && z65.c(this.doughSchemes, productSchemesDto.doughSchemes)) {
            return true;
        }
        return false;
    }

    public final List<DoughSchemeDto> getDoughSchemes() {
        return this.doughSchemes;
    }

    public final List<SizeSchemeDto> getSizeSchemes() {
        return this.sizeSchemes;
    }

    public int hashCode() {
        return (this.sizeSchemes.hashCode() * 31) + this.doughSchemes.hashCode();
    }

    public String toString() {
        List<SizeSchemeDto> list = this.sizeSchemes;
        List<DoughSchemeDto> list2 = this.doughSchemes;
        return "ProductSchemesDto(sizeSchemes=" + list + ", doughSchemes=" + list2 + ")";
    }
}
