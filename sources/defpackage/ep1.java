package defpackage;

import defpackage.cb5;
import defpackage.ta5;
import java.io.Serializable;
/* compiled from: ConcreteBeanPropertyBase.java */
/* renamed from: ep1  reason: default package */
/* loaded from: classes2.dex */
public abstract class ep1 implements ia0, Serializable {
    protected final uq8 a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ep1(uq8 uq8Var) {
        this.a = uq8Var == null ? uq8.j : uq8Var;
    }

    @Override // defpackage.ia0
    public ta5.d a(w76<?> w76Var, Class<?> cls) {
        ta5.d dVar;
        hl c;
        ta5.d r = w76Var.r(cls);
        ql i = w76Var.i();
        if (i != null && (c = c()) != null) {
            dVar = i.m(c);
        } else {
            dVar = null;
        }
        if (r == null) {
            if (dVar == null) {
                return ia0.D;
            }
            return dVar;
        } else if (dVar != null) {
            return r.u(dVar);
        } else {
            return r;
        }
    }

    @Override // defpackage.ia0
    public cb5.b b(w76<?> w76Var, Class<?> cls) {
        ql i = w76Var.i();
        hl c = c();
        if (c == null) {
            return w76Var.s(cls);
        }
        cb5.b n = w76Var.n(cls, c.c());
        if (i == null) {
            return n;
        }
        cb5.b Q = i.Q(c);
        if (n == null) {
            return Q;
        }
        return n.o(Q);
    }

    @Override // defpackage.ia0
    public uq8 getMetadata() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ep1(ep1 ep1Var) {
        this.a = ep1Var.a;
    }
}
