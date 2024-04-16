package defpackage;

import defpackage.jb3;
/* renamed from: k0a  reason: default package */
/* loaded from: classes3.dex */
public class k0a extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k0a(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        j0a j0aVar = (j0a) this.c;
        if (j0aVar.i()) {
            return i.u();
        }
        j0a j0aVar2 = (j0a) this.b;
        j0a j0aVar3 = (j0a) this.d[0];
        int[] k = et6.k(17);
        int[] k2 = et6.k(17);
        int[] k3 = et6.k(17);
        i0a.n(j0aVar.g, k3);
        int[] k4 = et6.k(17);
        i0a.n(k3, k4);
        boolean h = j0aVar3.h();
        int[] iArr = j0aVar3.g;
        if (!h) {
            i0a.n(iArr, k2);
            iArr = k2;
        }
        i0a.p(j0aVar2.g, iArr, k);
        i0a.a(j0aVar2.g, iArr, k2);
        i0a.h(k2, k, k2);
        et6.c(17, k2, k2, k2);
        i0a.m(k2);
        i0a.h(k3, j0aVar2.g, k3);
        et6.M(17, k3, 2, 0);
        i0a.m(k3);
        et6.N(17, k4, 3, 0, k);
        i0a.m(k);
        j0a j0aVar4 = new j0a(k4);
        i0a.n(k2, j0aVar4.g);
        int[] iArr2 = j0aVar4.g;
        i0a.p(iArr2, k3, iArr2);
        int[] iArr3 = j0aVar4.g;
        i0a.p(iArr3, k3, iArr3);
        j0a j0aVar5 = new j0a(k3);
        i0a.p(k3, j0aVar4.g, j0aVar5.g);
        int[] iArr4 = j0aVar5.g;
        i0a.h(iArr4, k2, iArr4);
        int[] iArr5 = j0aVar5.g;
        i0a.p(iArr5, k, iArr5);
        j0a j0aVar6 = new j0a(k2);
        i0a.q(j0aVar.g, j0aVar6.g);
        if (!h) {
            int[] iArr6 = j0aVar6.g;
            i0a.h(iArr6, j0aVar3.g, iArr6);
        }
        return new k0a(i, j0aVar4, j0aVar5, new na3[]{j0aVar6});
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
        j0a j0aVar = (j0a) this.b;
        j0a j0aVar2 = (j0a) this.c;
        j0a j0aVar3 = (j0a) jb3Var.q();
        j0a j0aVar4 = (j0a) jb3Var.r();
        j0a j0aVar5 = (j0a) this.d[0];
        j0a j0aVar6 = (j0a) jb3Var.s(0);
        int[] k = et6.k(17);
        int[] k2 = et6.k(17);
        int[] k3 = et6.k(17);
        int[] k4 = et6.k(17);
        boolean h = j0aVar5.h();
        if (h) {
            iArr = j0aVar3.g;
            iArr2 = j0aVar4.g;
        } else {
            i0a.n(j0aVar5.g, k3);
            i0a.h(k3, j0aVar3.g, k2);
            i0a.h(k3, j0aVar5.g, k3);
            i0a.h(k3, j0aVar4.g, k3);
            iArr = k2;
            iArr2 = k3;
        }
        boolean h2 = j0aVar6.h();
        if (h2) {
            iArr3 = j0aVar.g;
            iArr4 = j0aVar2.g;
        } else {
            i0a.n(j0aVar6.g, k4);
            i0a.h(k4, j0aVar.g, k);
            i0a.h(k4, j0aVar6.g, k4);
            i0a.h(k4, j0aVar2.g, k4);
            iArr3 = k;
            iArr4 = k4;
        }
        int[] k5 = et6.k(17);
        i0a.p(iArr3, iArr, k5);
        i0a.p(iArr4, iArr2, k2);
        if (et6.A(17, k5)) {
            if (et6.A(17, k2)) {
                return J();
            }
            return i.u();
        }
        i0a.n(k5, k3);
        int[] k6 = et6.k(17);
        i0a.h(k3, k5, k6);
        i0a.h(k3, iArr3, k3);
        i0a.h(iArr4, k6, k);
        j0a j0aVar7 = new j0a(k4);
        i0a.n(k2, j0aVar7.g);
        int[] iArr5 = j0aVar7.g;
        i0a.a(iArr5, k6, iArr5);
        int[] iArr6 = j0aVar7.g;
        i0a.p(iArr6, k3, iArr6);
        int[] iArr7 = j0aVar7.g;
        i0a.p(iArr7, k3, iArr7);
        j0a j0aVar8 = new j0a(k6);
        i0a.p(k3, j0aVar7.g, j0aVar8.g);
        i0a.h(j0aVar8.g, k2, k2);
        i0a.p(k2, k, j0aVar8.g);
        j0a j0aVar9 = new j0a(k5);
        if (!h) {
            int[] iArr8 = j0aVar9.g;
            i0a.h(iArr8, j0aVar5.g, iArr8);
        }
        if (!h2) {
            int[] iArr9 = j0aVar9.g;
            i0a.h(iArr9, j0aVar6.g, iArr9);
        }
        return new k0a(i, j0aVar7, j0aVar8, new na3[]{j0aVar9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new k0a(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new k0a(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0a(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
