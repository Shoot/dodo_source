package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.j1;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class e1 {
    private static final e1 f = new e1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private e1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i;
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static e1 e() {
        return f;
    }

    private static int h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 k(e1 e1Var, e1 e1Var2) {
        int i = e1Var.a + e1Var2.a;
        int[] copyOf = Arrays.copyOf(e1Var.b, i);
        System.arraycopy(e1Var2.b, 0, copyOf, e1Var.a, e1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(e1Var.c, i);
        System.arraycopy(e1Var2.c, 0, copyOf2, e1Var.a, e1Var2.a);
        return new e1(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 l() {
        return new e1();
    }

    private static void p(int i, Object obj, j1 j1Var) throws IOException {
        int a = i1.a(i);
        int b = i1.b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 5) {
                            j1Var.c(a, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.d());
                    } else if (j1Var.t() == j1.a.ASCENDING) {
                        j1Var.x(a);
                        ((e1) obj).q(j1Var);
                        j1Var.C(a);
                        return;
                    } else {
                        j1Var.C(a);
                        ((e1) obj).q(j1Var);
                        j1Var.x(a);
                        return;
                    }
                }
                j1Var.K(a, (g) obj);
                return;
            }
            j1Var.s(a, ((Long) obj).longValue());
            return;
        }
        j1Var.u(a, ((Long) obj).longValue());
    }

    void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        int i = this.a;
        if (i == e1Var.a && c(this.b, e1Var.b, i) && d(this.c, e1Var.c, this.a)) {
            return true;
        }
        return false;
    }

    public int f() {
        int Y;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int a = i1.a(i4);
            int b = i1.b(i4);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 5) {
                                Y = CodedOutputStream.m(a, ((Integer) this.c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.d());
                            }
                        } else {
                            Y = (CodedOutputStream.V(a) * 2) + ((e1) this.c[i3]).f();
                        }
                    } else {
                        Y = CodedOutputStream.g(a, (g) this.c[i3]);
                    }
                } else {
                    Y = CodedOutputStream.o(a, ((Long) this.c[i3]).longValue());
                }
            } else {
                Y = CodedOutputStream.Y(a, ((Long) this.c[i3]).longValue());
            }
            i2 += Y;
        }
        this.d = i2;
        return i2;
    }

    public int g() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += CodedOutputStream.J(i1.a(this.b[i3]), (g) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + h(this.b, i)) * 31) + i(this.c, this.a);
    }

    public void j() {
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            m0.c(sb, i, String.valueOf(i1.a(this.b[i2])), this.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(j1 j1Var) throws IOException {
        if (j1Var.t() == j1.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                j1Var.b(i1.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            j1Var.b(i1.a(this.b[i2]), this.c[i2]);
        }
    }

    public void q(j1 j1Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (j1Var.t() == j1.a.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                p(this.b[i], this.c[i], j1Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            p(this.b[i2], this.c[i2], j1Var);
        }
    }

    private e1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
