package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryFee.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u001b"}, d2 = {"Ldx2;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lhn6;", "a", "Lhn6;", "()Lhn6;", "deliveryFeeCost", "", "Llq3;", "b", "Ljava/util/List;", c.a, "()Ljava/util/List;", "levels", "", "Ljava/util/Map;", "()Ljava/util/Map;", "experimentDataInfo", "<init>", "(Lhn6;Ljava/util/List;Ljava/util/Map;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: dx2  reason: default package */
/* loaded from: classes.dex */
public final class dx2 {
    private final hn6 a;
    private final List<lq3> b;
    private final Map<String, String> c;

    public dx2(hn6 hn6Var, List<lq3> list, Map<String, String> map) {
        z65.h(hn6Var, "deliveryFeeCost");
        z65.h(list, "levels");
        z65.h(map, "experimentDataInfo");
        this.a = hn6Var;
        this.b = list;
        this.c = map;
    }

    public final hn6 a() {
        return this.a;
    }

    public final Map<String, String> b() {
        return this.c;
    }

    public final List<lq3> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx2)) {
            return false;
        }
        dx2 dx2Var = (dx2) obj;
        if (z65.c(this.a, dx2Var.a) && z65.c(this.b, dx2Var.b) && z65.c(this.c, dx2Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        hn6 hn6Var = this.a;
        List<lq3> list = this.b;
        Map<String, String> map = this.c;
        return "DeliveryFee(deliveryFeeCost=" + hn6Var + ", levels=" + list + ", experimentDataInfo=" + map + ")";
    }

    public /* synthetic */ dx2(hn6 hn6Var, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hn6Var, (i & 2) != 0 ? kc1.l() : list, (i & 4) != 0 ? g86.h() : map);
    }
}
