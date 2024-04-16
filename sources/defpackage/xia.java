package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.qr0;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ShoppingCartMerger.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, d2 = {"Lxia;", "", "Lqr0;", "cartQueueItem", "Llia;", c.a, "shoppingCart", DateTokenConverter.CONVERTER_KEY, "b", "", "toString", "", "hashCode", "other", "", "equals", "a", "Llia;", "()Llia;", "<init>", "(Llia;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: xia  reason: default package */
/* loaded from: classes.dex */
public final class xia {
    private final lia a;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xia$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((nq0) t).s()), Integer.valueOf(((nq0) t2).s()));
            return d;
        }
    }

    public xia(lia liaVar) {
        z65.h(liaVar, "shoppingCart");
        this.a = liaVar;
    }

    private final lia c(qr0 qr0Var) {
        if (qr0Var instanceof qr0.a) {
            return new t6().h(this.a, (qr0.a) qr0Var);
        }
        if (qr0Var instanceof qr0.c) {
            return new vd3().e(this.a, (qr0.c) qr0Var);
        }
        if (qr0Var instanceof qr0.d) {
            return new rd9().e(this.a, (qr0.d) qr0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final lia d(lia liaVar) {
        List y0;
        lia a2;
        hn6 f = kn6.f();
        hn6 hn6Var = f;
        for (nq0 nq0Var : liaVar.f()) {
            hn6Var = rn6.f(hn6Var, nq0Var.w());
        }
        y0 = sc1.y0(liaVar.f(), new a());
        a2 = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : y0, (r28 & 4) != 0 ? liaVar.c : 0, (r28 & 8) != 0 ? liaVar.d : null, (r28 & 16) != 0 ? liaVar.e : hn6Var, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : hn6Var, (r28 & 2048) != 0 ? liaVar.l : false);
        return a2;
    }

    public final lia a() {
        return this.a;
    }

    public final xia b(qr0 qr0Var) {
        z65.h(qr0Var, "cartQueueItem");
        return new xia(d(c(qr0Var)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xia) && z65.c(this.a, ((xia) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        lia liaVar = this.a;
        return "ShoppingCartMerger(shoppingCart=" + liaVar + ")";
    }
}
