package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"", "timeMillis", "", "a", "(JLcv1;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Lvt2;", "b", "(Lkotlin/coroutines/CoroutineContext;)Lvt2;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: xt2  reason: default package */
/* loaded from: classes3.dex */
public final class xt2 {
    public static final Object a(long j, cv1<? super Unit> cv1Var) {
        cv1 c;
        Object d;
        Object d2;
        if (j > 0) {
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            if (j < Long.MAX_VALUE) {
                b(gn0Var.getContext()).m(j, gn0Var);
            }
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }
        return Unit.a;
    }

    public static final vt2 b(CoroutineContext coroutineContext) {
        vt2 vt2Var;
        CoroutineContext.Element c = coroutineContext.c(d.J4);
        if (c instanceof vt2) {
            vt2Var = (vt2) c;
        } else {
            vt2Var = null;
        }
        if (vt2Var == null) {
            return rp2.a();
        }
        return vt2Var;
    }
}
