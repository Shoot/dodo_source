package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import im.threads.ui.fragments.ChatFragment;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: TypeFactory.java */
/* renamed from: rnb  reason: default package */
/* loaded from: classes2.dex */
public class rnb implements Serializable {
    private static final y85[] e = new y85[0];
    protected static final rnb f = new rnb();
    protected static final qnb g = qnb.j();
    private static final Class<?> h = String.class;
    private static final Class<?> i = Object.class;
    private static final Class<?> j = Comparable.class;
    private static final Class<?> k = Class.class;
    private static final Class<?> l = Enum.class;
    private static final Class<?> m = jb5.class;
    private static final Class<?> n;
    private static final Class<?> o;
    private static final Class<?> p;
    protected static final zla q;
    protected static final zla r;
    protected static final zla s;
    protected static final zla t;
    protected static final zla u;
    protected static final zla v;
    protected static final zla w;
    protected static final zla x;
    protected static final zla y;
    protected final yy5<Object, y85> a;
    protected final wnb[] b;
    protected final ynb c;
    protected final ClassLoader d;

    static {
        Class<?> cls = Boolean.TYPE;
        n = cls;
        Class<?> cls2 = Integer.TYPE;
        o = cls2;
        Class<?> cls3 = Long.TYPE;
        p = cls3;
        q = new zla(cls);
        r = new zla(cls2);
        s = new zla(cls3);
        t = new zla(String.class);
        u = new zla(Object.class);
        v = new zla(Comparable.class);
        w = new zla(Enum.class);
        x = new zla(Class.class);
        y = new zla(jb5.class);
    }

    private rnb() {
        this(null);
    }

