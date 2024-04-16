package defpackage;

import kotlin.Metadata;
/* compiled from: ReferralProgramAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lgb9;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "getSender", "()Lqd;", "sender", "b", "Z", "isEnterRefCodeAvailable", "()Z", "<init>", "(Lqd;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gb9  reason: default package */
/* loaded from: classes4.dex */
public final class gb9 implements dc {
    private final qd a;
    private final boolean b;

    public gb9(qd qdVar, boolean z) {
        z65.h(qdVar, "sender");
        this.a = qdVar;
        this.b = z;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(vc.z(new bc("screen_referral"), this.a), "enter_referral_code_shown", Boolean.valueOf(this.b), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb9)) {
            return false;
        }
        gb9 gb9Var = (gb9) obj;
        if (z65.c(this.a, gb9Var.a) && this.b == gb9Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        qd qdVar = this.a;
        boolean z = this.b;
        return "ReferralSystemScreenEvent(sender=" + qdVar + ", isEnterRefCodeAvailable=" + z + ")";
    }
}
