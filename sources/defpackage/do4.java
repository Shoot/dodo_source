package defpackage;

import defpackage.i03;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelperReferences.java */
/* renamed from: do4  reason: default package */
/* loaded from: classes.dex */
public class do4 extends t4c {
    public do4(lr1 lr1Var) {
        super(lr1Var);
    }

    private void q(i03 i03Var) {
        this.h.k.add(i03Var);
        i03Var.l.add(this.h);
    }

    @Override // defpackage.t4c, defpackage.e03
    public void a(e03 e03Var) {
        q60 q60Var = (q60) this.b;
        int q1 = q60Var.q1();
        int i = 0;
        int i2 = -1;
        for (i03 i03Var : this.h.l) {
            int i3 = i03Var.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (q1 != 0 && q1 != 2) {
            this.h.d(i + q60Var.r1());
        } else {
            this.h.d(i2 + q60Var.r1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void d() {
        lr1 lr1Var = this.b;
        if (lr1Var instanceof q60) {
            this.h.b = true;
            q60 q60Var = (q60) lr1Var;
            int q1 = q60Var.q1();
            boolean p1 = q60Var.p1();
            int i = 0;
            if (q1 != 0) {
                if (q1 != 1) {
                    if (q1 != 2) {
                        if (q1 == 3) {
                            this.h.e = i03.a.BOTTOM;
                            while (i < q60Var.U0) {
                                lr1 lr1Var2 = q60Var.T0[i];
                                if (p1 || lr1Var2.T() != 8) {
                                    i03 i03Var = lr1Var2.f.i;
                                    i03Var.k.add(this.h);
                                    this.h.l.add(i03Var);
                                }
                                i++;
                            }
                            q(this.b.f.h);
                            q(this.b.f.i);
                            return;
                        }
                        return;
                    }
                    this.h.e = i03.a.TOP;
                    while (i < q60Var.U0) {
                        lr1 lr1Var3 = q60Var.T0[i];
                        if (p1 || lr1Var3.T() != 8) {
                            i03 i03Var2 = lr1Var3.f.h;
                            i03Var2.k.add(this.h);
                            this.h.l.add(i03Var2);
                        }
                        i++;
                    }
                    q(this.b.f.h);
                    q(this.b.f.i);
                    return;
                }
                this.h.e = i03.a.RIGHT;
                while (i < q60Var.U0) {
                    lr1 lr1Var4 = q60Var.T0[i];
                    if (p1 || lr1Var4.T() != 8) {
                        i03 i03Var3 = lr1Var4.e.i;
                        i03Var3.k.add(this.h);
                        this.h.l.add(i03Var3);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            this.h.e = i03.a.LEFT;
            while (i < q60Var.U0) {
                lr1 lr1Var5 = q60Var.T0[i];
                if (p1 || lr1Var5.T() != 8) {
                    i03 i03Var4 = lr1Var5.e.h;
                    i03Var4.k.add(this.h);
                    this.h.l.add(i03Var4);
                }
                i++;
            }
            q(this.b.e.h);
            q(this.b.e.i);
        }
    }

    @Override // defpackage.t4c
    public void e() {
        lr1 lr1Var = this.b;
        if (lr1Var instanceof q60) {
            int q1 = ((q60) lr1Var).q1();
            if (q1 != 0 && q1 != 1) {
                this.b.i1(this.h.g);
            } else {
                this.b.h1(this.h.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void f() {
        this.c = null;
        this.h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public boolean m() {
        return false;
    }
}
