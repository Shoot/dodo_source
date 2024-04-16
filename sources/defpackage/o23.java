package defpackage;

import defpackage.hr1;
import defpackage.lr1;
import defpackage.m90;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: Direct.java */
/* renamed from: o23  reason: default package */
/* loaded from: classes.dex */
public class o23 {
    private static m90.a a = new m90.a();
    private static int b = 0;
    private static int c = 0;

    private static boolean a(int i, lr1 lr1Var) {
        mr1 mr1Var;
        boolean z;
        boolean z2;
        lr1.b bVar;
        lr1.b bVar2;
        lr1.b B = lr1Var.B();
        lr1.b R = lr1Var.R();
        if (lr1Var.L() != null) {
            mr1Var = (mr1) lr1Var.L();
        } else {
            mr1Var = null;
        }
        if (mr1Var != null) {
            mr1Var.B();
            lr1.b bVar3 = lr1.b.FIXED;
        }
        if (mr1Var != null) {
            mr1Var.R();
            lr1.b bVar4 = lr1.b.FIXED;
        }
        lr1.b bVar5 = lr1.b.FIXED;
        if (B != bVar5 && !lr1Var.l0() && B != lr1.b.WRAP_CONTENT && ((B != (bVar2 = lr1.b.MATCH_CONSTRAINT) || lr1Var.v != 0 || lr1Var.e0 != 0.0f || !lr1Var.Y(0)) && (B != bVar2 || lr1Var.v != 1 || !lr1Var.b0(0, lr1Var.U())))) {
            z = false;
        } else {
            z = true;
        }
        if (R != bVar5 && !lr1Var.m0() && R != lr1.b.WRAP_CONTENT && ((R != (bVar = lr1.b.MATCH_CONSTRAINT) || lr1Var.w != 0 || lr1Var.e0 != 0.0f || !lr1Var.Y(1)) && (B != bVar || lr1Var.w != 1 || !lr1Var.b0(1, lr1Var.y())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (lr1Var.e0 > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    private static void b(int i, lr1 lr1Var, m90.b bVar, boolean z) {
        boolean z2;
        hr1 hr1Var;
        hr1 hr1Var2;
        hr1 hr1Var3;
        hr1 hr1Var4;
        hr1 hr1Var5;
        if (lr1Var.e0()) {
            return;
        }
        b++;
        if (!(lr1Var instanceof mr1) && lr1Var.k0()) {
            int i2 = i + 1;
            if (a(i2, lr1Var)) {
                mr1.O1(i2, lr1Var, bVar, new m90.a(), m90.a.k);
            }
        }
        hr1 p = lr1Var.p(hr1.b.LEFT);
        hr1 p2 = lr1Var.p(hr1.b.RIGHT);
        int e = p.e();
        int e2 = p2.e();
        if (p.d() != null && p.n()) {
            Iterator<hr1> it = p.d().iterator();
            while (it.hasNext()) {
                hr1 next = it.next();
                lr1 lr1Var2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, lr1Var2);
                if (lr1Var2.k0() && a2) {
                    mr1.O1(i3, lr1Var2, bVar, new m90.a(), m90.a.k);
                }
                lr1.b B = lr1Var2.B();
                lr1.b bVar2 = lr1.b.MATCH_CONSTRAINT;
                if (B == bVar2 && !a2) {
                    if (lr1Var2.B() == bVar2 && lr1Var2.z >= 0 && lr1Var2.y >= 0 && (lr1Var2.T() == 8 || (lr1Var2.v == 0 && lr1Var2.w() == 0.0f))) {
                        if (!lr1Var2.g0() && !lr1Var2.j0() && ((next == lr1Var2.P && (hr1Var5 = lr1Var2.R.f) != null && hr1Var5.n()) || (next == lr1Var2.R && (hr1Var4 = lr1Var2.P.f) != null && hr1Var4.n()))) {
                            if (!lr1Var2.g0()) {
                                e(i3, lr1Var, bVar, lr1Var2, z);
                            }
                        }
                    }
                } else if (!lr1Var2.k0()) {
                    hr1 hr1Var6 = lr1Var2.P;
                    if (next == hr1Var6 && lr1Var2.R.f == null) {
                        int f = hr1Var6.f() + e;
                        lr1Var2.A0(f, lr1Var2.U() + f);
                        b(i3, lr1Var2, bVar, z);
                    } else {
                        hr1 hr1Var7 = lr1Var2.R;
                        if (next == hr1Var7 && hr1Var6.f == null) {
                            int f2 = e - hr1Var7.f();
                            lr1Var2.A0(f2 - lr1Var2.U(), f2);
                            b(i3, lr1Var2, bVar, z);
                        } else if (next == hr1Var6 && (hr1Var3 = hr1Var7.f) != null && hr1Var3.n() && !lr1Var2.g0()) {
                            d(i3, bVar, lr1Var2, z);
                        }
                    }
                }
            }
        }
        if (lr1Var instanceof vi4) {
            return;
        }
        if (p2.d() != null && p2.n()) {
            Iterator<hr1> it2 = p2.d().iterator();
            while (it2.hasNext()) {
                hr1 next2 = it2.next();
                lr1 lr1Var3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, lr1Var3);
                if (lr1Var3.k0() && a3) {
                    mr1.O1(i4, lr1Var3, bVar, new m90.a(), m90.a.k);
                }
                if ((next2 == lr1Var3.P && (hr1Var2 = lr1Var3.R.f) != null && hr1Var2.n()) || (next2 == lr1Var3.R && (hr1Var = lr1Var3.P.f) != null && hr1Var.n())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lr1.b B2 = lr1Var3.B();
                lr1.b bVar3 = lr1.b.MATCH_CONSTRAINT;
                if (B2 == bVar3 && !a3) {
                    if (lr1Var3.B() == bVar3 && lr1Var3.z >= 0 && lr1Var3.y >= 0 && (lr1Var3.T() == 8 || (lr1Var3.v == 0 && lr1Var3.w() == 0.0f))) {
                        if (!lr1Var3.g0() && !lr1Var3.j0() && z2 && !lr1Var3.g0()) {
                            e(i4, lr1Var, bVar, lr1Var3, z);
                        }
                    }
                } else if (!lr1Var3.k0()) {
                    hr1 hr1Var8 = lr1Var3.P;
                    if (next2 == hr1Var8 && lr1Var3.R.f == null) {
                        int f3 = hr1Var8.f() + e2;
                        lr1Var3.A0(f3, lr1Var3.U() + f3);
                        b(i4, lr1Var3, bVar, z);
                    } else {
                        hr1 hr1Var9 = lr1Var3.R;
                        if (next2 == hr1Var9 && hr1Var8.f == null) {
                            int f4 = e2 - hr1Var9.f();
                            lr1Var3.A0(f4 - lr1Var3.U(), f4);
                            b(i4, lr1Var3, bVar, z);
                        } else if (z2 && !lr1Var3.g0()) {
                            d(i4, bVar, lr1Var3, z);
                        }
                    }
                }
            }
        }
        lr1Var.o0();
    }

    private static void c(int i, q60 q60Var, m90.b bVar, int i2, boolean z) {
        if (q60Var.o1()) {
            if (i2 == 0) {
                b(i + 1, q60Var, bVar, z);
            } else {
                i(i + 1, q60Var, bVar);
            }
        }
    }

    private static void d(int i, m90.b bVar, lr1 lr1Var, boolean z) {
        float f;
        float z2 = lr1Var.z();
        int e = lr1Var.P.f.e();
        int e2 = lr1Var.R.f.e();
        int f2 = lr1Var.P.f() + e;
        int f3 = e2 - lr1Var.R.f();
        if (e == e2) {
            z2 = 0.5f;
        } else {
            e = f2;
            e2 = f3;
        }
        int U = lr1Var.U();
        int i2 = (e2 - e) - U;
        if (e > e2) {
            i2 = (e - e2) - U;
        }
        if (i2 > 0) {
            f = (z2 * i2) + 0.5f;
        } else {
            f = z2 * i2;
        }
        int i3 = ((int) f) + e;
        int i4 = i3 + U;
        if (e > e2) {
            i4 = i3 - U;
        }
        lr1Var.A0(i3, i4);
        b(i + 1, lr1Var, bVar, z);
    }

    private static void e(int i, lr1 lr1Var, m90.b bVar, lr1 lr1Var2, boolean z) {
        int U;
        float z2 = lr1Var2.z();
        int e = lr1Var2.P.f.e() + lr1Var2.P.f();
        int e2 = lr1Var2.R.f.e() - lr1Var2.R.f();
        if (e2 >= e) {
            int U2 = lr1Var2.U();
            if (lr1Var2.T() != 8) {
                int i2 = lr1Var2.v;
                if (i2 == 2) {
                    if (lr1Var instanceof mr1) {
                        U = lr1Var.U();
                    } else {
                        U = lr1Var.L().U();
                    }
                    U2 = (int) (lr1Var2.z() * 0.5f * U);
                } else if (i2 == 0) {
                    U2 = e2 - e;
                }
                U2 = Math.max(lr1Var2.y, U2);
                int i3 = lr1Var2.z;
                if (i3 > 0) {
                    U2 = Math.min(i3, U2);
                }
            }
            int i4 = e + ((int) ((z2 * ((e2 - e) - U2)) + 0.5f));
            lr1Var2.A0(i4, U2 + i4);
            b(i + 1, lr1Var2, bVar, z);
        }
    }

    private static void f(int i, m90.b bVar, lr1 lr1Var) {
        float f;
        float P = lr1Var.P();
        int e = lr1Var.Q.f.e();
        int e2 = lr1Var.S.f.e();
        int f2 = lr1Var.Q.f() + e;
        int f3 = e2 - lr1Var.S.f();
        if (e == e2) {
            P = 0.5f;
        } else {
            e = f2;
            e2 = f3;
        }
        int y = lr1Var.y();
        int i2 = (e2 - e) - y;
        if (e > e2) {
            i2 = (e - e2) - y;
        }
        if (i2 > 0) {
            f = (P * i2) + 0.5f;
        } else {
            f = P * i2;
        }
        int i3 = (int) f;
        int i4 = e + i3;
        int i5 = i4 + y;
        if (e > e2) {
            i4 = e - i3;
            i5 = i4 - y;
        }
        lr1Var.D0(i4, i5);
        i(i + 1, lr1Var, bVar);
    }

    private static void g(int i, lr1 lr1Var, m90.b bVar, lr1 lr1Var2) {
        int y;
        float P = lr1Var2.P();
        int e = lr1Var2.Q.f.e() + lr1Var2.Q.f();
        int e2 = lr1Var2.S.f.e() - lr1Var2.S.f();
        if (e2 >= e) {
            int y2 = lr1Var2.y();
            if (lr1Var2.T() != 8) {
                int i2 = lr1Var2.w;
                if (i2 == 2) {
                    if (lr1Var instanceof mr1) {
                        y = lr1Var.y();
                    } else {
                        y = lr1Var.L().y();
                    }
                    y2 = (int) (P * 0.5f * y);
                } else if (i2 == 0) {
                    y2 = e2 - e;
                }
                y2 = Math.max(lr1Var2.B, y2);
                int i3 = lr1Var2.C;
                if (i3 > 0) {
                    y2 = Math.min(i3, y2);
                }
            }
            int i4 = e + ((int) ((P * ((e2 - e) - y2)) + 0.5f));
            lr1Var2.D0(i4, y2 + i4);
            i(i + 1, lr1Var2, bVar);
        }
    }

    public static void h(mr1 mr1Var, m90.b bVar) {
        lr1.b B = mr1Var.B();
        lr1.b R = mr1Var.R();
        b = 0;
        c = 0;
        mr1Var.t0();
        ArrayList<lr1> m1 = mr1Var.m1();
        int size = m1.size();
        for (int i = 0; i < size; i++) {
            m1.get(i).t0();
        }
        boolean L1 = mr1Var.L1();
        if (B == lr1.b.FIXED) {
            mr1Var.A0(0, mr1Var.U());
        } else {
            mr1Var.B0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            lr1 lr1Var = m1.get(i2);
            if (lr1Var instanceof vi4) {
                vi4 vi4Var = (vi4) lr1Var;
                if (vi4Var.n1() == 1) {
                    if (vi4Var.o1() != -1) {
                        vi4Var.r1(vi4Var.o1());
                    } else if (vi4Var.p1() != -1 && mr1Var.l0()) {
                        vi4Var.r1(mr1Var.U() - vi4Var.p1());
                    } else if (mr1Var.l0()) {
                        vi4Var.r1((int) ((vi4Var.q1() * mr1Var.U()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((lr1Var instanceof q60) && ((q60) lr1Var).s1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                lr1 lr1Var2 = m1.get(i3);
                if (lr1Var2 instanceof vi4) {
                    vi4 vi4Var2 = (vi4) lr1Var2;
                    if (vi4Var2.n1() == 1) {
                        b(0, vi4Var2, bVar, L1);
                    }
                }
            }
        }
        b(0, mr1Var, bVar, L1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                lr1 lr1Var3 = m1.get(i4);
                if (lr1Var3 instanceof q60) {
                    q60 q60Var = (q60) lr1Var3;
                    if (q60Var.s1() == 0) {
                        c(0, q60Var, bVar, 0, L1);
                    }
                }
            }
        }
        if (R == lr1.b.FIXED) {
            mr1Var.D0(0, mr1Var.y());
        } else {
            mr1Var.C0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            lr1 lr1Var4 = m1.get(i5);
            if (lr1Var4 instanceof vi4) {
                vi4 vi4Var3 = (vi4) lr1Var4;
                if (vi4Var3.n1() == 0) {
                    if (vi4Var3.o1() != -1) {
                        vi4Var3.r1(vi4Var3.o1());
                    } else if (vi4Var3.p1() != -1 && mr1Var.m0()) {
                        vi4Var3.r1(mr1Var.y() - vi4Var3.p1());
                    } else if (mr1Var.m0()) {
                        vi4Var3.r1((int) ((vi4Var3.q1() * mr1Var.y()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((lr1Var4 instanceof q60) && ((q60) lr1Var4).s1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                lr1 lr1Var5 = m1.get(i6);
                if (lr1Var5 instanceof vi4) {
                    vi4 vi4Var4 = (vi4) lr1Var5;
                    if (vi4Var4.n1() == 0) {
                        i(1, vi4Var4, bVar);
                    }
                }
            }
        }
        i(0, mr1Var, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                lr1 lr1Var6 = m1.get(i7);
                if (lr1Var6 instanceof q60) {
                    q60 q60Var2 = (q60) lr1Var6;
                    if (q60Var2.s1() == 1) {
                        c(0, q60Var2, bVar, 1, L1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            lr1 lr1Var7 = m1.get(i8);
            if (lr1Var7.k0() && a(0, lr1Var7)) {
                mr1.O1(0, lr1Var7, bVar, a, m90.a.k);
                if (lr1Var7 instanceof vi4) {
                    if (((vi4) lr1Var7).n1() == 0) {
                        i(0, lr1Var7, bVar);
                    } else {
                        b(0, lr1Var7, bVar, L1);
                    }
                } else {
                    b(0, lr1Var7, bVar, L1);
                    i(0, lr1Var7, bVar);
                }
            }
        }
    }

    private static void i(int i, lr1 lr1Var, m90.b bVar) {
        boolean z;
        hr1 hr1Var;
        hr1 hr1Var2;
        hr1 hr1Var3;
        hr1 hr1Var4;
        hr1 hr1Var5;
        if (lr1Var.n0()) {
            return;
        }
        c++;
        if (!(lr1Var instanceof mr1) && lr1Var.k0()) {
            int i2 = i + 1;
            if (a(i2, lr1Var)) {
                mr1.O1(i2, lr1Var, bVar, new m90.a(), m90.a.k);
            }
        }
        hr1 p = lr1Var.p(hr1.b.TOP);
        hr1 p2 = lr1Var.p(hr1.b.BOTTOM);
        int e = p.e();
        int e2 = p2.e();
        if (p.d() != null && p.n()) {
            Iterator<hr1> it = p.d().iterator();
            while (it.hasNext()) {
                hr1 next = it.next();
                lr1 lr1Var2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, lr1Var2);
                if (lr1Var2.k0() && a2) {
                    mr1.O1(i3, lr1Var2, bVar, new m90.a(), m90.a.k);
                }
                lr1.b R = lr1Var2.R();
                lr1.b bVar2 = lr1.b.MATCH_CONSTRAINT;
                if (R == bVar2 && !a2) {
                    if (lr1Var2.R() == bVar2 && lr1Var2.C >= 0 && lr1Var2.B >= 0 && (lr1Var2.T() == 8 || (lr1Var2.w == 0 && lr1Var2.w() == 0.0f))) {
                        if (!lr1Var2.i0() && !lr1Var2.j0() && ((next == lr1Var2.Q && (hr1Var5 = lr1Var2.S.f) != null && hr1Var5.n()) || (next == lr1Var2.S && (hr1Var4 = lr1Var2.Q.f) != null && hr1Var4.n()))) {
                            if (!lr1Var2.i0()) {
                                g(i3, lr1Var, bVar, lr1Var2);
                            }
                        }
                    }
                } else if (!lr1Var2.k0()) {
                    hr1 hr1Var6 = lr1Var2.Q;
                    if (next == hr1Var6 && lr1Var2.S.f == null) {
                        int f = hr1Var6.f() + e;
                        lr1Var2.D0(f, lr1Var2.y() + f);
                        i(i3, lr1Var2, bVar);
                    } else {
                        hr1 hr1Var7 = lr1Var2.S;
                        if (next == hr1Var7 && hr1Var7.f == null) {
                            int f2 = e - hr1Var7.f();
                            lr1Var2.D0(f2 - lr1Var2.y(), f2);
                            i(i3, lr1Var2, bVar);
                        } else if (next == hr1Var6 && (hr1Var3 = hr1Var7.f) != null && hr1Var3.n()) {
                            f(i3, bVar, lr1Var2);
                        }
                    }
                }
            }
        }
        if (lr1Var instanceof vi4) {
            return;
        }
        if (p2.d() != null && p2.n()) {
            Iterator<hr1> it2 = p2.d().iterator();
            while (it2.hasNext()) {
                hr1 next2 = it2.next();
                lr1 lr1Var3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, lr1Var3);
                if (lr1Var3.k0() && a3) {
                    mr1.O1(i4, lr1Var3, bVar, new m90.a(), m90.a.k);
                }
                if ((next2 == lr1Var3.Q && (hr1Var2 = lr1Var3.S.f) != null && hr1Var2.n()) || (next2 == lr1Var3.S && (hr1Var = lr1Var3.Q.f) != null && hr1Var.n())) {
                    z = true;
                } else {
                    z = false;
                }
                lr1.b R2 = lr1Var3.R();
                lr1.b bVar3 = lr1.b.MATCH_CONSTRAINT;
                if (R2 == bVar3 && !a3) {
                    if (lr1Var3.R() == bVar3 && lr1Var3.C >= 0 && lr1Var3.B >= 0 && (lr1Var3.T() == 8 || (lr1Var3.w == 0 && lr1Var3.w() == 0.0f))) {
                        if (!lr1Var3.i0() && !lr1Var3.j0() && z && !lr1Var3.i0()) {
                            g(i4, lr1Var, bVar, lr1Var3);
                        }
                    }
                } else if (!lr1Var3.k0()) {
                    hr1 hr1Var8 = lr1Var3.Q;
                    if (next2 == hr1Var8 && lr1Var3.S.f == null) {
                        int f3 = hr1Var8.f() + e2;
                        lr1Var3.D0(f3, lr1Var3.y() + f3);
                        i(i4, lr1Var3, bVar);
                    } else {
                        hr1 hr1Var9 = lr1Var3.S;
                        if (next2 == hr1Var9 && hr1Var8.f == null) {
                            int f4 = e2 - hr1Var9.f();
                            lr1Var3.D0(f4 - lr1Var3.y(), f4);
                            i(i4, lr1Var3, bVar);
                        } else if (z && !lr1Var3.i0()) {
                            f(i4, bVar, lr1Var3);
                        }
                    }
                }
            }
        }
        hr1 p3 = lr1Var.p(hr1.b.BASELINE);
        if (p3.d() != null && p3.n()) {
            int e3 = p3.e();
            Iterator<hr1> it3 = p3.d().iterator();
            while (it3.hasNext()) {
                hr1 next3 = it3.next();
                lr1 lr1Var4 = next3.d;
                int i5 = i + 1;
                boolean a4 = a(i5, lr1Var4);
                if (lr1Var4.k0() && a4) {
                    mr1.O1(i5, lr1Var4, bVar, new m90.a(), m90.a.k);
                }
                if (lr1Var4.R() != lr1.b.MATCH_CONSTRAINT || a4) {
                    if (!lr1Var4.k0() && next3 == lr1Var4.T) {
                        lr1Var4.z0(next3.f() + e3);
                        i(i5, lr1Var4, bVar);
                    }
                }
            }
        }
        lr1Var.p0();
    }
}
