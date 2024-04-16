package defpackage;

import defpackage.hr1;
import defpackage.lr1;
import java.util.HashMap;
/* compiled from: Guideline.java */
/* renamed from: vi4  reason: default package */
/* loaded from: classes.dex */
public class vi4 extends lr1 {
    protected float T0 = -1.0f;
    protected int U0 = -1;
    protected int V0 = -1;
    private hr1 W0 = this.Q;
    private int X0 = 0;
    private int Y0 = 0;
    private boolean Z0;

    /* compiled from: Guideline.java */
    /* renamed from: vi4$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[hr1.b.values().length];
            a = iArr;
            try {
                iArr[hr1.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[hr1.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[hr1.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[hr1.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[hr1.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[hr1.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[hr1.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[hr1.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[hr1.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public vi4() {
        this.Y.clear();
        this.Y.add(this.W0);
        int length = this.X.length;
        for (int i = 0; i < length; i++) {
            this.X[i] = this.W0;
        }
    }

    @Override // defpackage.lr1
    public void g(gq5 gq5Var, boolean z) {
        boolean z2;
        mr1 mr1Var = (mr1) L();
        if (mr1Var == null) {
            return;
        }
        hr1 p = mr1Var.p(hr1.b.LEFT);
        hr1 p2 = mr1Var.p(hr1.b.RIGHT);
        lr1 lr1Var = this.b0;
        boolean z3 = true;
        if (lr1Var != null && lr1Var.a0[0] == lr1.b.WRAP_CONTENT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.X0 == 0) {
            p = mr1Var.p(hr1.b.TOP);
            p2 = mr1Var.p(hr1.b.BOTTOM);
            lr1 lr1Var2 = this.b0;
            z2 = (lr1Var2 == null || lr1Var2.a0[1] != lr1.b.WRAP_CONTENT) ? false : false;
        }
        if (this.Z0 && this.W0.n()) {
            lqa q = gq5Var.q(this.W0);
            gq5Var.f(q, this.W0.e());
            if (this.U0 != -1) {
                if (z2) {
                    gq5Var.h(gq5Var.q(p2), q, 0, 5);
                }
            } else if (this.V0 != -1 && z2) {
                lqa q2 = gq5Var.q(p2);
                gq5Var.h(q, gq5Var.q(p), 0, 5);
                gq5Var.h(q2, q, 0, 5);
            }
            this.Z0 = false;
        } else if (this.U0 != -1) {
            lqa q3 = gq5Var.q(this.W0);
            gq5Var.e(q3, gq5Var.q(p), this.U0, 8);
            if (z2) {
                gq5Var.h(gq5Var.q(p2), q3, 0, 5);
            }
        } else if (this.V0 != -1) {
            lqa q4 = gq5Var.q(this.W0);
            lqa q5 = gq5Var.q(p2);
            gq5Var.e(q4, q5, -this.V0, 8);
            if (z2) {
                gq5Var.h(q4, gq5Var.q(p), 0, 5);
                gq5Var.h(q5, q4, 0, 5);
            }
        } else if (this.T0 != -1.0f) {
            gq5Var.d(gq5.s(gq5Var, gq5Var.q(this.W0), gq5Var.q(p2), this.T0));
        }
    }

    @Override // defpackage.lr1
    public boolean h() {
        return true;
    }

    @Override // defpackage.lr1
    public boolean l0() {
        return this.Z0;
    }

    @Override // defpackage.lr1
    public void l1(gq5 gq5Var, boolean z) {
        if (L() == null) {
            return;
        }
        int y = gq5Var.y(this.W0);
        if (this.X0 == 1) {
            h1(y);
            i1(0);
            G0(L().y());
            f1(0);
            return;
        }
        h1(0);
        i1(y);
        f1(L().U());
        G0(0);
    }

    @Override // defpackage.lr1
    public void m(lr1 lr1Var, HashMap<lr1, lr1> hashMap) {
        super.m(lr1Var, hashMap);
        vi4 vi4Var = (vi4) lr1Var;
        this.T0 = vi4Var.T0;
        this.U0 = vi4Var.U0;
        this.V0 = vi4Var.V0;
        v1(vi4Var.X0);
    }

    @Override // defpackage.lr1
    public boolean m0() {
        return this.Z0;
    }

    public hr1 m1() {
        return this.W0;
    }

    public int n1() {
        return this.X0;
    }

    public int o1() {
        return this.U0;
    }

    @Override // defpackage.lr1
    public hr1 p(hr1.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i != 1 && i != 2) {
            if ((i == 3 || i == 4) && this.X0 == 0) {
                return this.W0;
            }
            return null;
        } else if (this.X0 == 1) {
            return this.W0;
        } else {
            return null;
        }
    }

    public int p1() {
        return this.V0;
    }

    public float q1() {
        return this.T0;
    }

    public void r1(int i) {
        this.W0.t(i);
        this.Z0 = true;
    }

    public void s1(int i) {
        if (i > -1) {
            this.T0 = -1.0f;
            this.U0 = i;
            this.V0 = -1;
        }
    }

    public void t1(int i) {
        if (i > -1) {
            this.T0 = -1.0f;
            this.U0 = -1;
            this.V0 = i;
        }
    }

    public void u1(float f) {
        if (f > -1.0f) {
            this.T0 = f;
            this.U0 = -1;
            this.V0 = -1;
        }
    }

    public void v1(int i) {
        if (this.X0 == i) {
            return;
        }
        this.X0 = i;
        this.Y.clear();
        if (this.X0 == 1) {
            this.W0 = this.P;
        } else {
            this.W0 = this.Q;
        }
        this.Y.add(this.W0);
        int length = this.X.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.X[i2] = this.W0;
        }
    }
}
