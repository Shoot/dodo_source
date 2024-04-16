package defpackage;

import defpackage.jb3;
/* renamed from: r32  reason: default package */
/* loaded from: classes3.dex */
public class r32 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r32(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
        super(ea3Var, na3Var, na3Var2);
    }

    @Override // defpackage.jb3
    public jb3 H() {
        if (u()) {
            return this;
        }
        if (this.c.i()) {
            return this;
        }
        return N(false).a(this);
    }

    @Override // defpackage.jb3
    public jb3 J() {
        if (u()) {
            return this;
        }
        ea3 i = i();
        if (this.c.i()) {
            return i.u();
        }
        return N(true);
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
        return N(false).a(jb3Var);
    }

    protected q32 L(q32 q32Var, int[] iArr) {
        q32 q32Var2 = (q32) i().n();
        if (q32Var.h()) {
            return q32Var2;
        }
        q32 q32Var3 = new q32();
        if (iArr == null) {
            iArr = q32Var3.g;
            p32.n(q32Var.g, iArr);
        }
        p32.n(iArr, q32Var3.g);
        int[] iArr2 = q32Var3.g;
        p32.g(iArr2, q32Var2.g, iArr2);
        return q32Var3;
    }

    protected q32 M() {
        na3[] na3VarArr = this.d;
        q32 q32Var = (q32) na3VarArr[1];
        if (q32Var == null) {
            q32 L = L((q32) na3VarArr[0], null);
            na3VarArr[1] = L;
            return L;
        }
        return q32Var;
    }

    protected r32 N(boolean z) {
        q32 q32Var;
        q32 q32Var2 = (q32) this.b;
        q32 q32Var3 = (q32) this.c;
        q32 q32Var4 = (q32) this.d[0];
        q32 M = M();
        int[] i = ys6.i();
        p32.n(q32Var2.g, i);
        p32.m(ys6.b(i, i, i) + ys6.d(M.g, i), i);
        int[] i2 = ys6.i();
        p32.s(q32Var3.g, i2);
        int[] i3 = ys6.i();
        p32.g(i2, q32Var3.g, i3);
        int[] i4 = ys6.i();
        p32.g(i3, q32Var2.g, i4);
        p32.s(i4, i4);
        int[] i5 = ys6.i();
        p32.n(i3, i5);
        p32.s(i5, i5);
        q32 q32Var5 = new q32(i3);
        p32.n(i, q32Var5.g);
        int[] iArr = q32Var5.g;
        p32.r(iArr, i4, iArr);
        int[] iArr2 = q32Var5.g;
        p32.r(iArr2, i4, iArr2);
        q32 q32Var6 = new q32(i4);
        p32.r(i4, q32Var5.g, q32Var6.g);
        int[] iArr3 = q32Var6.g;
        p32.g(iArr3, i, iArr3);
        int[] iArr4 = q32Var6.g;
        p32.r(iArr4, i5, iArr4);
        q32 q32Var7 = new q32(i2);
        if (!ys6.t(q32Var4.g)) {
            int[] iArr5 = q32Var7.g;
            p32.g(iArr5, q32Var4.g, iArr5);
        }
        if (z) {
            q32Var = new q32(i5);
            int[] iArr6 = q32Var.g;
            p32.g(iArr6, M.g, iArr6);
            int[] iArr7 = q32Var.g;
            p32.s(iArr7, iArr7);
        } else {
            q32Var = null;
        }
        return new r32(i(), q32Var5, q32Var6, new na3[]{q32Var7, q32Var});
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
        q32 q32Var = (q32) this.b;
        q32 q32Var2 = (q32) this.c;
        q32 q32Var3 = (q32) this.d[0];
        q32 q32Var4 = (q32) jb3Var.q();
        q32 q32Var5 = (q32) jb3Var.r();
        q32 q32Var6 = (q32) jb3Var.s(0);
        int[] k = ys6.k();
        int[] i2 = ys6.i();
        int[] i3 = ys6.i();
        int[] i4 = ys6.i();
        boolean h = q32Var3.h();
        if (h) {
            iArr = q32Var4.g;
            iArr2 = q32Var5.g;
        } else {
            p32.n(q32Var3.g, i3);
            p32.g(i3, q32Var4.g, i2);
            p32.g(i3, q32Var3.g, i3);
            p32.g(i3, q32Var5.g, i3);
            iArr = i2;
            iArr2 = i3;
        }
        boolean h2 = q32Var6.h();
        if (h2) {
            iArr3 = q32Var.g;
            iArr4 = q32Var2.g;
        } else {
            p32.n(q32Var6.g, i4);
            p32.g(i4, q32Var.g, k);
            p32.g(i4, q32Var6.g, i4);
            p32.g(i4, q32Var2.g, i4);
            iArr3 = k;
            iArr4 = i4;
        }
        int[] i5 = ys6.i();
        p32.r(iArr3, iArr, i5);
        p32.r(iArr4, iArr2, i2);
        if (ys6.v(i5)) {
            if (ys6.v(i2)) {
                return J();
            }
            return i.u();
        }
        int[] i6 = ys6.i();
        p32.n(i5, i6);
        int[] i7 = ys6.i();
        p32.g(i6, i5, i7);
        p32.g(i6, iArr3, i3);
        p32.i(i7, i7);
        ys6.y(iArr4, i7, k);
        p32.m(ys6.b(i3, i3, i7), i7);
        q32 q32Var7 = new q32(i4);
        p32.n(i2, q32Var7.g);
        int[] iArr5 = q32Var7.g;
        p32.r(iArr5, i7, iArr5);
        q32 q32Var8 = new q32(i7);
        p32.r(i3, q32Var7.g, q32Var8.g);
        p32.h(q32Var8.g, i2, k);
        p32.l(k, q32Var8.g);
        q32 q32Var9 = new q32(i5);
        if (!h) {
            int[] iArr6 = q32Var9.g;
            p32.g(iArr6, q32Var3.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = q32Var9.g;
            p32.g(iArr7, q32Var6.g, iArr7);
        }
        return new r32(i, q32Var7, q32Var8, new na3[]{q32Var9, L(q32Var9, (h && h2) ? null : null)});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new r32(null, f(), g());
    }

    @Override // defpackage.jb3
    public na3 s(int i) {
        if (i == 1) {
            return M();
        }
        return super.s(i);
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new r32(i(), this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r32(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
