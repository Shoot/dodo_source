package defpackage;
/* compiled from: ObservableFilter.java */
/* renamed from: w57  reason: default package */
/* loaded from: classes3.dex */
public final class w57<T> extends z1<T, T> {
    final oh8<? super T> b;

    /* compiled from: ObservableFilter.java */
    /* renamed from: w57$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends h90<T, T> {
        final oh8<? super T> f;

        a(h67<? super T> h67Var, oh8<? super T> oh8Var) {
            super(h67Var);
            this.f = oh8Var;
        }

        @Override // defpackage.h67
        public void d(T t) {
            if (this.e == 0) {
                try {
                    if (this.f.b(t)) {
                        this.a.d(t);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    g(th);
                    return;
                }
            }
            this.a.d(null);
        }

        @Override // defpackage.bv8
        public int k(int i) {
            return h(i);
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            T poll;
            do {
                poll = this.c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f.b(poll));
            return poll;
        }
    }

    public w57(c67<T> c67Var, oh8<? super T> oh8Var) {
        super(c67Var);
        this.b = oh8Var;
    }

    @Override // defpackage.r57
    public void r(h67<? super T> h67Var) {
        this.a.a(new a(h67Var, this.b));
    }
}
