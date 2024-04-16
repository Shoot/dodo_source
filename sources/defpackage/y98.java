package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PizzeriaSuggestionsVO.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0018"}, d2 = {"Ly98;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lb68;", "a", "Ljava/util/List;", c.a, "()Ljava/util/List;", "pizzerias", "Ls88;", "b", "filters", "Ljava/lang/String;", "()Ljava/lang/String;", "lookingAddress", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y98  reason: default package */
/* loaded from: classes2.dex */
public final class y98 {
    private final List<b68> a;
    private final List<s88> b;
    private final String c;

    public y98(List<b68> list, List<s88> list2, String str) {
        z65.h(list, "pizzerias");
        z65.h(list2, "filters");
        z65.h(str, "lookingAddress");
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public final List<s88> a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final List<b68> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y98)) {
            return false;
        }
        y98 y98Var = (y98) obj;
        if (z65.c(this.a, y98Var.a) && z65.c(this.b, y98Var.b) && z65.c(this.c, y98Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        List<b68> list = this.a;
        List<s88> list2 = this.b;
        String str = this.c;
        return "PizzeriaSuggestionsVO(pizzerias=" + list + ", filters=" + list2 + ", lookingAddress=" + str + ")";
    }
}
