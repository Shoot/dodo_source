package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: FlowableTimeInterval.java */
/* renamed from: q14  reason: default package */
/* loaded from: classes3.dex */
public final class q14<T> extends j1<T, wgb<T>> {
    final xv9 d;
    final TimeUnit e;

    /* compiled from: FlowableTimeInterval.java */
    /* renamed from: q14$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements m14<T>, k1b {
        final i1b<? super wgb<T>> a;
        final TimeUnit b;
        final xv9 c;
        k1b d;
        long e;

        a(i1b<? super wgb<T>> i1bVar, TimeUnit timeUnit, xv9 xv9Var) {
            this.a = i1bVar;
            this.c = xv9Var;
            this.b = timeUnit;
        }

        @Override // defpackage.i1b
        public void b() {
            this.a.b();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.d, k1bVar)) {
                this.e = this.c.c(this.b);
                this.d = k1bVar;
                this.a.c(this);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            this.d.cancel();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            long c = this.c.c(this.b);
            long j = this.e;
            this.e = c;
            this.a.d(new wgb(t, c - j, this.b));
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            this.d.w(j);
        }
    }

    public q14(l04<T> l04Var, TimeUnit timeUnit, xv9 xv9Var) {
        super(l04Var);
        this.d = xv9Var;
        this.e = timeUnit;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super wgb<T>> i1bVar) {
        this.c.R(new a(i1bVar, this.e, this.d));
    }
}
