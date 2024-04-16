package ru.dodopizza.backend.domain.menu.dto;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboTemplateSlotProductDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\fJB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ComboTemplateSlotProductDto;", "", "id", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "priority", "", "price", "", "extraPrice", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/Double;)V", "getExtraPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "()Ljava/lang/String;", "getPrice", "()D", "getPriority", "()I", "getProductId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/Double;)Lru/dodopizza/backend/domain/menu/dto/ComboTemplateSlotProductDto;", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboTemplateSlotProductDto {
    @uca("extraPrice")
    private final Double extraPrice;
    @uca("id")
    private final String id;
    @uca("price")
    private final double price;
    @uca("priority")
    private final int priority;
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;

    public ComboTemplateSlotProductDto(String str, String str2, int i, double d, Double d2) {
        z65.h(str, "id");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        this.id = str;
        this.productId = str2;
        this.priority = i;
        this.price = d;
        this.extraPrice = d2;
    }

    public static /* synthetic */ ComboTemplateSlotProductDto copy$default(ComboTemplateSlotProductDto comboTemplateSlotProductDto, String str, String str2, int i, double d, Double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comboTemplateSlotProductDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = comboTemplateSlotProductDto.productId;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = comboTemplateSlotProductDto.priority;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            d = comboTemplateSlotProductDto.price;
        }
        double d3 = d;
        if ((i2 & 16) != 0) {
            d2 = comboTemplateSlotProductDto.extraPrice;
        }
        return comboTemplateSlotProductDto.copy(str, str3, i3, d3, d2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.productId;
    }

    public final int component3() {
        return this.priority;
    }

    public final double component4() {
        return this.price;
    }

    public final Double component5() {
        return this.extraPrice;
    }

    public final ComboTemplateSlotProductDto copy(String str, String str2, int i, double d, Double d2) {
        z65.h(str, "id");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        return new ComboTemplateSlotProductDto(str, str2, i, d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboTemplateSlotProductDto)) {
            return false;
        }
        ComboTemplateSlotProductDto comboTemplateSlotProductDto = (ComboTemplateSlotProductDto) obj;
        if (z65.c(this.id, comboTemplateSlotProductDto.id) && z65.c(this.productId, comboTemplateSlotProductDto.productId) && this.priority == comboTemplateSlotProductDto.priority && Double.compare(this.price, comboTemplateSlotProductDto.price) == 0 && z65.c(this.extraPrice, comboTemplateSlotProductDto.extraPrice)) {
            return true;
        }
        return false;
    }

    public final Double getExtraPrice() {
        return this.extraPrice;
    }

    public final String getId() {
        return this.id;
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.id.hashCode() * 31) + this.productId.hashCode()) * 31) + this.priority) * 31) + nkb.a(this.price)) * 31;
        Double d = this.extraPrice;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.productId;
        int i = this.priority;
        double d = this.price;
        Double d2 = this.extraPrice;
        return "ComboTemplateSlotProductDto(id=" + str + ", productId=" + str2 + ", priority=" + i + ", price=" + d + ", extraPrice=" + d2 + ")";
    }

    public /* synthetic */ ComboTemplateSlotProductDto(String str, String str2, int i, double d, Double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, d, (i2 & 16) != 0 ? null : d2);
    }
}
