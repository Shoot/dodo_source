package defpackage;

import defpackage.xv9;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: NewThreadWorker.java */
/* renamed from: ux6  reason: default package */
/* loaded from: classes3.dex */
public class ux6 extends xv9.c implements z33 {
    private final ScheduledExecutorService a;
    volatile boolean b;

    public ux6(ThreadFactory threadFactory) {
        this.a = bw9.a(threadFactory);
    }

    @Override // defpackage.z33
    public void a() {
        if (!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    @Override // defpackage.xv9.c
    public z33 c(Runnable runnable) {
        return d(runnable, 0L, null);
    }

    @Override // defpackage.xv9.c
    public z33 d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.b) {
            return ig3.INSTANCE;
        }
        return f(runnable, j, timeUnit, null);
    }

    public vv9 f(Runnable runnable, long j, TimeUnit timeUnit, a43 a43Var) {
        Future<?> schedule;
        vv9 vv9Var = new vv9(tp9.s(runnable), a43Var);
        if (a43Var != null && !a43Var.b(vv9Var)) {
            return vv9Var;
        }
        try {
            if (j <= 0) {
                schedule = this.a.submit((Callable) vv9Var);
            } else {
                schedule = this.a.schedule((Callable) vv9Var, j, timeUnit);
            }
            vv9Var.b(schedule);
        } catch (RejectedExecutionException e) {
            if (a43Var != null) {
                a43Var.c(vv9Var);
            }
            tp9.q(e);
        }
        return vv9Var;
    }

    public z33 g(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        uv9 uv9Var = new uv9(tp9.s(runnable));
        try {
            if (j <= 0) {
                schedule = this.a.submit(uv9Var);
            } else {
                schedule = this.a.schedule(uv9Var, j, timeUnit);
            }
            uv9Var.b(schedule);
            return uv9Var;
        } catch (RejectedExecutionException e) {
            tp9.q(e);
            return ig3.INSTANCE;
        }
    }

    public z33 h(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable s = tp9.s(runnable);
        if (j2 <= 0) {
            j55 j55Var = new j55(s, this.a);
            try {
                if (j <= 0) {
                    schedule = this.a.submit(j55Var);
                } else {
                    schedule = this.a.schedule(j55Var, j, timeUnit);
                }
                j55Var.c(schedule);
                return j55Var;
            } catch (RejectedExecutionException e) {
                tp9.q(e);
                return ig3.INSTANCE;
            }
        }
        tv9 tv9Var = new tv9(s);
        try {
            tv9Var.b(this.a.scheduleAtFixedRate(tv9Var, j, j2, timeUnit));
            return tv9Var;
        } catch (RejectedExecutionException e2) {
            tp9.q(e2);
            return ig3.INSTANCE;
        }
    }

    @Override // defpackage.z33
    public boolean i() {
        return this.b;
    }

    public void j() {
        if (!this.b) {
            this.b = true;
            this.a.shutdown();
        }
    }
}
