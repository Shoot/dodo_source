package ru.dodopizza.backend.domain.cart.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: CustomizationDto.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/CustomizationOrderResponseDto;", "", "removedIngredients", "", "Lru/dodopizza/backend/domain/cart/dto/OrderItemRemovedIngredientDto;", "pizzaHalves", "Lru/dodopizza/backend/domain/cart/dto/PizzaHalfOrderDto;", "addedToppings", "Lru/dodopizza/backend/domain/cart/dto/ToppingOrderDto;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAddedToppings", "()Ljava/util/List;", "getPizzaHalves", "getRemovedIngredients", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizationOrderResponseDto {
    @uca("addedIngredients")
    private final List<ToppingOrderDto> addedToppings;
    @uca("pizzaHalves")
    private final List<PizzaHalfOrderDto> pizzaHalves;
    @uca("removedIngredientInfos")
    private final List<OrderItemRemovedIngredientDto> removedIngredients;

    public CustomizationOrderResponseDto(List<OrderItemRemovedIngredientDto> list, List<PizzaHalfOrderDto> list2, List<ToppingOrderDto> list3) {
        z65.h(list, "removedIngredients");
        z65.h(list2, "pizzaHalves");
        z65.h(list3, "addedToppings");
        this.removedIngredients = list;
        this.pizzaHalves = list2;
        this.addedToppings = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizationOrderResponseDto copy$default(CustomizationOrderResponseDto customizationOrderResponseDto, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = customizationOrderResponseDto.removedIngredients;
        }
        if ((i & 2) != 0) {
            list2 = customizationOrderResponseDto.pizzaHalves;
        }
        if ((i & 4) != 0) {
            list3 = customizationOrderResponseDto.addedToppings;
        }
        return customizationOrderResponseDto.copy(list, list2, list3);
    }

    public final List<OrderItemRemovedIngredientDto> component1() {
        return this.removedIngredients;
    }

    public final List<PizzaHalfOrderDto> component2() {
        return this.pizzaHalves;
    }

    public final List<ToppingOrderDto> component3() {
        return this.addedToppings;
    }

    public final CustomizationOrderResponseDto copy(List<OrderItemRemovedIngredientDto> list, List<PizzaHalfOrderDto> list2, List<ToppingOrderDto> list3) {
        z65.h(list, "removedIngredients");
        z65.h(list2, "pizzaHalves");
        z65.h(list3, "addedToppings");
        return new CustomizationOrderResponseDto(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationOrderResponseDto)) {
            return false;
        }
        CustomizationOrderResponseDto customizationOrderResponseDto = (CustomizationOrderResponseDto) obj;
        if (z65.c(this.removedIngredients, customizationOrderResponseDto.removedIngredients) && z65.c(this.pizzaHalves, customizationOrderResponseDto.pizzaHalves) && z65.c(this.addedToppings, customizationOrderResponseDto.addedToppings)) {
            return true;
        }
        return false;
    }

    public final List<ToppingOrderDto> getAddedToppings() {
        return this.addedToppings;
    }

    public final List<PizzaHalfOrderDto> getPizzaHalves() {
        return this.pizzaHalves;
    }

    public final List<OrderItemRemovedIngredientDto> getRemovedIngredients() {
        return this.removedIngredients;
    }

    public int hashCode() {
        return (((this.removedIngredients.hashCode() * 31) + this.pizzaHalves.hashCode()) * 31) + this.addedToppings.hashCode();
    }

    public String toString() {
        List<OrderItemRemovedIngredientDto> list = this.removedIngredients;
        List<PizzaHalfOrderDto> list2 = this.pizzaHalves;
        List<ToppingOrderDto> list3 = this.addedToppings;
        return "CustomizationOrderResponseDto(removedIngredients=" + list + ", pizzaHalves=" + list2 + ", addedToppings=" + list3 + ")";
    }
}
