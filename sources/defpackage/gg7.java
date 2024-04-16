package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderLocationVO.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lgg7;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "()D", "lat", "b", "lon", "<init>", "(DD)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gg7  reason: default package */
/* loaded from: classes.dex */
public final class gg7 {
    private final double a;
    private final double b;

    public gg7() {
        this(0.0d, 0.0d, 3, null);
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg7)) {
            return false;
        }
        gg7 gg7Var = (gg7) obj;
        if (Double.compare(this.a, gg7Var.a) == 0 && Double.compare(this.b, gg7Var.b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (nkb.a(this.a) * 31) + nkb.a(this.b);
    }

    public String toString() {
        double d = this.a;
        double d2 = this.b;
        return "OrderLocationVO(lat=" + d + ", lon=" + d2 + ")";
    }

    public gg7(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public /* synthetic */ gg7(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
