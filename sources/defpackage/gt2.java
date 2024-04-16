package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.checkout.deferredtime.DeferredTimePresenter;
/* compiled from: DeferredTimeModule.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J4\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007JL\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010\"\u001a\u00020\u001cH\u0007¨\u0006%"}, d2 = {"Lgt2;", "", "", "isCarryout", "Lava;", "stateProvider", "Ldt2;", "deferredTimeInteractor", "Lf63;", "router", "Lgc;", "analytics", "Lru/dodopizza/app/presentation/checkout/deferredtime/DeferredTimePresenter;", DateTokenConverter.CONVERTER_KEY, "Lnt2;", "deferredTimeService", "Lvs2;", "deferredTimeFormatter", "Lpt2;", "deferredTimeState", "", "expectedMinutesToReceiveForASAP", "Lhq3;", "featureService", "Lx51;", "checkoutService", "Lf8c;", "workflowIdProvider", "Lps2;", "deferredIntervalsVOConverter", c.a, "Ljgb;", "timeFormatter", "b", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gt2  reason: default package */
/* loaded from: classes3.dex */
public final class gt2 {
    public static final gt2 a = new gt2();

    private gt2() {
    }

    public final ps2 a() {
        return new ps2();
    }

    public final vs2 b(jgb jgbVar, hq3 hq3Var) {
        z65.h(jgbVar, "timeFormatter");
        z65.h(hq3Var, "featureService");
        if (hq3Var.a(bq3.f)) {
            return new xs2(jgbVar);
        }
        return new ws2(jgbVar);
    }

    public final dt2 c(nt2 nt2Var, vs2 vs2Var, pt2 pt2Var, int i, hq3 hq3Var, x51 x51Var, f8c f8cVar, ps2 ps2Var) {
        z65.h(nt2Var, "deferredTimeService");
        z65.h(vs2Var, "deferredTimeFormatter");
        z65.h(pt2Var, "deferredTimeState");
        z65.h(hq3Var, "featureService");
        z65.h(x51Var, "checkoutService");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(ps2Var, "deferredIntervalsVOConverter");
        return new et2(nt2Var, vs2Var, pt2Var, i, hq3Var, x51Var, f8cVar, ps2Var, null, 256, null);
    }

    public final DeferredTimePresenter d(boolean z, ava avaVar, dt2 dt2Var, f63 f63Var, gc gcVar) {
        z65.h(avaVar, "stateProvider");
        z65.h(dt2Var, "deferredTimeInteractor");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        return new DeferredTimePresenter(z, avaVar, dt2Var, f63Var, gcVar);
    }
}
