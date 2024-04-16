package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderStateInfo.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\n\u0010\u0011¨\u0006\u0016"}, d2 = {"Loi7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lmi7;", "a", "Lmi7;", "b", "()Lmi7;", "state", "I", c.a, "()I", "totalBars", "finishedBars", "<init>", "(Lmi7;II)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oi7  reason: default package */
/* loaded from: classes4.dex */
public final class oi7 {
    private final mi7 a;
    private final int b;
    private final int c;

    public oi7() {
        this(null, 0, 0, 7, null);
    }

    public final int a() {
        return this.c;
    }

    public final mi7 b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi7)) {
            return false;
        }
        oi7 oi7Var = (oi7) obj;
        if (this.a == oi7Var.a && this.b == oi7Var.b && this.c == oi7Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        mi7 mi7Var = this.a;
        int i = this.b;
        int i2 = this.c;
        return "OrderStateInfo(state=" + mi7Var + ", totalBars=" + i + ", finishedBars=" + i2 + ")";
    }

    public oi7(mi7 mi7Var, int i, int i2) {
        z65.h(mi7Var, "state");
        this.a = mi7Var;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ oi7(mi7 mi7Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? mi7.c : mi7Var, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
