package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.sk9;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "a", "", "Llx1;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: mx1  reason: default package */
/* loaded from: classes3.dex */
public final class mx1 {
    private static final List<lx1> a;

    static {
        Sequence c;
        List<lx1> s;
        c = bca.c(ServiceLoader.load(lx1.class, lx1.class.getClassLoader()).iterator());
        s = dca.s(c);
        a = s;
    }

    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        for (lx1 lx1Var : a) {
            try {
                lx1Var.N(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, nx1.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            sk9.a aVar = sk9.b;
            vl3.a(th, new b23(coroutineContext));
            sk9.b(Unit.a);
        } catch (Throwable th3) {
            sk9.a aVar2 = sk9.b;
            sk9.b(vk9.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
