package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: CompletableSubscribeOn.java */
/* renamed from: fl1  reason: default package */
/* loaded from: classes3.dex */
public final class fl1 extends sk1 {
    final el1 a;
    final xv9 b;

    /* compiled from: CompletableSubscribeOn.java */
    /* renamed from: fl1$a */
    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<z33> implements dl1, z33, Runnable {
        final dl1 a;
        final eca b = new eca();
        final el1 c;

        a(dl1 dl1Var, el1 el1Var) {
            this.a = dl1Var;
            this.c = el1Var;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
            this.b.a();
        }

        @Override // defpackage.dl1
        public void b() {
            this.a.b();
        }

        @Override // defpackage.dl1
        public void c(z33 z33Var) {
            g43.w(this, z33Var);
        }

        @Override // defpackage.z33
        public boolean i() {
            return g43.o(get());
        }

        @Override // defpackage.dl1
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this);
        }
    }

    public fl1(el1 el1Var, xv9 xv9Var) {
        this.a = el1Var;
        this.b = xv9Var;
    }

    @Override // defpackage.sk1
    protected void f(dl1 dl1Var) {
        a aVar = new a(dl1Var, this.a);
        dl1Var.c(aVar);
        aVar.b.b(this.b.d(aVar));
    }
}
