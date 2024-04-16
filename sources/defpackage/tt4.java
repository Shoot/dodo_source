package defpackage;

import kotlin.Metadata;
/* compiled from: IgnoreQueriesProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Ltt4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lut4;", "a", "Lut4;", "()Lut4;", "ignoreQueryPath", "Lvt4;", "b", "Lvt4;", "()Lvt4;", "ignoreQueryResponse", "<init>", "(Lut4;Lvt4;)V", "backend"}, k = 1, mv = {1, 9, 0})
/* renamed from: tt4  reason: default package */
/* loaded from: classes4.dex */
public final class tt4 {
    private final ut4 a;
    private final vt4 b;

    public tt4(ut4 ut4Var, vt4 vt4Var) {
        z65.h(ut4Var, "ignoreQueryPath");
        z65.h(vt4Var, "ignoreQueryResponse");
        this.a = ut4Var;
        this.b = vt4Var;
    }

    public final ut4 a() {
        return this.a;
    }

    public final vt4 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt4)) {
            return false;
        }
        tt4 tt4Var = (tt4) obj;
        if (z65.c(this.a, tt4Var.a) && this.b == tt4Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        ut4 ut4Var = this.a;
        vt4 vt4Var = this.b;
        return "IgnoreQueriesConfig(ignoreQueryPath=" + ut4Var + ", ignoreQueryResponse=" + vt4Var + ")";
    }
}
