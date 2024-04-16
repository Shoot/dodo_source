package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TypefaceUtill.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lc34;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lw24;", "a", "Lw24;", "()Lw24;", "fontFamily", "Lv34;", "b", "Lv34;", "()Lv34;", "weight", "<init>", "(Lw24;Lv34;)V", "compose_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c34  reason: default package */
/* loaded from: classes2.dex */
public final class c34 {
    private final w24 a;
    private final v34 b;

    public c34(w24 w24Var, v34 v34Var) {
        z65.h(w24Var, "fontFamily");
        z65.h(v34Var, "weight");
        this.a = w24Var;
        this.b = v34Var;
    }

    public final w24 a() {
        return this.a;
    }

    public final v34 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c34)) {
            return false;
        }
        c34 c34Var = (c34) obj;
        if (z65.c(this.a, c34Var.a) && z65.c(this.b, c34Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        w24 w24Var = this.a;
        v34 v34Var = this.b;
        return "FontFamilyWithWeight(fontFamily=" + w24Var + ", weight=" + v34Var + ")";
    }

    public /* synthetic */ c34(w24 w24Var, v34 v34Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(w24Var, (i & 2) != 0 ? v34.b.e() : v34Var);
    }
}
