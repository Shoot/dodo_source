package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CourierTipsCardData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lez1;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "orderId", "Lqd;", "Lqd;", "()Lqd;", "analyticsSender", "<init>", "(Ljava/lang/String;Lqd;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ez1  reason: default package */
/* loaded from: classes.dex */
public final class ez1 implements Serializable {
    private final String a;
    private final qd b;

    public ez1(String str, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "analyticsSender");
        this.a = str;
        this.b = qdVar;
    }

    public final qd a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        if (z65.c(this.a, ez1Var.a) && z65.c(this.b, ez1Var.b)) {
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
        return "CourierTipsCardData(orderId=" + str + ", analyticsSender=" + qdVar + ")";
    }
}
