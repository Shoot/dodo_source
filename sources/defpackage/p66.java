package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.cb5;
import defpackage.er8;
import java.io.IOException;
import java.util.Map;
/* compiled from: MapEntrySerializer.java */
@o85
/* renamed from: p66  reason: default package */
/* loaded from: classes2.dex */
public class p66 extends ct1<Map.Entry<?, ?>> implements bv1 {
    public static final Object n = cb5.a.NON_EMPTY;
    protected final ia0 c;
    protected final boolean d;
    protected final y85 e;
    protected final y85 f;
    protected final y85 g;
    protected gc5<Object> h;
    protected gc5<Object> i;
    protected final bob j;
    protected er8 k;
    protected final Object l;
    protected final boolean m;

    /* compiled from: MapEntrySerializer.java */
    /* renamed from: p66$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cb5.a.values().length];
            a = iArr;
            try {
                iArr[cb5.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cb5.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cb5.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cb5.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cb5.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cb5.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public p66(y85 y85Var, y85 y85Var2, y85 y85Var3, boolean z, bob bobVar, ia0 ia0Var) {
        super(y85Var);
        this.e = y85Var;
        this.f = y85Var2;
        this.g = y85Var3;
        this.d = z;
        this.j = bobVar;
        this.c = ia0Var;
        this.k = er8.c();
        this.l = null;
        this.m = false;
    }

    @Override // defpackage.ct1
    public ct1<?> G(bob bobVar) {
        return new p66(this, this.c, bobVar, this.h, this.i, this.l, this.m);
    }

    protected final gc5<Object> K(er8 er8Var, y85 y85Var, bda bdaVar) throws JsonMappingException {
        er8.d g = er8Var.g(y85Var, bdaVar, this.c);
        er8 er8Var2 = g.b;
        if (er8Var != er8Var2) {
            this.k = er8Var2;
        }
        return g.a;
    }

    protected final gc5<Object> L(er8 er8Var, Class<?> cls, bda bdaVar) throws JsonMappingException {
        er8.d h = er8Var.h(cls, bdaVar, this.c);
        er8 er8Var2 = h.b;
        if (er8Var != er8Var2) {
            this.k = er8Var2;
        }
        return h.a;
    }

    public y85 M() {
        return this.g;
    }

    @Override // defpackage.gc5
    /* renamed from: N */
    public boolean d(bda bdaVar, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this.m;
        }
        if (this.l == null) {
            return false;
        }
        gc5<Object> gc5Var = this.i;
        if (gc5Var == null) {
            Class<?> cls = value.getClass();
            gc5<Object> j = this.k.j(cls);
            if (j == null) {
                try {
                    gc5Var = L(this.k, cls, bdaVar);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                gc5Var = j;
            }
        }
        Object obj = this.l;
        if (obj == n) {
            return gc5Var.d(bdaVar, value);
        }
        return obj.equals(value);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: P */
    public void f(Map.Entry<?, ?> entry, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.i1(entry);
        Q(entry, ua5Var, bdaVar);
        ua5Var.b0();
    }

    protected void Q(Map.Entry<?, ?> entry, ua5 ua5Var, bda bdaVar) throws IOException {
        gc5<Object> gc5Var;
        gc5<Object> gc5Var2;
        bob bobVar = this.j;
        Object key = entry.getKey();
        if (key == null) {
            gc5Var = bdaVar.N(this.f, this.c);
        } else {
            gc5Var = this.h;
        }
        Object value = entry.getValue();
        if (value == null) {
            if (this.m) {
                return;
            }
            gc5Var2 = bdaVar.n0();
        } else {
            gc5Var2 = this.i;
            if (gc5Var2 == null) {
                Class<?> cls = value.getClass();
                gc5<Object> j = this.k.j(cls);
                if (j == null) {
                    if (this.g.G()) {
                        gc5Var2 = K(this.k, bdaVar.w(this.g, cls), bdaVar);
                    } else {
                        gc5Var2 = L(this.k, cls, bdaVar);
                    }
                } else {
                    gc5Var2 = j;
                }
            }
            Object obj = this.l;
            if (obj != null && ((obj == n && gc5Var2.d(bdaVar, value)) || this.l.equals(value))) {
                return;
            }
        }
        gc5Var.f(key, ua5Var, bdaVar);
        try {
            if (bobVar == null) {
                gc5Var2.f(value, ua5Var, bdaVar);
            } else {
                gc5Var2.i(value, ua5Var, bdaVar, bobVar);
            }
        } catch (Exception e) {
            E(bdaVar, e, entry, "" + key);
        }
    }

    @Override // defpackage.gc5
    /* renamed from: S */
    public void i(Map.Entry<?, ?> entry, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        ua5Var.u(entry);
        c9c g = bobVar.g(ua5Var, bobVar.d(entry, nc5.START_OBJECT));
        Q(entry, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    public p66 T(Object obj, boolean z) {
        if (this.l == obj && this.m == z) {
            return this;
        }
        return new p66(this, this.c, this.j, this.h, this.i, obj, z);
    }

    public p66 W(ia0 ia0Var, gc5<?> gc5Var, gc5<?> gc5Var2, Object obj, boolean z) {
        return new p66(this, ia0Var, this.j, gc5Var, gc5Var2, obj, z);
    }

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        hl c;
        gc5<Object> gc5Var;
        gc5<?> gc5Var2;
        gc5<?> I0;
        Object obj;
        boolean z;
        cb5.b b;
        cb5.a f;
        ql j0 = bdaVar.j0();
        Object obj2 = null;
        if (ia0Var == null) {
            c = null;
        } else {
            c = ia0Var.c();
        }
        if (c != null && j0 != null) {
            Object r = j0.r(c);
            if (r != null) {
                gc5Var2 = bdaVar.T0(c, r);
            } else {
                gc5Var2 = null;
            }
            Object f2 = j0.f(c);
            if (f2 != null) {
                gc5Var = bdaVar.T0(c, f2);
            } else {
                gc5Var = null;
            }
        } else {
            gc5Var = null;
            gc5Var2 = null;
        }
        if (gc5Var == null) {
            gc5Var = this.i;
        }
        gc5<?> o = o(bdaVar, ia0Var, gc5Var);
        if (o == null && this.d && !this.g.W()) {
            o = bdaVar.H(this.g, ia0Var);
        }
        gc5<?> gc5Var3 = o;
        if (gc5Var2 == null) {
            gc5Var2 = this.h;
        }
        if (gc5Var2 == null) {
            I0 = bdaVar.L(this.f, ia0Var);
        } else {
            I0 = bdaVar.I0(gc5Var2, ia0Var);
        }
        gc5<?> gc5Var4 = I0;
        Object obj3 = this.l;
        boolean z2 = this.m;
        if (ia0Var != null && (b = ia0Var.b(bdaVar.f(), null)) != null && (f = b.f()) != cb5.a.USE_DEFAULTS) {
            int i = a.a[f.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                obj = null;
                                z = false;
                            }
                        } else {
                            obj2 = bdaVar.J0(null, b.e());
                            if (obj2 != null) {
                                z = bdaVar.K0(obj2);
                                obj = obj2;
                            }
                        }
                    } else {
                        obj2 = n;
                    }
                } else if (this.g.c()) {
                    obj2 = n;
                }
            } else {
                obj2 = qa0.b(this.g);
                if (obj2 != null && obj2.getClass().isArray()) {
                    obj2 = er.a(obj2);
                }
            }
            obj = obj2;
            z = true;
        } else {
            obj = obj3;
            z = z2;
        }
        return W(ia0Var, gc5Var4, gc5Var3, obj, z);
    }

    protected p66(p66 p66Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, gc5<?> gc5Var2, Object obj, boolean z) {
        super(Map.class, false);
        this.e = p66Var.e;
        this.f = p66Var.f;
        this.g = p66Var.g;
        this.d = p66Var.d;
        this.j = p66Var.j;
        this.h = gc5Var;
        this.i = gc5Var2;
        this.k = er8.c();
        this.c = p66Var.c;
        this.l = obj;
        this.m = z;
    }
}
