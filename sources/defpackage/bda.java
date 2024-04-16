package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import defpackage.cb5;
import defpackage.ta5;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: SerializerProvider.java */
/* renamed from: bda  reason: default package */
/* loaded from: classes2.dex */
public abstract class bda extends om2 {
    public static final gc5<Object> m = new vo3("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final gc5<Object> n = new wqb();
    protected final pca a;
    protected final Class<?> b;
    protected final zca c;
    protected final yca d;
    protected transient gu1 e;
    protected gc5<Object> f;
    protected gc5<Object> g;
    protected gc5<Object> h;
    protected gc5<Object> i;
    protected final j79 j;
    protected DateFormat k;
    protected final boolean l;

    public bda() {
        this.f = n;
        this.h = s37.c;
        this.i = m;
        this.a = null;
        this.c = null;
        this.d = new yca();
        this.j = null;
        this.b = null;
        this.e = null;
        this.l = true;
    }

    public final void E(Date date, ua5 ua5Var) throws IOException {
        if (M0(qca.WRITE_DATES_AS_TIMESTAMPS)) {
            ua5Var.p0(date.getTime());
        } else {
            ua5Var.q1(q().format(date));
        }
    }

    public gc5<Object> E0(Class<?> cls) {
        if (cls == Object.class) {
            return this.f;
        }
        return new wqb(cls);
    }

    public gc5<?> F0(gc5<?> gc5Var, ia0 ia0Var) throws JsonMappingException {
        if (gc5Var != null && (gc5Var instanceof bv1)) {
            return ((bv1) gc5Var).a(this, ia0Var);
        }
        return gc5Var;
    }

    public final void G(ua5 ua5Var) throws IOException {
        if (this.l) {
            ua5Var.l0();
        } else {
            this.h.f(null, ua5Var, this);
        }
    }

    public gc5<Object> H(y85 y85Var, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> d = this.j.d(y85Var);
        if (d == null && (d = this.d.g(y85Var)) == null && (d = m(y85Var)) == null) {
            return E0(y85Var.u());
        }
        return I0(d, ia0Var);
    }

    public gc5<?> I0(gc5<?> gc5Var, ia0 ia0Var) throws JsonMappingException {
        if (gc5Var != null && (gc5Var instanceof bv1)) {
            return ((bv1) gc5Var).a(this, ia0Var);
        }
        return gc5Var;
    }

    public abstract Object J0(ja0 ja0Var, Class<?> cls) throws JsonMappingException;

    public gc5<Object> K(Class<?> cls, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> e = this.j.e(cls);
        if (e == null && (e = this.d.h(cls)) == null && (e = this.d.g(this.a.e(cls))) == null && (e = n(cls)) == null) {
            return E0(cls);
        }
        return I0(e, ia0Var);
    }

    public abstract boolean K0(Object obj) throws JsonMappingException;

    public gc5<Object> L(y85 y85Var, ia0 ia0Var) throws JsonMappingException {
        return r(this.c.a(this, y85Var, this.g), ia0Var);
    }

    public final boolean L0(y76 y76Var) {
        return this.a.S(y76Var);
    }

    public gc5<Object> M(Class<?> cls, ia0 ia0Var) throws JsonMappingException {
        return L(this.a.e(cls), ia0Var);
    }

    public final boolean M0(qca qcaVar) {
        return this.a.K0(qcaVar);
    }

    public gc5<Object> N(y85 y85Var, ia0 ia0Var) throws JsonMappingException {
        return this.i;
    }

    @Deprecated
    public JsonMappingException N0(String str, Object... objArr) {
        return JsonMappingException.j(r0(), a(str, objArr));
    }

    public <T> T O0(Class<?> cls, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.w(r0(), str, d(cls)).o(th);
    }

    public gc5<Object> P(ia0 ia0Var) throws JsonMappingException {
        return this.h;
    }

    public <T> T P0(fa0 fa0Var, ja0 ja0Var, String str, Object... objArr) throws JsonMappingException {
        String str2;
        String a = a(str, objArr);
        String str3 = "N/A";
        if (ja0Var == null) {
            str2 = "N/A";
        } else {
            str2 = b(ja0Var.v());
        }
        if (fa0Var != null) {
            str3 = q81.R(fa0Var.i());
        }
        throw InvalidDefinitionException.u(r0(), String.format("Invalid definition for property %s (of type %s): %s", str2, str3, a), fa0Var, ja0Var);
    }

    public abstract b9c Q(Object obj, y47<?> y47Var);

    public <T> T Q0(fa0 fa0Var, String str, Object... objArr) throws JsonMappingException {
        String str2;
        if (fa0Var != null) {
            str2 = q81.R(fa0Var.i());
        } else {
            str2 = "N/A";
        }
        throw InvalidDefinitionException.u(r0(), String.format("Invalid type definition for type %s: %s", str2, a(str, objArr)), fa0Var, null);
    }

    public void R0(String str, Object... objArr) throws JsonMappingException {
        throw N0(str, objArr);
    }

    public gc5<Object> S(y85 y85Var, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> d = this.j.d(y85Var);
        if (d == null && (d = this.d.g(y85Var)) == null && (d = m(y85Var)) == null) {
            return E0(y85Var.u());
        }
        return F0(d, ia0Var);
    }

    public void S0(Throwable th, String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.k(r0(), a(str, objArr), th);
    }

    public gc5<Object> T(Class<?> cls, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> e = this.j.e(cls);
        if (e == null && (e = this.d.h(cls)) == null && (e = this.d.g(this.a.e(cls))) == null && (e = n(cls)) == null) {
            return E0(cls);
        }
        return F0(e, ia0Var);
    }

    public abstract gc5<Object> T0(al alVar, Object obj) throws JsonMappingException;

    public bda U0(Object obj, Object obj2) {
        this.e = this.e.c(obj, obj2);
        return this;
    }

    public gc5<Object> W(Class<?> cls, boolean z, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> c = this.j.c(cls);
        if (c != null) {
            return c;
        }
        gc5<Object> f = this.d.f(cls);
        if (f != null) {
            return f;
        }
        gc5<Object> f0 = f0(cls, ia0Var);
        zca zcaVar = this.c;
        pca pcaVar = this.a;
        bob c2 = zcaVar.c(pcaVar, pcaVar.e(cls));
        if (c2 != null) {
            f0 = new dob(c2.a(ia0Var), f0);
        }
        if (z) {
            this.d.d(cls, f0);
        }
        return f0;
    }

    public gc5<Object> Z(y85 y85Var) throws JsonMappingException {
        gc5<Object> d = this.j.d(y85Var);
        if (d == null) {
            gc5<Object> g = this.d.g(y85Var);
            if (g == null) {
                gc5<Object> m2 = m(y85Var);
                if (m2 == null) {
                    return E0(y85Var.u());
                }
                return m2;
            }
            return g;
        }
        return d;
    }

    public gc5<Object> b0(y85 y85Var, ia0 ia0Var) throws JsonMappingException {
        if (y85Var == null) {
            R0("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        gc5<Object> d = this.j.d(y85Var);
        if (d == null && (d = this.d.g(y85Var)) == null && (d = m(y85Var)) == null) {
            return E0(y85Var.u());
        }
        return I0(d, ia0Var);
    }

    public gc5<Object> e0(Class<?> cls) throws JsonMappingException {
        gc5<Object> e = this.j.e(cls);
        if (e == null) {
            gc5<Object> h = this.d.h(cls);
            if (h == null) {
                gc5<Object> g = this.d.g(this.a.e(cls));
                if (g == null) {
                    gc5<Object> n2 = n(cls);
                    if (n2 == null) {
                        return E0(cls);
                    }
                    return n2;
                }
                return g;
            }
            return h;
        }
        return e;
    }

    public gc5<Object> f0(Class<?> cls, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> e = this.j.e(cls);
        if (e == null && (e = this.d.h(cls)) == null && (e = this.d.g(this.a.e(cls))) == null && (e = n(cls)) == null) {
            return E0(cls);
        }
        return I0(e, ia0Var);
    }

    public final Class<?> h0() {
        return this.b;
    }

    @Override // defpackage.om2
    public final rnb i() {
        return this.a.M();
    }

    public final ql j0() {
        return this.a.i();
    }

    @Override // defpackage.om2
    public <T> T k(y85 y85Var, String str) throws JsonMappingException {
        throw InvalidDefinitionException.w(r0(), str, y85Var);
    }

    public Object l0(Object obj) {
        return this.e.a(obj);
    }

    protected gc5<Object> m(y85 y85Var) throws JsonMappingException {
        gc5<Object> gc5Var;
        try {
            gc5Var = o(y85Var);
        } catch (IllegalArgumentException e) {
            S0(e, q81.n(e), new Object[0]);
            gc5Var = null;
        }
        if (gc5Var != null) {
            this.d.b(y85Var, gc5Var, this);
        }
        return gc5Var;
    }

    @Override // defpackage.om2
    /* renamed from: m0 */
    public final pca f() {
        return this.a;
    }

    protected gc5<Object> n(Class<?> cls) throws JsonMappingException {
        gc5<Object> gc5Var;
        y85 e = this.a.e(cls);
        try {
            gc5Var = o(e);
        } catch (IllegalArgumentException e2) {
            k(e, q81.n(e2));
            gc5Var = null;
        }
        if (gc5Var != null) {
            this.d.c(cls, e, gc5Var, this);
        }
        return gc5Var;
    }

    public gc5<Object> n0() {
        return this.h;
    }

    protected gc5<Object> o(y85 y85Var) throws JsonMappingException {
        return this.c.b(this, y85Var);
    }

    public final ta5.d o0(Class<?> cls) {
        return this.a.r(cls);
    }

    public final cb5.b p0(Class<?> cls) {
        return this.a.s(cls);
    }

    protected final DateFormat q() {
        DateFormat dateFormat = this.k;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.a.m().clone();
        this.k = dateFormat2;
        return dateFormat2;
    }

    public final xu3 q0() {
        this.a.F0();
        return null;
    }

    protected gc5<Object> r(gc5<?> gc5Var, ia0 ia0Var) throws JsonMappingException {
        if (gc5Var instanceof ij9) {
            ((ij9) gc5Var).b(this);
        }
        return I0(gc5Var, ia0Var);
    }

    public abstract ua5 r0();

    /* JADX INFO: Access modifiers changed from: protected */
    public gc5<Object> s(gc5<?> gc5Var) throws JsonMappingException {
        if (gc5Var instanceof ij9) {
            ((ij9) gc5Var).b(this);
        }
        return gc5Var;
    }

    public final boolean u() {
        return this.a.b();
    }

    public y85 w(y85 y85Var, Class<?> cls) throws IllegalArgumentException {
        if (y85Var.K(cls)) {
            return y85Var;
        }
        return f().M().P(y85Var, cls, true);
    }

    public void x(long j, ua5 ua5Var) throws IOException {
        if (M0(qca.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            ua5Var.j0(String.valueOf(j));
        } else {
            ua5Var.j0(q().format(new Date(j)));
        }
    }

    public Locale x0() {
        return this.a.G();
    }

    public void y(Date date, ua5 ua5Var) throws IOException {
        if (M0(qca.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            ua5Var.j0(String.valueOf(date.getTime()));
        } else {
            ua5Var.j0(q().format(date));
        }
    }

    public TimeZone z0() {
        return this.a.L();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bda(bda bdaVar, pca pcaVar, zca zcaVar) {
        this.f = n;
        this.h = s37.c;
        gc5<Object> gc5Var = m;
        this.i = gc5Var;
        this.c = zcaVar;
        this.a = pcaVar;
        yca ycaVar = bdaVar.d;
        this.d = ycaVar;
        this.f = bdaVar.f;
        this.g = bdaVar.g;
        gc5<Object> gc5Var2 = bdaVar.h;
        this.h = gc5Var2;
        this.i = bdaVar.i;
        this.l = gc5Var2 == gc5Var;
        this.b = pcaVar.f0();
        this.e = pcaVar.h0();
        this.j = ycaVar.e();
    }
}
