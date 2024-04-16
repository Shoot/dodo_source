package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: HalvesAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lia7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lck1;", "Lck1;", "getSender", "()Lck1;", "sender", "b", "Z", "isHero", "()Z", "<init>", "(Lck1;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ia7  reason: default package */
/* loaded from: classes2.dex */
public final class ia7 implements dc {
    private final ck1 a;
    private final boolean b;

    public ia7(ck1 ck1Var, boolean z) {
        z65.h(ck1Var, "sender");
        this.a = ck1Var;
        this.b = z;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(vc.i(bc.e(bc.e(new bc("halves_open_product_card"), Action.NAME_ATTRIBUTE, "Half & half pizza", false, 4, null), "is_hero", Boolean.valueOf(this.b), false, 4, null), kl8.b), this.a).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia7)) {
            return false;
        }
        ia7 ia7Var = (ia7) obj;
        if (this.a == ia7Var.a && this.b == ia7Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        ck1 ck1Var = this.a;
        boolean z = this.b;
        return "OpenHalfProductCard(sender=" + ck1Var + ", isHero=" + z + ")";
    }
}
