package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity;
import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.fda;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.cart.dto.SizeDto;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
import ru.dodopizza.backend.domain.state.dto.cart.CartDto;
import ru.dodopizza.backend.domain.state.dto.cart.DiscountDto;
import ru.dodopizza.backend.domain.state.dto.cart.PersonalPriceDiscountDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.AppliedBonusActionDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.AvailableBonusesDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.PersonalPromoActionDto;
import ru.dodopizza.backend.domain.state.dto.cart.bonuses.PromoCodeDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.CartComboSlotProductResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.CartItemResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.CustomizationResponseDto;
import ru.dodopizza.backend.domain.state.dto.cart.response.PizzaHalvesResponseDto;
/* compiled from: CartConverter.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006\u001c"}, d2 = {"Liq0;", "Lhq0;", "Lru/dodopizza/backend/domain/state/dto/cart/response/CartItemResponseDto;", "dto", "", "isTransparentImageUrlEnabled", "Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", c.a, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "Lcom/dodopizza/persistence/entity/ImageEntity;", e.a, "Lru/dodopizza/backend/domain/state/dto/cart/DiscountDto;", "Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/state/dto/cart/PersonalPriceDiscountDto;", "Lcom/dodopizza/persistence/entity/cart/PersonalPriceDiscountEntity;", "f", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AvailableBonusesDto;", "", "b", "Lru/dodopizza/backend/domain/state/dto/cart/CartDto;", "Lcom/dodopizza/persistence/entity/cart/CartEntity;", "a", "Lfda;", "Lfda;", "serverTimeParser", "<init>", "(Lfda;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iq0  reason: default package */
/* loaded from: classes4.dex */
public final class iq0 implements hq0 {
    private final fda a;

    public iq0(fda fdaVar) {
        z65.h(fdaVar, "serverTimeParser");
        this.a = fdaVar;
    }

    private final List<CartItemEntity> b(AvailableBonusesDto availableBonusesDto, boolean z) {
        int w;
        List<CartItemResponseDto> giftItems = availableBonusesDto.getGiftItems();
        w = lc1.w(giftItems, 10);
        ArrayList arrayList = new ArrayList(w);
        for (CartItemResponseDto cartItemResponseDto : giftItems) {
            CartItemEntity c = c(cartItemResponseDto, z);
            c.setAvailableMore(c.getCount());
            c.setCount(0);
            arrayList.add(c);
        }
        return arrayList;
    }

    private final CartItemEntity c(CartItemResponseDto cartItemResponseDto, boolean z) {
        Integer num;
        Float f;
        ImageEntity imageEntity;
        CustomizationEntity customizationEntity;
        PizzaHalvesEntity pizzaHalvesEntity;
        DiscountEntity discountEntity;
        String id = cartItemResponseDto.getId();
        int count = cartItemResponseDto.getCount();
        int maxCount = cartItemResponseDto.getMaxCount();
        String name = cartItemResponseDto.getName();
        String description = cartItemResponseDto.getDescription();
        SizeDto sizeInfo = cartItemResponseDto.getSizeInfo();
        if (sizeInfo != null) {
            num = Integer.valueOf(sizeInfo.getMeasure());
        } else {
            num = null;
        }
        int intValue = ((Number) mh5.c(num, 0)).intValue();
        SizeDto sizeInfo2 = cartItemResponseDto.getSizeInfo();
        if (sizeInfo2 != null) {
            f = Float.valueOf(sizeInfo2.getValue());
        } else {
            f = null;
        }
        float floatValue = ((Number) mh5.c(f, Float.valueOf(0.0f))).floatValue();
        int doughType = cartItemResponseDto.getDoughType();
        String doughTypeName = cartItemResponseDto.getDoughTypeName();
        int sizeGroup = cartItemResponseDto.getSizeGroup();
        String sizeGroupName = cartItemResponseDto.getSizeGroupName();
        ProductImageDto image = cartItemResponseDto.getImage();
        if (image != null) {
            imageEntity = e(image, z);
        } else {
            imageEntity = null;
        }
        String category = cartItemResponseDto.getCategory();
        CustomizationResponseDto customization = cartItemResponseDto.getCustomization();
        if (customization != null) {
            customizationEntity = wja.m(customization);
        } else {
            customizationEntity = null;
        }
        PizzaHalvesResponseDto pizzaHalves = cartItemResponseDto.getPizzaHalves();
        if (pizzaHalves != null) {
            pizzaHalvesEntity = wja.o(z, pizzaHalves);
        } else {
            pizzaHalvesEntity = null;
        }
        k0 k0Var = new k0();
        for (Iterator it = cartItemResponseDto.getComboProducts().iterator(); it.hasNext(); it = it) {
            k0Var.add(wja.f(z, (CartComboSlotProductResponseDto) it.next()));
        }
        int errorCode = cartItemResponseDto.getErrorCode();
        boolean isGift = cartItemResponseDto.isGift();
        double price = cartItemResponseDto.getPrice();
        int order = cartItemResponseDto.getOrder();
        String shoppingItemId = cartItemResponseDto.getShoppingItemId();
        String productId = cartItemResponseDto.getProductId();
        if (productId == null) {
            productId = "";
        }
        String str = productId;
        DiscountDto discount = cartItemResponseDto.getDiscount();
        if (discount != null) {
            discountEntity = d(discount);
        } else {
            discountEntity = null;
        }
        return new CartItemEntity(id, count, maxCount, 0, name, description, intValue, floatValue, doughType, doughTypeName, sizeGroup, sizeGroupName, imageEntity, category, customizationEntity, pizzaHalvesEntity, k0Var, errorCode, isGift, price, order, shoppingItemId, str, discountEntity, cartItemResponseDto.getTotalPrice(), cartItemResponseDto.isEditable());
    }

