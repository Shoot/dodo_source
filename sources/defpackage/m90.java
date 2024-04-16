package defpackage;

import defpackage.hr1;
import defpackage.lr1;
import java.util.ArrayList;
/* compiled from: BasicMeasure.java */
/* renamed from: m90  reason: default package */
/* loaded from: classes.dex */
public class m90 {
    private final ArrayList<lr1> a = new ArrayList<>();
    private a b = new a();
    private mr1 c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: m90$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public lr1.b a;
        public lr1.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: m90$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(lr1 lr1Var, a aVar);
    }

    public m90(mr1 mr1Var) {
        this.c = mr1Var;
    }

    private boolean a(b bVar, lr1 lr1Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.b.a = lr1Var.B();
        this.b.b = lr1Var.R();
        this.b.c = lr1Var.U();
        this.b.d = lr1Var.y();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        lr1.b bVar2 = aVar.a;
        lr1.b bVar3 = lr1.b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.b == bVar3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && lr1Var.e0 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && lr1Var.e0 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && lr1Var.x[0] == 4) {
            aVar.a = lr1.b.FIXED;
        }
        if (z4 && lr1Var.x[1] == 4) {
            aVar.b = lr1.b.FIXED;
        }
        bVar.b(lr1Var, aVar);
        lr1Var.f1(this.b.e);
        lr1Var.G0(this.b.f);
        lr1Var.F0(this.b.h);
        lr1Var.v0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    private void b(mr1 mr1Var) {
        boolean z;
        ap4 ap4Var;
        gyb gybVar;
        int size = mr1Var.T0.size();
        boolean P1 = mr1Var.P1(64);
        b E1 = mr1Var.E1();
        for (int i = 0; i < size; i++) {
            lr1 lr1Var = mr1Var.T0.get(i);
            if (!(lr1Var instanceof vi4) && !(lr1Var instanceof q60) && !lr1Var.j0() && (!P1 || (ap4Var = lr1Var.e) == null || (gybVar = lr1Var.f) == null || !ap4Var.e.j || !gybVar.e.j)) {
                lr1.b v = lr1Var.v(0);
                boolean z2 = true;
                lr1.b v2 = lr1Var.v(1);
                lr1.b bVar = lr1.b.MATCH_CONSTRAINT;
                if (v == bVar && lr1Var.v != 1 && v2 == bVar && lr1Var.w != 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && mr1Var.P1(1) && !(lr1Var instanceof s1c)) {
                    if (v == bVar && lr1Var.v == 0 && v2 != bVar && !lr1Var.g0()) {
                        z = true;
                    }
                    if (v2 != bVar || lr1Var.w != 0 || v == bVar || lr1Var.g0()) {
                        z2 = z;
                    }
                    if ((v != bVar && v2 != bVar) || lr1Var.e0 <= 0.0f) {
                        z = z2;
                    }
                }
                if (!z) {
                    a(E1, lr1Var, a.k);
                }
            }
        }
        E1.a();
    }

    private void c(mr1 mr1Var, String str, int i, int i2, int i3) {
        int J = mr1Var.J();
        int I = mr1Var.I();
        mr1Var.V0(0);
        mr1Var.U0(0);
        mr1Var.f1(i2);
        mr1Var.G0(i3);
        mr1Var.V0(J);
        mr1Var.U0(I);
        this.c.T1(i);
        this.c.n1();
    }

    public long d(mr1 mr1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        boolean z3;
        int i10;
        mr1 mr1Var2;
        int i11;
        boolean z4;
        boolean z5;
        boolean z6;
        int i12;
        int i13;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        m90 m90Var = this;
        b E1 = mr1Var.E1();
        int size = mr1Var.T0.size();
        int U = mr1Var.U();
        int y = mr1Var.y();
        boolean b2 = lb7.b(i, 128);
        if (!b2 && !lb7.b(i, 64)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (int i14 = 0; i14 < size; i14++) {
                lr1 lr1Var = mr1Var.T0.get(i14);
                lr1.b B = lr1Var.B();
                lr1.b bVar = lr1.b.MATCH_CONSTRAINT;
                if (B == bVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (lr1Var.R() == bVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && z11 && lr1Var.w() > 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((lr1Var.g0() && z12) || ((lr1Var.i0() && z12) || (lr1Var instanceof s1c) || lr1Var.g0() || lr1Var.i0())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            boolean z13 = gq5.r;
        }
        if ((i4 == 1073741824 && i6 == 1073741824) || b2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z14 = z & z2;
        if (z14) {
            int min = Math.min(mr1Var.H(), i5);
            int min2 = Math.min(mr1Var.G(), i7);
            if (i4 == 1073741824 && mr1Var.U() != min) {
                mr1Var.f1(min);
                mr1Var.I1();
            }
            if (i6 == 1073741824 && mr1Var.y() != min2) {
                mr1Var.G0(min2);
                mr1Var.I1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z3 = mr1Var.A1(b2);
                i10 = 2;
            } else {
                boolean B1 = mr1Var.B1(b2);
                if (i4 == 1073741824) {
                    B1 &= mr1Var.C1(b2, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z3 = mr1Var.C1(b2, 1) & B1;
                    i10++;
                } else {
                    z3 = B1;
                }
            }
            if (z3) {
                if (i4 == 1073741824) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i6 == 1073741824) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                mr1Var.k1(z8, z9);
            }
        } else {
            z3 = false;
            i10 = 0;
        }
        if (!z3 || i10 != 2) {
            int F1 = mr1Var.F1();
            if (size > 0) {
                b(mr1Var);
            }
            e(mr1Var);
            int size2 = m90Var.a.size();
            if (size > 0) {
                c(mr1Var, "First pass", 0, U, y);
            }
            if (size2 > 0) {
                lr1.b B2 = mr1Var.B();
                lr1.b bVar2 = lr1.b.WRAP_CONTENT;
                if (B2 == bVar2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (mr1Var.R() == bVar2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int max = Math.max(mr1Var.U(), m90Var.c.J());
                int max2 = Math.max(mr1Var.y(), m90Var.c.I());
                int i15 = 0;
                boolean z15 = false;
                while (i15 < size2) {
                    lr1 lr1Var2 = m90Var.a.get(i15);
                    if (!(lr1Var2 instanceof s1c)) {
                        i13 = F1;
                    } else {
                        int U2 = lr1Var2.U();
                        int y2 = lr1Var2.y();
                        i13 = F1;
                        boolean a2 = m90Var.a(E1, lr1Var2, a.l) | z15;
                        int U3 = lr1Var2.U();
                        int y3 = lr1Var2.y();
                        if (U3 != U2) {
                            lr1Var2.f1(U3);
                            if (z4 && lr1Var2.N() > max) {
                                max = Math.max(max, lr1Var2.N() + lr1Var2.p(hr1.b.RIGHT).f());
                            }
                            z7 = true;
                        } else {
                            z7 = a2;
                        }
                        if (y3 != y2) {
                            lr1Var2.G0(y3);
                            if (z5 && lr1Var2.s() > max2) {
                                max2 = Math.max(max2, lr1Var2.s() + lr1Var2.p(hr1.b.BOTTOM).f());
                            }
                            z7 = true;
                        }
                        z15 = z7 | ((s1c) lr1Var2).A1();
                    }
                    i15++;
                    F1 = i13;
                }
                int i16 = F1;
                int i17 = 2;
                int i18 = 0;
                while (i18 < i17) {
                    int i19 = 0;
                    while (i19 < size2) {
                        lr1 lr1Var3 = m90Var.a.get(i19);
                        if (((lr1Var3 instanceof co4) && !(lr1Var3 instanceof s1c)) || (lr1Var3 instanceof vi4) || lr1Var3.T() == 8 || ((z14 && lr1Var3.e.e.j && lr1Var3.f.e.j) || (lr1Var3 instanceof s1c))) {
                            z6 = z14;
                            i12 = size2;
                        } else {
                            int U4 = lr1Var3.U();
                            int y4 = lr1Var3.y();
                            z6 = z14;
                            int q = lr1Var3.q();
                            int i20 = a.l;
                            i12 = size2;
                            if (i18 == 1) {
                                i20 = a.m;
                            }
                            boolean a3 = m90Var.a(E1, lr1Var3, i20) | z15;
                            int U5 = lr1Var3.U();
                            int y5 = lr1Var3.y();
                            if (U5 != U4) {
                                lr1Var3.f1(U5);
                                if (z4 && lr1Var3.N() > max) {
                                    max = Math.max(max, lr1Var3.N() + lr1Var3.p(hr1.b.RIGHT).f());
                                }
                                a3 = true;
                            }
                            if (y5 != y4) {
                                lr1Var3.G0(y5);
                                if (z5 && lr1Var3.s() > max2) {
                                    max2 = Math.max(max2, lr1Var3.s() + lr1Var3.p(hr1.b.BOTTOM).f());
                                }
                                a3 = true;
                            }
                            if (lr1Var3.X() && q != lr1Var3.q()) {
                                z15 = true;
                            } else {
                                z15 = a3;
                            }
                        }
                        i19++;
                        m90Var = this;
                        z14 = z6;
                        size2 = i12;
                    }
                    boolean z16 = z14;
                    int i21 = size2;
                    if (!z15) {
                        break;
                    }
                    i18++;
                    c(mr1Var, "intermediate pass", i18, U, y);
                    m90Var = this;
                    z14 = z16;
                    size2 = i21;
                    i17 = 2;
                    z15 = false;
                }
                mr1Var2 = mr1Var;
                i11 = i16;
            } else {
                mr1Var2 = mr1Var;
                i11 = F1;
            }
            mr1Var2.S1(i11);
            return 0L;
        }
        return 0L;
    }

    public void e(mr1 mr1Var) {
        this.a.clear();
        int size = mr1Var.T0.size();
        for (int i = 0; i < size; i++) {
            lr1 lr1Var = mr1Var.T0.get(i);
            lr1.b B = lr1Var.B();
            lr1.b bVar = lr1.b.MATCH_CONSTRAINT;
            if (B == bVar || lr1Var.R() == bVar) {
                this.a.add(lr1Var);
            }
        }
        mr1Var.I1();
    }
}
