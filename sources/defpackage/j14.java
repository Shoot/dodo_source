package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableSampleTimed.java */
/* renamed from: j14  reason: default package */
/* loaded from: classes3.dex */
public final class j14<T> extends j1<T, T> {
    final long d;
    final TimeUnit e;
    final xv9 f;
    final boolean g;

    /* compiled from: FlowableSampleTimed.java */
    /* renamed from: j14$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        final AtomicInteger h;

        a(i1b<? super T> i1bVar, long j, TimeUnit timeUnit, xv9 xv9Var) {
            super(i1bVar, j, timeUnit, xv9Var);
            this.h = new AtomicInteger(1);
        }

        @Override // defpackage.j14.c
        void e() {
            i();
            if (this.h.decrementAndGet() == 0) {
                this.a.b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.h.incrementAndGet() == 2) {
                i();
                if (this.h.decrementAndGet() == 0) {
                    this.a.b();
                }
            }
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* renamed from: j14$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        b(i1b<? super T> i1bVar, long j, TimeUnit timeUnit, xv9 xv9Var) {
            super(i1bVar, j, timeUnit, xv9Var);
        }

        @Override // defpackage.j14.c
        void e() {
            this.a.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            i();
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* renamed from: j14$c */
    /* loaded from: classes3.dex */
    static abstract class c<T> extends AtomicReference<T> implements m14<T>, k1b, Runnable {
        final i1b<? super T> a;
        final long b;
        final TimeUnit c;
        final xv9 d;
        final AtomicLong e = new AtomicLong();
        final eca f = new eca();
        k1b g;

        c(i1b<? super T> i1bVar, long j, TimeUnit timeUnit, xv9 xv9Var) {
            this.a = i1bVar;
            this.b = j;
            this.c = timeUnit;
            this.d = xv9Var;
        }

        void a() {
            g43.k(this.f);
        }

        @Override // defpackage.i1b
        public void b() {
            a();
            e();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.g, k1bVar)) {
                this.g = k1bVar;
                this.a.c(this);
                eca ecaVar = this.f;
                xv9 xv9Var = this.d;
                long j = this.b;
                ecaVar.b(xv9Var.f(this, j, j, this.c));
                k1bVar.w(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            a();
            this.g.cancel();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            lazySet(t);
        }

        abstract void e();

        void i() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.e.get() != 0) {
                    this.a.d(andSet);
                    g60.d(this.e, 1L);
                    return;
                }
                cancel();
                this.a.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            a();
            this.a.onError(th);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.a(this.e, j);
            }
        }
    }

    public j14(l04<T> l04Var, long j, TimeUnit timeUnit, xv9 xv9Var, boolean z) {
        super(l04Var);
        this.d = j;
        this.e = timeUnit;
        this.f = xv9Var;
        this.g = z;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        wca wcaVar = new wca(i1bVar);
        if (this.g) {
            this.c.R(new a(wcaVar, this.d, this.e, this.f));
        } else {
            this.c.R(new b(wcaVar, this.d, this.e, this.f));
        }
    }
}
