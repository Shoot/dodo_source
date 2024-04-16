package defpackage;

import defpackage.jb3;
/* renamed from: wy9  reason: default package */
/* loaded from: classes3.dex */
public class wy9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public wy9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        dz9 dz9Var = (dz9) this.c;
        if (dz9Var.i()) {
            return i.u();
        }
        dz9 dz9Var2 = (dz9) this.b;
        dz9 dz9Var3 = (dz9) this.d[0];
        int[] d = vs6.d();
        cz9.m(dz9Var.g, d);
        int[] d2 = vs6.d();
        cz9.m(d, d2);
        int[] d3 = vs6.d();
        cz9.m(dz9Var2.g, d3);
        cz9.l(vs6.b(d3, d3, d3), d3);
        cz9.f(d, dz9Var2.g, d);
        cz9.l(et6.M(5, d, 2, 0), d);
        int[] d4 = vs6.d();
        cz9.l(et6.N(5, d2, 3, 0, d4), d4);
        dz9 dz9Var4 = new dz9(d2);
        cz9.m(d3, dz9Var4.g);
        int[] iArr = dz9Var4.g;
        cz9.o(iArr, d, iArr);
        int[] iArr2 = dz9Var4.g;
        cz9.o(iArr2, d, iArr2);
        dz9 dz9Var5 = new dz9(d);
        cz9.o(d, dz9Var4.g, dz9Var5.g);
        int[] iArr3 = dz9Var5.g;
        cz9.f(iArr3, d3, iArr3);
        int[] iArr4 = dz9Var5.g;
        cz9.o(iArr4, d4, iArr4);
        dz9 dz9Var6 = new dz9(d3);
        cz9.p(dz9Var.g, dz9Var6.g);
        if (!dz9Var3.h()) {
            int[] iArr5 = dz9Var6.g;
            cz9.f(iArr5, dz9Var3.g, iArr5);
        }
        return new wy9(i, dz9Var4, dz9Var5, new na3[]{dz9Var6});
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
        dz9 dz9Var = (dz9) this.b;
        dz9 dz9Var2 = (dz9) this.c;
        dz9 dz9Var3 = (dz9) jb3Var.q();
        dz9 dz9Var4 = (dz9) jb3Var.r();
        dz9 dz9Var5 = (dz9) this.d[0];
        dz9 dz9Var6 = (dz9) jb3Var.s(0);
        int[] e = vs6.e();
        int[] d = vs6.d();
        int[] d2 = vs6.d();
        int[] d3 = vs6.d();
        boolean h = dz9Var5.h();
        if (h) {
            iArr = dz9Var3.g;
            iArr2 = dz9Var4.g;
        } else {
            cz9.m(dz9Var5.g, d2);
            cz9.f(d2, dz9Var3.g, d);
            cz9.f(d2, dz9Var5.g, d2);
            cz9.f(d2, dz9Var4.g, d2);
            iArr = d;
            iArr2 = d2;
        }
        boolean h2 = dz9Var6.h();
        if (h2) {
            iArr3 = dz9Var.g;
            iArr4 = dz9Var2.g;
        } else {
            cz9.m(dz9Var6.g, d3);
            cz9.f(d3, dz9Var.g, e);
            cz9.f(d3, dz9Var6.g, d3);
            cz9.f(d3, dz9Var2.g, d3);
            iArr3 = e;
            iArr4 = d3;
        }
        int[] d4 = vs6.d();
        cz9.o(iArr3, iArr, d4);
        cz9.o(iArr4, iArr2, d);
        if (vs6.k(d4)) {
            if (vs6.k(d)) {
                return J();
            }
            return i.u();
        }
        cz9.m(d4, d2);
        int[] d5 = vs6.d();
        cz9.f(d2, d4, d5);
        cz9.f(d2, iArr3, d2);
        cz9.h(d5, d5);
        vs6.l(iArr4, d5, e);
        cz9.l(vs6.b(d2, d2, d5), d5);
        dz9 dz9Var7 = new dz9(d3);
        cz9.m(d, dz9Var7.g);
        int[] iArr5 = dz9Var7.g;
        cz9.o(iArr5, d5, iArr5);
        dz9 dz9Var8 = new dz9(d5);
        cz9.o(d2, dz9Var7.g, dz9Var8.g);
        cz9.g(dz9Var8.g, d, e);
        cz9.k(e, dz9Var8.g);
        dz9 dz9Var9 = new dz9(d4);
        if (!h) {
            int[] iArr6 = dz9Var9.g;
            cz9.f(iArr6, dz9Var5.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = dz9Var9.g;
            cz9.f(iArr7, dz9Var6.g, iArr7);
        }
        return new wy9(i, dz9Var7, dz9Var8, new na3[]{dz9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new wy9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new wy9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public wy9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
