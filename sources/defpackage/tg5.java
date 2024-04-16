package defpackage;

import defpackage.qg5;
import java.security.GeneralSecurityException;
/* compiled from: KeysetManager.java */
/* renamed from: tg5  reason: default package */
/* loaded from: classes2.dex */
public final class tg5 {
    private final qg5.b a;

    private tg5(qg5.b bVar) {
        this.a = bVar;
    }

    private synchronized qg5.c c(we5 we5Var, mm7 mm7Var) throws GeneralSecurityException {
        int g;
        g = g();
        if (mm7Var != mm7.UNKNOWN_PREFIX) {
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return qg5.c.V().y(we5Var).z(g).B(tf5.ENABLED).A(mm7Var).a();
    }

    private synchronized boolean e(int i) {
        for (qg5.c cVar : this.a.B()) {
            if (cVar.R() == i) {
                return true;
            }
        }
        return false;
    }

    private synchronized qg5.c f(vf5 vf5Var) throws GeneralSecurityException {
        return c(kc9.j(vf5Var), vf5Var.Q());
    }

    private synchronized int g() {
        int b;
        b = xub.b();
        while (e(b)) {
            b = xub.b();
        }
        return b;
    }

    public static tg5 i() {
        return new tg5(qg5.U());
    }

    public static tg5 j(rg5 rg5Var) {
        return new tg5(rg5Var.f().b());
    }

    public synchronized tg5 a(uf5 uf5Var) throws GeneralSecurityException {
        b(uf5Var.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(vf5 vf5Var, boolean z) throws GeneralSecurityException {
        qg5.c f;
        try {
            f = f(vf5Var);
            this.a.y(f);
            if (z) {
                this.a.C(f.R());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f.R();
    }

    public synchronized rg5 d() throws GeneralSecurityException {
        return rg5.e(this.a.a());
    }

    public synchronized tg5 h(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.a.A(); i2++) {
            qg5.c z = this.a.z(i2);
            if (z.R() == i) {
                if (z.T().equals(tf5.ENABLED)) {
                    this.a.C(i);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
