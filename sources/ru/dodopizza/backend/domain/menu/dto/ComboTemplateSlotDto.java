package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ComboTemplateSlotDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ComboTemplateSlotDto;", "", "id", "", Action.NAME_ATTRIBUTE, "priority", "", "defaultProductId", "slotProducts", "", "Lru/dodopizza/backend/domain/menu/dto/ComboTemplateSlotProductDto;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Collection;)V", "getDefaultProductId", "()Ljava/lang/String;", "getId", "getName", "getPriority", "()I", "getSlotProducts", "()Ljava/util/Collection;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboTemplateSlotDto {
    @uca("defaultProductId")
    private final String defaultProductId;
    @uca("id")
    private final String id;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("priority")
    private final int priority;
    @uca("products")
    private final Collection<ComboTemplateSlotProductDto> slotProducts;

    public ComboTemplateSlotDto(String str, String str2, int i, String str3, Collection<ComboTemplateSlotProductDto> collection) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "defaultProductId");
        z65.h(collection, "slotProducts");
        this.id = str;
        this.name = str2;
        this.priority = i;
        this.defaultProductId = str3;
        this.slotProducts = collection;
    }

    public static /* synthetic */ ComboTemplateSlotDto copy$default(ComboTemplateSlotDto comboTemplateSlotDto, String str, String str2, int i, String str3, Collection collection, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comboTemplateSlotDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = comboTemplateSlotDto.name;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = comboTemplateSlotDto.priority;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = comboTemplateSlotDto.defaultProductId;
        }
        String str5 = str3;
        Collection<ComboTemplateSlotProductDto> collection2 = collection;
        if ((i2 & 16) != 0) {
            collection2 = comboTemplateSlotDto.slotProducts;
        }
        return comboTemplateSlotDto.copy(str, str4, i3, str5, collection2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.priority;
    }

    public final String component4() {
        return this.defaultProductId;
    }

    public final Collection<ComboTemplateSlotProductDto> component5() {
        return this.slotProducts;
    }

    public final ComboTemplateSlotDto copy(String str, String str2, int i, String str3, Collection<ComboTemplateSlotProductDto> collection) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "defaultProductId");
        z65.h(collection, "slotProducts");
        return new ComboTemplateSlotDto(str, str2, i, str3, collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboTemplateSlotDto)) {
            return false;
        }
        ComboTemplateSlotDto comboTemplateSlotDto = (ComboTemplateSlotDto) obj;
        if (z65.c(this.id, comboTemplateSlotDto.id) && z65.c(this.name, comboTemplateSlotDto.name) && this.priority == comboTemplateSlotDto.priority && z65.c(this.defaultProductId, comboTemplateSlotDto.defaultProductId) && z65.c(this.slotProducts, comboTemplateSlotDto.slotProducts)) {
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

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final Collection<ComboTemplateSlotProductDto> getSlotProducts() {
        return this.slotProducts;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.priority) * 31) + this.defaultProductId.hashCode()) * 31) + this.slotProducts.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        int i = this.priority;
        String str3 = this.defaultProductId;
        Collection<ComboTemplateSlotProductDto> collection = this.slotProducts;
        return "ComboTemplateSlotDto(id=" + str + ", name=" + str2 + ", priority=" + i + ", defaultProductId=" + str3 + ", slotProducts=" + collection + ")";
    }
}
