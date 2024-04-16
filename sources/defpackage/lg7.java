package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kl8;
import defpackage.nb6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import ru.dodopizza.backend.domain.cart.dto.ComboCartItemDto;
import ru.dodopizza.backend.domain.cart.dto.CustomizationOrderResponseDto;
import ru.dodopizza.backend.domain.cart.dto.OrderItemRemovedIngredientDto;
import ru.dodopizza.backend.domain.cart.dto.PizzaHalfOrderDto;
import ru.dodopizza.backend.domain.cart.dto.ProductCartItemDto;
import ru.dodopizza.backend.domain.cart.dto.SizeDto;
import ru.dodopizza.backend.domain.cart.dto.ToppingOrderDto;
import ru.dodopizza.backend.domain.common.ImageUrls;
import ru.dodopizza.backend.domain.order.dto.DataOrderDto;
import ru.dodopizza.backend.domain.order.dto.GameIconsDto;
import ru.dodopizza.backend.domain.order.dto.LocationDto;
import ru.dodopizza.backend.domain.order.dto.LocationIconsDto;
import ru.dodopizza.backend.domain.order.dto.OrderLocationDto;
import ru.dodopizza.backend.domain.order.dto.OrderStateInfoDto;
import ru.dodopizza.backend.domain.order.dto.PositionCourierDto;
/* compiled from: OrderMapper.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u00104\u001a\u000202¢\u0006\u0004\b5\u00106J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0016\u0010\u0019\u001a\u00020\u0007*\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0014\u0010\u001a\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0014\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001fH\u0002J \u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00022\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0002H\u0002J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0002J\u0016\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u00100\u001a\u0004\u0018\u00010/2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020.0-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00103¨\u00067"}, d2 = {"Llg7;", "", "", "Lru/dodopizza/backend/domain/order/dto/GameIconsDto;", "dtos", "Loc4;", Image.TYPE_HIGH, "", "timeString", "Lpgb;", "timeParser", "", Image.TYPE_MEDIUM, "Lru/dodopizza/backend/domain/cart/dto/ProductCartItemDto;", "dto", "", "fromCombo", "isTransparentImageUrlEnabled", "Lyf7;", "l", "Lru/dodopizza/backend/domain/cart/dto/CustomizationOrderResponseDto;", "Lzf7;", "a", "Lru/dodopizza/backend/domain/cart/dto/PizzaHalfOrderDto;", "transparent", e.a, "f", "Lru/dodopizza/backend/domain/order/dto/OrderStateInfoDto;", "orderStateInfoDto", "Loi7;", "k", "Lru/dodopizza/backend/domain/order/dto/OrderLocationDto;", "Lfg7;", "j", "Lru/dodopizza/backend/domain/order/dto/LocationIconsDto;", "Lsv5;", "i", "", "number", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/order/dto/DataOrderDto;", "dataOrderDto", "g", "Lbc7;", "b", "", "Lru/dodopizza/backend/domain/order/dto/PositionCourierDto;", "Lwf8;", c.a, "Lpgb;", "La98;", "La98;", "pizzeriaRepository", "<init>", "(Lpgb;La98;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lg7  reason: default package */
/* loaded from: classes3.dex */
public final class lg7 {
    private final pgb a;
    private final a98 b;

    public lg7(pgb pgbVar, a98 a98Var) {
        z65.h(pgbVar, "timeParser");
        z65.h(a98Var, "pizzeriaRepository");
        this.a = pgbVar;
        this.b = a98Var;
    }

