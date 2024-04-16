package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.shoppingcart.presentation.b;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ShoppingCartModule.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>JP\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0090\u0001\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u00102\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0007J(\u00107\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010:\u001a\u0002032\u0006\u00109\u001a\u000208H\u0007J\b\u0010<\u001a\u00020;H\u0007¨\u0006?"}, d2 = {"Lyia;", "", "Lfq0;", "cartContentService", "Lg78;", "pizzaDoughNameFormatter", "Luja;", "shoppingItemRepository", "Le78;", "pizzaConceptService", "Lhq3;", "featureService", "Lava;", "stateProvider", "Lej6;", "minDeliveryPriceInfoProvider", "Lah6;", "menuService", "Ljn6;", "moneyFactory", "Lmja;", DateTokenConverter.CONVERTER_KEY, "Lds0;", "cartService", "Lsq0;", "cartItemDataFactory", "Lc62;", "customizationService", "Lt52;", "customerService", "Lgc;", "analytics", "Ldua;", "stateAnalyzer", "Lpv0;", "changeWorkflowResultHandler", "Lvg7;", "orderPizzeriaStateService", "Lt61;", "checkoutStateProvider", "shoppingCartVOBuilder", "Ldt5;", "locality", "Ljv5;", "localityService", "Lwia;", c.a, "Lgy3;", "firebaseToggleService", "Lcq0;", "a", "Le61;", "checkoutStateFactory", "Lt41;", "checkoutDetailsService", "f", "Lf61;", "factory", e.a, "Lh61;", "b", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yia  reason: default package */
/* loaded from: classes2.dex */
public final class yia {
    public static final yia a = new yia();

    private yia() {
    }

    public final cq0 a(hq3 hq3Var, gy3 gy3Var) {
        z65.h(hq3Var, "featureService");
        z65.h(gy3Var, "firebaseToggleService");
        if (hq3Var.a(bq3.w5) && gy3Var.a(bq3.S6)) {
            return cq0.b;
        }
        return cq0.a;
    }

    public final h61 b() {
        return new i61();
    }

    public final wia c(ds0 ds0Var, ah6 ah6Var, sq0 sq0Var, c62 c62Var, ava avaVar, t52 t52Var, gc gcVar, dua duaVar, pv0 pv0Var, vg7 vg7Var, t61 t61Var, mja mjaVar, fq0 fq0Var, dt5 dt5Var, jv5 jv5Var, ej6 ej6Var, hq3 hq3Var) {
        z65.h(ds0Var, "cartService");
        z65.h(ah6Var, "menuService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(c62Var, "customizationService");
        z65.h(avaVar, "stateProvider");
        z65.h(t52Var, "customerService");
        z65.h(gcVar, "analytics");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(mjaVar, "shoppingCartVOBuilder");
        z65.h(fq0Var, "cartContentService");
        z65.h(dt5Var, "locality");
        z65.h(jv5Var, "localityService");
        z65.h(ej6Var, "minDeliveryPriceInfoProvider");
        z65.h(hq3Var, "featureService");
        return new b(ds0Var, ah6Var, c62Var, sq0Var, avaVar, t52Var, gcVar, duaVar, pv0Var, vg7Var, t61Var, mjaVar, fq0Var, dt5Var, jv5Var, ej6Var, hq3Var);
    }

    public final mja d(fq0 fq0Var, g78 g78Var, uja ujaVar, e78 e78Var, hq3 hq3Var, ava avaVar, ej6 ej6Var, ah6 ah6Var, jn6 jn6Var) {
        z65.h(fq0Var, "cartContentService");
        z65.h(g78Var, "pizzaDoughNameFormatter");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(hq3Var, "featureService");
        z65.h(avaVar, "stateProvider");
        z65.h(ej6Var, "minDeliveryPriceInfoProvider");
        z65.h(ah6Var, "menuService");
        z65.h(jn6Var, "moneyFactory");
        return new mja(fq0Var, g78Var, ujaVar, e78Var, hq3Var, avaVar, ej6Var, ah6Var, jn6Var);
    }

    public final e61 e(f61 f61Var) {
        z65.h(f61Var, "factory");
        return f61Var;
    }

    public final t61 f(pv0 pv0Var, e61 e61Var, t41 t41Var, ava avaVar) {
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(e61Var, "checkoutStateFactory");
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(avaVar, "stateProvider");
        return new u61(pv0Var, e61Var, t41Var, avaVar);
    }
}
