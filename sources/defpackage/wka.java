package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: SimpleArrayMap.java */
/* renamed from: wka  reason: default package */
/* loaded from: classes.dex */
public class wka<K, V> {
    static Object[] d;
    static int e;
    static Object[] f;
    static int g;
    int[] a;
    Object[] b;
    int c;

    public wka() {
        this.a = at1.a;
        this.b = at1.c;
        this.c = 0;
    }

    private void b(int i) {
        if (i == 8) {
            synchronized (wka.class) {
                try {
                    Object[] objArr = f;
                    if (objArr != null) {
                        this.b = objArr;
                        f = (Object[]) objArr[0];
                        this.a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (wka.class) {
                try {
                    Object[] objArr2 = d;
                    if (objArr2 != null) {
                        this.b = objArr2;
                        d = (Object[]) objArr2[0];
                        this.a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.a = new int[i];
        this.b = new Object[i << 1];
    }

    private static int c(int[] iArr, int i, int i2) {
        try {
            return at1.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (wka.class) {
                try {
                    if (g < 10) {
                        objArr[0] = f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f = objArr;
                        g++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (wka.class) {
                try {
                    if (e < 10) {
                        objArr[0] = d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        d = objArr;
                        e++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.a;
            Object[] objArr = this.b;
            this.a = at1.a;
            this.b = at1.c;
            this.c = 0;
            e(iArr, objArr, i);
        }
        if (this.c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (j(obj) >= 0) {
            return true;
        }
        return false;
    }

    public void d(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            b(i);
            if (this.c > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i2);
                System.arraycopy(objArr, 0, this.b, 0, i2 << 1);
            }
            e(iArr, objArr, i2);
        }
        if (this.c == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wka) {
            wka wkaVar = (wka) obj;
            if (size() != wkaVar.size()) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                try {
                    K k = k(i);
                    V o = o(i);
                    Object obj2 = wkaVar.get(k);
                    if (o == null) {
                        if (obj2 != null || !wkaVar.containsKey(k)) {
                            return false;
                        }
                    } else if (!o.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                try {
                    K k2 = k(i2);
                    V o2 = o(i2);
                    Object obj3 = map.get(k2);
                    if (o2 == null) {
                        if (obj3 != null || !map.containsKey(k2)) {
                            return false;
                        }
                    } else if (!o2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    int g(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int c = c(this.a, i2, i);
        if (c < 0) {
            return c;
        }
        if (obj.equals(this.b[c << 1])) {
            return c;
        }
        int i3 = c + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (obj.equals(this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = c - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (obj.equals(this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int h = h(obj);
        if (h >= 0) {
            return (V) this.b[(h << 1) + 1];
        }
        return v;
    }

    public int h(Object obj) {
        if (obj == null) {
            return i();
        }
        return g(obj, obj.hashCode());
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    int i() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int c = c(this.a, i, 0);
        if (c < 0) {
            return c;
        }
        if (this.b[c << 1] == null) {
            return c;
        }
        int i2 = c + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = c - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K k(int i) {
        return (K) this.b[i << 1];
    }

    public void l(@NonNull wka<? extends K, ? extends V> wkaVar) {
        int i = wkaVar.c;
        d(this.c + i);
        if (this.c == 0) {
            if (i > 0) {
                System.arraycopy(wkaVar.a, 0, this.a, 0, i);
                System.arraycopy(wkaVar.b, 0, this.b, 0, i << 1);
                this.c = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(wkaVar.k(i2), wkaVar.o(i2));
        }
    }

    public V m(int i) {
        Object[] objArr = this.b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.c;
        int i4 = 0;
        if (i3 <= 1) {
            e(this.a, objArr, i3);
            this.a = at1.a;
            this.b = at1.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.a;
            int i6 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                b(i6);
                if (i3 == this.c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.a, 0, i);
                        System.arraycopy(objArr, 0, this.b, 0, i2);
                    }
                    if (i < i5) {
                        int i7 = i + 1;
                        int i8 = i5 - i;
                        System.arraycopy(iArr, i7, this.a, i, i8);
                        System.arraycopy(objArr, i7 << 1, this.b, i2, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, iArr, i, i10);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i2, i10 << 1);
                }
                Object[] objArr3 = this.b;
                int i11 = i5 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.c) {
            this.c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V n(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V o(int i) {
        return (V) this.b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int g2;
        int i2 = this.c;
        if (k == null) {
            g2 = i();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            g2 = g(k, hashCode);
        }
        if (g2 >= 0) {
            int i3 = (g2 << 1) + 1;
            Object[] objArr = this.b;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~g2;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.b;
            b(i5);
            if (i2 == this.c) {
                int[] iArr2 = this.a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.b, 0, objArr2.length);
                }
                e(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.c - i4) << 1);
        }
        int i7 = this.c;
        if (i2 == i7) {
            int[] iArr4 = this.a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.b;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V remove(Object obj) {
        int h = h(obj);
        if (h >= 0) {
            return m(h);
        }
        return null;
    }

    public V replace(K k, V v) {
        int h = h(k);
        if (h >= 0) {
            return n(h, v);
        }
        return null;
    }

    public int size() {
        return this.c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K k = k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V o = o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int h = h(obj);
        if (h >= 0) {
            V o = o(h);
            if (obj2 == o || (obj2 != null && obj2.equals(o))) {
                m(h);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int h = h(k);
        if (h >= 0) {
            V o = o(h);
            if (o == v || (v != null && v.equals(o))) {
                n(h, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public wka(int i) {
        if (i == 0) {
            this.a = at1.a;
            this.b = at1.c;
        } else {
            b(i);
        }
        this.c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wka(wka<K, V> wkaVar) {
        this();
        if (wkaVar != 0) {
            l(wkaVar);
        }
    }
}
