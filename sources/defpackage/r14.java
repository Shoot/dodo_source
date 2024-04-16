package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableTimer.java */
/* renamed from: r14  reason: default package */
/* loaded from: classes3.dex */
public final class r14 extends l04<Long> {
    final xv9 c;
    final long d;
    final TimeUnit e;

    /* compiled from: FlowableTimer.java */
    /* renamed from: r14$a */
    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<z33> implements k1b, Runnable {
        final i1b<? super Long> a;
        volatile boolean b;

        a(i1b<? super Long> i1bVar) {
            this.a = i1bVar;
        }

        public void a(z33 z33Var) {
            g43.x(this, z33Var);
        }

        @Override // defpackage.k1b
        public void cancel() {
            g43.k(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != g43.DISPOSED) {
                if (this.b) {
                    this.a.d(0L);
                    lazySet(ig3.INSTANCE);
                    this.a.b();
                    return;
                }
                lazySet(ig3.INSTANCE);
                this.a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
            }
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                this.b = true;
            }
        }
    }

    public r14(long j, TimeUnit timeUnit, xv9 xv9Var) {
        this.d = j;
        this.e = timeUnit;
        this.c = xv9Var;
    }

    @Override // defpackage.l04
    public void S(i1b<? super Long> i1bVar) {
        a aVar = new a(i1bVar);
        i1bVar.c(aVar);
        aVar.a(this.c.e(aVar, this.d, this.e));
    }
}
