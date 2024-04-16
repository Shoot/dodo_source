package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuVO.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"Lnh6;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ll6;", "Lye6;", "a", "Ll6;", DateTokenConverter.CONVERTER_KEY, "()Ll6;", "menuItemVOs", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "headersItemsIndices", c.a, "itemsHeadersIndices", "Ldd6;", "menuCategories", "Lb78;", e.a, "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ll6;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lb78;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nh6  reason: default package */
/* loaded from: classes2.dex */
public final class nh6 {
    private final l6<ye6> a;
    private final List<Integer> b;
    private final List<Integer> c;
    private final List<dd6> d;
    private final b78 e;

    public nh6(l6<ye6> l6Var, List<Integer> list, List<Integer> list2, List<dd6> list3, b78 b78Var) {
        z65.h(l6Var, "menuItemVOs");
        z65.h(list, "headersItemsIndices");
        z65.h(list2, "itemsHeadersIndices");
        z65.h(list3, "menuCategories");
        z65.h(b78Var, "pizzaConcept");
        this.a = l6Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = b78Var;
    }

    public final List<Integer> a() {
        return this.b;
    }

    public final List<Integer> b() {
        return this.c;
    }

    public final List<dd6> c() {
        return this.d;
    }

    public final l6<ye6> d() {
        return this.a;
    }

    public final b78 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh6)) {
            return false;
        }
        nh6 nh6Var = (nh6) obj;
        if (z65.c(this.a, nh6Var.a) && z65.c(this.b, nh6Var.b) && z65.c(this.c, nh6Var.c) && z65.c(this.d, nh6Var.d) && this.e == nh6Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        l6<ye6> l6Var = this.a;
        List<Integer> list = this.b;
        List<Integer> list2 = this.c;
        List<dd6> list3 = this.d;
        b78 b78Var = this.e;
        return "MenuVO(menuItemVOs=" + l6Var + ", headersItemsIndices=" + list + ", itemsHeadersIndices=" + list2 + ", menuCategories=" + list3 + ", pizzaConcept=" + b78Var + ")";
    }

    public /* synthetic */ nh6(l6 l6Var, List list, List list2, List list3, b78 b78Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l6Var, list, list2, list3, (i & 16) != 0 ? b78.a : b78Var);
    }
}
