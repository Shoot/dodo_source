package defpackage;
/* compiled from: BasicFuseableObserver.java */
/* renamed from: h90  reason: default package */
/* loaded from: classes3.dex */
public abstract class h90<T, R> implements h67<T>, yu8<R> {
    protected final h67<? super R> a;
    protected z33 b;
    protected yu8<T> c;
    protected boolean d;
    protected int e;

    public h90(h67<? super R> h67Var) {
        this.a = h67Var;
    }

    @Override // defpackage.z33
    public void a() {
        this.b.a();
    }

    @Override // defpackage.h67
    public void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.b();
    }

    @Override // defpackage.h67
    public final void c(z33 z33Var) {
        if (g43.E(this.b, z33Var)) {
            this.b = z33Var;
            if (z33Var instanceof yu8) {
                this.c = (yu8) z33Var;
            }
            if (f()) {
                this.a.c(this);
                e();
            }
        }
    }

    @Override // defpackage.rla
    public void clear() {
        this.c.clear();
    }

    protected boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(Throwable th) {
        rl3.b(th);
        this.b.a();
        onError(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i) {
        yu8<T> yu8Var = this.c;
        if (yu8Var != null && (i & 4) == 0) {
            int k = yu8Var.k(i);
            if (k != 0) {
                this.e = k;
            }
            return k;
        }
        return 0;
    }

    @Override // defpackage.z33
    public boolean i() {
        return this.b.i();
    }

    @Override // defpackage.rla
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.rla
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.h67
    public void onError(Throwable th) {
        if (this.d) {
            tp9.q(th);
            return;
        }
        this.d = true;
        this.a.onError(th);
    }

    protected void e() {
    }
}
