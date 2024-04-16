package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderItemCustomization.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Ldg7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "getParentUUId", "parentUUId", "Lhn6;", c.a, "Lhn6;", "getPrice", "()Lhn6;", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dg7  reason: default package */
/* loaded from: classes4.dex */
public final class dg7 {
    private final String a;
    private final String b;
    private final hn6 c;

    public dg7(String str, String str2, hn6 hn6Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "parentUUId");
        z65.h(hn6Var, "price");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg7)) {
            return false;
        }
        dg7 dg7Var = (dg7) obj;
        if (z65.c(this.a, dg7Var.a) && z65.c(this.b, dg7Var.b) && z65.c(this.c, dg7Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        return "OrderItemTopping(name=" + str + ", parentUUId=" + str2 + ", price=" + hn6Var + ")";
    }
}
