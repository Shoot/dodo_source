package defpackage;

import defpackage.xv9;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: FlowableObserveOn.java */
/* renamed from: e14  reason: default package */
/* loaded from: classes3.dex */
public final class e14<T> extends j1<T, T> {
    final xv9 d;
    final boolean e;
    final int f;

    /* compiled from: FlowableObserveOn.java */
    /* renamed from: e14$a */
    /* loaded from: classes3.dex */
    static abstract class a<T> extends l90<T> implements m14<T>, Runnable {
        final xv9.c a;
        final boolean b;
        final int c;
        final int d;
        final AtomicLong e = new AtomicLong();
        k1b f;
        rla<T> g;
        volatile boolean h;
        volatile boolean i;
        Throwable j;
        int k;
        long l;
        boolean m;

        a(xv9.c cVar, boolean z, int i) {
            this.a = cVar;
            this.b = z;
            this.c = i;
            this.d = i - (i >> 2);
        }

        final boolean a(boolean z, boolean z2, i1b<?> i1bVar) {
            if (this.h) {
                clear();
                return true;
            } else if (z) {
                if (this.b) {
                    if (z2) {
                        this.h = true;
                        Throwable th = this.j;
                        if (th != null) {
                            i1bVar.onError(th);
                        } else {
                            i1bVar.b();
                        }
                        this.a.a();
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.j;
                if (th2 != null) {
                    this.h = true;
                    clear();
                    i1bVar.onError(th2);
                    this.a.a();
                    return true;
                } else if (z2) {
                    this.h = true;
                    i1bVar.b();
                    this.a.a();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // defpackage.i1b
        public final void b() {
            if (!this.i) {
                this.i = true;
                l();
            }
        }

        @Override // defpackage.k1b
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.f.cancel();
            this.a.a();
            if (!this.m && getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        @Override // defpackage.rla
        public final void clear() {
            this.g.clear();
        }

        @Override // defpackage.i1b
        public final void d(T t) {
            if (this.i) {
                return;
            }
            if (this.k == 2) {
                l();
                return;
            }
            if (!this.g.offer(t)) {
                this.f.cancel();
                this.j = new MissingBackpressureException("Queue is full?!");
                this.i = true;
            }
            l();
        }

        abstract void e();

        abstract void i();

        @Override // defpackage.rla
        public final boolean isEmpty() {
            return this.g.isEmpty();
        }

        abstract void j();

        @Override // defpackage.bv8
        public final int k(int i) {
            if ((i & 2) != 0) {
                this.m = true;
                return 2;
            }
            return 0;
        }

        final void l() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.a.c(this);
        }

        @Override // defpackage.i1b
        public final void onError(Throwable th) {
            if (this.i) {
                tp9.q(th);
                return;
            }
            this.j = th;
            this.i = true;
            l();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.m) {
                i();
            } else if (this.k == 1) {
                j();
            } else {
                e();
            }
        }

        @Override // defpackage.k1b
        public final void w(long j) {
            if (n1b.u(j)) {
                g60.a(this.e, j);
                l();
            }
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* renamed from: e14$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends a<T> {
        final hp1<? super T> n;
        long o;

        b(hp1<? super T> hp1Var, xv9.c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.n = hp1Var;
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.f, k1bVar)) {
                this.f = k1bVar;
                if (k1bVar instanceof dv8) {
                    dv8 dv8Var = (dv8) k1bVar;
                    int k = dv8Var.k(7);
                    if (k == 1) {
                        this.k = 1;
                        this.g = dv8Var;
                        this.i = true;
                        this.n.c(this);
                        return;
                    } else if (k == 2) {
                        this.k = 2;
                        this.g = dv8Var;
                        this.n.c(this);
                        k1bVar.w(this.c);
                        return;
                    }
                }
                this.g = new msa(this.c);
                this.n.c(this);
                k1bVar.w(this.c);
            }
        }

        @Override // defpackage.e14.a
        void e() {
            int i;
            boolean z;
            hp1<? super T> hp1Var = this.n;
            rla<T> rlaVar = this.g;
            long j = this.l;
            long j2 = this.o;
            int i2 = 1;
            while (true) {
                long j3 = this.e.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.i;
                    try {
                        Object obj = (T) rlaVar.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a(z2, z, hp1Var)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        if (hp1Var.f(obj)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.d) {
                            this.f.w(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        this.h = true;
                        this.f.cancel();
                        rlaVar.clear();
                        hp1Var.onError(th);
                        this.a.a();
                        return;
                    }
                }
                if (i == 0 && a(this.i, rlaVar.isEmpty(), hp1Var)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.l = j;
                    this.o = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // defpackage.e14.a
        void i() {
            int i = 1;
            while (!this.h) {
                boolean z = this.i;
                this.n.d(null);
                if (z) {
                    this.h = true;
                    Throwable th = this.j;
                    if (th != null) {
                        this.n.onError(th);
                    } else {
                        this.n.b();
                    }
                    this.a.a();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.e14.a
        void j() {
            hp1<? super T> hp1Var = this.n;
            rla<T> rlaVar = this.g;
            long j = this.l;
            int i = 1;
            while (true) {
                long j2 = this.e.get();
                while (j != j2) {
                    try {
                        Object obj = (T) rlaVar.poll();
                        if (this.h) {
                            return;
                        }
                        if (obj == null) {
                            this.h = true;
                            hp1Var.b();
                            this.a.a();
                            return;
                        } else if (hp1Var.f(obj)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        this.h = true;
                        this.f.cancel();
                        hp1Var.onError(th);
                        this.a.a();
                        return;
                    }
                }
                if (this.h) {
                    return;
                }
                if (rlaVar.isEmpty()) {
                    this.h = true;
                    hp1Var.b();
                    this.a.a();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.l = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            T poll = this.g.poll();
            if (poll != null && this.k != 1) {
                long j = this.o + 1;
                if (j == this.d) {
                    this.o = 0L;
                    this.f.w(j);
                } else {
                    this.o = j;
                }
            }
            return poll;
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* renamed from: e14$c */
    /* loaded from: classes3.dex */
    static final class c<T> extends a<T> implements m14<T> {
        final i1b<? super T> n;

        c(i1b<? super T> i1bVar, xv9.c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.n = i1bVar;
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.f, k1bVar)) {
                this.f = k1bVar;
                if (k1bVar instanceof dv8) {
                    dv8 dv8Var = (dv8) k1bVar;
                    int k = dv8Var.k(7);
                    if (k == 1) {
                        this.k = 1;
                        this.g = dv8Var;
                        this.i = true;
                        this.n.c(this);
                        return;
                    } else if (k == 2) {
                        this.k = 2;
                        this.g = dv8Var;
                        this.n.c(this);
                        k1bVar.w(this.c);
                        return;
                    }
                }
                this.g = new msa(this.c);
                this.n.c(this);
                k1bVar.w(this.c);
            }
        }

        @Override // defpackage.e14.a
        void e() {
            int i;
            boolean z;
            i1b<? super T> i1bVar = this.n;
            rla<T> rlaVar = this.g;
            long j = this.l;
            int i2 = 1;
            while (true) {
                long j2 = this.e.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.i;
                    try {
                        Object obj = (T) rlaVar.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a(z2, z, i1bVar)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        i1bVar.d(obj);
                        j++;
                        if (j == this.d) {
                            if (j2 != Long.MAX_VALUE) {
                                j2 = this.e.addAndGet(-j);
                            }
                            this.f.w(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        this.h = true;
                        this.f.cancel();
                        rlaVar.clear();
                        i1bVar.onError(th);
                        this.a.a();
                        return;
                    }
                }
                if (i == 0 && a(this.i, rlaVar.isEmpty(), i1bVar)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.l = j;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // defpackage.e14.a
        void i() {
            int i = 1;
            while (!this.h) {
                boolean z = this.i;
                this.n.d(null);
                if (z) {
                    this.h = true;
                    Throwable th = this.j;
                    if (th != null) {
                        this.n.onError(th);
                    } else {
                        this.n.b();
                    }
                    this.a.a();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.e14.a
        void j() {
            i1b<? super T> i1bVar = this.n;
            rla<T> rlaVar = this.g;
            long j = this.l;
            int i = 1;
            while (true) {
                long j2 = this.e.get();
                while (j != j2) {
                    try {
                        Object obj = (T) rlaVar.poll();
                        if (this.h) {
                            return;
                        }
                        if (obj == null) {
                            this.h = true;
                            i1bVar.b();
                            this.a.a();
                            return;
                        }
                        i1bVar.d(obj);
                        j++;
                    } catch (Throwable th) {
                        rl3.b(th);
                        this.h = true;
                        this.f.cancel();
                        i1bVar.onError(th);
                        this.a.a();
                        return;
                    }
                }
                if (this.h) {
                    return;
                }
                if (rlaVar.isEmpty()) {
                    this.h = true;
                    i1bVar.b();
                    this.a.a();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.l = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            T poll = this.g.poll();
            if (poll != null && this.k != 1) {
                long j = this.l + 1;
                if (j == this.d) {
                    this.l = 0L;
                    this.f.w(j);
                } else {
                    this.l = j;
                }
            }
            return poll;
        }
    }

    public e14(l04<T> l04Var, xv9 xv9Var, boolean z, int i) {
        super(l04Var);
        this.d = xv9Var;
        this.e = z;
        this.f = i;
    }

    @Override // defpackage.l04
    public void S(i1b<? super T> i1bVar) {
        xv9.c b2 = this.d.b();
        if (i1bVar instanceof hp1) {
            this.c.R(new b((hp1) i1bVar, b2, this.e, this.f));
        } else {
            this.c.R(new c(i1bVar, b2, this.e, this.f));
        }
    }
}
