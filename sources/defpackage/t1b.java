package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ReferralCodeStatus.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lt1b;", "Lla9;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "D", "()D", "coinsReward", "b", "I", "()I", "expirationDays", "<init>", "(DI)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t1b  reason: default package */
/* loaded from: classes2.dex */
public final class t1b extends la9 implements Serializable {
    private final double a;
    private final int b;

    public t1b(double d, int i) {
        super(null);
        this.a = d;
        this.b = i;
    }

    public final double a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1b)) {
            return false;
        }
        t1b t1bVar = (t1b) obj;
        if (Double.compare(this.a, t1bVar.a) == 0 && this.b == t1bVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (nkb.a(this.a) * 31) + this.b;
    }

    public String toString() {
        double d = this.a;
        int i = this.b;
        return "SuccessReferralCodeStatus(coinsReward=" + d + ", expirationDays=" + i + ")";
    }
}