    private final DiscountEntity d(DiscountDto discountDto) {
        PersonalPriceDiscountEntity personalPriceDiscountEntity;
        String bonusActionId = discountDto.getBonusActionId();
        String title = discountDto.getTitle();
        String description = discountDto.getDescription();
        double amount = discountDto.getAmount();
        long loyaltyCoinsUsed = discountDto.getLoyaltyCoinsUsed();
        PersonalPriceDiscountDto personalPriceDiscount = discountDto.getPersonalPriceDiscount();
        if (personalPriceDiscount != null) {
            personalPriceDiscountEntity = f(personalPriceDiscount);
        } else {
            personalPriceDiscountEntity = null;
        }
        return new DiscountEntity(bonusActionId, title, description, amount, loyaltyCoinsUsed, personalPriceDiscountEntity);
    }

    private final ImageEntity e(ProductImageDto productImageDto, boolean z) {
        return new ImageEntity(productImageDto.getType(), ug6.a(productImageDto, z));
    }

    private final PersonalPriceDiscountEntity f(PersonalPriceDiscountDto personalPriceDiscountDto) {
        return new PersonalPriceDiscountEntity(fda.a.a(this.a, personalPriceDiscountDto.getEndDateTimeUtc(), null, 2, null));
    }

    @Override // defpackage.hq0
    public CartEntity a(CartDto cartDto, boolean z) {
        List<CartItemEntity> list;
        DataPromoCodeEntity dataPromoCodeEntity;
        PersonalPromoActionEntity personalPromoActionEntity;
        z65.h(cartDto, "dto");
        k0<CartItemEntity> k0Var = new k0();
        for (CartItemResponseDto cartItemResponseDto : cartDto.getItems()) {
            k0Var.add(c(cartItemResponseDto, z));
        }
        AvailableBonusesDto availableBonuses = cartDto.getAvailableBonuses();
        if (availableBonuses != null) {
            list = b(availableBonuses, z);
        } else {
            list = null;
        }
        if (list == null) {
            list = kc1.l();
        }
        k0 k0Var2 = new k0();
        for (Object obj : list) {
            CartItemEntity cartItemEntity = (CartItemEntity) obj;
            if (!k0Var.isEmpty()) {
                for (CartItemEntity cartItemEntity2 : k0Var) {
                    if (!z65.c(cartItemEntity2.getProductId(), cartItemEntity.getProductId()) || cartItemEntity2.isGift() != cartItemEntity.isGift()) {
                    }
                }
            }
            k0Var2.add(obj);
        }
        PriceEntity invoke = fva.r().invoke(cartDto.getPrice());
        PromoCodeDto promoCode = cartDto.getPromoCode();
        if (promoCode != null) {
            dataPromoCodeEntity = fva.v().invoke(promoCode);
        } else {
            dataPromoCodeEntity = null;
        }
        PersonalPromoActionDto personalPromoAction = cartDto.getPersonalPromoAction();
        if (personalPromoAction != null) {
            personalPromoActionEntity = fva.u().invoke(personalPromoAction);
        } else {
            personalPromoActionEntity = null;
        }
        k0 k0Var3 = new k0();
        for (AppliedBonusActionDto appliedBonusActionDto : cartDto.getAppliedBonusActions()) {
            k0Var3.add(wja.c(appliedBonusActionDto));
        }
        return new CartEntity(k0Var, invoke, k0Var2, dataPromoCodeEntity, personalPromoActionEntity, k0Var3);
    }
}
