package defpackage;

import java.io.Serializable;
/* compiled from: ByFunctionOrdering.java */
/* renamed from: lj0  reason: default package */
/* loaded from: classes2.dex */
final class lj0<F, T> extends cm7<F> implements Serializable {
    final x84<F, ? extends T> a;
    final cm7<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lj0(x84<F, ? extends T> x84Var, cm7<T> cm7Var) {
        this.a = (x84) hh8.i(x84Var);
        this.b = (cm7) hh8.i(cm7Var);
    }

    @Override // defpackage.cm7, java.util.Comparator
    public int compare(F f, F f2) {
        return this.b.compare(this.a.apply(f), this.a.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lj0)) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        if (this.a.equals(lj0Var.a) && this.b.equals(lj0Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return n57.b(this.a, this.b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
