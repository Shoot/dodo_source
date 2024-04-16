package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SearchMenuVO.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lky9;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lye6;", "a", "Ljava/util/List;", "()Ljava/util/List;", "menuItemVOs", "Lb78;", "b", "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ljava/util/List;Lb78;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ky9  reason: default package */
/* loaded from: classes4.dex */
public final class ky9 {
    private final List<ye6> a;
    private final b78 b;

    /* JADX WARN: Multi-variable type inference failed */
    public ky9(List<? extends ye6> list, b78 b78Var) {
        z65.h(list, "menuItemVOs");
        z65.h(b78Var, "pizzaConcept");
        this.a = list;
        this.b = b78Var;
    }

    public final List<ye6> a() {
        return this.a;
    }

    public final b78 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky9)) {
            return false;
        }
        ky9 ky9Var = (ky9) obj;
        if (z65.c(this.a, ky9Var.a) && this.b == ky9Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        List<ye6> list = this.a;
        b78 b78Var = this.b;
        return "SearchMenuVO(menuItemVOs=" + list + ", pizzaConcept=" + b78Var + ")";
    }

    public /* synthetic */ ky9(List list, b78 b78Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? b78.a : b78Var);
    }
}
