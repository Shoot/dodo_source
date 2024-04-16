package defpackage;

import defpackage.xv9;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableDebounceTimed.java */
/* renamed from: o04  reason: default package */
/* loaded from: classes3.dex */
public final class o04<T> extends j1<T, T> {
    final long d;
    final TimeUnit e;
    final xv9 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableDebounceTimed.java */
    /* renamed from: o04$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<z33> implements Runnable, z33 {
        final T a;
        final long b;
        final b<T> c;
        final AtomicBoolean d = new AtomicBoolean();

        a(T t, long j, b<T> bVar) {
            this.a = t;
            this.b = j;
            this.c = bVar;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
        }

        void b() {
            if (this.d.compareAndSet(false, true)) {
                this.c.a(this.b, this.a, this);
            }
        }

        public void c(z33 z33Var) {
            g43.q(this, z33Var);
        }

        @Override // defpackage.z33
        public boolean i() {
            if (get() == g43.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableDebounceTimed.java */
    /* renamed from: o04$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicLong implements m14<T>, k1b {
        final i1b<? super T> a;
        final long b;
        final TimeUnit c;
        final xv9.c d;
        k1b e;
        z33 f;
        volatile long g;
        boolean h;

        b(i1b<? super T> i1bVar, long j, TimeUnit timeUnit, xv9.c cVar) {
            this.a = i1bVar;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        void a(long j, T t, a<T> aVar) {
            if (j == this.g) {
                if (get() != 0) {
                    this.a.d(t);
                    g60.d(this, 1L);
                    aVar.a();
                    return;
                }
                cancel();
                this.a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            }
        }

        @Override // defpackage.i1b
        public void b() {
            if (this.h) {
                return;
            }
            this.h = true;
            z33 z33Var = this.f;
            if (z33Var != null) {
                z33Var.a();
            }
            a aVar = (a) z33Var;
            if (aVar != null) {
                aVar.b();
            }
            this.a.b();
            this.d.a();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.e, k1bVar)) {
                this.e = k1bVar;
                this.a.c(this);
                k1bVar.w(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            this.e.cancel();
            this.d.a();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.h) {
                return;
            }
            long j = this.g + 1;
            this.g = j;
            z33 z33Var = this.f;
            if (z33Var != null) {
                z33Var.a();
            }
            a aVar = new a(t, j, this);
            this.f = aVar;
            aVar.c(this.d.d(aVar, this.b, this.c));
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            if (this.h) {
                tp9.q(th);
                return;
            }
            this.h = true;
            z33 z33Var = this.f;
            if (z33Var != null) {
                z33Var.a();
            }
            this.a.onError(th);
            this.d.a();
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.a(this, j);
            }
        }
    }

    public o04(l04<T> l04Var, long j, TimeUnit timeUnit, xv9 xv9Var) {
        super(l04Var);
        this.d = j;
        this.e = timeUnit;
        this.f = xv9Var;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        this.c.R(new b(new wca(i1bVar), this.d, this.e, this.f.b()));
    }
}
