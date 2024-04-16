package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import defpackage.cb5;
import defpackage.fc5;
import java.io.IOException;
/* compiled from: ReferenceTypeSerializer.java */
/* renamed from: ha9  reason: default package */
/* loaded from: classes2.dex */
public abstract class ha9<T> extends cxa<T> implements bv1 {
    public static final Object k = cb5.a.NON_EMPTY;
    protected final y85 c;
    protected final ia0 d;
    protected final bob e;
    protected final gc5<Object> f;
    protected final ps6 g;
    protected transient er8 h;
    protected final Object i;
    protected final boolean j;

    /* compiled from: ReferenceTypeSerializer.java */
    /* renamed from: ha9$a */
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

    public ha9(ga9 ga9Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        super(ga9Var);
        this.c = ga9Var.b();
        this.d = null;
        this.e = bobVar;
        this.f = gc5Var;
        this.g = null;
        this.i = null;
        this.j = false;
        this.h = er8.c();
    }

    private final gc5<Object> G(bda bdaVar, Class<?> cls) throws JsonMappingException {
        gc5<Object> T;
        gc5<Object> j = this.h.j(cls);
        if (j == null) {
            if (this.c.G()) {
                T = bdaVar.S(bdaVar.w(this.c, cls), this.d);
            } else {
                T = bdaVar.T(cls, this.d);
            }
            ps6 ps6Var = this.g;
            if (ps6Var != null) {
                T = T.j(ps6Var);
            }
            gc5<Object> gc5Var = T;
            this.h = this.h.i(cls, gc5Var);
            return gc5Var;
        }
        return j;
    }

    private final gc5<Object> H(bda bdaVar, y85 y85Var, ia0 ia0Var) throws JsonMappingException {
        return bdaVar.S(y85Var, ia0Var);
    }

    protected abstract Object K(T t);

    protected abstract Object L(T t);

    protected abstract boolean M(T t);

    protected boolean N(bda bdaVar, ia0 ia0Var, y85 y85Var) {
        if (y85Var.W()) {
            return false;
        }
        if (y85Var.S() || y85Var.l0()) {
            return true;
        }
        ql j0 = bdaVar.j0();
        if (j0 != null && ia0Var != null && ia0Var.c() != null) {
            fc5.b m0 = j0.m0(ia0Var.c());
            if (m0 == fc5.b.STATIC) {
                return true;
            }
            if (m0 == fc5.b.DYNAMIC) {
                return false;
            }
        }
        return bdaVar.L0(y76.USE_STATIC_TYPING);
    }

    public abstract ha9<T> P(Object obj, boolean z);

    protected abstract ha9<T> Q(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, ps6 ps6Var);

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        ha9<T> Q;
        cb5.b b;
        cb5.a f;
        Object b2;
        bob bobVar = this.e;
        if (bobVar != null) {
            bobVar = bobVar.a(ia0Var);
        }
        gc5<?> n = n(bdaVar, ia0Var);
        if (n == null) {
            n = this.f;
            if (n == null) {
                if (N(bdaVar, ia0Var, this.c)) {
                    n = H(bdaVar, this.c, ia0Var);
                }
            } else {
                n = bdaVar.F0(n, ia0Var);
            }
        }
        if (this.d == ia0Var && this.e == bobVar && this.f == n) {
            Q = this;
        } else {
            Q = Q(ia0Var, bobVar, n, this.g);
        }
        if (ia0Var != null && (b = ia0Var.b(bdaVar.f(), c())) != null && (f = b.f()) != cb5.a.USE_DEFAULTS) {
            int i = a.a[f.ordinal()];
            boolean z = true;
            if (i != 1) {
                b2 = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                z = false;
                            }
                        } else {
                            b2 = bdaVar.J0(null, b.e());
                            if (b2 != null) {
                                z = bdaVar.K0(b2);
                            }
                        }
                    } else {
                        b2 = k;
                    }
                } else if (this.c.c()) {
                    b2 = k;
                }
            } else {
                b2 = qa0.b(this.c);
                if (b2 != null && b2.getClass().isArray()) {
                    b2 = er.a(b2);
                }
            }
            if (this.i != b2 || this.j != z) {
                return Q.P(b2, z);
            }
            return Q;
        }
        return Q;
    }

    @Override // defpackage.gc5
    public boolean d(bda bdaVar, T t) {
        if (!M(t)) {
            return true;
        }
        Object K = K(t);
        if (K == null) {
            return this.j;
        }
        if (this.i == null) {
            return false;
        }
        gc5<Object> gc5Var = this.f;
        if (gc5Var == null) {
            try {
                gc5Var = G(bdaVar, K.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        Object obj = this.i;
        if (obj == k) {
            return gc5Var.d(bdaVar, K);
        }
        return obj.equals(K);
    }

    @Override // defpackage.gc5
    public boolean e() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(T t, ua5 ua5Var, bda bdaVar) throws IOException {
        Object L = L(t);
        if (L == null) {
            if (this.g == null) {
                bdaVar.G(ua5Var);
                return;
            }
            return;
        }
        gc5<Object> gc5Var = this.f;
        if (gc5Var == null) {
            gc5Var = G(bdaVar, L.getClass());
        }
        bob bobVar = this.e;
        if (bobVar != null) {
            gc5Var.i(L, ua5Var, bdaVar, bobVar);
        } else {
            gc5Var.f(L, ua5Var, bdaVar);
        }
    }

    @Override // defpackage.gc5
    public void i(T t, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        Object L = L(t);
        if (L == null) {
            if (this.g == null) {
                bdaVar.G(ua5Var);
                return;
            }
            return;
        }
        gc5<Object> gc5Var = this.f;
        if (gc5Var == null) {
            gc5Var = G(bdaVar, L.getClass());
        }
        gc5Var.i(L, ua5Var, bdaVar, bobVar);
    }

    @Override // defpackage.gc5
    public gc5<T> j(ps6 ps6Var) {
        gc5<?> gc5Var = this.f;
        if (gc5Var != null && (gc5Var = gc5Var.j(ps6Var)) == this.f) {
            return this;
        }
        ps6 ps6Var2 = this.g;
        if (ps6Var2 != null) {
            ps6Var = ps6.a(ps6Var, ps6Var2);
        }
        if (this.f == gc5Var && this.g == ps6Var) {
            return this;
        }
        return Q(this.d, this.e, gc5Var, ps6Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ha9(ha9<?> ha9Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, ps6 ps6Var, Object obj, boolean z) {
        super(ha9Var);
        this.c = ha9Var.c;
        this.h = er8.c();
        this.d = ia0Var;
        this.e = bobVar;
        this.f = gc5Var;
        this.g = ps6Var;
        this.i = obj;
        this.j = z;
    }
}
