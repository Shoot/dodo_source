package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: CompletableObserveOn.java */
/* renamed from: cl1  reason: default package */
/* loaded from: classes3.dex */
public final class cl1 extends sk1 {
    final el1 a;
    final xv9 b;

    /* compiled from: CompletableObserveOn.java */
    /* renamed from: cl1$a */
    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<z33> implements dl1, z33, Runnable {
        final dl1 a;
        final xv9 b;
        Throwable c;

        a(dl1 dl1Var, xv9 xv9Var) {
            this.a = dl1Var;
            this.b = xv9Var;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
        }

        @Override // defpackage.dl1
        public void b() {
            g43.q(this, this.b.d(this));
        }

        @Override // defpackage.dl1
        public void c(z33 z33Var) {
            if (g43.w(this, z33Var)) {
                this.a.c(this);
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            return g43.o(get());
        }

        @Override // defpackage.dl1
        public void onError(Throwable th) {
            this.c = th;
            g43.q(this, this.b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.c;
            if (th != null) {
                this.c = null;
                this.a.onError(th);
                return;
            }
            this.a.b();
        }
    }

    public cl1(el1 el1Var, xv9 xv9Var) {
        this.a = el1Var;
        this.b = xv9Var;
    }

    @Override // defpackage.sk1
    protected void f(dl1 dl1Var) {
        this.a.a(new a(dl1Var, this.b));
    }
}
