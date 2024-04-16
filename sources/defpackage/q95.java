package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
@Metadata(d1 = {"r95", "s95"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* renamed from: q95  reason: default package */
/* loaded from: classes3.dex */
public final class q95 {
    public static final bl1 a(l95 l95Var) {
        return s95.a(l95Var);
    }

    public static final void c(l95 l95Var, String str, Throwable th) {
        s95.c(l95Var, str, th);
    }

    public static final void d(CoroutineContext coroutineContext, CancellationException cancellationException) {
        s95.d(coroutineContext, cancellationException);
    }

    public static final Object g(l95 l95Var, cv1<? super Unit> cv1Var) {
        return s95.g(l95Var, cv1Var);
    }

    public static final void h(fn0<?> fn0Var, Future<?> future) {
        r95.a(fn0Var, future);
    }

    public static final f43 i(l95 l95Var, f43 f43Var) {
        return s95.h(l95Var, f43Var);
    }

    public static final void j(l95 l95Var) {
        s95.i(l95Var);
    }

    public static final void k(CoroutineContext coroutineContext) {
        s95.j(coroutineContext);
    }

    public static final l95 l(CoroutineContext coroutineContext) {
        return s95.k(coroutineContext);
    }

    public static final boolean m(CoroutineContext coroutineContext) {
        return s95.l(coroutineContext);
    }
}
