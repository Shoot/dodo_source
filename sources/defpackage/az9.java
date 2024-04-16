package defpackage;

import defpackage.jb3;
/* renamed from: az9  reason: default package */
/* loaded from: classes3.dex */
public class az9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public az9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        zy9 zy9Var = (zy9) this.c;
        if (zy9Var.i()) {
            return i.u();
        }
        zy9 zy9Var2 = (zy9) this.b;
        zy9 zy9Var3 = (zy9) this.d[0];
        int[] d = vs6.d();
        int[] d2 = vs6.d();
        int[] d3 = vs6.d();
        yy9.m(zy9Var.g, d3);
        int[] d4 = vs6.d();
        yy9.m(d3, d4);
        boolean h = zy9Var3.h();
        int[] iArr = zy9Var3.g;
        if (!h) {
            yy9.m(iArr, d2);
            iArr = d2;
        }
        yy9.o(zy9Var2.g, iArr, d);
        yy9.a(zy9Var2.g, iArr, d2);
        yy9.f(d2, d, d2);
        yy9.l(vs6.b(d2, d2, d2), d2);
        yy9.f(d3, zy9Var2.g, d3);
        yy9.l(et6.M(5, d3, 2, 0), d3);
        yy9.l(et6.N(5, d4, 3, 0, d), d);
        zy9 zy9Var4 = new zy9(d4);
        yy9.m(d2, zy9Var4.g);
        int[] iArr2 = zy9Var4.g;
        yy9.o(iArr2, d3, iArr2);
        int[] iArr3 = zy9Var4.g;
        yy9.o(iArr3, d3, iArr3);
        zy9 zy9Var5 = new zy9(d3);
        yy9.o(d3, zy9Var4.g, zy9Var5.g);
        int[] iArr4 = zy9Var5.g;
        yy9.f(iArr4, d2, iArr4);
        int[] iArr5 = zy9Var5.g;
        yy9.o(iArr5, d, iArr5);
        zy9 zy9Var6 = new zy9(d2);
        yy9.p(zy9Var.g, zy9Var6.g);
        if (!h) {
            int[] iArr6 = zy9Var6.g;
            yy9.f(iArr6, zy9Var3.g, iArr6);
        }
        return new az9(i, zy9Var4, zy9Var5, new na3[]{zy9Var6});
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
        zy9 zy9Var = (zy9) this.b;
        zy9 zy9Var2 = (zy9) this.c;
        zy9 zy9Var3 = (zy9) jb3Var.q();
        zy9 zy9Var4 = (zy9) jb3Var.r();
        zy9 zy9Var5 = (zy9) this.d[0];
        zy9 zy9Var6 = (zy9) jb3Var.s(0);
        int[] e = vs6.e();
        int[] d = vs6.d();
        int[] d2 = vs6.d();
        int[] d3 = vs6.d();
        boolean h = zy9Var5.h();
        if (h) {
            iArr = zy9Var3.g;
            iArr2 = zy9Var4.g;
        } else {
            yy9.m(zy9Var5.g, d2);
            yy9.f(d2, zy9Var3.g, d);
            yy9.f(d2, zy9Var5.g, d2);
            yy9.f(d2, zy9Var4.g, d2);
            iArr = d;
            iArr2 = d2;
        }
        boolean h2 = zy9Var6.h();
        if (h2) {
            iArr3 = zy9Var.g;
            iArr4 = zy9Var2.g;
        } else {
            yy9.m(zy9Var6.g, d3);
            yy9.f(d3, zy9Var.g, e);
            yy9.f(d3, zy9Var6.g, d3);
            yy9.f(d3, zy9Var2.g, d3);
            iArr3 = e;
            iArr4 = d3;
        }
        int[] d4 = vs6.d();
        yy9.o(iArr3, iArr, d4);
        yy9.o(iArr4, iArr2, d);
        if (vs6.k(d4)) {
            if (vs6.k(d)) {
                return J();
            }
            return i.u();
        }
        yy9.m(d4, d2);
        int[] d5 = vs6.d();
        yy9.f(d2, d4, d5);
        yy9.f(d2, iArr3, d2);
        yy9.h(d5, d5);
        vs6.l(iArr4, d5, e);
        yy9.l(vs6.b(d2, d2, d5), d5);
        zy9 zy9Var7 = new zy9(d3);
        yy9.m(d, zy9Var7.g);
        int[] iArr5 = zy9Var7.g;
        yy9.o(iArr5, d5, iArr5);
        zy9 zy9Var8 = new zy9(d5);
        yy9.o(d2, zy9Var7.g, zy9Var8.g);
        yy9.g(zy9Var8.g, d, e);
        yy9.k(e, zy9Var8.g);
        zy9 zy9Var9 = new zy9(d4);
        if (!h) {
            int[] iArr6 = zy9Var9.g;
            yy9.f(iArr6, zy9Var5.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = zy9Var9.g;
            yy9.f(iArr7, zy9Var6.g, iArr7);
        }
        return new az9(i, zy9Var7, zy9Var8, new na3[]{zy9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new az9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new az9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public az9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
