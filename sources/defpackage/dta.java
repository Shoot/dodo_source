package defpackage;

import kotlin.Metadata;
/* compiled from: StackGameVO.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Ldta;", "", "", "toString", "", "hashCode", "other", "", "equals", "Loc4;", "a", "Loc4;", "()Loc4;", "gameEntryIcons", "<init>", "(Loc4;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dta  reason: default package */
/* loaded from: classes.dex */
public final class dta {
    private final oc4 a;

    public dta(oc4 oc4Var) {
        z65.h(oc4Var, "gameEntryIcons");
        this.a = oc4Var;
    }

    public final oc4 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dta) && z65.c(this.a, ((dta) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        oc4 oc4Var = this.a;
        return "StackGameVO(gameEntryIcons=" + oc4Var + ")";
    }
}
