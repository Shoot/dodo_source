package ru.dodopizza.backend.domain.cart.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.cart.CartProductDto;
import ru.dodopizza.backend.domain.state.dto.cart.request.CustomizationRequestDto;
import ru.dodopizza.backend.domain.state.dto.cart.request.PizzaHalvesRequestDto;
/* compiled from: AddToCartRequestDto.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003JY\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u000eHÖ\u0001R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'¨\u00066"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/AddToCartRequestDto;", "", "count", "", "customization", "Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;", "comboProducts", "", "Lru/dodopizza/backend/domain/state/dto/cart/CartProductDto;", "pizzaHalves", "Lru/dodopizza/backend/domain/state/dto/cart/request/PizzaHalvesRequestDto;", "isGift", "", "shoppingItemId", "", "stateId", "(ILru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;Ljava/util/List;Lru/dodopizza/backend/domain/state/dto/cart/request/PizzaHalvesRequestDto;ZLjava/lang/String;Ljava/lang/String;)V", "getComboProducts", "()Ljava/util/List;", "setComboProducts", "(Ljava/util/List;)V", "getCount", "()I", "setCount", "(I)V", "getCustomization", "()Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;", "setCustomization", "(Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;)V", "()Z", "setGift", "(Z)V", "getPizzaHalves", "()Lru/dodopizza/backend/domain/state/dto/cart/request/PizzaHalvesRequestDto;", "setPizzaHalves", "(Lru/dodopizza/backend/domain/state/dto/cart/request/PizzaHalvesRequestDto;)V", "getShoppingItemId", "()Ljava/lang/String;", "setShoppingItemId", "(Ljava/lang/String;)V", "getStateId", "setStateId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddToCartRequestDto {
    @uca("comboProducts")
    private List<CartProductDto> comboProducts;
    @uca("count")
    private int count;
    @uca("customization")
    private CustomizationRequestDto customization;
    @uca("isGift")
    private boolean isGift;
    @uca("pizzaHalves")
    private PizzaHalvesRequestDto pizzaHalves;
    @uca("shoppingItemId")
    private String shoppingItemId;
    @uca("stateId")
    private String stateId;

    public AddToCartRequestDto() {
        this(0, null, null, null, false, null, null, 127, null);
    }

    public static /* synthetic */ AddToCartRequestDto copy$default(AddToCartRequestDto addToCartRequestDto, int i, CustomizationRequestDto customizationRequestDto, List list, PizzaHalvesRequestDto pizzaHalvesRequestDto, boolean z, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addToCartRequestDto.count;
        }
        if ((i2 & 2) != 0) {
            customizationRequestDto = addToCartRequestDto.customization;
        }
        CustomizationRequestDto customizationRequestDto2 = customizationRequestDto;
        List<CartProductDto> list2 = list;
        if ((i2 & 4) != 0) {
            list2 = addToCartRequestDto.comboProducts;
        }
        List list3 = list2;
        if ((i2 & 8) != 0) {
            pizzaHalvesRequestDto = addToCartRequestDto.pizzaHalves;
        }
        PizzaHalvesRequestDto pizzaHalvesRequestDto2 = pizzaHalvesRequestDto;
        if ((i2 & 16) != 0) {
            z = addToCartRequestDto.isGift;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str = addToCartRequestDto.shoppingItemId;
        }
        String str3 = str;
        if ((i2 & 64) != 0) {
            str2 = addToCartRequestDto.stateId;
        }
        return addToCartRequestDto.copy(i, customizationRequestDto2, list3, pizzaHalvesRequestDto2, z2, str3, str2);
    }

    public final int component1() {
        return this.count;
    }

    public final CustomizationRequestDto component2() {
        return this.customization;
    }

    public final List<CartProductDto> component3() {
        return this.comboProducts;
    }

    public final PizzaHalvesRequestDto component4() {
        return this.pizzaHalves;
    }

    public final boolean component5() {
        return this.isGift;
    }

    public final String component6() {
        return this.shoppingItemId;
    }

    public final String component7() {
        return this.stateId;
    }

    public final AddToCartRequestDto copy(int i, CustomizationRequestDto customizationRequestDto, List<CartProductDto> list, PizzaHalvesRequestDto pizzaHalvesRequestDto, boolean z, String str, String str2) {
        z65.h(list, "comboProducts");
        z65.h(str, "shoppingItemId");
        z65.h(str2, "stateId");
        return new AddToCartRequestDto(i, customizationRequestDto, list, pizzaHalvesRequestDto, z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartRequestDto)) {
            return false;
        }
        AddToCartRequestDto addToCartRequestDto = (AddToCartRequestDto) obj;
        if (this.count == addToCartRequestDto.count && z65.c(this.customization, addToCartRequestDto.customization) && z65.c(this.comboProducts, addToCartRequestDto.comboProducts) && z65.c(this.pizzaHalves, addToCartRequestDto.pizzaHalves) && this.isGift == addToCartRequestDto.isGift && z65.c(this.shoppingItemId, addToCartRequestDto.shoppingItemId) && z65.c(this.stateId, addToCartRequestDto.stateId)) {
            return true;
        }
        return false;
    }

    public final List<CartProductDto> getComboProducts() {
        return this.comboProducts;
    }

    public final int getCount() {
        return this.count;
    }

    public final CustomizationRequestDto getCustomization() {
        return this.customization;
    }

    public final PizzaHalvesRequestDto getPizzaHalves() {
        return this.pizzaHalves;
    }

    public final String getShoppingItemId() {
        return this.shoppingItemId;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        int hashCode;
        int i = this.count * 31;
        CustomizationRequestDto customizationRequestDto = this.customization;
        int i2 = 0;
        if (customizationRequestDto == null) {
            hashCode = 0;
        } else {
            hashCode = customizationRequestDto.hashCode();
        }
        int hashCode2 = (((i + hashCode) * 31) + this.comboProducts.hashCode()) * 31;
        PizzaHalvesRequestDto pizzaHalvesRequestDto = this.pizzaHalves;
        if (pizzaHalvesRequestDto != null) {
            i2 = pizzaHalvesRequestDto.hashCode();
        }
        return ((((((hashCode2 + i2) * 31) + a91.a(this.isGift)) * 31) + this.shoppingItemId.hashCode()) * 31) + this.stateId.hashCode();
    }

    public final boolean isGift() {
        return this.isGift;
    }

    public final void setComboProducts(List<CartProductDto> list) {
        z65.h(list, "<set-?>");
        this.comboProducts = list;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setCustomization(CustomizationRequestDto customizationRequestDto) {
        this.customization = customizationRequestDto;
    }

    public final void setGift(boolean z) {
        this.isGift = z;
    }

    public final void setPizzaHalves(PizzaHalvesRequestDto pizzaHalvesRequestDto) {
        this.pizzaHalves = pizzaHalvesRequestDto;
    }

    public final void setShoppingItemId(String str) {
        z65.h(str, "<set-?>");
        this.shoppingItemId = str;
    }

    public final void setStateId(String str) {
        z65.h(str, "<set-?>");
        this.stateId = str;
    }

    public String toString() {
        int i = this.count;
        CustomizationRequestDto customizationRequestDto = this.customization;
        List<CartProductDto> list = this.comboProducts;
        PizzaHalvesRequestDto pizzaHalvesRequestDto = this.pizzaHalves;
        boolean z = this.isGift;
        String str = this.shoppingItemId;
        String str2 = this.stateId;
        return "AddToCartRequestDto(count=" + i + ", customization=" + customizationRequestDto + ", comboProducts=" + list + ", pizzaHalves=" + pizzaHalvesRequestDto + ", isGift=" + z + ", shoppingItemId=" + str + ", stateId=" + str2 + ")";
    }

    public AddToCartRequestDto(int i, CustomizationRequestDto customizationRequestDto, List<CartProductDto> list, PizzaHalvesRequestDto pizzaHalvesRequestDto, boolean z, String str, String str2) {
        z65.h(list, "comboProducts");
        z65.h(str, "shoppingItemId");
        z65.h(str2, "stateId");
        this.count = i;
        this.customization = customizationRequestDto;
        this.comboProducts = list;
        this.pizzaHalves = pizzaHalvesRequestDto;
        this.isGift = z;
        this.shoppingItemId = str;
        this.stateId = str2;
    }

    public /* synthetic */ AddToCartRequestDto(int i, CustomizationRequestDto customizationRequestDto, List list, PizzaHalvesRequestDto pizzaHalvesRequestDto, boolean z, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : customizationRequestDto, (i2 & 4) != 0 ? kc1.l() : list, (i2 & 8) == 0 ? pizzaHalvesRequestDto : null, (i2 & 16) == 0 ? z : false, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? "" : str2);
    }
}
