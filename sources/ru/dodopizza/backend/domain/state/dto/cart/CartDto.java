package ru.dodopizza.backend.domain.state.dto.cart;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.AppliedBonusActionDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.AvailableBonusesDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.PersonalPromoActionDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.PromoCodeDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.CartItemResponseDto;
/* compiled from: CartDto.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003JW\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/CartDto;", "", "appliedBonusActions", "", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedBonusActionDto;", "availableBonuses", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AvailableBonusesDto;", "items", "Lru/dodopizza/backend/domain/state/dto/cart/response/CartItemResponseDto;", "price", "Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;", "promoCode", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PromoCodeDto;", "personalPromoAction", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PersonalPromoActionDto;", "(Ljava/util/List;Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AvailableBonusesDto;Ljava/util/List;Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PromoCodeDto;Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PersonalPromoActionDto;)V", "getAppliedBonusActions", "()Ljava/util/List;", "getAvailableBonuses", "()Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AvailableBonusesDto;", "getItems", "getPersonalPromoAction", "()Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PersonalPromoActionDto;", "getPrice", "()Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;", "getPromoCode", "()Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PromoCodeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartDto {
    @uca("appliedBonusActions")
    private final List<AppliedBonusActionDto> appliedBonusActions;
    @uca("availableBonuses")
    private final AvailableBonusesDto availableBonuses;
    @uca("items")
    private final List<CartItemResponseDto> items;
    @uca("personalAction")
    private final PersonalPromoActionDto personalPromoAction;
    @uca("price")
    private final PriceDto price;
    @uca("promoCode")
    private final PromoCodeDto promoCode;

    public CartDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CartDto copy$default(CartDto cartDto, List list, AvailableBonusesDto availableBonusesDto, List list2, PriceDto priceDto, PromoCodeDto promoCodeDto, PersonalPromoActionDto personalPromoActionDto, int i, Object obj) {
        List<AppliedBonusActionDto> list3 = list;
        if ((i & 1) != 0) {
            list3 = cartDto.appliedBonusActions;
        }
        if ((i & 2) != 0) {
            availableBonusesDto = cartDto.availableBonuses;
        }
        AvailableBonusesDto availableBonusesDto2 = availableBonusesDto;
        List<CartItemResponseDto> list4 = list2;
        if ((i & 4) != 0) {
            list4 = cartDto.items;
        }
        List list5 = list4;
        if ((i & 8) != 0) {
            priceDto = cartDto.price;
        }
        PriceDto priceDto2 = priceDto;
        if ((i & 16) != 0) {
            promoCodeDto = cartDto.promoCode;
        }
        PromoCodeDto promoCodeDto2 = promoCodeDto;
        if ((i & 32) != 0) {
            personalPromoActionDto = cartDto.personalPromoAction;
        }
        return cartDto.copy(list3, availableBonusesDto2, list5, priceDto2, promoCodeDto2, personalPromoActionDto);
    }

    public final List<AppliedBonusActionDto> component1() {
        return this.appliedBonusActions;
    }

    public final AvailableBonusesDto component2() {
        return this.availableBonuses;
    }

    public final List<CartItemResponseDto> component3() {
        return this.items;
    }

    public final PriceDto component4() {
        return this.price;
    }

    public final PromoCodeDto component5() {
        return this.promoCode;
    }

    public final PersonalPromoActionDto component6() {
        return this.personalPromoAction;
    }

    public final CartDto copy(List<AppliedBonusActionDto> list, AvailableBonusesDto availableBonusesDto, List<CartItemResponseDto> list2, PriceDto priceDto, PromoCodeDto promoCodeDto, PersonalPromoActionDto personalPromoActionDto) {
        z65.h(list, "appliedBonusActions");
        z65.h(list2, "items");
        z65.h(priceDto, "price");
        return new CartDto(list, availableBonusesDto, list2, priceDto, promoCodeDto, personalPromoActionDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartDto)) {
            return false;
        }
        CartDto cartDto = (CartDto) obj;
        if (z65.c(this.appliedBonusActions, cartDto.appliedBonusActions) && z65.c(this.availableBonuses, cartDto.availableBonuses) && z65.c(this.items, cartDto.items) && z65.c(this.price, cartDto.price) && z65.c(this.promoCode, cartDto.promoCode) && z65.c(this.personalPromoAction, cartDto.personalPromoAction)) {
            return true;
        }
        return false;
    }

    public final List<AppliedBonusActionDto> getAppliedBonusActions() {
        return this.appliedBonusActions;
    }

    public final AvailableBonusesDto getAvailableBonuses() {
        return this.availableBonuses;
    }

    public final List<CartItemResponseDto> getItems() {
        return this.items;
    }

    public final PersonalPromoActionDto getPersonalPromoAction() {
        return this.personalPromoAction;
    }

    public final PriceDto getPrice() {
        return this.price;
    }

    public final PromoCodeDto getPromoCode() {
        return this.promoCode;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.appliedBonusActions.hashCode() * 31;
        AvailableBonusesDto availableBonusesDto = this.availableBonuses;
        int i = 0;
        if (availableBonusesDto == null) {
            hashCode = 0;
        } else {
            hashCode = availableBonusesDto.hashCode();
        }
        int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.items.hashCode()) * 31) + this.price.hashCode()) * 31;
        PromoCodeDto promoCodeDto = this.promoCode;
        if (promoCodeDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = promoCodeDto.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        PersonalPromoActionDto personalPromoActionDto = this.personalPromoAction;
        if (personalPromoActionDto != null) {
            i = personalPromoActionDto.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        List<AppliedBonusActionDto> list = this.appliedBonusActions;
        AvailableBonusesDto availableBonusesDto = this.availableBonuses;
        List<CartItemResponseDto> list2 = this.items;
        PriceDto priceDto = this.price;
        PromoCodeDto promoCodeDto = this.promoCode;
        PersonalPromoActionDto personalPromoActionDto = this.personalPromoAction;
        return "CartDto(appliedBonusActions=" + list + ", availableBonuses=" + availableBonusesDto + ", items=" + list2 + ", price=" + priceDto + ", promoCode=" + promoCodeDto + ", personalPromoAction=" + personalPromoActionDto + ")";
    }

    public CartDto(List<AppliedBonusActionDto> list, AvailableBonusesDto availableBonusesDto, List<CartItemResponseDto> list2, PriceDto priceDto, PromoCodeDto promoCodeDto, PersonalPromoActionDto personalPromoActionDto) {
        z65.h(list, "appliedBonusActions");
        z65.h(list2, "items");
        z65.h(priceDto, "price");
        this.appliedBonusActions = list;
        this.availableBonuses = availableBonusesDto;
        this.items = list2;
        this.price = priceDto;
        this.promoCode = promoCodeDto;
        this.personalPromoAction = personalPromoActionDto;
    }

    public /* synthetic */ CartDto(List list, AvailableBonusesDto availableBonusesDto, List list2, PriceDto priceDto, PromoCodeDto promoCodeDto, PersonalPromoActionDto personalPromoActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list, (i & 2) != 0 ? null : availableBonusesDto, (i & 4) != 0 ? kc1.l() : list2, (i & 8) != 0 ? new PriceDto(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 1023, null) : priceDto, (i & 16) != 0 ? null : promoCodeDto, (i & 32) == 0 ? personalPromoActionDto : null);
    }
}
