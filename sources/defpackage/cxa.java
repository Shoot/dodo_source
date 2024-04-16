package defpackage;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.cb5;
import defpackage.ta5;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: StdSerializer.java */
/* renamed from: cxa  reason: default package */
/* loaded from: classes2.dex */
public abstract class cxa<T> extends gc5<T> implements Serializable {
    private static final Object b = new Object();
    protected final Class<T> a;

    /* JADX INFO: Access modifiers changed from: protected */
    public cxa(Class<T> cls) {
        this.a = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean l(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean m(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public void E(bda bdaVar, Throwable th, Object obj, String str) throws IOException {
        boolean z;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        q81.V(th);
        if (bdaVar != null && !bdaVar.M0(qca.WRAP_EXCEPTIONS)) {
            z = false;
        } else {
            z = true;
        }
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            q81.X(th);
        }
        throw JsonMappingException.s(th, obj, str);
    }

    @Override // defpackage.gc5
    public Class<T> c() {
        return this.a;
    }

    @Override // defpackage.gc5
    public abstract void f(T t, ua5 ua5Var, bda bdaVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public gc5<?> n(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        Object f;
        if (ia0Var != null) {
            hl c = ia0Var.c();
            ql j0 = bdaVar.j0();
            if (c != null && (f = j0.f(c)) != null) {
                return bdaVar.T0(c, f);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gc5<?> o(bda bdaVar, ia0 ia0Var, gc5<?> gc5Var) throws JsonMappingException {
        Object obj = b;
        Map map = (Map) bdaVar.l0(obj);
        if (map != null) {
            if (map.get(ia0Var) != null) {
                return gc5Var;
            }
        } else {
            map = new IdentityHashMap();
            bdaVar.U0(obj, map);
        }
        map.put(ia0Var, Boolean.TRUE);
        try {
            gc5<?> q = q(bdaVar, ia0Var, gc5Var);
            if (q != null) {
                return bdaVar.I0(q, ia0Var);
            }
            return gc5Var;
        } finally {
            map.remove(ia0Var);
        }
    }

    @Deprecated
    protected gc5<?> q(bda bdaVar, ia0 ia0Var, gc5<?> gc5Var) throws JsonMappingException {
        hl c;
        Object f0;
        ql j0 = bdaVar.j0();
        if (l(j0, ia0Var) && (c = ia0Var.c()) != null && (f0 = j0.f0(c)) != null) {
            lw1<Object, Object> e = bdaVar.e(ia0Var.c(), f0);
            y85 a = e.a(bdaVar.i());
            if (gc5Var == null && !a.W()) {
                gc5Var = bdaVar.Z(a);
            }
            return new wwa(e, a, gc5Var);
        }
        return gc5Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean r(bda bdaVar, ia0 ia0Var, Class<?> cls, ta5.a aVar) {
        ta5.d s = s(bdaVar, ia0Var, cls);
        if (s != null) {
            return s.e(aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ta5.d s(bda bdaVar, ia0 ia0Var, Class<?> cls) {
        if (ia0Var != null) {
            return ia0Var.a(bdaVar.f(), cls);
        }
        return bdaVar.o0(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cb5.b u(bda bdaVar, ia0 ia0Var, Class<?> cls) {
        if (ia0Var != null) {
            return ia0Var.b(bdaVar.f(), cls);
        }
        return bdaVar.p0(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public tq8 w(bda bdaVar, Object obj, Object obj2) throws JsonMappingException {
        bdaVar.q0();
        Class<T> c = c();
        return (tq8) bdaVar.l(c, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x(gc5<?> gc5Var) {
        return q81.K(gc5Var);
    }

    public void y(bda bdaVar, Throwable th, Object obj, int i) throws IOException {
        boolean z;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        q81.V(th);
        if (bdaVar != null && !bdaVar.M0(qca.WRAP_EXCEPTIONS)) {
            z = false;
        } else {
            z = true;
        }
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            q81.X(th);
        }
        throw JsonMappingException.r(th, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cxa(y85 y85Var) {
        this.a = (Class<T>) y85Var.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public cxa(Class<?> cls, boolean z) {
        this.a = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cxa(cxa<?> cxaVar) {
        this.a = (Class<T>) cxaVar.a;
    }
}
