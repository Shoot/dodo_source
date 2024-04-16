package defpackage;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: LoyaltyHistoryOperationSource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lq06;", "", "", "toString", "", "hashCode", "other", "", "equals", "Leb7;", "a", "Leb7;", "getType", "()Leb7;", MessageAttributes.TYPE, "b", "Ljava/lang/String;", "()Ljava/lang/String;", "description", "<init>", "(Leb7;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q06  reason: default package */
/* loaded from: classes4.dex */
public final class q06 {
    private final eb7 a;
    private final String b;

    public q06(eb7 eb7Var, String str) {
        z65.h(eb7Var, MessageAttributes.TYPE);
        z65.h(str, "description");
        this.a = eb7Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q06)) {
            return false;
        }
        q06 q06Var = (q06) obj;
        if (this.a == q06Var.a && z65.c(this.b, q06Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        eb7 eb7Var = this.a;
        String str = this.b;
        return "LoyaltyHistoryOperationSource(type=" + eb7Var + ", description=" + str + ")";
    }
}
