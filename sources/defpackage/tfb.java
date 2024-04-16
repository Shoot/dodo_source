package defpackage;

import defpackage.ki9;
/* compiled from: ThumbnailRequestCoordinator.java */
/* renamed from: tfb  reason: default package */
/* loaded from: classes.dex */
public class tfb implements ki9, ii9 {
    private final ki9 a;
    private final Object b;
    private volatile ii9 c;
    private volatile ii9 d;
    private ki9.a e;
    private ki9.a f;
    private boolean g;

    public tfb(Object obj, ki9 ki9Var) {
        ki9.a aVar = ki9.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.b = obj;
        this.a = ki9Var;
    }

    private boolean l() {
        ki9 ki9Var = this.a;
        if (ki9Var != null && !ki9Var.c(this)) {
            return false;
        }
        return true;
    }

    private boolean m() {
        ki9 ki9Var = this.a;
        if (ki9Var != null && !ki9Var.i(this)) {
            return false;
        }
        return true;
    }

    private boolean n() {
        ki9 ki9Var = this.a;
        if (ki9Var != null && !ki9Var.j(this)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ki9, defpackage.ii9
    public boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                if (!this.d.a() && !this.c.a()) {
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
        synchronized (this.b) {
            try {
                ki9 ki9Var2 = this.a;
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
        synchronized (this.b) {
            try {
                if (l() && ii9Var.equals(this.c) && this.e != ki9.a.PAUSED) {
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
        synchronized (this.b) {
            this.g = false;
            ki9.a aVar = ki9.a.CLEARED;
            this.e = aVar;
            this.f = aVar;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.ki9
    public void d(ii9 ii9Var) {
        synchronized (this.b) {
            try {
                if (!ii9Var.equals(this.c)) {
                    this.f = ki9.a.FAILED;
                    return;
                }
                this.e = ki9.a.FAILED;
                ki9 ki9Var = this.a;
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
        synchronized (this.b) {
            if (this.e == ki9.a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ki9
    public void f(ii9 ii9Var) {
        synchronized (this.b) {
            try {
                if (ii9Var.equals(this.d)) {
                    this.f = ki9.a.SUCCESS;
                    return;
                }
                this.e = ki9.a.SUCCESS;
                ki9 ki9Var = this.a;
                if (ki9Var != null) {
                    ki9Var.f(this);
                }
                if (!this.f.i()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ii9
    public boolean g() {
        boolean z;
        synchronized (this.b) {
            if (this.e == ki9.a.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ii9
    public boolean h(ii9 ii9Var) {
        if (!(ii9Var instanceof tfb)) {
            return false;
        }
        tfb tfbVar = (tfb) ii9Var;
        if (this.c == null) {
            if (tfbVar.c != null) {
                return false;
            }
        } else if (!this.c.h(tfbVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (tfbVar.d != null) {
                return false;
            }
        } else if (!this.d.h(tfbVar.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ki9
    public boolean i(ii9 ii9Var) {
        boolean z;
        synchronized (this.b) {
            try {
                if (m() && ii9Var.equals(this.c) && !a()) {
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
        synchronized (this.b) {
            if (this.e == ki9.a.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ki9
    public boolean j(ii9 ii9Var) {
        boolean z;
        synchronized (this.b) {
            try {
                z = (!n() || (!ii9Var.equals(this.c) && this.e == ki9.a.SUCCESS)) ? false : false;
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ii9
    public void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                if (this.e != ki9.a.SUCCESS) {
                    ki9.a aVar = this.f;
                    ki9.a aVar2 = ki9.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f = aVar2;
                        this.d.k();
                    }
                }
                if (this.g) {
                    ki9.a aVar3 = this.e;
                    ki9.a aVar4 = ki9.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.e = aVar4;
                        this.c.k();
                    }
                }
                this.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(ii9 ii9Var, ii9 ii9Var2) {
        this.c = ii9Var;
        this.d = ii9Var2;
    }

    @Override // defpackage.ii9
    public void pause() {
        synchronized (this.b) {
            try {
                if (!this.f.i()) {
                    this.f = ki9.a.PAUSED;
                    this.d.pause();
                }
                if (!this.e.i()) {
                    this.e = ki9.a.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
