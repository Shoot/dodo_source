package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: CustomerModule.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¨\u0006\u001d"}, d2 = {"Lg52;", "", "Lh8;", "addressFormatter", "Lly2;", "deliveryLocationFormatter", "Lpu2;", c.a, "Li8;", "addressFormatterFactory", "Ldt5;", "locality", "a", "Lhq3;", "featureService", "b", DateTokenConverter.CONVERTER_KEY, "Lf8c;", "workflowIdProvider", "Lava;", "stateProvider", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Ldua;", "stateAnalyzer", "Lz7b;", e.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: g52  reason: default package */
/* loaded from: classes3.dex */
public final class g52 {
    public static final g52 a = new g52();

    private g52() {
    }

    public final h8 a(i8 i8Var, dt5 dt5Var) {
        z65.h(i8Var, "addressFormatterFactory");
        z65.h(dt5Var, "locality");
        return i8Var.a(dt5Var.a());
    }

    public final i8 b(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new i8(hq3Var);
    }

    public final pu2 c(h8 h8Var, ly2 ly2Var) {
        z65.h(h8Var, "addressFormatter");
        z65.h(ly2Var, "deliveryLocationFormatter");
        return new qu2(h8Var, ly2Var);
    }

    public final ly2 d() {
        return new my2();
    }

    public final z7b e(hq3 hq3Var, f8c f8cVar, ava avaVar, WorkflowApi workflowApi, dua duaVar) {
        z65.h(hq3Var, "featureService");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(avaVar, "stateProvider");
        z65.h(workflowApi, "workflowApi");
        z65.h(duaVar, "stateAnalyzer");
        return new a8b(hq3Var, f8cVar, avaVar, workflowApi, duaVar);
    }
}
