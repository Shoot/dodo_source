package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lqx1;", "Lcv1;", "", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: rh0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh0 {
    public static final <T> T a(CoroutineContext coroutineContext, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2) throws InterruptedException {
        yk3 yk3Var;
        yk3 a;
        CoroutineContext d;
        Thread currentThread = Thread.currentThread();
        d dVar = (d) coroutineContext.c(d.J4);
        if (dVar == null) {
            a = zdb.a.b();
            d = jx1.d(lg4.a, coroutineContext.P(a));
        } else {
            yk3 yk3Var2 = null;
            if (dVar instanceof yk3) {
                yk3Var = (yk3) dVar;
            } else {
                yk3Var = null;
            }
            if (yk3Var != null) {
                if (yk3Var.O0()) {
                    yk3Var2 = yk3Var;
                }
                if (yk3Var2 != null) {
                    a = yk3Var2;
                    d = jx1.d(lg4.a, coroutineContext);
                }
            }
            a = zdb.a.a();
            d = jx1.d(lg4.a, coroutineContext);
        }
        td0 td0Var = new td0(d, currentThread, a);
        td0Var.f1(ux1.DEFAULT, td0Var, function2);
        return (T) td0Var.g1();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = e.a;
        }
        return qh0.e(coroutineContext, function2);
    }
}
