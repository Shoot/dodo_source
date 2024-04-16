package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableFlatMap.java */
/* renamed from: w04  reason: default package */
/* loaded from: classes3.dex */
public final class w04<T, U> extends j1<T, U> {
    final z84<? super T, ? extends ls8<? extends U>> d;
    final boolean e;
    final int f;
    final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFlatMap.java */
    /* renamed from: w04$a */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicReference<k1b> implements m14<U>, z33 {
        final long a;
        final b<T, U> b;
        final int c;
        final int d;
        volatile boolean e;
        volatile rla<U> f;
        long g;
        int h;

        a(b<T, U> bVar, long j) {
            this.a = j;
            this.b = bVar;
            int i = bVar.e;
            this.d = i;
            this.c = i >> 2;
        }

        @Override // defpackage.z33
        public void a() {
            n1b.a(this);
        }

        @Override // defpackage.i1b
        public void b() {
            this.e = true;
            this.b.k();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.s(this, k1bVar)) {
                if (k1bVar instanceof dv8) {
                    dv8 dv8Var = (dv8) k1bVar;
                    int k = dv8Var.k(7);
                    if (k == 1) {
                        this.h = k;
                        this.f = dv8Var;
                        this.e = true;
                        this.b.k();
                        return;
                    } else if (k == 2) {
                        this.h = k;
                        this.f = dv8Var;
                    }
                }
                k1bVar.w(this.d);
            }
        }

        @Override // defpackage.i1b
        public void d(U u) {
            if (this.h != 2) {
                this.b.r(u, this);
            } else {
                this.b.k();
            }
        }

