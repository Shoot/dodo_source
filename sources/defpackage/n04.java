package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FlowableCreate.java */
/* renamed from: n04  reason: default package */
/* loaded from: classes3.dex */
public final class n04<T> extends l04<T> {
    final h14<T> c;
    final h60 d;

    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h60.values().length];
            a = iArr;
            try {
                iArr[h60.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h60.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h60.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h60.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$c */
    /* loaded from: classes3.dex */
    static final class c<T> extends b<T> {
        final nsa<T> c;
        Throwable d;
        volatile boolean e;
        final AtomicInteger f;

        c(i1b<? super T> i1bVar, int i) {
            super(i1bVar);
            this.c = new nsa<>(i);
            this.f = new AtomicInteger();
        }

        @Override // defpackage.lf3
        public void d(T t) {
            if (!this.e && !isCancelled()) {
                if (t == null) {
                    e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.c.offer(t);
                l();
            }
        }

        @Override // defpackage.n04.b
        void f() {
            l();
        }

        @Override // defpackage.n04.b
        void j() {
            if (this.f.getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        @Override // defpackage.n04.b
        public boolean k(Throwable th) {
            if (!this.e && !isCancelled()) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.d = th;
                this.e = true;
                l();
                return true;
            }
            return false;
        }

        void l() {
            int i;
            boolean z;
            if (this.f.getAndIncrement() != 0) {
                return;
            }
            i1b<? super T> i1bVar = this.a;
            nsa<T> nsaVar = this.c;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (isCancelled()) {
                        nsaVar.clear();
                        return;
                    } else {
                        boolean z2 = this.e;
                        Object obj = (T) nsaVar.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable th = this.d;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                a();
                                return;
                            }
                        } else if (z) {
                            break;
                        } else {
                            i1bVar.d(obj);
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (isCancelled()) {
                        nsaVar.clear();
                        return;
                    }
                    boolean z3 = this.e;
                    boolean isEmpty = nsaVar.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            c(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    g60.d(this, j2);
                }
                i2 = this.f.addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$e */
    /* loaded from: classes3.dex */
    static final class e<T> extends h<T> {
        e(i1b<? super T> i1bVar) {
            super(i1bVar);
        }

        @Override // defpackage.n04.h
        void l() {
            e(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$f */
    /* loaded from: classes3.dex */
    static final class f<T> extends b<T> {
        final AtomicReference<T> c;
        Throwable d;
        volatile boolean e;
        final AtomicInteger f;

        f(i1b<? super T> i1bVar) {
            super(i1bVar);
            this.c = new AtomicReference<>();
            this.f = new AtomicInteger();
        }

        @Override // defpackage.lf3
        public void d(T t) {
            if (!this.e && !isCancelled()) {
                if (t == null) {
                    e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.c.set(t);
                l();
            }
        }

        @Override // defpackage.n04.b
        void f() {
            l();
        }

        @Override // defpackage.n04.b
        void j() {
            if (this.f.getAndIncrement() == 0) {
                this.c.lazySet(null);
            }
        }

        @Override // defpackage.n04.b
        public boolean k(Throwable th) {
            if (!this.e && !isCancelled()) {
                if (th == null) {
                    e(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                }
                this.d = th;
                this.e = true;
                l();
                return true;
            }
            return false;
        }

        void l() {
            boolean z;
            int i;
            boolean z2;
            if (this.f.getAndIncrement() != 0) {
                return;
            }
            i1b<? super T> i1bVar = this.a;
            AtomicReference<T> atomicReference = this.c;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    z = false;
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    } else {
                        boolean z3 = this.e;
                        Object obj = (T) atomicReference.getAndSet(null);
                        if (obj == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z3 && z2) {
                            Throwable th = this.d;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                a();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            i1bVar.d(obj);
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z4 = this.e;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (z4 && z) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            c(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    g60.d(this, j2);
                }
                i2 = this.f.addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$g */
    /* loaded from: classes3.dex */
    static final class g<T> extends b<T> {
        g(i1b<? super T> i1bVar) {
            super(i1bVar);
        }

        @Override // defpackage.lf3
        public void d(T t) {
            long j;
            if (isCancelled()) {
                return;
            }
            if (t != null) {
                this.a.d(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$h */
    /* loaded from: classes3.dex */
    static abstract class h<T> extends b<T> {
        h(i1b<? super T> i1bVar) {
            super(i1bVar);
        }

        @Override // defpackage.lf3
        public final void d(T t) {
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.a.d(t);
                g60.d(this, 1L);
            } else {
                l();
            }
        }

        abstract void l();
    }

    public n04(h14<T> h14Var, h60 h60Var) {
        this.c = h14Var;
        this.d = h60Var;
    }

    @Override // defpackage.l04
    public void S(i1b<? super T> i1bVar) {
        b gVar;
        int i = a.a[this.d.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        gVar = new c(i1bVar, l04.e());
                    } else {
                        gVar = new f(i1bVar);
                    }
                } else {
                    gVar = new d(i1bVar);
                }
            } else {
                gVar = new e(i1bVar);
            }
        } else {
            gVar = new g(i1bVar);
        }
        i1bVar.c(gVar);
        try {
            this.c.a(gVar);
        } catch (Throwable th) {
            rl3.b(th);
            gVar.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$b */
    /* loaded from: classes3.dex */
    public static abstract class b<T> extends AtomicLong implements t04<T>, k1b {
        final i1b<? super T> a;
        final eca b = new eca();

        b(i1b<? super T> i1bVar) {
            this.a = i1bVar;
        }

        protected void a() {
            if (isCancelled()) {
                return;
            }
            try {
                this.a.b();
            } finally {
                this.b.a();
            }
        }

        @Override // defpackage.t04
        public final void b(z33 z33Var) {
            this.b.c(z33Var);
        }

        protected boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.a.onError(th);
                this.b.a();
                return true;
            } catch (Throwable th2) {
                this.b.a();
                throw th2;
            }
        }

        @Override // defpackage.k1b
        public final void cancel() {
            this.b.a();
            j();
        }

        public final void e(Throwable th) {
            if (!k(th)) {
                tp9.q(th);
            }
        }

        @Override // defpackage.t04
        public final boolean isCancelled() {
            return this.b.i();
        }

        public boolean k(Throwable th) {
            return c(th);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // defpackage.k1b
        public final void w(long j) {
            if (n1b.u(j)) {
                g60.a(this, j);
                f();
            }
        }

        void f() {
        }

        void j() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: n04$d */
    /* loaded from: classes3.dex */
    static final class d<T> extends h<T> {
        d(i1b<? super T> i1bVar) {
            super(i1bVar);
        }

        @Override // defpackage.n04.h
        void l() {
        }
    }
}
