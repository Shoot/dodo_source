package defpackage;

import defpackage.jb3;
/* renamed from: mz9  reason: default package */
/* loaded from: classes3.dex */
public class mz9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mz9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        lz9 lz9Var = (lz9) this.c;
        if (lz9Var.i()) {
            return i.u();
        }
        lz9 lz9Var2 = (lz9) this.b;
        lz9 lz9Var3 = (lz9) this.d[0];
        int[] h = ws6.h();
        int[] h2 = ws6.h();
        int[] h3 = ws6.h();
        kz9.n(lz9Var.g, h3);
        int[] h4 = ws6.h();
        kz9.n(h3, h4);
        boolean h5 = lz9Var3.h();
        int[] iArr = lz9Var3.g;
        if (!h5) {
            kz9.n(iArr, h2);
            iArr = h2;
        }
        kz9.q(lz9Var2.g, iArr, h);
        kz9.a(lz9Var2.g, iArr, h2);
        kz9.g(h2, h, h2);
        kz9.m(ws6.b(h2, h2, h2), h2);
        kz9.g(h3, lz9Var2.g, h3);
        kz9.m(et6.M(6, h3, 2, 0), h3);
        kz9.m(et6.N(6, h4, 3, 0, h), h);
        lz9 lz9Var4 = new lz9(h4);
        kz9.n(h2, lz9Var4.g);
        int[] iArr2 = lz9Var4.g;
        kz9.q(iArr2, h3, iArr2);
        int[] iArr3 = lz9Var4.g;
        kz9.q(iArr3, h3, iArr3);
        lz9 lz9Var5 = new lz9(h3);
        kz9.q(h3, lz9Var4.g, lz9Var5.g);
        int[] iArr4 = lz9Var5.g;
        kz9.g(iArr4, h2, iArr4);
        int[] iArr5 = lz9Var5.g;
        kz9.q(iArr5, h, iArr5);
        lz9 lz9Var6 = new lz9(h2);
        kz9.r(lz9Var.g, lz9Var6.g);
        if (!h5) {
            int[] iArr6 = lz9Var6.g;
            kz9.g(iArr6, lz9Var3.g, iArr6);
        }
        return new mz9(i, lz9Var4, lz9Var5, new na3[]{lz9Var6});
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
        lz9 lz9Var = (lz9) this.b;
        lz9 lz9Var2 = (lz9) this.c;
        lz9 lz9Var3 = (lz9) jb3Var.q();
        lz9 lz9Var4 = (lz9) jb3Var.r();
        lz9 lz9Var5 = (lz9) this.d[0];
        lz9 lz9Var6 = (lz9) jb3Var.s(0);
        int[] j = ws6.j();
        int[] h = ws6.h();
        int[] h2 = ws6.h();
        int[] h3 = ws6.h();
        boolean h4 = lz9Var5.h();
        if (h4) {
            iArr = lz9Var3.g;
            iArr2 = lz9Var4.g;
        } else {
            kz9.n(lz9Var5.g, h2);
            kz9.g(h2, lz9Var3.g, h);
            kz9.g(h2, lz9Var5.g, h2);
            kz9.g(h2, lz9Var4.g, h2);
            iArr = h;
            iArr2 = h2;
        }
        boolean h5 = lz9Var6.h();
        if (h5) {
            iArr3 = lz9Var.g;
            iArr4 = lz9Var2.g;
        } else {
            kz9.n(lz9Var6.g, h3);
            kz9.g(h3, lz9Var.g, j);
            kz9.g(h3, lz9Var6.g, h3);
            kz9.g(h3, lz9Var2.g, h3);
            iArr3 = j;
            iArr4 = h3;
        }
        int[] h6 = ws6.h();
        kz9.q(iArr3, iArr, h6);
        kz9.q(iArr4, iArr2, h);
        if (ws6.u(h6)) {
            if (ws6.u(h)) {
                return J();
            }
            return i.u();
        }
        kz9.n(h6, h2);
        int[] h7 = ws6.h();
        kz9.g(h2, h6, h7);
        kz9.g(h2, iArr3, h2);
        kz9.i(h7, h7);
        ws6.x(iArr4, h7, j);
        kz9.m(ws6.b(h2, h2, h7), h7);
        lz9 lz9Var7 = new lz9(h3);
        kz9.n(h, lz9Var7.g);
        int[] iArr5 = lz9Var7.g;
        kz9.q(iArr5, h7, iArr5);
        lz9 lz9Var8 = new lz9(h7);
        kz9.q(h2, lz9Var7.g, lz9Var8.g);
        kz9.h(lz9Var8.g, h, j);
        kz9.l(j, lz9Var8.g);
        lz9 lz9Var9 = new lz9(h6);
        if (!h4) {
            int[] iArr6 = lz9Var9.g;
            kz9.g(iArr6, lz9Var5.g, iArr6);
        }
        if (!h5) {
            int[] iArr7 = lz9Var9.g;
            kz9.g(iArr7, lz9Var6.g, iArr7);
        }
        return new mz9(i, lz9Var7, lz9Var8, new na3[]{lz9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new mz9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new mz9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mz9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
