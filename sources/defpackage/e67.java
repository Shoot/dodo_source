package defpackage;

import defpackage.xv9;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ObservableThrottleLatest.java */
/* renamed from: e67  reason: default package */
/* loaded from: classes3.dex */
public final class e67<T> extends z1<T, T> {
    final long b;
    final TimeUnit c;
    final xv9 d;
    final boolean e;

    /* compiled from: ObservableThrottleLatest.java */
    /* renamed from: e67$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements h67<T>, z33, Runnable {
        final h67<? super T> a;
        final long b;
        final TimeUnit c;
        final xv9.c d;
        final boolean e;
        final AtomicReference<T> f = new AtomicReference<>();
        z33 g;
        volatile boolean h;
        Throwable i;
        volatile boolean j;
        volatile boolean k;
        boolean l;

        a(h67<? super T> h67Var, long j, TimeUnit timeUnit, xv9.c cVar, boolean z) {
            this.a = h67Var;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
            this.e = z;
        }

        @Override // defpackage.z33
        public void a() {
            this.j = true;
            this.g.a();
            this.d.a();
            if (getAndIncrement() == 0) {
                this.f.lazySet(null);
            }
        }

        @Override // defpackage.h67
        public void b() {
            this.h = true;
            e();
        }

        @Override // defpackage.h67
        public void c(z33 z33Var) {
            if (g43.E(this.g, z33Var)) {
                this.g = z33Var;
                this.a.c(this);
            }
        }

        @Override // defpackage.h67
        public void d(T t) {
            this.f.set(t);
            e();
        }

        void e() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f;
            h67<? super T> h67Var = this.a;
            int i = 1;
            while (!this.j) {
                boolean z2 = this.h;
                if (z2 && this.i != null) {
                    atomicReference.lazySet(null);
                    h67Var.onError(this.i);
                    this.d.a();
                    return;
                }
                if (atomicReference.get() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z && this.e) {
                        h67Var.d(andSet);
                    }
                    h67Var.b();
                    this.d.a();
                    return;
                }
                if (z) {
                    if (this.k) {
                        this.l = false;
                        this.k = false;
                    }
                } else if (!this.l || this.k) {
                    h67Var.d(atomicReference.getAndSet(null));
                    this.k = false;
                    this.l = true;
                    this.d.d(this, this.b, this.c);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.j;
        }

        @Override // defpackage.h67
        public void onError(Throwable th) {
            this.i = th;
            this.h = true;
            e();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.k = true;
            e();
        }
    }

    public e67(r57<T> r57Var, long j, TimeUnit timeUnit, xv9 xv9Var, boolean z) {
        super(r57Var);
        this.b = j;
        this.c = timeUnit;
        this.d = xv9Var;
        this.e = z;
    }

    @Override // defpackage.r57
    protected void r(h67<? super T> h67Var) {
        this.a.a(new a(h67Var, this.b, this.c, this.d.b(), this.e));
    }
}
