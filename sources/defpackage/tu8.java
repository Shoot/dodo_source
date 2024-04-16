package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: QuantityVariationV5.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Ltu8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "I", "getQuantity", "()I", "quantity", "Lhn6;", c.a, "Lhn6;", "getPrice", "()Lhn6;", "price", "<init>", "(Ljava/lang/String;ILhn6;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: tu8  reason: default package */
/* loaded from: classes.dex */
public final class tu8 {
    private final String a;
    private final int b;
    private final hn6 c;

    public tu8(String str, int i, hn6 hn6Var) {
        z65.h(hn6Var, "price");
        this.a = str;
        this.b = i;
        this.c = hn6Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu8)) {
            return false;
        }
        tu8 tu8Var = (tu8) obj;
        if (z65.c(this.a, tu8Var.a) && this.b == tu8Var.b && z65.c(this.c, tu8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        hn6 hn6Var = this.c;
        return "QuantityVariationV5(name=" + str + ", quantity=" + i + ", price=" + hn6Var + ")";
    }
}
