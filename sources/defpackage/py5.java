package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: LongSparseArray.java */
/* renamed from: py5  reason: default package */
/* loaded from: classes.dex */
public class py5<E> implements Cloneable {
    private static final Object e = new Object();
    private boolean a;
    private long[] b;
    private Object[] c;
    private int d;

    public py5() {
        this(10);
    }

    private void f() {
        int i = this.d;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public void b(long j, E e2) {
        int i = this.d;
        if (i != 0 && j <= this.b[i - 1]) {
            l(j, e2);
            return;
        }
        if (this.a && i >= this.b.length) {
            f();
        }
        int i2 = this.d;
        if (i2 >= this.b.length) {
            int f = at1.f(i2 + 1);
            long[] jArr = new long[f];
            Object[] objArr = new Object[f];
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = jArr;
            this.c = objArr;
        }
        this.b[i2] = j;
        this.c[i2] = e2;
        this.d = i2 + 1;
    }

    public void c() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: d */
    public py5<E> clone() {
        try {
            py5<E> py5Var = (py5) super.clone();
            py5Var.b = (long[]) this.b.clone();
            py5Var.c = (Object[]) this.c.clone();
            return py5Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean e(long j) {
        if (i(j) >= 0) {
            return true;
        }
        return false;
    }

    public E g(long j) {
        return h(j, null);
    }

    public E h(long j, E e2) {
        E e3;
        int b = at1.b(this.b, this.d, j);
        if (b >= 0 && (e3 = (E) this.c[b]) != e) {
            return e3;
        }
        return e2;
    }

    public int i(long j) {
        if (this.a) {
            f();
        }
        return at1.b(this.b, this.d, j);
    }

    public long j(int i) {
        if (this.a) {
            f();
        }
        return this.b[i];
    }

    public void l(long j, E e2) {
        int b = at1.b(this.b, this.d, j);
        if (b >= 0) {
            this.c[b] = e2;
            return;
        }
        int i = ~b;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == e) {
                this.b[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.a && i2 >= this.b.length) {
            f();
            i = ~at1.b(this.b, this.d, j);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int f = at1.f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = jArr;
            this.c = objArr2;
        }
        int i4 = this.d;
        if (i4 - i != 0) {
            long[] jArr3 = this.b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i, objArr4, i5, this.d - i);
        }
        this.b[i] = j;
        this.c[i] = e2;
        this.d++;
    }

    public void m(long j) {
        int b = at1.b(this.b, this.d, j);
        if (b >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[b];
            Object obj2 = e;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.a = true;
            }
        }
    }

    public void n(int i) {
        Object[] objArr = this.c;
        Object obj = objArr[i];
        Object obj2 = e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public int o() {
        if (this.a) {
            f();
        }
        return this.d;
    }

    public E p(int i) {
        if (this.a) {
            f();
        }
        return (E) this.c[i];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(j(i));
            sb.append('=');
            E p = p(i);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public py5(int i) {
        this.a = false;
        if (i == 0) {
            this.b = at1.b;
            this.c = at1.c;
            return;
        }
        int f = at1.f(i);
        this.b = new long[f];
        this.c = new Object[f];
    }
}
