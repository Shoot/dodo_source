package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ControllingAnalytics.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkv1;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "orderId", "Lmi7;", "b", "Lmi7;", "getOrderState", "()Lmi7;", "orderState", "Lqd;", c.a, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Lmi7;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kv1  reason: default package */
/* loaded from: classes4.dex */
public final class kv1 implements dc {
    private final String a;
    private final mi7 b;
    private final qd c;

    public kv1(String str, mi7 mi7Var, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = mi7Var;
        this.c = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(vc.r(vc.t(new bc("mystery_shopper_survey_is_shown"), this.a), "order_status", this.b), this.c).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        if (z65.c(this.a, kv1Var.a) && this.b == kv1Var.b && z65.c(this.c, kv1Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        mi7 mi7Var = this.b;
        if (mi7Var == null) {
            hashCode = 0;
        } else {
            hashCode = mi7Var.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        mi7 mi7Var = this.b;
        qd qdVar = this.c;
        return "MysteryShopperSurveyIsShown(orderId=" + str + ", orderState=" + mi7Var + ", sender=" + qdVar + ")";
    }
}
