package defpackage;
/* compiled from: FlowableDistinctUntilChanged.java */
/* renamed from: q04  reason: default package */
/* loaded from: classes3.dex */
public final class q04<T, K> extends j1<T, T> {
    final z84<? super T, K> d;
    final za0<? super K, ? super K> e;

    /* compiled from: FlowableDistinctUntilChanged.java */
    /* renamed from: q04$a */
    /* loaded from: classes3.dex */
    static final class a<T, K> extends g90<T, T> {
        final z84<? super T, K> f;
        final za0<? super K, ? super K> g;
        K h;
        boolean i;

        a(hp1<? super T> hp1Var, z84<? super T, K> z84Var, za0<? super K, ? super K> za0Var) {
            super(hp1Var);
            this.f = z84Var;
            this.g = za0Var;
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (!f(t)) {
                this.b.w(1L);
            }
        }

        @Override // defpackage.hp1
        public boolean f(T t) {
            if (this.d) {
                return false;
            }
            if (this.e != 0) {
                return this.a.f(t);
            }
            try {
                K apply = this.f.apply(t);
                if (this.i) {
                    boolean a = this.g.a((K) this.h, apply);
                    this.h = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.i = true;
                    this.h = apply;
                }
                this.a.d(t);
                return true;
            } catch (Throwable th) {
                g(th);
                return true;
            }
        }

        @Override // defpackage.bv8
        public int k(int i) {
            return h(i);
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            while (true) {
                T poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f.apply(poll);
                if (!this.i) {
                    this.i = true;
                    this.h = apply;
                    return poll;
                } else if (!this.g.a((K) this.h, apply)) {
                    this.h = apply;
                    return poll;
                } else {
                    this.h = apply;
                    if (this.e != 1) {
                        this.b.w(1L);
                    }
                }
            }
        }
    }

    /* compiled from: FlowableDistinctUntilChanged.java */
    /* renamed from: q04$b */
    /* loaded from: classes3.dex */
    static final class b<T, K> extends i90<T, T> implements hp1<T> {
        final z84<? super T, K> f;
        final za0<? super K, ? super K> g;
        K h;
        boolean i;

        b(i1b<? super T> i1bVar, z84<? super T, K> z84Var, za0<? super K, ? super K> za0Var) {
            super(i1bVar);
            this.f = z84Var;
            this.g = za0Var;
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (!f(t)) {
                this.b.w(1L);
            }
        }

        @Override // defpackage.hp1
        public boolean f(T t) {
            if (this.d) {
                return false;
            }
            if (this.e != 0) {
                this.a.d(t);
                return true;
            }
            try {
                K apply = this.f.apply(t);
                if (this.i) {
                    boolean a = this.g.a((K) this.h, apply);
                    this.h = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.i = true;
                    this.h = apply;
                }
                this.a.d(t);
                return true;
            } catch (Throwable th) {
                g(th);
                return true;
            }
        }

        @Override // defpackage.bv8
        public int k(int i) {
            return h(i);
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            while (true) {
                T poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f.apply(poll);
                if (!this.i) {
                    this.i = true;
                    this.h = apply;
                    return poll;
                } else if (!this.g.a((K) this.h, apply)) {
                    this.h = apply;
                    return poll;
                } else {
                    this.h = apply;
                    if (this.e != 1) {
                        this.b.w(1L);
                    }
                }
            }
        }
    }

    public q04(l04<T> l04Var, z84<? super T, K> z84Var, za0<? super K, ? super K> za0Var) {
        super(l04Var);
        this.d = z84Var;
        this.e = za0Var;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        if (i1bVar instanceof hp1) {
            this.c.R(new a((hp1) i1bVar, this.d, this.e));
        } else {
            this.c.R(new b(i1bVar, this.d, this.e));
        }
    }
}
