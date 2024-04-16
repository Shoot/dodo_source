package defpackage;

import defpackage.fa5;
import defpackage.n85;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: POJOPropertiesCollector.java */
/* renamed from: do7  reason: default package */
/* loaded from: classes2.dex */
public class do7 {
    protected final w76<?> a;
    protected final j4 b;
    protected final boolean c;
    protected final y85 d;
    protected final bl e;
    protected final v1c<?> f;
    protected final ql g;
    protected final boolean h;
    protected boolean i;
    protected LinkedHashMap<String, jo7> j;
    protected LinkedList<jo7> k;
    protected Map<vq8, vq8> l;
    protected LinkedList<hl> m;
    protected LinkedList<hl> n;
    protected LinkedList<il> o;
    protected LinkedList<hl> p;
    protected LinkedList<hl> q;
    protected LinkedList<hl> r;
    protected HashSet<String> s;
    protected LinkedHashMap<Object, hl> t;
    @Deprecated
    protected final boolean u;
    @Deprecated
    protected String v = "set";

    /* JADX INFO: Access modifiers changed from: protected */
    public do7(w76<?> w76Var, boolean z, y85 y85Var, bl blVar, j4 j4Var) {
        this.a = w76Var;
        this.c = z;
        this.d = y85Var;
        this.e = blVar;
        if (w76Var.Q()) {
            this.h = true;
            this.g = w76Var.i();
        } else {
            this.h = false;
            this.g = ql.T0();
        }
        this.f = w76Var.y(y85Var.u(), blVar);
        this.b = j4Var;
        this.u = w76Var.S(y76.USE_STD_BEAN_NAMING);
    }

    private boolean h(Collection<jo7> collection) {
        for (jo7 jo7Var : collection) {
            if (jo7Var.t().c()) {
                return true;
            }
        }
        return false;
    }

    private String i(String str) {
        vq8 vq8Var;
        Map<vq8, vq8> map = this.l;
        if (map != null && (vq8Var = map.get(m(str))) != null) {
            return vq8Var.c();
        }
        return str;
    }

    private wq8 l() {
        Object x = this.g.x(this.e);
        if (x == null) {
            return this.a.K();
        }
        if (x instanceof wq8) {
            return (wq8) x;
        }
        if (x instanceof Class) {
            Class cls = (Class) x;
            if (cls == wq8.class) {
                return null;
            }
            if (wq8.class.isAssignableFrom(cls)) {
                this.a.E();
                return (wq8) q81.k(cls, this.a.b());
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + x.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
    }

    private vq8 m(String str) {
        return vq8.b(str, null);
    }

    public w76<?> A() {
        return this.a;
    }

    public hl B() {
        if (!this.i) {
            w();
        }
        LinkedList<hl> linkedList = this.q;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                H("Multiple 'as-key' properties defined (%s vs %s)", this.q.get(0), this.q.get(1));
            }
            return this.q.get(0);
        }
        return null;
    }

