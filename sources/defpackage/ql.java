package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ab5;
import defpackage.cb5;
import defpackage.db5;
import defpackage.fa5;
import defpackage.fc5;
import defpackage.ic5;
import defpackage.n85;
import defpackage.sb5;
import defpackage.ta5;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
/* compiled from: AnnotationIntrospector.java */
/* renamed from: ql  reason: default package */
/* loaded from: classes2.dex */
public abstract class ql implements Serializable {

    /* compiled from: AnnotationIntrospector.java */
    /* renamed from: ql$a */
    /* loaded from: classes2.dex */
    public static class a {
        private final EnumC0488a a;
        private final String b;

        /* compiled from: AnnotationIntrospector.java */
        /* renamed from: ql$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0488a {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public a(EnumC0488a enumC0488a, String str) {
            this.a = enumC0488a;
            this.b = str;
        }

        public static a a(String str) {
            return new a(EnumC0488a.BACK_REFERENCE, str);
        }

        public static a c(String str) {
            return new a(EnumC0488a.MANAGED_REFERENCE, str);
        }

        public boolean b() {
            if (this.a == EnumC0488a.BACK_REFERENCE) {
                return true;
            }
            return false;
        }
    }

    public static ql T0() {
        return f07.a;
    }

    public c57 E(al alVar) {
        return null;
    }

    public vq8 E0(al alVar) {
        return null;
    }

    public Boolean F0(al alVar) {
        if ((alVar instanceof il) && I0((il) alVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public sb5.a H(al alVar) {
        return null;
    }

    @Deprecated
    public boolean I0(il ilVar) {
        return false;
    }

    public Boolean J0(al alVar) {
        return null;
    }

    public aob<?> K(w76<?> w76Var, hl hlVar, y85 y85Var) {
        return null;
    }

    public Boolean K0(w76<?> w76Var, al alVar) {
        return null;
    }

    public String L(al alVar) {
        return null;
    }

    public Boolean L0(al alVar) {
        if ((alVar instanceof il) && M0((il) alVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public String M(al alVar) {
        return null;
    }

    @Deprecated
    public boolean M0(il ilVar) {
        return false;
    }

    public ab5.a N(w76<?> w76Var, al alVar) {
        return P(alVar);
    }

    @Deprecated
    public boolean N0(al alVar) {
        return false;
    }

    public boolean O0(hl hlVar) {
        return false;
    }

    @Deprecated
    public ab5.a P(al alVar) {
        return ab5.a.f();
    }

    public Boolean P0(hl hlVar) {
        return null;
    }

    public cb5.b Q(al alVar) {
        return cb5.b.c();
    }

    public boolean Q0(Annotation annotation) {
        return false;
    }

    public Boolean R0(bl blVar) {
        return null;
    }

    public db5.a S(w76<?> w76Var, al alVar) {
        return db5.a.c();
    }

    public Boolean S0(hl hlVar) {
        return null;
    }

    public Integer T(al alVar) {
        return null;
    }

    public il V0(w76<?> w76Var, il ilVar, il ilVar2) {
        return null;
    }

    public aob<?> W(w76<?> w76Var, hl hlVar, y85 y85Var) {
        return null;
    }

    public a Z(hl hlVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <A extends Annotation> A a(al alVar, Class<A> cls) {
        return (A) alVar.b(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(al alVar, Class<? extends Annotation> cls) {
        return alVar.e(cls);
    }

    public vq8 b0(w76<?> w76Var, fl flVar, vq8 vq8Var) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(al alVar, Class<? extends Annotation>[] clsArr) {
        return alVar.f(clsArr);
    }

    public vq8 e0(bl blVar) {
        return null;
    }

    public Object f(al alVar) {
        return null;
    }

    public Object f0(hl hlVar) {
        return null;
    }

    public Object h0(al alVar) {
        return null;
    }

    public fa5.a i(w76<?> w76Var, al alVar) {
        if (N0(alVar)) {
            fa5.a j = j(alVar);
            if (j == null) {
                return fa5.a.DEFAULT;
            }
            return j;
        }
        return null;
    }

    @Deprecated
    public fa5.a j(al alVar) {
        return null;
    }

    public String[] j0(bl blVar) {
        return null;
    }

    public Object l(al alVar) {
        return null;
    }

    public Boolean l0(al alVar) {
        return null;
    }

    public ta5.d m(al alVar) {
        return ta5.d.b();
    }

    public fc5.b m0(al alVar) {
        return null;
    }

    public String n(hl hlVar) {
        return null;
    }

    public Object n0(al alVar) {
        return null;
    }

    public n85.a o(hl hlVar) {
        Object q = q(hlVar);
        if (q != null) {
            return n85.a.c(q);
        }
        return null;
    }

    public ic5.a o0(al alVar) {
        return ic5.a.c();
    }

    public List<ss6> p0(al alVar) {
        return null;
    }

    @Deprecated
    public Object q(hl hlVar) {
        return null;
    }

    public String q0(bl blVar) {
        return null;
    }

    public Object r(al alVar) {
        return null;
    }

    public aob<?> r0(w76<?> w76Var, bl blVar, y85 y85Var) {
        return null;
    }

    public Boolean s(al alVar) {
        return null;
    }

    public vq8 u(al alVar) {
        return null;
    }

    public vq8 w(al alVar) {
        return null;
    }

    public Object x(bl blVar) {
        return null;
    }

    public ps6 x0(hl hlVar) {
        return null;
    }

    public Object y(al alVar) {
        return null;
    }

    public Class<?>[] z0(al alVar) {
        return null;
    }

    public c57 G(al alVar, c57 c57Var) {
        return c57Var;
    }

    public v1c<?> e(bl blVar, v1c<?> v1cVar) {
        return v1cVar;
    }

    public y85 U0(w76<?> w76Var, al alVar, y85 y85Var) throws JsonMappingException {
        return y85Var;
    }

    public void d(w76<?> w76Var, bl blVar, List<ka0> list) {
    }

    public String[] k(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }
}
