package defpackage;

import kotlin.Metadata;
/* compiled from: FieldComponent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lgs3;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lus3;", "a", "Lus3;", "b", "()Lus3;", "view", "Lls3;", "Lls3;", "()Lls3;", "presenter", "<init>", "(Lus3;Lls3;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gs3  reason: default package */
/* loaded from: classes.dex */
public final class gs3 {
    private final us3 a;
    private final ls3 b;

    public gs3(us3 us3Var, ls3 ls3Var) {
        z65.h(us3Var, "view");
        z65.h(ls3Var, "presenter");
        this.a = us3Var;
        this.b = ls3Var;
    }

    public final ls3 a() {
        return this.b;
    }

    public final us3 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs3)) {
            return false;
        }
        gs3 gs3Var = (gs3) obj;
        if (z65.c(this.a, gs3Var.a) && z65.c(this.b, gs3Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        us3 us3Var = this.a;
        ls3 ls3Var = this.b;
        return "FieldComponent(view=" + us3Var + ", presenter=" + ls3Var + ")";
    }
}
