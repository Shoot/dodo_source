package defpackage;

import defpackage.lr1;
import defpackage.m90;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintWidgetContainer.java */
/* renamed from: mr1  reason: default package */
/* loaded from: classes.dex */
public class mr1 extends p4c {
    private int W0;
    int a1;
    int b1;
    int c1;
    int d1;
    m90 U0 = new m90(this);
    public h03 V0 = new h03(this);
    protected m90.b X0 = null;
    private boolean Y0 = false;
    protected gq5 Z0 = new gq5();
    public int e1 = 0;
    public int f1 = 0;
    vu0[] g1 = new vu0[4];
    vu0[] h1 = new vu0[4];
    public boolean i1 = false;
    public boolean j1 = false;
    public boolean k1 = false;
    public int l1 = 0;
    public int m1 = 0;
    private int n1 = 257;
    public boolean o1 = false;
    private boolean p1 = false;
    private boolean q1 = false;
    int r1 = 0;
    private WeakReference<hr1> s1 = null;
    private WeakReference<hr1> t1 = null;
    private WeakReference<hr1> u1 = null;
    private WeakReference<hr1> v1 = null;
    HashSet<lr1> w1 = new HashSet<>();
    public m90.a x1 = new m90.a();

    public static boolean O1(int i, lr1 lr1Var, m90.b bVar, m90.a aVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (lr1Var.T() != 8 && !(lr1Var instanceof vi4) && !(lr1Var instanceof q60)) {
            aVar.a = lr1Var.B();
            aVar.b = lr1Var.R();
            aVar.c = lr1Var.U();
            aVar.d = lr1Var.y();
            aVar.i = false;
            aVar.j = i2;
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
            if (z && lr1Var.Y(0) && lr1Var.v == 0 && !z3) {
                aVar.a = lr1.b.WRAP_CONTENT;
                if (z2 && lr1Var.w == 0) {
                    aVar.a = lr1.b.FIXED;
                }
                z = false;
            }
            if (z2 && lr1Var.Y(1) && lr1Var.w == 0 && !z4) {
                aVar.b = lr1.b.WRAP_CONTENT;
                if (z && lr1Var.v == 0) {
                    aVar.b = lr1.b.FIXED;
                }
                z2 = false;
            }
            if (lr1Var.l0()) {
                aVar.a = lr1.b.FIXED;
                z = false;
            }
            if (lr1Var.m0()) {
                aVar.b = lr1.b.FIXED;
                z2 = false;
            }
            if (z3) {
                if (lr1Var.x[0] == 4) {
                    aVar.a = lr1.b.FIXED;
                } else if (!z2) {
                    lr1.b bVar4 = aVar.b;
                    lr1.b bVar5 = lr1.b.FIXED;
                    if (bVar4 == bVar5) {
                        i4 = aVar.d;
                    } else {
                        aVar.a = lr1.b.WRAP_CONTENT;
                        bVar.b(lr1Var, aVar);
                        i4 = aVar.f;
                    }
                    aVar.a = bVar5;
                    aVar.c = (int) (lr1Var.w() * i4);
                }
            }
            if (z4) {
                if (lr1Var.x[1] == 4) {
                    aVar.b = lr1.b.FIXED;
                } else if (!z) {
                    lr1.b bVar6 = aVar.a;
                    lr1.b bVar7 = lr1.b.FIXED;
                    if (bVar6 == bVar7) {
                        i3 = aVar.c;
                    } else {
                        aVar.b = lr1.b.WRAP_CONTENT;
                        bVar.b(lr1Var, aVar);
                        i3 = aVar.e;
                    }
                    aVar.b = bVar7;
                    if (lr1Var.x() == -1) {
                        aVar.d = (int) (i3 / lr1Var.w());
                    } else {
                        aVar.d = (int) (lr1Var.w() * i3);
                    }
                }
            }
            bVar.b(lr1Var, aVar);
            lr1Var.f1(aVar.e);
            lr1Var.G0(aVar.f);
            lr1Var.F0(aVar.h);
            lr1Var.v0(aVar.g);
            aVar.j = m90.a.k;
            return aVar.i;
        }
        aVar.e = 0;
        aVar.f = 0;
        return false;
    }

