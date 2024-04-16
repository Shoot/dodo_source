package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: QuantityVariationDtoV5.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/QuantityVariationDtoV5;", "", Action.NAME_ATTRIBUTE, "", "quantity", "", "price", "", "(Ljava/lang/String;ID)V", "getName", "()Ljava/lang/String;", "getPrice", "()D", "getQuantity", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuantityVariationDtoV5 {
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("price")
    private final double price;
    @uca("quantity")
    private final int quantity;

    public QuantityVariationDtoV5(String str, int i, double d) {
        this.name = str;
        this.quantity = i;
        this.price = d;
    }

    public static /* synthetic */ QuantityVariationDtoV5 copy$default(QuantityVariationDtoV5 quantityVariationDtoV5, String str, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = quantityVariationDtoV5.name;
        }
        if ((i2 & 2) != 0) {
            i = quantityVariationDtoV5.quantity;
        }
        if ((i2 & 4) != 0) {
            d = quantityVariationDtoV5.price;
        }
        return quantityVariationDtoV5.copy(str, i, d);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.quantity;
    }

    public final double component3() {
        return this.price;
    }

    public final QuantityVariationDtoV5 copy(String str, int i, double d) {
        return new QuantityVariationDtoV5(str, i, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuantityVariationDtoV5)) {
            return false;
        }
        QuantityVariationDtoV5 quantityVariationDtoV5 = (QuantityVariationDtoV5) obj;
        if (z65.c(this.name, quantityVariationDtoV5.name) && this.quantity == quantityVariationDtoV5.quantity && Double.compare(this.price, quantityVariationDtoV5.price) == 0) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int hashCode;
        String str = this.name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + this.quantity) * 31) + nkb.a(this.price);
    }

    public String toString() {
        String str = this.name;
        int i = this.quantity;
        double d = this.price;
        return "QuantityVariationDtoV5(name=" + str + ", quantity=" + i + ", price=" + d + ")";
    }
}
