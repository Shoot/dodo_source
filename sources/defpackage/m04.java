package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: FlowableConcatMap.java */
/* renamed from: m04  reason: default package */
/* loaded from: classes3.dex */
public final class m04<T, R> extends j1<T, R> {
    final z84<? super T, ? extends ls8<? extends R>> d;
    final int e;
    final jk3 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: m04$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jk3.values().length];
            a = iArr;
            try {
                iArr[jk3.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[jk3.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: m04$b */
    /* loaded from: classes3.dex */
    public static abstract class b<T, R> extends AtomicInteger implements m14<T>, f<R>, k1b {
        final z84<? super T, ? extends ls8<? extends R>> b;
        final int c;
        final int d;
        k1b e;
        int f;
        rla<T> g;
        volatile boolean h;
        volatile boolean i;
        volatile boolean k;
        int l;
        final e<R> a = new e<>(this);
        final wy j = new wy();

        b(z84<? super T, ? extends ls8<? extends R>> z84Var, int i) {
            this.b = z84Var;
            this.c = i;
            this.d = i - (i >> 2);
        }

        @Override // defpackage.m04.f
        public final void a() {
            this.k = false;
            j();
        }

        @Override // defpackage.i1b
        public final void b() {
            this.h = true;
            j();
        }

        @Override // defpackage.m14, defpackage.i1b
        public final void c(k1b k1bVar) {
            if (n1b.x(this.e, k1bVar)) {
                this.e = k1bVar;
                if (k1bVar instanceof dv8) {
                    dv8 dv8Var = (dv8) k1bVar;
                    int k = dv8Var.k(7);
                    if (k == 1) {
                        this.l = k;
                        this.g = dv8Var;
                        this.h = true;
                        k();
                        j();
                        return;
                    } else if (k == 2) {
                        this.l = k;
                        this.g = dv8Var;
                        k();
                        k1bVar.w(this.c);
                        return;
                    }
                }
                this.g = new msa(this.c);
                k();
                k1bVar.w(this.c);
            }
        }

        @Override // defpackage.i1b
        public final void d(T t) {
            if (this.l != 2 && !this.g.offer(t)) {
                this.e.cancel();
                onError(new IllegalStateException("Queue full?!"));
                return;
            }
            j();
        }

        abstract void j();

        abstract void k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: m04$c */
    /* loaded from: classes3.dex */
    public static final class c<T, R> extends b<T, R> {
        final i1b<? super R> m;
        final boolean n;

        c(i1b<? super R> i1bVar, z84<? super T, ? extends ls8<? extends R>> z84Var, int i, boolean z) {
            super(z84Var, i);
            this.m = i1bVar;
            this.n = z;
        }

        @Override // defpackage.k1b
        public void cancel() {
            if (!this.i) {
                this.i = true;
                this.a.cancel();
                this.e.cancel();
            }
        }

        @Override // defpackage.m04.f
        public void e(Throwable th) {
            if (this.j.a(th)) {
                if (!this.n) {
                    this.e.cancel();
                    this.h = true;
                }
                this.k = false;
                j();
                return;
            }
            tp9.q(th);
        }

        @Override // defpackage.m04.f
        public void i(R r) {
            this.m.d(r);
        }

        @Override // defpackage.m04.b
        void j() {
            boolean z;
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.k) {
                        boolean z2 = this.h;
                        if (z2 && !this.n && this.j.get() != null) {
                            this.m.onError(this.j.b());
                            return;
                        }
                        try {
                            T poll = this.g.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                Throwable b = this.j.b();
                                if (b != null) {
                                    this.m.onError(b);
                                    return;
                                } else {
                                    this.m.b();
                                    return;
                                }
                            } else if (!z) {
                                try {
                                    ls8 ls8Var = (ls8) x47.e(this.b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.l != 1) {
                                        int i = this.f + 1;
                                        if (i == this.d) {
                                            this.f = 0;
                                            this.e.w(i);
                                        } else {
                                            this.f = i;
                                        }
                                    }
                                    if (ls8Var instanceof Callable) {
                                        try {
                                            obj = ((Callable) ls8Var).call();
                                        } catch (Throwable th) {
                                            rl3.b(th);
                                            this.j.a(th);
                                            if (!this.n) {
                                                this.e.cancel();
                                                this.m.onError(this.j.b());
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.a.i()) {
                                            this.m.d(obj);
                                        } else {
                                            this.k = true;
                                            this.a.k(new g(obj, this.a));
                                        }
                                    } else {
                                        this.k = true;
                                        ls8Var.a(this.a);
                                    }
                                } catch (Throwable th2) {
                                    rl3.b(th2);
                                    this.e.cancel();
                                    this.j.a(th2);
                                    this.m.onError(this.j.b());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            rl3.b(th3);
                            this.e.cancel();
                            this.j.a(th3);
                            this.m.onError(this.j.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.m04.b
        void k() {
            this.m.c(this);
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            if (this.j.a(th)) {
                this.h = true;
                j();
                return;
            }
            tp9.q(th);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            this.a.w(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: m04$d */
    /* loaded from: classes3.dex */
    public static final class d<T, R> extends b<T, R> {
        final i1b<? super R> m;
        final AtomicInteger n;

        d(i1b<? super R> i1bVar, z84<? super T, ? extends ls8<? extends R>> z84Var, int i) {
            super(z84Var, i);
            this.m = i1bVar;
            this.n = new AtomicInteger();
        }

        @Override // defpackage.k1b
        public void cancel() {
            if (!this.i) {
                this.i = true;
                this.a.cancel();
                this.e.cancel();
            }
        }

        @Override // defpackage.m04.f
        public void e(Throwable th) {
            if (this.j.a(th)) {
                this.e.cancel();
                if (getAndIncrement() == 0) {
                    this.m.onError(this.j.b());
                    return;
                }
                return;
            }
            tp9.q(th);
        }

        @Override // defpackage.m04.f
        public void i(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.m.d(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.m.onError(this.j.b());
            }
        }

        @Override // defpackage.m04.b
        void j() {
            boolean z;
            if (this.n.getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.k) {
                        boolean z2 = this.h;
                        try {
                            T poll = this.g.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.m.b();
                                return;
                            } else if (!z) {
                                try {
                                    ls8 ls8Var = (ls8) x47.e(this.b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.l != 1) {
                                        int i = this.f + 1;
                                        if (i == this.d) {
                                            this.f = 0;
                                            this.e.w(i);
                                        } else {
                                            this.f = i;
                                        }
                                    }
                                    if (ls8Var instanceof Callable) {
                                        try {
                                            Object call = ((Callable) ls8Var).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.a.i()) {
                                                if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.m.d(call);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.m.onError(this.j.b());
                                                        return;
                                                    }
                                                }
                                            } else {
                                                this.k = true;
                                                this.a.k(new g(call, this.a));
                                            }
                                        } catch (Throwable th) {
                                            rl3.b(th);
                                            this.e.cancel();
                                            this.j.a(th);
                                            this.m.onError(this.j.b());
                                            return;
                                        }
                                    } else {
                                        this.k = true;
                                        ls8Var.a(this.a);
                                    }
                                } catch (Throwable th2) {
                                    rl3.b(th2);
                                    this.e.cancel();
                                    this.j.a(th2);
                                    this.m.onError(this.j.b());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            rl3.b(th3);
                            this.e.cancel();
                            this.j.a(th3);
                            this.m.onError(this.j.b());
                            return;
                        }
                    }
                    if (this.n.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.m04.b
        void k() {
            this.m.c(this);
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            if (this.j.a(th)) {
                this.a.cancel();
                if (getAndIncrement() == 0) {
                    this.m.onError(this.j.b());
                    return;
                }
                return;
            }
            tp9.q(th);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            this.a.w(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: m04$e */
    /* loaded from: classes3.dex */
    public static final class e<R> extends l1b implements m14<R> {
        final f<R> i;
        long j;

        e(f<R> fVar) {
            super(false);
            this.i = fVar;
        }

        @Override // defpackage.i1b
        public void b() {
            long j = this.j;
            if (j != 0) {
                this.j = 0L;
                j(j);
            }
            this.i.a();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            k(k1bVar);
        }

        @Override // defpackage.i1b
        public void d(R r) {
            this.j++;
            this.i.i(r);
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            long j = this.j;
            if (j != 0) {
                this.j = 0L;
                j(j);
            }
            this.i.e(th);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: m04$f */
    /* loaded from: classes3.dex */
    interface f<T> {
        void a();

        void e(Throwable th);

        void i(T t);
    }

    public m04(l04<T> l04Var, z84<? super T, ? extends ls8<? extends R>> z84Var, int i, jk3 jk3Var) {
        super(l04Var);
        this.d = z84Var;
        this.e = i;
        this.f = jk3Var;
    }

    public static <T, R> i1b<T> c0(i1b<? super R> i1bVar, z84<? super T, ? extends ls8<? extends R>> z84Var, int i, jk3 jk3Var) {
        int i2 = a.a[jk3Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return new d(i1bVar, z84Var, i);
            }
            return new c(i1bVar, z84Var, i, true);
        }
        return new c(i1bVar, z84Var, i, false);
    }

    @Override // defpackage.l04
    protected void S(i1b<? super R> i1bVar) {
        if (k14.b(this.c, i1bVar, this.d)) {
            return;
        }
        this.c.a(c0(i1bVar, this.d, this.e, this.f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: m04$g */
    /* loaded from: classes3.dex */
    public static final class g<T> extends AtomicBoolean implements k1b {
        final i1b<? super T> a;
        final T b;

        g(T t, i1b<? super T> i1bVar) {
            this.b = t;
            this.a = i1bVar;
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (j > 0 && compareAndSet(false, true)) {
                i1b<? super T> i1bVar = this.a;
                i1bVar.d((T) this.b);
                i1bVar.b();
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
        }
    }
}
