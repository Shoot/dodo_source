package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: MysteryShopperCardData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lsr6;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "orderId", "Lmi7;", "Lmi7;", c.a, "()Lmi7;", "orderState", "Lqd;", "Lqd;", "()Lqd;", "analyticsSender", "<init>", "(Ljava/lang/String;Lmi7;Lqd;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sr6  reason: default package */
/* loaded from: classes.dex */
public final class sr6 implements Serializable {
    private final String a;
    private final mi7 b;
    private final qd c;

    public sr6(String str, mi7 mi7Var, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(mi7Var, "orderState");
        z65.h(qdVar, "analyticsSender");
        this.a = str;
        this.b = mi7Var;
        this.c = qdVar;
    }

    public final qd a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final mi7 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr6)) {
            return false;
        }
        sr6 sr6Var = (sr6) obj;
        if (z65.c(this.a, sr6Var.a) && this.b == sr6Var.b && z65.c(this.c, sr6Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        mi7 mi7Var = this.b;
        qd qdVar = this.c;
        return "MysteryShopperCardData(orderId=" + str + ", orderState=" + mi7Var + ", analyticsSender=" + qdVar + ")";
    }
}
