package defpackage;

import defpackage.cb5;
import defpackage.lw1;
import defpackage.ta5;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: BasicBeanDescription.java */
/* renamed from: y80  reason: default package */
/* loaded from: classes2.dex */
public class y80 extends fa0 {
    private static final Class<?>[] j = new Class[0];
    protected final do7 b;
    protected final w76<?> c;
    protected final ql d;
    protected final bl e;
    protected Class<?>[] f;
    protected boolean g;
    protected List<ja0> h;
    protected c57 i;

    protected y80(do7 do7Var, y85 y85Var, bl blVar) {
        super(y85Var);
        this.b = do7Var;
        w76<?> A = do7Var.A();
        this.c = A;
        if (A == null) {
            this.d = null;
        } else {
            this.d = A.i();
        }
        this.e = blVar;
    }

    public static y80 r(w76<?> w76Var, y85 y85Var, bl blVar) {
        return new y80(w76Var, y85Var, blVar, Collections.emptyList());
    }

    public static y80 s(do7 do7Var) {
        return new y80(do7Var);
    }

    @Override // defpackage.fa0
    public hl a() throws IllegalArgumentException {
        do7 do7Var = this.b;
        if (do7Var != null) {
            hl y = do7Var.y();
            if (y != null) {
                if (Map.class.isAssignableFrom(y.c())) {
                    return y;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", y.getName()));
            }
            hl x = this.b.x();
            if (x != null) {
                if (Map.class.isAssignableFrom(x.c())) {
                    return x;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", x.getName()));
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.fa0
    public Class<?>[] b() {
        Class<?>[] z0;
        if (!this.g) {
            this.g = true;
            ql qlVar = this.d;
            if (qlVar == null) {
                z0 = null;
            } else {
                z0 = qlVar.z0(this.e);
            }
            if (z0 == null && !this.c.S(y76.DEFAULT_VIEW_INCLUSION)) {
                z0 = j;
            }
            this.f = z0;
        }
        return this.f;
    }

    @Override // defpackage.fa0
    public ta5.d c(ta5.d dVar) {
        ta5.d m;
        ql qlVar = this.d;
        if (qlVar != null && (m = qlVar.m(this.e)) != null) {
            if (dVar == null) {
                dVar = m;
            } else {
                dVar = dVar.u(m);
            }
        }
        ta5.d r = this.c.r(this.e.c());
        if (r != null) {
            if (dVar == null) {
                return r;
            }
            return dVar.u(r);
        }
        return dVar;
    }

    @Override // defpackage.fa0
    public hl d() {
        do7 do7Var = this.b;
        if (do7Var == null) {
            return null;
        }
        return do7Var.B();
    }

    @Override // defpackage.fa0
    public hl e() {
        do7 do7Var = this.b;
        if (do7Var == null) {
            return null;
        }
        return do7Var.C();
    }

    @Override // defpackage.fa0
    public List<ja0> f() {
        return q();
    }

    @Override // defpackage.fa0
    public cb5.b g(cb5.b bVar) {
        cb5.b Q;
        ql qlVar = this.d;
        if (qlVar != null && (Q = qlVar.Q(this.e)) != null) {
            if (bVar != null) {
                return bVar.o(Q);
            }
            return Q;
        }
        return bVar;
    }

    @Override // defpackage.fa0
    public lw1<Object, Object> h() {
        ql qlVar = this.d;
        if (qlVar == null) {
            return null;
        }
        return p(qlVar.h0(this.e));
    }

    @Override // defpackage.fa0
    public tl j() {
        return this.e.n();
    }

    @Override // defpackage.fa0
    public bl k() {
        return this.e;
    }

    @Override // defpackage.fa0
    public c57 l() {
        return this.i;
    }

    @Override // defpackage.fa0
    public boolean n() {
        return this.e.s();
    }

    @Override // defpackage.fa0
    public Object o(boolean z) {
        dl q = this.e.q();
        if (q == null) {
            return null;
        }
        if (z) {
            q.i(this.c.S(y76.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return q.w();
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            q81.V(e);
            q81.X(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.e.m().getName() + ": (" + e.getClass().getName() + ") " + q81.n(e), e);
        }
    }

    protected lw1<Object, Object> p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof lw1) {
            return (lw1) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == lw1.a.class || q81.G(cls)) {
                return null;
            }
            if (lw1.class.isAssignableFrom(cls)) {
                this.c.E();
                return (lw1) q81.k(cls, this.c.b());
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    protected List<ja0> q() {
        if (this.h == null) {
            this.h = this.b.E();
        }
        return this.h;
    }

    public boolean t(String str) {
        Iterator<ja0> it = q().iterator();
        while (it.hasNext()) {
            if (it.next().v().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected y80(w76<?> w76Var, y85 y85Var, bl blVar, List<ja0> list) {
        super(y85Var);
        this.b = null;
        this.c = w76Var;
        if (w76Var == null) {
            this.d = null;
        } else {
            this.d = w76Var.i();
        }
        this.e = blVar;
        this.h = list;
    }

    protected y80(do7 do7Var) {
        this(do7Var, do7Var.G(), do7Var.z());
        this.i = do7Var.D();
    }
}
