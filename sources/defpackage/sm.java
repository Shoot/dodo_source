package defpackage;

import defpackage.qm;
import defpackage.xm;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: App2AppFeatureStateResolverImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lsm;", "Lrm;", "Lbq3;", "featureCode", "Lqm;", "b", "Lxm;", "app2AppPaymentWays", "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: sm  reason: default package */
/* loaded from: classes3.dex */
public final class sm implements rm {
    private final hq3 a;

    public sm(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    private final qm b(bq3 bq3Var) {
        if (this.a.a(bq3Var)) {
            return qm.b.a;
        }
        return qm.a.a;
    }

    @Override // defpackage.rm
    public qm a(xm xmVar) {
        z65.h(xmVar, "app2AppPaymentWays");
        if (z65.c(xmVar, xm.a.a)) {
            return b(bq3.m5);
        }
        if (z65.c(xmVar, xm.b.a)) {
            return b(bq3.n5);
        }
        throw new NoWhenBranchMatchedException();
    }
}
