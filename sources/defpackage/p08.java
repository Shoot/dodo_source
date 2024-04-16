package defpackage;

import kotlin.Metadata;
/* compiled from: PersonalOffersDataVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lp08;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "isUserAuthorized", "Lp67;", "Lp67;", "()Lp67;", "foundOffer", "<init>", "(ZLp67;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p08  reason: default package */
/* loaded from: classes4.dex */
public final class p08 {
    private final boolean a;
    private final p67 b;

    public p08(boolean z, p67 p67Var) {
        this.a = z;
        this.b = p67Var;
    }

    public final p67 a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p08)) {
            return false;
        }
        p08 p08Var = (p08) obj;
        if (this.a == p08Var.a && z65.c(this.b, p08Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = a91.a(this.a) * 31;
        p67 p67Var = this.b;
        if (p67Var == null) {
            hashCode = 0;
        } else {
            hashCode = p67Var.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        boolean z = this.a;
        p67 p67Var = this.b;
        return "PersonalOffersDataVO(isUserAuthorized=" + z + ", foundOffer=" + p67Var + ")";
    }
}
