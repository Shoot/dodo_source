package defpackage;

import defpackage.xv9;
/* compiled from: ObservableObserveOn.java */
/* renamed from: y57  reason: default package */
/* loaded from: classes3.dex */
public final class y57<T> extends z1<T, T> {
    final xv9 b;
    final boolean c;
    final int d;

    /* compiled from: ObservableObserveOn.java */
    /* renamed from: y57$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends k90<T> implements h67<T>, Runnable {
        final h67<? super T> a;
        final xv9.c b;
        final boolean c;
        final int d;
        rla<T> e;
        z33 f;
        Throwable g;
        volatile boolean h;
        volatile boolean i;
        int j;
        boolean k;

        a(h67<? super T> h67Var, xv9.c cVar, boolean z, int i) {
            this.a = h67Var;
            this.b = cVar;
            this.c = z;
            this.d = i;
        }

        @Override // defpackage.z33
        public void a() {
            if (!this.i) {
                this.i = true;
                this.f.a();
                this.b.a();
                if (!this.k && getAndIncrement() == 0) {
                    this.e.clear();
                }
            }
        }

        @Override // defpackage.h67
        public void b() {
            if (this.h) {
                return;
            }
            this.h = true;
            l();
        }

        @Override // defpackage.h67
        public void c(z33 z33Var) {
            if (g43.E(this.f, z33Var)) {
                this.f = z33Var;
                if (z33Var instanceof yu8) {
                    yu8 yu8Var = (yu8) z33Var;
                    int k = yu8Var.k(7);
                    if (k == 1) {
                        this.j = k;
                        this.e = yu8Var;
                        this.h = true;
                        this.a.c(this);
                        l();
                        return;
                    } else if (k == 2) {
                        this.j = k;
                        this.e = yu8Var;
                        this.a.c(this);
                        return;
                    }
                }
                this.e = new nsa(this.d);
                this.a.c(this);
            }
        }

        @Override // defpackage.rla
        public void clear() {
            this.e.clear();
        }

        @Override // defpackage.h67
        public void d(T t) {
            if (this.h) {
                return;
            }
            if (this.j != 2) {
                this.e.offer(t);
            }
            l();
        }

        boolean e(boolean z, boolean z2, h67<? super T> h67Var) {
            if (this.i) {
                this.e.clear();
                return true;
            } else if (z) {
                Throwable th = this.g;
                if (this.c) {
                    if (z2) {
                        this.i = true;
                        if (th != null) {
                            h67Var.onError(th);
                        } else {
                            h67Var.b();
                        }
                        this.b.a();
                        return true;
                    }
                    return false;
                } else if (th != null) {
                    this.i = true;
                    this.e.clear();
                    h67Var.onError(th);
                    this.b.a();
                    return true;
                } else if (z2) {
                    this.i = true;
                    h67Var.b();
                    this.b.a();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        void f() {
            int i = 1;
            while (!this.i) {
                boolean z = this.h;
                Throwable th = this.g;
                if (!this.c && z && th != null) {
                    this.i = true;
                    this.a.onError(this.g);
                    this.b.a();
                    return;
                }
                this.a.d(null);
                if (z) {
                    this.i = true;
                    Throwable th2 = this.g;
                    if (th2 != null) {
                        this.a.onError(th2);
                    } else {
                        this.a.b();
                    }
                    this.b.a();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.i;
        }

        @Override // defpackage.rla
        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        void j() {
            boolean z;
            rla<T> rlaVar = this.e;
            h67<? super T> h67Var = this.a;
            int i = 1;
            while (!e(this.h, rlaVar.isEmpty(), h67Var)) {
                while (true) {
                    boolean z2 = this.h;
                    try {
                        Object obj = (T) rlaVar.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (e(z2, z, h67Var)) {
                            return;
                        }
                        if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            h67Var.d(obj);
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        this.i = true;
                        this.f.a();
                        rlaVar.clear();
                        h67Var.onError(th);
                        this.b.a();
                        return;
                    }
                }
            }
        }

        @Override // defpackage.bv8
        public int k(int i) {
            if ((i & 2) != 0) {
                this.k = true;
                return 2;
            }
            return 0;
        }

        void l() {
            if (getAndIncrement() == 0) {
                this.b.c(this);
            }
        }

        @Override // defpackage.h67
        public void onError(Throwable th) {
            if (this.h) {
                tp9.q(th);
                return;
            }
            this.g = th;
            this.h = true;
            l();
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            return this.e.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.k) {
                f();
            } else {
                j();
            }
        }
    }

    public y57(c67<T> c67Var, xv9 xv9Var, boolean z, int i) {
        super(c67Var);
        this.b = xv9Var;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.r57
    protected void r(h67<? super T> h67Var) {
        xv9 xv9Var = this.b;
        if (xv9Var instanceof ekb) {
            this.a.a(h67Var);
            return;
        }
        this.a.a(new a(h67Var, xv9Var.b(), this.c, this.d));
    }
}
