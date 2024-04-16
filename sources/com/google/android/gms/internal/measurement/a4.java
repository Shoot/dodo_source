package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class a4 {
    private static final a4 f = new a4(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private a4() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a4 c(a4 a4Var, a4 a4Var2) {
        int i = a4Var.a + a4Var2.a;
        int[] copyOf = Arrays.copyOf(a4Var.b, i);
        System.arraycopy(a4Var2.b, 0, copyOf, a4Var.a, a4Var2.a);
        Object[] copyOf2 = Arrays.copyOf(a4Var.c, i);
        System.arraycopy(a4Var2.c, 0, copyOf2, a4Var.a, a4Var2.a);
        return new a4(i, copyOf, copyOf2, true);
    }

    private final void d(int i) {
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

    private static void f(int i, Object obj, k4 k4Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            k4Var.m(i2, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(zzjq.a());
                    } else if (k4Var.zza() == n5d.a) {
                        k4Var.j(i2);
                        ((a4) obj).j(k4Var);
                        k4Var.e(i2);
                        return;
                    } else {
                        k4Var.e(i2);
                        ((a4) obj).j(k4Var);
                        k4Var.j(i2);
                        return;
                    }
                }
                k4Var.O(i2, (d1) obj);
                return;
            }
            k4Var.u(i2, ((Long) obj).longValue());
            return;
        }
        k4Var.l(i2, ((Long) obj).longValue());
    }

    public static a4 k() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a4 l() {
        return new a4();
    }

    private final void n() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int a() {
        int q0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                q0 = zzio.l0(i5, ((Integer) this.c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(zzjq.a());
                            }
                        } else {
                            q0 = (zzio.w0(i5) << 1) + ((a4) this.c[i3]).a();
                        }
                    } else {
                        q0 = zzio.U(i5, (d1) this.c[i3]);
                    }
                } else {
                    q0 = zzio.T(i5, ((Long) this.c[i3]).longValue());
                }
            } else {
                q0 = zzio.q0(i5, ((Long) this.c[i3]).longValue());
            }
            i2 += q0;
        }
        this.d = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a4 b(a4 a4Var) {
        if (a4Var.equals(f)) {
            return this;
        }
        n();
        int i = this.a + a4Var.a;
        d(i);
        System.arraycopy(a4Var.b, 0, this.b, this.a, a4Var.a);
        System.arraycopy(a4Var.c, 0, this.c, this.a, a4Var.a);
        this.a = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, Object obj) {
        n();
        d(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        int i = this.a;
        if (i == a4Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = a4Var.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = a4Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(k4 k4Var) throws IOException {
        if (k4Var.zza() == n5d.b) {
            for (int i = this.a - 1; i >= 0; i--) {
                k4Var.q(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            k4Var.q(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            a3.c(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int i() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += zzio.d0(this.b[i3] >>> 3, (d1) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final void j(k4 k4Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (k4Var.zza() == n5d.a) {
            for (int i = 0; i < this.a; i++) {
                f(this.b[i], this.c[i], k4Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            f(this.b[i2], this.c[i2], k4Var);
        }
    }

    public final void m() {
        if (this.e) {
            this.e = false;
        }
    }

    private a4(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
