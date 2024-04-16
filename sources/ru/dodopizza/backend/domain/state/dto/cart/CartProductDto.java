package ru.dodopizza.backend.domain.state.dto.cart;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.cart.request.CustomizationRequestDto;
/* compiled from: CartProductDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/CartProductDto;", "", "id", "", "customization", "Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;", "(Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;)V", "getCustomization", "()Lru/dodopizza/backend/domain/state/dto/cart/request/CustomizationRequestDto;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductDto {
    @uca("customization")
    private final CustomizationRequestDto customization;
    @uca("id")
    private final String id;

    public CartProductDto(String str, CustomizationRequestDto customizationRequestDto) {
        z65.h(str, "id");
        this.id = str;
        this.customization = customizationRequestDto;
    }

    public static /* synthetic */ CartProductDto copy$default(CartProductDto cartProductDto, String str, CustomizationRequestDto customizationRequestDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cartProductDto.id;
        }
        if ((i & 2) != 0) {
            customizationRequestDto = cartProductDto.customization;
        }
        return cartProductDto.copy(str, customizationRequestDto);
    }

    public final String component1() {
        return this.id;
    }

    public final CustomizationRequestDto component2() {
        return this.customization;
    }

    public final CartProductDto copy(String str, CustomizationRequestDto customizationRequestDto) {
        z65.h(str, "id");
        return new CartProductDto(str, customizationRequestDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductDto)) {
            return false;
        }
        CartProductDto cartProductDto = (CartProductDto) obj;
        if (z65.c(this.id, cartProductDto.id) && z65.c(this.customization, cartProductDto.customization)) {
            return true;
        }
        return false;
    }

    public final CustomizationRequestDto getCustomization() {
        return this.customization;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        CustomizationRequestDto customizationRequestDto = this.customization;
        if (customizationRequestDto == null) {
            hashCode = 0;
        } else {
            hashCode = customizationRequestDto.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.id;
        CustomizationRequestDto customizationRequestDto = this.customization;
        return "CartProductDto(id=" + str + ", customization=" + customizationRequestDto + ")";
    }

    public /* synthetic */ CartProductDto(String str, CustomizationRequestDto customizationRequestDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : customizationRequestDto);
    }
}
