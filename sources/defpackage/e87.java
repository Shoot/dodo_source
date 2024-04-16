package defpackage;

import kotlin.Metadata;
/* compiled from: MapAddressStateVOImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Le87;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lx56;", "a", "Lx56;", "()Lx56;", "current", "b", "Z", "()Z", "valueWasChanged", "<init>", "(Lx56;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e87  reason: default package */
/* loaded from: classes2.dex */
public final class e87 {
    private final x56 a;
    private final boolean b;

    public e87(x56 x56Var, boolean z) {
        z65.h(x56Var, "current");
        this.a = x56Var;
        this.b = z;
    }

    public final x56 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e87)) {
            return false;
        }
        e87 e87Var = (e87) obj;
        if (z65.c(this.a, e87Var.a) && this.b == e87Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        x56 x56Var = this.a;
        boolean z = this.b;
        return "OnFocusLostResult(current=" + x56Var + ", valueWasChanged=" + z + ")";
    }
}
