package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ComboTemplateSlotProductV5.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lej1;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ltm8;", "a", "Ltm8;", "()Ltm8;", "product", "Lhn6;", "b", "Lhn6;", "getExtraPrice", "()Lhn6;", "extraPrice", c.a, "I", "getIndex", "()I", "index", "<init>", "(Ltm8;Lhn6;I)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: ej1  reason: default package */
/* loaded from: classes.dex */
public final class ej1 {
    private final tm8 a;
    private final hn6 b;
    private final int c;

    public ej1(tm8 tm8Var, hn6 hn6Var, int i) {
        z65.h(tm8Var, "product");
        z65.h(hn6Var, "extraPrice");
        this.a = tm8Var;
        this.b = hn6Var;
        this.c = i;
    }

    public final tm8 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej1)) {
            return false;
        }
        ej1 ej1Var = (ej1) obj;
        if (z65.c(this.a, ej1Var.a) && z65.c(this.b, ej1Var.b) && this.c == ej1Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public String toString() {
        tm8 tm8Var = this.a;
        hn6 hn6Var = this.b;
        int i = this.c;
        return "ComboTemplateSlotProductV5(product=" + tm8Var + ", extraPrice=" + hn6Var + ", index=" + i + ")";
    }
}
