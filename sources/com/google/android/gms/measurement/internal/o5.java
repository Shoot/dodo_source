package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class o5 extends s6 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    private r5 c;
    private r5 d;
    private final PriorityBlockingQueue<s5<?>> e;
    private final BlockingQueue<s5<?>> f;
    private final Thread.UncaughtExceptionHandler g;
    private final Thread.UncaughtExceptionHandler h;
    private final Object i;
    private final Semaphore j;
    private volatile boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o5(u5 u5Var) {
        super(u5Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue<>();
        this.f = new LinkedBlockingQueue();
        this.g = new p5(this, "Thread death: Uncaught exception on worker thread");
        this.h = new p5(this, "Thread death: Uncaught exception on network thread");
    }

    private final void x(s5<?> s5Var) {
        synchronized (this.i) {
            try {
                this.e.add(s5Var);
                r5 r5Var = this.c;
                if (r5Var == null) {
                    r5 r5Var2 = new r5(this, "Measurement Worker", this.e);
                    this.c = r5Var2;
                    r5Var2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    r5Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> Future<V> A(Callable<V> callable) throws IllegalStateException {
        o();
        gh8.j(callable);
        s5<?> s5Var = new s5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            s5Var.run();
        } else {
            x(s5Var);
        }
        return s5Var;
    }

    public final void C(Runnable runnable) throws IllegalStateException {
        o();
        gh8.j(runnable);
        x(new s5<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void F(Runnable runnable) throws IllegalStateException {
        o();
        gh8.j(runnable);
        x(new s5<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean I() {
        if (Thread.currentThread() == this.c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final void i() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final void l() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.s6
    protected final boolean s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T u(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            k().C(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                m4 K = n().K();
                K.a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            m4 K2 = n().K();
            K2.a("Timed out waiting for " + str);
        }
        return t;
    }

    public final <V> Future<V> v(Callable<V> callable) throws IllegalStateException {
        o();
        gh8.j(callable);
        s5<?> s5Var = new s5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                n().K().a("Callable skipped the worker queue.");
            }
            s5Var.run();
        } else {
            x(s5Var);
        }
        return s5Var;
    }

    public final void y(Runnable runnable) throws IllegalStateException {
        o();
        gh8.j(runnable);
        s5<?> s5Var = new s5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                this.f.add(s5Var);
                r5 r5Var = this.d;
                if (r5Var == null) {
                    r5 r5Var2 = new r5(this, "Measurement Network", this.f);
                    this.d = r5Var2;
                    r5Var2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    r5Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