    public hl C() {
        if (!this.i) {
            w();
        }
        LinkedList<hl> linkedList = this.r;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                H("Multiple 'as-value' properties defined (%s vs %s)", this.r.get(0), this.r.get(1));
            }
            return this.r.get(0);
        }
        return null;
    }

    public c57 D() {
        c57 E = this.g.E(this.e);
        if (E != null) {
            return this.g.G(this.e, E);
        }
        return E;
    }

    public List<ja0> E() {
        return new ArrayList(F().values());
    }

    protected Map<String, jo7> F() {
        if (!this.i) {
            w();
        }
        return this.j;
    }

    public y85 G() {
        return this.d;
    }

    protected void H(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.e + ": " + str);
    }

    protected void a(Map<String, jo7> map, ll llVar) {
        boolean z;
        jo7 o;
        fa5.a i;
        String n = this.g.n(llVar);
        if (n == null) {
            n = "";
        }
        vq8 u = this.g.u(llVar);
        if (u != null && !u.i()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!n.isEmpty() && (i = this.g.i(this.a, llVar.r())) != null && i != fa5.a.DISABLED) {
                u = vq8.a(n);
            } else {
                return;
            }
        }
        vq8 vq8Var = u;
        String i2 = i(n);
        if (z && i2.isEmpty()) {
            o = n(map, vq8Var);
        } else {
            o = o(map, i2);
        }
        o.X(llVar, vq8Var, z, true, false);
        this.k.add(o);
    }

    protected void b(Map<String, jo7> map) {
        if (!this.h) {
            return;
        }
        Iterator<dl> it = this.e.o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dl next = it.next();
            if (this.k == null) {
                this.k = new LinkedList<>();
            }
            int x = next.x();
            for (int i = 0; i < x; i++) {
                a(map, next.q(i));
            }
        }
        for (il ilVar : this.e.r()) {
            if (this.k == null) {
                this.k = new LinkedList<>();
            }
            int y = ilVar.y();
            for (int i2 = 0; i2 < y; i2++) {
                a(map, ilVar.q(i2));
            }
        }
    }

    protected void c(Map<String, jo7> map) {
        boolean z;
        vq8 u;
        boolean z2;
        vq8 vq8Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ql qlVar = this.g;
        if (!this.c && !this.a.S(y76.ALLOW_FINAL_FIELDS_AS_MUTATORS)) {
            z = true;
        } else {
            z = false;
        }
        boolean S = this.a.S(y76.PROPAGATE_TRANSIENT_MARKER);
        for (fl flVar : this.e.l()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(qlVar.K0(this.a, flVar))) {
                if (this.q == null) {
                    this.q = new LinkedList<>();
                }
                this.q.add(flVar);
            }
            if (bool.equals(qlVar.L0(flVar))) {
                if (this.r == null) {
                    this.r = new LinkedList<>();
                }
                this.r.add(flVar);
            } else {
                boolean equals = bool.equals(qlVar.F0(flVar));
                boolean equals2 = bool.equals(qlVar.J0(flVar));
                if (!equals && !equals2) {
                    String n = qlVar.n(flVar);
                    if (n == null) {
                        n = flVar.getName();
                    }
                    String d = this.b.d(flVar, n);
                    if (d != null) {
                        vq8 m = m(d);
                        vq8 b0 = qlVar.b0(this.a, flVar, m);
                        if (b0 != null && !b0.equals(m)) {
                            if (this.l == null) {
                                this.l = new HashMap();
                            }
                            this.l.put(b0, m);
                        }
                        if (this.c) {
                            u = qlVar.w(flVar);
                        } else {
                            u = qlVar.u(flVar);
                        }
                        if (u != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && u.i()) {
                            vq8Var = m(d);
                            z3 = false;
                        } else {
                            vq8Var = u;
                            z3 = z2;
                        }
                        if (vq8Var != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            z4 = this.f.b(flVar);
                        }
                        boolean O0 = qlVar.O0(flVar);
                        if (flVar.s() && !z2) {
                            if (S) {
                                z6 = false;
                                z5 = true;
                            } else {
                                z5 = O0;
                                z6 = false;
                            }
                        } else {
                            z5 = O0;
                            z6 = z4;
                        }
                        if (!z || vq8Var != null || z5 || !Modifier.isFinal(flVar.r())) {
                            o(map, d).Y(flVar, vq8Var, z3, z6, z5);
                        }
                    }
                } else {
                    if (equals) {
                        if (this.n == null) {
                            this.n = new LinkedList<>();
                        }
                        this.n.add(flVar);
                    }
                    if (equals2) {
                        if (this.p == null) {
                            this.p = new LinkedList<>();
                        }
                        this.p.add(flVar);
                    }
                }
            }
        }
    }

    protected void d(Map<String, jo7> map, il ilVar, ql qlVar) {
        boolean z;
        vq8 vq8Var;
        boolean z2;
        String str;
        boolean z3;
        boolean i;
        Class<?> H = ilVar.H();
        if (H != Void.TYPE) {
            if (H != Void.class || this.a.S(y76.ALLOW_VOID_VALUED_PROPERTIES)) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(qlVar.F0(ilVar))) {
                    if (this.m == null) {
                        this.m = new LinkedList<>();
                    }
                    this.m.add(ilVar);
                } else if (bool.equals(qlVar.K0(this.a, ilVar))) {
                    if (this.q == null) {
                        this.q = new LinkedList<>();
                    }
                    this.q.add(ilVar);
                } else if (bool.equals(qlVar.L0(ilVar))) {
                    if (this.r == null) {
                        this.r = new LinkedList<>();
                    }
                    this.r.add(ilVar);
                } else {
                    vq8 w = qlVar.w(ilVar);
                    boolean z4 = false;
                    if (w != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        str = qlVar.n(ilVar);
                        if (str == null) {
                            str = this.b.c(ilVar, ilVar.getName());
                        }
                        if (str == null) {
                            str = this.b.a(ilVar, ilVar.getName());
                            if (str == null) {
                                return;
                            }
                            i = this.f.c(ilVar);
                        } else {
                            i = this.f.i(ilVar);
                        }
                        vq8Var = w;
                        z3 = i;
                        z2 = z;
                    } else {
                        String n = qlVar.n(ilVar);
                        if (n == null && (n = this.b.c(ilVar, ilVar.getName())) == null) {
                            n = this.b.a(ilVar, ilVar.getName());
                        }
                        if (n == null) {
                            n = ilVar.getName();
                        }
                        if (w.i()) {
                            w = m(n);
                        } else {
                            z4 = z;
                        }
                        vq8Var = w;
                        z2 = z4;
                        str = n;
                        z3 = true;
                    }
                    o(map, i(str)).a0(ilVar, vq8Var, z2, z3, qlVar.O0(ilVar));
                }
            }
        }
    }

    protected void e(Map<String, jo7> map) {
        for (hl hlVar : this.e.l()) {
            k(this.g.o(hlVar), hlVar);
        }
        for (il ilVar : this.e.w()) {
            if (ilVar.y() == 1) {
                k(this.g.o(ilVar), ilVar);
            }
        }
    }

    protected void f(Map<String, jo7> map) {
        for (il ilVar : this.e.w()) {
            int y = ilVar.y();
            if (y == 0) {
                d(map, ilVar, this.g);
            } else if (y == 1) {
                g(map, ilVar, this.g);
            } else if (y == 2 && Boolean.TRUE.equals(this.g.J0(ilVar))) {
                if (this.o == null) {
                    this.o = new LinkedList<>();
                }
                this.o.add(ilVar);
            }
        }
    }

    protected void g(Map<String, jo7> map, il ilVar, ql qlVar) {
        boolean z;
        vq8 vq8Var;
        boolean z2;
        String str;
        boolean z3;
        vq8 u = qlVar.u(ilVar);
        boolean z4 = false;
        if (u != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = qlVar.n(ilVar);
            if (str == null) {
                str = this.b.b(ilVar, ilVar.getName());
            }
            if (str == null) {
                return;
            }
            vq8Var = u;
            z3 = this.f.j(ilVar);
            z2 = z;
        } else {
            String n = qlVar.n(ilVar);
            if (n == null) {
                n = this.b.b(ilVar, ilVar.getName());
            }
            if (n == null) {
                n = ilVar.getName();
            }
            if (u.i()) {
                u = m(n);
            } else {
                z4 = z;
            }
            vq8Var = u;
            z2 = z4;
            str = n;
            z3 = true;
        }
        String i = i(str);
        o(map, i).b0(ilVar, vq8Var, z2, z3, qlVar.O0(ilVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(String str) {
        if (!this.c && str != null) {
            if (this.s == null) {
                this.s = new HashSet<>();
            }
            this.s.add(str);
        }
    }

    protected void k(n85.a aVar, hl hlVar) {
        if (aVar == null) {
            return;
        }
        Object e = aVar.e();
        if (this.t == null) {
            this.t = new LinkedHashMap<>();
        }
        hl put = this.t.put(e, hlVar);
        if (put != null && put.getClass() == hlVar.getClass()) {
            String name = e.getClass().getName();
            throw new IllegalArgumentException("Duplicate injectable value with id '" + e + "' (of type " + name + ")");
        }
    }

    protected jo7 n(Map<String, jo7> map, vq8 vq8Var) {
        String c = vq8Var.c();
        jo7 jo7Var = map.get(c);
        if (jo7Var == null) {
            jo7 jo7Var2 = new jo7(this.a, this.g, this.c, vq8Var);
            map.put(c, jo7Var2);
            return jo7Var2;
        }
        return jo7Var;
    }

    protected jo7 o(Map<String, jo7> map, String str) {
        jo7 jo7Var = map.get(str);
        if (jo7Var == null) {
            jo7 jo7Var2 = new jo7(this.a, this.g, this.c, vq8.a(str));
            map.put(str, jo7Var2);
            return jo7Var2;
        }
        return jo7Var;
    }

    protected void p(Map<String, jo7> map) {
        do7 do7Var;
        boolean S = this.a.S(y76.INFER_PROPERTY_MUTATORS);
        for (jo7 jo7Var : map.values()) {
            if (this.c) {
                do7Var = null;
            } else {
                do7Var = this;
            }
            jo7Var.z0(S, do7Var);
        }
    }

    protected void q(Map<String, jo7> map) {
        Iterator<jo7> it = map.values().iterator();
        while (it.hasNext()) {
            jo7 next = it.next();
            if (!next.d0()) {
                it.remove();
            } else if (next.c0()) {
                if (!next.B()) {
                    it.remove();
                    j(next.v());
                } else {
                    next.y0();
                    if (!next.a()) {
                        j(next.v());
                    }
                }
            }
        }
    }

    protected void r(Map<String, jo7> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, jo7>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            jo7 value = it.next().getValue();
            Set<vq8> h0 = value.h0();
            if (!h0.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (h0.size() == 1) {
                    linkedList.add(value.B0(h0.iterator().next()));
                } else {
                    linkedList.addAll(value.f0(h0));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                jo7 jo7Var = (jo7) it2.next();
                String v = jo7Var.v();
                jo7 jo7Var2 = map.get(v);
                if (jo7Var2 == null) {
                    map.put(v, jo7Var);
                } else {
                    jo7Var2.W(jo7Var);
                }
                if (u(jo7Var, this.k) && (hashSet = this.s) != null) {
                    hashSet.remove(v);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void s(java.util.Map<java.lang.String, defpackage.jo7> r9, defpackage.wq8 r10) {
        /*
            r8 = this;
            java.util.Collection r0 = r9.values()
            int r1 = r9.size()
            jo7[] r1 = new defpackage.jo7[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            jo7[] r0 = (defpackage.jo7[]) r0
            r9.clear()
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto Ld9
            r3 = r0[r2]
            vq8 r4 = r3.q()
            boolean r5 = r3.v0()
            if (r5 == 0) goto L2d
            w76<?> r5 = r8.a
            y76 r6 = defpackage.y76.ALLOW_EXPLICIT_PROPERTY_RENAMING
            boolean r5 = r5.S(r6)
            if (r5 == 0) goto Laf
        L2d:
            boolean r5 = r8.c
            if (r5 == 0) goto L5b
            boolean r5 = r3.t0()
            if (r5 == 0) goto L46
            w76<?> r5 = r8.a
            il r6 = r3.s()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.c(r5, r6, r7)
            goto Lb0
        L46:
            boolean r5 = r3.s0()
            if (r5 == 0) goto Laf
            w76<?> r5 = r8.a
            fl r6 = r3.p()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.b(r5, r6, r7)
            goto Lb0
        L5b:
            boolean r5 = r3.u0()
            if (r5 == 0) goto L70
            w76<?> r5 = r8.a
            il r6 = r3.q0()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.d(r5, r6, r7)
            goto Lb0
        L70:
            boolean r5 = r3.r0()
            if (r5 == 0) goto L85
            w76<?> r5 = r8.a
            ll r6 = r3.o()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.a(r5, r6, r7)
            goto Lb0
        L85:
            boolean r5 = r3.s0()
            if (r5 == 0) goto L9a
            w76<?> r5 = r8.a
            fl r6 = r3.l0()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.b(r5, r6, r7)
            goto Lb0
        L9a:
            boolean r5 = r3.t0()
            if (r5 == 0) goto Laf
            w76<?> r5 = r8.a
            il r6 = r3.m0()
            java.lang.String r7 = r4.c()
            java.lang.String r5 = r10.c(r5, r6, r7)
            goto Lb0
        Laf:
            r5 = 0
        Lb0:
            if (r5 == 0) goto Lbd
            boolean r6 = r4.f(r5)
            if (r6 != 0) goto Lbd
            jo7 r3 = r3.C0(r5)
            goto Lc1
        Lbd:
            java.lang.String r5 = r4.c()
        Lc1:
            java.lang.Object r4 = r9.get(r5)
            jo7 r4 = (defpackage.jo7) r4
            if (r4 != 0) goto Lcd
            r9.put(r5, r3)
            goto Ld0
        Lcd:
            r4.W(r3)
        Ld0:
            java.util.LinkedList<jo7> r4 = r8.k
            r8.u(r3, r4)
            int r2 = r2 + 1
            goto L15
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do7.s(java.util.Map, wq8):void");
    }

    protected void t(Map<String, jo7> map) {
        vq8 E0;
        Iterator<Map.Entry<String, jo7>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            jo7 value = it.next().getValue();
            hl w = value.w();
            if (w != null && (E0 = this.g.E0(w)) != null && E0.e() && !E0.equals(value.q())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.B0(E0));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                jo7 jo7Var = (jo7) it2.next();
                String v = jo7Var.v();
                jo7 jo7Var2 = map.get(v);
                if (jo7Var2 == null) {
                    map.put(v, jo7Var);
                } else {
                    jo7Var2.W(jo7Var);
                }
            }
        }
    }

    protected boolean u(jo7 jo7Var, List<jo7> list) {
        if (list != null) {
            String n0 = jo7Var.n0();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).n0().equals(n0)) {
                    list.set(i, jo7Var);
                    return true;
                }
            }
        }
        return false;
    }

    protected void v(Map<String, jo7> map) {
        boolean booleanValue;
        Map<? extends Object, ? extends Object> linkedHashMap;
        Collection<jo7> collection;
        ql qlVar = this.g;
        Boolean l0 = qlVar.l0(this.e);
        if (l0 == null) {
            booleanValue = this.a.T();
        } else {
            booleanValue = l0.booleanValue();
        }
        boolean h = h(map.values());
        String[] j0 = qlVar.j0(this.e);
        if (!booleanValue && !h && this.k == null && j0 == null) {
            return;
        }
        int size = map.size();
        if (booleanValue) {
            linkedHashMap = new TreeMap<>();
        } else {
            linkedHashMap = new LinkedHashMap<>(size + size);
        }
        for (jo7 jo7Var : map.values()) {
            linkedHashMap.put(jo7Var.v(), jo7Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(size + size);
        if (j0 != null) {
            for (String str : j0) {
                jo7 jo7Var2 = (jo7) linkedHashMap.remove(str);
                if (jo7Var2 == null) {
                    Iterator<jo7> it = map.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        jo7 next = it.next();
                        if (str.equals(next.n0())) {
                            str = next.v();
                            jo7Var2 = next;
                            break;
                        }
                    }
                }
                if (jo7Var2 != null) {
                    linkedHashMap2.put(str, jo7Var2);
                }
            }
        }
        if (h) {
            TreeMap treeMap = new TreeMap();
            Iterator<Map.Entry<? extends Object, ? extends Object>> it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                jo7 jo7Var3 = (jo7) it2.next().getValue();
                Integer b = jo7Var3.t().b();
                if (b != null) {
                    treeMap.put(b, jo7Var3);
                    it2.remove();
                }
            }
            for (jo7 jo7Var4 : treeMap.values()) {
                linkedHashMap2.put(jo7Var4.v(), jo7Var4);
            }
        }
        if (this.k != null && (!booleanValue || this.a.S(y76.SORT_CREATOR_PROPERTIES_FIRST))) {
            if (booleanValue) {
                TreeMap treeMap2 = new TreeMap();
                Iterator<jo7> it3 = this.k.iterator();
                while (it3.hasNext()) {
                    jo7 next2 = it3.next();
                    treeMap2.put(next2.v(), next2);
                }
                collection = treeMap2.values();
            } else {
                collection = this.k;
            }
            for (jo7 jo7Var5 : collection) {
                String v = jo7Var5.v();
                if (linkedHashMap.containsKey(v)) {
                    linkedHashMap2.put(v, jo7Var5);
                }
            }
        }
        linkedHashMap2.putAll(linkedHashMap);
        map.clear();
        map.putAll(linkedHashMap2);
    }

    protected void w() {
        LinkedHashMap<String, jo7> linkedHashMap = new LinkedHashMap<>();
        c(linkedHashMap);
        f(linkedHashMap);
        if (!this.e.u()) {
            b(linkedHashMap);
        }
        q(linkedHashMap);
        p(linkedHashMap);
        r(linkedHashMap);
        e(linkedHashMap);
        for (jo7 jo7Var : linkedHashMap.values()) {
            jo7Var.x0(this.c);
        }
        wq8 l = l();
        if (l != null) {
            s(linkedHashMap, l);
        }
        for (jo7 jo7Var2 : linkedHashMap.values()) {
            jo7Var2.A0();
        }
        if (this.a.S(y76.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            t(linkedHashMap);
        }
        v(linkedHashMap);
        this.j = linkedHashMap;
        this.i = true;
    }

    public hl x() {
        if (!this.i) {
            w();
        }
        LinkedList<hl> linkedList = this.n;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                H("Multiple 'any-getter' fields defined (%s vs %s)", this.n.get(0), this.n.get(1));
            }
            return this.n.getFirst();
        }
        return null;
    }

    public hl y() {
        if (!this.i) {
            w();
        }
        LinkedList<hl> linkedList = this.m;
        if (linkedList != null) {
            if (linkedList.size() > 1) {
                H("Multiple 'any-getter' methods defined (%s vs %s)", this.m.get(0), this.m.get(1));
            }
            return this.m.getFirst();
        }
        return null;
    }

    public bl z() {
        return this.e;
    }
}
