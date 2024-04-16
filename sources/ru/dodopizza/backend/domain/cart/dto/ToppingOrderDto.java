package ru.dodopizza.backend.domain.cart.dto;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomizationDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/ToppingOrderDto;", "", "parentId", "", Action.NAME_ATTRIBUTE, "price", "", "(Ljava/lang/String;Ljava/lang/String;D)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getParentId", "getPrice", "()D", "setPrice", "(D)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToppingOrderDto {
    @uca(Action.NAME_ATTRIBUTE)
    private String name;
    @uca("parentUUId")
    private final String parentId;
    @uca("price")
    private double price;

    public ToppingOrderDto(String str, String str2, double d) {
        z65.h(str, "parentId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.parentId = str;
        this.name = str2;
        this.price = d;
    }

    public static /* synthetic */ ToppingOrderDto copy$default(ToppingOrderDto toppingOrderDto, String str, String str2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toppingOrderDto.parentId;
        }
        if ((i & 2) != 0) {
            str2 = toppingOrderDto.name;
        }
        if ((i & 4) != 0) {
            d = toppingOrderDto.price;
        }
        return toppingOrderDto.copy(str, str2, d);
    }

    public final String component1() {
        return this.parentId;
    }

    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.price;
    }

    public final ToppingOrderDto copy(String str, String str2, double d) {
        z65.h(str, "parentId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        return new ToppingOrderDto(str, str2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToppingOrderDto)) {
            return false;
        }
        ToppingOrderDto toppingOrderDto = (ToppingOrderDto) obj;
        if (z65.c(this.parentId, toppingOrderDto.parentId) && z65.c(this.name, toppingOrderDto.name) && Double.compare(this.price, toppingOrderDto.price) == 0) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (((this.parentId.hashCode() * 31) + this.name.hashCode()) * 31) + nkb.a(this.price);
    }

    public final void setName(String str) {
        z65.h(str, "<set-?>");
        this.name = str;
    }

    public final void setPrice(double d) {
        this.price = d;
    }

    public String toString() {
        String str = this.parentId;
        String str2 = this.name;
        double d = this.price;
        return "ToppingOrderDto(parentId=" + str + ", name=" + str2 + ", price=" + d + ")";
    }

    public /* synthetic */ ToppingOrderDto(String str, String str2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0.0d : d);
    }
}
