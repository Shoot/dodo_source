package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
@Metadata(d1 = {"rh0", "sh0"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* renamed from: qh0 */
/* loaded from: classes3.dex */
public final class qh0 {
    public static final <T> hs2<T> a(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2) {
        return sh0.a(qx1Var, coroutineContext, ux1Var, function2);
    }

    public static /* synthetic */ hs2 b(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2 function2, int i, Object obj) {
        return sh0.b(qx1Var, coroutineContext, ux1Var, function2, i, obj);
    }

    public static final l95 c(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2) {
        return sh0.c(qx1Var, coroutineContext, ux1Var, function2);
    }

    public static /* synthetic */ l95 d(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2 function2, int i, Object obj) {
        return sh0.d(qx1Var, coroutineContext, ux1Var, function2, i, obj);
    }

    public static final <T> T e(CoroutineContext coroutineContext, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) rh0.a(coroutineContext, function2);
    }

    public static /* synthetic */ Object f(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        return rh0.b(coroutineContext, function2, i, obj);
    }

    public static final <T> Object g(CoroutineContext coroutineContext, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var) {
        return sh0.e(coroutineContext, function2, cv1Var);
    }
}
