package defpackage;
/* compiled from: FlowableSwitchIfEmpty.java */
/* renamed from: n14  reason: default package */
/* loaded from: classes3.dex */
public final class n14<T> extends j1<T, T> {
    final ls8<? extends T> d;

    /* compiled from: FlowableSwitchIfEmpty.java */
    /* renamed from: n14$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements m14<T> {
        final i1b<? super T> a;
        final ls8<? extends T> b;
        boolean d = true;
        final l1b c = new l1b(false);

        a(i1b<? super T> i1bVar, ls8<? extends T> ls8Var) {
            this.a = i1bVar;
            this.b = ls8Var;
        }

        @Override // defpackage.i1b
        public void b() {
            if (this.d) {
                this.d = false;
                this.b.a(this);
                return;
            }
            this.a.b();
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            this.c.k(k1bVar);
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.d) {
                this.d = false;
            }
            this.a.d(t);
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    public n14(l04<T> l04Var, ls8<? extends T> ls8Var) {
        super(l04Var);
        this.d = ls8Var;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        a aVar = new a(i1bVar, this.d);
        i1bVar.c(aVar.c);
        this.c.R(aVar);
    }
}
