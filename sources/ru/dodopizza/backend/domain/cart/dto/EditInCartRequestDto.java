package ru.dodopizza.backend.domain.cart.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.cart.CartProductDto;
import ru.dodopizza.backend.domain.state.dto.cart.request.CustomizationRequestDto;
/* compiled from: EditInCartRequestDto.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JC\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006("}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/EditInCartRequestDto;", "", "stateId", "", "cartItemId", "comboProducts", "", "Lru/dodopizza/backend/domain/state/dto/cart/CartProductDto;", "customization", "Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;", "shoppingItemId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;Ljava/lang/String;)V", "getCartItemId", "()Ljava/lang/String;", "setCartItemId", "(Ljava/lang/String;)V", "getComboProducts", "()Ljava/util/List;", "setComboProducts", "(Ljava/util/List;)V", "getCustomization", "()Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;", "setCustomization", "(Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;)V", "getShoppingItemId", "setShoppingItemId", "getStateId", "setStateId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditInCartRequestDto {
    @uca("cartItemId")
    private String cartItemId;
    @uca("comboProducts")
    private List<CartProductDto> comboProducts;
    @uca("customization")
    private CustomizationRequestDto customization;
    @uca("shoppingItemId")
    private String shoppingItemId;
    @uca("stateId")
    private String stateId;

    public EditInCartRequestDto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ EditInCartRequestDto copy$default(EditInCartRequestDto editInCartRequestDto, String str, String str2, List list, CustomizationRequestDto customizationRequestDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editInCartRequestDto.stateId;
        }
        if ((i & 2) != 0) {
            str2 = editInCartRequestDto.cartItemId;
        }
        String str4 = str2;
        List<CartProductDto> list2 = list;
        if ((i & 4) != 0) {
            list2 = editInCartRequestDto.comboProducts;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            customizationRequestDto = editInCartRequestDto.customization;
        }
        CustomizationRequestDto customizationRequestDto2 = customizationRequestDto;
        if ((i & 16) != 0) {
            str3 = editInCartRequestDto.shoppingItemId;
        }
        return editInCartRequestDto.copy(str, str4, list3, customizationRequestDto2, str3);
    }

    public final String component1() {
        return this.stateId;
    }

    public final String component2() {
        return this.cartItemId;
    }

    public final List<CartProductDto> component3() {
        return this.comboProducts;
    }

    public final CustomizationRequestDto component4() {
        return this.customization;
    }

    public final String component5() {
        return this.shoppingItemId;
    }

    public final EditInCartRequestDto copy(String str, String str2, List<CartProductDto> list, CustomizationRequestDto customizationRequestDto, String str3) {
        z65.h(str, "stateId");
        z65.h(str2, "cartItemId");
        z65.h(list, "comboProducts");
        z65.h(str3, "shoppingItemId");
        return new EditInCartRequestDto(str, str2, list, customizationRequestDto, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditInCartRequestDto)) {
            return false;
        }
        EditInCartRequestDto editInCartRequestDto = (EditInCartRequestDto) obj;
        if (z65.c(this.stateId, editInCartRequestDto.stateId) && z65.c(this.cartItemId, editInCartRequestDto.cartItemId) && z65.c(this.comboProducts, editInCartRequestDto.comboProducts) && z65.c(this.customization, editInCartRequestDto.customization) && z65.c(this.shoppingItemId, editInCartRequestDto.shoppingItemId)) {
            return true;
        }
        return false;
    }

    public final String getCartItemId() {
        return this.cartItemId;
    }

    public final List<CartProductDto> getComboProducts() {
        return this.comboProducts;
    }

    public final CustomizationRequestDto getCustomization() {
        return this.customization;
    }

    public final String getShoppingItemId() {
        return this.shoppingItemId;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.stateId.hashCode() * 31) + this.cartItemId.hashCode()) * 31) + this.comboProducts.hashCode()) * 31;
        CustomizationRequestDto customizationRequestDto = this.customization;
        if (customizationRequestDto == null) {
            hashCode = 0;
        } else {
            hashCode = customizationRequestDto.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.shoppingItemId.hashCode();
    }

    public final void setCartItemId(String str) {
        z65.h(str, "<set-?>");
        this.cartItemId = str;
    }

    public final void setComboProducts(List<CartProductDto> list) {
        z65.h(list, "<set-?>");
        this.comboProducts = list;
    }

    public final void setCustomization(CustomizationRequestDto customizationRequestDto) {
        this.customization = customizationRequestDto;
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
        String str = this.stateId;
        String str2 = this.cartItemId;
        List<CartProductDto> list = this.comboProducts;
        CustomizationRequestDto customizationRequestDto = this.customization;
        String str3 = this.shoppingItemId;
        return "EditInCartRequestDto(stateId=" + str + ", cartItemId=" + str2 + ", comboProducts=" + list + ", customization=" + customizationRequestDto + ", shoppingItemId=" + str3 + ")";
    }

    public EditInCartRequestDto(String str, String str2, List<CartProductDto> list, CustomizationRequestDto customizationRequestDto, String str3) {
        z65.h(str, "stateId");
        z65.h(str2, "cartItemId");
        z65.h(list, "comboProducts");
        z65.h(str3, "shoppingItemId");
        this.stateId = str;
        this.cartItemId = str2;
        this.comboProducts = list;
        this.customization = customizationRequestDto;
        this.shoppingItemId = str3;
    }

    public /* synthetic */ EditInCartRequestDto(String str, String str2, List list, CustomizationRequestDto customizationRequestDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? kc1.l() : list, (i & 8) != 0 ? null : customizationRequestDto, (i & 16) != 0 ? "" : str3);
    }
}
