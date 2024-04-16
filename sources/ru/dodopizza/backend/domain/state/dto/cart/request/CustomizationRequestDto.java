package ru.dodopizza.backend.domain.state.dto.cart.request;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.common.ObjectIdDto;
/* compiled from: CustomizationRequestDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;", "", "removedIngredients", "", "Lru/dodopizza/backend/domain/common/ObjectIdDto;", "addedIngredients", "(Ljava/util/List;Ljava/util/List;)V", "getAddedIngredients", "()Ljava/util/List;", "getRemovedIngredients", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizationRequestDto {
    @uca("addedIngredients")
    private final List<ObjectIdDto> addedIngredients;
    @uca("removedIngredients")
    private final List<ObjectIdDto> removedIngredients;

    public CustomizationRequestDto() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizationRequestDto copy$default(CustomizationRequestDto customizationRequestDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = customizationRequestDto.removedIngredients;
        }
        if ((i & 2) != 0) {
            list2 = customizationRequestDto.addedIngredients;
        }
        return customizationRequestDto.copy(list, list2);
    }

    public final List<ObjectIdDto> component1() {
        return this.removedIngredients;
    }

    public final List<ObjectIdDto> component2() {
        return this.addedIngredients;
    }

    public final CustomizationRequestDto copy(List<ObjectIdDto> list, List<ObjectIdDto> list2) {
        z65.h(list, "removedIngredients");
        z65.h(list2, "addedIngredients");
        return new CustomizationRequestDto(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationRequestDto)) {
            return false;
        }
        CustomizationRequestDto customizationRequestDto = (CustomizationRequestDto) obj;
        if (z65.c(this.removedIngredients, customizationRequestDto.removedIngredients) && z65.c(this.addedIngredients, customizationRequestDto.addedIngredients)) {
            return true;
        }
        return false;
    }

    public final List<ObjectIdDto> getAddedIngredients() {
        return this.addedIngredients;
    }

    public final List<ObjectIdDto> getRemovedIngredients() {
        return this.removedIngredients;
    }

    public int hashCode() {
        return (this.removedIngredients.hashCode() * 31) + this.addedIngredients.hashCode();
    }

    public String toString() {
        List<ObjectIdDto> list = this.removedIngredients;
        List<ObjectIdDto> list2 = this.addedIngredients;
        return "CustomizationRequestDto(removedIngredients=" + list + ", addedIngredients=" + list2 + ")";
    }

    public CustomizationRequestDto(List<ObjectIdDto> list, List<ObjectIdDto> list2) {
        z65.h(list, "removedIngredients");
        z65.h(list2, "addedIngredients");
        this.removedIngredients = list;
        this.addedIngredients = list2;
    }

    public /* synthetic */ CustomizationRequestDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list, (i & 2) != 0 ? kc1.l() : list2);
    }
}
