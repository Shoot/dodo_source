package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: PackageDtoV5.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/PackageDtoV5;", "", "materialTypeId", "", Action.NAME_ATTRIBUTE, "quantity", "", "quantityVariations", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/QuantityVariationDtoV5;", "index", "imageLink", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/lang/String;)V", "getImageLink", "()Ljava/lang/String;", "getIndex", "()I", "getMaterialTypeId", "getName", "getQuantity", "getQuantityVariations", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PackageDtoV5 {
    @uca("imageLink")
    private final String imageLink;
    @uca("index")
    private final int index;
    @uca("materialTypeId")
    private final String materialTypeId;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("quantity")
    private final int quantity;
    @uca("quantityVariations")
    private final List<ReferenceWrapper<QuantityVariationDtoV5>> quantityVariations;

    public PackageDtoV5(String str, String str2, int i, List<ReferenceWrapper<QuantityVariationDtoV5>> list, int i2, String str3) {
        z65.h(str, "materialTypeId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(list, "quantityVariations");
        z65.h(str3, "imageLink");
        this.materialTypeId = str;
        this.name = str2;
        this.quantity = i;
        this.quantityVariations = list;
        this.index = i2;
        this.imageLink = str3;
    }

    public static /* synthetic */ PackageDtoV5 copy$default(PackageDtoV5 packageDtoV5, String str, String str2, int i, List list, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = packageDtoV5.materialTypeId;
        }
        if ((i3 & 2) != 0) {
            str2 = packageDtoV5.name;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = packageDtoV5.quantity;
        }
        int i4 = i;
        List<ReferenceWrapper<QuantityVariationDtoV5>> list2 = list;
        if ((i3 & 8) != 0) {
            list2 = packageDtoV5.quantityVariations;
        }
        List list3 = list2;
        if ((i3 & 16) != 0) {
            i2 = packageDtoV5.index;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            str3 = packageDtoV5.imageLink;
        }
        return packageDtoV5.copy(str, str4, i4, list3, i5, str3);
    }

    public final String component1() {
        return this.materialTypeId;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.quantity;
    }

    public final List<ReferenceWrapper<QuantityVariationDtoV5>> component4() {
        return this.quantityVariations;
    }

    public final int component5() {
        return this.index;
    }

    public final String component6() {
        return this.imageLink;
    }

    public final PackageDtoV5 copy(String str, String str2, int i, List<ReferenceWrapper<QuantityVariationDtoV5>> list, int i2, String str3) {
        z65.h(str, "materialTypeId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(list, "quantityVariations");
        z65.h(str3, "imageLink");
        return new PackageDtoV5(str, str2, i, list, i2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageDtoV5)) {
            return false;
        }
        PackageDtoV5 packageDtoV5 = (PackageDtoV5) obj;
        if (z65.c(this.materialTypeId, packageDtoV5.materialTypeId) && z65.c(this.name, packageDtoV5.name) && this.quantity == packageDtoV5.quantity && z65.c(this.quantityVariations, packageDtoV5.quantityVariations) && this.index == packageDtoV5.index && z65.c(this.imageLink, packageDtoV5.imageLink)) {
            return true;
        }
        return false;
    }

    public final String getImageLink() {
        return this.imageLink;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMaterialTypeId() {
        return this.materialTypeId;
    }

    public final String getName() {
        return this.name;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final List<ReferenceWrapper<QuantityVariationDtoV5>> getQuantityVariations() {
        return this.quantityVariations;
    }

    public int hashCode() {
        return (((((((((this.materialTypeId.hashCode() * 31) + this.name.hashCode()) * 31) + this.quantity) * 31) + this.quantityVariations.hashCode()) * 31) + this.index) * 31) + this.imageLink.hashCode();
    }

    public String toString() {
        String str = this.materialTypeId;
        String str2 = this.name;
        int i = this.quantity;
        List<ReferenceWrapper<QuantityVariationDtoV5>> list = this.quantityVariations;
        int i2 = this.index;
        String str3 = this.imageLink;
        return "PackageDtoV5(materialTypeId=" + str + ", name=" + str2 + ", quantity=" + i + ", quantityVariations=" + list + ", index=" + i2 + ", imageLink=" + str3 + ")";
    }
}
