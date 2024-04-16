package defpackage;

import defpackage.jb3;
/* renamed from: g0a  reason: default package */
/* loaded from: classes3.dex */
public class g0a extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g0a(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
        super(ea3Var, na3Var, na3Var2);
    }

    @Override // defpackage.jb3
    public jb3 H() {
        if (!u() && !this.c.i()) {
            return J().a(this);
        }
        return this;
    }

    @Override // defpackage.jb3
    public jb3 J() {
        if (u()) {
            return this;
        }
        ea3 i = i();
        f0a f0aVar = (f0a) this.c;
        if (f0aVar.i()) {
            return i.u();
        }
        f0a f0aVar2 = (f0a) this.b;
        f0a f0aVar3 = (f0a) this.d[0];
        int[] k = et6.k(12);
        int[] k2 = et6.k(12);
        int[] k3 = et6.k(12);
        e0a.n(f0aVar.g, k3);
        int[] k4 = et6.k(12);
        e0a.n(k3, k4);
        boolean h = f0aVar3.h();
        int[] iArr = f0aVar3.g;
        if (!h) {
            e0a.n(iArr, k2);
            iArr = k2;
        }
        e0a.q(f0aVar2.g, iArr, k);
        e0a.a(f0aVar2.g, iArr, k2);
        e0a.h(k2, k, k2);
        e0a.m(et6.c(12, k2, k2, k2), k2);
        e0a.h(k3, f0aVar2.g, k3);
        e0a.m(et6.M(12, k3, 2, 0), k3);
        e0a.m(et6.N(12, k4, 3, 0, k), k);
        f0a f0aVar4 = new f0a(k4);
        e0a.n(k2, f0aVar4.g);
        int[] iArr2 = f0aVar4.g;
        e0a.q(iArr2, k3, iArr2);
        int[] iArr3 = f0aVar4.g;
        e0a.q(iArr3, k3, iArr3);
        f0a f0aVar5 = new f0a(k3);
        e0a.q(k3, f0aVar4.g, f0aVar5.g);
        int[] iArr4 = f0aVar5.g;
        e0a.h(iArr4, k2, iArr4);
        int[] iArr5 = f0aVar5.g;
        e0a.q(iArr5, k, iArr5);
        f0a f0aVar6 = new f0a(k2);
        e0a.r(f0aVar.g, f0aVar6.g);
        if (!h) {
            int[] iArr6 = f0aVar6.g;
            e0a.h(iArr6, f0aVar3.g, iArr6);
        }
        return new g0a(i, f0aVar4, f0aVar5, new na3[]{f0aVar6});
    }

    @Override // defpackage.jb3
    public jb3 K(jb3 jb3Var) {
        if (this == jb3Var) {
            return H();
        }
        if (u()) {
            return jb3Var;
        }
        if (jb3Var.u()) {
            return J();
        }
        if (this.c.i()) {
            return jb3Var;
        }
        return J().a(jb3Var);
    }

    @Override // defpackage.jb3
    public jb3 a(jb3 jb3Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (u()) {
            return jb3Var;
        }
        if (jb3Var.u()) {
            return this;
        }
        if (this == jb3Var) {
            return J();
        }
        ea3 i = i();
        f0a f0aVar = (f0a) this.b;
        f0a f0aVar2 = (f0a) this.c;
        f0a f0aVar3 = (f0a) jb3Var.q();
        f0a f0aVar4 = (f0a) jb3Var.r();
        f0a f0aVar5 = (f0a) this.d[0];
        f0a f0aVar6 = (f0a) jb3Var.s(0);
        int[] k = et6.k(24);
        int[] k2 = et6.k(24);
        int[] k3 = et6.k(12);
        int[] k4 = et6.k(12);
        boolean h = f0aVar5.h();
        if (h) {
            iArr = f0aVar3.g;
            iArr2 = f0aVar4.g;
        } else {
            e0a.n(f0aVar5.g, k3);
            e0a.h(k3, f0aVar3.g, k2);
            e0a.h(k3, f0aVar5.g, k3);
            e0a.h(k3, f0aVar4.g, k3);
            iArr = k2;
            iArr2 = k3;
        }
        boolean h2 = f0aVar6.h();
        if (h2) {
            iArr3 = f0aVar.g;
            iArr4 = f0aVar2.g;
        } else {
            e0a.n(f0aVar6.g, k4);
            e0a.h(k4, f0aVar.g, k);
            e0a.h(k4, f0aVar6.g, k4);
            e0a.h(k4, f0aVar2.g, k4);
            iArr3 = k;
            iArr4 = k4;
        }
        int[] k5 = et6.k(12);
        e0a.q(iArr3, iArr, k5);
        int[] k6 = et6.k(12);
        e0a.q(iArr4, iArr2, k6);
        if (et6.A(12, k5)) {
            if (et6.A(12, k6)) {
                return J();
            }
            return i.u();
        }
        e0a.n(k5, k3);
        int[] k7 = et6.k(12);
        e0a.h(k3, k5, k7);
        e0a.h(k3, iArr3, k3);
        e0a.i(k7, k7);
        at6.a(iArr4, k7, k);
        e0a.m(et6.c(12, k3, k3, k7), k7);
        f0a f0aVar7 = new f0a(k4);
        e0a.n(k6, f0aVar7.g);
        int[] iArr5 = f0aVar7.g;
        e0a.q(iArr5, k7, iArr5);
        f0a f0aVar8 = new f0a(k7);
        e0a.q(k3, f0aVar7.g, f0aVar8.g);
        at6.a(f0aVar8.g, k6, k2);
        e0a.b(k, k2, k);
        e0a.l(k, f0aVar8.g);
        f0a f0aVar9 = new f0a(k5);
        if (!h) {
            int[] iArr6 = f0aVar9.g;
            e0a.h(iArr6, f0aVar5.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = f0aVar9.g;
            e0a.h(iArr7, f0aVar6.g, iArr7);
        }
        return new g0a(i, f0aVar7, f0aVar8, new na3[]{f0aVar9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new g0a(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new g0a(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0a(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
