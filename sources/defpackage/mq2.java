package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.e;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.i;
/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0017J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lmq2;", "Lem3;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlinx/coroutines/Runnable;", "block", "x", "L", "close", "", "toString", "Lkx1;", e.a, "Lkx1;", "default", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: mq2  reason: default package */
/* loaded from: classes3.dex */
public final class mq2 extends em3 implements Executor {
    public static final mq2 d = new mq2();
    private static final kx1 e;

    static {
        int e2;
        int d2;
        xqb xqbVar = xqb.c;
        e2 = i.e(64, c5b.a());
        d2 = e5b.d("kotlinx.coroutines.io.parallelism", e2, 0, 0, 12, null);
        e = xqbVar.e0(d2);
    }

    private mq2() {
    }

    @Override // defpackage.kx1
    public void L(CoroutineContext coroutineContext, Runnable runnable) {
        e.L(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x(kotlin.coroutines.e.a, runnable);
    }

    @Override // defpackage.kx1
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        e.x(coroutineContext, runnable);
    }
}
