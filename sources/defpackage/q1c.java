package defpackage;

import defpackage.cb5;
import java.io.Serializable;
/* compiled from: VirtualBeanPropertyWriter.java */
/* renamed from: q1c  reason: default package */
/* loaded from: classes2.dex */
public abstract class q1c extends ka0 implements Serializable {
    protected q1c() {
    }

    protected static boolean M(cb5.b bVar) {
        cb5.a j;
        if (bVar == null || (j = bVar.j()) == cb5.a.ALWAYS || j == cb5.a.USE_DEFAULTS) {
            return false;
        }
        return true;
    }

    protected static Object N(cb5.b bVar) {
        if (bVar == null) {
            return Boolean.FALSE;
        }
        cb5.a j = bVar.j();
        if (j != cb5.a.ALWAYS && j != cb5.a.NON_NULL && j != cb5.a.USE_DEFAULTS) {
            return ka0.s;
        }
        return null;
    }

    protected abstract Object P(Object obj, ua5 ua5Var, bda bdaVar) throws Exception;

    public abstract q1c Q(w76<?> w76Var, bl blVar, ja0 ja0Var, y85 y85Var);

    @Override // defpackage.ka0
    public void w(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        Object P = P(obj, ua5Var, bdaVar);
        if (P == null) {
            gc5<Object> gc5Var = this.l;
            if (gc5Var != null) {
                gc5Var.f(null, ua5Var, bdaVar);
                return;
            } else {
                ua5Var.l0();
                return;
            }
        }
        gc5<?> gc5Var2 = this.k;
        if (gc5Var2 == null) {
            Class<?> cls = P.getClass();
            er8 er8Var = this.n;
            gc5<?> j = er8Var.j(cls);
            if (j == null) {
                gc5Var2 = d(er8Var, cls, bdaVar);
            } else {
                gc5Var2 = j;
            }
        }
        Object obj2 = this.p;
        if (obj2 != null) {
            if (ka0.s == obj2) {
                if (gc5Var2.d(bdaVar, P)) {
                    E(obj, ua5Var, bdaVar);
                    return;
                }
            } else if (obj2.equals(P)) {
                E(obj, ua5Var, bdaVar);
                return;
            }
        }
        if (P == obj && e(obj, ua5Var, bdaVar, gc5Var2)) {
            return;
        }
        bob bobVar = this.m;
        if (bobVar == null) {
            gc5Var2.f(P, ua5Var, bdaVar);
        } else {
            gc5Var2.i(P, ua5Var, bdaVar, bobVar);
        }
    }

    @Override // defpackage.ka0
    public void x(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        Object P = P(obj, ua5Var, bdaVar);
        if (P == null) {
            if (this.l != null) {
                ua5Var.f0(this.b);
                this.l.f(null, ua5Var, bdaVar);
                return;
            }
            return;
        }
        gc5<?> gc5Var = this.k;
        if (gc5Var == null) {
            Class<?> cls = P.getClass();
            er8 er8Var = this.n;
            gc5<?> j = er8Var.j(cls);
            if (j == null) {
                gc5Var = d(er8Var, cls, bdaVar);
            } else {
                gc5Var = j;
            }
        }
        Object obj2 = this.p;
        if (obj2 != null) {
            if (ka0.s == obj2) {
                if (gc5Var.d(bdaVar, P)) {
                    return;
                }
            } else if (obj2.equals(P)) {
                return;
            }
        }
        if (P == obj && e(obj, ua5Var, bdaVar, gc5Var)) {
            return;
        }
        ua5Var.f0(this.b);
        bob bobVar = this.m;
        if (bobVar == null) {
            gc5Var.f(P, ua5Var, bdaVar);
        } else {
            gc5Var.i(P, ua5Var, bdaVar, bobVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q1c(ja0 ja0Var, tl tlVar, y85 y85Var, gc5<?> gc5Var, bob bobVar, y85 y85Var2, cb5.b bVar, Class<?>[] clsArr) {
        super(ja0Var, ja0Var.w(), tlVar, y85Var, gc5Var, bobVar, y85Var2, M(bVar), N(bVar), clsArr);
    }
}
