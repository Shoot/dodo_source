package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import com.google.firebase.perf.session.gauges.c;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: MemoryGaugeCollector.java */
/* loaded from: classes2.dex */
public class c {
    private static final sh f = sh.e();
    private final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue<uh> b;
    private final Runtime c;
    private ScheduledFuture d;
    private long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public c() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private int d() {
        return hvb.c(txa.f.a(this.c.totalMemory() - this.c.freeMemory()));
    }

    public static boolean e(long j) {
        if (j <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Timer timer) {
        uh l = l(timer);
        if (l != null) {
            this.b.add(l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Timer timer) {
        uh l = l(timer);
        if (l != null) {
            this.b.add(l);
        }
    }

    private synchronized void h(final Timer timer) {
        try {
            this.a.schedule(new Runnable() { // from class: yc6
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.f(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            sh shVar = f;
            shVar.j("Unable to collect Memory Metric: " + e.getMessage());
        }
    }

    private synchronized void i(long j, final Timer timer) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new Runnable() { // from class: xc6
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.g(timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            sh shVar = f;
            shVar.j("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    private uh l(Timer timer) {
        if (timer == null) {
            return null;
        }
        return uh.c0().I(timer.b()).J(d()).a();
    }

    public void c(Timer timer) {
        h(timer);
    }

    public void j(long j, Timer timer) {
        if (e(j)) {
            return;
        }
        if (this.d != null) {
            if (this.e != j) {
                k();
                i(j, timer);
                return;
            }
            return;
        }
        i(j, timer);
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.d = null;
        this.e = -1L;
    }

    c(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.d = null;
        this.e = -1L;
        this.a = scheduledExecutorService;
        this.b = new ConcurrentLinkedQueue<>();
        this.c = runtime;
    }
}
