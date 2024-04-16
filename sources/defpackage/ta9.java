package defpackage;

import kotlin.Metadata;
/* compiled from: ReferralProgramAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lta9;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "getSender", "()Lqd;", "sender", "b", "Ljava/lang/String;", "getApplyingType", "()Ljava/lang/String;", "applyingType", "<init>", "(Lqd;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ta9  reason: default package */
/* loaded from: classes4.dex */
public final class ta9 implements dc {
    private final qd a;
    private final String b;

    public ta9(qd qdVar, String str) {
        z65.h(qdVar, "sender");
        z65.h(str, "applyingType");
        this.a = qdVar;
        this.b = str;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(new bc("apply_referral_code"), "applying_type", this.b, false, 4, null), this.a).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta9)) {
            return false;
        }
        ta9 ta9Var = (ta9) obj;
        if (z65.c(this.a, ta9Var.a) && z65.c(this.b, ta9Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        qd qdVar = this.a;
        String str = this.b;
        return "ApplyReferralCodeEvent(sender=" + qdVar + ", applyingType=" + str + ")";
    }
}
