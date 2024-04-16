package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.k1;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes2.dex */
public final class f1 {
    private static final f1 f = new f1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private f1() {
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

    public static f1 c() {
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
    public static f1 i(f1 f1Var, f1 f1Var2) {
        int i = f1Var.a + f1Var2.a;
        int[] copyOf = Arrays.copyOf(f1Var.b, i);
        System.arraycopy(f1Var2.b, 0, copyOf, f1Var.a, f1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(f1Var.c, i);
        System.arraycopy(f1Var2.c, 0, copyOf2, f1Var.a, f1Var2.a);
        return new f1(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 j() {
        return new f1();
    }

    private static boolean k(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void p(int i, Object obj, k1 k1Var) throws IOException {
        int a = j1.a(i);
        int b = j1.b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 5) {
                            k1Var.c(a, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.e());
                    } else if (k1Var.t() == k1.a.ASCENDING) {
                        k1Var.x(a);
                        ((f1) obj).q(k1Var);
                        k1Var.C(a);
                        return;
                    } else {
                        k1Var.C(a);
                        ((f1) obj).q(k1Var);
                        k1Var.x(a);
                        return;
                    }
                }
                k1Var.M(a, (h) obj);
                return;
            }
            k1Var.s(a, ((Long) obj).longValue());
            return;
        }
        k1Var.u(a, ((Long) obj).longValue());
    }

    void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public int d() {
        int X;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int a = j1.a(i4);
            int b = j1.b(i4);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 5) {
                                X = CodedOutputStream.m(a, ((Integer) this.c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.e());
                            }
                        } else {
                            X = (CodedOutputStream.U(a) * 2) + ((f1) this.c[i3]).d();
                        }
                    } else {
                        X = CodedOutputStream.g(a, (h) this.c[i3]);
                    }
                } else {
                    X = CodedOutputStream.o(a, ((Long) this.c[i3]).longValue());
                }
            } else {
                X = CodedOutputStream.X(a, ((Long) this.c[i3]).longValue());
            }
            i2 += X;
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
            i2 += CodedOutputStream.I(j1.a(this.b[i3]), (h) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        int i = this.a;
        if (i == f1Var.a && n(this.b, f1Var.b, i) && k(this.c, f1Var.c, this.a)) {
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
    public final void l(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            n0.c(sb, i, String.valueOf(j1.a(this.b[i2])), this.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(k1 k1Var) throws IOException {
        if (k1Var.t() == k1.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                k1Var.b(j1.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            k1Var.b(j1.a(this.b[i2]), this.c[i2]);
        }
    }

    public void q(k1 k1Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (k1Var.t() == k1.a.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                p(this.b[i], this.c[i], k1Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            p(this.b[i2], this.c[i2], k1Var);
        }
    }

    private f1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
