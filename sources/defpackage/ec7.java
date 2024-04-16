package defpackage;

import com.dodopizza.persistence.entity.BonusActionEntity;
import kotlin.Metadata;
/* compiled from: OrderAnalytics.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lec7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lbc7;", "Lbc7;", BonusActionEntity.ORDER, "Lqd;", "b", "Lqd;", "sender", "<init>", "(Lbc7;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ec7  reason: default package */
/* loaded from: classes4.dex */
public final class ec7 implements dc {
    private final bc7 a;
    private final qd b;

    public ec7(bc7 bc7Var, qd qdVar) {
        z65.h(bc7Var, BonusActionEntity.ORDER);
        z65.h(qdVar, "sender");
        this.a = bc7Var;
        this.b = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(vc.q(bc.e(vc.l(vc.t(new bc("screen_order_tracking"), this.a.t()), this.a.E()), "preorder", Boolean.valueOf(this.a.J()), false, 4, null), this.a.A().b()), this.b).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec7)) {
            return false;
        }
        ec7 ec7Var = (ec7) obj;
        if (z65.c(this.a, ec7Var.a) && z65.c(this.b, ec7Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        bc7 bc7Var = this.a;
        qd qdVar = this.b;
        return "OrderScreen(order=" + bc7Var + ", sender=" + qdVar + ")";
    }
}
