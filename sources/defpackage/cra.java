package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: SparseArrayCompat.java */
/* renamed from: cra  reason: default package */
/* loaded from: classes.dex */
public class cra<E> implements Cloneable {
    private static final Object e = new Object();
    private boolean a;
    private int[] b;
    private Object[] c;
    private int d;

    public cra() {
        this(10);
    }

    private void f() {
        int i = this.d;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public void b(int i, E e2) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            m(i, e2);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            f();
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int e3 = at1.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = iArr;
            this.c = objArr;
        }
        this.b[i3] = i;
        this.c[i3] = e2;
        this.d = i3 + 1;
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
    public cra<E> clone() {
        try {
            cra<E> craVar = (cra) super.clone();
            craVar.b = (int[]) this.b.clone();
            craVar.c = (Object[]) this.c.clone();
            return craVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean e(int i) {
        if (i(i) >= 0) {
            return true;
        }
        return false;
    }

    public E g(int i) {
        return h(i, null);
    }

    public E h(int i, E e2) {
        E e3;
        int a = at1.a(this.b, this.d, i);
        if (a >= 0 && (e3 = (E) this.c[a]) != e) {
            return e3;
        }
        return e2;
    }

    public int i(int i) {
        if (this.a) {
            f();
        }
        return at1.a(this.b, this.d, i);
    }

    public int j(E e2) {
        if (this.a) {
            f();
        }
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public int l(int i) {
        if (this.a) {
            f();
        }
        return this.b[i];
    }

    public void m(int i, E e2) {
        int a = at1.a(this.b, this.d, i);
        if (a >= 0) {
            this.c[a] = e2;
            return;
        }
        int i2 = ~a;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == e) {
                this.b[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            f();
            i2 = ~at1.a(this.b, this.d, i);
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int e3 = at1.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = iArr;
            this.c = objArr2;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.d - i2);
        }
        this.b[i2] = i;
        this.c[i2] = e2;
        this.d++;
    }

    public int n() {
        if (this.a) {
            f();
        }
        return this.d;
    }

    public E o(int i) {
        if (this.a) {
            f();
        }
        return (E) this.c[i];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(l(i));
            sb.append('=');
            E o = o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public cra(int i) {
        this.a = false;
        if (i == 0) {
            this.b = at1.a;
            this.c = at1.c;
            return;
        }
        int e2 = at1.e(i);
        this.b = new int[e2];
        this.c = new Object[e2];
    }
}
