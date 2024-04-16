package defpackage;

import defpackage.qg5;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PrimitiveSet.java */
/* renamed from: rj8  reason: default package */
/* loaded from: classes2.dex */
public final class rj8<P> {
    private final ConcurrentMap<d, List<c<P>>> a;
    private c<P> b;
    private final Class<P> c;
    private final xn6 d;
    private final boolean e;

    /* compiled from: PrimitiveSet.java */
    /* renamed from: rj8$b */
    /* loaded from: classes2.dex */
    public static class b<P> {
        private final Class<P> a;
        private ConcurrentMap<d, List<c<P>>> b;
        private c<P> c;
        private xn6 d;

        private b<P> c(P p, qg5.c cVar, boolean z) throws GeneralSecurityException {
            if (this.b != null) {
                if (cVar.T() == tf5.ENABLED) {
                    c<P> b = rj8.b(p, cVar, this.b);
                    if (z) {
                        if (this.c == null) {
                            this.c = b;
                        } else {
                            throw new IllegalStateException("you cannot set two primary primitives");
                        }
                    }
                    return this;
                }
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }

        public b<P> a(P p, qg5.c cVar) throws GeneralSecurityException {
            return c(p, cVar, true);
        }

        public b<P> b(P p, qg5.c cVar) throws GeneralSecurityException {
            return c(p, cVar, false);
        }

        public rj8<P> d() throws GeneralSecurityException {
            ConcurrentMap<d, List<c<P>>> concurrentMap = this.b;
            if (concurrentMap != null) {
                rj8<P> rj8Var = new rj8<>(concurrentMap, this.c, this.d, this.a);
                this.b = null;
                return rj8Var;
            }
            throw new IllegalStateException("build cannot be called twice");
        }

        public b<P> e(xn6 xn6Var) {
            if (this.b != null) {
                this.d = xn6Var;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }

        private b(Class<P> cls) {
            this.b = new ConcurrentHashMap();
            this.a = cls;
            this.d = xn6.b;
        }
    }

    /* compiled from: PrimitiveSet.java */
    /* renamed from: rj8$c */
    /* loaded from: classes2.dex */
    public static final class c<P> {
        private final P a;
        private final byte[] b;
        private final tf5 c;
        private final mm7 d;
        private final int e;
        private final te5 f;

        c(P p, byte[] bArr, tf5 tf5Var, mm7 mm7Var, int i, te5 te5Var) {
            this.a = p;
            this.b = Arrays.copyOf(bArr, bArr.length);
            this.c = tf5Var;
            this.d = mm7Var;
            this.e = i;
            this.f = te5Var;
        }

        public final byte[] a() {
            byte[] bArr = this.b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public te5 b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public mm7 d() {
            return this.d;
        }

        public lq7 e() {
            return this.f.a();
        }

        public P f() {
            return this.a;
        }

        public tf5 g() {
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PrimitiveSet.java */
    /* renamed from: rj8$d */
    /* loaded from: classes2.dex */
    public static class d implements Comparable<d> {
        private final byte[] a;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            byte[] bArr = this.a;
            int length = bArr.length;
            byte[] bArr2 = dVar.a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.a;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = dVar.a[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            return Arrays.equals(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.a);
        }

        public String toString() {
            return go4.b(this.a);
        }

        private d(byte[] bArr) {
            this.a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <P> c<P> b(P p, qg5.c cVar, ConcurrentMap<d, List<c<P>>> concurrentMap) throws GeneralSecurityException {
        Integer valueOf = Integer.valueOf(cVar.R());
        if (cVar.S() == mm7.RAW) {
            valueOf = null;
        }
        c<P> cVar2 = new c<>(p, x22.a(cVar), cVar.T(), cVar.S(), cVar.R(), br6.a().c(kr8.b(cVar.Q().R(), cVar.Q().S(), cVar.Q().Q(), cVar.S(), valueOf), l45.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.a());
        List<c<P>> put = concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static <P> b<P> j(Class<P> cls) {
        return new b<>(cls);
    }

    public Collection<List<c<P>>> c() {
        return this.a.values();
    }

    public xn6 d() {
        return this.d;
    }

    public c<P> e() {
        return this.b;
    }

    public List<c<P>> f(byte[] bArr) {
        List<c<P>> list = this.a.get(new d(bArr));
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public Class<P> g() {
        return this.c;
    }

    public List<c<P>> h() {
        return f(x22.a);
    }

    public boolean i() {
        return !this.d.b().isEmpty();
    }

    private rj8(ConcurrentMap<d, List<c<P>>> concurrentMap, c<P> cVar, xn6 xn6Var, Class<P> cls) {
        this.a = concurrentMap;
        this.b = cVar;
        this.c = cls;
        this.d = xn6Var;
        this.e = false;
    }
}
