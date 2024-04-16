package defpackage;
/* compiled from: FlowableFilter.java */
/* renamed from: v04  reason: default package */
/* loaded from: classes3.dex */
public final class v04<T> extends j1<T, T> {
    final oh8<? super T> d;

    /* compiled from: FlowableFilter.java */
    /* renamed from: v04$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends g90<T, T> {
        final oh8<? super T> f;

        a(hp1<? super T> hp1Var, oh8<? super T> oh8Var) {
            super(hp1Var);
            this.f = oh8Var;
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
                return this.a.f(null);
            }
            try {
                if (!this.f.b(t) || !this.a.f(t)) {
                    return false;
                }
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
            dv8<T> dv8Var = this.c;
            oh8<? super T> oh8Var = this.f;
            while (true) {
                T poll = dv8Var.poll();
                if (poll == null) {
                    return null;
                }
                if (oh8Var.b(poll)) {
                    return poll;
                }
                if (this.e == 2) {
                    dv8Var.w(1L);
                }
            }
        }
    }

    /* compiled from: FlowableFilter.java */
    /* renamed from: v04$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends i90<T, T> implements hp1<T> {
        final oh8<? super T> f;

        b(i1b<? super T> i1bVar, oh8<? super T> oh8Var) {
            super(i1bVar);
            this.f = oh8Var;
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
                this.a.d(null);
                return true;
            }
            try {
                boolean b = this.f.b(t);
                if (b) {
                    this.a.d(t);
                }
                return b;
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
            dv8<T> dv8Var = this.c;
            oh8<? super T> oh8Var = this.f;
            while (true) {
                T poll = dv8Var.poll();
                if (poll == null) {
                    return null;
                }
                if (oh8Var.b(poll)) {
                    return poll;
                }
                if (this.e == 2) {
                    dv8Var.w(1L);
                }
            }
        }
    }

    public v04(l04<T> l04Var, oh8<? super T> oh8Var) {
        super(l04Var);
        this.d = oh8Var;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        if (i1bVar instanceof hp1) {
            this.c.R(new a((hp1) i1bVar, this.d));
        } else {
            this.c.R(new b(i1bVar, this.d));
        }
    }
}
