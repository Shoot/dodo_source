package defpackage;

import kotlin.Metadata;
/* compiled from: CheckoutDetails.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzs7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljw7;", "a", "Ljw7;", "b", "()Ljw7;", "paymentWay", "Lhn6;", "Lhn6;", "()Lhn6;", "note", "<init>", "(Ljw7;Lhn6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zs7  reason: default package */
/* loaded from: classes4.dex */
public final class zs7 {
    private final jw7 a;
    private final hn6 b;

    public zs7(jw7 jw7Var, hn6 hn6Var) {
        this.a = jw7Var;
        this.b = hn6Var;
    }

    public final hn6 a() {
        return this.b;
    }

    public final jw7 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs7)) {
            return false;
        }
        zs7 zs7Var = (zs7) obj;
        if (z65.c(this.a, zs7Var.a) && z65.c(this.b, zs7Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        jw7 jw7Var = this.a;
        int i = 0;
        if (jw7Var == null) {
            hashCode = 0;
        } else {
            hashCode = jw7Var.hashCode();
        }
        int i2 = hashCode * 31;
        hn6 hn6Var = this.b;
        if (hn6Var != null) {
            i = hn6Var.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        jw7 jw7Var = this.a;
        hn6 hn6Var = this.b;
        return "PaymentDetails(paymentWay=" + jw7Var + ", note=" + hn6Var + ")";
    }
}
