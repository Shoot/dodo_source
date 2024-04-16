package defpackage;

import defpackage.jb3;
/* renamed from: iz9  reason: default package */
/* loaded from: classes3.dex */
public class iz9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public iz9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        hz9 hz9Var = (hz9) this.c;
        if (hz9Var.i()) {
            return i.u();
        }
        hz9 hz9Var2 = (hz9) this.b;
        hz9 hz9Var3 = (hz9) this.d[0];
        int[] h = ws6.h();
        gz9.m(hz9Var.g, h);
        int[] h2 = ws6.h();
        gz9.m(h, h2);
        int[] h3 = ws6.h();
        gz9.m(hz9Var2.g, h3);
        gz9.l(ws6.b(h3, h3, h3), h3);
        gz9.f(h, hz9Var2.g, h);
        gz9.l(et6.M(6, h, 2, 0), h);
        int[] h4 = ws6.h();
        gz9.l(et6.N(6, h2, 3, 0, h4), h4);
        hz9 hz9Var4 = new hz9(h2);
        gz9.m(h3, hz9Var4.g);
        int[] iArr = hz9Var4.g;
        gz9.o(iArr, h, iArr);
        int[] iArr2 = hz9Var4.g;
        gz9.o(iArr2, h, iArr2);
        hz9 hz9Var5 = new hz9(h);
        gz9.o(h, hz9Var4.g, hz9Var5.g);
        int[] iArr3 = hz9Var5.g;
        gz9.f(iArr3, h3, iArr3);
        int[] iArr4 = hz9Var5.g;
        gz9.o(iArr4, h4, iArr4);
        hz9 hz9Var6 = new hz9(h3);
        gz9.p(hz9Var.g, hz9Var6.g);
        if (!hz9Var3.h()) {
            int[] iArr5 = hz9Var6.g;
            gz9.f(iArr5, hz9Var3.g, iArr5);
        }
        return new iz9(i, hz9Var4, hz9Var5, new na3[]{hz9Var6});
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
        hz9 hz9Var = (hz9) this.b;
        hz9 hz9Var2 = (hz9) this.c;
        hz9 hz9Var3 = (hz9) jb3Var.q();
        hz9 hz9Var4 = (hz9) jb3Var.r();
        hz9 hz9Var5 = (hz9) this.d[0];
        hz9 hz9Var6 = (hz9) jb3Var.s(0);
        int[] j = ws6.j();
        int[] h = ws6.h();
        int[] h2 = ws6.h();
        int[] h3 = ws6.h();
        boolean h4 = hz9Var5.h();
        if (h4) {
            iArr = hz9Var3.g;
            iArr2 = hz9Var4.g;
        } else {
            gz9.m(hz9Var5.g, h2);
            gz9.f(h2, hz9Var3.g, h);
            gz9.f(h2, hz9Var5.g, h2);
            gz9.f(h2, hz9Var4.g, h2);
            iArr = h;
            iArr2 = h2;
        }
        boolean h5 = hz9Var6.h();
        if (h5) {
            iArr3 = hz9Var.g;
            iArr4 = hz9Var2.g;
        } else {
            gz9.m(hz9Var6.g, h3);
            gz9.f(h3, hz9Var.g, j);
            gz9.f(h3, hz9Var6.g, h3);
            gz9.f(h3, hz9Var2.g, h3);
            iArr3 = j;
            iArr4 = h3;
        }
        int[] h6 = ws6.h();
        gz9.o(iArr3, iArr, h6);
        gz9.o(iArr4, iArr2, h);
        if (ws6.u(h6)) {
            if (ws6.u(h)) {
                return J();
            }
            return i.u();
        }
        gz9.m(h6, h2);
        int[] h7 = ws6.h();
        gz9.f(h2, h6, h7);
        gz9.f(h2, iArr3, h2);
        gz9.h(h7, h7);
        ws6.x(iArr4, h7, j);
        gz9.l(ws6.b(h2, h2, h7), h7);
        hz9 hz9Var7 = new hz9(h3);
        gz9.m(h, hz9Var7.g);
        int[] iArr5 = hz9Var7.g;
        gz9.o(iArr5, h7, iArr5);
        hz9 hz9Var8 = new hz9(h7);
        gz9.o(h2, hz9Var7.g, hz9Var8.g);
        gz9.g(hz9Var8.g, h, j);
        gz9.k(j, hz9Var8.g);
        hz9 hz9Var9 = new hz9(h6);
        if (!h4) {
            int[] iArr6 = hz9Var9.g;
            gz9.f(iArr6, hz9Var5.g, iArr6);
        }
        if (!h5) {
            int[] iArr7 = hz9Var9.g;
            gz9.f(iArr7, hz9Var6.g, iArr7);
        }
        return new iz9(i, hz9Var7, hz9Var8, new na3[]{hz9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new iz9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new iz9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public iz9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
