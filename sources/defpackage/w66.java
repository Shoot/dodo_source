package defpackage;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.cb5;
import defpackage.er8;
import defpackage.st4;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: MapSerializer.java */
@o85
/* renamed from: w66  reason: default package */
/* loaded from: classes2.dex */
public class w66 extends ct1<Map<?, ?>> implements bv1 {
    protected static final y85 r = rnb.b0();
    public static final Object s = cb5.a.NON_EMPTY;
    protected final ia0 c;
    protected final boolean d;
    protected final y85 e;
    protected final y85 f;
    protected gc5<Object> g;
    protected gc5<Object> h;
    protected final bob i;
    protected er8 j;
    protected final Set<String> k;
    protected final Set<String> l;
    protected final Object m;
    protected final Object n;
    protected final boolean o;
    protected final st4.a p;
    protected final boolean q;

    /* compiled from: MapSerializer.java */
    /* renamed from: w66$a */
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

    protected w66(Set<String> set, Set<String> set2, y85 y85Var, y85 y85Var2, boolean z, bob bobVar, gc5<?> gc5Var, gc5<?> gc5Var2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.k = set;
        this.l = set2;
        this.e = y85Var;
        this.f = y85Var2;
        this.d = z;
        this.i = bobVar;
        this.g = gc5Var;
        this.h = gc5Var2;
        this.j = er8.c();
        this.c = null;
        this.m = null;
        this.q = false;
        this.n = null;
        this.o = false;
        this.p = st4.a(set, set2);
    }

    private final gc5<Object> N(bda bdaVar, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        gc5<Object> j = this.j.j(cls);
        if (j != null) {
            return j;
        }
        if (this.f.G()) {
            return L(this.j, bdaVar.w(this.f, cls), bdaVar);
        }
        return M(this.j, cls, bdaVar);
    }

    public static w66 W(Set<String> set, y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var, gc5<Object> gc5Var2, Object obj) {
        return Z(set, null, y85Var, z, bobVar, gc5Var, gc5Var2, obj);
    }

    public static w66 Z(Set<String> set, Set<String> set2, y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var, gc5<Object> gc5Var2, Object obj) {
        y85 m;
        y85 y85Var2;
        y85 y85Var3;
        boolean z2;
        if (y85Var == null) {
            y85Var3 = r;
            y85Var2 = y85Var3;
        } else {
            y85 s2 = y85Var.s();
            if (y85Var.K(Properties.class)) {
                m = rnb.b0();
            } else {
                m = y85Var.m();
            }
            y85Var2 = m;
            y85Var3 = s2;
        }
        boolean z3 = false;
        if (!z) {
            if (y85Var2 != null && y85Var2.S()) {
                z3 = true;
            }
            z2 = z3;
        } else if (y85Var2.u() == Object.class) {
            z2 = false;
        } else {
            z2 = z;
        }
        w66 w66Var = new w66(set, set2, y85Var3, y85Var2, z2, bobVar, gc5Var, gc5Var2);
        if (obj != null) {
            return w66Var.x0(obj);
        }
        return w66Var;
    }

    protected void K(String str) {
        q81.Z(w66.class, this, str);
    }

    protected final gc5<Object> L(er8 er8Var, y85 y85Var, bda bdaVar) throws JsonMappingException {
        er8.d g = er8Var.g(y85Var, bdaVar, this.c);
        er8 er8Var2 = g.b;
        if (er8Var != er8Var2) {
            this.j = er8Var2;
        }
        return g.a;
    }

    protected final gc5<Object> M(er8 er8Var, Class<?> cls, bda bdaVar) throws JsonMappingException {
        er8.d h = er8Var.h(cls, bdaVar, this.c);
        er8 er8Var2 = h.b;
        if (er8Var != er8Var2) {
            this.j = er8Var2;
        }
        return h.a;
    }

    protected boolean P(Map<?, ?> map) {
        if ((map instanceof HashMap) && map.containsKey(null)) {
            return true;
        }
        return false;
    }

