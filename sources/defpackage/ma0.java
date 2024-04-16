package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ta5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
/* compiled from: BeanSerializerBase.java */
/* renamed from: ma0  reason: default package */
/* loaded from: classes2.dex */
public abstract class ma0 extends cxa<Object> implements bv1, ij9 {
    protected static final vq8 k = new vq8("#object-ref");
    protected static final ka0[] l = new ka0[0];
    protected final y85 c;
    protected final ka0[] d;
    protected final ka0[] e;
    protected final vl f;
    protected final Object g;
    protected final hl h;
    protected final d57 i;
    protected final ta5.c j;

    /* compiled from: BeanSerializerBase.java */
    /* renamed from: ma0$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ta5.c.values().length];
            a = iArr;
            try {
                iArr[ta5.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ta5.c.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ta5.c.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ma0(y85 y85Var, na0 na0Var, ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        super(y85Var);
        this.c = y85Var;
        this.d = ka0VarArr;
        this.e = ka0VarArr2;
        if (na0Var == null) {
            this.h = null;
            this.f = null;
            this.g = null;
            this.i = null;
            this.j = null;
            return;
        }
        this.h = na0Var.h();
        this.f = na0Var.c();
        this.g = na0Var.e();
        this.i = na0Var.f();
        this.j = na0Var.d().c(null).j();
    }

    private static final ka0[] P(ka0[] ka0VarArr, ps6 ps6Var) {
        if (ka0VarArr != null && ka0VarArr.length != 0 && ps6Var != null && ps6Var != ps6.a) {
            int length = ka0VarArr.length;
            ka0[] ka0VarArr2 = new ka0[length];
            for (int i = 0; i < length; i++) {
                ka0 ka0Var = ka0VarArr[i];
                if (ka0Var != null) {
                    ka0VarArr2[i] = ka0Var.u(ps6Var);
                }
            }
            return ka0VarArr2;
        }
        return ka0VarArr;
    }

    protected void G(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar, b9c b9cVar) throws IOException {
        d57 d57Var = this.i;
        c9c L = L(bobVar, obj, nc5.START_OBJECT);
        bobVar.g(ua5Var, L);
        ua5Var.u(obj);
        b9cVar.b(ua5Var, bdaVar, d57Var);
        if (this.g != null) {
            S(obj, ua5Var, bdaVar);
        } else {
            Q(obj, ua5Var, bdaVar);
        }
        bobVar.h(ua5Var, L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        d57 d57Var = this.i;
        b9c Q = bdaVar.Q(obj, d57Var.c);
        if (Q.c(ua5Var, bdaVar, d57Var)) {
            return;
        }
        Object a2 = Q.a(obj);
        if (d57Var.e) {
            d57Var.d.f(a2, ua5Var, bdaVar);
        } else {
            G(obj, ua5Var, bdaVar, bobVar, Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K(Object obj, ua5 ua5Var, bda bdaVar, boolean z) throws IOException {
        d57 d57Var = this.i;
        b9c Q = bdaVar.Q(obj, d57Var.c);
        if (Q.c(ua5Var, bdaVar, d57Var)) {
            return;
        }
        Object a2 = Q.a(obj);
        if (d57Var.e) {
            d57Var.d.f(a2, ua5Var, bdaVar);
            return;
        }
        if (z) {
            ua5Var.i1(obj);
        }
        Q.b(ua5Var, bdaVar, d57Var);
        if (this.g != null) {
            S(obj, ua5Var, bdaVar);
        } else {
            Q(obj, ua5Var, bdaVar);
        }
        if (z) {
            ua5Var.b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c9c L(bob bobVar, Object obj, nc5 nc5Var) {
        hl hlVar = this.h;
        if (hlVar == null) {
            return bobVar.d(obj, nc5Var);
        }
        Object n = hlVar.n(obj);
        if (n == null) {
            n = "";
        }
        return bobVar.e(obj, nc5Var, n);
    }

    protected abstract ma0 M();

    protected gc5<Object> N(bda bdaVar, ka0 ka0Var) throws JsonMappingException {
        hl c;
        Object h0;
        ql j0 = bdaVar.j0();
        gc5<Object> gc5Var = null;
        if (j0 == null || (c = ka0Var.c()) == null || (h0 = j0.h0(c)) == null) {
            return null;
        }
        lw1<Object, Object> e = bdaVar.e(ka0Var.c(), h0);
        y85 a2 = e.a(bdaVar.i());
        if (!a2.W()) {
            gc5Var = bdaVar.b0(a2, ka0Var);
        }
        return new wwa(e, a2, gc5Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ka0[] ka0VarArr;
        String str = "[anySetter]";
        if (this.e != null && bdaVar.h0() != null) {
            ka0VarArr = this.e;
        } else {
            ka0VarArr = this.d;
        }
        int i = 0;
        try {
            int length = ka0VarArr.length;
            while (i < length) {
                ka0 ka0Var = ka0VarArr[i];
                if (ka0Var != null) {
                    ka0Var.x(obj, ua5Var, bdaVar);
                }
                i++;
            }
            vl vlVar = this.f;
            if (vlVar != null) {
                vlVar.c(obj, ua5Var, bdaVar);
            }
        } catch (Exception e) {
            if (i != ka0VarArr.length) {
                str = ka0VarArr[i].getName();
            }
            E(bdaVar, e, obj, str);
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(ua5Var, "Infinite recursion (StackOverflowError)", e2);
            if (i != ka0VarArr.length) {
                str = ka0VarArr[i].getName();
            }
            jsonMappingException.e(obj, str);
            throw jsonMappingException;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ka0[] ka0VarArr;
        String str = "[anySetter]";
        if (this.e != null && bdaVar.h0() != null) {
            ka0VarArr = this.e;
        } else {
            ka0VarArr = this.d;
        }
        tq8 w = w(bdaVar, this.g, obj);
        if (w == null) {
            Q(obj, ua5Var, bdaVar);
            return;
        }
        int i = 0;
        try {
            int length = ka0VarArr.length;
            while (i < length) {
                ka0 ka0Var = ka0VarArr[i];
                if (ka0Var != null) {
                    w.a(obj, ua5Var, bdaVar, ka0Var);
                }
                i++;
            }
            vl vlVar = this.f;
            if (vlVar != null) {
                vlVar.b(obj, ua5Var, bdaVar, w);
            }
        } catch (Exception e) {
            if (i != ka0VarArr.length) {
                str = ka0VarArr[i].getName();
            }
            E(bdaVar, e, obj, str);
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(ua5Var, "Infinite recursion (StackOverflowError)", e2);
            if (i != ka0VarArr.length) {
                str = ka0VarArr[i].getName();
            }
            jsonMappingException.e(obj, str);
            throw jsonMappingException;
        }
    }

    protected abstract ma0 T(Set<String> set, Set<String> set2);

    public abstract ma0 W(Object obj);

    public abstract ma0 Z(d57 d57Var);

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        hl hlVar;
        ta5.c cVar;
        ka0[] ka0VarArr;
        Object obj;
        Set<String> set;
        Set<String> set2;
        int i;
        ma0 ma0Var;
        d57 c;
        ka0 ka0Var;
        Object obj2;
        c57 G;
        ql j0 = bdaVar.j0();
        if (ia0Var != null && j0 != null) {
            hlVar = ia0Var.c();
        } else {
            hlVar = null;
        }
        pca f = bdaVar.f();
        ta5.d s = s(bdaVar, ia0Var, this.a);
        int i2 = 2;
        if (s != null && s.o()) {
            cVar = s.j();
            if (cVar != ta5.c.ANY && cVar != this.j) {
                if (this.c.Q()) {
                    int i3 = a.a[cVar.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        return bdaVar.F0(oj3.K(this.c.u(), bdaVar.f(), f.N(this.c), s), ia0Var);
                    }
                } else if (cVar == ta5.c.NATURAL && ((!this.c.Z() || !Map.class.isAssignableFrom(this.a)) && Map.Entry.class.isAssignableFrom(this.a))) {
                    y85 k2 = this.c.k(Map.Entry.class);
                    return bdaVar.F0(new p66(this.c, k2.j(0), k2.j(1), false, null, ia0Var), ia0Var);
                }
            }
        } else {
            cVar = null;
        }
        d57 d57Var = this.i;
        if (hlVar != null) {
            set2 = j0.N(f, hlVar).i();
            set = j0.S(f, hlVar).e();
            c57 E = j0.E(hlVar);
            if (E == null) {
                if (d57Var != null && (G = j0.G(hlVar, null)) != null) {
                    d57Var = this.i.b(G.b());
                }
                ka0VarArr = null;
            } else {
                c57 G2 = j0.G(hlVar, E);
                Class<? extends y47<?>> c2 = G2.c();
                y85 y85Var = bdaVar.i().T(bdaVar.d(c2), y47.class)[0];
                if (c2 == b57.class) {
                    String c3 = G2.d().c();
                    int length = this.d.length;
                    i = 0;
                    while (true) {
                        if (i == length) {
                            y85 y85Var2 = this.c;
                            Object[] objArr = new Object[i2];
                            objArr[0] = q81.R(c());
                            objArr[1] = q81.Q(c3);
                            bdaVar.k(y85Var2, String.format("Invalid Object Id definition for %s: cannot find property with name %s", objArr));
                        }
                        ka0Var = this.d[i];
                        if (c3.equals(ka0Var.getName())) {
                            break;
                        }
                        i++;
                        i2 = 2;
                    }
                    ka0VarArr = null;
                    d57Var = d57.a(ka0Var.getType(), null, new rq8(G2, ka0Var), G2.b());
                    obj = j0.l(hlVar);
                    if (obj != null || ((obj2 = this.g) != null && obj.equals(obj2))) {
                        obj = ka0VarArr;
                    }
                } else {
                    ka0VarArr = null;
                    d57Var = d57.a(y85Var, G2.d(), bdaVar.j(hlVar, G2), G2.b());
                }
            }
            i = 0;
            obj = j0.l(hlVar);
            if (obj != null) {
            }
            obj = ka0VarArr;
        } else {
            ka0VarArr = null;
            obj = null;
            set = null;
            set2 = null;
            i = 0;
        }
        if (i > 0) {
            ka0[] ka0VarArr2 = this.d;
            ka0[] ka0VarArr3 = (ka0[]) Arrays.copyOf(ka0VarArr2, ka0VarArr2.length);
            ka0 ka0Var2 = ka0VarArr3[i];
            System.arraycopy(ka0VarArr3, 0, ka0VarArr3, 1, i);
            ka0VarArr3[0] = ka0Var2;
            ka0[] ka0VarArr4 = this.e;
            if (ka0VarArr4 != null) {
                ka0VarArr = (ka0[]) Arrays.copyOf(ka0VarArr4, ka0VarArr4.length);
                ka0 ka0Var3 = ka0VarArr[i];
                System.arraycopy(ka0VarArr, 0, ka0VarArr, 1, i);
                ka0VarArr[0] = ka0Var3;
            }
            ma0Var = b0(ka0VarArr3, ka0VarArr);
        } else {
            ma0Var = this;
        }
        if (d57Var != null && (c = d57Var.c(bdaVar.b0(d57Var.a, ia0Var))) != this.i) {
            ma0Var = ma0Var.Z(c);
        }
        if ((set2 != null && !set2.isEmpty()) || set != null) {
            ma0Var = ma0Var.T(set2, set);
        }
        if (obj != null) {
            ma0Var = ma0Var.W(obj);
        }
        if (cVar == null) {
            cVar = this.j;
        }
        if (cVar == ta5.c.ARRAY) {
            return ma0Var.M();
        }
        return ma0Var;
    }

    @Override // defpackage.ij9
    public void b(bda bdaVar) throws JsonMappingException {
        int length;
        ka0 ka0Var;
        bob bobVar;
        gc5<Object> P;
        ka0 ka0Var2;
        ka0[] ka0VarArr = this.e;
        if (ka0VarArr == null) {
            length = 0;
        } else {
            length = ka0VarArr.length;
        }
        int length2 = this.d.length;
        for (int i = 0; i < length2; i++) {
            ka0 ka0Var3 = this.d[i];
            if (!ka0Var3.K() && !ka0Var3.r() && (P = bdaVar.P(ka0Var3)) != null) {
                ka0Var3.i(P);
                if (i < length && (ka0Var2 = this.e[i]) != null) {
                    ka0Var2.i(P);
                }
            }
            if (!ka0Var3.s()) {
                gc5<Object> N = N(bdaVar, ka0Var3);
                if (N == null) {
                    y85 n = ka0Var3.n();
                    if (n == null) {
                        n = ka0Var3.getType();
                        if (!n.S()) {
                            if (n.N() || n.i() > 0) {
                                ka0Var3.G(n);
                            }
                        }
                    }
                    gc5<Object> b0 = bdaVar.b0(n, ka0Var3);
                    if (n.N() && (bobVar = (bob) n.m().y()) != null && (b0 instanceof ct1)) {
                        N = ((ct1) b0).H(bobVar);
                    } else {
                        N = b0;
                    }
                }
                if (i < length && (ka0Var = this.e[i]) != null) {
                    ka0Var.j(N);
                } else {
                    ka0Var3.j(N);
                }
            }
        }
        vl vlVar = this.f;
        if (vlVar != null) {
            vlVar.d(bdaVar);
        }
    }

    protected abstract ma0 b0(ka0[] ka0VarArr, ka0[] ka0VarArr2);

    @Override // defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        if (this.i != null) {
            H(obj, ua5Var, bdaVar, bobVar);
            return;
        }
        c9c L = L(bobVar, obj, nc5.START_OBJECT);
        bobVar.g(ua5Var, L);
        ua5Var.u(obj);
        if (this.g != null) {
            S(obj, ua5Var, bdaVar);
        } else {
            Q(obj, ua5Var, bdaVar);
        }
        bobVar.h(ua5Var, L);
    }

    @Override // defpackage.gc5
    public boolean k() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ma0(ma0 ma0Var, ka0[] ka0VarArr, ka0[] ka0VarArr2) {
        super(ma0Var.a);
        this.c = ma0Var.c;
        this.d = ka0VarArr;
        this.e = ka0VarArr2;
        this.h = ma0Var.h;
        this.f = ma0Var.f;
        this.i = ma0Var.i;
        this.g = ma0Var.g;
        this.j = ma0Var.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ma0(ma0 ma0Var, d57 d57Var) {
        this(ma0Var, d57Var, ma0Var.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ma0(ma0 ma0Var, d57 d57Var, Object obj) {
        super(ma0Var.a);
        this.c = ma0Var.c;
        this.d = ma0Var.d;
        this.e = ma0Var.e;
        this.h = ma0Var.h;
        this.f = ma0Var.f;
        this.i = d57Var;
        this.g = obj;
        this.j = ma0Var.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ma0(ma0 ma0Var, Set<String> set, Set<String> set2) {
        super(ma0Var.a);
        this.c = ma0Var.c;
        ka0[] ka0VarArr = ma0Var.d;
        ka0[] ka0VarArr2 = ma0Var.e;
        int length = ka0VarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = ka0VarArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            ka0 ka0Var = ka0VarArr[i];
            if (!st4.b(ka0Var.getName(), set, set2)) {
                arrayList.add(ka0Var);
                if (ka0VarArr2 != null) {
                    arrayList2.add(ka0VarArr2[i]);
                }
            }
        }
        this.d = (ka0[]) arrayList.toArray(new ka0[arrayList.size()]);
        this.e = arrayList2 != null ? (ka0[]) arrayList2.toArray(new ka0[arrayList2.size()]) : null;
        this.h = ma0Var.h;
        this.f = ma0Var.f;
        this.i = ma0Var.i;
        this.g = ma0Var.g;
        this.j = ma0Var.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ma0(ma0 ma0Var, ps6 ps6Var) {
        this(ma0Var, P(ma0Var.d, ps6Var), P(ma0Var.e, ps6Var));
    }
}
