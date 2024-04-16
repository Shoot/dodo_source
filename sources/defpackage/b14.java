package defpackage;

import defpackage.xv9;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableInterval.java */
/* renamed from: b14  reason: default package */
/* loaded from: classes3.dex */
public final class b14 extends l04<Long> {
    final xv9 c;
    final long d;
    final long e;
    final TimeUnit f;

    /* compiled from: FlowableInterval.java */
    /* renamed from: b14$a */
    /* loaded from: classes3.dex */
    static final class a extends AtomicLong implements k1b, Runnable {
        final i1b<? super Long> a;
        long b;
        final AtomicReference<z33> c = new AtomicReference<>();

        a(i1b<? super Long> i1bVar) {
            this.a = i1bVar;
        }

        public void a(z33 z33Var) {
            g43.w(this.c, z33Var);
        }

        @Override // defpackage.k1b
        public void cancel() {
            g43.k(this.c);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.get() != g43.DISPOSED) {
                if (get() != 0) {
                    i1b<? super Long> i1bVar = this.a;
                    long j = this.b;
                    this.b = j + 1;
                    i1bVar.d(Long.valueOf(j));
                    g60.d(this, 1L);
                    return;
                }
                i1b<? super Long> i1bVar2 = this.a;
                i1bVar2.onError(new MissingBackpressureException("Can't deliver value " + this.b + " due to lack of requests"));
                g43.k(this.c);
            }
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.a(this, j);
            }
        }
    }

    public b14(long j, long j2, TimeUnit timeUnit, xv9 xv9Var) {
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
        this.c = xv9Var;
    }

    @Override // defpackage.l04
    public void S(i1b<? super Long> i1bVar) {
        a aVar = new a(i1bVar);
        i1bVar.c(aVar);
        xv9 xv9Var = this.c;
        if (xv9Var instanceof ekb) {
            xv9.c b = xv9Var.b();
            aVar.a(b);
            b.e(aVar, this.d, this.e, this.f);
            return;
        }
        aVar.a(xv9Var.f(aVar, this.d, this.e, this.f));
    }
}
