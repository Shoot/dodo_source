package defpackage;

import defpackage.jb3;
/* renamed from: c0a  reason: default package */
/* loaded from: classes3.dex */
public class c0a extends jb3.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c0a(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
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
        b0a b0aVar = (b0a) this.c;
        if (b0aVar.i()) {
            return i.u();
        }
        b0a b0aVar2 = (b0a) this.b;
        b0a b0aVar3 = (b0a) this.d[0];
        int[] i2 = ys6.i();
        int[] i3 = ys6.i();
        int[] i4 = ys6.i();
        a0a.n(b0aVar.g, i4);
        int[] i5 = ys6.i();
        a0a.n(i4, i5);
        boolean h = b0aVar3.h();
        int[] iArr = b0aVar3.g;
        if (!h) {
            a0a.n(iArr, i3);
            iArr = i3;
        }
        a0a.q(b0aVar2.g, iArr, i2);
        a0a.a(b0aVar2.g, iArr, i3);
        a0a.g(i3, i2, i3);
        a0a.m(ys6.b(i3, i3, i3), i3);
        a0a.g(i4, b0aVar2.g, i4);
        a0a.m(et6.M(8, i4, 2, 0), i4);
        a0a.m(et6.N(8, i5, 3, 0, i2), i2);
        b0a b0aVar4 = new b0a(i5);
        a0a.n(i3, b0aVar4.g);
        int[] iArr2 = b0aVar4.g;
        a0a.q(iArr2, i4, iArr2);
        int[] iArr3 = b0aVar4.g;
        a0a.q(iArr3, i4, iArr3);
        b0a b0aVar5 = new b0a(i4);
        a0a.q(i4, b0aVar4.g, b0aVar5.g);
        int[] iArr4 = b0aVar5.g;
        a0a.g(iArr4, i3, iArr4);
        int[] iArr5 = b0aVar5.g;
        a0a.q(iArr5, i2, iArr5);
        b0a b0aVar6 = new b0a(i3);
        a0a.r(b0aVar.g, b0aVar6.g);
        if (!h) {
            int[] iArr6 = b0aVar6.g;
            a0a.g(iArr6, b0aVar3.g, iArr6);
        }
        return new c0a(i, b0aVar4, b0aVar5, new na3[]{b0aVar6});
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
        b0a b0aVar = (b0a) this.b;
        b0a b0aVar2 = (b0a) this.c;
        b0a b0aVar3 = (b0a) jb3Var.q();
        b0a b0aVar4 = (b0a) jb3Var.r();
        b0a b0aVar5 = (b0a) this.d[0];
        b0a b0aVar6 = (b0a) jb3Var.s(0);
        int[] k = ys6.k();
        int[] i2 = ys6.i();
        int[] i3 = ys6.i();
        int[] i4 = ys6.i();
        boolean h = b0aVar5.h();
        if (h) {
            iArr = b0aVar3.g;
            iArr2 = b0aVar4.g;
        } else {
            a0a.n(b0aVar5.g, i3);
            a0a.g(i3, b0aVar3.g, i2);
            a0a.g(i3, b0aVar5.g, i3);
            a0a.g(i3, b0aVar4.g, i3);
            iArr = i2;
            iArr2 = i3;
        }
        boolean h2 = b0aVar6.h();
        if (h2) {
            iArr3 = b0aVar.g;
            iArr4 = b0aVar2.g;
        } else {
            a0a.n(b0aVar6.g, i4);
            a0a.g(i4, b0aVar.g, k);
            a0a.g(i4, b0aVar6.g, i4);
            a0a.g(i4, b0aVar2.g, i4);
            iArr3 = k;
            iArr4 = i4;
        }
        int[] i5 = ys6.i();
        a0a.q(iArr3, iArr, i5);
        a0a.q(iArr4, iArr2, i2);
        if (ys6.v(i5)) {
            if (ys6.v(i2)) {
                return J();
            }
            return i.u();
        }
        a0a.n(i5, i3);
        int[] i6 = ys6.i();
        a0a.g(i3, i5, i6);
        a0a.g(i3, iArr3, i3);
        a0a.i(i6, i6);
        ys6.y(iArr4, i6, k);
        a0a.m(ys6.b(i3, i3, i6), i6);
        b0a b0aVar7 = new b0a(i4);
        a0a.n(i2, b0aVar7.g);
        int[] iArr5 = b0aVar7.g;
        a0a.q(iArr5, i6, iArr5);
        b0a b0aVar8 = new b0a(i6);
        a0a.q(i3, b0aVar7.g, b0aVar8.g);
        a0a.h(b0aVar8.g, i2, k);
        a0a.l(k, b0aVar8.g);
        b0a b0aVar9 = new b0a(i5);
        if (!h) {
            int[] iArr6 = b0aVar9.g;
            a0a.g(iArr6, b0aVar5.g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = b0aVar9.g;
            a0a.g(iArr7, b0aVar6.g, iArr7);
        }
        return new c0a(i, b0aVar7, b0aVar8, new na3[]{b0aVar9});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new c0a(null, f(), g());
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        return new c0a(this.a, this.b, this.c.m(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0a(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
