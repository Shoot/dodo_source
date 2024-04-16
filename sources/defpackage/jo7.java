package defpackage;

import defpackage.cb5;
import defpackage.ql;
import defpackage.sb5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/* compiled from: POJOPropertyBuilder.java */
/* renamed from: jo7  reason: default package */
/* loaded from: classes2.dex */
public class jo7 extends ja0 implements Comparable<jo7> {
    private static final ql.a m = ql.a.c("");
    protected final boolean b;
    protected final w76<?> c;
    protected final ql d;
    protected final vq8 e;
    protected final vq8 f;
    protected f<fl> g;
    protected f<ll> h;
    protected f<il> i;
    protected f<il> j;
    protected transient uq8 k;
    protected transient ql.a l;

    /* compiled from: POJOPropertyBuilder.java */
    /* renamed from: jo7$a */
    /* loaded from: classes2.dex */
    class a implements g<Class<?>[]> {
        a() {
        }

        @Override // defpackage.jo7.g
        /* renamed from: b */
        public Class<?>[] a(hl hlVar) {
            return jo7.this.d.z0(hlVar);
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    /* renamed from: jo7$b */
    /* loaded from: classes2.dex */
    class b implements g<ql.a> {
        b() {
        }

        @Override // defpackage.jo7.g
        /* renamed from: b */
        public ql.a a(hl hlVar) {
            return jo7.this.d.Z(hlVar);
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    /* renamed from: jo7$c */
    /* loaded from: classes2.dex */
    class c implements g<Boolean> {
        c() {
        }

        @Override // defpackage.jo7.g
        /* renamed from: b */
        public Boolean a(hl hlVar) {
            return jo7.this.d.S0(hlVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: POJOPropertyBuilder.java */
    /* renamed from: jo7$d */
    /* loaded from: classes2.dex */
    public class d implements g<sb5.a> {
        d() {
        }

        @Override // defpackage.jo7.g
        /* renamed from: b */
        public sb5.a a(hl hlVar) {
            return jo7.this.d.H(hlVar);
        }
    }

    /* compiled from: POJOPropertyBuilder.java */
    /* renamed from: jo7$e */
    /* loaded from: classes2.dex */
    static /* synthetic */ class e {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sb5.a.values().length];
            a = iArr;
            try {
                iArr[sb5.a.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[sb5.a.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[sb5.a.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[sb5.a.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: POJOPropertyBuilder.java */
    /* renamed from: jo7$f */
    /* loaded from: classes2.dex */
    public static final class f<T> {
        public final T a;
        public final f<T> b;
        public final vq8 c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public f(T t, f<T> fVar, vq8 vq8Var, boolean z, boolean z2, boolean z3) {
            vq8 vq8Var2;
            this.a = t;
            this.b = fVar;
            if (vq8Var != null && !vq8Var.i()) {
                vq8Var2 = vq8Var;
            } else {
                vq8Var2 = null;
            }
            this.c = vq8Var2;
            if (z) {
                if (vq8Var2 != null) {
                    if (!vq8Var.e()) {
                        z = false;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
            }
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        protected f<T> a(f<T> fVar) {
            f<T> fVar2 = this.b;
            if (fVar2 == null) {
                return c(fVar);
            }
            return c(fVar2.a(fVar));
        }

        public f<T> b() {
            f<T> fVar = this.b;
            if (fVar == null) {
                return this;
            }
            f<T> b = fVar.b();
            if (this.c != null) {
                if (b.c == null) {
                    return c(null);
                }
                return c(b);
            } else if (b.c != null) {
                return b;
            } else {
                boolean z = this.e;
                if (z == b.e) {
                    return c(b);
                }
                if (z) {
                    return c(null);
                }
                return b;
            }
        }

        public f<T> c(f<T> fVar) {
            if (fVar == this.b) {
                return this;
            }
            return new f<>(this.a, fVar, this.c, this.d, this.e, this.f);
        }

        public f<T> d(T t) {
            if (t == this.a) {
                return this;
            }
            return new f<>(t, this.b, this.c, this.d, this.e, this.f);
        }

        public f<T> e() {
            f<T> e;
            if (this.f) {
                f<T> fVar = this.b;
                if (fVar == null) {
                    return null;
                }
                return fVar.e();
            }
            f<T> fVar2 = this.b;
            if (fVar2 != null && (e = fVar2.e()) != this.b) {
                return c(e);
            }
            return this;
        }

        public f<T> f() {
            if (this.b == null) {
                return this;
            }
            return new f<>(this.a, null, this.c, this.d, this.e, this.f);
        }

        public f<T> g() {
            f<T> g;
            f<T> fVar = this.b;
            if (fVar == null) {
                g = null;
            } else {
                g = fVar.g();
            }
            if (this.e) {
                return c(g);
            }
            return g;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.a.toString(), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.d));
            if (this.b != null) {
                return format + ", " + this.b.toString();
            }
            return format;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: POJOPropertyBuilder.java */
    /* renamed from: jo7$g */
    /* loaded from: classes2.dex */
    public interface g<T> {
        T a(hl hlVar);
    }

    public jo7(w76<?> w76Var, ql qlVar, boolean z, vq8 vq8Var) {
        this(w76Var, qlVar, z, vq8Var, vq8Var);
    }

    private <T> boolean D(f<T> fVar) {
        while (fVar != null) {
            if (fVar.c != null && fVar.d) {
                return true;
            }
            fVar = fVar.b;
        }
        return false;
    }

    private <T> boolean E(f<T> fVar) {
        while (fVar != null) {
            vq8 vq8Var = fVar.c;
            if (vq8Var != null && vq8Var.e()) {
                return true;
            }
            fVar = fVar.b;
        }
        return false;
    }

    private <T> boolean F(f<T> fVar) {
        while (fVar != null) {
            if (fVar.f) {
                return true;
            }
            fVar = fVar.b;
        }
        return false;
    }

    private <T> boolean G(f<T> fVar) {
        while (fVar != null) {
            if (fVar.e) {
                return true;
            }
            fVar = fVar.b;
        }
        return false;
    }

    private <T extends hl> f<T> H(f<T> fVar, rl rlVar) {
        hl hlVar = (hl) fVar.a.o(rlVar);
        f<T> fVar2 = fVar.b;
        f fVar3 = fVar;
        if (fVar2 != null) {
            fVar3 = (f<T>) fVar.c(H(fVar2, rlVar));
        }
        return fVar3.d(hlVar);
    }

    private void I(Collection<vq8> collection, Map<vq8, jo7> map, f<?> fVar) {
        for (f fVar2 = fVar; fVar2 != null; fVar2 = fVar2.b) {
            vq8 vq8Var = fVar2.c;
            if (fVar2.d && vq8Var != null) {
                jo7 jo7Var = map.get(vq8Var);
                if (jo7Var == null) {
                    jo7Var = new jo7(this.c, this.d, this.b, this.f, vq8Var);
                    map.put(vq8Var, jo7Var);
                }
                if (fVar == this.g) {
                    jo7Var.g = fVar2.c(jo7Var.g);
                } else if (fVar == this.i) {
                    jo7Var.i = fVar2.c(jo7Var.i);
                } else if (fVar == this.j) {
                    jo7Var.j = fVar2.c(jo7Var.j);
                } else if (fVar == this.h) {
                    jo7Var.h = fVar2.c(jo7Var.h);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (fVar2.e) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + q81.P(this.e) + "): found multiple explicit names: " + collection + ", but also implicit accessor: " + fVar2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Set<defpackage.vq8> J(defpackage.jo7.f<? extends defpackage.hl> r2, java.util.Set<defpackage.vq8> r3) {
        /*
            r1 = this;
        L0:
            if (r2 == 0) goto L1a
            boolean r0 = r2.d
            if (r0 == 0) goto L17
            vq8 r0 = r2.c
            if (r0 != 0) goto Lb
            goto L17
        Lb:
            if (r3 != 0) goto L12
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L12:
            vq8 r0 = r2.c
            r3.add(r0)
        L17:
            jo7$f<T> r2 = r2.b
            goto L0
        L1a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo7.J(jo7$f, java.util.Set):java.util.Set");
    }

    private <T extends hl> rl K(f<T> fVar) {
        rl j = fVar.a.j();
        f<T> fVar2 = fVar.b;
        if (fVar2 != null) {
            return rl.f(j, K(fVar2));
        }
        return j;
    }

    private rl N(int i, f<? extends hl>... fVarArr) {
        rl K = K(fVarArr[i]);
        do {
            i++;
            if (i >= fVarArr.length) {
                return K;
            }
        } while (fVarArr[i] == null);
        return rl.f(K, N(i, fVarArr));
    }

    private <T> f<T> P(f<T> fVar) {
        if (fVar == null) {
            return fVar;
        }
        return fVar.e();
    }

    private <T> f<T> Q(f<T> fVar) {
        if (fVar == null) {
            return fVar;
        }
        return fVar.g();
    }

    private <T> f<T> V(f<T> fVar) {
        if (fVar == null) {
            return fVar;
        }
        return fVar.b();
    }

    private static <T> f<T> w0(f<T> fVar, f<T> fVar2) {
        if (fVar == null) {
            return fVar2;
        }
        if (fVar2 == null) {
            return fVar;
        }
        return fVar.a(fVar2);
    }

    @Override // defpackage.ja0
    public vq8 A() {
        ql qlVar;
        hl w = w();
        if (w != null && (qlVar = this.d) != null) {
            return qlVar.E0(w);
        }
        return null;
    }

    public void A0() {
        this.g = V(this.g);
        this.i = V(this.i);
        this.j = V(this.j);
        this.h = V(this.h);
    }

    @Override // defpackage.ja0
    public boolean B() {
        if (!E(this.g) && !E(this.i) && !E(this.j) && !D(this.h)) {
            return false;
        }
        return true;
    }

    public jo7 B0(vq8 vq8Var) {
        return new jo7(this, vq8Var);
    }

    @Override // defpackage.ja0
    public boolean C() {
        Boolean bool = (Boolean) i0(new c());
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public jo7 C0(String str) {
        vq8 k = this.e.k(str);
        if (k == this.e) {
            return this;
        }
        return new jo7(this, k);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.uq8 L(defpackage.uq8 r7, defpackage.hl r8) {
        /*
            r6 = this;
            hl r0 = r6.k()
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L72
            ql r3 = r6.d
            r4 = 0
            if (r3 == 0) goto L35
            if (r0 == 0) goto L24
            java.lang.Boolean r3 = r3.s(r8)
            if (r3 == 0) goto L24
            boolean r1 = r3.booleanValue()
            if (r1 == 0) goto L23
            uq8$a r1 = defpackage.uq8.a.b(r0)
            uq8 r7 = r7.e(r1)
        L23:
            r1 = 0
        L24:
            ql r3 = r6.d
            ic5$a r3 = r3.o0(r8)
            if (r3 == 0) goto L35
            w37 r2 = r3.f()
            w37 r3 = r3.e()
            goto L36
        L35:
            r3 = r2
        L36:
            if (r1 != 0) goto L3c
            if (r2 == 0) goto L3c
            if (r3 != 0) goto L73
        L3c:
            java.lang.Class r8 = r6.O(r8)
            w76<?> r5 = r6.c
            up1 r8 = r5.l(r8)
            ic5$a r5 = r8.h()
            if (r5 == 0) goto L58
            if (r2 != 0) goto L52
            w37 r2 = r5.f()
        L52:
            if (r3 != 0) goto L58
            w37 r3 = r5.e()
        L58:
            if (r1 == 0) goto L73
            if (r0 == 0) goto L73
            java.lang.Boolean r8 = r8.g()
            if (r8 == 0) goto L73
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L70
            uq8$a r8 = defpackage.uq8.a.c(r0)
            uq8 r7 = r7.e(r8)
        L70:
            r1 = 0
            goto L73
        L72:
            r3 = r2
        L73:
            if (r1 != 0) goto L79
            if (r2 == 0) goto L79
            if (r3 != 0) goto La5
        L79:
            w76<?> r8 = r6.c
            ic5$a r8 = r8.w()
            if (r2 != 0) goto L85
            w37 r2 = r8.f()
        L85:
            if (r3 != 0) goto L8b
            w37 r3 = r8.e()
        L8b:
            if (r1 == 0) goto La5
            w76<?> r8 = r6.c
            java.lang.Boolean r8 = r8.q()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto La5
            if (r0 == 0) goto La5
            uq8$a r8 = defpackage.uq8.a.a(r0)
            uq8 r7 = r7.e(r8)
        La5:
            if (r2 != 0) goto La9
            if (r3 == 0) goto Lad
        La9:
            uq8 r7 = r7.f(r2, r3)
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo7.L(uq8, hl):uq8");
    }

    protected int M(il ilVar) {
        String name = ilVar.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    protected Class<?> O(hl hlVar) {
        if (hlVar instanceof il) {
            il ilVar = (il) hlVar;
            if (ilVar.y() > 0) {
                return ilVar.s(0).u();
            }
        }
        return hlVar.d().u();
    }

    protected il R(il ilVar, il ilVar2) {
        Class<?> k = ilVar.k();
        Class<?> k2 = ilVar2.k();
        if (k != k2) {
            if (k.isAssignableFrom(k2)) {
                return ilVar2;
            }
            if (k2.isAssignableFrom(k)) {
                return ilVar;
            }
        }
        int U = U(ilVar2);
        int U2 = U(ilVar);
        if (U != U2) {
            if (U < U2) {
                return ilVar2;
            }
            return ilVar;
        }
        ql qlVar = this.d;
        if (qlVar == null) {
            return null;
        }
        return qlVar.V0(this.c, ilVar, ilVar2);
    }

    protected il T(f<il> fVar, f<il> fVar2) {
        Stream stream;
        Stream map;
        Collector joining;
        Object collect;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar.a);
        arrayList.add(fVar2.a);
        for (f<il> fVar3 = fVar2.b; fVar3 != null; fVar3 = fVar3.b) {
            il R = R(fVar.a, fVar3.a);
            if (R != fVar.a) {
                il ilVar = fVar3.a;
                if (R == ilVar) {
                    arrayList.clear();
                    fVar = fVar3;
                } else {
                    arrayList.add(ilVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            stream = arrayList.stream();
            map = stream.map(new Function() { // from class: io7
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((il) obj).l();
                }
            });
            joining = Collectors.joining(" vs ");
            collect = map.collect(joining);
            throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s", v(), (String) collect));
        }
        this.j = fVar.f();
        return fVar.a;
    }

    protected int U(il ilVar) {
        String name = ilVar.getName();
        if (name.startsWith("set") && name.length() > 3) {
            return 1;
        }
        return 2;
    }

    public void W(jo7 jo7Var) {
        this.g = w0(this.g, jo7Var.g);
        this.h = w0(this.h, jo7Var.h);
        this.i = w0(this.i, jo7Var.i);
        this.j = w0(this.j, jo7Var.j);
    }

    public void X(ll llVar, vq8 vq8Var, boolean z, boolean z2, boolean z3) {
        this.h = new f<>(llVar, this.h, vq8Var, z, z2, z3);
    }

    public void Y(fl flVar, vq8 vq8Var, boolean z, boolean z2, boolean z3) {
        this.g = new f<>(flVar, this.g, vq8Var, z, z2, z3);
    }

    @Override // defpackage.ja0
    public boolean a() {
        if (this.h == null && this.j == null && this.g == null) {
            return false;
        }
        return true;
    }

    public void a0(il ilVar, vq8 vq8Var, boolean z, boolean z2, boolean z3) {
        this.i = new f<>(ilVar, this.i, vq8Var, z, z2, z3);
    }

    public void b0(il ilVar, vq8 vq8Var, boolean z, boolean z2, boolean z3) {
        this.j = new f<>(ilVar, this.j, vq8Var, z, z2, z3);
    }

    public boolean c0() {
        if (!F(this.g) && !F(this.i) && !F(this.j) && !F(this.h)) {
            return false;
        }
        return true;
    }

    public boolean d0() {
        if (!G(this.g) && !G(this.i) && !G(this.j) && !G(this.h)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0 */
    public int compareTo(jo7 jo7Var) {
        if (this.h != null) {
            if (jo7Var.h == null) {
                return -1;
            }
        } else if (jo7Var.h != null) {
            return 1;
        }
        return v().compareTo(jo7Var.v());
    }

    public Collection<jo7> f0(Collection<vq8> collection) {
        HashMap hashMap = new HashMap();
        I(collection, hashMap, this.g);
        I(collection, hashMap, this.i);
        I(collection, hashMap, this.j);
        I(collection, hashMap, this.h);
        return hashMap.values();
    }

    @Override // defpackage.ja0
    public cb5.b g() {
        cb5.b Q;
        hl k = k();
        ql qlVar = this.d;
        if (qlVar == null) {
            Q = null;
        } else {
            Q = qlVar.Q(k);
        }
        if (Q == null) {
            return cb5.b.c();
        }
        return Q;
    }

    public sb5.a g0() {
        return (sb5.a) k0(new d(), sb5.a.AUTO);
    }

    @Override // defpackage.ja0
    public ql.a h() {
        ql.a aVar;
        ql.a aVar2 = this.l;
        if (aVar2 != null) {
            if (aVar2 == m) {
                return null;
            }
            return aVar2;
        }
        ql.a aVar3 = (ql.a) i0(new b());
        if (aVar3 == null) {
            aVar = m;
        } else {
            aVar = aVar3;
        }
        this.l = aVar;
        return aVar3;
    }

    public Set<vq8> h0() {
        Set<vq8> J = J(this.h, J(this.j, J(this.i, J(this.g, null))));
        if (J == null) {
            return Collections.emptySet();
        }
        return J;
    }

    @Override // defpackage.ja0
    public Class<?>[] i() {
        return (Class[]) i0(new a());
    }

    protected <T> T i0(g<T> gVar) {
        f<il> fVar;
        f<fl> fVar2;
        T t = null;
        if (this.d == null) {
            return null;
        }
        if (this.b) {
            f<il> fVar3 = this.i;
            if (fVar3 != null) {
                t = gVar.a(fVar3.a);
            }
        } else {
            f<ll> fVar4 = this.h;
            if (fVar4 != null) {
                t = gVar.a(fVar4.a);
            }
            if (t == null && (fVar = this.j) != null) {
                t = gVar.a(fVar.a);
            }
        }
        if (t == null && (fVar2 = this.g) != null) {
            return gVar.a(fVar2.a);
        }
        return t;
    }

    protected <T> T k0(g<T> gVar, T t) {
        T a2;
        T a3;
        T a4;
        T a5;
        T a6;
        T a7;
        T a8;
        T a9;
        if (this.d == null) {
            return null;
        }
        if (this.b) {
            f<il> fVar = this.i;
            if (fVar != null && (a9 = gVar.a(fVar.a)) != null && a9 != t) {
                return a9;
            }
            f<fl> fVar2 = this.g;
            if (fVar2 != null && (a8 = gVar.a(fVar2.a)) != null && a8 != t) {
                return a8;
            }
            f<ll> fVar3 = this.h;
            if (fVar3 != null && (a7 = gVar.a(fVar3.a)) != null && a7 != t) {
                return a7;
            }
            f<il> fVar4 = this.j;
            if (fVar4 == null || (a6 = gVar.a(fVar4.a)) == null || a6 == t) {
                return null;
            }
            return a6;
        }
        f<ll> fVar5 = this.h;
        if (fVar5 != null && (a5 = gVar.a(fVar5.a)) != null && a5 != t) {
            return a5;
        }
        f<il> fVar6 = this.j;
        if (fVar6 != null && (a4 = gVar.a(fVar6.a)) != null && a4 != t) {
            return a4;
        }
        f<fl> fVar7 = this.g;
        if (fVar7 != null && (a3 = gVar.a(fVar7.a)) != null && a3 != t) {
            return a3;
        }
        f<il> fVar8 = this.i;
        if (fVar8 == null || (a2 = gVar.a(fVar8.a)) == null || a2 == t) {
            return null;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public fl l0() {
        f<fl> fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public il m0() {
        f<il> fVar = this.i;
        if (fVar == null) {
            return null;
        }
        return fVar.a;
    }

    public String n0() {
        return this.f.c();
    }

    @Override // defpackage.ja0
    public ll o() {
        f fVar = this.h;
        if (fVar == null) {
            return null;
        }
        while (!(((ll) fVar.a).r() instanceof dl)) {
            fVar = fVar.b;
            if (fVar == null) {
                return this.h.a;
            }
        }
        return (ll) fVar.a;
    }

    protected hl o0() {
        if (this.b) {
            f<il> fVar = this.i;
            if (fVar != null) {
                return fVar.a;
            }
            f<fl> fVar2 = this.g;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.a;
        }
        f<ll> fVar3 = this.h;
        if (fVar3 != null) {
            return fVar3.a;
        }
        f<il> fVar4 = this.j;
        if (fVar4 != null) {
            return fVar4.a;
        }
        f<fl> fVar5 = this.g;
        if (fVar5 != null) {
            return fVar5.a;
        }
        f<il> fVar6 = this.i;
        if (fVar6 == null) {
            return null;
        }
        return fVar6.a;
    }

    @Override // defpackage.ja0
    public fl p() {
        f<fl> fVar = this.g;
        if (fVar == null) {
            return null;
        }
        fl flVar = fVar.a;
        for (f fVar2 = fVar.b; fVar2 != null; fVar2 = fVar2.b) {
            fl flVar2 = (fl) fVar2.a;
            Class<?> k = flVar.k();
            Class<?> k2 = flVar2.k();
            if (k != k2) {
                if (k.isAssignableFrom(k2)) {
                    flVar = flVar2;
                } else if (k2.isAssignableFrom(k)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + v() + "\": " + flVar.l() + " vs " + flVar2.l());
        }
        return flVar;
    }

    public y85 p0() {
        if (this.b) {
            al s = s();
            if (s == null && (s = p()) == null) {
                return rnb.b0();
            }
            return s.d();
        }
        hl o = o();
        if (o == null) {
            il z = z();
            if (z != null) {
                return z.s(0);
            }
            o = p();
        }
        if (o == null && (o = s()) == null) {
            return rnb.b0();
        }
        return o.d();
    }

    @Override // defpackage.ja0
    public vq8 q() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public il q0() {
        f<il> fVar = this.j;
        if (fVar == null) {
            return null;
        }
        return fVar.a;
    }

    public boolean r0() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ja0
    public il s() {
        f<il> fVar = this.i;
        if (fVar == null) {
            return null;
        }
        f<il> fVar2 = fVar.b;
        if (fVar2 == null) {
            return fVar.a;
        }
        for (f<il> fVar3 = fVar2; fVar3 != null; fVar3 = fVar3.b) {
            Class<?> k = fVar.a.k();
            Class<?> k2 = fVar3.a.k();
            if (k != k2) {
                if (!k.isAssignableFrom(k2)) {
                    if (k2.isAssignableFrom(k)) {
                        continue;
                    }
                }
                fVar = fVar3;
            }
            int M = M(fVar3.a);
            int M2 = M(fVar.a);
            if (M != M2) {
                if (M >= M2) {
                }
                fVar = fVar3;
            } else {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + v() + "\": " + fVar.a.l() + " vs " + fVar3.a.l());
            }
        }
        this.i = fVar.f();
        return fVar.a;
    }

    public boolean s0() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ja0
    public uq8 t() {
        if (this.k == null) {
            hl o0 = o0();
            if (o0 == null) {
                this.k = uq8.j;
            } else {
                Boolean P0 = this.d.P0(o0);
                String M = this.d.M(o0);
                Integer T = this.d.T(o0);
                String L = this.d.L(o0);
                if (P0 == null && T == null && L == null) {
                    uq8 uq8Var = uq8.j;
                    if (M != null) {
                        uq8Var = uq8Var.d(M);
                    }
                    this.k = uq8Var;
                } else {
                    this.k = uq8.a(P0, M, T, L);
                }
                if (!this.b) {
                    this.k = L(this.k, o0);
                }
            }
        }
        return this.k;
    }

    public boolean t0() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "[Property '" + this.e + "'; ctors: " + this.h + ", field(s): " + this.g + ", getter(s): " + this.i + ", setter(s): " + this.j + "]";
    }

    public boolean u0() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ja0
    public String v() {
        vq8 vq8Var = this.e;
        if (vq8Var == null) {
            return null;
        }
        return vq8Var.c();
    }

    public boolean v0() {
        if (!D(this.g) && !D(this.i) && !D(this.j) && !D(this.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ja0
    public hl w() {
        if (this.b) {
            return k();
        }
        hl u = u();
        if (u == null) {
            return k();
        }
        return u;
    }

    @Override // defpackage.ja0
    public Class<?> x() {
        return p0().u();
    }

    public void x0(boolean z) {
        if (z) {
            f<il> fVar = this.i;
            if (fVar != null) {
                this.i = H(this.i, N(0, fVar, this.g, this.h, this.j));
                return;
            }
            f<fl> fVar2 = this.g;
            if (fVar2 != null) {
                this.g = H(this.g, N(0, fVar2, this.h, this.j));
                return;
            }
            return;
        }
        f<ll> fVar3 = this.h;
        if (fVar3 != null) {
            this.h = H(this.h, N(0, fVar3, this.j, this.g, this.i));
            return;
        }
        f<il> fVar4 = this.j;
        if (fVar4 != null) {
            this.j = H(this.j, N(0, fVar4, this.g, this.i));
            return;
        }
        f<fl> fVar5 = this.g;
        if (fVar5 != null) {
            this.g = H(this.g, N(0, fVar5, this.i));
        }
    }

    public void y0() {
        this.g = P(this.g);
        this.i = P(this.i);
        this.j = P(this.j);
        this.h = P(this.h);
    }

    @Override // defpackage.ja0
    public il z() {
        f<il> fVar = this.j;
        if (fVar == null) {
            return null;
        }
        f<il> fVar2 = fVar.b;
        if (fVar2 == null) {
            return fVar.a;
        }
        for (f<il> fVar3 = fVar2; fVar3 != null; fVar3 = fVar3.b) {
            il R = R(fVar.a, fVar3.a);
            if (R != fVar.a) {
                if (R == fVar3.a) {
                    fVar = fVar3;
                } else {
                    return T(fVar, fVar3);
                }
            }
        }
        this.j = fVar.f();
        return fVar.a;
    }

    public sb5.a z0(boolean z, do7 do7Var) {
        sb5.a g0 = g0();
        if (g0 == null) {
            g0 = sb5.a.AUTO;
        }
        int i = e.a[g0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.i = Q(this.i);
                    this.h = Q(this.h);
                    if (!z || this.i == null) {
                        this.g = Q(this.g);
                        this.j = Q(this.j);
                    }
                } else {
                    this.i = null;
                    if (this.b) {
                        this.g = null;
                    }
                }
            }
        } else {
            if (do7Var != null) {
                do7Var.j(v());
                for (vq8 vq8Var : h0()) {
                    do7Var.j(vq8Var.c());
                }
            }
            this.j = null;
            this.h = null;
            if (!this.b) {
                this.g = null;
            }
        }
        return g0;
    }

    protected jo7(w76<?> w76Var, ql qlVar, boolean z, vq8 vq8Var, vq8 vq8Var2) {
        this.c = w76Var;
        this.d = qlVar;
        this.f = vq8Var;
        this.e = vq8Var2;
        this.b = z;
    }

    protected jo7(jo7 jo7Var, vq8 vq8Var) {
        this.c = jo7Var.c;
        this.d = jo7Var.d;
        this.f = jo7Var.f;
        this.e = vq8Var;
        this.g = jo7Var.g;
        this.h = jo7Var.h;
        this.i = jo7Var.i;
        this.j = jo7Var.j;
        this.b = jo7Var.b;
    }
}
