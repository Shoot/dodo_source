package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: LoyaltyHistoryOperationVO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\""}, d2 = {"Lr06;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lgb7;", "a", "Lgb7;", e.a, "()Lgb7;", MessageAttributes.TYPE, "Lq06;", "b", "Lq06;", DateTokenConverter.CONVERTER_KEY, "()Lq06;", KustoStorage.KustoTable.COLUMN_SOURCE, "", c.a, "J", "()J", "amount", "dateMillis", "expirationDateMillis", "f", "Z", "()Z", "isExtraCashBack", "<init>", "(Lgb7;Lq06;JJJZ)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: r06  reason: default package */
/* loaded from: classes2.dex */
public final class r06 {
    private final gb7 a;
    private final q06 b;
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;

    public r06(gb7 gb7Var, q06 q06Var, long j, long j2, long j3, boolean z) {
        z65.h(gb7Var, MessageAttributes.TYPE);
        z65.h(q06Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = gb7Var;
        this.b = q06Var;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.e;
    }

    public final q06 d() {
        return this.b;
    }

    public final gb7 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r06)) {
            return false;
        }
        r06 r06Var = (r06) obj;
        if (this.a == r06Var.a && z65.c(this.b, r06Var.b) && this.c == r06Var.c && this.d == r06Var.d && this.e == r06Var.e && this.f == r06Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ax1.a(this.c)) * 31) + ax1.a(this.d)) * 31) + ax1.a(this.e)) * 31) + a91.a(this.f);
    }

    public String toString() {
        gb7 gb7Var = this.a;
        q06 q06Var = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        boolean z = this.f;
        return "LoyaltyHistoryOperationVO(type=" + gb7Var + ", source=" + q06Var + ", amount=" + j + ", dateMillis=" + j2 + ", expirationDateMillis=" + j3 + ", isExtraCashBack=" + z + ")";
    }
}
