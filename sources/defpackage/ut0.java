package defpackage;

import kotlin.Metadata;
/* compiled from: DeepLinkData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lut0;", "Lvo2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "categoryId", "Lqd;", "b", "Lqd;", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Lqd;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ut0  reason: default package */
/* loaded from: classes3.dex */
public final class ut0 extends vo2 {
    private final String a;
    private final qd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut0(String str, qd qdVar) {
        super(null);
        z65.h(str, "categoryId");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = qdVar;
    }

    public final String a() {
        return this.a;
    }

    public final qd b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut0)) {
            return false;
        }
        ut0 ut0Var = (ut0) obj;
        if (z65.c(this.a, ut0Var.a) && z65.c(this.b, ut0Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        qd qdVar = this.b;
        return "CategoryDeepLinkData(categoryId=" + str + ", sender=" + qdVar + ")";
    }
}