    private boolean E(y85 y85Var, y85 y85Var2) {
        if (y85Var2 instanceof lb8) {
            ((lb8) y85Var2).J0(y85Var);
            return true;
        } else if (y85Var.u() != y85Var2.u()) {
            return false;
        } else {
            List<y85> m2 = y85Var.l().m();
            List<y85> m3 = y85Var2.l().m();
            int size = m2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!E(m2.get(i2), m3.get(i2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static rnb S() {
        return f;
    }

    private qnb b(y85 y85Var, int i2, Class<?> cls, boolean z) {
        lb8[] lb8VarArr = new lb8[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            lb8VarArr[i3] = new lb8(i3);
        }
        y85 k2 = j(null, cls, qnb.d(cls, lb8VarArr)).k(y85Var.u());
        if (k2 != null) {
            String x2 = x(y85Var, k2);
            if (x2 != null && !z) {
                throw new IllegalArgumentException("Failed to specialize base type " + y85Var.e() + " as " + cls.getName() + ", problem: " + x2);
            }
            y85[] y85VarArr = new y85[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                y85 I0 = lb8VarArr[i4].I0();
                if (I0 == null) {
                    I0 = b0();
                }
                y85VarArr[i4] = I0;
            }
            return qnb.d(cls, y85VarArr);
        }
        throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", y85Var.u().getName(), cls.getName()));
    }

    public static y85 b0() {
        return S().y();
    }

    private y85 c(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        y85 y85Var2;
        List<y85> m2 = qnbVar.m();
        if (m2.isEmpty()) {
            y85Var2 = y();
        } else if (m2.size() == 1) {
            y85Var2 = m2.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
        }
        return fc1.L0(cls, qnbVar, y85Var, y85VarArr, y85Var2);
    }

    private y85 q(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        y85 y2;
        y85 y85Var2;
        y85 y85Var3;
        String str;
        if (cls == Properties.class) {
            y2 = t;
        } else {
            List<y85> m2 = qnbVar.m();
            int size = m2.size();
            if (size != 0) {
                if (size != 2) {
                    Object[] objArr = new Object[4];
                    objArr[0] = q81.R(cls);
                    objArr[1] = Integer.valueOf(size);
                    if (size == 1) {
                        str = "";
                    } else {
                        str = Image.TYPE_SMALL;
                    }
                    objArr[2] = str;
                    objArr[3] = qnbVar;
                    throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", objArr));
                }
                y85Var2 = m2.get(1);
                y85Var3 = m2.get(0);
                return t76.M0(cls, qnbVar, y85Var, y85VarArr, y85Var3, y85Var2);
            }
            y2 = y();
        }
        y85Var3 = y2;
        y85Var2 = y85Var3;
        return t76.M0(cls, qnbVar, y85Var, y85VarArr, y85Var3, y85Var2);
    }

    private y85 s(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        y85 y85Var2;
        List<y85> m2 = qnbVar.m();
        if (m2.isEmpty()) {
            y85Var2 = y();
        } else if (m2.size() == 1) {
            y85Var2 = m2.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
        }
        return ga9.L0(cls, qnbVar, y85Var, y85VarArr, y85Var2);
    }

    private String x(y85 y85Var, y85 y85Var2) throws IllegalArgumentException {
        y85 b0;
        List<y85> m2 = y85Var.l().m();
        List<y85> m3 = y85Var2.l().m();
        int size = m3.size();
        int size2 = m2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            y85 y85Var3 = m2.get(i2);
            if (i2 < size) {
                b0 = m3.get(i2);
            } else {
                b0 = b0();
            }
            if (!E(y85Var3, b0) && !y85Var3.K(Object.class) && ((i2 != 0 || !y85Var.Z() || !b0.K(Object.class)) && (!y85Var3.T() || !y85Var3.h0(b0.u())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i2 + 1), Integer.valueOf(size2), y85Var3.e(), b0.e());
            }
        }
        return null;
    }

    public fc1 G(Class<? extends Collection> cls, y85 y85Var) {
        qnb f2 = qnb.f(cls, y85Var);
        fc1 fc1Var = (fc1) j(null, cls, f2);
        if (f2.o() && y85Var != null) {
            y85 m2 = fc1Var.k(Collection.class).m();
            if (!m2.equals(y85Var)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", q81.R(cls), y85Var, m2));
            }
        }
        return fc1Var;
    }

    public fc1 H(Class<? extends Collection> cls, Class<?> cls2) {
        return G(cls, j(null, cls2, g));
    }

    public y85 K(y85 y85Var, Class<?> cls) {
        Class<?> u2 = y85Var.u();
        if (u2 == cls) {
            return y85Var;
        }
        y85 k2 = y85Var.k(cls);
        if (k2 == null) {
            if (!cls.isAssignableFrom(u2)) {
                throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), y85Var));
            }
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), y85Var));
        }
        return k2;
    }

    public t76 L(Class<? extends Map> cls, y85 y85Var, y85 y85Var2) {
        qnb i2 = qnb.i(cls, new y85[]{y85Var, y85Var2});
        t76 t76Var = (t76) j(null, cls, i2);
        if (i2.o()) {
            y85 k2 = t76Var.k(Map.class);
            y85 s2 = k2.s();
            if (s2.equals(y85Var)) {
                y85 m2 = k2.m();
                if (!m2.equals(y85Var2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", q81.R(cls), y85Var2, m2));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", q81.R(cls), y85Var, s2));
            }
        }
        return t76Var;
    }

    public t76 M(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        y85 j2;
        y85 j3;
        if (cls == Properties.class) {
            j2 = t;
            j3 = j2;
        } else {
            qnb qnbVar = g;
            j2 = j(null, cls2, qnbVar);
            j3 = j(null, cls3, qnbVar);
        }
        return L(cls, j2, j3);
    }

    public y85 N(y85 y85Var, Class<?> cls) throws IllegalArgumentException {
        return P(y85Var, cls, false);
    }

    public y85 P(y85 y85Var, Class<?> cls, boolean z) throws IllegalArgumentException {
        y85 j2;
        Class<?> u2 = y85Var.u();
        if (u2 == cls) {
            return y85Var;
        }
        if (u2 == Object.class) {
            j2 = j(null, cls, g);
        } else if (u2.isAssignableFrom(cls)) {
            if (y85Var.N()) {
                if (y85Var.Z()) {
                    if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                        j2 = j(null, cls, qnb.c(cls, y85Var.s(), y85Var.m()));
                    }
                } else if (y85Var.M()) {
                    if (cls != ArrayList.class && cls != LinkedList.class && cls != HashSet.class && cls != TreeSet.class) {
                        if (u2 == EnumSet.class) {
                            return y85Var;
                        }
                    } else {
                        j2 = j(null, cls, qnb.b(cls, y85Var.m()));
                    }
                }
            }
            if (y85Var.l().o()) {
                j2 = j(null, cls, g);
            } else {
                int length = cls.getTypeParameters().length;
                if (length == 0) {
                    j2 = j(null, cls, g);
                } else {
                    j2 = j(null, cls, b(y85Var, length, cls, z));
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Class %s not subtype of %s", q81.R(cls), q81.D(y85Var)));
        }
        return j2.o0(y85Var);
    }

    public y85 Q(Type type) {
        return f(null, type, g);
    }

    public y85[] T(y85 y85Var, Class<?> cls) {
        y85 k2 = y85Var.k(cls);
        if (k2 == null) {
            return e;
        }
        return k2.l().r();
    }

    public y85 W(Type type, qnb qnbVar) {
        return f(null, type, qnbVar);
    }

    @Deprecated
    public y85 Z(Class<?> cls) {
        return d(cls, g, null, null);
    }

    protected y85 a(Type type, y85 y85Var) {
        if (this.b == null) {
            return y85Var;
        }
        y85Var.l();
        wnb[] wnbVarArr = this.b;
        if (wnbVarArr.length <= 0) {
            return y85Var;
        }
        wnb wnbVar = wnbVarArr[0];
        throw null;
    }

    protected y85 d(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        y85 e2;
        if (qnbVar.o() && (e2 = e(cls)) != null) {
            return e2;
        }
        return r(cls, qnbVar, y85Var, y85VarArr);
    }

    protected y85 e(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == n) {
                return q;
            }
            if (cls == o) {
                return r;
            }
            if (cls == p) {
                return s;
            }
            return null;
        } else if (cls == h) {
            return t;
        } else {
            if (cls == i) {
                return u;
            }
            if (cls == m) {
                return y;
            }
            return null;
        }
    }

    protected y85 f(p81 p81Var, Type type, qnb qnbVar) {
        String obj;
        y85 o2;
        if (type instanceof Class) {
            o2 = j(p81Var, (Class) type, g);
        } else if (type instanceof ParameterizedType) {
            o2 = k(p81Var, (ParameterizedType) type, qnbVar);
        } else if (type instanceof y85) {
            return (y85) type;
        } else {
            if (type instanceof GenericArrayType) {
                o2 = i(p81Var, (GenericArrayType) type, qnbVar);
            } else if (type instanceof TypeVariable) {
                o2 = l(p81Var, (TypeVariable) type, qnbVar);
            } else if (type instanceof WildcardType) {
                o2 = o(p81Var, (WildcardType) type, qnbVar);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized Type: ");
                if (type == null) {
                    obj = "[null]";
                } else {
                    obj = type.toString();
                }
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return a(type, o2);
    }

    protected y85 i(p81 p81Var, GenericArrayType genericArrayType, qnb qnbVar) {
        return rr.F0(f(p81Var, genericArrayType.getGenericComponentType(), qnbVar), qnbVar);
    }

    protected y85 j(p81 p81Var, Class<?> cls, qnb qnbVar) {
        Object obj;
        p81 b;
        y85 u2;
        y85[] w2;
        y85 y85Var;
        y85 e2 = e(cls);
        if (e2 != null) {
            return e2;
        }
        if (qnbVar != null && !qnbVar.o()) {
            obj = qnbVar.a(cls);
        } else {
            obj = cls;
        }
        y85 y85Var2 = this.a.get(obj);
        if (y85Var2 != null) {
            return y85Var2;
        }
        if (p81Var == null) {
            b = new p81(cls);
        } else {
            p81 c = p81Var.c(cls);
            if (c != null) {
                jj9 jj9Var = new jj9(cls, g);
                c.a(jj9Var);
                return jj9Var;
            }
            b = p81Var.b(cls);
        }
        if (cls.isArray()) {
            y85Var = rr.F0(f(b, cls.getComponentType(), qnbVar), qnbVar);
        } else {
            if (cls.isInterface()) {
                w2 = w(b, cls, qnbVar);
                u2 = null;
            } else {
                u2 = u(b, cls, qnbVar);
                w2 = w(b, cls, qnbVar);
            }
            y85[] y85VarArr = w2;
            y85 y85Var3 = u2;
            if (cls == Properties.class) {
                zla zlaVar = t;
                y85Var2 = t76.M0(cls, qnbVar, y85Var3, y85VarArr, zlaVar, zlaVar);
            } else if (y85Var3 != null) {
                y85Var2 = y85Var3.j0(cls, qnbVar, y85Var3, y85VarArr);
            }
            if (y85Var2 == null && (y85Var2 = m(b, cls, qnbVar, y85Var3, y85VarArr)) == null && (y85Var2 = n(b, cls, qnbVar, y85Var3, y85VarArr)) == null) {
                y85Var = r(cls, qnbVar, y85Var3, y85VarArr);
            } else {
                y85Var = y85Var2;
            }
        }
        b.d(y85Var);
        if (!y85Var.H()) {
            this.a.putIfAbsent(obj, y85Var);
        }
        return y85Var;
    }

    protected y85 k(p81 p81Var, ParameterizedType parameterizedType, qnb qnbVar) {
        int length;
        qnb d;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == l) {
            return w;
        }
        if (cls == j) {
            return v;
        }
        if (cls == k) {
            return x;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments == null) {
            length = 0;
        } else {
            length = actualTypeArguments.length;
        }
        if (length == 0) {
            d = g;
        } else {
            y85[] y85VarArr = new y85[length];
            for (int i2 = 0; i2 < length; i2++) {
                y85VarArr[i2] = f(p81Var, actualTypeArguments[i2], qnbVar);
            }
            d = qnb.d(cls, y85VarArr);
        }
        return j(p81Var, cls, d);
    }

    protected y85 l(p81 p81Var, TypeVariable<?> typeVariable, qnb qnbVar) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (qnbVar != null) {
            y85 k2 = qnbVar.k(name);
            if (k2 != null) {
                return k2;
            }
            if (qnbVar.n(name)) {
                return u;
            }
            qnb s2 = qnbVar.s(name);
            synchronized (typeVariable) {
                bounds = typeVariable.getBounds();
            }
            return f(p81Var, bounds[0], s2);
        }
        throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
    }

    protected y85 m(p81 p81Var, Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        if (qnbVar == null) {
            qnbVar = g;
        }
        if (cls == Map.class) {
            return q(cls, qnbVar, y85Var, y85VarArr);
        }
        if (cls == Collection.class) {
            return c(cls, qnbVar, y85Var, y85VarArr);
        }
        if (cls == AtomicReference.class) {
            return s(cls, qnbVar, y85Var, y85VarArr);
        }
        return null;
    }

    protected y85 n(p81 p81Var, Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        for (y85 y85Var2 : y85VarArr) {
            y85 j0 = y85Var2.j0(cls, qnbVar, y85Var, y85VarArr);
            if (j0 != null) {
                return j0;
            }
        }
        return null;
    }

    protected y85 o(p81 p81Var, WildcardType wildcardType, qnb qnbVar) {
        return f(p81Var, wildcardType.getUpperBounds()[0], qnbVar);
    }

    protected y85 r(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return new zla(cls, qnbVar, y85Var, y85VarArr);
    }

    protected y85 u(p81 p81Var, Class<?> cls, qnb qnbVar) {
        Type A = q81.A(cls);
        if (A == null) {
            return null;
        }
        return f(p81Var, A, qnbVar);
    }

    protected y85[] w(p81 p81Var, Class<?> cls, qnb qnbVar) {
        Type[] z = q81.z(cls);
        if (z != null && z.length != 0) {
            int length = z.length;
            y85[] y85VarArr = new y85[length];
            for (int i2 = 0; i2 < length; i2++) {
                y85VarArr[i2] = f(p81Var, z[i2], qnbVar);
            }
            return y85VarArr;
        }
        return e;
    }

    protected y85 y() {
        return u;
    }

    protected rnb(yy5<Object, y85> yy5Var) {
        this.a = yy5Var == null ? new zi5<>(16, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY) : yy5Var;
        this.c = new ynb(this);
        this.b = null;
        this.d = null;
    }
}
