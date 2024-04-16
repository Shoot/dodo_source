package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LoyaltyProgramAnalytics.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lt26;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lu26;", "Lu26;", "getSender", "()Lu26;", "sender", "", "b", "D", "getCoinBalance", "()D", "coinBalance", c.a, "Z", "getHasGift", "()Z", "hasGift", "<init>", "(Lu26;DZ)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t26  reason: default package */
/* loaded from: classes4.dex */
public final class t26 implements dc {
    private final u26 a;
    private final double b;
    private final boolean c;

    public t26(u26 u26Var, double d, boolean z) {
        this.a = u26Var;
        this.b = d;
        this.c = z;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(bc.e(new bc("screen_loyalty"), "coinBalance", Double.valueOf(this.b), false, 4, null), "hasGift", Boolean.valueOf(this.c), false, 4, null), this.a).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t26)) {
            return false;
        }
        t26 t26Var = (t26) obj;
        if (this.a == t26Var.a && Double.compare(this.b, t26Var.b) == 0 && this.c == t26Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        u26 u26Var = this.a;
        if (u26Var == null) {
            hashCode = 0;
        } else {
            hashCode = u26Var.hashCode();
        }
        return (((hashCode * 31) + nkb.a(this.b)) * 31) + a91.a(this.c);
    }

    public String toString() {
        u26 u26Var = this.a;
        double d = this.b;
        boolean z = this.c;
        return "OpenLoyaltyProgramScreenEvent(sender=" + u26Var + ", coinBalance=" + d + ", hasGift=" + z + ")";
    }
}
