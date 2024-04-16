package defpackage;

import kotlin.Metadata;
/* compiled from: SelectionMapData.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lz9a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljaa;", "a", "Ljaa;", "()Ljaa;", "pizzeriaVOData", "Ld88;", "b", "Ld88;", "getTappedPizzeria", "()Ld88;", "tappedPizzeria", "<init>", "(Ljaa;Ld88;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z9a  reason: default package */
/* loaded from: classes2.dex */
public final class z9a {
    private final jaa a;
    private final d88 b;

    public z9a(jaa jaaVar, d88 d88Var) {
        z65.h(jaaVar, "pizzeriaVOData");
        this.a = jaaVar;
        this.b = d88Var;
    }

    public final jaa a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9a)) {
            return false;
        }
        z9a z9aVar = (z9a) obj;
        if (z65.c(this.a, z9aVar.a) && z65.c(this.b, z9aVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        d88 d88Var = this.b;
        if (d88Var == null) {
            hashCode = 0;
        } else {
            hashCode = d88Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        jaa jaaVar = this.a;
        d88 d88Var = this.b;
        return "PizzeriaListData(pizzeriaVOData=" + jaaVar + ", tappedPizzeria=" + d88Var + ")";
    }
}
