package defpackage;

import kotlin.Metadata;
/* compiled from: ShoppingCartVO.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lgx2;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lhn6;", "a", "Lhn6;", "()Lhn6;", "amount", "Lex2;", "b", "Lex2;", "()Lex2;", "note", "<init>", "(Lhn6;Lex2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gx2  reason: default package */
/* loaded from: classes2.dex */
public final class gx2 {
    private final hn6 a;
    private final ex2 b;

    public gx2(hn6 hn6Var, ex2 ex2Var) {
        z65.h(hn6Var, "amount");
        z65.h(ex2Var, "note");
        this.a = hn6Var;
        this.b = ex2Var;
    }

    public final hn6 a() {
        return this.a;
    }

    public final ex2 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx2)) {
            return false;
        }
        gx2 gx2Var = (gx2) obj;
        if (z65.c(this.a, gx2Var.a) && this.b == gx2Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        hn6 hn6Var = this.a;
        ex2 ex2Var = this.b;
        return "DeliveryFeeVO(amount=" + hn6Var + ", note=" + ex2Var + ")";
    }
}
