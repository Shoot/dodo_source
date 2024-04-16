package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HalvesDataVO.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, d2 = {"Lxk4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lgl4;", "a", "Lgl4;", "b", "()Lgl4;", "info", "", "Lxj4;", "Ljava/util/List;", "()Ljava/util/List;", "halves", "Lb78;", c.a, "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Lgl4;Ljava/util/List;Lb78;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xk4  reason: default package */
/* loaded from: classes2.dex */
public final class xk4 {
    private final gl4 a;
    private final List<xj4> b;
    private final b78 c;

    public xk4(gl4 gl4Var, List<xj4> list, b78 b78Var) {
        z65.h(gl4Var, "info");
        z65.h(list, "halves");
        z65.h(b78Var, "pizzaConcept");
        this.a = gl4Var;
        this.b = list;
        this.c = b78Var;
    }

    public final List<xj4> a() {
        return this.b;
    }

    public final gl4 b() {
        return this.a;
    }

    public final b78 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk4)) {
            return false;
        }
        xk4 xk4Var = (xk4) obj;
        if (z65.c(this.a, xk4Var.a) && z65.c(this.b, xk4Var.b) && this.c == xk4Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        gl4 gl4Var = this.a;
        List<xj4> list = this.b;
        b78 b78Var = this.c;
        return "HalvesDataVO(info=" + gl4Var + ", halves=" + list + ", pizzaConcept=" + b78Var + ")";
    }
}
