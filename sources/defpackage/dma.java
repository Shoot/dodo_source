package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: SingleDelay.java */
/* renamed from: dma  reason: default package */
/* loaded from: classes3.dex */
public final class dma<T> extends bma<T> {
    final tma<? extends T> a;
    final long b;
    final TimeUnit c;
    final xv9 d;
    final boolean e;

    /* compiled from: SingleDelay.java */
    /* renamed from: dma$a */
    /* loaded from: classes3.dex */
    final class a implements kma<T> {
        private final eca a;
        final kma<? super T> b;

        /* compiled from: SingleDelay.java */
        /* renamed from: dma$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0287a implements Runnable {
            private final Throwable a;

            RunnableC0287a(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onError(this.a);
            }
        }

        /* compiled from: SingleDelay.java */
        /* renamed from: dma$a$b */
        /* loaded from: classes3.dex */
        final class b implements Runnable {
            private final T a;

            b(T t) {
                this.a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onSuccess((T) this.a);
            }
        }

        a(eca ecaVar, kma<? super T> kmaVar) {
            this.a = ecaVar;
            this.b = kmaVar;
        }

        @Override // defpackage.kma
        public void c(z33 z33Var) {
            this.a.b(z33Var);
        }

        @Override // defpackage.kma
        public void onError(Throwable th) {
            long j;
            eca ecaVar = this.a;
            xv9 xv9Var = dma.this.d;
            RunnableC0287a runnableC0287a = new RunnableC0287a(th);
            dma dmaVar = dma.this;
            if (dmaVar.e) {
                j = dmaVar.b;
            } else {
                j = 0;
            }
            ecaVar.b(xv9Var.e(runnableC0287a, j, dmaVar.c));
        }

        @Override // defpackage.kma
        public void onSuccess(T t) {
            eca ecaVar = this.a;
            xv9 xv9Var = dma.this.d;
            b bVar = new b(t);
            dma dmaVar = dma.this;
            ecaVar.b(xv9Var.e(bVar, dmaVar.b, dmaVar.c));
        }
    }

    public dma(tma<? extends T> tmaVar, long j, TimeUnit timeUnit, xv9 xv9Var, boolean z) {
        this.a = tmaVar;
        this.b = j;
        this.c = timeUnit;
        this.d = xv9Var;
        this.e = z;
    }

    @Override // defpackage.bma
    protected void j(kma<? super T> kmaVar) {
        eca ecaVar = new eca();
        kmaVar.c(ecaVar);
        this.a.a(new a(ecaVar, kmaVar));
    }
}
