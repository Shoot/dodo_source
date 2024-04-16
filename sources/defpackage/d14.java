package defpackage;
/* compiled from: FlowableMap.java */
/* renamed from: d14  reason: default package */
/* loaded from: classes3.dex */
public final class d14<T, U> extends j1<T, U> {
    final z84<? super T, ? extends U> d;

    /* compiled from: FlowableMap.java */
    /* renamed from: d14$a */
    /* loaded from: classes3.dex */
    static final class a<T, U> extends g90<T, U> {
        final z84<? super T, ? extends U> f;

        a(hp1<? super U> hp1Var, z84<? super T, ? extends U> z84Var) {
            super(hp1Var);
            this.f = z84Var;
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.d) {
                return;
            }
            if (this.e != 0) {
                this.a.d(null);
                return;
            }
            try {
                this.a.d(x47.e(this.f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                g(th);
            }
        }

        @Override // defpackage.hp1
        public boolean f(T t) {
            if (this.d) {
                return false;
            }
            try {
                return this.a.f(x47.e(this.f.apply(t), "The mapper function returned a null value."));
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
        public U poll() throws Exception {
            T poll = this.c.poll();
            if (poll != null) {
                return (U) x47.e(this.f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* compiled from: FlowableMap.java */
    /* renamed from: d14$b */
    /* loaded from: classes3.dex */
    static final class b<T, U> extends i90<T, U> {
        final z84<? super T, ? extends U> f;

        b(i1b<? super U> i1bVar, z84<? super T, ? extends U> z84Var) {
            super(i1bVar);
            this.f = z84Var;
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.d) {
                return;
            }
            if (this.e != 0) {
                this.a.d(null);
                return;
            }
            try {
                this.a.d(x47.e(this.f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                g(th);
            }
        }

        @Override // defpackage.bv8
        public int k(int i) {
            return h(i);
        }

        @Override // defpackage.rla
        public U poll() throws Exception {
            T poll = this.c.poll();
            if (poll != null) {
                return (U) x47.e(this.f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public d14(l04<T> l04Var, z84<? super T, ? extends U> z84Var) {
        super(l04Var);
        this.d = z84Var;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super U> i1bVar) {
        if (i1bVar instanceof hp1) {
            this.c.R(new a((hp1) i1bVar, this.d));
        } else {
            this.c.R(new b(i1bVar, this.d));
        }
    }
}
