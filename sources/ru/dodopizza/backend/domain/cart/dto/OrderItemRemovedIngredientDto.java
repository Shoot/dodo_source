package ru.dodopizza.backend.domain.cart.dto;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: CustomizationDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/OrderItemRemovedIngredientDto;", "", "id", "", Action.NAME_ATTRIBUTE, "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderItemRemovedIngredientDto {
    @uca("id")
    private final String id;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;

    public OrderItemRemovedIngredientDto(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.id = str;
        this.name = str2;
    }

    public static /* synthetic */ OrderItemRemovedIngredientDto copy$default(OrderItemRemovedIngredientDto orderItemRemovedIngredientDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderItemRemovedIngredientDto.id;
        }
        if ((i & 2) != 0) {
            str2 = orderItemRemovedIngredientDto.name;
        }
        return orderItemRemovedIngredientDto.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final OrderItemRemovedIngredientDto copy(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        return new OrderItemRemovedIngredientDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderItemRemovedIngredientDto)) {
            return false;
        }
        OrderItemRemovedIngredientDto orderItemRemovedIngredientDto = (OrderItemRemovedIngredientDto) obj;
        if (z65.c(this.id, orderItemRemovedIngredientDto.id) && z65.c(this.name, orderItemRemovedIngredientDto.name)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return "OrderItemRemovedIngredientDto(id=" + str + ", name=" + str2 + ")";
    }
}
