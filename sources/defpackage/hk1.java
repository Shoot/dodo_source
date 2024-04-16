package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CompactHashMap.java */
/* renamed from: hk1  reason: default package */
/* loaded from: classes2.dex */
public class hk1<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object j = new Object();
    private transient Object a;
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    private transient int e;
    private transient int f;
    private transient Set<K> g;
    private transient Set<Map.Entry<K, V>> h;
    private transient Collection<V> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$a */
    /* loaded from: classes2.dex */
    public class a extends hk1<K, V>.e<K> {
        a() {
            super(hk1.this, null);
        }

        @Override // defpackage.hk1.e
        K b(int i) {
            return (K) hk1.this.f0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$b */
    /* loaded from: classes2.dex */
    public class b extends hk1<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(hk1.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.hk1.e
        /* renamed from: e */
        public Map.Entry<K, V> b(int i) {
            return new g(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$c */
    /* loaded from: classes2.dex */
    public class c extends hk1<K, V>.e<V> {
        c() {
            super(hk1.this, null);
        }

        @Override // defpackage.hk1.e
        V b(int i) {
            return (V) hk1.this.K0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$d */
    /* loaded from: classes2.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            hk1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> M = hk1.this.M();
            if (M != null) {
                return M.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int Z = hk1.this.Z(entry.getKey());
            if (Z == -1 || !n57.a(hk1.this.K0(Z), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return hk1.this.P();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> M = hk1.this.M();
            if (M != null) {
                return M.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!hk1.this.l0()) {
                int T = hk1.this.T();
                int f = ik1.f(entry.getKey(), entry.getValue(), T, hk1.this.p0(), hk1.this.n0(), hk1.this.o0(), hk1.this.q0());
                if (f == -1) {
                    return false;
                }
                hk1.this.j0(f, T);
                hk1.i(hk1.this);
                hk1.this.W();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return hk1.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$f */
    /* loaded from: classes2.dex */
    public class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            hk1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return hk1.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return hk1.this.h0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> M = hk1.this.M();
            if (M != null) {
                return M.keySet().remove(obj);
            }
            if (hk1.this.m0(obj) != hk1.j) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return hk1.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$g */
    /* loaded from: classes2.dex */
    public final class g extends r1<K, V> {
        private final K a;
        private int b;

        g(int i) {
            this.a = (K) hk1.this.f0(i);
            this.b = i;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i >= hk1.this.size() || !n57.a(this.a, hk1.this.f0(this.b))) {
                this.b = hk1.this.Z(this.a);
            }
        }

        @Override // defpackage.r1, java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // defpackage.r1, java.util.Map.Entry
        public V getValue() {
            Map<K, V> M = hk1.this.M();
            if (M != null) {
                return (V) u37.a(M.get(this.a));
            }
            a();
            int i = this.b;
            if (i != -1) {
                return (V) hk1.this.K0(i);
            }
            return (V) u37.b();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> M = hk1.this.M();
            if (M != null) {
                return (V) u37.a(M.put(this.a, v));
            }
            a();
            int i = this.b;
            if (i != -1) {
                V v2 = (V) hk1.this.K0(i);
                hk1.this.J0(this.b, v);
                return v2;
            }
            hk1.this.put(this.a, v);
            return (V) u37.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$h */
    /* loaded from: classes2.dex */
    public class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            hk1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return hk1.this.L0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return hk1.this.size();
        }
    }

    hk1() {
        b0(3);
    }

    public static <K, V> hk1<K, V> E() {
        return new hk1<>();
    }

    private void E0(int i, int i2) {
        n0()[i] = i2;
    }

    private void F0(int i) {
        this.e = ik1.d(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void I0(int i, K k) {
        o0()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(int i, V v) {
        q0()[i] = v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V K0(int i) {
        return (V) q0()[i];
    }

    private int N(int i) {
        return n0()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int T() {
        return (1 << (this.e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Z(Object obj) {
        if (l0()) {
            return -1;
        }
        int c2 = cn4.c(obj);
        int T = T();
        int h2 = ik1.h(p0(), c2 & T);
        if (h2 == 0) {
            return -1;
        }
        int b2 = ik1.b(c2, T);
        do {
            int i = h2 - 1;
            int N = N(i);
            if (ik1.b(N, T) == b2 && n57.a(obj, f0(i))) {
                return i;
            }
            h2 = ik1.c(N, T);
        } while (h2 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K f0(int i) {
        return (K) o0()[i];
    }

    static /* synthetic */ int i(hk1 hk1Var) {
        int i = hk1Var.f;
        hk1Var.f = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object m0(Object obj) {
        if (l0()) {
            return j;
        }
        int T = T();
        int f2 = ik1.f(obj, null, T, p0(), n0(), o0(), null);
        if (f2 == -1) {
            return j;
        }
        V K0 = K0(f2);
        j0(f2, T);
        this.f--;
        W();
        return K0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] n0() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] o0() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object p0() {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] q0() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            b0(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> P = P();
        while (P.hasNext()) {
            Map.Entry<K, V> next = P.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    private void x0(int i) {
        int min;
        int length = n0().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            r0(min);
        }
    }

    private int z0(int i, int i2, int i3, int i4) {
        Object a2 = ik1.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ik1.i(a2, i3 & i5, i4 + 1);
        }
        Object p0 = p0();
        int[] n0 = n0();
        for (int i6 = 0; i6 <= i; i6++) {
            int h2 = ik1.h(p0, i6);
            while (h2 != 0) {
                int i7 = h2 - 1;
                int i8 = n0[i7];
                int b2 = ik1.b(i8, i) | i6;
                int i9 = b2 & i5;
                int h3 = ik1.h(a2, i9);
                ik1.i(a2, i9, h2);
                n0[i7] = ik1.d(b2, h3, i5);
                h2 = ik1.c(i8, i);
            }
        }
        this.a = a2;
        F0(i5);
        return i5;
    }

    Set<Map.Entry<K, V>> G() {
        return new d();
    }

    Map<K, V> H(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    Set<K> K() {
        return new f();
    }

    Collection<V> L() {
        return new h();
    }

    Iterator<V> L0() {
        Map<K, V> M = M();
        if (M != null) {
            return M.values().iterator();
        }
        return new c();
    }

    Map<K, V> M() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> P() {
        Map<K, V> M = M();
        if (M != null) {
            return M.entrySet().iterator();
        }
        return new b();
    }

    int Q() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    int S(int i) {
        int i2 = i + 1;
        if (i2 >= this.f) {
            return -1;
        }
        return i2;
    }

    void W() {
        this.e += 32;
    }

    void b0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        hh8.e(z, "Expected size must be >= 0");
        this.e = e75.a(i, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (l0()) {
            return;
        }
        W();
        Map<K, V> M = M();
        if (M != null) {
            this.e = e75.a(size(), 3, 1073741823);
            M.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(o0(), 0, this.f, (Object) null);
        Arrays.fill(q0(), 0, this.f, (Object) null);
        ik1.g(p0());
        Arrays.fill(n0(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> M = M();
        if (M != null) {
            return M.containsKey(obj);
        }
        if (Z(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> M = M();
        if (M != null) {
            return M.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (n57.a(obj, K0(i))) {
                return true;
            }
        }
        return false;
    }

    void e0(int i, K k, V v, int i2, int i3) {
        E0(i, ik1.d(i2, 0, i3));
        I0(i, k);
        J0(i, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.h;
        if (set == null) {
            Set<Map.Entry<K, V>> G = G();
            this.h = G;
            return G;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> M = M();
        if (M != null) {
            return M.get(obj);
        }
        int Z = Z(obj);
        if (Z == -1) {
            return null;
        }
        s(Z);
        return K0(Z);
    }

    Iterator<K> h0() {
        Map<K, V> M = M();
        if (M != null) {
            return M.keySet().iterator();
        }
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    void j0(int i, int i2) {
        Object p0 = p0();
        int[] n0 = n0();
        Object[] o0 = o0();
        Object[] q0 = q0();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = o0[i3];
            o0[i] = obj;
            q0[i] = q0[i3];
            o0[i3] = null;
            q0[i3] = null;
            n0[i] = n0[i3];
            n0[i3] = 0;
            int c2 = cn4.c(obj) & i2;
            int h2 = ik1.h(p0, c2);
            if (h2 == size) {
                ik1.i(p0, c2, i + 1);
                return;
            }
            while (true) {
                int i4 = h2 - 1;
                int i5 = n0[i4];
                int c3 = ik1.c(i5, i2);
                if (c3 == size) {
                    n0[i4] = ik1.d(i5, i + 1, i2);
                    return;
                }
                h2 = c3;
            }
        } else {
            o0[i] = null;
            q0[i] = null;
            n0[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.g;
        if (set == null) {
            Set<K> K = K();
            this.g = K;
            return K;
        }
        return set;
    }

    boolean l0() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        int z0;
        int i;
        if (l0()) {
            x();
        }
        Map<K, V> M = M();
        if (M != null) {
            return M.put(k, v);
        }
        int[] n0 = n0();
        Object[] o0 = o0();
        Object[] q0 = q0();
        int i2 = this.f;
        int i3 = i2 + 1;
        int c2 = cn4.c(k);
        int T = T();
        int i4 = c2 & T;
        int h2 = ik1.h(p0(), i4);
        if (h2 == 0) {
            if (i3 > T) {
                z0 = z0(T, ik1.e(T), c2, i2);
                i = z0;
            } else {
                ik1.i(p0(), i4, i3);
                i = T;
            }
        } else {
            int b2 = ik1.b(c2, T);
            int i5 = 0;
            while (true) {
                int i6 = h2 - 1;
                int i7 = n0[i6];
                if (ik1.b(i7, T) == b2 && n57.a(k, o0[i6])) {
                    V v2 = (V) q0[i6];
                    q0[i6] = v;
                    s(i6);
                    return v2;
                }
                int c3 = ik1.c(i7, T);
                i5++;
                if (c3 == 0) {
                    if (i5 >= 9) {
                        return y().put(k, v);
                    }
                    if (i3 > T) {
                        z0 = z0(T, ik1.e(T), c2, i2);
                    } else {
                        n0[i6] = ik1.d(i7, i3, T);
                    }
                } else {
                    h2 = c3;
                }
            }
        }
        x0(i3);
        e0(i2, k, v, c2, i);
        this.f = i3;
        W();
        return null;
    }

    void r0(int i) {
        this.b = Arrays.copyOf(n0(), i);
        this.c = Arrays.copyOf(o0(), i);
        this.d = Arrays.copyOf(q0(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> M = M();
        if (M != null) {
            return M.remove(obj);
        }
        V v = (V) m0(obj);
        if (v == j) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> M = M();
        if (M != null) {
            return M.size();
        }
        return this.f;
    }

    int u(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.i;
        if (collection == null) {
            Collection<V> L = L();
            this.i = L;
            return L;
        }
        return collection;
    }

    int x() {
        hh8.n(l0(), "Arrays already allocated");
        int i = this.e;
        int j2 = ik1.j(i);
        this.a = ik1.a(j2);
        F0(j2 - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    Map<K, V> y() {
        Map<K, V> H = H(T() + 1);
        int Q = Q();
        while (Q >= 0) {
            H.put(f0(Q), K0(Q));
            Q = S(Q);
        }
        this.a = H;
        this.b = null;
        this.c = null;
        this.d = null;
        W();
        return H;
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: hk1$e */
    /* loaded from: classes2.dex */
    private abstract class e<T> implements Iterator<T> {
        int a;
        int b;
        int c;

        private e() {
            this.a = hk1.this.e;
            this.b = hk1.this.Q();
            this.c = -1;
        }

        private void a() {
            if (hk1.this.e == this.a) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        abstract T b(int i);

        void c() {
            this.a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i = this.b;
                this.c = i;
                T b = b(i);
                this.b = hk1.this.S(this.b);
                return b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            a();
            if (this.c >= 0) {
                z = true;
            } else {
                z = false;
            }
            yb1.c(z);
            c();
            hk1 hk1Var = hk1.this;
            hk1Var.remove(hk1Var.f0(this.c));
            this.b = hk1.this.u(this.b, this.c);
            this.c = -1;
        }

        /* synthetic */ e(hk1 hk1Var, a aVar) {
            this();
        }
    }

    void s(int i) {
    }
}
