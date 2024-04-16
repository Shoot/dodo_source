package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutInfo.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"La51;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lns2;", "a", "Lns2;", "b", "()Lns2;", "deferredIntervals", "<init>", "(Lns2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a51  reason: default package */
/* loaded from: classes4.dex */
public final class a51 {
    public static final a b = new a(null);
    private static final a51 c;
    private final ns2 a;

    /* compiled from: CheckoutInfo.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"La51$a;", "", "La51;", "EMPTY", "La51;", "a", "()La51;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a51$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a51 a() {
            return a51.c;
        }
    }

    static {
        List l;
        l = kc1.l();
        c = new a51(new ns2(null, l));
    }

    public a51(ns2 ns2Var) {
        z65.h(ns2Var, "deferredIntervals");
        this.a = ns2Var;
    }

    public final ns2 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a51) && z65.c(this.a, ((a51) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        ns2 ns2Var = this.a;
        return "CheckoutInfo(deferredIntervals=" + ns2Var + ")";
    }
}
