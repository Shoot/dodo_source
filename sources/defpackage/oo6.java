package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "Lno6;", "a", "(Lkotlin/coroutines/CoroutineContext;)Lno6;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: oo6  reason: default package */
/* loaded from: classes.dex */
public final class oo6 {
    public static final no6 a(CoroutineContext coroutineContext) {
        z65.h(coroutineContext, "<this>");
        no6 no6Var = (no6) coroutineContext.c(no6.N);
        if (no6Var != null) {
            return no6Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
