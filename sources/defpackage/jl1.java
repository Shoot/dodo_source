package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: CompletedOrderInfo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Ljl1;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "itemTitles", "Lhn6;", "b", "Lhn6;", "()Lhn6;", "totalCost", "<init>", "(Ljava/util/List;Lhn6;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jl1  reason: default package */
/* loaded from: classes.dex */
public final class jl1 {
    private final List<String> a;
    private final hn6 b;

    public jl1(List<String> list, hn6 hn6Var) {
        z65.h(list, "itemTitles");
        z65.h(hn6Var, "totalCost");
        this.a = list;
        this.b = hn6Var;
    }

    public final List<String> a() {
        return this.a;
    }

    public final hn6 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl1)) {
            return false;
        }
        jl1 jl1Var = (jl1) obj;
        if (z65.c(this.a, jl1Var.a) && z65.c(this.b, jl1Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        List<String> list = this.a;
        hn6 hn6Var = this.b;
        return "CompletedOrderInfo(itemTitles=" + list + ", totalCost=" + hn6Var + ")";
    }
}
