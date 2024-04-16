package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import defpackage.uw4;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
/* compiled from: ImmutableMap.java */
/* renamed from: xw4  reason: default package */
/* loaded from: classes2.dex */
public abstract class xw4<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] d = new Map.Entry[0];
    private transient zw4<Map.Entry<K, V>> a;
    private transient zw4<K> b;
    private transient uw4<V> c;

    /* compiled from: ImmutableMap.java */
    /* renamed from: xw4$a */
    /* loaded from: classes2.dex */
    public static class a<K, V> {
        Comparator<? super V> a;
        Object[] b;
        int c;
        boolean d;
        C0746a e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ImmutableMap.java */
        /* renamed from: xw4$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0746a {
            private final Object a;
            private final Object b;
            private final Object c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0746a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf(this.b);
                String valueOf3 = String.valueOf(this.a);
                String valueOf4 = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        private xw4<K, V> a(boolean z) {
            Object[] objArr;
            C0746a c0746a;
            C0746a c0746a2;
            if (z && (c0746a2 = this.e) != null) {
                throw c0746a2.a();
            }
            int i = this.c;
            if (this.a == null) {
                objArr = this.b;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, i * 2);
                }
                objArr = this.b;
                if (!z) {
                    objArr = d(objArr, this.c);
                    if (objArr.length < this.b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                f(objArr, i, this.a);
            }
            this.d = true;
            oc9 m = oc9.m(i, objArr, this);
            if (z && (c0746a = this.e) != null) {
                throw c0746a.a();
            }
            return m;
        }

        private void c(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, uw4.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        private Object[] d(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void f(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, cm7.a(comparator).e(b86.d()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public xw4<K, V> b() {
            return a(true);
        }

        public a<K, V> e(K k, V v) {
            c(this.c + 1);
            yb1.a(k, v);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }
    }

    /* compiled from: ImmutableMap.java */
    /* renamed from: xw4$b */
    /* loaded from: classes2.dex */
    static class b<K, V> implements Serializable {
        private final Object a;
        private final Object b;

        b(xw4<K, V> xw4Var) {
            Object[] objArr = new Object[xw4Var.size()];
            Object[] objArr2 = new Object[xw4Var.size()];
            yqb<Map.Entry<K, V>> it = xw4Var.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.a = objArr;
            this.b = objArr2;
        }

        final Object a() {
            Object[] objArr = (Object[]) this.a;
            Object[] objArr2 = (Object[]) this.b;
            a<K, V> b = b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                b.e((K) objArr[i], (V) objArr2[i]);
            }
            return b.b();
        }

        a<K, V> b(int i) {
            return new a<>(i);
        }

        final Object readResolve() {
            Object obj = this.a;
            if (!(obj instanceof zw4)) {
                return a();
            }
            zw4 zw4Var = (zw4) obj;
            a<K, V> b = b(zw4Var.size());
            yqb it = zw4Var.iterator();
            yqb it2 = ((uw4) this.b).iterator();
            while (it.hasNext()) {
                b.e((K) it.next(), (V) it2.next());
            }
            return b.b();
        }
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    public static <K, V> xw4<K, V> k() {
        return (xw4<K, V>) oc9.h;
    }

    abstract zw4<Map.Entry<K, V>> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract zw4<K> d();

    abstract uw4<V> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return b86.a(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return pfa.b(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public zw4<Map.Entry<K, V>> entrySet() {
        zw4<Map.Entry<K, V>> zw4Var = this.a;
        if (zw4Var == null) {
            zw4<Map.Entry<K, V>> c = c();
            this.a = c;
            return c;
        }
        return zw4Var;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: j */
    public zw4<K> keySet() {
        zw4<K> zw4Var = this.b;
        if (zw4Var == null) {
            zw4<K> d2 = d();
            this.b = d2;
            return d2;
        }
        return zw4Var;
    }

    @Override // java.util.Map
    /* renamed from: l */
    public uw4<V> values() {
        uw4<V> uw4Var = this.c;
        if (uw4Var == null) {
            uw4<V> e = e();
            this.c = e;
            return e;
        }
        return uw4Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return b86.c(this);
    }

    Object writeReplace() {
        return new b(this);
    }
}
