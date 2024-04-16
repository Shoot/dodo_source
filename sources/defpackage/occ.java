package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Yield.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"", "a", "(Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: occ  reason: default package */
/* loaded from: classes3.dex */
public final class occ {
    public static final Object a(cv1<? super Unit> cv1Var) {
        cv1 c;
        n33 n33Var;
        Object d;
        Object d2;
        Object d3;
        CoroutineContext context = cv1Var.getContext();
        q95.k(context);
        c = b75.c(cv1Var);
        if (c instanceof n33) {
            n33Var = (n33) c;
        } else {
            n33Var = null;
        }
        if (n33Var == null) {
            d = Unit.a;
        } else {
            if (n33Var.d.W(context)) {
                n33Var.k(context, Unit.a);
            } else {
                ncc nccVar = new ncc();
                CoroutineContext P = context.P(nccVar);
                Unit unit = Unit.a;
                n33Var.k(P, unit);
                if (nccVar.b) {
                    d = o33.d(n33Var) ? c75.d() : unit;
                }
            }
            d = c75.d();
        }
        d2 = c75.d();
        if (d == d2) {
            io2.c(cv1Var);
        }
        d3 = c75.d();
        if (d == d3) {
            return d;
        }
        return Unit.a;
    }
}
