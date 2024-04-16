package defpackage;

import com.dodopizza.order.feature.upsell.presentation.UpsalePresenter;
import kotlin.Metadata;
/* compiled from: UpsaleModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u0013"}, d2 = {"Lwsb;", "", "Lrsb;", "upsaleInteractor", "Lhq3;", "featureService", "Lgc;", "analytics", "Lk63;", "domainEvents", "Lcom/dodopizza/order/feature/upsell/presentation/UpsalePresenter;", "a", "Ltsb;", "upsaleItemsService", "Lktb;", "upsaleStateService", "b", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wsb  reason: default package */
/* loaded from: classes2.dex */
public final class wsb {
    public static final wsb a = new wsb();

    private wsb() {
    }

    public final UpsalePresenter a(rsb rsbVar, hq3 hq3Var, gc gcVar, k63 k63Var) {
        z65.h(rsbVar, "upsaleInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        z65.h(k63Var, "domainEvents");
        return new UpsalePresenter(rsbVar, hq3Var, gcVar, k63Var, null, 16, null);
    }

    public final rsb b(tsb tsbVar, ktb ktbVar, gc gcVar) {
        z65.h(tsbVar, "upsaleItemsService");
        z65.h(ktbVar, "upsaleStateService");
        z65.h(gcVar, "analytics");
        return new ssb(tsbVar, ktbVar, gcVar);
    }
}
