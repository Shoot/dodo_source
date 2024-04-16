package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Fsm.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B1\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0003HÖ\u0003R%\u0010\u0005\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Llo3;", "S", "D", "", "Lbua;", "currentState", "Lk94;", "functionIndex", "a", "", "toString", "", "hashCode", "other", "", "equals", "Lbua;", c.a, "()Lbua;", "b", "Lk94;", DateTokenConverter.CONVERTER_KEY, "()Lk94;", "<init>", "(Lbua;Lk94;)V", "statemachine_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lo3  reason: default package */
/* loaded from: classes4.dex */
public final class lo3<S, D> {
    private final bua<? extends S, D> a;
    private final k94<S, D> b;

    public lo3(bua<? extends S, D> buaVar, k94<S, D> k94Var) {
        z65.h(buaVar, "currentState");
        z65.h(k94Var, "functionIndex");
        this.a = buaVar;
        this.b = k94Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lo3 b(lo3 lo3Var, bua buaVar, k94 k94Var, int i, Object obj) {
        if ((i & 1) != 0) {
            buaVar = lo3Var.a;
        }
        if ((i & 2) != 0) {
            k94Var = lo3Var.b;
        }
        return lo3Var.a(buaVar, k94Var);
    }

    public final lo3<S, D> a(bua<? extends S, D> buaVar, k94<S, D> k94Var) {
        z65.h(buaVar, "currentState");
        z65.h(k94Var, "functionIndex");
        return new lo3<>(buaVar, k94Var);
    }

    public final bua<? extends S, D> c() {
        return this.a;
    }

    public final k94<S, D> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo3)) {
            return false;
        }
        lo3 lo3Var = (lo3) obj;
        if (z65.c(this.a, lo3Var.a) && z65.c(this.b, lo3Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        bua<? extends S, D> buaVar = this.a;
        k94<S, D> k94Var = this.b;
        return "FSMData(currentState=" + buaVar + ", functionIndex=" + k94Var + ")";
    }
}
