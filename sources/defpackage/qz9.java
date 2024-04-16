package defpackage;

import defpackage.jb3;
/* renamed from: qz9  reason: default package */
/* loaded from: classes3.dex */
public class qz9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public qz9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        pz9 pz9Var = (pz9) this.c;
        if (pz9Var.i()) {
            return i.u();
        }
        pz9 pz9Var2 = (pz9) this.b;
        pz9 pz9Var3 = (pz9) this.d[0];
        int[] e = xs6.e();
        oz9.m(pz9Var.g, e);
        int[] e2 = xs6.e();
        oz9.m(e, e2);
        int[] e3 = xs6.e();
        oz9.m(pz9Var2.g, e3);
        oz9.l(xs6.b(e3, e3, e3), e3);
        oz9.f(e, pz9Var2.g, e);
        oz9.l(et6.M(7, e, 2, 0), e);
        int[] e4 = xs6.e();
        oz9.l(et6.N(7, e2, 3, 0, e4), e4);
        pz9 pz9Var4 = new pz9(e2);
        oz9.m(e3, pz9Var4.g);
        int[] iArr = pz9Var4.g;
        oz9.o(iArr, e, iArr);
        int[] iArr2 = pz9Var4.g;
        oz9.o(iArr2, e, iArr2);
        pz9 pz9Var5 = new pz9(e);
        oz9.o(e, pz9Var4.g, pz9Var5.g);
        int[] iArr3 = pz9Var5.g;
        oz9.f(iArr3, e3, iArr3);
        int[] iArr4 = pz9Var5.g;
        oz9.o(iArr4, e4, iArr4);
        pz9 pz9Var6 = new pz9(e3);
        oz9.p(pz9Var.g, pz9Var6.g);
        if (!pz9Var3.h()) {
            int[] iArr5 = pz9Var6.g;
            oz9.f(iArr5, pz9Var3.g, iArr5);
        }
        return new qz9(i, pz9Var4, pz9Var5, new na3[]{pz9Var6});
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
        pz9 pz9Var = (pz9) this.b;
        pz9 pz9Var2 = (pz9) this.c;
        pz9 pz9Var3 = (pz9) jb3Var.q();
        pz9 pz9Var4 = (pz9) jb3Var.r();
        pz9 pz9Var5 = (pz9) this.d[0];
        pz9 pz9Var6 = (pz9) jb3Var.s(0);
        int[] f = xs6.f();
        int[] e = xs6.e();
        int[] e2 = xs6.e();
        int[] e3 = xs6.e();
        boolean h = pz9Var5.h();
        if (h) {
            iArr = pz9Var3.g;
            iArr2 = pz9Var4.g;
        } else {
            oz9.m(pz9Var5.g, e2);
            oz9.f(e2, pz9Var3.g, e);
            oz9.f(e2, pz9Var5.g, e2);
            oz9.f(e2, pz9Var4.g, e2);
            iArr = e;
            iArr2 = e2;
        }
        boolean h2 = pz9Var6.h();
        if (h2) {
            iArr3 = pz9Var.g;
            iArr4 = pz9Var2.g;
        } else {
            oz9.m(pz9Var6.g, e3);
            oz9.f(e3, pz9Var.g, f);
            oz9.f(e3, pz9Var6.g, e3);
            oz9.f(e3, pz9Var2.g, e3);
            iArr3 = f;
            iArr4 = e3;
        }
        int[] e4 = xs6.e();
        oz9.o(iArr3, iArr, e4);
        oz9.o(iArr4, iArr2, e);
        if (xs6.l(e4)) {
            if (xs6.l(e)) {
                return J();
            }
            return i.u();
        }
        oz9.m(e4, e2);
        int[] e5 = xs6.e();
        oz9.f(e2, e4, e5);
        oz9.f(e2, iArr3, e2);
        oz9.h(e5, e5);
        xs6.m(iArr4, e5, f);
        oz9.l(xs6.b(e2, e2, e5), e5);
        pz9 pz9Var7 = new pz9(e3);
        oz9.m(e, pz9Var7.g);
        int[] iArr5 = pz9Var7.g;
        oz9.o(iArr5, e5, iArr5);
        pz9 pz9Var8 = new pz9(e5);
        oz9.o(e2, pz9Var7.g, pz9Var8.g);
        oz9.g(pz9Var8.g, e, f);
        oz9.k(f, pz9Var8.g);
        pz9 pz9Var9 = new pz9(e4);
        if (!h) {
            int[] iArr6 = pz9Var9.g;
            oz9.f(iArr6, pz9Var5.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = pz9Var9.g;
            oz9.f(iArr7, pz9Var6.g, iArr7);
        }
        return new qz9(i, pz9Var7, pz9Var8, new na3[]{pz9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new qz9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new qz9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qz9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
