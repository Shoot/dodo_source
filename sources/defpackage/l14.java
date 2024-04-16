package defpackage;

import defpackage.xv9;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableSubscribeOn.java */
/* renamed from: l14  reason: default package */
/* loaded from: classes3.dex */
public final class l14<T> extends j1<T, T> {
    final xv9 d;
    final boolean e;

    /* compiled from: FlowableSubscribeOn.java */
    /* renamed from: l14$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<Thread> implements m14<T>, k1b, Runnable {
        final i1b<? super T> a;
        final xv9.c b;
        final AtomicReference<k1b> c = new AtomicReference<>();
        final AtomicLong d = new AtomicLong();
        final boolean e;
        ls8<T> f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FlowableSubscribeOn.java */
        /* renamed from: l14$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class RunnableC0421a implements Runnable {
            final k1b a;
            final long b;

            RunnableC0421a(k1b k1bVar, long j) {
                this.a = k1bVar;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.w(this.b);
            }
        }

        a(i1b<? super T> i1bVar, xv9.c cVar, ls8<T> ls8Var, boolean z) {
            this.a = i1bVar;
            this.b = cVar;
            this.f = ls8Var;
            this.e = !z;
        }

        void a(long j, k1b k1bVar) {
            if (!this.e && Thread.currentThread() != get()) {
                this.b.c(new RunnableC0421a(k1bVar, j));
            } else {
                k1bVar.w(j);
            }
        }

        @Override // defpackage.i1b
        public void b() {
            this.a.b();
            this.b.a();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.s(this.c, k1bVar)) {
                long andSet = this.d.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, k1bVar);
                }
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            n1b.a(this.c);
            this.b.a();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            this.a.d(t);
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            this.a.onError(th);
            this.b.a();
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            ls8<T> ls8Var = this.f;
            this.f = null;
            ls8Var.a(this);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                k1b k1bVar = this.c.get();
                if (k1bVar != null) {
                    a(j, k1bVar);
                    return;
                }
                g60.a(this.d, j);
                k1b k1bVar2 = this.c.get();
                if (k1bVar2 != null) {
                    long andSet = this.d.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, k1bVar2);
                    }
                }
            }
        }
    }

    public l14(l04<T> l04Var, xv9 xv9Var, boolean z) {
        super(l04Var);
        this.d = xv9Var;
        this.e = z;
    }

    @Override // defpackage.l04
    public void S(i1b<? super T> i1bVar) {
        xv9.c b = this.d.b();
        a aVar = new a(i1bVar, b, this.c, this.e);
        i1bVar.c(aVar);
        b.c(aVar);
    }
}
