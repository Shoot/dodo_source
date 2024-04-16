package defpackage;

import kotlin.Metadata;
/* compiled from: BuyMoreAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lei0;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ltja;", "Ltja;", "shoppingItem", "<init>", "(Ltja;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ei0  reason: default package */
/* loaded from: classes4.dex */
public final class ei0 implements dc {
    private final tja a;

    public ei0(tja tjaVar) {
        z65.h(tjaVar, "shoppingItem");
        this.a = tjaVar;
    }

    @Override // defpackage.dc
    public qc a() {
        od odVar = new od(this.a.Y().getName(), this.a.Y().getId(), Double.valueOf(this.a.h().a()), this.a.h().c(), vc.f(this.a.Y().e()), null, 1, 32, null);
        return nv3.c(vc.z(pd.a(new bc("add_to_cart"), odVar), hi0.b), odVar).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ei0) && z65.c(this.a, ((ei0) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        tja tjaVar = this.a;
        return "AddToCartFromUpsellEvent(shoppingItem=" + tjaVar + ")";
    }
}