    private void Q1() {
        this.e1 = 0;
        this.f1 = 0;
    }

    private void s1(lr1 lr1Var) {
        int i = this.e1 + 1;
        vu0[] vu0VarArr = this.h1;
        if (i >= vu0VarArr.length) {
            this.h1 = (vu0[]) Arrays.copyOf(vu0VarArr, vu0VarArr.length * 2);
        }
        this.h1[this.e1] = new vu0(lr1Var, 0, L1());
        this.e1++;
    }

    private void v1(hr1 hr1Var, lqa lqaVar) {
        this.Z0.h(lqaVar, this.Z0.q(hr1Var), 0, 5);
    }

    private void w1(hr1 hr1Var, lqa lqaVar) {
        this.Z0.h(this.Z0.q(hr1Var), lqaVar, 0, 5);
    }

    private void x1(lr1 lr1Var) {
        int i = this.f1 + 1;
        vu0[] vu0VarArr = this.g1;
        if (i >= vu0VarArr.length) {
            this.g1 = (vu0[]) Arrays.copyOf(vu0VarArr, vu0VarArr.length * 2);
        }
        this.g1[this.f1] = new vu0(lr1Var, 1, L1());
        this.f1++;
    }

    public boolean A1(boolean z) {
        return this.V0.f(z);
    }

    public boolean B1(boolean z) {
        return this.V0.g(z);
    }

    public boolean C1(boolean z, int i) {
        return this.V0.h(z, i);
    }

    public void D1(yi6 yi6Var) {
        this.Z0.v(yi6Var);
    }

    public m90.b E1() {
        return this.X0;
    }

    public int F1() {
        return this.n1;
    }

    public gq5 G1() {
        return this.Z0;
    }

    public boolean H1() {
        return false;
    }

    public void I1() {
        this.V0.j();
    }

    public void J1() {
        this.V0.k();
    }

    public boolean K1() {
        return this.q1;
    }

    public boolean L1() {
        return this.Y0;
    }

    public boolean M1() {
        return this.p1;
    }

    public long N1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a1 = i8;
        this.b1 = i9;
        return this.U0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean P1(int i) {
        if ((this.n1 & i) == i) {
            return true;
        }
        return false;
    }

    public void R1(m90.b bVar) {
        this.X0 = bVar;
        this.V0.n(bVar);
    }

    public void S1(int i) {
        this.n1 = i;
        gq5.r = P1(512);
    }

    public void T1(int i) {
        this.W0 = i;
    }

    public void U1(boolean z) {
        this.Y0 = z;
    }

