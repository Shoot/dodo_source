package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lfm3;", "Lem3;", "Lvt2;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "r0", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "", "p0", "x", "Lfn0;", "continuation", Image.TYPE_MEDIUM, "Lf43;", Image.TYPE_SMALL, "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "q0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: fm3  reason: default package */
/* loaded from: classes3.dex */
public final class fm3 extends em3 implements vt2 {
    private final Executor d;

    public fm3(Executor executor) {
        this.d = executor;
        gp1.a(q0());
    }

    private final void p0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        q95.d(coroutineContext, tl3.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> r0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            p0(coroutineContext, e);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor q0 = q0();
        if (q0 instanceof ExecutorService) {
            executorService = (ExecutorService) q0;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof fm3) && ((fm3) obj).q0() == q0()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(q0());
    }

    @Override // defpackage.vt2
    public void m(long j, fn0<? super Unit> fn0Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor q0 = q0();
        ScheduledFuture<?> scheduledFuture = null;
        if (q0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) q0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = r0(scheduledExecutorService, new al9(this, fn0Var), fn0Var.getContext(), j);
        }
        if (scheduledFuture != null) {
            q95.h(fn0Var, scheduledFuture);
        } else {
            qp2.h.m(j, fn0Var);
        }
    }

    public Executor q0() {
        return this.d;
    }

    @Override // defpackage.vt2
    public f43 s(long j, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor q0 = q0();
        ScheduledFuture<?> scheduledFuture = null;
        if (q0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) q0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = r0(scheduledExecutorService, runnable, coroutineContext, j);
        }
        if (scheduledFuture != null) {
            return new e43(scheduledFuture);
        }
        return qp2.h.s(j, runnable, coroutineContext);
    }

    @Override // defpackage.kx1
    public String toString() {
        return q0().toString();
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor q0 = q0();
            k2.a();
            q0.execute(runnable);
        } catch (RejectedExecutionException e) {
            k2.a();
            p0(coroutineContext, e);
            v33.b().x(coroutineContext, runnable);
        }
    }
}
