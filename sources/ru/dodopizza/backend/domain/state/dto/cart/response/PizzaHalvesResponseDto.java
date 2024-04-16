package ru.dodopizza.backend.domain.state.dto.cart.response;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: PizzaHalvesResponseDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/PizzaHalvesResponseDto;", "", ElementGenerator.TEXT_ALIGN_LEFT, "Lru/dodopizza/backend/domain/state/dto/cart/response/CartProductResponseDto;", ElementGenerator.TEXT_ALIGN_RIGHT, "(Lru/dodopizza/backend/domain/state/dto/cart/response/CartProductResponseDto;Lru/dodopizza/backend/domain/state/dto/cart/response/CartProductResponseDto;)V", "getLeft", "()Lru/dodopizza/backend/domain/state/dto/cart/response/CartProductResponseDto;", "getRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PizzaHalvesResponseDto {
    @uca(ElementGenerator.TEXT_ALIGN_LEFT)
    private final CartProductResponseDto left;
    @uca(ElementGenerator.TEXT_ALIGN_RIGHT)
    private final CartProductResponseDto right;

    public PizzaHalvesResponseDto(CartProductResponseDto cartProductResponseDto, CartProductResponseDto cartProductResponseDto2) {
        z65.h(cartProductResponseDto, ElementGenerator.TEXT_ALIGN_LEFT);
        z65.h(cartProductResponseDto2, ElementGenerator.TEXT_ALIGN_RIGHT);
        this.left = cartProductResponseDto;
        this.right = cartProductResponseDto2;
    }

    public static /* synthetic */ PizzaHalvesResponseDto copy$default(PizzaHalvesResponseDto pizzaHalvesResponseDto, CartProductResponseDto cartProductResponseDto, CartProductResponseDto cartProductResponseDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            cartProductResponseDto = pizzaHalvesResponseDto.left;
        }
        if ((i & 2) != 0) {
            cartProductResponseDto2 = pizzaHalvesResponseDto.right;
        }
        return pizzaHalvesResponseDto.copy(cartProductResponseDto, cartProductResponseDto2);
    }

    public final CartProductResponseDto component1() {
        return this.left;
    }

    public final CartProductResponseDto component2() {
        return this.right;
    }

    public final PizzaHalvesResponseDto copy(CartProductResponseDto cartProductResponseDto, CartProductResponseDto cartProductResponseDto2) {
        z65.h(cartProductResponseDto, ElementGenerator.TEXT_ALIGN_LEFT);
        z65.h(cartProductResponseDto2, ElementGenerator.TEXT_ALIGN_RIGHT);
        return new PizzaHalvesResponseDto(cartProductResponseDto, cartProductResponseDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PizzaHalvesResponseDto)) {
            return false;
        }
        PizzaHalvesResponseDto pizzaHalvesResponseDto = (PizzaHalvesResponseDto) obj;
        if (z65.c(this.left, pizzaHalvesResponseDto.left) && z65.c(this.right, pizzaHalvesResponseDto.right)) {
            return true;
        }
        return false;
    }

    public final CartProductResponseDto getLeft() {
        return this.left;
    }

    public final CartProductResponseDto getRight() {
        return this.right;
    }

    public int hashCode() {
        return (this.left.hashCode() * 31) + this.right.hashCode();
    }

    public String toString() {
        CartProductResponseDto cartProductResponseDto = this.left;
        CartProductResponseDto cartProductResponseDto2 = this.right;
        return "PizzaHalvesResponseDto(left=" + cartProductResponseDto + ", right=" + cartProductResponseDto2 + ")";
    }
}
