package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyMenu.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lt06;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lhn6;", "a", "Lhn6;", c.a, "()Lhn6;", "minLegalPrice", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "loyaltyGuideLink", "", "La26;", "Ljava/util/List;", "()Ljava/util/List;", "categories", "<init>", "(Lhn6;Ljava/lang/String;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t06  reason: default package */
/* loaded from: classes4.dex */
public final class t06 {
    private final hn6 a;
    private final String b;
    private final List<a26> c;

    public t06(hn6 hn6Var, String str, List<a26> list) {
        z65.h(hn6Var, "minLegalPrice");
        z65.h(str, "loyaltyGuideLink");
        z65.h(list, "categories");
        this.a = hn6Var;
        this.b = str;
        this.c = list;
    }

    public final List<a26> a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final hn6 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t06)) {
            return false;
        }
        t06 t06Var = (t06) obj;
        if (z65.c(this.a, t06Var.a) && z65.c(this.b, t06Var.b) && z65.c(this.c, t06Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        hn6 hn6Var = this.a;
        String str = this.b;
        List<a26> list = this.c;
        return "LoyaltyMenu(minLegalPrice=" + hn6Var + ", loyaltyGuideLink=" + str + ", categories=" + list + ")";
    }
}
