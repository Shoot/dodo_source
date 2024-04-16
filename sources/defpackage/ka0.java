package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.cb5;
import defpackage.er8;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
/* compiled from: BeanPropertyWriter.java */
@o85
/* renamed from: ka0  reason: default package */
/* loaded from: classes2.dex */
public class ka0 extends gr8 implements Serializable {
    public static final Object s = cb5.a.NON_EMPTY;
    protected final vca b;
    protected final vq8 c;
    protected final y85 d;
    protected final y85 e;
    protected y85 f;
    protected final transient tl g;
    protected final hl h;
    protected transient Method i;
    protected transient Field j;
    protected gc5<Object> k;
    protected gc5<Object> l;
    protected bob m;
    protected transient er8 n;
    protected final boolean o;
    protected final Object p;
    protected final Class<?>[] q;
    protected transient HashMap<Object, Object> r;

    public ka0(ja0 ja0Var, hl hlVar, tl tlVar, y85 y85Var, gc5<?> gc5Var, bob bobVar, y85 y85Var2, boolean z, Object obj, Class<?>[] clsArr) {
        super(ja0Var);
        this.h = hlVar;
        this.g = tlVar;
        this.b = new vca(ja0Var.v());
        this.c = ja0Var.A();
        this.d = y85Var;
        this.k = gc5Var;
        this.n = gc5Var == null ? er8.c() : null;
        this.m = bobVar;
        this.e = y85Var2;
        if (hlVar instanceof fl) {
            this.i = null;
            this.j = (Field) hlVar.m();
        } else if (hlVar instanceof il) {
            this.i = (Method) hlVar.m();
            this.j = null;
        } else {
            this.i = null;
            this.j = null;
        }
        this.o = z;
        this.p = obj;
        this.l = null;
        this.q = clsArr;
    }

    public void E(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        gc5<Object> gc5Var = this.l;
        if (gc5Var != null) {
            gc5Var.f(null, ua5Var, bdaVar);
        } else {
            ua5Var.l0();
        }
    }

    public void G(y85 y85Var) {
        this.f = y85Var;
    }

    public ka0 H(ps6 ps6Var) {
        return new nrb(this, ps6Var);
    }

    public boolean K() {
        return this.o;
    }

