package defpackage;

import defpackage.xv9;
import java.util.concurrent.TimeUnit;
/* compiled from: FlowableDelay.java */
/* renamed from: p04  reason: default package */
/* loaded from: classes3.dex */
public final class p04<T> extends j1<T, T> {
    final long d;
    final TimeUnit e;
    final xv9 f;
    final boolean g;

    /* compiled from: FlowableDelay.java */
    /* renamed from: p04$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements m14<T>, k1b {
        final i1b<? super T> a;
        final long b;
        final TimeUnit c;
        final xv9.c d;
        final boolean e;
        k1b f;

        /* compiled from: FlowableDelay.java */
        /* renamed from: p04$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0474a implements Runnable {
            RunnableC0474a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.a.b();
                } finally {
                    a.this.d.a();
                }
            }
        }

        /* compiled from: FlowableDelay.java */
        /* renamed from: p04$a$b */
        /* loaded from: classes3.dex */
        final class b implements Runnable {
            private final Throwable a;

            b(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.a.onError(this.a);
                } finally {
                    a.this.d.a();
                }
            }
        }

        /* compiled from: FlowableDelay.java */
        /* renamed from: p04$a$c */
        /* loaded from: classes3.dex */
        final class c implements Runnable {
            private final T a;

            c(T t) {
                this.a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.d((T) this.a);
            }
        }

        a(i1b<? super T> i1bVar, long j, TimeUnit timeUnit, xv9.c cVar, boolean z) {
            this.a = i1bVar;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
            this.e = z;
        }

        @Override // defpackage.i1b
        public void b() {
            this.d.d(new RunnableC0474a(), this.b, this.c);
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.f, k1bVar)) {
                this.f = k1bVar;
                this.a.c(this);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            this.f.cancel();
            this.d.a();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            this.d.d(new c(t), this.b, this.c);
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            long j;
            xv9.c cVar = this.d;
            b bVar = new b(th);
            if (this.e) {
                j = this.b;
            } else {
                j = 0;
            }
            cVar.d(bVar, j, this.c);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            this.f.w(j);
        }
    }

    public p04(l04<T> l04Var, long j, TimeUnit timeUnit, xv9 xv9Var, boolean z) {
        super(l04Var);
        this.d = j;
        this.e = timeUnit;
        this.f = xv9Var;
        this.g = z;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        wca wcaVar;
        if (this.g) {
            wcaVar = i1bVar;
        } else {
            wcaVar = new wca(i1bVar);
        }
        this.c.R(new a(wcaVar, this.d, this.e, this.f.b(), this.g));
    }
}
