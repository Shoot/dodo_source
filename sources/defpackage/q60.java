package defpackage;

import defpackage.hr1;
import defpackage.lr1;
import java.util.HashMap;
/* compiled from: Barrier.java */
/* renamed from: q60  reason: default package */
/* loaded from: classes.dex */
public class q60 extends eo4 {
    private int V0 = 0;
    private boolean W0 = true;
    private int X0 = 0;
    boolean Y0 = false;

    @Override // defpackage.lr1
    public void g(gq5 gq5Var, boolean z) {
        hr1[] hr1VarArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        hr1[] hr1VarArr2 = this.X;
        hr1VarArr2[0] = this.P;
        hr1VarArr2[2] = this.Q;
        hr1VarArr2[1] = this.R;
        hr1VarArr2[3] = this.S;
        int i6 = 0;
        while (true) {
            hr1VarArr = this.X;
            if (i6 >= hr1VarArr.length) {
                break;
            }
            hr1 hr1Var = hr1VarArr[i6];
            hr1Var.i = gq5Var.q(hr1Var);
            i6++;
        }
        int i7 = this.V0;
        if (i7 >= 0 && i7 < 4) {
            hr1 hr1Var2 = hr1VarArr[i7];
            if (!this.Y0) {
                o1();
            }
            if (this.Y0) {
                this.Y0 = false;
                int i8 = this.V0;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        gq5Var.f(this.Q.i, this.h0);
                        gq5Var.f(this.S.i, this.h0);
                        return;
                    }
                    return;
                }
                gq5Var.f(this.P.i, this.g0);
                gq5Var.f(this.R.i, this.g0);
                return;
            }
            for (int i9 = 0; i9 < this.U0; i9++) {
                lr1 lr1Var = this.T0[i9];
                if ((this.W0 || lr1Var.h()) && ((((i4 = this.V0) == 0 || i4 == 1) && lr1Var.B() == lr1.b.MATCH_CONSTRAINT && lr1Var.P.f != null && lr1Var.R.f != null) || (((i5 = this.V0) == 2 || i5 == 3) && lr1Var.R() == lr1.b.MATCH_CONSTRAINT && lr1Var.Q.f != null && lr1Var.S.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!this.P.l() && !this.R.l()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!this.Q.l() && !this.S.l()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.V0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i10 = 0; i10 < this.U0; i10++) {
                lr1 lr1Var2 = this.T0[i10];
                if (this.W0 || lr1Var2.h()) {
                    lqa q = gq5Var.q(lr1Var2.X[this.V0]);
                    hr1[] hr1VarArr3 = lr1Var2.X;
                    int i11 = this.V0;
                    hr1 hr1Var3 = hr1VarArr3[i11];
                    hr1Var3.i = q;
                    hr1 hr1Var4 = hr1Var3.f;
                    if (hr1Var4 != null && hr1Var4.d == this) {
                        i2 = hr1Var3.g;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != 2) {
                        gq5Var.g(hr1Var2.i, q, this.X0 + i2, z2);
                    } else {
                        gq5Var.i(hr1Var2.i, q, this.X0 - i2, z2);
                    }
                    gq5Var.e(hr1Var2.i, q, this.X0 + i2, i);
                }
            }
            int i12 = this.V0;
            if (i12 == 0) {
                gq5Var.e(this.R.i, this.P.i, 0, 8);
                gq5Var.e(this.P.i, this.b0.R.i, 0, 4);
                gq5Var.e(this.P.i, this.b0.P.i, 0, 0);
            } else if (i12 == 1) {
                gq5Var.e(this.P.i, this.R.i, 0, 8);
                gq5Var.e(this.P.i, this.b0.P.i, 0, 4);
                gq5Var.e(this.P.i, this.b0.R.i, 0, 0);
            } else if (i12 == 2) {
                gq5Var.e(this.S.i, this.Q.i, 0, 8);
                gq5Var.e(this.Q.i, this.b0.S.i, 0, 4);
                gq5Var.e(this.Q.i, this.b0.Q.i, 0, 0);
            } else if (i12 == 3) {
                gq5Var.e(this.Q.i, this.S.i, 0, 8);
                gq5Var.e(this.Q.i, this.b0.Q.i, 0, 4);
                gq5Var.e(this.Q.i, this.b0.S.i, 0, 0);
            }
        }
    }

    @Override // defpackage.lr1
    public boolean h() {
        return true;
    }

    @Override // defpackage.lr1
    public boolean l0() {
        return this.Y0;
    }

    @Override // defpackage.eo4, defpackage.lr1
    public void m(lr1 lr1Var, HashMap<lr1, lr1> hashMap) {
        super.m(lr1Var, hashMap);
        q60 q60Var = (q60) lr1Var;
        this.V0 = q60Var.V0;
        this.W0 = q60Var.W0;
        this.X0 = q60Var.X0;
    }

    @Override // defpackage.lr1
    public boolean m0() {
        return this.Y0;
    }

    public boolean o1() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.U0;
            if (i4 >= i) {
                break;
            }
            lr1 lr1Var = this.T0[i4];
            if ((this.W0 || lr1Var.h()) && ((((i2 = this.V0) == 0 || i2 == 1) && !lr1Var.l0()) || (((i3 = this.V0) == 2 || i3 == 3) && !lr1Var.m0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.U0; i6++) {
            lr1 lr1Var2 = this.T0[i6];
            if (this.W0 || lr1Var2.h()) {
                if (!z2) {
                    int i7 = this.V0;
                    if (i7 == 0) {
                        i5 = lr1Var2.p(hr1.b.LEFT).e();
                    } else if (i7 == 1) {
                        i5 = lr1Var2.p(hr1.b.RIGHT).e();
                    } else if (i7 == 2) {
                        i5 = lr1Var2.p(hr1.b.TOP).e();
                    } else if (i7 == 3) {
                        i5 = lr1Var2.p(hr1.b.BOTTOM).e();
                    }
                    z2 = true;
                }
                int i8 = this.V0;
                if (i8 == 0) {
                    i5 = Math.min(i5, lr1Var2.p(hr1.b.LEFT).e());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, lr1Var2.p(hr1.b.RIGHT).e());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, lr1Var2.p(hr1.b.TOP).e());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, lr1Var2.p(hr1.b.BOTTOM).e());
                }
            }
        }
        int i9 = i5 + this.X0;
        int i10 = this.V0;
        if (i10 != 0 && i10 != 1) {
            D0(i9, i9);
        } else {
            A0(i9, i9);
        }
        this.Y0 = true;
        return true;
    }

    public boolean p1() {
        return this.W0;
    }

    public int q1() {
        return this.V0;
    }

    public int r1() {
        return this.X0;
    }

    public int s1() {
        int i = this.V0;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t1() {
        for (int i = 0; i < this.U0; i++) {
            lr1 lr1Var = this.T0[i];
            if (this.W0 || lr1Var.h()) {
                int i2 = this.V0;
                if (i2 != 0 && i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        lr1Var.N0(1, true);
                    }
                } else {
                    lr1Var.N0(0, true);
                }
            }
        }
    }

    @Override // defpackage.lr1
    public String toString() {
        String str = "[Barrier] " + u() + " {";
        for (int i = 0; i < this.U0; i++) {
            lr1 lr1Var = this.T0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + lr1Var.u();
        }
        return str + "}";
    }

    public void u1(boolean z) {
        this.W0 = z;
    }

    public void v1(int i) {
        this.V0 = i;
    }

    public void w1(int i) {
        this.X0 = i;
    }
}
