package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, d2 = {"T", "Lcv1;", "delegate", "Lgn0;", "b", "Lfn0;", "Llw5;", "node", "", c.a, "Lf43;", "handle", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: in0  reason: default package */
/* loaded from: classes3.dex */
public final class in0 {
    public static final void a(fn0<?> fn0Var, f43 f43Var) {
        fn0Var.u(new k43(f43Var));
    }

    public static final <T> gn0<T> b(cv1<? super T> cv1Var) {
        if (!(cv1Var instanceof n33)) {
            return new gn0<>(cv1Var, 1);
        }
        gn0<T> j = ((n33) cv1Var).j();
        if (j != null) {
            if (!j.F()) {
                j = null;
            }
            if (j != null) {
                return j;
            }
        }
        return new gn0<>(cv1Var, 2);
    }

    public static final void c(fn0<?> fn0Var, lw5 lw5Var) {
        fn0Var.u(new ae9(lw5Var));
    }
}
