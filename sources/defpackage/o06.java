package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: LoyaltyHistoryOperation.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006$"}, d2 = {"Lo06;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lgb7;", "a", "Lgb7;", e.a, "()Lgb7;", MessageAttributes.TYPE, "Lq06;", "b", "Lq06;", DateTokenConverter.CONVERTER_KEY, "()Lq06;", KustoStorage.KustoTable.COLUMN_SOURCE, "", c.a, "J", "()J", "amount", "Ljava/lang/String;", "()Ljava/lang/String;", "date", "expirationDate", "f", "Z", "()Z", "isExtraCashBack", "<init>", "(Lgb7;Lq06;JLjava/lang/String;Ljava/lang/String;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o06  reason: default package */
/* loaded from: classes4.dex */
public final class o06 {
    private final gb7 a;
    private final q06 b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;

    public o06(gb7 gb7Var, q06 q06Var, long j, String str, String str2, boolean z) {
        z65.h(gb7Var, MessageAttributes.TYPE);
        z65.h(q06Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(str, "date");
        z65.h(str2, "expirationDate");
        this.a = gb7Var;
        this.b = q06Var;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    public final long a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
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
        if (!(obj instanceof o06)) {
            return false;
        }
        o06 o06Var = (o06) obj;
        if (this.a == o06Var.a && z65.c(this.b, o06Var.b) && this.c == o06Var.c && z65.c(this.d, o06Var.d) && z65.c(this.e, o06Var.e) && this.f == o06Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ax1.a(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public String toString() {
        gb7 gb7Var = this.a;
        q06 q06Var = this.b;
        long j = this.c;
        String str = this.d;
        String str2 = this.e;
        boolean z = this.f;
        return "LoyaltyHistoryOperation(type=" + gb7Var + ", source=" + q06Var + ", amount=" + j + ", date=" + str + ", expirationDate=" + str2 + ", isExtraCashBack=" + z + ")";
    }
}
