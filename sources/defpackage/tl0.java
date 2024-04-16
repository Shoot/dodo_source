package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: CacheTimestamp.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Ltl0;", "", "", Action.KEY_ATTRIBUTE, "", "createdAt", "expirationTime", "a", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "b", "J", c.a, "()J", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/lang/String;JJ)V", "cache"}, k = 1, mv = {1, 9, 0})
/* renamed from: tl0  reason: default package */
/* loaded from: classes.dex */
public final class tl0 {
    private final String a;
    private final long b;
    private final long c;

    public tl0(String str, long j, long j2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public static /* synthetic */ tl0 b(tl0 tl0Var, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tl0Var.a;
        }
        if ((i & 2) != 0) {
            j = tl0Var.b;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = tl0Var.c;
        }
        return tl0Var.a(str, j3, j2);
    }

    public final tl0 a(String str, long j, long j2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return new tl0(str, j, j2);
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl0)) {
            return false;
        }
        tl0 tl0Var = (tl0) obj;
        if (z65.c(this.a, tl0Var.a) && this.b == tl0Var.b && this.c == tl0Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ax1.a(this.b)) * 31) + ax1.a(this.c);
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        return "CacheTimestamp(key=" + str + ", createdAt=" + j + ", expirationTime=" + j2 + ")";
    }
}
