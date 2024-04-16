package ru.dodopizza.backend.domain.state.dto.cart.request;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ObjectIdDto;
/* compiled from: PizzaHalvesRequestDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/request/PizzaHalvesRequestDto;", "", ElementGenerator.TEXT_ALIGN_LEFT, "Lru/dodopizza/backend/domain/common/ObjectIdDto;", ElementGenerator.TEXT_ALIGN_RIGHT, "(Lru/dodopizza/backend/domain/common/ObjectIdDto;Lru/dodopizza/backend/domain/common/ObjectIdDto;)V", "getLeft", "()Lru/dodopizza/backend/domain/common/ObjectIdDto;", "getRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PizzaHalvesRequestDto {
    @uca(ElementGenerator.TEXT_ALIGN_LEFT)
    private final ObjectIdDto left;
    @uca(ElementGenerator.TEXT_ALIGN_RIGHT)
    private final ObjectIdDto right;

    public PizzaHalvesRequestDto(ObjectIdDto objectIdDto, ObjectIdDto objectIdDto2) {
        z65.h(objectIdDto, ElementGenerator.TEXT_ALIGN_LEFT);
        z65.h(objectIdDto2, ElementGenerator.TEXT_ALIGN_RIGHT);
        this.left = objectIdDto;
        this.right = objectIdDto2;
    }

    public static /* synthetic */ PizzaHalvesRequestDto copy$default(PizzaHalvesRequestDto pizzaHalvesRequestDto, ObjectIdDto objectIdDto, ObjectIdDto objectIdDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            objectIdDto = pizzaHalvesRequestDto.left;
        }
        if ((i & 2) != 0) {
            objectIdDto2 = pizzaHalvesRequestDto.right;
        }
        return pizzaHalvesRequestDto.copy(objectIdDto, objectIdDto2);
    }

    public final ObjectIdDto component1() {
        return this.left;
    }

    public final ObjectIdDto component2() {
        return this.right;
    }

    public final PizzaHalvesRequestDto copy(ObjectIdDto objectIdDto, ObjectIdDto objectIdDto2) {
        z65.h(objectIdDto, ElementGenerator.TEXT_ALIGN_LEFT);
        z65.h(objectIdDto2, ElementGenerator.TEXT_ALIGN_RIGHT);
        return new PizzaHalvesRequestDto(objectIdDto, objectIdDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PizzaHalvesRequestDto)) {
            return false;
        }
        PizzaHalvesRequestDto pizzaHalvesRequestDto = (PizzaHalvesRequestDto) obj;
        if (z65.c(this.left, pizzaHalvesRequestDto.left) && z65.c(this.right, pizzaHalvesRequestDto.right)) {
            return true;
        }
        return false;
    }

    public final ObjectIdDto getLeft() {
        return this.left;
    }

    public final ObjectIdDto getRight() {
        return this.right;
    }

    public int hashCode() {
        return (this.left.hashCode() * 31) + this.right.hashCode();
    }

    public String toString() {
        ObjectIdDto objectIdDto = this.left;
        ObjectIdDto objectIdDto2 = this.right;
        return "PizzaHalvesRequestDto(left=" + objectIdDto + ", right=" + objectIdDto2 + ")";
    }
}
