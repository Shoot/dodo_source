package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: FlowableUnsubscribeOn.java */
/* renamed from: s14  reason: default package */
/* loaded from: classes3.dex */
public final class s14<T> extends j1<T, T> {
    final xv9 d;

    /* compiled from: FlowableUnsubscribeOn.java */
    /* renamed from: s14$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicBoolean implements m14<T>, k1b {
        final i1b<? super T> a;
        final xv9 b;
        k1b c;

        /* compiled from: FlowableUnsubscribeOn.java */
        /* renamed from: s14$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0644a implements Runnable {
            RunnableC0644a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c.cancel();
            }
        }

        a(i1b<? super T> i1bVar, xv9 xv9Var) {
            this.a = i1bVar;
            this.b = xv9Var;
        }

        @Override // defpackage.i1b
        public void b() {
            if (!get()) {
                this.a.b();
            }
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.c, k1bVar)) {
                this.c = k1bVar;
                this.a.c(this);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.b.d(new RunnableC0644a());
            }
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (!get()) {
                this.a.d(t);
            }
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            if (get()) {
                tp9.q(th);
            } else {
                this.a.onError(th);
            }
        }

        @Override // defpackage.k1b
        public void w(long j) {
            this.c.w(j);
        }
    }

    public s14(l04<T> l04Var, xv9 xv9Var) {
        super(l04Var);
        this.d = xv9Var;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        this.c.R(new a(i1bVar, this.d));
    }
}
