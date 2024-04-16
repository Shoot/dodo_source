package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: ComboTemplateSlotDtoV5.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/ComboTemplateSlotDtoV5;", "", "id", "", Action.NAME_ATTRIBUTE, "defaultProductId", "products", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/ComboTemplateSlotProductDtoV5;", "index", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getDefaultProductId", "()Ljava/lang/String;", "getId", "getIndex", "()I", "getName", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboTemplateSlotDtoV5 {
    @uca("defaultProductId")
    private final String defaultProductId;
    @uca("id")
    private final String id;
    @uca("index")
    private final int index;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("products")
    private final List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> products;

    public ComboTemplateSlotDtoV5(String str, String str2, String str3, List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> list, int i) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "defaultProductId");
        z65.h(list, "products");
        this.id = str;
        this.name = str2;
        this.defaultProductId = str3;
        this.products = list;
        this.index = i;
    }

    public static /* synthetic */ ComboTemplateSlotDtoV5 copy$default(ComboTemplateSlotDtoV5 comboTemplateSlotDtoV5, String str, String str2, String str3, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comboTemplateSlotDtoV5.id;
        }
        if ((i2 & 2) != 0) {
            str2 = comboTemplateSlotDtoV5.name;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = comboTemplateSlotDtoV5.defaultProductId;
        }
        String str5 = str3;
        List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> list2 = list;
        if ((i2 & 8) != 0) {
            list2 = comboTemplateSlotDtoV5.products;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = comboTemplateSlotDtoV5.index;
        }
        return comboTemplateSlotDtoV5.copy(str, str4, str5, list3, i);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.defaultProductId;
    }

    public final List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> component4() {
        return this.products;
    }

    public final int component5() {
        return this.index;
    }

    public final ComboTemplateSlotDtoV5 copy(String str, String str2, String str3, List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> list, int i) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "defaultProductId");
        z65.h(list, "products");
        return new ComboTemplateSlotDtoV5(str, str2, str3, list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboTemplateSlotDtoV5)) {
            return false;
        }
        ComboTemplateSlotDtoV5 comboTemplateSlotDtoV5 = (ComboTemplateSlotDtoV5) obj;
        if (z65.c(this.id, comboTemplateSlotDtoV5.id) && z65.c(this.name, comboTemplateSlotDtoV5.name) && z65.c(this.defaultProductId, comboTemplateSlotDtoV5.defaultProductId) && z65.c(this.products, comboTemplateSlotDtoV5.products) && this.index == comboTemplateSlotDtoV5.index) {
            return true;
        }
        return false;
    }

    public final String getDefaultProductId() {
        return this.defaultProductId;
    }

    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.defaultProductId.hashCode()) * 31) + this.products.hashCode()) * 31) + this.index;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.defaultProductId;
        List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> list = this.products;
        int i = this.index;
        return "ComboTemplateSlotDtoV5(id=" + str + ", name=" + str2 + ", defaultProductId=" + str3 + ", products=" + list + ", index=" + i + ")";
    }
}
