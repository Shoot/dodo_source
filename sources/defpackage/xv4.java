package defpackage;

import kotlin.Metadata;
/* compiled from: ImageValueV5.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, d2 = {"Lxv4;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "width", "height", "<init>", "(JJ)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: xv4  reason: default package */
/* loaded from: classes.dex */
public final class xv4 {
    @uca("width")
    private final long a;
    @uca("height")
    private final long b;

    public xv4(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv4)) {
            return false;
        }
        xv4 xv4Var = (xv4) obj;
        if (this.a == xv4Var.a && this.b == xv4Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (ax1.a(this.a) * 31) + ax1.a(this.b);
    }

    public String toString() {
        long j = this.a;
        long j2 = this.b;
        return "ImageValueV5(width=" + j + ", height=" + j2 + ")";
    }
}
