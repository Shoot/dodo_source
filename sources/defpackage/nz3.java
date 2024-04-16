package defpackage;

import defpackage.lr1;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: Flow.java */
/* renamed from: nz3  reason: default package */
/* loaded from: classes.dex */
public class nz3 extends s1c {
    private lr1[] F1;
    private int i1 = -1;
    private int j1 = -1;
    private int k1 = -1;
    private int l1 = -1;
    private int m1 = -1;
    private int n1 = -1;
    private float o1 = 0.5f;
    private float p1 = 0.5f;
    private float q1 = 0.5f;
    private float r1 = 0.5f;
    private float s1 = 0.5f;
    private float t1 = 0.5f;
    private int u1 = 0;
    private int v1 = 0;
    private int w1 = 2;
    private int x1 = 2;
    private int y1 = 0;
    private int z1 = -1;
    private int A1 = 0;
    private ArrayList<a> B1 = new ArrayList<>();
    private lr1[] C1 = null;
    private lr1[] D1 = null;
    private int[] E1 = null;
    private int G1 = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Flow.java */
    /* renamed from: nz3$a */
    /* loaded from: classes.dex */
    public class a {
        private int a;
        private hr1 d;
        private hr1 e;
        private hr1 f;
        private hr1 g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int q;
        private lr1 b = null;
        int c = 0;
        private int l = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;

        public a(int i, hr1 hr1Var, hr1 hr1Var2, hr1 hr1Var3, hr1 hr1Var4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = hr1Var;
            this.e = hr1Var2;
            this.f = hr1Var3;
            this.g = hr1Var4;
            this.h = nz3.this.u1();
            this.i = nz3.this.w1();
            this.j = nz3.this.v1();
            this.k = nz3.this.t1();
            this.q = i2;
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < nz3.this.G1; i2++) {
                lr1 lr1Var = nz3.this.F1[this.n + i2];
                if (this.a != 0) {
                    int g2 = nz3.this.g2(lr1Var, this.q);
                    int f2 = nz3.this.f2(lr1Var, this.q);
                    int i3 = nz3.this.v1;
                    if (lr1Var.T() == 8) {
                        i3 = 0;
                    }
                    this.m += f2 + i3;
                    if (this.b == null || this.c < g2) {
                        this.b = lr1Var;
                        this.c = g2;
                        this.l = g2;
                    }
                } else {
                    int U = lr1Var.U();
                    int i4 = nz3.this.u1;
                    if (lr1Var.T() == 8) {
                        i4 = 0;
                    }
                    this.l += U + i4;
                    int f22 = nz3.this.f2(lr1Var, this.q);
                    if (this.b == null || this.c < f22) {
                        this.b = lr1Var;
                        this.c = f22;
                        this.m = f22;
                    }
                }
            }
        }

