package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ab5;
import defpackage.cb5;
import defpackage.db5;
import defpackage.fc5;
import defpackage.ta5;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: BasicSerializerFactory.java */
/* renamed from: p90  reason: default package */
/* loaded from: classes2.dex */
public abstract class p90 extends zca implements Serializable {
    protected static final HashMap<String, gc5<?>> b;
    protected static final HashMap<String, Class<? extends gc5<?>>> c;
    protected final ada a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicSerializerFactory.java */
    /* renamed from: p90$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[cb5.a.values().length];
            b = iArr;
            try {
                iArr[cb5.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[cb5.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[cb5.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[cb5.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[cb5.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[cb5.a.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ta5.c.values().length];
            a = iArr2;
            try {
                iArr2[ta5.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ta5.c.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ta5.c.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends gc5<?>>> hashMap = new HashMap<>();
        HashMap<String, gc5<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new vza());
        uhb uhbVar = uhb.c;
        hashMap2.put(StringBuffer.class.getName(), uhbVar);
        hashMap2.put(StringBuilder.class.getName(), uhbVar);
        hashMap2.put(Character.class.getName(), uhbVar);
        hashMap2.put(Character.TYPE.getName(), uhbVar);
        a47.a(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new oe0(true));
        hashMap2.put(Boolean.class.getName(), new oe0(false));
        hashMap2.put(BigInteger.class.getName(), new z37(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new z37(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), bm0.f);
        hashMap2.put(Date.class.getName(), wm2.f);
        for (Map.Entry<Class<?>, Object> entry : xwa.a()) {
            Object value = entry.getValue();
            if (value instanceof gc5) {
                hashMap2.put(entry.getKey().getName(), (gc5) value);
            } else {
                hashMap.put(entry.getKey().getName(), (Class) value);
            }
        }
        hashMap.put(mib.class.getName(), oib.class);
        b = hashMap2;
        c = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p90(ada adaVar) {
        this.a = adaVar == null ? new ada() : adaVar;
    }

    protected lw1<Object, Object> E(bda bdaVar, al alVar) throws JsonMappingException {
        Object h0 = bdaVar.j0().h0(alVar);
        if (h0 == null) {
            return null;
        }
        return bdaVar.e(alVar, h0);
    }

    protected gc5<?> G(bda bdaVar, al alVar, gc5<?> gc5Var) throws JsonMappingException {
        lw1<Object, Object> E = E(bdaVar, alVar);
        if (E == null) {
            return gc5Var;
        }
        return new wwa(E, E.a(bdaVar.i()), gc5Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object H(pca pcaVar, fa0 fa0Var) {
        return pcaVar.i().l(fa0Var.k());
    }

    protected gc5<?> K(bda bdaVar, y85 y85Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        return ub7.f.b(bdaVar.f(), y85Var, fa0Var);
    }

    public gc5<?> L(bda bdaVar, ga9 ga9Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        y85 m = ga9Var.m();
        bob bobVar = (bob) m.y();
        pca f = bdaVar.f();
        if (bobVar == null) {
            bobVar = c(f, m);
        }
        bob bobVar2 = bobVar;
        gc5<Object> gc5Var = (gc5) m.E();
        for (cda cdaVar : y()) {
            gc5<?> e = cdaVar.e(f, ga9Var, fa0Var, bobVar2, gc5Var);
            if (e != null) {
                return e;
            }
        }
        if (ga9Var.f0(AtomicReference.class)) {
            return k(bdaVar, ga9Var, fa0Var, z, bobVar2, gc5Var);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final gc5<?> M(pca pcaVar, y85 y85Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        y85 b0;
        y85 b02;
        Class<?> u = y85Var.u();
        if (Iterator.class.isAssignableFrom(u)) {
            y85[] T = pcaVar.M().T(y85Var, Iterator.class);
            if (T != null && T.length == 1) {
                b02 = T[0];
            } else {
                b02 = rnb.b0();
            }
            return u(pcaVar, y85Var, fa0Var, z, b02);
        } else if (Iterable.class.isAssignableFrom(u)) {
            y85[] T2 = pcaVar.M().T(y85Var, Iterable.class);
            if (T2 != null && T2.length == 1) {
                b0 = T2[0];
            } else {
                b0 = rnb.b0();
            }
            return s(pcaVar, y85Var, fa0Var, z, b0);
        } else if (CharSequence.class.isAssignableFrom(u)) {
            return uhb.c;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final gc5<?> N(bda bdaVar, y85 y85Var, fa0 fa0Var) throws JsonMappingException {
        if (dc5.class.isAssignableFrom(y85Var.u())) {
            return lca.c;
        }
        hl e = fa0Var.e();
        if (e != null) {
            if (bdaVar.u()) {
                q81.g(e.m(), bdaVar.L0(y76.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            y85 d = e.d();
            gc5<Object> S = S(bdaVar, e);
            if (S == null) {
                S = (gc5) d.E();
            }
            bob bobVar = (bob) d.y();
            if (bobVar == null) {
                bobVar = c(bdaVar.f(), d);
            }
            return new ad5(e, bobVar, S);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final gc5<?> P(y85 y85Var, pca pcaVar, fa0 fa0Var, boolean z) {
        Class<? extends gc5<?>> cls;
        String name = y85Var.u().getName();
        gc5<?> gc5Var = b.get(name);
        if (gc5Var == null && (cls = c.get(name)) != null) {
            return (gc5) q81.k(cls, false);
        }
        return gc5Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final gc5<?> Q(bda bdaVar, y85 y85Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        if (y85Var.Q()) {
            return o(bdaVar.f(), y85Var, fa0Var);
        }
        Class<?> u = y85Var.u();
        gc5<?> K = K(bdaVar, y85Var, fa0Var, z);
        if (K != null) {
            return K;
        }
        if (Calendar.class.isAssignableFrom(u)) {
            return bm0.f;
        }
        if (Date.class.isAssignableFrom(u)) {
            return wm2.f;
        }
        if (Map.Entry.class.isAssignableFrom(u)) {
            y85 k = y85Var.k(Map.Entry.class);
            return w(bdaVar, y85Var, fa0Var, z, k.j(0), k.j(1));
        } else if (ByteBuffer.class.isAssignableFrom(u)) {
            return new bk0();
        } else {
            if (InetAddress.class.isAssignableFrom(u)) {
                return new v05();
            }
            if (InetSocketAddress.class.isAssignableFrom(u)) {
                return new w05();
            }
            if (TimeZone.class.isAssignableFrom(u)) {
                return new vgb();
            }
            if (Charset.class.isAssignableFrom(u)) {
                return uhb.c;
            }
            if (Number.class.isAssignableFrom(u)) {
                int i = a.a[fa0Var.c(null).j().ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return null;
                    }
                    return z37.d;
                }
                return uhb.c;
            } else if (!ClassLoader.class.isAssignableFrom(u)) {
                return null;
            } else {
                return new phb(y85Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gc5<Object> S(bda bdaVar, al alVar) throws JsonMappingException {
        Object n0 = bdaVar.j0().n0(alVar);
        if (n0 == null) {
            return null;
        }
        return G(bdaVar, alVar, bdaVar.T0(alVar, n0));
    }

    protected boolean T(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean W(pca pcaVar, fa0 fa0Var, bob bobVar) {
        if (bobVar != null) {
            return false;
        }
        fc5.b m0 = pcaVar.i().m0(fa0Var.k());
        if (m0 != null && m0 != fc5.b.DEFAULT_TYPING) {
            if (m0 != fc5.b.STATIC) {
                return false;
            }
            return true;
        }
        return pcaVar.S(y76.USE_STATIC_TYPING);
    }

    @Override // defpackage.zca
    public gc5<Object> a(bda bdaVar, y85 y85Var, gc5<Object> gc5Var) throws JsonMappingException {
        gc5<?> gc5Var2;
        pca f = bdaVar.f();
        fa0 J0 = f.J0(y85Var);
        if (this.a.a()) {
            Iterator<cda> it = this.a.c().iterator();
            gc5Var2 = null;
            while (it.hasNext() && (gc5Var2 = it.next().d(f, y85Var, J0)) == null) {
            }
        } else {
            gc5Var2 = null;
        }
        if (gc5Var2 == null) {
            gc5<?> i = i(bdaVar, J0.k());
            if (i == null) {
                if (gc5Var == null) {
                    i = axa.b(f, y85Var.u(), false);
                    if (i == null) {
                        hl d = J0.d();
                        if (d == null) {
                            d = J0.e();
                        }
                        if (d != null) {
                            gc5<Object> a2 = a(bdaVar, d.d(), gc5Var);
                            if (f.b()) {
                                q81.g(d.m(), f.S(y76.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                            }
                            gc5Var = new ad5(d, null, a2);
                        } else {
                            gc5Var = axa.a(f, y85Var.u());
                        }
                    }
                }
            }
            gc5Var = i;
        } else {
            gc5Var = gc5Var2;
        }
        if (this.a.b()) {
            for (pa0 pa0Var : this.a.d()) {
                gc5Var = pa0Var.f(f, y85Var, J0, gc5Var);
            }
        }
        return gc5Var;
    }

    @Override // defpackage.zca
    public bob c(pca pcaVar, y85 y85Var) {
        Collection<ss6> a2;
        bl k = pcaVar.P(y85Var.u()).k();
        aob<?> r0 = pcaVar.i().r0(pcaVar, k, y85Var);
        if (r0 == null) {
            r0 = pcaVar.x(y85Var);
            a2 = null;
        } else {
            a2 = pcaVar.q0().a(pcaVar, k);
        }
        if (r0 == null) {
            return null;
        }
        return r0.e(pcaVar, y85Var, a2);
    }

    protected w66 d(bda bdaVar, fa0 fa0Var, w66 w66Var) throws JsonMappingException {
        cb5.a f;
        y85 b0 = w66Var.b0();
        cb5.b f2 = f(bdaVar, fa0Var, b0, Map.class);
        if (f2 == null) {
            f = cb5.a.USE_DEFAULTS;
        } else {
            f = f2.f();
        }
        Object obj = null;
        boolean z = true;
        if (f != cb5.a.USE_DEFAULTS && f != cb5.a.ALWAYS) {
            int i = a.b[f.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (obj = bdaVar.J0(null, f2.e())) != null) {
                            z = bdaVar.K0(obj);
                        }
                    } else {
                        obj = w66.s;
                    }
                } else if (b0.c()) {
                    obj = w66.s;
                }
            } else {
                obj = qa0.b(b0);
                if (obj != null && obj.getClass().isArray()) {
                    obj = er.a(obj);
                }
            }
            return w66Var.r0(obj, z);
        } else if (!bdaVar.M0(qca.WRITE_NULL_MAP_VALUES)) {
            return w66Var.r0(null, true);
        } else {
            return w66Var;
        }
    }

    protected gc5<Object> e(bda bdaVar, al alVar) throws JsonMappingException {
        Object f = bdaVar.j0().f(alVar);
        if (f != null) {
            return bdaVar.T0(alVar, f);
        }
        return null;
    }

    protected cb5.b f(bda bdaVar, fa0 fa0Var, y85 y85Var, Class<?> cls) throws JsonMappingException {
        pca f = bdaVar.f();
        cb5.b u = f.u(cls, fa0Var.g(f.m0()));
        cb5.b u2 = f.u(y85Var.u(), null);
        if (u2 != null) {
            int i = a.b[u2.j().ordinal()];
            if (i != 4) {
                if (i != 6) {
                    return u.n(u2.j());
                }
                return u;
            }
            return u.m(u2.e());
        }
        return u;
    }

    protected gc5<Object> i(bda bdaVar, al alVar) throws JsonMappingException {
        Object r = bdaVar.j0().r(alVar);
        if (r != null) {
            return bdaVar.T0(alVar, r);
        }
        return null;
    }

    protected gc5<?> j(bda bdaVar, rr rrVar, fa0 fa0Var, boolean z, bob bobVar, gc5<Object> gc5Var) throws JsonMappingException {
        pca f = bdaVar.f();
        Iterator<cda> it = y().iterator();
        gc5<?> gc5Var2 = null;
        while (it.hasNext() && (gc5Var2 = it.next().a(f, rrVar, fa0Var, bobVar, gc5Var)) == null) {
        }
        if (gc5Var2 == null) {
            Class<?> u = rrVar.u();
            if (gc5Var == null || q81.K(gc5Var)) {
                if (String[].class == u) {
                    gc5Var2 = nza.g;
                } else {
                    gc5Var2 = uwa.a(u);
                }
            }
            if (gc5Var2 == null) {
                gc5Var2 = new m47(rrVar.m(), z, bobVar, gc5Var);
            }
        }
        if (this.a.b()) {
            for (pa0 pa0Var : this.a.d()) {
                gc5Var2 = pa0Var.b(f, rrVar, fa0Var, gc5Var2);
            }
        }
        return gc5Var2;
    }

    protected gc5<?> k(bda bdaVar, ga9 ga9Var, fa0 fa0Var, boolean z, bob bobVar, gc5<Object> gc5Var) throws JsonMappingException {
        cb5.a f;
        boolean z2;
        y85 b2 = ga9Var.b();
        cb5.b f2 = f(bdaVar, fa0Var, b2, AtomicReference.class);
        if (f2 == null) {
            f = cb5.a.USE_DEFAULTS;
        } else {
            f = f2.f();
        }
        Object obj = null;
        if (f != cb5.a.USE_DEFAULTS && f != cb5.a.ALWAYS) {
            int i = a.b[f.ordinal()];
            z2 = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (obj = bdaVar.J0(null, f2.e())) != null) {
                            z2 = bdaVar.K0(obj);
                        }
                    } else {
                        obj = w66.s;
                    }
                } else if (b2.c()) {
                    obj = w66.s;
                }
            } else {
                obj = qa0.b(b2);
                if (obj != null && obj.getClass().isArray()) {
                    obj = er.a(obj);
                }
            }
        } else {
            z2 = false;
        }
        return new vy(ga9Var, z, bobVar, gc5Var).P(obj, z2);
    }

    public ct1<?> l(y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        return new dc1(y85Var, z, bobVar, gc5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.gc5<?> m(defpackage.bda r10, defpackage.fc1 r11, defpackage.fa0 r12, boolean r13, defpackage.bob r14, defpackage.gc5<java.lang.Object> r15) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            pca r6 = r10.f()
            java.lang.Iterable r0 = r9.y()
            java.util.Iterator r7 = r0.iterator()
            r8 = 0
            r0 = r8
        Le:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r0 = r7.next()
            cda r0 = (defpackage.cda) r0
            r1 = r6
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            gc5 r0 = r0.c(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Le
        L25:
            if (r0 != 0) goto L91
            gc5 r0 = r9.N(r10, r11, r12)
            if (r0 != 0) goto L91
            ta5$d r10 = r12.c(r8)
            ta5$c r10 = r10.j()
            ta5$c r1 = defpackage.ta5.c.OBJECT
            if (r10 != r1) goto L3a
            return r8
        L3a:
            java.lang.Class r10 = r11.u()
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r10)
            if (r1 == 0) goto L57
            y85 r10 = r11.m()
            boolean r13 = r10.P()
            if (r13 != 0) goto L51
            goto L52
        L51:
            r8 = r10
        L52:
            gc5 r0 = r9.q(r8)
            goto L91
        L57:
            y85 r1 = r11.m()
            java.lang.Class r1 = r1.u()
            boolean r10 = r9.T(r10)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r10 == 0) goto L7c
            if (r1 != r2) goto L73
            boolean r10 = defpackage.q81.K(r15)
            if (r10 == 0) goto L87
            l05 r10 = defpackage.l05.d
        L71:
            r0 = r10
            goto L87
        L73:
            y85 r10 = r11.m()
            ct1 r10 = r9.r(r10, r13, r14, r15)
            goto L71
        L7c:
            if (r1 != r2) goto L87
            boolean r10 = defpackage.q81.K(r15)
            if (r10 == 0) goto L87
            oza r10 = defpackage.oza.d
            goto L71
        L87:
            if (r0 != 0) goto L91
            y85 r10 = r11.m()
            ct1 r0 = r9.l(r10, r13, r14, r15)
        L91:
            ada r10 = r9.a
            boolean r10 = r10.b()
            if (r10 == 0) goto Lb4
            ada r10 = r9.a
            java.lang.Iterable r10 = r10.d()
            java.util.Iterator r10 = r10.iterator()
        La3:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto Lb4
            java.lang.Object r13 = r10.next()
            pa0 r13 = (defpackage.pa0) r13
            gc5 r0 = r13.d(r6, r11, r12, r0)
            goto La3
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p90.m(bda, fc1, fa0, boolean, bob, gc5):gc5");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gc5<?> n(bda bdaVar, y85 y85Var, fa0 fa0Var, boolean z) throws JsonMappingException {
        boolean z2;
        boolean z3;
        fa0 fa0Var2;
        fa0 fa0Var3 = fa0Var;
        pca f = bdaVar.f();
        if (!z && y85Var.l0() && (!y85Var.N() || !y85Var.m().W())) {
            z2 = true;
        } else {
            z2 = z;
        }
        bob c2 = c(f, y85Var.m());
        if (c2 != null) {
            z3 = false;
        } else {
            z3 = z2;
        }
        gc5<Object> e = e(bdaVar, fa0Var.k());
        gc5<?> gc5Var = null;
        if (y85Var.Z()) {
            q66 q66Var = (q66) y85Var;
            gc5<Object> i = i(bdaVar, fa0Var.k());
            if (q66Var instanceof t76) {
                return x(bdaVar, (t76) q66Var, fa0Var, z3, i, c2, e);
            }
            Iterator<cda> it = y().iterator();
            while (it.hasNext() && (gc5Var = it.next().g(f, q66Var, fa0Var, i, c2, e)) == null) {
            }
            if (gc5Var == null) {
                gc5Var = N(bdaVar, y85Var, fa0Var);
            }
            if (gc5Var != null && this.a.b()) {
                for (pa0 pa0Var : this.a.d()) {
                    gc5Var = pa0Var.g(f, q66Var, fa0Var3, gc5Var);
                }
            }
            return gc5Var;
        } else if (y85Var.M()) {
            cc1 cc1Var = (cc1) y85Var;
            if (cc1Var instanceof fc1) {
                return m(bdaVar, (fc1) cc1Var, fa0Var, z3, c2, e);
            }
            Iterator<cda> it2 = y().iterator();
            while (true) {
                if (it2.hasNext()) {
                    fa0Var2 = fa0Var3;
                    gc5Var = it2.next().f(f, cc1Var, fa0Var, c2, e);
                    if (gc5Var != null) {
                        break;
                    }
                    fa0Var3 = fa0Var2;
                } else {
                    fa0Var2 = fa0Var3;
                    break;
                }
            }
            if (gc5Var == null) {
                gc5Var = N(bdaVar, y85Var, fa0Var);
            }
            if (gc5Var != null && this.a.b()) {
                for (pa0 pa0Var2 : this.a.d()) {
                    gc5Var = pa0Var2.c(f, cc1Var, fa0Var2, gc5Var);
                }
            }
            return gc5Var;
        } else if (!y85Var.L()) {
            return null;
        } else {
            return j(bdaVar, (rr) y85Var, fa0Var, z3, c2, e);
        }
    }

    protected gc5<?> o(pca pcaVar, y85 y85Var, fa0 fa0Var) throws JsonMappingException {
        ta5.d c2 = fa0Var.c(null);
        if (c2.j() == ta5.c.OBJECT) {
            ((y80) fa0Var).t("declaringClass");
            return null;
        }
        gc5<?> K = oj3.K(y85Var.u(), pcaVar, fa0Var, c2);
        if (this.a.b()) {
            for (pa0 pa0Var : this.a.d()) {
                K = pa0Var.e(pcaVar, y85Var, fa0Var, K);
            }
        }
        return K;
    }

    public gc5<?> q(y85 y85Var) {
        return new pj3(y85Var);
    }

    public ct1<?> r(y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        return new k05(y85Var, z, bobVar, gc5Var);
    }

    protected gc5<?> s(pca pcaVar, y85 y85Var, fa0 fa0Var, boolean z, y85 y85Var2) throws JsonMappingException {
        return new b85(y85Var2, z, c(pcaVar, y85Var2));
    }

    protected gc5<?> u(pca pcaVar, y85 y85Var, fa0 fa0Var, boolean z, y85 y85Var2) throws JsonMappingException {
        return new d85(y85Var2, z, c(pcaVar, y85Var2));
    }

    protected gc5<?> w(bda bdaVar, y85 y85Var, fa0 fa0Var, boolean z, y85 y85Var2, y85 y85Var3) throws JsonMappingException {
        cb5.a f;
        Object obj = null;
        if (ta5.d.r(fa0Var.c(null), bdaVar.o0(Map.Entry.class)).j() == ta5.c.OBJECT) {
            return null;
        }
        p66 p66Var = new p66(y85Var3, y85Var2, y85Var3, z, c(bdaVar.f(), y85Var3), null);
        y85 M = p66Var.M();
        cb5.b f2 = f(bdaVar, fa0Var, M, Map.Entry.class);
        if (f2 == null) {
            f = cb5.a.USE_DEFAULTS;
        } else {
            f = f2.f();
        }
        if (f != cb5.a.USE_DEFAULTS && f != cb5.a.ALWAYS) {
            int i = a.b[f.ordinal()];
            boolean z2 = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (obj = bdaVar.J0(null, f2.e())) != null) {
                            z2 = bdaVar.K0(obj);
                        }
                    } else {
                        obj = w66.s;
                    }
                } else if (M.c()) {
                    obj = w66.s;
                }
            } else {
                obj = qa0.b(M);
                if (obj != null && obj.getClass().isArray()) {
                    obj = er.a(obj);
                }
            }
            return p66Var.T(obj, z2);
        }
        return p66Var;
    }

    protected gc5<?> x(bda bdaVar, t76 t76Var, fa0 fa0Var, boolean z, gc5<Object> gc5Var, bob bobVar, gc5<Object> gc5Var2) throws JsonMappingException {
        Set<String> i;
        Set<String> set = null;
        if (fa0Var.c(null).j() == ta5.c.OBJECT) {
            return null;
        }
        pca f = bdaVar.f();
        Iterator<cda> it = y().iterator();
        gc5<?> gc5Var3 = null;
        while (it.hasNext() && (gc5Var3 = it.next().b(f, t76Var, fa0Var, gc5Var, bobVar, gc5Var2)) == null) {
        }
        if (gc5Var3 == null && (gc5Var3 = N(bdaVar, t76Var, fa0Var)) == null) {
            Object H = H(f, fa0Var);
            ab5.a l0 = f.l0(Map.class, fa0Var.k());
            if (l0 == null) {
                i = null;
            } else {
                i = l0.i();
            }
            db5.a n0 = f.n0(Map.class, fa0Var.k());
            if (n0 != null) {
                set = n0.e();
            }
            gc5Var3 = d(bdaVar, fa0Var, w66.Z(i, set, t76Var, z, bobVar, gc5Var, gc5Var2, H));
        }
        if (this.a.b()) {
            for (pa0 pa0Var : this.a.d()) {
                gc5Var3 = pa0Var.h(f, t76Var, fa0Var, gc5Var3);
            }
        }
        return gc5Var3;
    }

    protected abstract Iterable<cda> y();
}