        void e(long j) {
            if (this.h != 1) {
                long j2 = this.g + j;
                if (j2 >= this.c) {
                    this.g = 0L;
                    get().w(j2);
                    return;
                }
                this.g = j2;
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            if (get() == n1b.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            lazySet(n1b.CANCELLED);
            this.b.o(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFlatMap.java */
    /* renamed from: w04$b */
    /* loaded from: classes3.dex */
    public static final class b<T, U> extends AtomicInteger implements m14<T>, k1b {
        static final a<?, ?>[] r = new a[0];
        static final a<?, ?>[] s = new a[0];
        final i1b<? super U> a;
        final z84<? super T, ? extends ls8<? extends U>> b;
        final boolean c;
        final int d;
        final int e;
        volatile pla<U> f;
        volatile boolean g;
        final wy h = new wy();
        volatile boolean i;
        final AtomicReference<a<?, ?>[]> j;
        final AtomicLong k;
        k1b l;
        long m;
        long n;
        int o;
        int p;
        final int q;

        b(i1b<? super U> i1bVar, z84<? super T, ? extends ls8<? extends U>> z84Var, boolean z, int i, int i2) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.j = atomicReference;
            this.k = new AtomicLong();
            this.a = i1bVar;
            this.b = z84Var;
            this.c = z;
            this.d = i;
            this.e = i2;
            this.q = Math.max(1, i >> 1);
            atomicReference.lazySet(r);
        }

        boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.j.get();
                if (aVarArr == s) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!ho1.a(this.j, aVarArr, aVarArr2));
            return true;
        }

        @Override // defpackage.i1b
        public void b() {
            if (this.g) {
                return;
            }
            this.g = true;
            k();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.l, k1bVar)) {
                this.l = k1bVar;
                this.a.c(this);
                if (!this.i) {
                    int i = this.d;
                    if (i == Integer.MAX_VALUE) {
                        k1bVar.w(Long.MAX_VALUE);
                    } else {
                        k1bVar.w(i);
                    }
                }
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            pla<U> plaVar;
            if (!this.i) {
                this.i = true;
                this.l.cancel();
                j();
                if (getAndIncrement() == 0 && (plaVar = this.f) != null) {
                    plaVar.clear();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.i1b
        public void d(T t) {
            if (this.g) {
                return;
            }
            try {
                ls8 ls8Var = (ls8) x47.e(this.b.apply(t), "The mapper returned a null Publisher");
                if (ls8Var instanceof Callable) {
                    try {
                        Object call = ((Callable) ls8Var).call();
                        if (call != null) {
                            s(call);
                            return;
                        } else if (this.d != Integer.MAX_VALUE && !this.i) {
                            int i = this.p + 1;
                            this.p = i;
                            int i2 = this.q;
                            if (i == i2) {
                                this.p = 0;
                                this.l.w(i2);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        this.h.a(th);
                        k();
                        return;
                    }
                }
                long j = this.m;
                this.m = 1 + j;
                a aVar = new a(this, j);
                if (a(aVar)) {
                    ls8Var.a(aVar);
                }
            } catch (Throwable th2) {
                rl3.b(th2);
                this.l.cancel();
                onError(th2);
            }
        }

        boolean e() {
            if (this.i) {
                i();
                return true;
            } else if (!this.c && this.h.get() != null) {
                i();
                Throwable b = this.h.b();
                if (b != pl3.a) {
                    this.a.onError(b);
                }
                return true;
            } else {
                return false;
            }
        }

        void i() {
            pla<U> plaVar = this.f;
            if (plaVar != null) {
                plaVar.clear();
            }
        }

        void j() {
            a<?, ?>[] andSet;
            a<?, ?>[] aVarArr = this.j.get();
            a<?, ?>[] aVarArr2 = s;
            if (aVarArr != aVarArr2 && (andSet = this.j.getAndSet(aVarArr2)) != aVarArr2) {
                for (a<?, ?> aVar : andSet) {
                    aVar.a();
                }
                Throwable b = this.h.b();
                if (b != null && b != pl3.a) {
                    tp9.q(b);
                }
            }
        }

        void k() {
            if (getAndIncrement() == 0) {
                l();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x0191, code lost:
            r24.o = r3;
            r24.n = r13[r3].a;
            r3 = r16;
            r5 = 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void l() {
            /*
                Method dump skipped, instructions count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.w04.b.l():void");
        }

        rla<U> m(a<T, U> aVar) {
            rla<U> rlaVar = aVar.f;
            if (rlaVar == null) {
                msa msaVar = new msa(this.e);
                aVar.f = msaVar;
                return msaVar;
            }
            return rlaVar;
        }

        rla<U> n() {
            pla<U> plaVar = this.f;
            if (plaVar == null) {
                if (this.d == Integer.MAX_VALUE) {
                    plaVar = new nsa<>(this.e);
                } else {
                    plaVar = new msa<>(this.d);
                }
                this.f = plaVar;
            }
            return plaVar;
        }

        void o(a<T, U> aVar, Throwable th) {
            if (this.h.a(th)) {
                aVar.e = true;
                if (!this.c) {
                    this.l.cancel();
                    for (a<?, ?> aVar2 : this.j.getAndSet(s)) {
                        aVar2.a();
                    }
                }
                k();
                return;
            }
            tp9.q(th);
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            if (this.g) {
                tp9.q(th);
            } else if (this.h.a(th)) {
                this.g = true;
                if (!this.c) {
                    for (a<?, ?> aVar : this.j.getAndSet(s)) {
                        aVar.a();
                    }
                }
                k();
            } else {
                tp9.q(th);
            }
        }

        void q(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (aVarArr[i] == aVar) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = r;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!ho1.a(this.j, aVarArr, aVarArr2));
        }

        void r(U u, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.k.get();
                rla<U> rlaVar = aVar.f;
                if (j != 0 && (rlaVar == null || rlaVar.isEmpty())) {
                    this.a.d(u);
                    if (j != Long.MAX_VALUE) {
                        this.k.decrementAndGet();
                    }
                    aVar.e(1L);
                } else {
                    if (rlaVar == null) {
                        rlaVar = m(aVar);
                    }
                    if (!rlaVar.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                rla rlaVar2 = aVar.f;
                if (rlaVar2 == null) {
                    rlaVar2 = new msa(this.e);
                    aVar.f = rlaVar2;
                }
                if (!rlaVar2.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            l();
        }

        void s(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.k.get();
                rla<U> rlaVar = this.f;
                if (j != 0 && (rlaVar == null || rlaVar.isEmpty())) {
                    this.a.d(u);
                    if (j != Long.MAX_VALUE) {
                        this.k.decrementAndGet();
                    }
                    if (this.d != Integer.MAX_VALUE && !this.i) {
                        int i = this.p + 1;
                        this.p = i;
                        int i2 = this.q;
                        if (i == i2) {
                            this.p = 0;
                            this.l.w(i2);
                        }
                    }
                } else {
                    if (rlaVar == null) {
                        rlaVar = n();
                    }
                    if (!rlaVar.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!n().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            l();
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.a(this.k, j);
                k();
            }
        }
    }

    public w04(l04<T> l04Var, z84<? super T, ? extends ls8<? extends U>> z84Var, boolean z, int i, int i2) {
        super(l04Var);
        this.d = z84Var;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public static <T, U> m14<T> c0(i1b<? super U> i1bVar, z84<? super T, ? extends ls8<? extends U>> z84Var, boolean z, int i, int i2) {
        return new b(i1bVar, z84Var, z, i, i2);
    }

    @Override // defpackage.l04
    protected void S(i1b<? super U> i1bVar) {
        if (k14.b(this.c, i1bVar, this.d)) {
            return;
        }
        this.c.R(c0(i1bVar, this.d, this.e, this.f, this.g));
    }
}
