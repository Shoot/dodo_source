package defpackage;

import defpackage.xw4;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableMap.java */
/* renamed from: oc9  reason: default package */
/* loaded from: classes2.dex */
public final class oc9<K, V> extends xw4<K, V> {
    static final xw4<Object, Object> h = new oc9(null, new Object[0], 0);
    private final transient Object e;
    final transient Object[] f;
    private final transient int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegularImmutableMap.java */
    /* renamed from: oc9$a */
    /* loaded from: classes2.dex */
    public static class a<K, V> extends zw4<Map.Entry<K, V>> {
        private final transient xw4<K, V> c;
        private final transient Object[] d;
        private final transient int e;
        private final transient int f;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: oc9$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0458a extends ww4<Map.Entry<K, V>> {
            C0458a() {
            }

            @Override // java.util.List
            /* renamed from: o0 */
            public Map.Entry<K, V> get(int i) {
                hh8.g(i, a.this.f);
                int i2 = i * 2;
                Object obj = a.this.d[a.this.e + i2];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.d[i2 + (a.this.e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f;
            }

            @Override // defpackage.uw4
            public boolean u() {
                return true;
            }
        }

        a(xw4<K, V> xw4Var, Object[] objArr, int i, int i2) {
            this.c = xw4Var;
            this.d = objArr;
            this.e = i;
            this.f = i2;
        }

        @Override // defpackage.zw4
        ww4<Map.Entry<K, V>> W() {
            return new C0458a();
        }

        @Override // defpackage.uw4
        int a(Object[] objArr, int i) {
            return G().a(objArr, i);
        }

        @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.c.get(key))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public boolean u() {
            return true;
        }

        @Override // defpackage.zw4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: w */
        public yqb<Map.Entry<K, V>> iterator() {
            return G().iterator();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* renamed from: oc9$b */
    /* loaded from: classes2.dex */
    static final class b<K> extends zw4<K> {
        private final transient xw4<K, ?> c;
        private final transient ww4<K> d;

        b(xw4<K, ?> xw4Var, ww4<K> ww4Var) {
            this.c = xw4Var;
            this.d = ww4Var;
        }

        @Override // defpackage.zw4
        public ww4<K> G() {
            return this.d;
        }

        @Override // defpackage.uw4
        int a(Object[] objArr, int i) {
            return G().a(objArr, i);
        }

        @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.c.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.c.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public boolean u() {
            return true;
        }

        @Override // defpackage.zw4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: w */
        public yqb<K> iterator() {
            return G().iterator();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* renamed from: oc9$c */
    /* loaded from: classes2.dex */
    static final class c extends ww4<Object> {
        private final transient Object[] c;
        private final transient int d;
        private final transient int e;

        c(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.e = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            hh8.g(i, this.e);
            Object obj = this.c[(i * 2) + this.d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public boolean u() {
            return true;
        }
    }

    private oc9(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.f = objArr;
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> oc9<K, V> m(int i, Object[] objArr, xw4.a<K, V> aVar) {
        if (i == 0) {
            return (oc9) h;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            yb1.a(obj, obj2);
            return new oc9<>(null, objArr, 1);
        }
        hh8.k(i, objArr.length >> 1);
        Object n = n(objArr, i, zw4.H(i), 0);
        if (n instanceof Object[]) {
            Object[] objArr2 = (Object[]) n;
            xw4.a.C0746a c0746a = (xw4.a.C0746a) objArr2[2];
            if (aVar != null) {
                aVar.e = c0746a;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                n = obj3;
                i = intValue;
            } else {
                throw c0746a.a();
            }
        }
        return new oc9<>(n, objArr, i);
    }

    private static Object n(Object[] objArr, int i, int i2, int i3) {
        xw4.a.C0746a c0746a = null;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            yb1.a(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj3 = objArr[i8];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj4);
                yb1.a(obj3, obj4);
                int b2 = cn4.b(obj3.hashCode());
                while (true) {
                    int i10 = b2 & i4;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj3;
                            objArr[i9 ^ 1] = obj4;
                        }
                        i6++;
                    } else if (obj3.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        Object obj5 = objArr[i12];
                        Objects.requireNonNull(obj5);
                        c0746a = new xw4.a.C0746a(obj3, obj4, obj5);
                        objArr[i12] = obj4;
                        break;
                    } else {
                        b2 = i10 + 1;
                    }
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0746a};
        } else if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj6 = objArr[i15];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj7);
                yb1.a(obj6, obj7);
                int b3 = cn4.b(obj6.hashCode());
                while (true) {
                    int i17 = b3 & i4;
                    int i18 = sArr[i17] & 65535;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj6;
                            objArr[i16 ^ 1] = obj7;
                        }
                        i13++;
                    } else if (obj6.equals(objArr[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj8 = objArr[i19];
                        Objects.requireNonNull(obj8);
                        c0746a = new xw4.a.C0746a(obj6, obj7, obj8);
                        objArr[i19] = obj7;
                        break;
                    } else {
                        b3 = i17 + 1;
                    }
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c0746a};
        } else {
            int[] iArr = new int[i2];
            Arrays.fill(iArr, -1);
            int i20 = 0;
            int i21 = 0;
            while (i20 < i) {
                int i22 = (i20 * 2) + i3;
                int i23 = (i21 * 2) + i3;
                Object obj9 = objArr[i22];
                Objects.requireNonNull(obj9);
                Object obj10 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj10);
                yb1.a(obj9, obj10);
                int b4 = cn4.b(obj9.hashCode());
                while (true) {
                    int i24 = b4 & i4;
                    int i25 = iArr[i24];
                    if (i25 == i5) {
                        iArr[i24] = i23;
                        if (i21 < i20) {
                            objArr[i23] = obj9;
                            objArr[i23 ^ 1] = obj10;
                        }
                        i21++;
                    } else if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        Objects.requireNonNull(obj11);
                        c0746a = new xw4.a.C0746a(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        break;
                    } else {
                        b4 = i24 + 1;
                        i5 = -1;
                    }
                }
                i20++;
                i5 = -1;
            }
            return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c0746a};
        }
    }

    static Object o(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int b2 = cn4.b(obj2.hashCode());
                while (true) {
                    int i3 = b2 & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i4])) {
                        return objArr[i4 ^ 1];
                    }
                    b2 = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int b3 = cn4.b(obj2.hashCode());
                while (true) {
                    int i5 = b3 & length2;
                    int i6 = sArr[i5] & 65535;
                    if (i6 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    b3 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int b4 = cn4.b(obj2.hashCode());
                while (true) {
                    int i7 = b4 & length3;
                    int i8 = iArr[i7];
                    if (i8 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i8])) {
                        return objArr[i8 ^ 1];
                    }
                    b4 = i7 + 1;
                }
            }
        }
    }

    @Override // defpackage.xw4
    zw4<Map.Entry<K, V>> c() {
        return new a(this, this.f, 0, this.g);
    }

    @Override // defpackage.xw4
    zw4<K> d() {
        return new b(this, new c(this.f, 0, this.g));
    }

    @Override // defpackage.xw4
    uw4<V> e() {
        return new c(this.f, 1, this.g);
    }

    @Override // defpackage.xw4, java.util.Map
    public V get(Object obj) {
        V v = (V) o(this.e, this.f, this.g, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public int size() {
        return this.g;
    }
}
