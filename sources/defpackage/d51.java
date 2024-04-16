package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.checkout.CheckoutAPI;
import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: CheckoutModule.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EJX\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J`\u0010+\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020,H\u0007J\b\u0010/\u001a\u00020\nH\u0007J8\u00107\u001a\u0002062\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u00108\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0007J \u0010@\u001a\u00020?2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0007J\b\u0010A\u001a\u000209H\u0007J\u0010\u0010C\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$H\u0007¨\u0006F"}, d2 = {"Ld51;", "", "Lli7;", "orderService", "Lvi7;", "orderStepFactory", "Lew7;", "paymentService", "Ldua;", "stateAnalyzer", "Lpv0;", "changeWorkflowResultHandler", "Lfq0;", "cartContentService", "Lt52;", "customerService", "Lru/dodopizza/backend/domain/checkout/CheckoutAPI;", "checkoutAPI", "Lb51;", "checkoutInfoConverter", "Lml0;", "cacheInspector", "Lx51;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Lf8c;", "workflowIdProvider", "Lava;", "stateProvider", "Lv53;", "dodoDomainState", "Ltw7;", "paymentWayService", "Ljgb;", "timeFormatter", "Lpgb;", "timeParser", "Lmk7;", "orderTypeConverter", "Lgy2;", "deliveryLocationDtoConverter", "Lt41;", "b", "Lx42;", "customerAddressService", "g", "a", "Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;", "pizzeriaAPI", "Lf5b;", "systemTimeProvider", "Lhq3;", "featureService", "Lnt2;", e.a, "f", "Loi8;", "preferredOrderLocationRepository", "Le98;", "pizzeriaService", "Ldt5;", "locality", "Lqi8;", "i", Image.TYPE_HIGH, "dateTimeParser", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d51  reason: default package */
/* loaded from: classes3.dex */
public final class d51 {
    public static final d51 a = new d51();

    private d51() {
    }

    public final pv0 a() {
        return new qv0();
    }

    public final t41 b(WorkflowApi workflowApi, f8c f8cVar, ava avaVar, dua duaVar, v53 v53Var, pv0 pv0Var, tw7 tw7Var, jgb jgbVar, pgb pgbVar, mk7 mk7Var, gy2 gy2Var) {
        z65.h(workflowApi, "workflowApi");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(avaVar, "stateProvider");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(v53Var, "dodoDomainState");
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(tw7Var, "paymentWayService");
        z65.h(jgbVar, "timeFormatter");
        z65.h(pgbVar, "timeParser");
        z65.h(mk7Var, "orderTypeConverter");
        z65.h(gy2Var, "deliveryLocationDtoConverter");
        return new u41(workflowApi, f8cVar, avaVar, duaVar, v53Var, tw7Var, nw7.a, pv0Var, jgbVar, pgbVar, mk7Var, gy2Var);
    }

    public final b51 c(pgb pgbVar) {
        z65.h(pgbVar, "dateTimeParser");
        return new b51(pgbVar);
    }

    public final x51 d(li7 li7Var, vi7 vi7Var, ew7 ew7Var, dua duaVar, pv0 pv0Var, fq0 fq0Var, t52 t52Var, CheckoutAPI checkoutAPI, b51 b51Var, ml0 ml0Var) {
        z65.h(li7Var, "orderService");
        z65.h(vi7Var, "orderStepFactory");
        z65.h(ew7Var, "paymentService");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(fq0Var, "cartContentService");
        z65.h(t52Var, "customerService");
        z65.h(checkoutAPI, "checkoutAPI");
        z65.h(b51Var, "checkoutInfoConverter");
        z65.h(ml0Var, "cacheInspector");
        return new y51(li7Var, vi7Var, ew7Var, duaVar, pv0Var, fq0Var, t52Var, checkoutAPI, b51Var, ml0Var);
    }

    public final nt2 e(pgb pgbVar, ava avaVar, PizzeriaAPI pizzeriaAPI, f5b f5bVar, hq3 hq3Var, ml0 ml0Var) {
        z65.h(pgbVar, "timeParser");
        z65.h(avaVar, "stateProvider");
        z65.h(pizzeriaAPI, "pizzeriaAPI");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(hq3Var, "featureService");
        z65.h(ml0Var, "cacheInspector");
        return new ot2(avaVar, pgbVar, pizzeriaAPI, f5bVar, hq3Var, ml0Var);
    }

    public final vi7 f(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new wi7(hq3Var);
    }

    public final mk7 g(x42 x42Var) {
        z65.h(x42Var, "customerAddressService");
        return new mk7(x42Var);
    }

    public final oi8 h() {
        return new pi8();
    }

    public final qi8 i(oi8 oi8Var, e98 e98Var, dt5 dt5Var) {
        z65.h(oi8Var, "preferredOrderLocationRepository");
        z65.h(e98Var, "pizzeriaService");
        z65.h(dt5Var, "locality");
        return new ri8(oi8Var, e98Var, dt5Var);
    }
}
