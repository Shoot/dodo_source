package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: cic  reason: default package */
/* loaded from: classes.dex */
public final class cic<TResult> extends v6b<TResult> {
    private boolean b;
    private volatile boolean c;
    private TResult d;
    private Exception e;
    private final Object a = new Object();
    private List<am3<TResult>> f = new ArrayList();

    private v6b<TResult> i(am3<TResult> am3Var) {
        boolean g;
        synchronized (this.a) {
            try {
                g = g();
                if (!g) {
                    this.f.add(am3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g) {
            am3Var.onComplete(this);
        }
        return this;
    }

    private void o() {
        synchronized (this.a) {
            for (am3<TResult> am3Var : this.f) {
                try {
                    am3Var.onComplete(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }

    @Override // defpackage.v6b
    public final v6b<TResult> a(m77<TResult> m77Var) {
        return l(f7b.b(), m77Var);
    }

    @Override // defpackage.v6b
    public final v6b<TResult> b(c87 c87Var) {
        return m(f7b.b(), c87Var);
    }

    @Override // defpackage.v6b
    public final v6b<TResult> c(c97<TResult> c97Var) {
        return n(f7b.b(), c97Var);
    }

    @Override // defpackage.v6b
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // defpackage.v6b
    public final TResult e() {
        TResult tresult;
        synchronized (this.a) {
            try {
                if (this.e == null) {
                    tresult = this.d;
                } else {
                    throw new RuntimeException(this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // defpackage.v6b
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.v6b
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.v6b
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                if (this.b && !f() && this.e == null) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    public final void j(Exception exc) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                this.e = exc;
                this.a.notifyAll();
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(TResult tresult) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                this.d = tresult;
                this.a.notifyAll();
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v6b<TResult> l(Executor executor, m77<TResult> m77Var) {
        return i(new phc(executor, m77Var));
    }

    public final v6b<TResult> m(Executor executor, c87 c87Var) {
        return i(new uhc(executor, c87Var));
    }

    public final v6b<TResult> n(Executor executor, c97<TResult> c97Var) {
        return i(new zhc(executor, c97Var));
    }
}
