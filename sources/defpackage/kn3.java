package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: MissionDataVO.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkn3;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "endDateMillis", "b", "Z", "()Z", "isExpiring", "<init>", "(JZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kn3  reason: default package */
/* loaded from: classes4.dex */
public final class kn3 implements Serializable {
    private final long a;
    private final boolean b;

    public kn3(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn3)) {
            return false;
        }
        kn3 kn3Var = (kn3) obj;
        if (this.a == kn3Var.a && this.b == kn3Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (ax1.a(this.a) * 31) + a91.a(this.b);
    }

    public String toString() {
        long j = this.a;
        boolean z = this.b;
        return "ExpiringDataVO(endDateMillis=" + j + ", isExpiring=" + z + ")";
    }
}
