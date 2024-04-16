package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import defpackage.rc5;
import java.io.IOException;
/* compiled from: JsonValueSerializer.java */
@o85
/* renamed from: ad5  reason: default package */
/* loaded from: classes2.dex */
public class ad5 extends cxa<Object> implements bv1 {
    protected final hl c;
    protected final bob d;
    protected final gc5<Object> e;
    protected final ia0 f;
    protected final y85 g;
    protected final boolean h;
    protected transient er8 i;

    /* compiled from: JsonValueSerializer.java */
    /* renamed from: ad5$a */
    /* loaded from: classes2.dex */
    static class a extends bob {
        protected final bob a;
        protected final Object b;

        public a(bob bobVar, Object obj) {
            this.a = bobVar;
            this.b = obj;
        }

        @Override // defpackage.bob
        public bob a(ia0 ia0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.bob
        public String b() {
            return this.a.b();
        }

        @Override // defpackage.bob
        public rc5.a c() {
            return this.a.c();
        }

        @Override // defpackage.bob
        public c9c g(ua5 ua5Var, c9c c9cVar) throws IOException {
            c9cVar.a = this.b;
            return this.a.g(ua5Var, c9cVar);
        }

        @Override // defpackage.bob
        public c9c h(ua5 ua5Var, c9c c9cVar) throws IOException {
            return this.a.h(ua5Var, c9cVar);
        }
    }

    public ad5(hl hlVar, bob bobVar, gc5<?> gc5Var) {
        super(hlVar.d());
        this.c = hlVar;
        this.g = hlVar.d();
        this.d = bobVar;
        this.e = gc5Var;
        this.f = null;
        this.h = true;
        this.i = er8.c();
    }

    private static final Class<Object> H(Class<?> cls) {
        if (cls == null) {
            return Object.class;
        }
        return cls;
    }

    protected gc5<Object> G(bda bdaVar, Class<?> cls) throws JsonMappingException {
        gc5<Object> j = this.i.j(cls);
        if (j == null) {
            if (this.g.G()) {
                y85 w = bdaVar.w(this.g, cls);
                gc5<Object> S = bdaVar.S(w, this.f);
                this.i = this.i.a(w, S).b;
                return S;
            }
            gc5<Object> T = bdaVar.T(cls, this.f);
            this.i = this.i.b(cls, T).b;
            return T;
        }
        return j;
    }

    protected boolean K(Class<?> cls, gc5<?> gc5Var) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return x(gc5Var);
    }

    protected ad5 L(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, boolean z) {
        if (this.f == ia0Var && this.d == bobVar && this.e == gc5Var && z == this.h) {
            return this;
        }
        return new ad5(this, ia0Var, bobVar, gc5Var, z);
    }

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        bob bobVar = this.d;
        if (bobVar != null) {
            bobVar = bobVar.a(ia0Var);
        }
        gc5<?> gc5Var = this.e;
        if (gc5Var == null) {
            if (!bdaVar.L0(y76.USE_STATIC_TYPING) && !this.g.S()) {
                if (ia0Var != this.f) {
                    return L(ia0Var, bobVar, gc5Var, this.h);
                }
                return this;
            }
            gc5<Object> S = bdaVar.S(this.g, ia0Var);
            return L(ia0Var, bobVar, S, K(this.g.u(), S));
        }
        return L(ia0Var, bobVar, bdaVar.F0(gc5Var, ia0Var), this.h);
    }

    @Override // defpackage.gc5
    public boolean d(bda bdaVar, Object obj) {
        Object n = this.c.n(obj);
        if (n == null) {
            return true;
        }
        gc5<Object> gc5Var = this.e;
        if (gc5Var == null) {
            try {
                gc5Var = G(bdaVar, n.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return gc5Var.d(bdaVar, n);
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        Object obj2;
        try {
            obj2 = this.c.n(obj);
        } catch (Exception e) {
            E(bdaVar, e, obj, this.c.getName() + "()");
            obj2 = null;
        }
        if (obj2 == null) {
            bdaVar.G(ua5Var);
            return;
        }
        gc5<Object> gc5Var = this.e;
        if (gc5Var == null) {
            gc5Var = G(bdaVar, obj2.getClass());
        }
        bob bobVar = this.d;
        if (bobVar != null) {
            gc5Var.i(obj2, ua5Var, bdaVar, bobVar);
        } else {
            gc5Var.f(obj2, ua5Var, bdaVar);
        }
    }

    @Override // defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        Object obj2;
        try {
            obj2 = this.c.n(obj);
        } catch (Exception e) {
            E(bdaVar, e, obj, this.c.getName() + "()");
            obj2 = null;
        }
        if (obj2 == null) {
            bdaVar.G(ua5Var);
            return;
        }
        gc5<Object> gc5Var = this.e;
        if (gc5Var == null) {
            gc5Var = G(bdaVar, obj2.getClass());
        } else if (this.h) {
            c9c g = bobVar.g(ua5Var, bobVar.d(obj, nc5.VALUE_STRING));
            gc5Var.f(obj2, ua5Var, bdaVar);
            bobVar.h(ua5Var, g);
            return;
        }
        gc5Var.i(obj2, ua5Var, bdaVar, new a(bobVar, obj));
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this.c.k() + "#" + this.c.getName() + ")";
    }

    public ad5(ad5 ad5Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, boolean z) {
        super(H(ad5Var.c()));
        this.c = ad5Var.c;
        this.g = ad5Var.g;
        this.d = bobVar;
        this.e = gc5Var;
        this.f = ia0Var;
        this.h = z;
        this.i = er8.c();
    }
}