    protected Map<?, ?> Q(Map<?, ?> map, ua5 ua5Var, bda bdaVar) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (P(map)) {
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key == null) {
                    T(ua5Var, bdaVar, entry.getValue());
                } else {
                    treeMap.put(key, entry.getValue());
                }
            }
            return treeMap;
        }
        return new TreeMap(map);
    }

    @Override // defpackage.ct1
    /* renamed from: S */
    public w66 G(bob bobVar) {
        if (this.i == bobVar) {
            return this;
        }
        K("_withValueTypeSerializer");
        return new w66(this, bobVar, this.n, this.o);
    }

    protected void T(ua5 ua5Var, bda bdaVar, Object obj) throws IOException {
        gc5<Object> gc5Var;
        gc5<Object> N = bdaVar.N(this.e, this.c);
        if (obj == null) {
            if (this.o) {
                return;
            }
            gc5Var = bdaVar.n0();
        } else {
            gc5Var = this.h;
            if (gc5Var == null) {
                gc5Var = N(bdaVar, obj);
            }
            Object obj2 = this.n;
            if (obj2 == s) {
                if (gc5Var.d(bdaVar, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        }
        try {
            N.f(null, ua5Var, bdaVar);
            gc5Var.f(obj, ua5Var, bdaVar);
        } catch (Exception e) {
            E(bdaVar, e, obj, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
        if (r0 != 5) goto L75;
     */
    @Override // defpackage.bv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gc5<?> a(defpackage.bda r14, defpackage.ia0 r15) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w66.a(bda, ia0):gc5");
    }

    public y85 b0() {
        return this.f;
    }

    @Override // defpackage.gc5
    /* renamed from: e0 */
    public boolean d(bda bdaVar, Map<?, ?> map) {
        boolean z;
        gc5<Object> N;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this.n;
        if (obj == null && !this.o) {
            return false;
        }
        gc5<Object> gc5Var = this.h;
        if (s == obj) {
            z = true;
        } else {
            z = false;
        }
        if (gc5Var != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this.o) {
                        return false;
                    }
                } else if (z) {
                    if (!gc5Var.d(bdaVar, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 == null) {
                if (!this.o) {
                    return false;
                }
            } else {
                try {
                    N = N(bdaVar, obj3);
                } catch (DatabindException unused) {
                }
                if (z) {
                    if (!N.d(bdaVar, obj3)) {
                        return false;
                    }
                } else {
                    if (obj != null && obj.equals(map)) {
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: f0 */
    public void f(Map<?, ?> map, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.i1(map);
        q0(map, ua5Var, bdaVar);
        ua5Var.b0();
    }

    public void h0(Map<?, ?> map, ua5 ua5Var, bda bdaVar) throws IOException {
        Object obj = null;
        if (this.i != null) {
            o0(map, ua5Var, bdaVar, null);
            return;
        }
        gc5<Object> gc5Var = this.g;
        try {
            Object obj2 = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    obj2 = entry.getKey();
                    if (obj2 == null) {
                        bdaVar.N(this.e, this.c).f(null, ua5Var, bdaVar);
                    } else {
                        st4.a aVar = this.p;
                        if (aVar == null || !aVar.b(obj2)) {
                            gc5Var.f(obj2, ua5Var, bdaVar);
                        }
                    }
                    if (value == null) {
                        bdaVar.G(ua5Var);
                    } else {
                        gc5<Object> gc5Var2 = this.h;
                        if (gc5Var2 == null) {
                            gc5Var2 = N(bdaVar, value);
                        }
                        gc5Var2.f(value, ua5Var, bdaVar);
                    }
                } catch (Exception e) {
                    e = e;
                    obj = obj2;
                    E(bdaVar, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void j0(Map<?, ?> map, ua5 ua5Var, bda bdaVar, gc5<Object> gc5Var) throws IOException {
        gc5<Object> gc5Var2 = this.g;
        bob bobVar = this.i;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            st4.a aVar = this.p;
            if (aVar == null || !aVar.b(key)) {
                if (key == null) {
                    bdaVar.N(this.e, this.c).f(null, ua5Var, bdaVar);
                } else {
                    gc5Var2.f(key, ua5Var, bdaVar);
                }
                Object value = entry.getValue();
                if (value == null) {
                    bdaVar.G(ua5Var);
                } else if (bobVar == null) {
                    try {
                        gc5Var.f(value, ua5Var, bdaVar);
                    } catch (Exception e) {
                        E(bdaVar, e, map, String.valueOf(key));
                    }
                } else {
                    gc5Var.i(value, ua5Var, bdaVar, bobVar);
                }
            }
        }
    }

    public void l0(bda bdaVar, ua5 ua5Var, Object obj, Map<?, ?> map, tq8 tq8Var, Object obj2) throws IOException {
        boolean z;
        gc5<Object> gc5Var;
        gc5<Object> n0;
        v66 v66Var = new v66(this.i, this.c);
        if (s == obj2) {
            z = true;
        } else {
            z = false;
        }
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            st4.a aVar = this.p;
            if (aVar == null || !aVar.b(key)) {
                if (key == null) {
                    gc5Var = bdaVar.N(this.e, this.c);
                } else {
                    gc5Var = this.g;
                }
                Object value = entry.getValue();
                if (value == null) {
                    if (!this.o) {
                        n0 = bdaVar.n0();
                    }
                } else {
                    n0 = this.h;
                    if (n0 == null) {
                        n0 = N(bdaVar, value);
                    }
                    if (z) {
                        if (n0.d(bdaVar, value)) {
                        }
                    } else if (obj2 != null && obj2.equals(value)) {
                    }
                }
                v66Var.d(key, value, gc5Var, n0);
                try {
                    tq8Var.a(obj, ua5Var, bdaVar, v66Var);
                } catch (Exception e) {
                    E(bdaVar, e, map, String.valueOf(key));
                }
            }
        }
    }

    public void m0(Map<?, ?> map, ua5 ua5Var, bda bdaVar, tq8 tq8Var, Object obj) throws IOException {
        boolean z;
        gc5<Object> gc5Var;
        gc5<Object> n0;
        v66 v66Var = new v66(this.i, this.c);
        if (s == obj) {
            z = true;
        } else {
            z = false;
        }
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            st4.a aVar = this.p;
            if (aVar == null || !aVar.b(key)) {
                if (key == null) {
                    gc5Var = bdaVar.N(this.e, this.c);
                } else {
                    gc5Var = this.g;
                }
                Object value = entry.getValue();
                if (value == null) {
                    if (!this.o) {
                        n0 = bdaVar.n0();
                    }
                } else {
                    n0 = this.h;
                    if (n0 == null) {
                        n0 = N(bdaVar, value);
                    }
                    if (z) {
                        if (n0.d(bdaVar, value)) {
                        }
                    } else if (obj != null && obj.equals(value)) {
                    }
                }
                v66Var.d(key, value, gc5Var, n0);
                try {
                    tq8Var.a(map, ua5Var, bdaVar, v66Var);
                } catch (Exception e) {
                    E(bdaVar, e, map, String.valueOf(key));
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|(2:52|53)(2:14|(1:19)(2:50|32))|20|(3:44|45|(2:49|32)(2:47|48))(4:22|23|(1:25)|(3:40|41|(2:43|32))(2:27|(2:31|32)))|33|34|36|32|10) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        E(r10, r2, r8, java.lang.String.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(java.util.Map<?, ?> r8, defpackage.ua5 r9, defpackage.bda r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r7 = this;
            bob r0 = r7.i
            if (r0 == 0) goto L8
            r7.o0(r8, r9, r10, r11)
            return
        L8:
            java.lang.Object r0 = defpackage.w66.s
            if (r0 != r11) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 != 0) goto L32
            y85 r4 = r7.e
            ia0 r5 = r7.c
            gc5 r4 = r10.N(r4, r5)
            goto L3f
        L32:
            st4$a r4 = r7.p
            if (r4 == 0) goto L3d
            boolean r4 = r4.b(r3)
            if (r4 == 0) goto L3d
            goto L17
        L3d:
            gc5<java.lang.Object> r4 = r7.g
        L3f:
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L4f
            boolean r5 = r7.o
            if (r5 == 0) goto L4a
            goto L17
        L4a:
            gc5 r5 = r10.n0()
            goto L69
        L4f:
            gc5<java.lang.Object> r5 = r7.h
            if (r5 != 0) goto L57
            gc5 r5 = r7.N(r10, r2)
        L57:
            if (r0 == 0) goto L60
            boolean r6 = r5.d(r10, r2)
            if (r6 == 0) goto L69
            goto L17
        L60:
            if (r11 == 0) goto L69
            boolean r6 = r11.equals(r2)
            if (r6 == 0) goto L69
            goto L17
        L69:
            r4.f(r3, r9, r10)     // Catch: java.lang.Exception -> L70
            r5.f(r2, r9, r10)     // Catch: java.lang.Exception -> L70
            goto L17
        L70:
            r2 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.E(r10, r2, r8, r3)
            goto L17
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w66.n0(java.util.Map, ua5, bda, java.lang.Object):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(2:51|52)(2:9|(1:14)(2:49|32))|15|(3:43|44|(2:48|32)(2:46|47))(4:17|18|(1:20)|(3:38|39|(2:42|32)(1:41))(2:22|(2:36|32)))|27|28|29|31|32|5) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        E(r10, r2, r8, java.lang.String.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(java.util.Map<?, ?> r8, defpackage.ua5 r9, defpackage.bda r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.Object r0 = defpackage.w66.s
            if (r0 != r11) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 != 0) goto L2a
            y85 r4 = r7.e
            ia0 r5 = r7.c
            gc5 r4 = r10.N(r4, r5)
            goto L37
        L2a:
            st4$a r4 = r7.p
            if (r4 == 0) goto L35
            boolean r4 = r4.b(r3)
            if (r4 == 0) goto L35
            goto Lf
        L35:
            gc5<java.lang.Object> r4 = r7.g
        L37:
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L47
            boolean r5 = r7.o
            if (r5 == 0) goto L42
            goto Lf
        L42:
            gc5 r5 = r10.n0()
            goto L61
        L47:
            gc5<java.lang.Object> r5 = r7.h
            if (r5 != 0) goto L4f
            gc5 r5 = r7.N(r10, r2)
        L4f:
            if (r0 == 0) goto L58
            boolean r6 = r5.d(r10, r2)
            if (r6 == 0) goto L61
            goto Lf
        L58:
            if (r11 == 0) goto L61
            boolean r6 = r11.equals(r2)
            if (r6 == 0) goto L61
            goto Lf
        L61:
            r4.f(r3, r9, r10)
            bob r4 = r7.i     // Catch: java.lang.Exception -> L6a
            r5.i(r2, r9, r10, r4)     // Catch: java.lang.Exception -> L6a
            goto Lf
        L6a:
            r2 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.E(r10, r2, r8, r3)
            goto Lf
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w66.o0(java.util.Map, ua5, bda, java.lang.Object):void");
    }

    @Override // defpackage.gc5
    /* renamed from: p0 */
    public void i(Map<?, ?> map, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        ua5Var.u(map);
        c9c g = bobVar.g(ua5Var, bobVar.d(map, nc5.START_OBJECT));
        q0(map, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    public void q0(Map<?, ?> map, ua5 ua5Var, bda bdaVar) throws IOException {
        tq8 w;
        if (!map.isEmpty()) {
            if (this.q || bdaVar.M0(qca.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = Q(map, ua5Var, bdaVar);
            }
            Map<?, ?> map2 = map;
            Object obj = this.m;
            if (obj != null && (w = w(bdaVar, obj, map2)) != null) {
                m0(map2, ua5Var, bdaVar, w, this.n);
                return;
            }
            Object obj2 = this.n;
            if (obj2 == null && !this.o) {
                gc5<Object> gc5Var = this.h;
                if (gc5Var != null) {
                    j0(map2, ua5Var, bdaVar, gc5Var);
                    return;
                } else {
                    h0(map2, ua5Var, bdaVar);
                    return;
                }
            }
            n0(map2, ua5Var, bdaVar, obj2);
        }
    }

    public w66 r0(Object obj, boolean z) {
        if (obj == this.n && z == this.o) {
            return this;
        }
        K("withContentInclusion");
        return new w66(this, this.i, obj, z);
    }

    public w66 x0(Object obj) {
        if (this.m == obj) {
            return this;
        }
        K("withFilterId");
        return new w66(this, obj, this.q);
    }

    public w66 z0(ia0 ia0Var, gc5<?> gc5Var, gc5<?> gc5Var2, Set<String> set, Set<String> set2, boolean z) {
        K("withResolved");
        w66 w66Var = new w66(this, ia0Var, gc5Var, gc5Var2, set, set2);
        if (z != w66Var.q) {
            return new w66(w66Var, this.m, z);
        }
        return w66Var;
    }

    protected w66(w66 w66Var, ia0 ia0Var, gc5<?> gc5Var, gc5<?> gc5Var2, Set<String> set, Set<String> set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : null;
        this.k = set;
        this.l = set2;
        this.e = w66Var.e;
        this.f = w66Var.f;
        this.d = w66Var.d;
        this.i = w66Var.i;
        this.g = gc5Var;
        this.h = gc5Var2;
        this.j = er8.c();
        this.c = ia0Var;
        this.m = w66Var.m;
        this.q = w66Var.q;
        this.n = w66Var.n;
        this.o = w66Var.o;
        this.p = st4.a(set, set2);
    }

    protected w66(w66 w66Var, bob bobVar, Object obj, boolean z) {
        super(Map.class, false);
        this.k = w66Var.k;
        this.l = w66Var.l;
        this.e = w66Var.e;
        this.f = w66Var.f;
        this.d = w66Var.d;
        this.i = bobVar;
        this.g = w66Var.g;
        this.h = w66Var.h;
        this.j = w66Var.j;
        this.c = w66Var.c;
        this.m = w66Var.m;
        this.q = w66Var.q;
        this.n = obj;
        this.o = z;
        this.p = w66Var.p;
    }

    protected w66(w66 w66Var, Object obj, boolean z) {
        super(Map.class, false);
        this.k = w66Var.k;
        this.l = w66Var.l;
        this.e = w66Var.e;
        this.f = w66Var.f;
        this.d = w66Var.d;
        this.i = w66Var.i;
        this.g = w66Var.g;
        this.h = w66Var.h;
        this.j = er8.c();
        this.c = w66Var.c;
        this.m = obj;
        this.q = z;
        this.n = w66Var.n;
        this.o = w66Var.o;
        this.p = w66Var.p;
    }
}
