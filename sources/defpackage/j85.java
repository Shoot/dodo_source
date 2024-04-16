package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ab5;
import defpackage.ba5;
import defpackage.cb5;
import defpackage.db5;
import defpackage.fa5;
import defpackage.fc5;
import defpackage.gc5;
import defpackage.ic5;
import defpackage.lc5;
import defpackage.lw1;
import defpackage.n85;
import defpackage.ql;
import defpackage.rc5;
import defpackage.sb5;
import defpackage.ta5;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: JacksonAnnotationIntrospector.java */
/* renamed from: j85  reason: default package */
/* loaded from: classes2.dex */
public class j85 extends ql implements Serializable {
    private static final Class<? extends Annotation>[] c = {fc5.class, bd5.class, ta5.class, rc5.class, vb5.class, uc5.class, ea5.class, gb5.class};
    private static final Class<? extends Annotation>[] d = {ma5.class, bd5.class, ta5.class, rc5.class, uc5.class, ea5.class, gb5.class, hb5.class};
    private static final v85 e;
    protected transient zi5<Class<?>, Boolean> a = new zi5<>(48, 48);
    protected boolean b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JacksonAnnotationIntrospector.java */
    /* renamed from: j85$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fc5.a.values().length];
            a = iArr;
            try {
                iArr[fc5.a.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[fc5.a.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[fc5.a.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[fc5.a.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[fc5.a.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        v85 v85Var;
        try {
            v85Var = v85.d();
        } catch (Throwable unused) {
            v85Var = null;
        }
        e = v85Var;
    }

    private JsonMappingException c1(String str) {
        return new JsonMappingException(null, str);
    }

    private JsonMappingException d1(Throwable th, String str) {
        return new JsonMappingException(null, str, th);
    }

    private final Boolean f1(al alVar) {
        ub5 ub5Var = (ub5) a(alVar, ub5.class);
        if (ub5Var != null && ub5Var.alphabetic()) {
            return Boolean.TRUE;
        }
        return null;
    }

    private boolean i1(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            if (cls == q81.T(cls2)) {
                return true;
            }
            return false;
        } else if (cls2.isPrimitive() && cls2 == q81.T(cls)) {
            return true;
        } else {
            return false;
        }
    }

    private cb5.b k1(al alVar, cb5.b bVar) {
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        if (fc5Var != null) {
            int i = a.a[fc5Var.include().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return bVar.q(cb5.a.NON_EMPTY);
                        }
                    } else {
                        return bVar.q(cb5.a.NON_DEFAULT);
                    }
                } else {
                    return bVar.q(cb5.a.NON_NULL);
                }
            } else {
                return bVar.q(cb5.a.ALWAYS);
            }
        }
        return bVar;
    }

    @Override // defpackage.ql
    public c57 E(al alVar) {
        xa5 xa5Var = (xa5) a(alVar, xa5.class);
        if (xa5Var != null && xa5Var.generator() != a57.class) {
            return new c57(vq8.a(xa5Var.property()), xa5Var.scope(), xa5Var.generator(), xa5Var.resolver());
        }
        return null;
    }

    @Override // defpackage.ql
    public Boolean F0(al alVar) {
        z95 z95Var = (z95) a(alVar, z95.class);
        if (z95Var == null) {
            return null;
        }
        return Boolean.valueOf(z95Var.enabled());
    }

    @Override // defpackage.ql
    public c57 G(al alVar, c57 c57Var) {
        ya5 ya5Var = (ya5) a(alVar, ya5.class);
        if (ya5Var == null) {
            return c57Var;
        }
        if (c57Var == null) {
            c57Var = c57.a();
        }
        return c57Var.f(ya5Var.alwaysAsId());
    }

    @Override // defpackage.ql
    public sb5.a H(al alVar) {
        sb5 sb5Var = (sb5) a(alVar, sb5.class);
        if (sb5Var != null) {
            return sb5Var.access();
        }
        return null;
    }

    @Override // defpackage.ql
    @Deprecated
    public boolean I0(il ilVar) {
        return b(ilVar, z95.class);
    }

    @Override // defpackage.ql
    public Boolean J0(al alVar) {
        aa5 aa5Var = (aa5) a(alVar, aa5.class);
        if (aa5Var == null) {
            return null;
        }
        return Boolean.valueOf(aa5Var.enabled());
    }

    @Override // defpackage.ql
    public aob<?> K(w76<?> w76Var, hl hlVar, y85 y85Var) {
        if (y85Var.m() != null) {
            return g1(w76Var, hlVar, y85Var);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + y85Var + ")");
    }

    @Override // defpackage.ql
    public Boolean K0(w76<?> w76Var, al alVar) {
        eb5 eb5Var = (eb5) a(alVar, eb5.class);
        if (eb5Var == null) {
            return null;
        }
        return Boolean.valueOf(eb5Var.value());
    }

    @Override // defpackage.ql
    public String L(al alVar) {
        sb5 sb5Var = (sb5) a(alVar, sb5.class);
        if (sb5Var == null) {
            return null;
        }
        String defaultValue = sb5Var.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    @Override // defpackage.ql
    public Boolean L0(al alVar) {
        yc5 yc5Var = (yc5) a(alVar, yc5.class);
        if (yc5Var == null) {
            return null;
        }
        return Boolean.valueOf(yc5Var.value());
    }

    @Override // defpackage.ql
    public String M(al alVar) {
        tb5 tb5Var = (tb5) a(alVar, tb5.class);
        if (tb5Var == null) {
            return null;
        }
        return tb5Var.value();
    }

    @Override // defpackage.ql
    @Deprecated
    public boolean M0(il ilVar) {
        yc5 yc5Var = (yc5) a(ilVar, yc5.class);
        if (yc5Var != null && yc5Var.value()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ql
    public ab5.a N(w76<?> w76Var, al alVar) {
        ab5 ab5Var = (ab5) a(alVar, ab5.class);
        if (ab5Var == null) {
            return ab5.a.f();
        }
        return ab5.a.j(ab5Var);
    }

    @Override // defpackage.ql
    @Deprecated
    public boolean N0(al alVar) {
        v85 v85Var;
        Boolean c2;
        fa5 fa5Var = (fa5) a(alVar, fa5.class);
        if (fa5Var != null) {
            if (fa5Var.mode() == fa5.a.DISABLED) {
                return false;
            }
            return true;
        } else if (!this.b || !(alVar instanceof dl) || (v85Var = e) == null || (c2 = v85Var.c(alVar)) == null) {
            return false;
        } else {
            return c2.booleanValue();
        }
    }

    @Override // defpackage.ql
    public boolean O0(hl hlVar) {
        return h1(hlVar);
    }

    @Override // defpackage.ql
    @Deprecated
    public ab5.a P(al alVar) {
        return N(null, alVar);
    }

    @Override // defpackage.ql
    public Boolean P0(hl hlVar) {
        sb5 sb5Var = (sb5) a(hlVar, sb5.class);
        if (sb5Var != null) {
            return Boolean.valueOf(sb5Var.required());
        }
        return null;
    }

    @Override // defpackage.ql
    public cb5.b Q(al alVar) {
        cb5.b d2;
        cb5 cb5Var = (cb5) a(alVar, cb5.class);
        if (cb5Var == null) {
            d2 = cb5.b.c();
        } else {
            d2 = cb5.b.d(cb5Var);
        }
        if (d2.j() == cb5.a.USE_DEFAULTS) {
            return k1(alVar, d2);
        }
        return d2;
    }

    @Override // defpackage.ql
    public boolean Q0(Annotation annotation) {
        boolean z;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean bool = this.a.get(annotationType);
        if (bool == null) {
            if (annotationType.getAnnotation(k85.class) != null) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            this.a.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    @Override // defpackage.ql
    public Boolean R0(bl blVar) {
        bb5 bb5Var = (bb5) a(blVar, bb5.class);
        if (bb5Var == null) {
            return null;
        }
        return Boolean.valueOf(bb5Var.value());
    }

    @Override // defpackage.ql
    public db5.a S(w76<?> w76Var, al alVar) {
        db5 db5Var = (db5) a(alVar, db5.class);
        if (db5Var == null) {
            return db5.a.c();
        }
        return db5.a.d(db5Var);
    }

    @Override // defpackage.ql
    public Boolean S0(hl hlVar) {
        return Boolean.valueOf(b(hlVar, pc5.class));
    }

    @Override // defpackage.ql
    public Integer T(al alVar) {
        int index;
        sb5 sb5Var = (sb5) a(alVar, sb5.class);
        if (sb5Var != null && (index = sb5Var.index()) != -1) {
            return Integer.valueOf(index);
        }
        return null;
    }

    @Override // defpackage.ql
    public y85 U0(w76<?> w76Var, al alVar, y85 y85Var) throws JsonMappingException {
        Class<?> W0;
        y85 p0;
        Class<?> W02;
        y85 p02;
        rnb M = w76Var.M();
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        Class<?> cls = null;
        if (fc5Var == null) {
            W0 = null;
        } else {
            W0 = W0(fc5Var.as());
        }
        if (W0 != null) {
            if (y85Var.K(W0)) {
                y85Var = y85Var.p0();
            } else {
                Class<?> u = y85Var.u();
                try {
                    if (W0.isAssignableFrom(u)) {
                        y85Var = M.K(y85Var, W0);
                    } else if (u.isAssignableFrom(W0)) {
                        y85Var = M.N(y85Var, W0);
                    } else if (i1(u, W0)) {
                        y85Var = y85Var.p0();
                    } else {
                        throw c1(String.format("Cannot refine serialization type %s into %s; types not related", y85Var, W0.getName()));
                    }
                } catch (IllegalArgumentException e2) {
                    throw d1(e2, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", y85Var, W0.getName(), alVar.getName(), e2.getMessage()));
                }
            }
        }
        if (y85Var.Z()) {
            y85 s = y85Var.s();
            if (fc5Var == null) {
                W02 = null;
            } else {
                W02 = W0(fc5Var.keyAs());
            }
            if (W02 != null) {
                if (s.K(W02)) {
                    p02 = s.p0();
                } else {
                    Class<?> u2 = s.u();
                    try {
                        if (W02.isAssignableFrom(u2)) {
                            p02 = M.K(s, W02);
                        } else if (u2.isAssignableFrom(W02)) {
                            p02 = M.N(s, W02);
                        } else if (i1(u2, W02)) {
                            p02 = s.p0();
                        } else {
                            throw c1(String.format("Cannot refine serialization key type %s into %s; types not related", s, W02.getName()));
                        }
                    } catch (IllegalArgumentException e3) {
                        throw d1(e3, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", y85Var, W02.getName(), alVar.getName(), e3.getMessage()));
                    }
                }
                y85Var = ((q66) y85Var).I0(p02);
            }
        }
        y85 m = y85Var.m();
        if (m != null) {
            if (fc5Var != null) {
                cls = W0(fc5Var.contentAs());
            }
            if (cls != null) {
                if (m.K(cls)) {
                    p0 = m.p0();
                } else {
                    Class<?> u3 = m.u();
                    try {
                        if (cls.isAssignableFrom(u3)) {
                            p0 = M.K(m, cls);
                        } else if (u3.isAssignableFrom(cls)) {
                            p0 = M.N(m, cls);
                        } else if (i1(u3, cls)) {
                            p0 = m.p0();
                        } else {
                            throw c1(String.format("Cannot refine serialization content type %s into %s; types not related", m, cls.getName()));
                        }
                    } catch (IllegalArgumentException e4) {
                        throw d1(e4, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", y85Var, cls.getName(), alVar.getName(), e4.getMessage()));
                    }
                }
                return y85Var.m0(p0);
            }
            return y85Var;
        }
        return y85Var;
    }

    @Override // defpackage.ql
    public il V0(w76<?> w76Var, il ilVar, il ilVar2) {
        Class<?> E = ilVar.E(0);
        Class<?> E2 = ilVar2.E(0);
        if (E.isPrimitive()) {
            if (E2.isPrimitive()) {
                return null;
            }
            return ilVar;
        } else if (E2.isPrimitive()) {
            return ilVar2;
        } else {
            if (E == String.class) {
                if (E2 != String.class) {
                    return ilVar;
                }
            } else if (E2 == String.class) {
                return ilVar2;
            }
            return null;
        }
    }

    @Override // defpackage.ql
    public aob<?> W(w76<?> w76Var, hl hlVar, y85 y85Var) {
        if (!y85Var.N() && !y85Var.c()) {
            return g1(w76Var, hlVar, y85Var);
        }
        return null;
    }

    protected Class<?> W0(Class<?> cls) {
        if (cls != null && !q81.G(cls)) {
            return cls;
        }
        return null;
    }

    protected Class<?> X0(Class<?> cls, Class<?> cls2) {
        Class<?> W0 = W0(cls);
        if (W0 == null || W0 == cls2) {
            return null;
        }
        return W0;
    }

    protected exa Y0() {
        return exa.l();
    }

    @Override // defpackage.ql
    public ql.a Z(hl hlVar) {
        gb5 gb5Var = (gb5) a(hlVar, gb5.class);
        if (gb5Var != null) {
            return ql.a.c(gb5Var.value());
        }
        ea5 ea5Var = (ea5) a(hlVar, ea5.class);
        if (ea5Var != null) {
            return ql.a.a(ea5Var.value());
        }
        return null;
    }

    protected exa Z0() {
        return new exa();
    }

    protected ka0 a1(ba5.a aVar, w76<?> w76Var, bl blVar, y85 y85Var) {
        uq8 uq8Var;
        if (aVar.required()) {
            uq8Var = uq8.h;
        } else {
            uq8Var = uq8.i;
        }
        String value = aVar.value();
        vq8 j1 = j1(aVar.propName(), aVar.propNamespace());
        if (!j1.e()) {
            j1 = vq8.a(value);
        }
        return ez.S(value, xka.D(w76Var, new p1c(blVar, blVar.c(), value, y85Var), j1, uq8Var, aVar.include()), blVar.n(), y85Var);
    }

    @Override // defpackage.ql
    public vq8 b0(w76<?> w76Var, fl flVar, vq8 vq8Var) {
        return null;
    }

    protected ka0 b1(ba5.b bVar, w76<?> w76Var, bl blVar) {
        uq8 uq8Var;
        if (bVar.required()) {
            uq8Var = uq8.h;
        } else {
            uq8Var = uq8.i;
        }
        vq8 j1 = j1(bVar.name(), bVar.namespace());
        y85 e2 = w76Var.e(bVar.type());
        xka D = xka.D(w76Var, new p1c(blVar, blVar.c(), j1.c(), e2), j1, uq8Var, bVar.include());
        Class<? extends q1c> value = bVar.value();
        w76Var.E();
        return ((q1c) q81.k(value, w76Var.b())).Q(w76Var, blVar, D, e2);
    }

    @Override // defpackage.ql
    public void d(w76<?> w76Var, bl blVar, List<ka0> list) {
        ba5 ba5Var = (ba5) a(blVar, ba5.class);
        if (ba5Var == null) {
            return;
        }
        boolean prepend = ba5Var.prepend();
        ba5.a[] attrs = ba5Var.attrs();
        int length = attrs.length;
        y85 y85Var = null;
        for (int i = 0; i < length; i++) {
            if (y85Var == null) {
                y85Var = w76Var.e(Object.class);
            }
            ka0 a1 = a1(attrs[i], w76Var, blVar, y85Var);
            if (prepend) {
                list.add(i, a1);
            } else {
                list.add(a1);
            }
        }
        ba5.b[] props = ba5Var.props();
        int length2 = props.length;
        for (int i2 = 0; i2 < length2; i2++) {
            ka0 b1 = b1(props[i2], w76Var, blVar);
            if (prepend) {
                list.add(i2, b1);
            } else {
                list.add(b1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [v1c<?>, v1c] */
    @Override // defpackage.ql
    public v1c<?> e(bl blVar, v1c<?> v1cVar) {
        da5 da5Var = (da5) a(blVar, da5.class);
        if (da5Var != null) {
            return v1cVar.a(da5Var);
        }
        return v1cVar;
    }

