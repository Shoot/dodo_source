package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Fsm.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0012\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0015"}, d2 = {"Lbua;", "S", "D", "", "a", "()Ljava/lang/Object;", "b", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", c.a, "stateName", "getStateData", "stateData", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "statemachine_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bua  reason: default package */
/* loaded from: classes4.dex */
public final class bua<S, D> {
    private final S a;
    private final D b;

    public bua(S s, D d) {
        this.a = s;
        this.b = d;
    }

    public final S a() {
        return this.a;
    }

    public final D b() {
        return this.b;
    }

    public final S c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bua)) {
            return false;
        }
        bua buaVar = (bua) obj;
        if (z65.c(this.a, buaVar.a) && z65.c(this.b, buaVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        S s = this.a;
        int i = 0;
        if (s == null) {
            hashCode = 0;
        } else {
            hashCode = s.hashCode();
        }
        int i2 = hashCode * 31;
        D d = this.b;
        if (d != null) {
            i = d.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        S s = this.a;
        D d = this.b;
        return "State(stateName=" + s + ", stateData=" + d + ")";
    }
}
