package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PersonalOfferVO.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001a"}, d2 = {"Lbwb;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "beginDate", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "endDate", c.a, "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isInFuture", "isExpiring", "<init>", "(JLjava/lang/Long;ZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bwb  reason: default package */
/* loaded from: classes2.dex */
public final class bwb {
    private final long a;
    private final Long b;
    private final boolean c;
    private final boolean d;

    public bwb(long j, Long l, boolean z, boolean z2) {
        this.a = j;
        this.b = l;
        this.c = z;
        this.d = z2;
    }

    public final long a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwb)) {
            return false;
        }
        bwb bwbVar = (bwb) obj;
        if (this.a == bwbVar.a && z65.c(this.b, bwbVar.b) && this.c == bwbVar.c && this.d == bwbVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = ax1.a(this.a) * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return ((((a + hashCode) * 31) + a91.a(this.c)) * 31) + a91.a(this.d);
    }

    public String toString() {
        long j = this.a;
        Long l = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        return "ValidityPeriodVO(beginDate=" + j + ", endDate=" + l + ", isInFuture=" + z + ", isExpiring=" + z2 + ")";
    }
}
