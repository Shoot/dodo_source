package defpackage;

import defpackage.jb3;
/* renamed from: pq9  reason: default package */
/* loaded from: classes3.dex */
public class pq9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public pq9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        oq9 oq9Var = (oq9) this.c;
        if (oq9Var.i()) {
            return i.u();
        }
        oq9 oq9Var2 = (oq9) this.b;
        oq9 oq9Var3 = (oq9) this.d[0];
        int[] i2 = ys6.i();
        int[] i3 = ys6.i();
        int[] i4 = ys6.i();
        nq9.n(oq9Var.g, i4);
        int[] i5 = ys6.i();
        nq9.n(i4, i5);
        boolean h = oq9Var3.h();
        int[] iArr = oq9Var3.g;
        if (!h) {
            nq9.n(iArr, i3);
            iArr = i3;
        }
        nq9.q(oq9Var2.g, iArr, i2);
        nq9.a(oq9Var2.g, iArr, i3);
        nq9.g(i3, i2, i3);
        nq9.m(ys6.b(i3, i3, i3), i3);
        nq9.g(i4, oq9Var2.g, i4);
        nq9.m(et6.M(8, i4, 2, 0), i4);
        nq9.m(et6.N(8, i5, 3, 0, i2), i2);
        oq9 oq9Var4 = new oq9(i5);
        nq9.n(i3, oq9Var4.g);
        int[] iArr2 = oq9Var4.g;
        nq9.q(iArr2, i4, iArr2);
        int[] iArr3 = oq9Var4.g;
        nq9.q(iArr3, i4, iArr3);
        oq9 oq9Var5 = new oq9(i4);
        nq9.q(i4, oq9Var4.g, oq9Var5.g);
        int[] iArr4 = oq9Var5.g;
        nq9.g(iArr4, i3, iArr4);
        int[] iArr5 = oq9Var5.g;
        nq9.q(iArr5, i2, iArr5);
        oq9 oq9Var6 = new oq9(i3);
        nq9.r(oq9Var.g, oq9Var6.g);
        if (!h) {
            int[] iArr6 = oq9Var6.g;
            nq9.g(iArr6, oq9Var3.g, iArr6);
        }
        return new pq9(i, oq9Var4, oq9Var5, new na3[]{oq9Var6});
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
        oq9 oq9Var = (oq9) this.b;
        oq9 oq9Var2 = (oq9) this.c;
        oq9 oq9Var3 = (oq9) jb3Var.q();
        oq9 oq9Var4 = (oq9) jb3Var.r();
        oq9 oq9Var5 = (oq9) this.d[0];
        oq9 oq9Var6 = (oq9) jb3Var.s(0);
        int[] k = ys6.k();
        int[] i2 = ys6.i();
        int[] i3 = ys6.i();
        int[] i4 = ys6.i();
        boolean h = oq9Var5.h();
        if (h) {
            iArr = oq9Var3.g;
            iArr2 = oq9Var4.g;
        } else {
            nq9.n(oq9Var5.g, i3);
            nq9.g(i3, oq9Var3.g, i2);
            nq9.g(i3, oq9Var5.g, i3);
            nq9.g(i3, oq9Var4.g, i3);
            iArr = i2;
            iArr2 = i3;
        }
        boolean h2 = oq9Var6.h();
        if (h2) {
            iArr3 = oq9Var.g;
            iArr4 = oq9Var2.g;
        } else {
            nq9.n(oq9Var6.g, i4);
            nq9.g(i4, oq9Var.g, k);
            nq9.g(i4, oq9Var6.g, i4);
            nq9.g(i4, oq9Var2.g, i4);
            iArr3 = k;
            iArr4 = i4;
        }
        int[] i5 = ys6.i();
        nq9.q(iArr3, iArr, i5);
        nq9.q(iArr4, iArr2, i2);
        if (ys6.v(i5)) {
            if (ys6.v(i2)) {
                return J();
            }
            return i.u();
        }
        nq9.n(i5, i3);
        int[] i6 = ys6.i();
        nq9.g(i3, i5, i6);
        nq9.g(i3, iArr3, i3);
        nq9.i(i6, i6);
        ys6.y(iArr4, i6, k);
        nq9.m(ys6.b(i3, i3, i6), i6);
        oq9 oq9Var7 = new oq9(i4);
        nq9.n(i2, oq9Var7.g);
        int[] iArr5 = oq9Var7.g;
        nq9.q(iArr5, i6, iArr5);
        oq9 oq9Var8 = new oq9(i6);
        nq9.q(i3, oq9Var7.g, oq9Var8.g);
        nq9.h(oq9Var8.g, i2, k);
        nq9.l(k, oq9Var8.g);
        oq9 oq9Var9 = new oq9(i5);
        if (!h) {
            int[] iArr6 = oq9Var9.g;
            nq9.g(iArr6, oq9Var5.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = oq9Var9.g;
            nq9.g(iArr7, oq9Var6.g, iArr7);
        }
        return new pq9(i, oq9Var7, oq9Var8, new na3[]{oq9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new pq9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new pq9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pq9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
