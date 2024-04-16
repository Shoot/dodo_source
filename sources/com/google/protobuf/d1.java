package com.google.protobuf;

import com.google.protobuf.i1;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class d1 {
    private static final d1 f = new d1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private d1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public static d1 c() {
        return f;
    }

    private static int f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d1 j(d1 d1Var, d1 d1Var2) {
        int i = d1Var.a + d1Var2.a;
        int[] copyOf = Arrays.copyOf(d1Var.b, i);
        System.arraycopy(d1Var2.b, 0, copyOf, d1Var.a, d1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(d1Var.c, i);
        System.arraycopy(d1Var2.c, 0, copyOf2, d1Var.a, d1Var2.a);
        return new d1(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d1 k() {
        return new d1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i, Object obj, i1 i1Var) throws IOException {
        int a = h1.a(i);
        int b = h1.b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 5) {
                            i1Var.c(a, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.e());
                    } else if (i1Var.t() == i1.a.ASCENDING) {
                        i1Var.x(a);
                        ((d1) obj).r(i1Var);
                        i1Var.C(a);
                        return;
                    } else {
                        i1Var.C(a);
                        ((d1) obj).r(i1Var);
                        i1Var.x(a);
                        return;
                    }
                }
                i1Var.L(a, (f) obj);
                return;
            }
            i1Var.s(a, ((Long) obj).longValue());
            return;
        }
        i1Var.u(a, ((Long) obj).longValue());
    }

    void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public int d() {
        int W;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int a = h1.a(i4);
            int b = h1.b(i4);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 5) {
                                W = CodedOutputStream.m(a, ((Integer) this.c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.e());
                            }
                        } else {
                            W = (CodedOutputStream.T(a) * 2) + ((d1) this.c[i3]).d();
                        }
                    } else {
                        W = CodedOutputStream.g(a, (f) this.c[i3]);
                    }
                } else {
                    W = CodedOutputStream.o(a, ((Long) this.c[i3]).longValue());
                }
            } else {
                W = CodedOutputStream.W(a, ((Long) this.c[i3]).longValue());
            }
            i2 += W;
        }
        this.d = i2;
        return i2;
    }

    public int e() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += CodedOutputStream.I(h1.a(this.b[i3]), (f) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        int i = this.a;
        if (i == d1Var.a && o(this.b, d1Var.b, i) && l(this.c, d1Var.c, this.a)) {
            return true;
        }
        return false;
    }

    public void h() {
        this.e = false;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + f(this.b, i)) * 31) + g(this.c, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1 i(d1 d1Var) {
        if (d1Var.equals(c())) {
            return this;
        }
        a();
        int i = this.a + d1Var.a;
        b(i);
        System.arraycopy(d1Var.b, 0, this.b, this.a, d1Var.a);
        System.arraycopy(d1Var.c, 0, this.c, this.a, d1Var.a);
        this.a = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            l0.d(sb, i, String.valueOf(h1.a(this.b[i2])), this.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(i1 i1Var) throws IOException {
        if (i1Var.t() == i1.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                i1Var.b(h1.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            i1Var.b(h1.a(this.b[i2]), this.c[i2]);
        }
    }

    public void r(i1 i1Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (i1Var.t() == i1.a.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                q(this.b[i], this.c[i], i1Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            q(this.b[i2], this.c[i2], i1Var);
        }
    }

    private d1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
