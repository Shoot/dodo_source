package defpackage;

import kotlin.Metadata;
/* compiled from: CoinExpirationVO.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lxa1;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "expirationDateTimeUtcMillis", "", "D", "()D", "expirationAmount", "<init>", "(JD)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xa1  reason: default package */
/* loaded from: classes2.dex */
public final class xa1 {
    private final long a;
    private final double b;

    public xa1(long j, double d) {
        this.a = j;
        this.b = d;
    }

    public final double a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa1)) {
            return false;
        }
        xa1 xa1Var = (xa1) obj;
        if (this.a == xa1Var.a && Double.compare(this.b, xa1Var.b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (ax1.a(this.a) * 31) + nkb.a(this.b);
    }

    public String toString() {
        long j = this.a;
        double d = this.b;
        return "CoinExpirationVO(expirationDateTimeUtcMillis=" + j + ", expirationAmount=" + d + ")";
    }
}
