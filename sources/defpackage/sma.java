package defpackage;

import defpackage.xv9;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SingleScheduler.java */
/* renamed from: sma  reason: default package */
/* loaded from: classes3.dex */
public final class sma extends xv9 {
    static final vp9 e;
    static final ScheduledExecutorService f;
    final ThreadFactory c;
    final AtomicReference<ScheduledExecutorService> d;

    /* compiled from: SingleScheduler.java */
    /* renamed from: sma$a */
    /* loaded from: classes3.dex */
    static final class a extends xv9.c {
        final ScheduledExecutorService a;
        final wn1 b = new wn1();
        volatile boolean c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        @Override // defpackage.z33
        public void a() {
            if (!this.c) {
                this.c = true;
                this.b.a();
            }
        }

        @Override // defpackage.xv9.c
        public z33 d(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.c) {
                return ig3.INSTANCE;
            }
            vv9 vv9Var = new vv9(tp9.s(runnable), this.b);
            this.b.b(vv9Var);
            try {
                if (j <= 0) {
                    schedule = this.a.submit((Callable) vv9Var);
                } else {
                    schedule = this.a.schedule((Callable) vv9Var, j, timeUnit);
                }
                vv9Var.b(schedule);
                return vv9Var;
            } catch (RejectedExecutionException e) {
                a();
                tp9.q(e);
                return ig3.INSTANCE;
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.c;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        e = new vp9("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public sma() {
        this(e);
    }

    static ScheduledExecutorService g(ThreadFactory threadFactory) {
        return bw9.a(threadFactory);
    }

    @Override // defpackage.xv9
    public xv9.c b() {
        return new a(this.d.get());
    }

    @Override // defpackage.xv9
    public z33 e(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        uv9 uv9Var = new uv9(tp9.s(runnable));
        try {
            if (j <= 0) {
                schedule = this.d.get().submit(uv9Var);
            } else {
                schedule = this.d.get().schedule(uv9Var, j, timeUnit);
            }
            uv9Var.b(schedule);
            return uv9Var;
        } catch (RejectedExecutionException e2) {
            tp9.q(e2);
            return ig3.INSTANCE;
        }
    }

    @Override // defpackage.xv9
    public z33 f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable s = tp9.s(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.d.get();
            j55 j55Var = new j55(s, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(j55Var);
                } else {
                    schedule = scheduledExecutorService.schedule(j55Var, j, timeUnit);
                }
                j55Var.c(schedule);
                return j55Var;
            } catch (RejectedExecutionException e2) {
                tp9.q(e2);
                return ig3.INSTANCE;
            }
        }
        tv9 tv9Var = new tv9(s);
        try {
            tv9Var.b(this.d.get().scheduleAtFixedRate(tv9Var, j, j2, timeUnit));
            return tv9Var;
        } catch (RejectedExecutionException e3) {
            tp9.q(e3);
            return ig3.INSTANCE;
        }
    }

    public sma(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.d = atomicReference;
        this.c = threadFactory;
        atomicReference.lazySet(g(threadFactory));
    }
}
