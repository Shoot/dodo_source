package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CacheParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lql0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "cacheKey", "", "J", "()J", "cacheDuration", c.a, "Z", "()Z", "invalidateCache", "<init>", "(Ljava/lang/String;JZ)V", "cache"}, k = 1, mv = {1, 9, 0})
/* renamed from: ql0  reason: default package */
/* loaded from: classes.dex */
public final class ql0 {
    private final String a;
    private final long b;
    private final boolean c;

    public ql0(String str, long j, boolean z) {
        z65.h(str, "cacheKey");
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql0)) {
            return false;
        }
        ql0 ql0Var = (ql0) obj;
        if (z65.c(this.a, ql0Var.a) && this.b == ql0Var.b && this.c == ql0Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ax1.a(this.b)) * 31) + a91.a(this.c);
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        boolean z = this.c;
        return "CacheParams(cacheKey=" + str + ", cacheDuration=" + j + ", invalidateCache=" + z + ")";
    }

    public /* synthetic */ ql0(String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? false : z);
    }
}
