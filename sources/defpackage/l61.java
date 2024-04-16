package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: CheckoutStateModule.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J@\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007JP\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0007J \u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0007J(\u0010)\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010(\u001a\u00020'H\u0007J\u0010\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0007J\b\u0010-\u001a\u00020\nH\u0007J0\u00106\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0007¨\u00069"}, d2 = {"Ll61;", "", "Lc61;", "checkoutStateEditService", "Lt61;", "checkoutStateProvider", "Lad;", "analyticsHelper", "Lqi8;", "preferredOrderLocationService", "Lh61;", "checkoutStateLogic", "Li00;", "authorizeState", "Lhq3;", "featureService", "Lv61;", e.a, "Lx51;", "checkoutService", "Lf8c;", "workflowIdProvider", "Lt52;", "customerService", "Lli7;", "orderService", "Lew7;", "paymentService", "Ldh4;", "googlePaymentService", "Lq51;", "b", "Lt41;", "checkoutDetailsService", "Le61;", "checkoutStateFactory", c.a, "Lpv0;", "changeWorkflowResultHandler", "Lava;", "stateProvider", "g", "Lf61;", "factory", "f", DateTokenConverter.CONVERTER_KEY, "La98;", "pizzeriasRepository", "Lgc;", "analytics", "Ljgb;", "timeFormatter", "Lj2c;", "vpnChecker", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: l61  reason: default package */
/* loaded from: classes3.dex */
public final class l61 {
    public final ad a(ava avaVar, a98 a98Var, gc gcVar, jgb jgbVar, j2c j2cVar) {
        z65.h(avaVar, "stateProvider");
        z65.h(a98Var, "pizzeriasRepository");
        z65.h(gcVar, "analytics");
        z65.h(jgbVar, "timeFormatter");
        z65.h(j2cVar, "vpnChecker");
        return new ad(avaVar, a98Var, gcVar, jgbVar, j2cVar);
    }

    public final q51 b(x51 x51Var, t61 t61Var, f8c f8cVar, t52 t52Var, ad adVar, li7 li7Var, ew7 ew7Var, dh4 dh4Var, h61 h61Var) {
        z65.h(x51Var, "checkoutService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(t52Var, "customerService");
        z65.h(adVar, "analyticsHelper");
        z65.h(li7Var, "orderService");
        z65.h(ew7Var, "paymentService");
        z65.h(dh4Var, "googlePaymentService");
        z65.h(h61Var, "checkoutStateLogic");
        return new r51(x51Var, t61Var, f8cVar, t52Var, adVar, li7Var, ew7Var, dh4Var, h61Var);
    }

    public final c61 c(t41 t41Var, e61 e61Var, h61 h61Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(e61Var, "checkoutStateFactory");
        z65.h(h61Var, "checkoutStateLogic");
        return new d61(t41Var, e61Var, h61Var);
    }

    public final h61 d() {
        return new i61();
    }

    public final v61 e(c61 c61Var, t61 t61Var, ad adVar, qi8 qi8Var, h61 h61Var, i00 i00Var, hq3 hq3Var) {
        z65.h(c61Var, "checkoutStateEditService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(adVar, "analyticsHelper");
        z65.h(qi8Var, "preferredOrderLocationService");
        z65.h(h61Var, "checkoutStateLogic");
        z65.h(i00Var, "authorizeState");
        z65.h(hq3Var, "featureService");
        return new w61(c61Var, t61Var, adVar, qi8Var, h61Var, i00Var, hq3Var);
    }

    public final e61 f(f61 f61Var) {
        z65.h(f61Var, "factory");
        return f61Var;
    }

    public final t61 g(pv0 pv0Var, e61 e61Var, t41 t41Var, ava avaVar) {
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(e61Var, "checkoutStateFactory");
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(avaVar, "stateProvider");
        return new u61(pv0Var, e61Var, t41Var, avaVar);
    }
}
