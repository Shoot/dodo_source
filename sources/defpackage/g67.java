package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ObservableUnsubscribeOn.java */
/* renamed from: g67  reason: default package */
/* loaded from: classes3.dex */
public final class g67<T> extends z1<T, T> {
    final xv9 b;

    /* compiled from: ObservableUnsubscribeOn.java */
    /* renamed from: g67$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicBoolean implements h67<T>, z33 {
        final h67<? super T> a;
        final xv9 b;
        z33 c;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: g67$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0321a implements Runnable {
            RunnableC0321a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c.a();
            }
        }

        a(h67<? super T> h67Var, xv9 xv9Var) {
            this.a = h67Var;
            this.b = xv9Var;
        }

        @Override // defpackage.z33
        public void a() {
            if (compareAndSet(false, true)) {
                this.b.d(new RunnableC0321a());
            }
        }

        @Override // defpackage.h67
        public void b() {
            if (!get()) {
                this.a.b();
            }
        }

        @Override // defpackage.h67
        public void c(z33 z33Var) {
            if (g43.E(this.c, z33Var)) {
                this.c = z33Var;
                this.a.c(this);
            }
        }

        @Override // defpackage.h67
        public void d(T t) {
            if (!get()) {
                this.a.d(t);
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            return get();
        }

        @Override // defpackage.h67
        public void onError(Throwable th) {
            if (get()) {
                tp9.q(th);
            } else {
                this.a.onError(th);
            }
        }
    }

    public g67(c67<T> c67Var, xv9 xv9Var) {
        super(c67Var);
        this.b = xv9Var;
    }

    @Override // defpackage.r57
    public void r(h67<? super T> h67Var) {
        this.a.a(new a(h67Var, this.b));
    }
}
