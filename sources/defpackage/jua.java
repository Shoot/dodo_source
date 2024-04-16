package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import io.realm.k0;
import kotlin.Metadata;
/* compiled from: StateExt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0000¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity;", "", "g", "f", "", e.a, DateTokenConverter.CONVERTER_KEY, "a", "Ljk7;", c.a, "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: jua  reason: default package */
/* loaded from: classes4.dex */
public final class jua {
    public static final int a(StateEntity stateEntity) {
        Integer num;
        k0<CartItemEntity> cartItems;
        z65.h(stateEntity, "<this>");
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (cartItems = cart.getCartItems()) != null) {
            num = Integer.valueOf(cartItems.size());
        } else {
            num = null;
        }
        return ((Number) mh5.c(num, 0)).intValue();
    }

    public static final double b(StateEntity stateEntity) {
        Double d;
        PriceEntity price;
        z65.h(stateEntity, "<this>");
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (price = cart.getPrice()) != null) {
            d = Double.valueOf(price.getDodoRubles());
        } else {
            d = null;
        }
        return ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
    }

    public static final jk7 c(StateEntity stateEntity) {
        z65.h(stateEntity, "<this>");
        return jk7.b.a(((Number) mh5.c(stateEntity.getCurrentOrderType(), Integer.valueOf(jk7.e.i()))).intValue());
    }

    public static final int d(StateEntity stateEntity) {
        PersonalPromoActionEntity promoAction;
        z65.h(stateEntity, "<this>");
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (promoAction = cart.getPromoAction()) != null) {
            return promoAction.getStatus();
        }
        return 1;
    }

    public static final int e(StateEntity stateEntity) {
        DataPromoCodeEntity promoCode;
        z65.h(stateEntity, "<this>");
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (promoCode = cart.getPromoCode()) != null) {
            return promoCode.getStatus();
        }
        return 1;
    }

    public static final double f(StateEntity stateEntity) {
        Double d;
        PriceEntity price;
        z65.h(stateEntity, "<this>");
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (price = cart.getPrice()) != null) {
            d = Double.valueOf(price.getSubtotal());
        } else {
            d = null;
        }
        return ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
    }

    public static final double g(StateEntity stateEntity) {
        Double d;
        PriceEntity price;
        z65.h(stateEntity, "<this>");
        CartEntity cart = stateEntity.getCart();
        if (cart != null && (price = cart.getPrice()) != null) {
            d = Double.valueOf(price.getTotal());
        } else {
            d = null;
        }
        return ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
    }
}
