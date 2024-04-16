package defpackage;

import defpackage.jb3;
/* renamed from: yz9  reason: default package */
/* loaded from: classes3.dex */
public class yz9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public yz9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        xz9 xz9Var = (xz9) this.c;
        if (xz9Var.i()) {
            return i.u();
        }
        xz9 xz9Var2 = (xz9) this.b;
        xz9 xz9Var3 = (xz9) this.d[0];
        int[] i2 = ys6.i();
        wz9.m(xz9Var.g, i2);
        int[] i3 = ys6.i();
        wz9.m(i2, i3);
        int[] i4 = ys6.i();
        wz9.m(xz9Var2.g, i4);
        wz9.l(ys6.b(i4, i4, i4), i4);
        wz9.f(i2, xz9Var2.g, i2);
        wz9.l(et6.M(8, i2, 2, 0), i2);
        int[] i5 = ys6.i();
        wz9.l(et6.N(8, i3, 3, 0, i5), i5);
        xz9 xz9Var4 = new xz9(i3);
        wz9.m(i4, xz9Var4.g);
        int[] iArr = xz9Var4.g;
        wz9.o(iArr, i2, iArr);
        int[] iArr2 = xz9Var4.g;
        wz9.o(iArr2, i2, iArr2);
        xz9 xz9Var5 = new xz9(i2);
        wz9.o(i2, xz9Var4.g, xz9Var5.g);
        int[] iArr3 = xz9Var5.g;
        wz9.f(iArr3, i4, iArr3);
        int[] iArr4 = xz9Var5.g;
        wz9.o(iArr4, i5, iArr4);
        xz9 xz9Var6 = new xz9(i4);
        wz9.p(xz9Var.g, xz9Var6.g);
        if (!xz9Var3.h()) {
            int[] iArr5 = xz9Var6.g;
            wz9.f(iArr5, xz9Var3.g, iArr5);
        }
        return new yz9(i, xz9Var4, xz9Var5, new na3[]{xz9Var6});
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
        xz9 xz9Var = (xz9) this.b;
        xz9 xz9Var2 = (xz9) this.c;
        xz9 xz9Var3 = (xz9) jb3Var.q();
        xz9 xz9Var4 = (xz9) jb3Var.r();
        xz9 xz9Var5 = (xz9) this.d[0];
        xz9 xz9Var6 = (xz9) jb3Var.s(0);
        int[] k = ys6.k();
        int[] i2 = ys6.i();
        int[] i3 = ys6.i();
        int[] i4 = ys6.i();
        boolean h = xz9Var5.h();
        if (h) {
            iArr = xz9Var3.g;
            iArr2 = xz9Var4.g;
        } else {
            wz9.m(xz9Var5.g, i3);
            wz9.f(i3, xz9Var3.g, i2);
            wz9.f(i3, xz9Var5.g, i3);
            wz9.f(i3, xz9Var4.g, i3);
            iArr = i2;
            iArr2 = i3;
        }
        boolean h2 = xz9Var6.h();
        if (h2) {
            iArr3 = xz9Var.g;
            iArr4 = xz9Var2.g;
        } else {
            wz9.m(xz9Var6.g, i4);
            wz9.f(i4, xz9Var.g, k);
            wz9.f(i4, xz9Var6.g, i4);
            wz9.f(i4, xz9Var2.g, i4);
            iArr3 = k;
            iArr4 = i4;
        }
        int[] i5 = ys6.i();
        wz9.o(iArr3, iArr, i5);
        wz9.o(iArr4, iArr2, i2);
        if (ys6.v(i5)) {
            if (ys6.v(i2)) {
                return J();
            }
            return i.u();
        }
        wz9.m(i5, i3);
        int[] i6 = ys6.i();
        wz9.f(i3, i5, i6);
        wz9.f(i3, iArr3, i3);
        wz9.h(i6, i6);
        ys6.y(iArr4, i6, k);
        wz9.l(ys6.b(i3, i3, i6), i6);
        xz9 xz9Var7 = new xz9(i4);
        wz9.m(i2, xz9Var7.g);
        int[] iArr5 = xz9Var7.g;
        wz9.o(iArr5, i6, iArr5);
        xz9 xz9Var8 = new xz9(i6);
        wz9.o(i3, xz9Var7.g, xz9Var8.g);
        wz9.g(xz9Var8.g, i2, k);
        wz9.k(k, xz9Var8.g);
        xz9 xz9Var9 = new xz9(i5);
        if (!h) {
            int[] iArr6 = xz9Var9.g;
            wz9.f(iArr6, xz9Var5.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = xz9Var9.g;
            wz9.f(iArr7, xz9Var6.g, iArr7);
        }
        return new yz9(i, xz9Var7, xz9Var8, new na3[]{xz9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new yz9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new yz9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yz9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
