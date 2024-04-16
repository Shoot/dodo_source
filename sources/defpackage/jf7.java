package defpackage;

import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.OrderHistoryPresenter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderHistoryModule.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J8\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u001b"}, d2 = {"Ljf7;", "", "Lze7;", "externalRouter", "Lf63;", "router", "Lpf7;", c.a, "Lff7;", "interactor", "Lgc;", "analytics", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/OrderHistoryPresenter;", "b", "Lsf7;", "orderHistoryService", "Lli7;", "orderService", "Lf8c;", "workflowIdProvider", "Lt52;", "customerService", "Ldt5;", "currentLocality", "a", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jf7  reason: default package */
/* loaded from: classes2.dex */
public final class jf7 {
    public static final jf7 a = new jf7();

    private jf7() {
    }

    public final ff7 a(sf7 sf7Var, li7 li7Var, f8c f8cVar, t52 t52Var, dt5 dt5Var, gc gcVar) {
        z65.h(sf7Var, "orderHistoryService");
        z65.h(li7Var, "orderService");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(t52Var, "customerService");
        z65.h(dt5Var, "currentLocality");
        z65.h(gcVar, "analytics");
        return new gf7(sf7Var, li7Var, f8cVar, t52Var, dt5Var, gcVar);
    }

    public final OrderHistoryPresenter b(pf7 pf7Var, ff7 ff7Var, gc gcVar) {
        z65.h(pf7Var, "router");
        z65.h(ff7Var, "interactor");
        z65.h(gcVar, "analytics");
        return new OrderHistoryPresenter(pf7Var, ff7Var, gcVar, new l6(null, 1, null));
    }

    public final pf7 c(ze7 ze7Var, f63 f63Var) {
        z65.h(ze7Var, "externalRouter");
        z65.h(f63Var, "router");
        return new pf7(ze7Var, f63Var);
    }
}
