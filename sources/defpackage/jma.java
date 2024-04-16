package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SingleObserveOn.java */
/* renamed from: jma  reason: default package */
/* loaded from: classes3.dex */
public final class jma<T> extends bma<T> {
    final tma<T> a;
    final xv9 b;

    /* compiled from: SingleObserveOn.java */
    /* renamed from: jma$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<z33> implements kma<T>, z33, Runnable {
        final kma<? super T> a;
        final xv9 b;
        T c;
        Throwable d;

        a(kma<? super T> kmaVar, xv9 xv9Var) {
            this.a = kmaVar;
            this.b = xv9Var;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
        }

        @Override // defpackage.kma
        public void c(z33 z33Var) {
            if (g43.w(this, z33Var)) {
                this.a.c(this);
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            return g43.o(get());
        }

        @Override // defpackage.kma
        public void onError(Throwable th) {
            this.d = th;
            g43.q(this, this.b.d(this));
        }

        @Override // defpackage.kma
        public void onSuccess(T t) {
            this.c = t;
            g43.q(this, this.b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.d;
            if (th != null) {
                this.a.onError(th);
            } else {
                this.a.onSuccess((T) this.c);
            }
        }
    }

    public jma(tma<T> tmaVar, xv9 xv9Var) {
        this.a = tmaVar;
        this.b = xv9Var;
    }

    @Override // defpackage.bma
    protected void j(kma<? super T> kmaVar) {
        this.a.a(new a(kmaVar, this.b));
    }
}
