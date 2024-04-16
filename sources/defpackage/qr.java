package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ArraySet.java */
/* renamed from: qr  reason: default package */
/* loaded from: classes.dex */
public final class qr<E> implements Collection<E>, Set<E> {
    private static final int[] e = new int[0];
    private static final Object[] f = new Object[0];
    private static Object[] g;
    private static int h;
    private static Object[] i;
    private static int j;
    private int[] a;
    Object[] b;
    int c;
    private j66<E, E> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArraySet.java */
    /* renamed from: qr$a */
    /* loaded from: classes.dex */
    public class a extends j66<E, E> {
        a() {
        }

        @Override // defpackage.j66
        protected void a() {
            qr.this.clear();
        }

        @Override // defpackage.j66
        protected Object b(int i, int i2) {
            return qr.this.b[i];
        }

        @Override // defpackage.j66
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // defpackage.j66
        protected int d() {
            return qr.this.c;
        }

        @Override // defpackage.j66
        protected int e(Object obj) {
            return qr.this.indexOf(obj);
        }

        @Override // defpackage.j66
        protected int f(Object obj) {
            return qr.this.indexOf(obj);
        }

        @Override // defpackage.j66
        protected void g(E e, E e2) {
            qr.this.add(e);
        }

        @Override // defpackage.j66
        protected void h(int i) {
            qr.this.t(i);
        }

        @Override // defpackage.j66
        protected E i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public qr() {
        this(0);
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (qr.class) {
                try {
                    Object[] objArr = i;
                    if (objArr != null) {
                        this.b = objArr;
                        i = (Object[]) objArr[0];
                        this.a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (qr.class) {
                try {
                    Object[] objArr2 = g;
                    if (objArr2 != null) {
                        this.b = objArr2;
                        g = (Object[]) objArr2[0];
                        this.a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.a = new int[i2];
        this.b = new Object[i2];
    }

    private static void f(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (qr.class) {
                try {
                    if (j < 10) {
                        objArr[0] = i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        i = objArr;
                        j++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (qr.class) {
                try {
                    if (h < 10) {
                        objArr[0] = g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        g = objArr;
                        h++;
                    }
                } finally {
                }
            }
        }
    }

    private j66<E, E> g() {
        if (this.d == null) {
            this.d = new a();
        }
        return this.d;
    }

    private int h(Object obj, int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = at1.a(this.a, i3, i2);
        if (a2 < 0) {
            return a2;
        }
        if (obj.equals(this.b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.a[i4] == i2) {
            if (obj.equals(this.b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.a[i5] == i2; i5--) {
            if (obj.equals(this.b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int k() {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = at1.a(this.a, i2, 0);
        if (a2 < 0) {
            return a2;
        }
        if (this.b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.a[i3] == 0) {
            if (this.b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.a[i4] == 0; i4--) {
            if (this.b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int h2;
        if (e2 == null) {
            h2 = k();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            h2 = h(e2, hashCode);
        }
        if (h2 >= 0) {
            return false;
        }
        int i3 = ~h2;
        int i4 = this.c;
        int[] iArr = this.a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.b;
            a(i5);
            int[] iArr2 = this.a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.b, 0, objArr.length);
            }
            f(iArr, objArr, this.c);
        }
        int i6 = this.c;
        if (i3 < i6) {
            int[] iArr3 = this.a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.c - i3);
        }
        this.a[i3] = i2;
        this.b[i3] = e2;
        this.c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        d(this.c + collection.size());
        boolean z = false;
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.c;
        if (i2 != 0) {
            f(this.a, this.b, i2);
            this.a = e;
            this.b = f;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(int i2) {
        int[] iArr = this.a;
        if (iArr.length < i2) {
            Object[] objArr = this.b;
            a(i2);
            int i3 = this.c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i3);
                System.arraycopy(objArr, 0, this.b, 0, this.c);
            }
            f(iArr, objArr, this.c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                try {
                    if (!set.contains(u(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.a;
        int i2 = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return k();
        }
        return h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return g().m().iterator();
    }

    public boolean p(@NonNull qr<? extends E> qrVar) {
        int i2 = qrVar.c;
        int i3 = this.c;
        for (int i4 = 0; i4 < i2; i4++) {
            remove(qrVar.u(i4));
        }
        if (i3 == this.c) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            t(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.b[i2])) {
                t(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.c;
    }

    public E t(int i2) {
        Object[] objArr = this.b;
        E e2 = (E) objArr[i2];
        int i3 = this.c;
        if (i3 <= 1) {
            f(this.a, objArr, i3);
            this.a = e;
            this.b = f;
            this.c = 0;
        } else {
            int[] iArr = this.a;
            int i4 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.c--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.a, 0, i2);
                    System.arraycopy(objArr, 0, this.b, 0, i2);
                }
                int i5 = this.c;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, this.a, i2, i5 - i2);
                    System.arraycopy(objArr, i6, this.b, i2, this.c - i2);
                }
            } else {
                int i7 = i3 - 1;
                this.c = i7;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, iArr, i2, i7 - i2);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i8, objArr2, i2, this.c - i2);
                }
                this.b[this.c] = null;
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i2 = this.c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.b, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E u = u(i2);
            if (u != this) {
                sb.append(u);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public E u(int i2) {
        return (E) this.b[i2];
    }

    public qr(int i2) {
        if (i2 == 0) {
            this.a = e;
            this.b = f;
        } else {
            a(i2);
        }
        this.c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.c));
        }
        System.arraycopy(this.b, 0, tArr, 0, this.c);
        int length = tArr.length;
        int i2 = this.c;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
