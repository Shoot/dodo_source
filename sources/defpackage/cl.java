package defpackage;

import defpackage.j81;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: AnnotatedClassResolver.java */
/* renamed from: cl  reason: default package */
/* loaded from: classes2.dex */
public class cl {
    private static final tl i = pl.d();
    private static final Class<?> j = Object.class;
    private static final Class<?> k = Enum.class;
    private static final Class<?> l = List.class;
    private static final Class<?> m = Map.class;
    private final w76<?> a;
    private final ql b;
    private final j81.a c;
    private final qnb d;
    private final y85 e;
    private final Class<?> f;
    private final Class<?> g;
    private final boolean h;

    cl(w76<?> w76Var, y85 y85Var, j81.a aVar) {
        this.a = w76Var;
        this.e = y85Var;
        Class<?> u = y85Var.u();
        this.f = u;
        this.c = aVar;
        this.d = y85Var.l();
        ql i2 = w76Var.Q() ? w76Var.i() : null;
        this.b = i2;
        this.g = aVar != null ? aVar.a(u) : null;
        this.h = (i2 == null || (q81.I(u) && y85Var.N())) ? false : true;
    }

    private pl a(pl plVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!plVar.f(annotation)) {
                    plVar = plVar.a(annotation);
                    if (this.b.Q0(annotation)) {
                        plVar = c(plVar, annotation);
                    }
                }
            }
        }
        return plVar;
    }

    private pl b(pl plVar, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            plVar = a(plVar, q81.o(cls2));
            for (Class<?> cls3 : q81.v(cls2, cls, false)) {
                plVar = a(plVar, q81.o(cls3));
            }
        }
        return plVar;
    }

    private pl c(pl plVar, Annotation annotation) {
        Annotation[] o;
        for (Annotation annotation2 : q81.o(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !plVar.f(annotation2)) {
                plVar = plVar.a(annotation2);
                if (this.b.Q0(annotation2)) {
                    plVar = c(plVar, annotation2);
                }
            }
        }
        return plVar;
    }

    private static void d(y85 y85Var, List<y85> list, boolean z) {
        Class<?> u = y85Var.u();
        if (z) {
            if (f(list, u)) {
                return;
            }
            list.add(y85Var);
            if (u == l || u == m) {
                return;
            }
        }
        for (y85 y85Var2 : y85Var.r()) {
            d(y85Var2, list, true);
        }
    }

    private static void e(y85 y85Var, List<y85> list, boolean z) {
        Class<?> u = y85Var.u();
        if (u != j && u != k) {
            if (z) {
                if (f(list, u)) {
                    return;
                }
                list.add(y85Var);
            }
            for (y85 y85Var2 : y85Var.r()) {
                d(y85Var2, list, true);
            }
            y85 x = y85Var.x();
            if (x != null) {
                e(x, list, true);
            }
        }
    }

    private static boolean f(List<y85> list, Class<?> cls) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).u() == cls) {
                return true;
            }
        }
        return false;
    }

    static bl g(w76<?> w76Var, Class<?> cls) {
        return new bl(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bl h(Class<?> cls) {
        return new bl(cls);
    }

    public static bl i(w76<?> w76Var, y85 y85Var, j81.a aVar) {
        if (y85Var.L() && o(w76Var, y85Var.u())) {
            return g(w76Var, y85Var.u());
        }
        return new cl(w76Var, y85Var, aVar).k();
    }

    private tl j(List<y85> list) {
        boolean z;
        if (this.b == null) {
            return i;
        }
        j81.a aVar = this.c;
        if (aVar != null && (!(aVar instanceof mla) || ((mla) aVar).b())) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.h) {
            return i;
        }
        pl e = pl.e();
        Class<?> cls = this.g;
        if (cls != null) {
            e = b(e, this.f, cls);
        }
        if (this.h) {
            e = a(e, q81.o(this.f));
        }
        for (y85 y85Var : list) {
            if (z) {
                Class<?> u = y85Var.u();
                e = b(e, u, this.c.a(u));
            }
            if (this.h) {
                e = a(e, q81.o(y85Var.u()));
            }
        }
        if (z) {
            e = b(e, Object.class, this.c.a(Object.class));
        }
        return e.c();
    }

    public static bl m(w76<?> w76Var, Class<?> cls) {
        return n(w76Var, cls, w76Var);
    }

    public static bl n(w76<?> w76Var, Class<?> cls, j81.a aVar) {
        if (cls.isArray() && o(w76Var, cls)) {
            return g(w76Var, cls);
        }
        return new cl(w76Var, cls, aVar).l();
    }

    private static boolean o(w76<?> w76Var, Class<?> cls) {
        if (w76Var != null && w76Var.a(cls) != null) {
            return false;
        }
        return true;
    }

    bl k() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.e.K(Object.class)) {
            if (this.e.T()) {
                d(this.e, arrayList, false);
            } else {
                e(this.e, arrayList, false);
            }
        }
        return new bl(this.e, this.f, arrayList, this.g, j(arrayList), this.d, this.b, this.c, this.a.M(), this.h);
    }

    bl l() {
        List<y85> emptyList = Collections.emptyList();
        return new bl(null, this.f, emptyList, this.g, j(emptyList), this.d, this.b, this.c, this.a.M(), this.h);
    }

    cl(w76<?> w76Var, Class<?> cls, j81.a aVar) {
        this.a = w76Var;
        this.e = null;
        this.f = cls;
        this.c = aVar;
        this.d = qnb.j();
        if (w76Var == null) {
            this.b = null;
            this.g = null;
        } else {
            this.b = w76Var.Q() ? w76Var.i() : null;
            this.g = aVar != null ? aVar.a(cls) : null;
        }
        this.h = this.b != null;
    }
}
