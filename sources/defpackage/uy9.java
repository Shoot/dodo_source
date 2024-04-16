package defpackage;

import defpackage.jb3;
/* renamed from: uy9  reason: default package */
/* loaded from: classes3.dex */
public class uy9 extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public uy9(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        ty9 ty9Var = (ty9) this.c;
        if (ty9Var.i()) {
            return i.u();
        }
        ty9 ty9Var2 = (ty9) this.b;
        ty9 ty9Var3 = (ty9) this.d[0];
        int[] f = us6.f();
        int[] f2 = us6.f();
        int[] f3 = us6.f();
        sy9.n(ty9Var.g, f3);
        int[] f4 = us6.f();
        sy9.n(f3, f4);
        boolean h = ty9Var3.h();
        int[] iArr = ty9Var3.g;
        if (!h) {
            sy9.n(iArr, f2);
            iArr = f2;
        }
        sy9.q(ty9Var2.g, iArr, f);
        sy9.a(ty9Var2.g, iArr, f2);
        sy9.g(f2, f, f2);
        sy9.m(us6.b(f2, f2, f2), f2);
        sy9.g(f3, ty9Var2.g, f3);
        sy9.m(et6.M(4, f3, 2, 0), f3);
        sy9.m(et6.N(4, f4, 3, 0, f), f);
        ty9 ty9Var4 = new ty9(f4);
        sy9.n(f2, ty9Var4.g);
        int[] iArr2 = ty9Var4.g;
        sy9.q(iArr2, f3, iArr2);
        int[] iArr3 = ty9Var4.g;
        sy9.q(iArr3, f3, iArr3);
        ty9 ty9Var5 = new ty9(f3);
        sy9.q(f3, ty9Var4.g, ty9Var5.g);
        int[] iArr4 = ty9Var5.g;
        sy9.g(iArr4, f2, iArr4);
        int[] iArr5 = ty9Var5.g;
        sy9.q(iArr5, f, iArr5);
        ty9 ty9Var6 = new ty9(f2);
        sy9.r(ty9Var.g, ty9Var6.g);
        if (!h) {
            int[] iArr6 = ty9Var6.g;
            sy9.g(iArr6, ty9Var3.g, iArr6);
        }
        return new uy9(i, ty9Var4, ty9Var5, new na3[]{ty9Var6});
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
        ty9 ty9Var = (ty9) this.b;
        ty9 ty9Var2 = (ty9) this.c;
        ty9 ty9Var3 = (ty9) jb3Var.q();
        ty9 ty9Var4 = (ty9) jb3Var.r();
        ty9 ty9Var5 = (ty9) this.d[0];
        ty9 ty9Var6 = (ty9) jb3Var.s(0);
        int[] h = us6.h();
        int[] f = us6.f();
        int[] f2 = us6.f();
        int[] f3 = us6.f();
        boolean h2 = ty9Var5.h();
        if (h2) {
            iArr = ty9Var3.g;
            iArr2 = ty9Var4.g;
        } else {
            sy9.n(ty9Var5.g, f2);
            sy9.g(f2, ty9Var3.g, f);
            sy9.g(f2, ty9Var5.g, f2);
            sy9.g(f2, ty9Var4.g, f2);
            iArr = f;
            iArr2 = f2;
        }
        boolean h3 = ty9Var6.h();
        if (h3) {
            iArr3 = ty9Var.g;
            iArr4 = ty9Var2.g;
        } else {
            sy9.n(ty9Var6.g, f3);
            sy9.g(f3, ty9Var.g, h);
            sy9.g(f3, ty9Var6.g, f3);
            sy9.g(f3, ty9Var2.g, f3);
            iArr3 = h;
            iArr4 = f3;
        }
        int[] f4 = us6.f();
        sy9.q(iArr3, iArr, f4);
        sy9.q(iArr4, iArr2, f);
        if (us6.q(f4)) {
            if (us6.q(f)) {
                return J();
            }
            return i.u();
        }
        sy9.n(f4, f2);
        int[] f5 = us6.f();
        sy9.g(f2, f4, f5);
        sy9.g(f2, iArr3, f2);
        sy9.i(f5, f5);
        us6.s(iArr4, f5, h);
        sy9.m(us6.b(f2, f2, f5), f5);
        ty9 ty9Var7 = new ty9(f3);
        sy9.n(f, ty9Var7.g);
        int[] iArr5 = ty9Var7.g;
        sy9.q(iArr5, f5, iArr5);
        ty9 ty9Var8 = new ty9(f5);
        sy9.q(f2, ty9Var7.g, ty9Var8.g);
        sy9.h(ty9Var8.g, f, h);
        sy9.l(h, ty9Var8.g);
        ty9 ty9Var9 = new ty9(f4);
        if (!h2) {
            int[] iArr6 = ty9Var9.g;
            sy9.g(iArr6, ty9Var5.g, iArr6);
        }
        if (!h3) {
            int[] iArr7 = ty9Var9.g;
            sy9.g(iArr7, ty9Var6.g, iArr7);
        }
        return new uy9(i, ty9Var7, ty9Var8, new na3[]{ty9Var9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new uy9(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new uy9(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public uy9(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
