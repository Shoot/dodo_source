package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity;
import com.dodopizza.persistence.entity.personalization.MapEntry;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntityKt;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LegacyCartService.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 92\u00020\u0001:\u0001\u001bB7\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b7\u00108J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J$\u0010\f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0016R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u001c\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u0006:"}, d2 = {"Llo5;", "Lko5;", "Lt90;", "basket", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "networkState", "", e.a, "", "Lce0;", "newAppliedBonuses", "oldAppliedBonuses", "f", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lcom/dodopizza/persistence/entity/cart/CartEntity;", "cart", "Ldx2;", "deliveryFee", "Llia;", DateTokenConverter.CONVERTER_KEY, "oldState", "newState", "", c.a, "b", "notify", "a", "Lcs0;", "Lcs0;", "basketRepository", "Lija;", "Lija;", "cartRepository", "Lfs0;", "Lfs0;", "cartUpdateService", "Lk63;", "Lk63;", "domainEvents", "Loq0;", "Loq0;", "cartItemConverter", "Lbq;", "Lbq;", "applyedPromoOfferRepository", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "Ljn6;", Image.TYPE_HIGH, "Ljn6;", "moneyFactory", "<init>", "(Lcs0;Lija;Lfs0;Lk63;Loq0;Lbq;)V", "i", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lo5  reason: default package */
/* loaded from: classes4.dex */
public final class lo5 implements ko5 {
    public static final a i = new a(null);
    private final cs0 a;
    private final ija b;
    private final fs0 c;
    private final k63 d;
    private final oq0 e;
    private final bq f;
    private final Logger g;
    private final jn6 h;

