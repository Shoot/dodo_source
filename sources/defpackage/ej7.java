package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderSummaryData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lej7;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "orderId", "Lqd;", "b", "Lqd;", "()Lqd;", "sender", c.a, "Z", "()Z", "isNewOrder", "<init>", "(Ljava/lang/String;Lqd;Z)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ej7  reason: default package */
/* loaded from: classes.dex */
public final class ej7 implements Serializable {
    private final String a;
    private final qd b;
    private final boolean c;

    public ej7(String str, qd qdVar, boolean z) {
        z65.h(str, "orderId");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = qdVar;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final qd b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej7)) {
            return false;
        }
        ej7 ej7Var = (ej7) obj;
        if (z65.c(this.a, ej7Var.a) && z65.c(this.b, ej7Var.b) && this.c == ej7Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
    }

    public String toString() {
        String str = this.a;
        qd qdVar = this.b;
        boolean z = this.c;
        return "OrderSummaryData(orderId=" + str + ", sender=" + qdVar + ", isNewOrder=" + z + ")";
    }

    public /* synthetic */ ej7(String str, qd qdVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qdVar, (i & 4) != 0 ? false : z);
    }
}
