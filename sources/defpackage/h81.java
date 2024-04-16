package defpackage;

import kotlin.Metadata;
/* compiled from: OrderGameParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Lh81;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getClaimedRewardOrderId", "()Ljava/lang/String;", "claimedRewardOrderId", "", "b", "D", "()D", "claimedRewardAmount", "<init>", "(Ljava/lang/String;D)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h81  reason: default package */
/* loaded from: classes4.dex */
public final class h81 {
    private final String a;
    private final double b;

    public h81(String str, double d) {
        z65.h(str, "claimedRewardOrderId");
        this.a = str;
        this.b = d;
    }

    public final double a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h81)) {
            return false;
        }
        h81 h81Var = (h81) obj;
        if (z65.c(this.a, h81Var.a) && Double.compare(this.b, h81Var.b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + nkb.a(this.b);
    }

    public String toString() {
        String str = this.a;
        double d = this.b;
        return "ClaimedReward(claimedRewardOrderId=" + str + ", claimedRewardAmount=" + d + ")";
    }
}