    /* compiled from: LegacyCartService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Llo5$a;", "", "", "PERSONAL_PRICE_BONUS_ID", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lo5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public lo5(cs0 cs0Var, ija ijaVar, fs0 fs0Var, k63 k63Var, oq0 oq0Var, bq bqVar) {
        z65.h(cs0Var, "basketRepository");
        z65.h(ijaVar, "cartRepository");
        z65.h(fs0Var, "cartUpdateService");
        z65.h(k63Var, "domainEvents");
        z65.h(oq0Var, "cartItemConverter");
        z65.h(bqVar, "applyedPromoOfferRepository");
        this.a = cs0Var;
        this.b = ijaVar;
        this.c = fs0Var;
        this.d = k63Var;
        this.e = oq0Var;
        this.f = bqVar;
        this.g = LoggerFactory.getLogger("LegacyCartService");
        this.h = kn6.c;
    }

    private final lia d(String str, CartEntity cartEntity, dx2 dx2Var) {
        int w;
        int w2;
        List q0;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        k0<CartItemEntity> cartItems = cartEntity.getCartItems();
        oq0 oq0Var = this.e;
        w = lc1.w(cartItems, 10);
        ArrayList arrayList = new ArrayList(w);
        for (CartItemEntity cartItemEntity : cartItems) {
            arrayList.add(oq0Var.a(cartItemEntity));
        }
        k0<CartItemEntity> giftItems = cartEntity.getGiftItems();
        oq0 oq0Var2 = this.e;
        w2 = lc1.w(giftItems, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (CartItemEntity cartItemEntity2 : giftItems) {
            arrayList2.add(oq0Var2.a(cartItemEntity2));
        }
        q0 = sc1.q0(arrayList, arrayList2);
        kn6 kn6Var = kn6.c;
        PriceEntity price = cartEntity.getPrice();
        Double d7 = null;
        if (price != null) {
            d = Double.valueOf(price.getRawPrice());
        } else {
            d = null;
        }
        hn6 b = kn6Var.b(((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue());
        PriceEntity price2 = cartEntity.getPrice();
        if (price2 != null) {
            d2 = Double.valueOf(price2.getRawPriceWithoutGoods());
        } else {
            d2 = null;
        }
        hn6 b2 = kn6Var.b(((Number) mh5.c(d2, Double.valueOf(0.0d))).doubleValue());
        PriceEntity price3 = cartEntity.getPrice();
        if (price3 != null) {
            d3 = Double.valueOf(price3.getMinOrderPriceForDelivery());
        } else {
            d3 = null;
        }
        hn6 b3 = kn6Var.b(((Number) mh5.c(d3, Double.valueOf(0.0d))).doubleValue());
        PriceEntity price4 = cartEntity.getPrice();
        if (price4 != null) {
            d4 = Double.valueOf(price4.getTotalDiscount());
        } else {
            d4 = null;
        }
        hn6 b4 = kn6Var.b(((Number) mh5.c(d4, Double.valueOf(0.0d))).doubleValue());
        PriceEntity price5 = cartEntity.getPrice();
        if (price5 != null) {
            d5 = Double.valueOf(price5.getLoyaltyRewardSum());
        } else {
            d5 = null;
        }
        double doubleValue = ((Number) mh5.c(d5, Double.valueOf(0.0d))).doubleValue();
        PriceEntity price6 = cartEntity.getPrice();
        if (price6 != null) {
            d6 = Double.valueOf(price6.getTotal());
        } else {
            d6 = null;
        }
        hn6 b5 = kn6Var.b(((Number) mh5.c(d6, Double.valueOf(0.0d))).doubleValue());
        PriceEntity price7 = cartEntity.getPrice();
        if (price7 != null) {
            d7 = Double.valueOf(price7.getSauces());
        }
        hn6 b6 = kn6Var.b(((Number) mh5.c(d7, Double.valueOf(0.0d))).doubleValue());
        ArrayList<nq0> arrayList3 = new ArrayList();
        for (Object obj : q0) {
            if (((nq0) obj).H()) {
                arrayList3.add(obj);
            }
        }
        int i2 = 0;
        for (nq0 nq0Var : arrayList3) {
            i2 += nq0Var.d();
        }
        return new lia(str, q0, i2, b6, b, b2, b3, b4, doubleValue, dx2Var, b5, true);
    }

    private final boolean e(t90 t90Var, StateEntity stateEntity) {
        if (t90Var.a().size() > this.a.f().a().size() && !z65.c(this.a.f(), t90.e)) {
            Integer currentOrderType = stateEntity.getCurrentOrderType();
            int i2 = jk7.g.i();
            if (currentOrderType != null && currentOrderType.intValue() == i2) {
                List<ce0> a2 = t90Var.a();
                z65.g(a2, "getAppliedBonusActions(...)");
                List<ce0> a3 = this.a.f().a();
                z65.g(a3, "getAppliedBonusActions(...)");
                if (!f(a2, a3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean f(List<ce0> list, List<ce0> list2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (ce0 ce0Var : list) {
            if (!list2.contains(ce0Var)) {
                arrayList.add(ce0Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((ce0) obj).getId(), "00028a9e-0000-0000-0000-000000000000")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        r6 = defpackage.sc1.F0(r6);
     */
    @Override // defpackage.ko5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.dodopizza.persistence.entity.cart.StateEntity r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "networkState"
            defpackage.z65.h(r0, r2)
            fs0 r2 = r1.c     // Catch: java.lang.Throwable -> L27
            t90 r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L27
            kn6 r3 = defpackage.kn6.c     // Catch: java.lang.Throwable -> L27
            com.dodopizza.persistence.entity.cart.CartEntity r4 = r17.getCart()     // Catch: java.lang.Throwable -> L27
            r5 = 0
            if (r4 == 0) goto L2a
            com.dodopizza.persistence.entity.cart.PriceEntity r4 = r4.getPrice()     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L2a
            double r6 = r4.getDeliveryFee()     // Catch: java.lang.Throwable -> L27
            java.lang.Double r4 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r0 = move-exception
            goto Lff
        L2a:
            r4 = r5
        L2b:
            r6 = 0
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = defpackage.mh5.c(r4, r6)     // Catch: java.lang.Throwable -> L27
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L27
            double r6 = r4.doubleValue()     // Catch: java.lang.Throwable -> L27
            hn6 r3 = r3.b(r6)     // Catch: java.lang.Throwable -> L27
            com.dodopizza.persistence.entity.personalization.PersonalizationEntity r4 = r17.getPersonalization()     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L50
            com.dodopizza.persistence.entity.personalization.DynamicDeliveryEntity r4 = r4.getDynamicDelivery()     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L50
            io.realm.k0 r4 = r4.getAdditionalData()     // Catch: java.lang.Throwable -> L27
            goto L51
        L50:
            r4 = r5
        L51:
            java.util.Map r4 = com.dodopizza.persistence.entity.personalization.UpsellProductsEntityKt.realmListToMap(r4)     // Catch: java.lang.Throwable -> L27
            com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity r6 = r17.getDelivery()     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto Lab
            io.realm.k0 r6 = r6.getFeeLevels()     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto Lab
            java.util.List r6 = defpackage.ic1.F0(r6)     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto Lab
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r7 = 10
            int r7 = defpackage.ic1.w(r6, r7)     // Catch: java.lang.Throwable -> L27
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L27
        L78:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto La7
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L27
            com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity r7 = (com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity) r7     // Catch: java.lang.Throwable -> L27
            lq3 r8 = new lq3     // Catch: java.lang.Throwable -> L27
            kn6 r9 = defpackage.kn6.c     // Catch: java.lang.Throwable -> L27
            double r10 = r7.getMin()     // Catch: java.lang.Throwable -> L27
            hn6 r10 = r9.b(r10)     // Catch: java.lang.Throwable -> L27
            double r11 = r7.getMax()     // Catch: java.lang.Throwable -> L27
            hn6 r11 = r9.b(r11)     // Catch: java.lang.Throwable -> L27
            double r12 = r7.getFee()     // Catch: java.lang.Throwable -> L27
            hn6 r7 = r9.b(r12)     // Catch: java.lang.Throwable -> L27
            r8.<init>(r10, r11, r7)     // Catch: java.lang.Throwable -> L27
            r5.add(r8)     // Catch: java.lang.Throwable -> L27
            goto L78
        La7:
            java.util.List r5 = defpackage.ic1.F0(r5)     // Catch: java.lang.Throwable -> L27
        Lab:
            if (r5 != 0) goto Lb1
            java.util.List r5 = defpackage.ic1.l()     // Catch: java.lang.Throwable -> L27
        Lb1:
            dx2 r6 = new dx2     // Catch: java.lang.Throwable -> L27
            r6.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r17.getWorkflowId()     // Catch: java.lang.Throwable -> L27
            com.dodopizza.persistence.entity.cart.CartEntity r4 = r17.getCart()     // Catch: java.lang.Throwable -> L27
            com.dodopizza.persistence.entity.cart.CartEntity r5 = new com.dodopizza.persistence.entity.cart.CartEntity     // Catch: java.lang.Throwable -> L27
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 63
            r15 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = defpackage.mh5.c(r4, r5)     // Catch: java.lang.Throwable -> L27
            com.dodopizza.persistence.entity.cart.CartEntity r4 = (com.dodopizza.persistence.entity.cart.CartEntity) r4     // Catch: java.lang.Throwable -> L27
            lia r3 = r1.d(r3, r4, r6)     // Catch: java.lang.Throwable -> L27
            ija r4 = r1.b     // Catch: java.lang.Throwable -> L27
            r4.a(r3)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r1.e(r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto Le9
            k63 r0 = r1.d     // Catch: java.lang.Throwable -> L27
            j63 r3 = defpackage.j63.g     // Catch: java.lang.Throwable -> L27
            r0.b(r3)     // Catch: java.lang.Throwable -> L27
        Le9:
            bq r0 = r1.f     // Catch: java.lang.Throwable -> L27
            w18 r3 = r2.b()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "getPromoAction(...)"
            defpackage.z65.g(r3, r4)     // Catch: java.lang.Throwable -> L27
            r0.b(r3)     // Catch: java.lang.Throwable -> L27
            cs0 r0 = r1.a     // Catch: java.lang.Throwable -> L27
            r3 = r18
            r0.i(r2, r3)     // Catch: java.lang.Throwable -> L27
            goto L106
        Lff:
            org.slf4j.Logger r2 = r1.g
            java.lang.String r3 = "Failed to update basket\n"
            r2.error(r3, r0)
        L106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo5.a(com.dodopizza.persistence.entity.cart.StateEntity, boolean):void");
    }

