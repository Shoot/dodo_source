package defpackage;

import defpackage.j81;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
/* compiled from: BasicClassIntrospector.java */
/* renamed from: a90  reason: default package */
/* loaded from: classes2.dex */
public class a90 extends j81 implements Serializable {
    private static final Class<?> a = Object.class;
    private static final Class<?> b = String.class;
    private static final Class<?> c = jb5.class;
    protected static final y80 d = y80.r(null, zla.F0(String.class), cl.h(String.class));
    protected static final y80 e;
    protected static final y80 f;
    protected static final y80 g;
    protected static final y80 h;

    static {
        Class cls = Boolean.TYPE;
        e = y80.r(null, zla.F0(cls), cl.h(cls));
        Class cls2 = Integer.TYPE;
        f = y80.r(null, zla.F0(cls2), cl.h(cls2));
        Class cls3 = Long.TYPE;
        g = y80.r(null, zla.F0(cls3), cl.h(cls3));
        h = y80.r(null, zla.F0(Object.class), cl.h(Object.class));
    }

    protected y80 c(w76<?> w76Var, y85 y85Var) {
        if (e(y85Var)) {
            return y80.r(w76Var, y85Var, f(w76Var, y85Var, w76Var));
        }
        return null;
    }

    protected y80 d(w76<?> w76Var, y85 y85Var) {
        Class<?> u = y85Var.u();
        if (u.isPrimitive()) {
            if (u == Integer.TYPE) {
                return f;
            }
            if (u == Long.TYPE) {
                return g;
            }
            if (u == Boolean.TYPE) {
                return e;
            }
            return null;
        } else if (q81.I(u)) {
            if (u == a) {
                return h;
            }
            if (u == b) {
                return d;
            }
            if (u == Integer.class) {
                return f;
            }
            if (u == Long.class) {
                return g;
            }
            if (u == Boolean.class) {
                return e;
            }
            return null;
        } else if (c.isAssignableFrom(u)) {
            return y80.r(w76Var, y85Var, cl.h(u));
        } else {
            return null;
        }
    }

    protected boolean e(y85 y85Var) {
        if (y85Var.N() && !y85Var.L()) {
            Class<?> u = y85Var.u();
            if (q81.I(u) && (Collection.class.isAssignableFrom(u) || Map.class.isAssignableFrom(u))) {
                return true;
            }
        }
        return false;
    }

    protected bl f(w76<?> w76Var, y85 y85Var, j81.a aVar) {
        return cl.i(w76Var, y85Var, aVar);
    }

    protected do7 i(w76<?> w76Var, y85 y85Var, j81.a aVar, boolean z) {
        j4 a2;
        bl f2 = f(w76Var, y85Var, aVar);
        if (y85Var.e0()) {
            a2 = w76Var.f().b(w76Var, f2);
        } else {
            a2 = w76Var.f().a(w76Var, f2);
        }
        return j(w76Var, f2, y85Var, z, a2);
    }

    protected do7 j(w76<?> w76Var, bl blVar, y85 y85Var, boolean z, j4 j4Var) {
        return new do7(w76Var, z, y85Var, blVar, j4Var);
    }

    @Override // defpackage.j81
    /* renamed from: k */
    public y80 a(w76<?> w76Var, y85 y85Var, j81.a aVar) {
        y80 d2 = d(w76Var, y85Var);
        if (d2 == null) {
            return y80.r(w76Var, y85Var, f(w76Var, y85Var, aVar));
        }
        return d2;
    }

    @Override // defpackage.j81
    /* renamed from: l */
    public y80 b(pca pcaVar, y85 y85Var, j81.a aVar) {
        y80 d2 = d(pcaVar, y85Var);
        if (d2 == null) {
            y80 c2 = c(pcaVar, y85Var);
            if (c2 == null) {
                return y80.s(i(pcaVar, y85Var, aVar, true));
            }
            return c2;
        }
        return d2;
    }
}
