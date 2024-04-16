package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: MaybeObserveOn.java */
/* renamed from: va6  reason: default package */
/* loaded from: classes3.dex */
public final class va6<T> extends t1<T, T> {
    final xv9 b;

    /* compiled from: MaybeObserveOn.java */
    /* renamed from: va6$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<z33> implements wa6<T>, z33, Runnable {
        final wa6<? super T> a;
        final xv9 b;
        T c;
        Throwable d;

        a(wa6<? super T> wa6Var, xv9 xv9Var) {
            this.a = wa6Var;
            this.b = xv9Var;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
        }

        @Override // defpackage.wa6
        public void b() {
            g43.q(this, this.b.d(this));
        }

        @Override // defpackage.wa6
        public void c(z33 z33Var) {
            if (g43.w(this, z33Var)) {
                this.a.c(this);
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            return g43.o(get());
        }

        @Override // defpackage.wa6
        public void onError(Throwable th) {
            this.d = th;
            g43.q(this, this.b.d(this));
        }

        @Override // defpackage.wa6
        public void onSuccess(T t) {
            this.c = t;
            g43.q(this, this.b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.d;
            if (th != null) {
                this.d = null;
                this.a.onError(th);
                return;
            }
            T t = this.c;
            if (t != null) {
                this.c = null;
                this.a.onSuccess(t);
                return;
            }
            this.a.b();
        }
    }

    public va6(xa6<T> xa6Var, xv9 xv9Var) {
        super(xa6Var);
        this.b = xv9Var;
    }

    @Override // defpackage.sa6
    protected void f(wa6<? super T> wa6Var) {
        this.a.a(new a(wa6Var, this.b));
    }
}
