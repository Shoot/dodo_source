package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SingleSubscribeOn.java */
/* renamed from: uma  reason: default package */
/* loaded from: classes3.dex */
public final class uma<T> extends bma<T> {
    final tma<? extends T> a;
    final xv9 b;

    /* compiled from: SingleSubscribeOn.java */
    /* renamed from: uma$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<z33> implements kma<T>, z33, Runnable {
        final kma<? super T> a;
        final eca b = new eca();
        final tma<? extends T> c;

        a(kma<? super T> kmaVar, tma<? extends T> tmaVar) {
            this.a = kmaVar;
            this.c = tmaVar;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
            this.b.a();
        }

        @Override // defpackage.kma
        public void c(z33 z33Var) {
            g43.w(this, z33Var);
        }

        @Override // defpackage.z33
        public boolean i() {
            return g43.o(get());
        }

        @Override // defpackage.kma
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.kma
        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this);
        }
    }

    public uma(tma<? extends T> tmaVar, xv9 xv9Var) {
        this.a = tmaVar;
        this.b = xv9Var;
    }

    @Override // defpackage.bma
    protected void j(kma<? super T> kmaVar) {
        a aVar = new a(kmaVar, this.a);
        kmaVar.c(aVar);
        aVar.b.b(this.b.d(aVar));
    }
}