    public boolean V1(gq5 gq5Var, boolean[] zArr) {
        zArr[2] = false;
        boolean P1 = P1(64);
        l1(gq5Var, P1);
        int size = this.T0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            lr1 lr1Var = this.T0.get(i);
            lr1Var.l1(gq5Var, P1);
            if (lr1Var.a0()) {
                z = true;
            }
        }
        return z;
    }

    public void W1() {
        this.U0.e(this);
    }

    @Override // defpackage.lr1
    public void k1(boolean z, boolean z2) {
        super.k1(z, z2);
        int size = this.T0.size();
        for (int i = 0; i < size; i++) {
            this.T0.get(i).k1(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.p4c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n1() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr1.n1():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q1(lr1 lr1Var, int i) {
        if (i == 0) {
            s1(lr1Var);
        } else if (i == 1) {
            x1(lr1Var);
        }
    }

    @Override // defpackage.p4c, defpackage.lr1
    public void r0() {
        this.Z0.E();
        this.a1 = 0;
        this.c1 = 0;
        this.b1 = 0;
        this.d1 = 0;
        this.o1 = false;
        super.r0();
    }

    public boolean r1(gq5 gq5Var) {
        int i;
        boolean P1 = P1(64);
        g(gq5Var, P1);
        int size = this.T0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            lr1 lr1Var = this.T0.get(i2);
            lr1Var.N0(0, false);
            lr1Var.N0(1, false);
            if (lr1Var instanceof q60) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                lr1 lr1Var2 = this.T0.get(i3);
                if (lr1Var2 instanceof q60) {
                    ((q60) lr1Var2).t1();
                }
            }
        }
        this.w1.clear();
        for (int i4 = 0; i4 < size; i4++) {
            lr1 lr1Var3 = this.T0.get(i4);
            if (lr1Var3.f()) {
                if (lr1Var3 instanceof s1c) {
                    this.w1.add(lr1Var3);
                } else {
                    lr1Var3.g(gq5Var, P1);
                }
            }
        }
        while (this.w1.size() > 0) {
            int size2 = this.w1.size();
            Iterator<lr1> it = this.w1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s1c s1cVar = (s1c) it.next();
                if (s1cVar.q1(this.w1)) {
                    s1cVar.g(gq5Var, P1);
                    this.w1.remove(s1cVar);
                    break;
                }
            }
            if (size2 == this.w1.size()) {
                Iterator<lr1> it2 = this.w1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(gq5Var, P1);
                }
                this.w1.clear();
            }
        }
        if (gq5.r) {
            HashSet<lr1> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                lr1 lr1Var4 = this.T0.get(i5);
                if (!lr1Var4.f()) {
                    hashSet.add(lr1Var4);
                }
            }
            if (B() == lr1.b.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            e(this, gq5Var, hashSet, i, false);
            Iterator<lr1> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                lr1 next = it3.next();
                lb7.a(this, gq5Var, next);
                next.g(gq5Var, P1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                lr1 lr1Var5 = this.T0.get(i6);
                if (lr1Var5 instanceof mr1) {
                    lr1.b[] bVarArr = lr1Var5.a0;
                    lr1.b bVar = bVarArr[0];
                    lr1.b bVar2 = bVarArr[1];
                    lr1.b bVar3 = lr1.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        lr1Var5.K0(lr1.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        lr1Var5.b1(lr1.b.FIXED);
                    }
                    lr1Var5.g(gq5Var, P1);
                    if (bVar == bVar3) {
                        lr1Var5.K0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        lr1Var5.b1(bVar2);
                    }
                } else {
                    lb7.a(this, gq5Var, lr1Var5);
                    if (!lr1Var5.f()) {
                        lr1Var5.g(gq5Var, P1);
                    }
                }
            }
        }
        if (this.e1 > 0) {
            tu0.b(this, gq5Var, null, 0);
        }
        if (this.f1 > 0) {
            tu0.b(this, gq5Var, null, 1);
        }
        return true;
    }

    public void t1(hr1 hr1Var) {
        WeakReference<hr1> weakReference = this.v1;
        if (weakReference == null || weakReference.get() == null || hr1Var.e() > this.v1.get().e()) {
            this.v1 = new WeakReference<>(hr1Var);
        }
    }

    public void u1(hr1 hr1Var) {
        WeakReference<hr1> weakReference = this.t1;
        if (weakReference == null || weakReference.get() == null || hr1Var.e() > this.t1.get().e()) {
            this.t1 = new WeakReference<>(hr1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y1(hr1 hr1Var) {
        WeakReference<hr1> weakReference = this.u1;
        if (weakReference == null || weakReference.get() == null || hr1Var.e() > this.u1.get().e()) {
            this.u1 = new WeakReference<>(hr1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z1(hr1 hr1Var) {
        WeakReference<hr1> weakReference = this.s1;
        if (weakReference == null || weakReference.get() == null || hr1Var.e() > this.s1.get().e()) {
            this.s1 = new WeakReference<>(hr1Var);
        }
    }
}
