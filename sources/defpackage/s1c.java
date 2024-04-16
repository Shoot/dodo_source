package defpackage;

import defpackage.lr1;
import defpackage.m90;
import java.util.HashSet;
/* compiled from: VirtualLayout.java */
/* renamed from: s1c  reason: default package */
/* loaded from: classes.dex */
public class s1c extends eo4 {
    private int V0 = 0;
    private int W0 = 0;
    private int X0 = 0;
    private int Y0 = 0;
    private int Z0 = 0;
    private int a1 = 0;
    private int b1 = 0;
    private int c1 = 0;
    private boolean d1 = false;
    private int e1 = 0;
    private int f1 = 0;
    protected m90.a g1 = new m90.a();
    m90.b h1 = null;

    public boolean A1() {
        return this.d1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B1(boolean z) {
        this.d1 = z;
    }

    public void C1(int i, int i2) {
        this.e1 = i;
        this.f1 = i2;
    }

    public void D1(int i) {
        this.X0 = i;
        this.V0 = i;
        this.Y0 = i;
        this.W0 = i;
        this.Z0 = i;
        this.a1 = i;
    }

    public void E1(int i) {
        this.W0 = i;
    }

    public void F1(int i) {
        this.a1 = i;
    }

    public void G1(int i) {
        this.X0 = i;
        this.b1 = i;
    }

    public void H1(int i) {
        this.Y0 = i;
        this.c1 = i;
    }

    public void I1(int i) {
        this.Z0 = i;
        this.b1 = i;
        this.c1 = i;
    }

    public void J1(int i) {
        this.V0 = i;
    }

    @Override // defpackage.eo4, defpackage.co4
    public void a(mr1 mr1Var) {
        p1();
    }

    public void o1(boolean z) {
        int i = this.Z0;
        if (i > 0 || this.a1 > 0) {
            if (z) {
                this.b1 = this.a1;
                this.c1 = i;
                return;
            }
            this.b1 = i;
            this.c1 = this.a1;
        }
    }

    public void p1() {
        for (int i = 0; i < this.U0; i++) {
            lr1 lr1Var = this.T0[i];
            if (lr1Var != null) {
                lr1Var.P0(true);
            }
        }
    }

    public boolean q1(HashSet<lr1> hashSet) {
        for (int i = 0; i < this.U0; i++) {
            if (hashSet.contains(this.T0[i])) {
                return true;
            }
        }
        return false;
    }

    public int r1() {
        return this.f1;
    }

    public int s1() {
        return this.e1;
    }

    public int t1() {
        return this.W0;
    }

    public int u1() {
        return this.b1;
    }

    public int v1() {
        return this.c1;
    }

    public int w1() {
        return this.V0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y1(lr1 lr1Var, lr1.b bVar, int i, lr1.b bVar2, int i2) {
        while (this.h1 == null && L() != null) {
            this.h1 = ((mr1) L()).E1();
        }
        m90.a aVar = this.g1;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.h1.b(lr1Var, aVar);
        lr1Var.f1(this.g1.e);
        lr1Var.G0(this.g1.f);
        lr1Var.F0(this.g1.h);
        lr1Var.v0(this.g1.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean z1() {
        m90.b bVar;
        lr1 lr1Var = this.b0;
        if (lr1Var != null) {
            bVar = ((mr1) lr1Var).E1();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        for (int i = 0; i < this.U0; i++) {
            lr1 lr1Var2 = this.T0[i];
            if (lr1Var2 != null && !(lr1Var2 instanceof vi4)) {
                lr1.b v = lr1Var2.v(0);
                lr1.b v2 = lr1Var2.v(1);
                lr1.b bVar2 = lr1.b.MATCH_CONSTRAINT;
                if (v != bVar2 || lr1Var2.v == 1 || v2 != bVar2 || lr1Var2.w == 1) {
                    if (v == bVar2) {
                        v = lr1.b.WRAP_CONTENT;
                    }
                    if (v2 == bVar2) {
                        v2 = lr1.b.WRAP_CONTENT;
                    }
                    m90.a aVar = this.g1;
                    aVar.a = v;
                    aVar.b = v2;
                    aVar.c = lr1Var2.U();
                    this.g1.d = lr1Var2.y();
                    bVar.b(lr1Var2, this.g1);
                    lr1Var2.f1(this.g1.e);
                    lr1Var2.G0(this.g1.f);
                    lr1Var2.v0(this.g1.g);
                }
            }
        }
        return true;
    }

    public void x1(int i, int i2, int i3, int i4) {
    }
}
