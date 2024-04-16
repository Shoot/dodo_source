package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableFlatMapMaybe.java */
/* renamed from: x04  reason: default package */
/* loaded from: classes3.dex */
public final class x04<T, R> extends j1<T, R> {
    final z84<? super T, ? extends xa6<? extends R>> d;
    final boolean e;
    final int f;

    /* compiled from: FlowableFlatMapMaybe.java */
    /* renamed from: x04$a */
    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements m14<T>, k1b {
        final i1b<? super R> a;
        final boolean b;
        final int c;
        final z84<? super T, ? extends xa6<? extends R>> h;
        k1b j;
        volatile boolean k;
        final AtomicLong d = new AtomicLong();
        final wn1 e = new wn1();
        final wy g = new wy();
        final AtomicInteger f = new AtomicInteger(1);
        final AtomicReference<nsa<R>> i = new AtomicReference<>();

        /* compiled from: FlowableFlatMapMaybe.java */
        /* renamed from: x04$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0733a extends AtomicReference<z33> implements wa6<R>, z33 {
            C0733a() {
            }

            @Override // defpackage.z33
            public void a() {
                g43.k(this);
            }

            @Override // defpackage.wa6
            public void b() {
                a.this.k(this);
            }

            @Override // defpackage.wa6
            public void c(z33 z33Var) {
                g43.w(this, z33Var);
            }

            @Override // defpackage.z33
            public boolean i() {
                return g43.o(get());
            }

            @Override // defpackage.wa6
            public void onError(Throwable th) {
                a.this.l(this, th);
            }

            @Override // defpackage.wa6
            public void onSuccess(R r) {
                a.this.m(this, r);
            }
        }

        a(i1b<? super R> i1bVar, z84<? super T, ? extends xa6<? extends R>> z84Var, boolean z, int i) {
            this.a = i1bVar;
            this.h = z84Var;
            this.b = z;
            this.c = i;
        }

        void a() {
            nsa<R> nsaVar = this.i.get();
            if (nsaVar != null) {
                nsaVar.clear();
            }
        }

        @Override // defpackage.i1b
        public void b() {
            this.f.decrementAndGet();
            e();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.j, k1bVar)) {
                this.j = k1bVar;
                this.a.c(this);
                int i = this.c;
                if (i == Integer.MAX_VALUE) {
                    k1bVar.w(Long.MAX_VALUE);
                } else {
                    k1bVar.w(i);
                }
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            this.k = true;
            this.j.cancel();
            this.e.a();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            try {
                xa6 xa6Var = (xa6) x47.e(this.h.apply(t), "The mapper returned a null MaybeSource");
                this.f.getAndIncrement();
                C0733a c0733a = new C0733a();
                if (!this.k && this.e.b(c0733a)) {
                    xa6Var.a(c0733a);
                }
            } catch (Throwable th) {
                rl3.b(th);
                this.j.cancel();
                onError(th);
            }
        }

        void e() {
            if (getAndIncrement() == 0) {
                i();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
            if (r13 != 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
            if (r17.k == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
            a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
            if (r17.b != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
            if (r17.g.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
            r2 = r17.g.b();
            a();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
            if (r2.get() != 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
            if (r7 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
            if (r7.isEmpty() == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
            if (r6 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
            if (r12 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
            r2 = r17.g.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
            r1.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
            if (r10 == 0) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
            defpackage.g60.d(r17.d, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
            if (r17.c == Integer.MAX_VALUE) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
            r17.j.w(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void i() {
            /*
                Method dump skipped, instructions count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.x04.a.i():void");
        }

        nsa<R> j() {
            nsa<R> nsaVar;
            do {
                nsa<R> nsaVar2 = this.i.get();
                if (nsaVar2 != null) {
                    return nsaVar2;
                }
                nsaVar = new nsa<>(l04.e());
            } while (!ho1.a(this.i, null, nsaVar));
            return nsaVar;
        }

        void k(a<T, R>.C0733a c0733a) {
            this.e.d(c0733a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f.decrementAndGet() == 0) {
                        z = true;
                    }
                    nsa<R> nsaVar = this.i.get();
                    if (z && (nsaVar == null || nsaVar.isEmpty())) {
                        Throwable b = this.g.b();
                        if (b != null) {
                            this.a.onError(b);
                            return;
                        } else {
                            this.a.b();
                            return;
                        }
                    }
                    if (this.c != Integer.MAX_VALUE) {
                        this.j.w(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    i();
                    return;
                }
            }
            this.f.decrementAndGet();
            if (this.c != Integer.MAX_VALUE) {
                this.j.w(1L);
            }
            e();
        }

        void l(a<T, R>.C0733a c0733a, Throwable th) {
            this.e.d(c0733a);
            if (this.g.a(th)) {
                if (!this.b) {
                    this.j.cancel();
                    this.e.a();
                } else if (this.c != Integer.MAX_VALUE) {
                    this.j.w(1L);
                }
                this.f.decrementAndGet();
                e();
                return;
            }
            tp9.q(th);
        }

        void m(a<T, R>.C0733a c0733a, R r) {
            this.e.d(c0733a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f.decrementAndGet() == 0) {
                        z = true;
                    }
                    if (this.d.get() != 0) {
                        this.a.d(r);
                        nsa<R> nsaVar = this.i.get();
                        if (z && (nsaVar == null || nsaVar.isEmpty())) {
                            Throwable b = this.g.b();
                            if (b != null) {
                                this.a.onError(b);
                                return;
                            } else {
                                this.a.b();
                                return;
                            }
                        }
                        g60.d(this.d, 1L);
                        if (this.c != Integer.MAX_VALUE) {
                            this.j.w(1L);
                        }
                    } else {
                        nsa<R> j = j();
                        synchronized (j) {
                            j.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    i();
                }
            }
            nsa<R> j2 = j();
            synchronized (j2) {
                j2.offer(r);
            }
            this.f.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            i();
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            this.f.decrementAndGet();
            if (this.g.a(th)) {
                if (!this.b) {
                    this.e.a();
                }
                e();
                return;
            }
            tp9.q(th);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.a(this.d, j);
                e();
            }
        }
    }

    public x04(l04<T> l04Var, z84<? super T, ? extends xa6<? extends R>> z84Var, boolean z, int i) {
        super(l04Var);
        this.d = z84Var;
        this.e = z;
        this.f = i;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super R> i1bVar) {
        this.c.R(new a(i1bVar, this.d, this.e, this.f));
    }
}
