package defpackage;

import defpackage.ki9;
/* compiled from: ErrorRequestCoordinator.java */
/* renamed from: lk3  reason: default package */
/* loaded from: classes.dex */
public final class lk3 implements ki9, ii9 {
    private final Object a;
    private final ki9 b;
    private volatile ii9 c;
    private volatile ii9 d;
    private ki9.a e;
    private ki9.a f;

    public lk3(Object obj, ki9 ki9Var) {
        ki9.a aVar = ki9.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.a = obj;
        this.b = ki9Var;
    }

    private boolean l(ii9 ii9Var) {
        ki9.a aVar;
        ki9.a aVar2 = this.e;
        ki9.a aVar3 = ki9.a.FAILED;
        if (aVar2 != aVar3) {
            return ii9Var.equals(this.c);
        }
        if (ii9Var.equals(this.d) && ((aVar = this.f) == ki9.a.SUCCESS || aVar == aVar3)) {
            return true;
        }
        return false;
    }

    private boolean m() {
        ki9 ki9Var = this.b;
        if (ki9Var != null && !ki9Var.c(this)) {
            return false;
        }
        return true;
    }

    private boolean n() {
        ki9 ki9Var = this.b;
        if (ki9Var != null && !ki9Var.i(this)) {
            return false;
        }
        return true;
    }

    private boolean o() {
        ki9 ki9Var = this.b;
        if (ki9Var != null && !ki9Var.j(this)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ki9, defpackage.ii9
    public boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                if (!this.c.a() && !this.d.a()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ki9
    public ki9 b() {
        ki9 ki9Var;
        synchronized (this.a) {
            try {
                ki9 ki9Var2 = this.b;
                if (ki9Var2 != null) {
                    ki9Var = ki9Var2.b();
                } else {
                    ki9Var = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ki9Var;
    }

    @Override // defpackage.ki9
    public boolean c(ii9 ii9Var) {
        boolean z;
        synchronized (this.a) {
            try {
                if (m() && ii9Var.equals(this.c)) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ii9
    public void clear() {
        synchronized (this.a) {
            try {
                ki9.a aVar = ki9.a.CLEARED;
                this.e = aVar;
                this.c.clear();
                if (this.f != aVar) {
                    this.f = aVar;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ki9
    public void d(ii9 ii9Var) {
        synchronized (this.a) {
            try {
                if (!ii9Var.equals(this.d)) {
                    this.e = ki9.a.FAILED;
                    ki9.a aVar = this.f;
                    ki9.a aVar2 = ki9.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f = aVar2;
                        this.d.k();
                    }
                    return;
                }
                this.f = ki9.a.FAILED;
                ki9 ki9Var = this.b;
                if (ki9Var != null) {
                    ki9Var.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ii9
    public boolean e() {
        boolean z;
        synchronized (this.a) {
            try {
                ki9.a aVar = this.e;
                ki9.a aVar2 = ki9.a.CLEARED;
                if (aVar == aVar2 && this.f == aVar2) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ki9
    public void f(ii9 ii9Var) {
        synchronized (this.a) {
            try {
                if (ii9Var.equals(this.c)) {
                    this.e = ki9.a.SUCCESS;
                } else if (ii9Var.equals(this.d)) {
                    this.f = ki9.a.SUCCESS;
                }
                ki9 ki9Var = this.b;
                if (ki9Var != null) {
                    ki9Var.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ii9
    public boolean g() {
        boolean z;
        synchronized (this.a) {
            try {
                ki9.a aVar = this.e;
                ki9.a aVar2 = ki9.a.SUCCESS;
                if (aVar != aVar2 && this.f != aVar2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ii9
    public boolean h(ii9 ii9Var) {
        if (!(ii9Var instanceof lk3)) {
            return false;
        }
        lk3 lk3Var = (lk3) ii9Var;
        if (!this.c.h(lk3Var.c) || !this.d.h(lk3Var.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ki9
    public boolean i(ii9 ii9Var) {
        boolean z;
        synchronized (this.a) {
            try {
                if (n() && l(ii9Var)) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ii9
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                ki9.a aVar = this.e;
                ki9.a aVar2 = ki9.a.RUNNING;
                if (aVar != aVar2 && this.f != aVar2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ki9
    public boolean j(ii9 ii9Var) {
        boolean o;
        synchronized (this.a) {
            o = o();
        }
        return o;
    }

    @Override // defpackage.ii9
    public void k() {
        synchronized (this.a) {
            try {
                ki9.a aVar = this.e;
                ki9.a aVar2 = ki9.a.RUNNING;
                if (aVar != aVar2) {
                    this.e = aVar2;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(ii9 ii9Var, ii9 ii9Var2) {
        this.c = ii9Var;
        this.d = ii9Var2;
    }

    @Override // defpackage.ii9
    public void pause() {
        synchronized (this.a) {
            try {
                ki9.a aVar = this.e;
                ki9.a aVar2 = ki9.a.RUNNING;
                if (aVar == aVar2) {
                    this.e = ki9.a.PAUSED;
                    this.c.pause();
                }
                if (this.f == aVar2) {
                    this.f = ki9.a.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