    private final zf7 a(CustomizationOrderResponseDto customizationOrderResponseDto, boolean z) {
        int w;
        int w2;
        int w3;
        List<OrderItemRemovedIngredientDto> removedIngredients = customizationOrderResponseDto.getRemovedIngredients();
        w = lc1.w(removedIngredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (OrderItemRemovedIngredientDto orderItemRemovedIngredientDto : removedIngredients) {
            arrayList.add(new cg7(orderItemRemovedIngredientDto.getId(), orderItemRemovedIngredientDto.getName()));
        }
        List<ToppingOrderDto> addedToppings = customizationOrderResponseDto.getAddedToppings();
        w2 = lc1.w(addedToppings, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ToppingOrderDto toppingOrderDto : addedToppings) {
            arrayList2.add(new dg7(toppingOrderDto.getName(), toppingOrderDto.getParentId(), kn6.c.b(toppingOrderDto.getPrice())));
        }
        List<PizzaHalfOrderDto> pizzaHalves = customizationOrderResponseDto.getPizzaHalves();
        w3 = lc1.w(pizzaHalves, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (PizzaHalfOrderDto pizzaHalfOrderDto : pizzaHalves) {
            arrayList3.add(new bg7(pizzaHalfOrderDto.getProductId(), e(pizzaHalfOrderDto, z), kn6.c.b(pizzaHalfOrderDto.getPrice())));
        }
        return new zf7(arrayList, arrayList3, arrayList2);
    }

    private final String d(float f) {
        long j = f;
        if (f == ((float) j)) {
            pza pzaVar = pza.a;
            String format = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
            z65.g(format, "format(...)");
            return format;
        }
        pza pzaVar2 = pza.a;
        String format2 = String.format("%s", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        z65.g(format2, "format(...)");
        return format2;
    }

    private final String e(PizzaHalfOrderDto pizzaHalfOrderDto, boolean z) {
        String str = null;
        if (pizzaHalfOrderDto != null) {
            if (z) {
                ImageUrls imageUrls = pizzaHalfOrderDto.getImageUrls();
                if (imageUrls != null) {
                    str = imageUrls.getWebp();
                }
            } else {
                str = pizzaHalfOrderDto.getImageUrl();
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private final String f(ProductCartItemDto productCartItemDto, boolean z) {
        ImageUrls imageUrls;
        String webp;
        if (!z || (imageUrls = productCartItemDto.getImageUrls()) == null || (webp = imageUrls.getWebp()) == null) {
            return productCartItemDto.getImageUrl();
        }
        return webp;
    }

    private final long g(DataOrderDto dataOrderDto) {
        if (dataOrderDto.getOrderType() == jk7.e.i()) {
            if (dataOrderDto.getEstimatedTimeOfArrival() != null) {
                return this.a.b(dataOrderDto.getEstimatedTimeOfArrival());
            }
            if (dataOrderDto.getGuaranteedDeliveryDateUtc() != null) {
                return this.a.b(dataOrderDto.getGuaranteedDeliveryDateUtc());
            }
        } else if (dataOrderDto.getGuaranteedDeliveryDateUtc() != null) {
            return this.a.b(dataOrderDto.getGuaranteedDeliveryDateUtc());
        } else {
            if (dataOrderDto.getGuaranteedDeliveryDateLocal() != null) {
                return this.a.a(dataOrderDto.getGuaranteedDeliveryDateLocal());
            }
        }
        return 0L;
    }

    private final List<oc4> h(List<GameIconsDto> list) {
        int w;
        List<GameIconsDto> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (GameIconsDto gameIconsDto : list2) {
            arrayList.add(new oc4(gameIconsDto.getLightIconUrl(), gameIconsDto.getDarkIconUrl()));
        }
        return arrayList;
    }

    private final List<sv5> i(List<LocationIconsDto> list) {
        int w;
        sv5 sv5Var;
        List<LocationIconsDto> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (LocationIconsDto locationIconsDto : list2) {
            if (locationIconsDto != null) {
                sv5Var = new sv5(locationIconsDto.getIconType(), locationIconsDto.getLightThemeUrl(), locationIconsDto.getDarkThemeUrl());
            } else {
                sv5Var = null;
            }
            arrayList.add(sv5Var);
        }
        return arrayList;
    }

    private final fg7 j(OrderLocationDto orderLocationDto) {
        if (orderLocationDto != null) {
            return new fg7(orderLocationDto.getLat(), orderLocationDto.getLon());
        }
        return null;
    }

    private final oi7 k(OrderStateInfoDto orderStateInfoDto) {
        return new oi7(mi7.b.a(orderStateInfoDto.getState()), orderStateInfoDto.getTotalBars(), orderStateInfoDto.getFinishedBars());
    }

    private final yf7 l(ProductCartItemDto productCartItemDto, boolean z, boolean z2) {
        Pair pair;
        ProductCartItemDto productCartItemDto2;
        String str;
        Float f;
        try {
            SizeDto size = productCartItemDto.getSize();
            Integer num = null;
            if (size != null) {
                f = Float.valueOf(size.getValue());
            } else {
                f = null;
            }
            String d = d(((Number) mh5.c(f, Float.valueOf(0.0f))).floatValue());
            nb6.a aVar = nb6.a;
            SizeDto size2 = productCartItemDto.getSize();
            if (size2 != null) {
                num = Integer.valueOf(size2.getMeasure());
            }
            pair = new Pair(d, aVar.a(((Number) mh5.c(num, -1)).intValue()));
        } catch (Exception unused) {
            pair = new Pair("", nb6.h);
        }
        String str2 = (String) pair.a();
        nb6 nb6Var = (nb6) pair.b();
        zf7 a = a(productCartItemDto.getCustomization(), z2);
        String productId = productCartItemDto.getProductId();
        kl8 a2 = kl8.a.a.a(String.valueOf(productCartItemDto.getCategory()));
        String name = productCartItemDto.getName();
        String description = productCartItemDto.getDescription();
        if (description == null) {
            str = "";
            productCartItemDto2 = productCartItemDto;
        } else {
            productCartItemDto2 = productCartItemDto;
            str = description;
        }
        String f2 = f(productCartItemDto2, z2);
        int count = productCartItemDto.getCount();
        kn6 kn6Var = kn6.c;
        return new yf7(productId, a2, name, str, f2, count, kn6Var.b(productCartItemDto.getTotalPrice()), kn6Var.b(productCartItemDto.getTotalPrice()), productCartItemDto.getDoughType(), productCartItemDto.getDoughTypeName(), productCartItemDto.getSizeGroup(), productCartItemDto.getSizeGroupName(), z, str2, nb6Var, a);
    }

    private final long m(String str, pgb pgbVar) {
        if (str != null) {
            return pgbVar.a(str);
        }
        return 0L;
    }

    public final bc7 b(DataOrderDto dataOrderDto, boolean z) {
        List q0;
        int w;
        int w2;
        z65.h(dataOrderDto, "dto");
        d88 d88Var = (d88) mh5.c(this.b.a(dataOrderDto.getPizzeriaId()), d88.x.a());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!dataOrderDto.getProductCartItems().isEmpty()) {
            List<ProductCartItemDto> productCartItems = dataOrderDto.getProductCartItems();
            w2 = lc1.w(productCartItems, 10);
            ArrayList arrayList3 = new ArrayList(w2);
            for (ProductCartItemDto productCartItemDto : productCartItems) {
                arrayList3.add(l(productCartItemDto, false, z));
            }
            arrayList = arrayList3;
        }
        if (!dataOrderDto.getComboCartItems().isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for (ComboCartItemDto comboCartItemDto : dataOrderDto.getComboCartItems()) {
                List<ProductCartItemDto> products = comboCartItemDto.getProducts();
                w = lc1.w(products, 10);
                ArrayList arrayList5 = new ArrayList(w);
                for (ProductCartItemDto productCartItemDto2 : products) {
                    arrayList5.add(l(productCartItemDto2, true, z));
                }
                List<yf7> b = ri4.b(arrayList5);
                z65.g(b, "groupOrderedGoodsInCombo(...)");
                pc1.C(arrayList4, b);
            }
            arrayList2 = arrayList4;
        }
        q0 = sc1.q0(arrayList, arrayList2);
        List<yf7> a = ri4.a(q0);
        z65.g(a, "groupOrderedGoods(...)");
        long m = m(dataOrderDto.getGuaranteedDeliveryDateLocal(), this.a);
        long m2 = m(dataOrderDto.getStartExecutionDateLocal(), this.a);
        long m3 = m(dataOrderDto.getReceiptDateLocal(), this.a);
        String id = dataOrderDto.getId();
        int orderNumber = dataOrderDto.getOrderNumber();
        oi7 k = k(dataOrderDto.getOrderStateInfo());
        int orderType = dataOrderDto.getOrderType();
        String str = (String) mh5.c(dataOrderDto.getClientName(), "");
        String str2 = (String) mh5.c(dataOrderDto.getAddress(), "");
        kn6 kn6Var = kn6.c;
        return new bc7(id, orderNumber, k, orderType, a, d88Var, str, str2, kn6Var.b(dataOrderDto.getTotalPrice()), d88Var.M(), dataOrderDto.getCanBeCancelled(), dataOrderDto.isDeferredOrder(), m, g(dataOrderDto), m2, m3, dataOrderDto.isRatable(), kn6Var.b(dataOrderDto.getDeliveryFee()), dataOrderDto.getTableNumber(), dataOrderDto.getUuid(), j(dataOrderDto.getDeliveryLocation()), j(dataOrderDto.getUnitLocation()), i(dataOrderDto.getDeliveryIcons()), i(dataOrderDto.getUnitIcons()), i(dataOrderDto.getCourierIcons()), h(dataOrderDto.getGameIcons()));
    }

    public final wf8 c(Collection<PositionCourierDto> collection) {
        Object Y;
        Double d;
        z65.h(collection, "dto");
        Double d2 = null;
        if (!collection.isEmpty()) {
            Y = sc1.Y(collection);
            PositionCourierDto positionCourierDto = (PositionCourierDto) Y;
            String orderId = positionCourierDto.getOrderId();
            LocationDto location = positionCourierDto.getLocation();
            if (location != null) {
                d = Double.valueOf(location.getLat());
            } else {
                d = null;
            }
            LocationDto location2 = positionCourierDto.getLocation();
            if (location2 != null) {
                d2 = Double.valueOf(location2.getLon());
            }
            return new wf8(orderId, d, d2, positionCourierDto.getUpdateIntervalSeconds());
        }
        return null;
    }
}
