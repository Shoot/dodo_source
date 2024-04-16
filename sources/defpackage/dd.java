package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f\u001a\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f\u001a\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0014"}, d2 = {"Lkl8;", "category", "Ldc;", "b", "Lqd;", "sender", DateTokenConverter.CONVERTER_KEY, "Lhn6;", "priceBelowMinPrice", com.huawei.hms.opendevice.c.a, "", "positionSelected", "", "otherTime", "f", "isRedirectSaveCardEnabled", com.huawei.hms.push.e.a, "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: dd  reason: default package */
/* loaded from: classes4.dex */
public final class dd {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dd$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ StateEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(StateEntity stateEntity) {
            super(1);
            this.a = stateEntity;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            Double d;
            double d2;
            Integer num;
            int w;
            String str;
            k0<CartItemEntity> cartItems;
            DataPromoCodeEntity promoCode;
            PriceEntity price;
            PriceEntity price2;
            z65.h(bcVar, "$this$eventProducer");
            CartEntity cart = this.a.getCart();
            List list = null;
            if (cart != null && (price2 = cart.getPrice()) != null) {
                d = Double.valueOf(price2.getRawPrice());
            } else {
                d = null;
            }
            CartEntity cart2 = this.a.getCart();
            if (cart2 != null && (price = cart2.getPrice()) != null) {
                d2 = price.getTotalDiscount();
            } else {
                d2 = 0.0d;
            }
            CartEntity cart3 = this.a.getCart();
            String str2 = (cart3 == null || (promoCode = cart3.getPromoCode()) == null || (str2 = promoCode.getPromoCode()) == null) ? "" : "";
            CartEntity cart4 = this.a.getCart();
            if (cart4 != null && (cartItems = cart4.getCartItems()) != null) {
                num = Integer.valueOf(cartItems.size());
            } else {
                num = null;
            }
            Currency currency = Currency.getInstance(kn6.f().c());
            CartEntity cart5 = this.a.getCart();
            if (cart5 != null) {
                list = cart5.getCartItems();
            }
            if (list == null) {
                list = kc1.l();
            }
            bcVar.d("currency", currency.getCurrencyCode(), true);
            bcVar.d("value", d, true);
            bcVar.d("itemCount", num, true);
            bcVar.d("promocode", str2, true);
            bcVar.d("rawPrice", d, true);
            bcVar.d("discount", Double.valueOf(d2), true);
            double doubleValue = ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
            z65.e(currency);
            bcVar.b(doubleValue, currency);
            List<CartItemEntity> list2 = list;
            w = lc1.w(list2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (CartItemEntity cartItemEntity : list2) {
                String name = cartItemEntity.getName();
                String productId = cartItemEntity.getProductId();
                if (productId == null) {
                    str = "";
                } else {
                    str = productId;
                }
                arrayList.add(new od(name, str, Double.valueOf(cartItemEntity.getTotalPrice()), null, vc.f(cartItemEntity.getCategory()), uc.a.c(cartItemEntity.getSizeGroupId()), Integer.valueOf(cartItemEntity.getCount()), 8, null));
            }
            return nv3.b(bcVar, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dd$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ kl8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kl8 kl8Var) {
            super(1);
            this.a = kl8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.i(bcVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dd$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ hn6 a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(hn6 hn6Var, qd qdVar) {
            super(1);
            this.a = hn6Var;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.o(bcVar, "sum_difference", this.a);
            return vc.z(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dd$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd qdVar) {
            super(1);
            this.a = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.z(bcVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dd$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "is_redirect_saved_card_enabled", Boolean.valueOf(this.a), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dd$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i, boolean z) {
            super(1);
            this.a = i;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "interval_position", Integer.valueOf(this.a), false, 4, null);
            return bc.e(bcVar, "other_time", Boolean.valueOf(this.b), false, 4, null);
        }
    }

    public static final dc a(StateEntity stateEntity) {
        z65.h(stateEntity, "state");
        return ec.a("begin_checkout", new a(stateEntity));
    }

    public static final dc b(kl8 kl8Var) {
        z65.h(kl8Var, "category");
        return ec.a("cart_product_edit_click", new b(kl8Var));
    }

    public static final dc c(hn6 hn6Var, qd qdVar) {
        z65.h(hn6Var, "priceBelowMinPrice");
        z65.h(qdVar, "sender");
        return ec.a("cart_sum_less_than_minimum_click", new c(hn6Var, qdVar));
    }

    public static final dc d(qd qdVar) {
        z65.h(qdVar, "sender");
        return ec.a("cart_sum_less_than_minimum_show", new d(qdVar));
    }

    public static final dc e(boolean z) {
        return ec.a("checkout_is_redirect_saved_card_enabled", new e(z));
    }

    public static final dc f(int i, boolean z) {
        return ec.a("checkout_timeinterval_click", new f(i, z));
    }
}
