package ru.dodopizza.backend.domain.state.dto.cart.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomizationResponseDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/response/CustomizationResponseDto;", "", "addedIngredients", "", "Lru/dodopizza/backend/domain/state/dto/cart/response/AddedIngredientResponseDto;", "removedIngredients", "Lru/dodopizza/backend/domain/state/dto/cart/response/RemovedIngredientResponseDto;", "(Ljava/util/List;Ljava/util/List;)V", "getAddedIngredients", "()Ljava/util/List;", "getRemovedIngredients", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizationResponseDto {
    @uca("addedIngredients")
    private final List<AddedIngredientResponseDto> addedIngredients;
    @uca("removedIngredients")
    private final List<RemovedIngredientResponseDto> removedIngredients;

    public CustomizationResponseDto() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizationResponseDto copy$default(CustomizationResponseDto customizationResponseDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = customizationResponseDto.addedIngredients;
        }
        if ((i & 2) != 0) {
            list2 = customizationResponseDto.removedIngredients;
        }
        return customizationResponseDto.copy(list, list2);
    }

    public final List<AddedIngredientResponseDto> component1() {
        return this.addedIngredients;
    }

    public final List<RemovedIngredientResponseDto> component2() {
        return this.removedIngredients;
    }

    public final CustomizationResponseDto copy(List<AddedIngredientResponseDto> list, List<RemovedIngredientResponseDto> list2) {
        z65.h(list, "addedIngredients");
        z65.h(list2, "removedIngredients");
        return new CustomizationResponseDto(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationResponseDto)) {
            return false;
        }
        CustomizationResponseDto customizationResponseDto = (CustomizationResponseDto) obj;
        if (z65.c(this.addedIngredients, customizationResponseDto.addedIngredients) && z65.c(this.removedIngredients, customizationResponseDto.removedIngredients)) {
            return true;
        }
        return false;
    }

    public final List<AddedIngredientResponseDto> getAddedIngredients() {
        return this.addedIngredients;
    }

    public final List<RemovedIngredientResponseDto> getRemovedIngredients() {
        return this.removedIngredients;
    }

    public int hashCode() {
        return (this.addedIngredients.hashCode() * 31) + this.removedIngredients.hashCode();
    }

    public String toString() {
        List<AddedIngredientResponseDto> list = this.addedIngredients;
        List<RemovedIngredientResponseDto> list2 = this.removedIngredients;
        return "CustomizationResponseDto(addedIngredients=" + list + ", removedIngredients=" + list2 + ")";
    }

    public CustomizationResponseDto(List<AddedIngredientResponseDto> list, List<RemovedIngredientResponseDto> list2) {
        z65.h(list, "addedIngredients");
        z65.h(list2, "removedIngredients");
        this.addedIngredients = list;
        this.removedIngredients = list2;
    }

    public /* synthetic */ CustomizationResponseDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list, (i & 2) != 0 ? kc1.l() : list2);
    }
}
