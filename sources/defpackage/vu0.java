package defpackage;

import defpackage.lr1;
import java.util.ArrayList;
/* compiled from: ChainHead.java */
/* renamed from: vu0  reason: default package */
/* loaded from: classes.dex */
public class vu0 {
    protected lr1 a;
    protected lr1 b;
    protected lr1 c;
    protected lr1 d;
    protected lr1 e;
    protected lr1 f;
    protected lr1 g;
    protected ArrayList<lr1> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public vu0(lr1 lr1Var, int i, boolean z) {
        this.a = lr1Var;
        this.p = i;
        this.q = z;
    }

    private void b() {
        int i = this.p * 2;
        lr1 lr1Var = this.a;
        boolean z = true;
        this.o = true;
        lr1 lr1Var2 = lr1Var;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            lr1[] lr1VarArr = lr1Var.N0;
            int i2 = this.p;
            lr1 lr1Var3 = null;
            lr1VarArr[i2] = null;
            lr1Var.M0[i2] = null;
            if (lr1Var.T() != 8) {
                this.l++;
                lr1.b v = lr1Var.v(this.p);
                lr1.b bVar = lr1.b.MATCH_CONSTRAINT;
                if (v != bVar) {
                    this.m += lr1Var.F(this.p);
                }
                int f = this.m + lr1Var.X[i].f();
                this.m = f;
                int i3 = i + 1;
                this.m = f + lr1Var.X[i3].f();
                int f2 = this.n + lr1Var.X[i].f();
                this.n = f2;
                this.n = f2 + lr1Var.X[i3].f();
                if (this.b == null) {
                    this.b = lr1Var;
                }
                this.d = lr1Var;
                lr1.b[] bVarArr = lr1Var.a0;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int i5 = lr1Var.x[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f3 = lr1Var.L0[i4];
                        if (f3 > 0.0f) {
                            this.k += f3;
                        }
                        if (c(lr1Var, i4)) {
                            if (f3 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(lr1Var);
                        }
                        if (this.f == null) {
                            this.f = lr1Var;
                        }
                        lr1 lr1Var4 = this.g;
                        if (lr1Var4 != null) {
                            lr1Var4.M0[this.p] = lr1Var;
                        }
                        this.g = lr1Var;
                    }
                    if (this.p == 0) {
                        if (lr1Var.v != 0) {
                            this.o = false;
                        } else if (lr1Var.y != 0 || lr1Var.z != 0) {
                            this.o = false;
                        }
                    } else if (lr1Var.w != 0) {
                        this.o = false;
                    } else if (lr1Var.B != 0 || lr1Var.C != 0) {
                        this.o = false;
                    }
                    if (lr1Var.e0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (lr1Var2 != lr1Var) {
                lr1Var2.N0[this.p] = lr1Var;
            }
            hr1 hr1Var = lr1Var.X[i + 1].f;
            if (hr1Var != null) {
                lr1 lr1Var5 = hr1Var.d;
                hr1 hr1Var2 = lr1Var5.X[i].f;
                if (hr1Var2 != null && hr1Var2.d == lr1Var) {
                    lr1Var3 = lr1Var5;
                }
            }
            if (lr1Var3 == null) {
                lr1Var3 = lr1Var;
                z2 = true;
            }
            lr1Var2 = lr1Var;
            lr1Var = lr1Var3;
        }
        lr1 lr1Var6 = this.b;
        if (lr1Var6 != null) {
            this.m -= lr1Var6.X[i].f();
        }
        lr1 lr1Var7 = this.d;
        if (lr1Var7 != null) {
            this.m -= lr1Var7.X[i + 1].f();
        }
        this.c = lr1Var;
        if (this.p == 0 && this.q) {
            this.e = lr1Var;
        } else {
            this.e = this.a;
        }
        this.t = (this.s && this.r) ? false : false;
    }

    private static boolean c(lr1 lr1Var, int i) {
        int i2;
        if (lr1Var.T() != 8 && lr1Var.a0[i] == lr1.b.MATCH_CONSTRAINT && ((i2 = lr1Var.x[i]) == 0 || i2 == 3)) {
            return true;
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}
