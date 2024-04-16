package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "", "orderNumber", "Ld88;", "pizzeria", "Lmh0;", "buildInfo", "Ldc;", c.a, "(Lcom/dodopizza/persistence/entity/cart/StateEntity;Ljava/lang/Integer;Ld88;Lmh0;)Ldc;", "Lbc7;", BonusActionEntity.ORDER, DateTokenConverter.CONVERTER_KEY, "", "b", "(Lmh0;)Ljava/lang/String;", "affiliation", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: jd  reason: default package */
/* loaded from: classes4.dex */
public final class jd {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jd$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ StateEntity a;
        final /* synthetic */ mh0 b;
        final /* synthetic */ Integer c;
        final /* synthetic */ d88 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(StateEntity stateEntity, mh0 mh0Var, Integer num, d88 d88Var) {
            super(1);
            this.a = stateEntity;
            this.b = mh0Var;
            this.c = num;
            this.d = d88Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            double d;
            String str;
            String str2;
            int i;
            int w;
            String str3;
            DataPromoCodeEntity promoCode;
            PriceEntity price;
            PriceEntity price2;
            z65.h(bcVar, "$this$eventProducer");
            CartEntity cart = this.a.getCart();
            double d2 = 0.0d;
            if (cart != null && (price2 = cart.getPrice()) != null) {
                d = price2.getRawPrice();
            } else {
                d = 0.0d;
            }
            CartEntity cart2 = this.a.getCart();
            if (cart2 != null && (price = cart2.getPrice()) != null) {
                d2 = price.getTotalDiscount();
            }
            double d3 = d2;
            CartEntity cart3 = this.a.getCart();
            List list = null;
            if (cart3 != null && (promoCode = cart3.getPromoCode()) != null) {
                str = promoCode.getPromoCode();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            Integer currentOrderType = this.a.getCurrentOrderType();
            if (currentOrderType != null) {
                i = currentOrderType.intValue();
            } else {
                i = 0;
            }
            String c = kn6.c.b(d).c();
            CartEntity cart4 = this.a.getCart();
            if (cart4 != null) {
                list = cart4.getCartItems();
            }
            if (list == null) {
                list = kc1.l();
            }
            bc.e(bcVar, "affiliation", jd.b(this.b), false, 4, null);
            bc.e(bcVar, "currency", c, false, 4, null);
            bc.e(bcVar, "value", Double.valueOf(d), false, 4, null);
            bc.e(bcVar, CommonCode.MapKey.TRANSACTION_ID, vc.a(this.a.getPlacedOrderId()), false, 4, null);
            bc.e(bcVar, "discount", Double.valueOf(d3), false, 4, null);
            vc.s(bcVar, i);
            vc.p(bcVar, this.c);
            vc.v(bcVar, wn3.a(this.a));
            vc.w(bcVar, this.d);
            nv3.a(bcVar, str2);
            List<CartItemEntity> list2 = list;
            w = lc1.w(list2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (CartItemEntity cartItemEntity : list2) {
                String name = cartItemEntity.getName();
                String productId = cartItemEntity.getProductId();
                if (productId == null) {
                    str3 = "";
                } else {
                    str3 = productId;
                }
                arrayList.add(new od(name, str3, Double.valueOf(cartItemEntity.getTotalPrice()), null, vc.f(cartItemEntity.getCategory()), uc.a.c(cartItemEntity.getSizeGroupId()), Integer.valueOf(cartItemEntity.getCount()), 8, null));
            }
            return nv3.b(bcVar, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jd$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ bc7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(bc7 bc7Var) {
            super(1);
            this.a = bc7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "currency", this.a.D().c(), false, 4, null);
            bc.e(bcVar, "value", Double.valueOf(this.a.D().a()), false, 4, null);
            return bc.e(bcVar, CommonCode.MapKey.TRANSACTION_ID, vc.a(this.a.t()), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(mh0 mh0Var) {
        if (mh0Var.j()) {
            return "Huawei AppGallery";
        }
        return "Google Play";
    }

    public static final dc c(StateEntity stateEntity, Integer num, d88 d88Var, mh0 mh0Var) {
        z65.h(stateEntity, "state");
        z65.h(mh0Var, "buildInfo");
        return ec.a("purchase", new a(stateEntity, mh0Var, num, d88Var));
    }

    public static final dc d(bc7 bc7Var) {
        z65.h(bc7Var, BonusActionEntity.ORDER);
        return ec.a("refund", new b(bc7Var));
    }
}
