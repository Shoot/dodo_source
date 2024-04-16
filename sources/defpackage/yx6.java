package defpackage;

import kotlin.Metadata;
/* compiled from: NewsAnalytics.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lyx6;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lxx6;", "Lxx6;", "status", "Lzx6;", "b", "Lzx6;", "sender", "<init>", "(Lxx6;Lzx6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yx6  reason: default package */
/* loaded from: classes4.dex */
public final class yx6 implements dc {
    private final xx6 a;
    private final zx6 b;

    public yx6(xx6 xx6Var, zx6 zx6Var) {
        z65.h(xx6Var, "status");
        z65.h(zx6Var, "sender");
        this.a = xx6Var;
        this.b = zx6Var;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(new bc("subscription"), "status", this.a.getValue(), false, 4, null), this.b).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx6)) {
            return false;
        }
        yx6 yx6Var = (yx6) obj;
        if (this.a == yx6Var.a && this.b == yx6Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        xx6 xx6Var = this.a;
        zx6 zx6Var = this.b;
        return "NewsSubscription(status=" + xx6Var + ", sender=" + zx6Var + ")";
    }
}
