package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderAnalytics.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Ldc7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "orderId", "Ljk7;", "b", "Ljk7;", "getOrderType", "()Ljk7;", "orderType", c.a, "Z", "isDeferredOrder", "()Z", "Lmi7;", DateTokenConverter.CONVERTER_KEY, "Lmi7;", "getState", "()Lmi7;", "state", "<init>", "(Ljava/lang/String;Ljk7;ZLmi7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dc7  reason: default package */
/* loaded from: classes4.dex */
public final class dc7 implements dc {
    private final String a;
    private final jk7 b;
    private final boolean c;
    private final mi7 d;

    public dc7(String str, jk7 jk7Var, boolean z, mi7 mi7Var) {
        z65.h(str, "orderId");
        z65.h(jk7Var, "orderType");
        z65.h(mi7Var, "state");
        this.a = str;
        this.b = jk7Var;
        this.c = z;
        this.d = mi7Var;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.q(bc.e(vc.m(vc.t(new bc("order_tracking_status_changed"), this.a), this.b), "preorder", Boolean.valueOf(this.c), false, 4, null), this.d).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc7)) {
            return false;
        }
        dc7 dc7Var = (dc7) obj;
        if (z65.c(this.a, dc7Var.a) && this.b == dc7Var.b && this.c == dc7Var.c && this.d == dc7Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        jk7 jk7Var = this.b;
        boolean z = this.c;
        mi7 mi7Var = this.d;
        return "OrderChangeStatus(orderId=" + str + ", orderType=" + jk7Var + ", isDeferredOrder=" + z + ", state=" + mi7Var + ")";
    }
}
