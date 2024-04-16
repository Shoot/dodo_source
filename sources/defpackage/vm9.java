package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: RnDigitalCardData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Lvm9;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "orderId", "b", "Z", "()Z", "closeCurrentScreenWhenFormOpened", "Lqd;", "Lqd;", "()Lqd;", "analyticsSender", "<init>", "(Ljava/lang/String;ZLqd;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vm9  reason: default package */
/* loaded from: classes.dex */
public final class vm9 implements Serializable {
    private final String a;
    private final boolean b;
    private final qd c;

    public vm9(String str, boolean z, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "analyticsSender");
        this.a = str;
        this.b = z;
        this.c = qdVar;
    }

    public final qd a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm9)) {
            return false;
        }
        vm9 vm9Var = (vm9) obj;
        if (z65.c(this.a, vm9Var.a) && this.b == vm9Var.b && z65.c(this.c, vm9Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        qd qdVar = this.c;
        return "RnDigitalCardData(orderId=" + str + ", closeCurrentScreenWhenFormOpened=" + z + ", analyticsSender=" + qdVar + ")";
    }
}
