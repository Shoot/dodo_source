package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\t"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "a", "originalException", "thrownException", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: nx1  reason: default package */
/* loaded from: classes3.dex */
public final class nx1 {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            lx1 lx1Var = (lx1) coroutineContext.c(lx1.J);
            if (lx1Var != null) {
                lx1Var.N(coroutineContext, th);
            } else {
                mx1.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            mx1.a(coroutineContext, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        vl3.a(runtimeException, th);
        return runtimeException;
    }
}
