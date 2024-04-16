package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ObservableSubscribeOn.java */
/* renamed from: d67  reason: default package */
/* loaded from: classes3.dex */
public final class d67<T> extends z1<T, T> {
    final xv9 b;

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: d67$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<z33> implements h67<T>, z33 {
        final h67<? super T> a;
        final AtomicReference<z33> b = new AtomicReference<>();

        a(h67<? super T> h67Var) {
            this.a = h67Var;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this.b);
            g43.k(this);
        }

        @Override // defpackage.h67
        public void b() {
            this.a.b();
        }

        @Override // defpackage.h67
        public void c(z33 z33Var) {
            g43.w(this.b, z33Var);
        }

        @Override // defpackage.h67
        public void d(T t) {
            this.a.d(t);
        }

        void e(z33 z33Var) {
            g43.w(this, z33Var);
        }

        @Override // defpackage.z33
        public boolean i() {
            return g43.o(get());
        }

        @Override // defpackage.h67
        public void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: d67$b */
    /* loaded from: classes3.dex */
    final class b implements Runnable {
        private final a<T> a;

        b(a<T> aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d67.this.a.a(this.a);
        }
    }

    public d67(c67<T> c67Var, xv9 xv9Var) {
        super(c67Var);
        this.b = xv9Var;
    }

    @Override // defpackage.r57
    public void r(h67<? super T> h67Var) {
        a aVar = new a(h67Var);
        h67Var.c(aVar);
        aVar.e(this.b.d(new b(aVar)));
    }
}
