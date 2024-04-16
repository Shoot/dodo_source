package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: FlowableOnBackpressureDrop.java */
/* renamed from: g14  reason: default package */
/* loaded from: classes3.dex */
public final class g14<T> extends j1<T, T> implements wr1<T> {
    final wr1<? super T> d;

    /* compiled from: FlowableOnBackpressureDrop.java */
    /* renamed from: g14$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements m14<T>, k1b {
        final i1b<? super T> a;
        final wr1<? super T> b;
        k1b c;
        boolean d;

        a(i1b<? super T> i1bVar, wr1<? super T> wr1Var) {
            this.a = i1bVar;
            this.b = wr1Var;
        }

        @Override // defpackage.i1b
        public void b() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.b();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.c, k1bVar)) {
                this.c = k1bVar;
                this.a.c(this);
                k1bVar.w(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            this.c.cancel();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.d) {
                return;
            }
            if (get() != 0) {
                this.a.d(t);
                g60.d(this, 1L);
                return;
            }
            try {
                this.b.accept(t);
            } catch (Throwable th) {
                rl3.b(th);
                cancel();
                onError(th);
            }
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            if (this.d) {
                tp9.q(th);
                return;
            }
            this.d = true;
            this.a.onError(th);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.a(this, j);
            }
        }
    }

    public g14(l04<T> l04Var) {
        super(l04Var);
        this.d = this;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        this.c.R(new a(i1bVar, this.d));
    }

    @Override // defpackage.wr1
    public void accept(T t) {
    }
}
