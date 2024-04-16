package defpackage;
/* compiled from: FlowableElementAtMaybe.java */
/* renamed from: s04  reason: default package */
/* loaded from: classes3.dex */
public final class s04<T> extends sa6<T> {
    final l04<T> a;
    final long b;

    /* compiled from: FlowableElementAtMaybe.java */
    /* renamed from: s04$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements m14<T>, z33 {
        final wa6<? super T> a;
        final long b;
        k1b c;
        long d;
        boolean e;

        a(wa6<? super T> wa6Var, long j) {
            this.a = wa6Var;
            this.b = j;
        }

        @Override // defpackage.z33
        public void a() {
            this.c.cancel();
            this.c = n1b.CANCELLED;
        }

        @Override // defpackage.i1b
        public void b() {
            this.c = n1b.CANCELLED;
            if (!this.e) {
                this.e = true;
                this.a.b();
            }
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.c, k1bVar)) {
                this.c = k1bVar;
                this.a.c(this);
                k1bVar.w(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (this.e) {
                return;
            }
            long j = this.d;
            if (j == this.b) {
                this.e = true;
                this.c.cancel();
                this.c = n1b.CANCELLED;
                this.a.onSuccess(t);
                return;
            }
            this.d = j + 1;
        }

        @Override // defpackage.z33
        public boolean i() {
            if (this.c == n1b.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            if (this.e) {
                tp9.q(th);
                return;
            }
            this.e = true;
            this.c = n1b.CANCELLED;
            this.a.onError(th);
        }
    }

    public s04(l04<T> l04Var, long j) {
        this.a = l04Var;
        this.b = j;
    }

    @Override // defpackage.sa6
    protected void f(wa6<? super T> wa6Var) {
        this.a.R(new a(wa6Var, this.b));
    }
}