    public boolean L(vq8 vq8Var) {
        vq8 vq8Var2 = this.c;
        if (vq8Var2 != null) {
            return vq8Var2.equals(vq8Var);
        }
        if (vq8Var.f(this.b.getValue()) && !vq8Var.d()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ia0
    public hl c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gc5<Object> d(er8 er8Var, Class<?> cls, bda bdaVar) throws JsonMappingException {
        er8.d f;
        y85 y85Var = this.f;
        if (y85Var != null) {
            f = er8Var.e(bdaVar.w(y85Var, cls), bdaVar, this);
        } else {
            f = er8Var.f(cls, bdaVar, this);
        }
        er8 er8Var2 = f.b;
        if (er8Var != er8Var2) {
            this.n = er8Var2;
        }
        return f.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(Object obj, ua5 ua5Var, bda bdaVar, gc5<?> gc5Var) throws IOException {
        if (!gc5Var.k()) {
            if (bdaVar.M0(qca.FAIL_ON_SELF_REFERENCES)) {
                if (gc5Var instanceof ma0) {
                    bdaVar.k(getType(), "Direct self-reference leading to cycle");
                    return false;
                }
                return false;
            } else if (bdaVar.M0(qca.WRITE_SELF_REFERENCES_AS_NULL)) {
                if (this.l != null) {
                    if (!ua5Var.n().f()) {
                        ua5Var.f0(this.b);
                    }
                    this.l.f(null, ua5Var, bdaVar);
                    return true;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    protected ka0 f(vq8 vq8Var) {
        return new ka0(this, vq8Var);
    }

    public String getName() {
        return this.b.getValue();
    }

    @Override // defpackage.ia0
    public y85 getType() {
        return this.d;
    }

    public void i(gc5<Object> gc5Var) {
        gc5<Object> gc5Var2 = this.l;
        if (gc5Var2 != null && gc5Var2 != gc5Var) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", q81.h(this.l), q81.h(gc5Var)));
        }
        this.l = gc5Var;
    }

    public void j(gc5<Object> gc5Var) {
        gc5<Object> gc5Var2 = this.k;
        if (gc5Var2 != null && gc5Var2 != gc5Var) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", q81.h(this.k), q81.h(gc5Var)));
        }
        this.k = gc5Var;
    }

    public void k(bob bobVar) {
        this.m = bobVar;
    }

    public void l(pca pcaVar) {
        this.h.i(pcaVar.S(y76.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object m(Object obj) throws Exception {
        Method method = this.i;
        if (method == null) {
            return this.j.get(obj);
        }
        return method.invoke(obj, null);
    }

    public y85 n() {
        return this.e;
    }

    public bob o() {
        return this.m;
    }

    public Class<?>[] q() {
        return this.q;
    }

    public boolean r() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    Object readResolve() {
        hl hlVar = this.h;
        if (hlVar instanceof fl) {
            this.i = null;
            this.j = (Field) hlVar.m();
        } else if (hlVar instanceof il) {
            this.i = (Method) hlVar.m();
            this.j = null;
        }
        if (this.k == null) {
            this.n = er8.c();
        }
        return this;
    }

    public boolean s() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(getName());
        sb.append("' (");
        if (this.i != null) {
            sb.append("via method ");
            sb.append(this.i.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this.i.getName());
        } else if (this.j != null) {
            sb.append("field \"");
            sb.append(this.j.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this.j.getName());
        } else {
            sb.append("virtual");
        }
        if (this.k == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this.k.getClass().getName());
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    public ka0 u(ps6 ps6Var) {
        String c = ps6Var.c(this.b.getValue());
        if (c.equals(this.b.toString())) {
            return this;
        }
        return f(vq8.a(c));
    }

    public void w(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        Object invoke;
        Method method = this.i;
        if (method == null) {
            invoke = this.j.get(obj);
        } else {
            invoke = method.invoke(obj, null);
        }
        if (invoke == null) {
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
            Class<?> cls = invoke.getClass();
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
            if (s == obj2) {
                if (gc5Var2.d(bdaVar, invoke)) {
                    E(obj, ua5Var, bdaVar);
                    return;
                }
            } else if (obj2.equals(invoke)) {
                E(obj, ua5Var, bdaVar);
                return;
            }
        }
        if (invoke == obj && e(obj, ua5Var, bdaVar, gc5Var2)) {
            return;
        }
        bob bobVar = this.m;
        if (bobVar == null) {
            gc5Var2.f(invoke, ua5Var, bdaVar);
        } else {
            gc5Var2.i(invoke, ua5Var, bdaVar, bobVar);
        }
    }

    public void x(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        Object invoke;
        Method method = this.i;
        if (method == null) {
            invoke = this.j.get(obj);
        } else {
            invoke = method.invoke(obj, null);
        }
        if (invoke == null) {
            if (this.l != null) {
                ua5Var.f0(this.b);
                this.l.f(null, ua5Var, bdaVar);
                return;
            }
            return;
        }
        gc5<?> gc5Var = this.k;
        if (gc5Var == null) {
            Class<?> cls = invoke.getClass();
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
            if (s == obj2) {
                if (gc5Var.d(bdaVar, invoke)) {
                    return;
                }
            } else if (obj2.equals(invoke)) {
                return;
            }
        }
        if (invoke == obj && e(obj, ua5Var, bdaVar, gc5Var)) {
            return;
        }
        ua5Var.f0(this.b);
        bob bobVar = this.m;
        if (bobVar == null) {
            gc5Var.f(invoke, ua5Var, bdaVar);
        } else {
            gc5Var.i(invoke, ua5Var, bdaVar, bobVar);
        }
    }

    public void y(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
        if (!ua5Var.e()) {
            ua5Var.I0(this.b.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ka0() {
        super(uq8.j);
        this.h = null;
        this.g = null;
        this.b = null;
        this.c = null;
        this.q = null;
        this.d = null;
        this.k = null;
        this.n = null;
        this.m = null;
        this.e = null;
        this.i = null;
        this.j = null;
        this.o = false;
        this.p = null;
        this.l = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ka0(ka0 ka0Var) {
        this(ka0Var, ka0Var.b);
    }

    protected ka0(ka0 ka0Var, vq8 vq8Var) {
        super(ka0Var);
        this.b = new vca(vq8Var.c());
        this.c = ka0Var.c;
        this.g = ka0Var.g;
        this.d = ka0Var.d;
        this.h = ka0Var.h;
        this.i = ka0Var.i;
        this.j = ka0Var.j;
        this.k = ka0Var.k;
        this.l = ka0Var.l;
        if (ka0Var.r != null) {
            this.r = new HashMap<>(ka0Var.r);
        }
        this.e = ka0Var.e;
        this.n = ka0Var.n;
        this.o = ka0Var.o;
        this.p = ka0Var.p;
        this.q = ka0Var.q;
        this.m = ka0Var.m;
        this.f = ka0Var.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ka0(ka0 ka0Var, vca vcaVar) {
        super(ka0Var);
        this.b = vcaVar;
        this.c = ka0Var.c;
        this.h = ka0Var.h;
        this.g = ka0Var.g;
        this.d = ka0Var.d;
        this.i = ka0Var.i;
        this.j = ka0Var.j;
        this.k = ka0Var.k;
        this.l = ka0Var.l;
        if (ka0Var.r != null) {
            this.r = new HashMap<>(ka0Var.r);
        }
        this.e = ka0Var.e;
        this.n = ka0Var.n;
        this.o = ka0Var.o;
        this.p = ka0Var.p;
        this.q = ka0Var.q;
        this.m = ka0Var.m;
        this.f = ka0Var.f;
    }
}
