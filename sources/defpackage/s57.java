package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ObservableCombineLatest.java */
/* renamed from: s57  reason: default package */
/* loaded from: classes3.dex */
public final class s57<T, R> extends r57<R> {
    final c67<? extends T>[] a;
    final Iterable<? extends c67<? extends T>> b;
    final z84<? super Object[], ? extends R> c;
    final int d;
    final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableCombineLatest.java */
    /* renamed from: s57$a */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends AtomicReference<z33> implements h67<T> {
        final b<T, R> a;
        final int b;

        a(b<T, R> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public void a() {
            g43.k(this);
        }

        @Override // defpackage.h67
        public void b() {
            this.a.e(this.b);
        }

        @Override // defpackage.h67
        public void c(z33 z33Var) {
            g43.w(this, z33Var);
        }

        @Override // defpackage.h67
        public void d(T t) {
            this.a.j(this.b, t);
        }

        @Override // defpackage.h67
        public void onError(Throwable th) {
            this.a.f(this.b, th);
        }
    }

    /* compiled from: ObservableCombineLatest.java */
    /* renamed from: s57$b */
    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements z33 {
        final h67<? super R> a;
        final z84<? super Object[], ? extends R> b;
        final a<T, R>[] c;
        Object[] d;
        final nsa<Object[]> e;
        final boolean f;
        volatile boolean g;
        volatile boolean h;
        final wy i = new wy();
        int j;
        int k;

        b(h67<? super R> h67Var, z84<? super Object[], ? extends R> z84Var, int i, int i2, boolean z) {
            this.a = h67Var;
            this.b = z84Var;
            this.f = z;
            this.d = new Object[i];
            a<T, R>[] aVarArr = new a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new a<>(this, i3);
            }
            this.c = aVarArr;
            this.e = new nsa<>(i2);
        }

        @Override // defpackage.z33
        public void a() {
            if (!this.g) {
                this.g = true;
                b();
                if (getAndIncrement() == 0) {
                    c(this.e);
                }
            }
        }

        void b() {
            for (a<T, R> aVar : this.c) {
                aVar.a();
            }
        }

        void c(nsa<?> nsaVar) {
            synchronized (this) {
                this.d = null;
            }
            nsaVar.clear();
        }

        void d() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            nsa<Object[]> nsaVar = this.e;
            h67<? super R> h67Var = this.a;
            boolean z2 = this.f;
            int i = 1;
            while (!this.g) {
                if (!z2 && this.i.get() != null) {
                    b();
                    c(nsaVar);
                    h67Var.onError(this.i.b());
                    return;
                }
                boolean z3 = this.h;
                Object[] poll = nsaVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z3 && z) {
                    c(nsaVar);
                    Throwable b = this.i.b();
                    if (b == null) {
                        h67Var.b();
                        return;
                    } else {
                        h67Var.onError(b);
                        return;
                    }
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        h67Var.d((Object) x47.e(this.b.apply(poll), "The combiner returned a null value"));
                    } catch (Throwable th) {
                        rl3.b(th);
                        this.i.a(th);
                        b();
                        c(nsaVar);
                        h67Var.onError(this.i.b());
                        return;
                    }
                }
            }
            c(nsaVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
            if (r2 == r0.length) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.d     // Catch: java.lang.Throwable -> L7
                if (r0 != 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r4 = move-exception
                goto L27
            L9:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L7
                r1 = 1
                if (r4 != 0) goto L10
                r4 = 1
                goto L11
            L10:
                r4 = 0
            L11:
                if (r4 != 0) goto L1b
                int r2 = r3.k     // Catch: java.lang.Throwable -> L7
                int r2 = r2 + r1
                r3.k = r2     // Catch: java.lang.Throwable -> L7
                int r0 = r0.length     // Catch: java.lang.Throwable -> L7
                if (r2 != r0) goto L1d
            L1b:
                r3.h = r1     // Catch: java.lang.Throwable -> L7
            L1d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                if (r4 == 0) goto L23
                r3.b()
            L23:
                r3.d()
                return
            L27:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.s57.b.e(int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
            if (r1 == r4.length) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void f(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                wy r0 = r2.i
                boolean r0 = r0.a(r4)
                if (r0 == 0) goto L36
                boolean r4 = r2.f
                if (r4 == 0) goto L2f
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.d     // Catch: java.lang.Throwable -> L13
                if (r4 != 0) goto L15
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
                return
            L13:
                r3 = move-exception
                goto L2d
            L15:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L13
                r0 = 1
                if (r3 != 0) goto L1c
                r3 = 1
                goto L1d
            L1c:
                r3 = 0
            L1d:
                if (r3 != 0) goto L27
                int r1 = r2.k     // Catch: java.lang.Throwable -> L13
                int r1 = r1 + r0
                r2.k = r1     // Catch: java.lang.Throwable -> L13
                int r4 = r4.length     // Catch: java.lang.Throwable -> L13
                if (r1 != r4) goto L29
            L27:
                r2.h = r0     // Catch: java.lang.Throwable -> L13
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
                if (r3 == 0) goto L32
                goto L2f
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
                throw r3
            L2f:
                r2.b()
            L32:
                r2.d()
                goto L39
            L36:
                defpackage.tp9.q(r4)
            L39:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.s57.b.f(int, java.lang.Throwable):void");
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void j(int i, T t) {
            boolean z;
            synchronized (this) {
                try {
                    Object[] objArr = this.d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i];
                    int i2 = this.j;
                    if (obj == null) {
                        i2++;
                        this.j = i2;
                    }
                    objArr[i] = t;
                    if (i2 == objArr.length) {
                        this.e.offer(objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void k(c67<? extends T>[] c67VarArr) {
            a<T, R>[] aVarArr = this.c;
            int length = aVarArr.length;
            this.a.c(this);
            for (int i = 0; i < length && !this.h && !this.g; i++) {
                c67VarArr[i].a(aVarArr[i]);
            }
        }
    }

    public s57(c67<? extends T>[] c67VarArr, Iterable<? extends c67<? extends T>> iterable, z84<? super Object[], ? extends R> z84Var, int i, boolean z) {
        this.a = c67VarArr;
        this.b = iterable;
        this.c = z84Var;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.r57
    public void r(h67<? super R> h67Var) {
        int length;
        c67<? extends T>[] c67VarArr = this.a;
        if (c67VarArr == null) {
            c67VarArr = new c67[8];
            length = 0;
            for (c67<? extends T> c67Var : this.b) {
                if (length == c67VarArr.length) {
                    c67<? extends T>[] c67VarArr2 = new c67[(length >> 2) + length];
                    System.arraycopy(c67VarArr, 0, c67VarArr2, 0, length);
                    c67VarArr = c67VarArr2;
                }
                c67VarArr[length] = c67Var;
                length++;
            }
        } else {
            length = c67VarArr.length;
        }
        int i = length;
        if (i == 0) {
            ig3.o(h67Var);
        } else {
            new b(h67Var, this.c, i, this.d, this.e).k(c67VarArr);
        }
    }
}