    @Override // defpackage.ko5
    public void b() {
        this.b.clear();
    }

    @Override // defpackage.ko5
    public void c(StateEntity stateEntity, StateEntity stateEntity2) {
        DeliveryExperimentEntity deliveryExperimentEntity;
        boolean z;
        Long l;
        z65.h(stateEntity, "oldState");
        z65.h(stateEntity2, "newState");
        hn6 b = this.h.b(stateEntity2.getMinDeliveryPrice());
        hn6 b2 = this.h.b(stateEntity2.getMinDeliveryPriceCustomized());
        PersonalizationEntity personalization = stateEntity2.getPersonalization();
        k0<MapEntry> k0Var = null;
        if (personalization != null) {
            deliveryExperimentEntity = personalization.getDeliveryExperimentInfo();
        } else {
            deliveryExperimentEntity = null;
        }
        if (stateEntity2.getMinDeliveryPrice() == stateEntity.getMinDeliveryPrice() && stateEntity2.getMinDeliveryPriceCustomized() == stateEntity.getMinDeliveryPriceCustomized()) {
            z = false;
        } else {
            z = true;
        }
        cs0 cs0Var = this.a;
        PersonalizationEntity personalization2 = stateEntity2.getPersonalization();
        if (personalization2 != null) {
            l = Long.valueOf(personalization2.getExpiredTime());
        } else {
            l = null;
        }
        long longValue = ((Number) mh5.c(l, 0L)).longValue();
        if (deliveryExperimentEntity != null) {
            k0Var = deliveryExperimentEntity.getAdditionalData();
        }
        cs0Var.e(new qz2(b, b2, null, null, longValue, z, UpsellProductsEntityKt.realmListToMap(k0Var), 12, null));
    }
}
