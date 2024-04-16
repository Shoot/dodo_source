package defpackage;
/* compiled from: BasicFuseableSubscriber.java */
/* renamed from: i90  reason: default package */
/* loaded from: classes3.dex */
public abstract class i90<T, R> implements m14<T>, dv8<R> {
    protected final i1b<? super R> a;
    protected k1b b;
    protected dv8<T> c;
    protected boolean d;
    protected int e;

    public i90(i1b<? super R> i1bVar) {
        this.a = i1bVar;
    }

    @Override // defpackage.i1b
    public void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.b();
    }

    @Override // defpackage.m14, defpackage.i1b
    public final void c(k1b k1bVar) {
        if (n1b.x(this.b, k1bVar)) {
            this.b = k1bVar;
            if (k1bVar instanceof dv8) {
                this.c = (dv8) k1bVar;
            }
            if (e()) {
                this.a.c(this);
                a();
            }
        }
    }

    @Override // defpackage.k1b
    public void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.rla
    public void clear() {
        this.c.clear();
    }

    protected boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(Throwable th) {
        rl3.b(th);
        this.b.cancel();
        onError(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i) {
        dv8<T> dv8Var = this.c;
        if (dv8Var != null && (i & 4) == 0) {
            int k = dv8Var.k(i);
            if (k != 0) {
                this.e = k;
            }
            return k;
        }
        return 0;
    }

    @Override // defpackage.rla
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.rla
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.i1b
    public void onError(Throwable th) {
        if (this.d) {
            tp9.q(th);
            return;
        }
        this.d = true;
        this.a.onError(th);
    }

    @Override // defpackage.k1b
    public void w(long j) {
        this.b.w(j);
    }

    protected void a() {
    }
}