        public void b(lr1 lr1Var) {
            int i = 0;
            if (this.a == 0) {
                int g2 = nz3.this.g2(lr1Var, this.q);
                if (lr1Var.B() == lr1.b.MATCH_CONSTRAINT) {
                    this.p++;
                    g2 = 0;
                }
                int i2 = nz3.this.u1;
                if (lr1Var.T() != 8) {
                    i = i2;
                }
                this.l += g2 + i;
                int f2 = nz3.this.f2(lr1Var, this.q);
                if (this.b == null || this.c < f2) {
                    this.b = lr1Var;
                    this.c = f2;
                    this.m = f2;
                }
            } else {
                int g22 = nz3.this.g2(lr1Var, this.q);
                int f22 = nz3.this.f2(lr1Var, this.q);
                if (lr1Var.R() == lr1.b.MATCH_CONSTRAINT) {
                    this.p++;
                    f22 = 0;
                }
                int i3 = nz3.this.v1;
                if (lr1Var.T() != 8) {
                    i = i3;
                }
                this.m += f22 + i;
                if (this.b == null || this.c < g22) {
                    this.b = lr1Var;
                    this.c = g22;
                    this.l = g22;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            lr1 lr1Var;
            float f;
            float f2;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2 && this.n + i3 < nz3.this.G1; i3++) {
                lr1 lr1Var2 = nz3.this.F1[this.n + i3];
                if (lr1Var2 != null) {
                    lr1Var2.s0();
                }
            }
            if (i2 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.n + i7 >= nz3.this.G1) {
                    break;
                }
                if (nz3.this.F1[this.n + i7].T() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            lr1 lr1Var3 = null;
            if (this.a == 0) {
                lr1 lr1Var4 = this.b;
                lr1Var4.Z0(nz3.this.j1);
                int i8 = this.i;
                if (i > 0) {
                    i8 += nz3.this.v1;
                }
                lr1Var4.Q.a(this.e, i8);
                if (z2) {
                    lr1Var4.S.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.S.a(lr1Var4.Q, 0);
                }
                if (nz3.this.x1 == 3 && !lr1Var4.X()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.n + i10 >= nz3.this.G1) {
                            break;
                        }
                        lr1Var = nz3.this.F1[this.n + i10];
                        if (lr1Var.X()) {
                            break;
                        }
                    }
                }
                lr1Var = lr1Var4;
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.n + i12 >= nz3.this.G1) {
                        return;
                    }
                    lr1 lr1Var5 = nz3.this.F1[this.n + i12];
                    if (i11 == 0) {
                        lr1Var5.k(lr1Var5.P, this.d, this.h);
                    }
                    if (i12 == 0) {
                        int i13 = nz3.this.i1;
                        float f3 = nz3.this.o1;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n != 0 || nz3.this.k1 == -1) {
                            if (z2 && nz3.this.m1 != -1) {
                                i13 = nz3.this.m1;
                                if (z) {
                                    f2 = nz3.this.s1;
                                    f = 1.0f - f2;
                                    f3 = f;
                                } else {
                                    f = nz3.this.s1;
                                    f3 = f;
                                }
                            }
                        } else {
                            i13 = nz3.this.k1;
                            if (z) {
                                f2 = nz3.this.q1;
                                f = 1.0f - f2;
                                f3 = f;
                            } else {
                                f = nz3.this.q1;
                                f3 = f;
                            }
                        }
                        lr1Var5.I0(i13);
                        lr1Var5.H0(f3);
                    }
                    if (i11 == i2 - 1) {
                        lr1Var5.k(lr1Var5.R, this.f, this.j);
                    }
                    if (lr1Var3 != null) {
                        lr1Var5.P.a(lr1Var3.R, nz3.this.u1);
                        if (i11 == i4) {
                            lr1Var5.P.u(this.h);
                        }
                        lr1Var3.R.a(lr1Var5.P, 0);
                        if (i11 == i5 + 1) {
                            lr1Var3.R.u(this.j);
                        }
                    }
                    if (lr1Var5 != lr1Var4) {
                        if (nz3.this.x1 != 3 || !lr1Var.X() || lr1Var5 == lr1Var || !lr1Var5.X()) {
                            int i14 = nz3.this.x1;
                            if (i14 == 0) {
                                lr1Var5.Q.a(lr1Var4.Q, 0);
                            } else if (i14 == 1) {
                                lr1Var5.S.a(lr1Var4.S, 0);
                            } else if (z3) {
                                lr1Var5.Q.a(this.e, this.i);
                                lr1Var5.S.a(this.g, this.k);
                            } else {
                                lr1Var5.Q.a(lr1Var4.Q, 0);
                                lr1Var5.S.a(lr1Var4.S, 0);
                            }
                        } else {
                            lr1Var5.T.a(lr1Var.T, 0);
                        }
                    }
                    i11++;
                    lr1Var3 = lr1Var5;
                }
                return;
            }
            lr1 lr1Var6 = this.b;
            lr1Var6.I0(nz3.this.i1);
            int i15 = this.h;
            if (i > 0) {
                i15 += nz3.this.u1;
            }
            if (z) {
                lr1Var6.R.a(this.f, i15);
                if (z2) {
                    lr1Var6.P.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.P.a(lr1Var6.R, 0);
                }
            } else {
                lr1Var6.P.a(this.d, i15);
                if (z2) {
                    lr1Var6.R.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.R.a(lr1Var6.P, 0);
                }
            }
            int i16 = 0;
            while (i16 < i2 && this.n + i16 < nz3.this.G1) {
                lr1 lr1Var7 = nz3.this.F1[this.n + i16];
                if (i16 == 0) {
                    lr1Var7.k(lr1Var7.Q, this.e, this.i);
                    int i17 = nz3.this.j1;
                    float f4 = nz3.this.p1;
                    if (this.n != 0 || nz3.this.l1 == -1) {
                        if (z2 && nz3.this.n1 != -1) {
                            i17 = nz3.this.n1;
                            f4 = nz3.this.t1;
                        }
                    } else {
                        i17 = nz3.this.l1;
                        f4 = nz3.this.r1;
                    }
                    lr1Var7.Z0(i17);
                    lr1Var7.Y0(f4);
                }
                if (i16 == i2 - 1) {
                    lr1Var7.k(lr1Var7.S, this.g, this.k);
                }
                if (lr1Var3 != null) {
                    lr1Var7.Q.a(lr1Var3.S, nz3.this.v1);
                    if (i16 == i4) {
                        lr1Var7.Q.u(this.i);
                    }
                    lr1Var3.S.a(lr1Var7.Q, 0);
                    if (i16 == i5 + 1) {
                        lr1Var3.S.u(this.k);
                    }
                }
                if (lr1Var7 != lr1Var6) {
                    if (z) {
                        int i18 = nz3.this.w1;
                        if (i18 == 0) {
                            lr1Var7.R.a(lr1Var6.R, 0);
                        } else if (i18 == 1) {
                            lr1Var7.P.a(lr1Var6.P, 0);
                        } else if (i18 == 2) {
                            lr1Var7.P.a(lr1Var6.P, 0);
                            lr1Var7.R.a(lr1Var6.R, 0);
                        }
                    } else {
                        int i19 = nz3.this.w1;
                        if (i19 == 0) {
                            lr1Var7.P.a(lr1Var6.P, 0);
                        } else if (i19 == 1) {
                            lr1Var7.R.a(lr1Var6.R, 0);
                        } else if (i19 == 2) {
                            if (z3) {
                                lr1Var7.P.a(this.d, this.h);
                                lr1Var7.R.a(this.f, this.j);
                            } else {
                                lr1Var7.P.a(lr1Var6.P, 0);
                                lr1Var7.R.a(lr1Var6.R, 0);
                            }
                        }
                        i16++;
                        lr1Var3 = lr1Var7;
                    }
                }
                i16++;
                lr1Var3 = lr1Var7;
            }
        }

        public int e() {
            if (this.a == 1) {
                return this.m - nz3.this.v1;
            }
            return this.m;
        }

        public int f() {
            if (this.a == 0) {
                return this.l - nz3.this.u1;
            }
            return this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < nz3.this.G1; i5++) {
                lr1 lr1Var = nz3.this.F1[this.n + i5];
                if (this.a == 0) {
                    if (lr1Var != null && lr1Var.B() == lr1.b.MATCH_CONSTRAINT && lr1Var.v == 0) {
                        nz3.this.y1(lr1Var, lr1.b.FIXED, i4, lr1Var.R(), lr1Var.y());
                    }
                } else if (lr1Var != null && lr1Var.R() == lr1.b.MATCH_CONSTRAINT && lr1Var.w == 0) {
                    nz3.this.y1(lr1Var, lr1Var.B(), lr1Var.U(), lr1.b.FIXED, i4);
                }
            }
            h();
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, hr1 hr1Var, hr1 hr1Var2, hr1 hr1Var3, hr1 hr1Var4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = hr1Var;
            this.e = hr1Var2;
            this.f = hr1Var3;
            this.g = hr1Var4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    private void e2(boolean z) {
        lr1 lr1Var;
        float f;
        int i;
        if (this.E1 != null && this.D1 != null && this.C1 != null) {
            for (int i2 = 0; i2 < this.G1; i2++) {
                this.F1[i2].s0();
            }
            int[] iArr = this.E1;
            int i3 = iArr[0];
            int i4 = iArr[1];
            float f2 = this.o1;
            lr1 lr1Var2 = null;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.o1;
                } else {
                    f = f2;
                    i = i5;
                }
                lr1 lr1Var3 = this.D1[i];
                if (lr1Var3 != null && lr1Var3.T() != 8) {
                    if (i5 == 0) {
                        lr1Var3.k(lr1Var3.P, this.P, u1());
                        lr1Var3.I0(this.i1);
                        lr1Var3.H0(f);
                    }
                    if (i5 == i3 - 1) {
                        lr1Var3.k(lr1Var3.R, this.R, v1());
                    }
                    if (i5 > 0 && lr1Var2 != null) {
                        lr1Var3.k(lr1Var3.P, lr1Var2.R, this.u1);
                        lr1Var2.k(lr1Var2.R, lr1Var3.P, 0);
                    }
                    lr1Var2 = lr1Var3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                lr1 lr1Var4 = this.C1[i6];
                if (lr1Var4 != null && lr1Var4.T() != 8) {
                    if (i6 == 0) {
                        lr1Var4.k(lr1Var4.Q, this.Q, w1());
                        lr1Var4.Z0(this.j1);
                        lr1Var4.Y0(this.p1);
                    }
                    if (i6 == i4 - 1) {
                        lr1Var4.k(lr1Var4.S, this.S, t1());
                    }
                    if (i6 > 0 && lr1Var2 != null) {
                        lr1Var4.k(lr1Var4.Q, lr1Var2.S, this.v1);
                        lr1Var2.k(lr1Var2.S, lr1Var4.Q, 0);
                    }
                    lr1Var2 = lr1Var4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.A1 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    lr1[] lr1VarArr = this.F1;
                    if (i9 < lr1VarArr.length && (lr1Var = lr1VarArr[i9]) != null && lr1Var.T() != 8) {
                        lr1 lr1Var5 = this.D1[i7];
                        lr1 lr1Var6 = this.C1[i8];
                        if (lr1Var != lr1Var5) {
                            lr1Var.k(lr1Var.P, lr1Var5.P, 0);
                            lr1Var.k(lr1Var.R, lr1Var5.R, 0);
                        }
                        if (lr1Var != lr1Var6) {
                            lr1Var.k(lr1Var.Q, lr1Var6.Q, 0);
                            lr1Var.k(lr1Var.S, lr1Var6.S, 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f2(lr1 lr1Var, int i) {
        if (lr1Var == null) {
            return 0;
        }
        if (lr1Var.R() == lr1.b.MATCH_CONSTRAINT) {
            int i2 = lr1Var.w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (lr1Var.D * i);
                if (i3 != lr1Var.y()) {
                    lr1Var.T0(true);
                    y1(lr1Var, lr1Var.B(), lr1Var.U(), lr1.b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return lr1Var.y();
            } else {
                if (i2 == 3) {
                    return (int) ((lr1Var.U() * lr1Var.e0) + 0.5f);
                }
            }
        }
        return lr1Var.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g2(lr1 lr1Var, int i) {
        if (lr1Var == null) {
            return 0;
        }
        if (lr1Var.B() == lr1.b.MATCH_CONSTRAINT) {
            int i2 = lr1Var.v;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (lr1Var.A * i);
                if (i3 != lr1Var.U()) {
                    lr1Var.T0(true);
                    y1(lr1Var, lr1.b.FIXED, i3, lr1Var.R(), lr1Var.y());
                }
                return i3;
            } else if (i2 == 1) {
                return lr1Var.U();
            } else {
                if (i2 == 3) {
                    return (int) ((lr1Var.y() * lr1Var.e0) + 0.5f);
                }
            }
        }
        return lr1Var.U();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h2(defpackage.lr1[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz3.h2(lr1[], int, int, int, int[]):void");
    }

    private void i2(lr1[] lr1VarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        hr1 hr1Var;
        int v1;
        hr1 hr1Var2;
        int t1;
        boolean z3;
        int i7;
        if (i == 0) {
            return;
        }
        this.B1.clear();
        a aVar = new a(i2, this.P, this.Q, this.R, this.S, i3);
        this.B1.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                lr1 lr1Var = lr1VarArr[i9];
                int g2 = g2(lr1Var, i3);
                if (lr1Var.B() == lr1.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                if ((i8 == i3 || this.u1 + i8 + g2 > i3) && aVar.b != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((!z3 && i9 > 0 && (i7 = this.z1) > 0 && i9 % i7 == 0) || z3) {
                    aVar = new a(i2, this.P, this.Q, this.R, this.S, i3);
                    aVar.i(i9);
                    this.B1.add(aVar);
                } else if (i9 > 0) {
                    i8 += this.u1 + g2;
                    aVar.b(lr1Var);
                    i9++;
                    i4 = i10;
                }
                i8 = g2;
                aVar.b(lr1Var);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                lr1 lr1Var2 = lr1VarArr[i12];
                int f2 = f2(lr1Var2, i3);
                if (lr1Var2.R() == lr1.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                if ((i11 == i3 || this.v1 + i11 + f2 > i3) && aVar.b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z && i12 > 0 && (i5 = this.z1) > 0 && i12 % i5 == 0) || z) {
                    aVar = new a(i2, this.P, this.Q, this.R, this.S, i3);
                    aVar.i(i12);
                    this.B1.add(aVar);
                } else if (i12 > 0) {
                    i11 += this.v1 + f2;
                    aVar.b(lr1Var2);
                    i12++;
                    i4 = i13;
                }
                i11 = f2;
                aVar.b(lr1Var2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.B1.size();
        hr1 hr1Var3 = this.P;
        hr1 hr1Var4 = this.Q;
        hr1 hr1Var5 = this.R;
        hr1 hr1Var6 = this.S;
        int u1 = u1();
        int w1 = w1();
        int v12 = v1();
        int t12 = t1();
        lr1.b B = B();
        lr1.b bVar = lr1.b.WRAP_CONTENT;
        if (B != bVar && R() != bVar) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 > 0 && z2) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = this.B1.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i15 = w1;
        int i16 = v12;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = u1;
        hr1 hr1Var7 = hr1Var4;
        hr1 hr1Var8 = hr1Var3;
        int i21 = t12;
        while (i19 < size) {
            a aVar3 = this.B1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    hr1Var2 = this.B1.get(i19 + 1).b.Q;
                    t1 = 0;
                } else {
                    hr1Var2 = this.S;
                    t1 = t1();
                }
                hr1 hr1Var9 = aVar3.b.S;
                hr1 hr1Var10 = hr1Var8;
                hr1 hr1Var11 = hr1Var8;
                int i22 = i17;
                hr1 hr1Var12 = hr1Var7;
                int i23 = i18;
                hr1 hr1Var13 = hr1Var5;
                hr1 hr1Var14 = hr1Var5;
                i6 = i19;
                aVar3.j(i2, hr1Var10, hr1Var12, hr1Var13, hr1Var2, i20, i15, i16, t1, i3);
                int max = Math.max(i23, aVar3.f());
                i17 = i22 + aVar3.e();
                if (i6 > 0) {
                    i17 += this.v1;
                }
                hr1Var8 = hr1Var11;
                i18 = max;
                hr1Var7 = hr1Var9;
                i15 = 0;
                hr1Var = hr1Var14;
                int i24 = t1;
                hr1Var6 = hr1Var2;
                i21 = i24;
            } else {
                hr1 hr1Var15 = hr1Var8;
                int i25 = i17;
                int i26 = i18;
                i6 = i19;
                if (i6 < size - 1) {
                    hr1Var = this.B1.get(i6 + 1).b.P;
                    v1 = 0;
                } else {
                    hr1Var = this.R;
                    v1 = v1();
                }
                hr1 hr1Var16 = aVar3.b.R;
                aVar3.j(i2, hr1Var15, hr1Var7, hr1Var, hr1Var6, i20, i15, v1, i21, i3);
                i18 = i26 + aVar3.f();
                int max2 = Math.max(i25, aVar3.e());
                if (i6 > 0) {
                    i18 += this.u1;
                }
                i17 = max2;
                i16 = v1;
                hr1Var8 = hr1Var16;
                i20 = 0;
            }
            i19 = i6 + 1;
            hr1Var5 = hr1Var;
        }
        iArr[0] = i18;
        iArr[1] = i17;
    }

    private void j2(lr1[] lr1VarArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.B1.size() == 0) {
            aVar = new a(i2, this.P, this.Q, this.R, this.S, i3);
            this.B1.add(aVar);
        } else {
            a aVar2 = this.B1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i2, this.P, this.Q, this.R, this.S, u1(), w1(), v1(), t1(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(lr1VarArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i) {
        this.v1 = i;
    }

    public void B2(int i) {
        this.j1 = i;
    }

    public void C2(int i) {
        this.y1 = i;
    }

    @Override // defpackage.lr1
    public void g(gq5 gq5Var, boolean z) {
        boolean z2;
        boolean z3;
        super.g(gq5Var, z);
        if (L() != null && ((mr1) L()).L1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = this.y1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    e2(z2);
                }
            } else {
                int size = this.B1.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a aVar = this.B1.get(i2);
                    if (i2 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar.d(z2, i2, z3);
                }
            }
        } else if (this.B1.size() > 0) {
            this.B1.get(0).d(z2, 0, true);
        }
        B1(false);
    }

    public void k2(float f) {
        this.q1 = f;
    }

    public void l2(int i) {
        this.k1 = i;
    }

    @Override // defpackage.eo4, defpackage.lr1
    public void m(lr1 lr1Var, HashMap<lr1, lr1> hashMap) {
        super.m(lr1Var, hashMap);
        nz3 nz3Var = (nz3) lr1Var;
        this.i1 = nz3Var.i1;
        this.j1 = nz3Var.j1;
        this.k1 = nz3Var.k1;
        this.l1 = nz3Var.l1;
        this.m1 = nz3Var.m1;
        this.n1 = nz3Var.n1;
        this.o1 = nz3Var.o1;
        this.p1 = nz3Var.p1;
        this.q1 = nz3Var.q1;
        this.r1 = nz3Var.r1;
        this.s1 = nz3Var.s1;
        this.t1 = nz3Var.t1;
        this.u1 = nz3Var.u1;
        this.v1 = nz3Var.v1;
        this.w1 = nz3Var.w1;
        this.x1 = nz3Var.x1;
        this.y1 = nz3Var.y1;
        this.z1 = nz3Var.z1;
        this.A1 = nz3Var.A1;
    }

    public void m2(float f) {
        this.r1 = f;
    }

    public void n2(int i) {
        this.l1 = i;
    }

    public void o2(int i) {
        this.w1 = i;
    }

    public void p2(float f) {
        this.o1 = f;
    }

    public void q2(int i) {
        this.u1 = i;
    }

    public void r2(int i) {
        this.i1 = i;
    }

    public void s2(float f) {
        this.s1 = f;
    }

    public void t2(int i) {
        this.m1 = i;
    }

    public void u2(float f) {
        this.t1 = f;
    }

    public void v2(int i) {
        this.n1 = i;
    }

    public void w2(int i) {
        this.z1 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    @Override // defpackage.s1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x1(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz3.x1(int, int, int, int):void");
    }

    public void x2(int i) {
        this.A1 = i;
    }

    public void y2(int i) {
        this.x1 = i;
    }

    public void z2(float f) {
        this.p1 = f;
    }
}