    @Override // defpackage.ql
    public vq8 e0(bl blVar) {
        bc5 bc5Var = (bc5) a(blVar, bc5.class);
        String str = null;
        if (bc5Var == null) {
            return null;
        }
        String namespace = bc5Var.namespace();
        if (namespace == null || !namespace.isEmpty()) {
            str = namespace;
        }
        return vq8.b(bc5Var.value(), str);
    }

    protected vq8 e1(al alVar) {
        v85 v85Var;
        vq8 a2;
        if (alVar instanceof ll) {
            ll llVar = (ll) alVar;
            if (llVar.r() != null && (v85Var = e) != null && (a2 = v85Var.a(llVar)) != null) {
                return a2;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.ql
    public Object f(al alVar) {
        Class<? extends gc5> contentUsing;
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        if (fc5Var != null && (contentUsing = fc5Var.contentUsing()) != gc5.a.class) {
            return contentUsing;
        }
        return null;
    }

    @Override // defpackage.ql
    public Object f0(hl hlVar) {
        fc5 fc5Var = (fc5) a(hlVar, fc5.class);
        if (fc5Var == null) {
            return null;
        }
        return X0(fc5Var.contentConverter(), lw1.a.class);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [aob] */
    protected aob<?> g1(w76<?> w76Var, al alVar, y85 y85Var) {
        aob<?> Z0;
        rc5 rc5Var = (rc5) a(alVar, rc5.class);
        tc5 tc5Var = (tc5) a(alVar, tc5.class);
        snb snbVar = null;
        if (tc5Var != null) {
            if (rc5Var == null) {
                return null;
            }
            Z0 = w76Var.Z(alVar, tc5Var.value());
        } else if (rc5Var == null) {
            return null;
        } else {
            if (rc5Var.use() == rc5.b.NONE) {
                return Y0();
            }
            Z0 = Z0();
        }
        qc5 qc5Var = (qc5) a(alVar, qc5.class);
        if (qc5Var != null) {
            snbVar = w76Var.W(alVar, qc5Var.value());
        }
        if (snbVar != null) {
            snbVar.b(y85Var);
        }
        ?? f = Z0.f(rc5Var.use(), snbVar);
        rc5.a include = rc5Var.include();
        if (include == rc5.a.EXTERNAL_PROPERTY && (alVar instanceof bl)) {
            include = rc5.a.PROPERTY;
        }
        aob b = f.d(include).b(rc5Var.property());
        Class<?> defaultImpl = rc5Var.defaultImpl();
        if (defaultImpl != rc5.c.class && !defaultImpl.isAnnotation()) {
            b = b.c(defaultImpl);
        }
        return b.a(rc5Var.visible());
    }

    @Override // defpackage.ql
    public Object h0(al alVar) {
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        if (fc5Var == null) {
            return null;
        }
        return X0(fc5Var.converter(), lw1.a.class);
    }

    protected boolean h1(al alVar) {
        Boolean b;
        za5 za5Var = (za5) a(alVar, za5.class);
        if (za5Var != null) {
            return za5Var.value();
        }
        v85 v85Var = e;
        if (v85Var != null && (b = v85Var.b(alVar)) != null) {
            return b.booleanValue();
        }
        return false;
    }

    @Override // defpackage.ql
    public fa5.a i(w76<?> w76Var, al alVar) {
        v85 v85Var;
        Boolean c2;
        fa5 fa5Var = (fa5) a(alVar, fa5.class);
        if (fa5Var != null) {
            return fa5Var.mode();
        }
        if (this.b && w76Var.S(y76.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (alVar instanceof dl) && (v85Var = e) != null && (c2 = v85Var.c(alVar)) != null && c2.booleanValue()) {
            return fa5.a.PROPERTIES;
        }
        return null;
    }

    @Override // defpackage.ql
    @Deprecated
    public fa5.a j(al alVar) {
        fa5 fa5Var = (fa5) a(alVar, fa5.class);
        if (fa5Var == null) {
            return null;
        }
        return fa5Var.mode();
    }

    @Override // defpackage.ql
    public String[] j0(bl blVar) {
        ub5 ub5Var = (ub5) a(blVar, ub5.class);
        if (ub5Var == null) {
            return null;
        }
        return ub5Var.value();
    }

    protected vq8 j1(String str, String str2) {
        if (str.isEmpty()) {
            return vq8.d;
        }
        if (str2 != null && !str2.isEmpty()) {
            return vq8.b(str, str2);
        }
        return vq8.a(str);
    }

    @Override // defpackage.ql
    public String[] k(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        Field[] declaredFields;
        sb5 sb5Var;
        HashMap hashMap = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (sb5Var = (sb5) field.getAnnotation(sb5.class)) != null) {
                String value = sb5Var.value();
                if (!value.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), value);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) hashMap.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    @Override // defpackage.ql
    public Object l(al alVar) {
        sa5 sa5Var = (sa5) a(alVar, sa5.class);
        if (sa5Var != null) {
            String value = sa5Var.value();
            if (!value.isEmpty()) {
                return value;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.ql
    public Boolean l0(al alVar) {
        return f1(alVar);
    }

    @Override // defpackage.ql
    public ta5.d m(al alVar) {
        ta5 ta5Var = (ta5) a(alVar, ta5.class);
        if (ta5Var == null) {
            return null;
        }
        return ta5.d.d(ta5Var);
    }

    @Override // defpackage.ql
    public fc5.b m0(al alVar) {
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        if (fc5Var == null) {
            return null;
        }
        return fc5Var.typing();
    }

    @Override // defpackage.ql
    public String n(hl hlVar) {
        vq8 e1 = e1(hlVar);
        if (e1 == null) {
            return null;
        }
        return e1.c();
    }

    @Override // defpackage.ql
    public Object n0(al alVar) {
        Class<? extends gc5> using;
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        if (fc5Var != null && (using = fc5Var.using()) != gc5.a.class) {
            return using;
        }
        vb5 vb5Var = (vb5) a(alVar, vb5.class);
        if (vb5Var != null && vb5Var.value()) {
            return new e79(alVar.c());
        }
        return null;
    }

    @Override // defpackage.ql
    public n85.a o(hl hlVar) {
        String name;
        n85 n85Var = (n85) a(hlVar, n85.class);
        if (n85Var == null) {
            return null;
        }
        n85.a d2 = n85.a.d(n85Var);
        if (!d2.f()) {
            if (!(hlVar instanceof il)) {
                name = hlVar.c().getName();
            } else {
                il ilVar = (il) hlVar;
                if (ilVar.y() == 0) {
                    name = hlVar.c().getName();
                } else {
                    name = ilVar.E(0).getName();
                }
            }
            return d2.i(name);
        }
        return d2;
    }

    @Override // defpackage.ql
    public ic5.a o0(al alVar) {
        return ic5.a.d((ic5) a(alVar, ic5.class));
    }

    @Override // defpackage.ql
    public List<ss6> p0(al alVar) {
        lc5 lc5Var = (lc5) a(alVar, lc5.class);
        if (lc5Var == null) {
            return null;
        }
        lc5.a[] value = lc5Var.value();
        ArrayList arrayList = new ArrayList(value.length);
        for (lc5.a aVar : value) {
            arrayList.add(new ss6(aVar.value(), aVar.name()));
            for (String str : aVar.names()) {
                arrayList.add(new ss6(aVar.value(), str));
            }
        }
        return arrayList;
    }

    @Override // defpackage.ql
    @Deprecated
    public Object q(hl hlVar) {
        n85.a o = o(hlVar);
        if (o == null) {
            return null;
        }
        return o.e();
    }

    @Override // defpackage.ql
    public String q0(bl blVar) {
        sc5 sc5Var = (sc5) a(blVar, sc5.class);
        if (sc5Var == null) {
            return null;
        }
        return sc5Var.value();
    }

    @Override // defpackage.ql
    public Object r(al alVar) {
        Class<? extends gc5> keyUsing;
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        if (fc5Var != null && (keyUsing = fc5Var.keyUsing()) != gc5.a.class) {
            return keyUsing;
        }
        return null;
    }

    @Override // defpackage.ql
    public aob<?> r0(w76<?> w76Var, bl blVar, y85 y85Var) {
        return g1(w76Var, blVar, y85Var);
    }

    protected Object readResolve() {
        if (this.a == null) {
            this.a = new zi5<>(48, 48);
        }
        return this;
    }

    @Override // defpackage.ql
    public Boolean s(al alVar) {
        hb5 hb5Var = (hb5) a(alVar, hb5.class);
        if (hb5Var == null) {
            return null;
        }
        return hb5Var.value().a();
    }

    @Override // defpackage.ql
    public vq8 u(al alVar) {
        boolean z;
        ic5 ic5Var = (ic5) a(alVar, ic5.class);
        if (ic5Var != null) {
            String value = ic5Var.value();
            if (value.isEmpty()) {
                z = true;
            } else {
                return vq8.a(value);
            }
        } else {
            z = false;
        }
        sb5 sb5Var = (sb5) a(alVar, sb5.class);
        String str = null;
        if (sb5Var != null) {
            String namespace = sb5Var.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return vq8.b(sb5Var.value(), str);
        } else if (!z && !c(alVar, d)) {
            return null;
        } else {
            return vq8.d;
        }
    }

    @Override // defpackage.ql
    public vq8 w(al alVar) {
        boolean z;
        wa5 wa5Var = (wa5) a(alVar, wa5.class);
        if (wa5Var != null) {
            String value = wa5Var.value();
            if (!value.isEmpty()) {
                return vq8.a(value);
            }
            z = true;
        } else {
            z = false;
        }
        sb5 sb5Var = (sb5) a(alVar, sb5.class);
        String str = null;
        if (sb5Var != null) {
            String namespace = sb5Var.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return vq8.b(sb5Var.value(), str);
        } else if (!z && !c(alVar, c)) {
            return null;
        } else {
            return vq8.d;
        }
    }

    @Override // defpackage.ql
    public Object x(bl blVar) {
        ib5 ib5Var = (ib5) a(blVar, ib5.class);
        if (ib5Var == null) {
            return null;
        }
        return ib5Var.value();
    }

    @Override // defpackage.ql
    public ps6 x0(hl hlVar) {
        uc5 uc5Var = (uc5) a(hlVar, uc5.class);
        if (uc5Var != null && uc5Var.enabled()) {
            return ps6.b(uc5Var.prefix(), uc5Var.suffix());
        }
        return null;
    }

    @Override // defpackage.ql
    public Object y(al alVar) {
        Class<? extends gc5> nullsUsing;
        fc5 fc5Var = (fc5) a(alVar, fc5.class);
        if (fc5Var != null && (nullsUsing = fc5Var.nullsUsing()) != gc5.a.class) {
            return nullsUsing;
        }
        return null;
    }

    @Override // defpackage.ql
    public Class<?>[] z0(al alVar) {
        bd5 bd5Var = (bd5) a(alVar, bd5.class);
        if (bd5Var == null) {
            return null;
        }
        return bd5Var.value();
    }
}
