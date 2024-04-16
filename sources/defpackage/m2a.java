package defpackage;

import defpackage.jb3;
/* renamed from: m2a  reason: default package */
/* loaded from: classes3.dex */
public class m2a extends jb3.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m2a(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
        super(ea3Var, na3Var, na3Var2);
    }

    @Override // defpackage.jb3
    public jb3 J() {
        long[] s;
        long[] jArr;
        if (u()) {
            return this;
        }
        ea3 i = i();
        i2a i2aVar = (i2a) this.b;
        if (i2aVar.i()) {
            return i.u();
        }
        i2a i2aVar2 = (i2a) this.c;
        i2a i2aVar3 = (i2a) this.d[0];
        long[] c = dt6.c();
        long[] c2 = dt6.c();
        if (i2aVar3.h()) {
            s = null;
        } else {
            s = h2a.s(i2aVar3.g);
        }
        long[] jArr2 = i2aVar2.g;
        if (s == null) {
            jArr = i2aVar3.g;
        } else {
            h2a.q(jArr2, s, c);
            h2a.w(i2aVar3.g, c2);
            jArr2 = c;
            jArr = c2;
        }
        long[] c3 = dt6.c();
        h2a.w(i2aVar2.g, c3);
        h2a.d(jArr2, jArr, c3);
        if (dt6.g(c3)) {
            return new m2a(i, new i2a(c3), l2a.m);
        }
        long[] d = dt6.d();
        h2a.p(c3, jArr2, d);
        i2a i2aVar4 = new i2a(c);
        h2a.w(c3, i2aVar4.g);
        i2a i2aVar5 = new i2a(c3);
        if (s != null) {
            long[] jArr3 = i2aVar5.g;
            h2a.o(jArr3, jArr, jArr3);
        }
        long[] jArr4 = i2aVar.g;
        if (s != null) {
            h2a.q(jArr4, s, c2);
            jArr4 = c2;
        }
        h2a.x(jArr4, d);
        h2a.t(d, c2);
        h2a.d(i2aVar4.g, i2aVar5.g, c2);
        return new m2a(i, i2aVar4, new i2a(c2), new na3[]{i2aVar5});
    }

    @Override // defpackage.jb3
    public jb3 K(jb3 jb3Var) {
        if (u()) {
            return jb3Var;
        }
        if (jb3Var.u()) {
            return J();
        }
        ea3 i = i();
        i2a i2aVar = (i2a) this.b;
        if (i2aVar.i()) {
            return jb3Var;
        }
        i2a i2aVar2 = (i2a) jb3Var.n();
        i2a i2aVar3 = (i2a) jb3Var.s(0);
        if (!i2aVar2.i() && i2aVar3.h()) {
            i2a i2aVar4 = (i2a) this.c;
            i2a i2aVar5 = (i2a) this.d[0];
            i2a i2aVar6 = (i2a) jb3Var.o();
            long[] c = dt6.c();
            long[] c2 = dt6.c();
            long[] c3 = dt6.c();
            long[] c4 = dt6.c();
            h2a.w(i2aVar.g, c);
            h2a.w(i2aVar4.g, c2);
            h2a.w(i2aVar5.g, c3);
            h2a.o(i2aVar4.g, i2aVar5.g, c4);
            h2a.d(c3, c2, c4);
            long[] s = h2a.s(c3);
            h2a.q(i2aVar6.g, s, c3);
            h2a.b(c3, c2, c3);
            long[] d = dt6.d();
            h2a.p(c3, c4, d);
            h2a.r(c, s, d);
            h2a.t(d, c3);
            h2a.q(i2aVar2.g, s, c);
            h2a.b(c, c4, c2);
            h2a.w(c2, c2);
            if (dt6.g(c2)) {
                if (dt6.g(c3)) {
                    return jb3Var.J();
                }
                return i.u();
            } else if (dt6.g(c3)) {
                return new m2a(i, new i2a(c3), l2a.m);
            } else {
                i2a i2aVar7 = new i2a();
                h2a.w(c3, i2aVar7.g);
                long[] jArr = i2aVar7.g;
                h2a.o(jArr, c, jArr);
                i2a i2aVar8 = new i2a(c);
                h2a.o(c3, c2, i2aVar8.g);
                long[] jArr2 = i2aVar8.g;
                h2a.q(jArr2, s, jArr2);
                i2a i2aVar9 = new i2a(c2);
                h2a.b(c3, c2, i2aVar9.g);
                long[] jArr3 = i2aVar9.g;
                h2a.w(jArr3, jArr3);
                et6.X(18, d);
                h2a.p(i2aVar9.g, c4, d);
                h2a.f(i2aVar6.g, c4);
                h2a.p(c4, i2aVar8.g, d);
                h2a.t(d, i2aVar9.g);
                return new m2a(i, i2aVar7, i2aVar9, new na3[]{i2aVar8});
            }
        }
        return J().a(jb3Var);
    }

    @Override // defpackage.jb3
    public jb3 a(jb3 jb3Var) {
        long[] s;
        long[] jArr;
        long[] jArr2;
        long[] s2;
        long[] jArr3;
        i2a i2aVar;
        i2a i2aVar2;
        i2a i2aVar3;
        if (u()) {
            return jb3Var;
        }
        if (jb3Var.u()) {
            return this;
        }
        ea3 i = i();
        i2a i2aVar4 = (i2a) this.b;
        i2a i2aVar5 = (i2a) jb3Var.n();
        if (i2aVar4.i()) {
            if (i2aVar5.i()) {
                return i.u();
            }
            return jb3Var.a(this);
        }
        i2a i2aVar6 = (i2a) this.c;
        i2a i2aVar7 = (i2a) this.d[0];
        i2a i2aVar8 = (i2a) jb3Var.o();
        i2a i2aVar9 = (i2a) jb3Var.s(0);
        long[] c = dt6.c();
        long[] c2 = dt6.c();
        long[] c3 = dt6.c();
        long[] c4 = dt6.c();
        if (i2aVar7.h()) {
            s = null;
        } else {
            s = h2a.s(i2aVar7.g);
        }
        if (s == null) {
            jArr = i2aVar5.g;
            jArr2 = i2aVar8.g;
        } else {
            h2a.q(i2aVar5.g, s, c2);
            h2a.q(i2aVar8.g, s, c4);
            jArr = c2;
            jArr2 = c4;
        }
        if (i2aVar9.h()) {
            s2 = null;
        } else {
            s2 = h2a.s(i2aVar9.g);
        }
        long[] jArr4 = i2aVar4.g;
        if (s2 == null) {
            jArr3 = i2aVar6.g;
        } else {
            h2a.q(jArr4, s2, c);
            h2a.q(i2aVar6.g, s2, c3);
            jArr4 = c;
            jArr3 = c3;
        }
        h2a.b(jArr3, jArr2, c3);
        h2a.b(jArr4, jArr, c4);
        if (dt6.g(c4)) {
            if (dt6.g(c3)) {
                return J();
            }
            return i.u();
        }
        if (i2aVar5.i()) {
            jb3 A = A();
            i2a i2aVar10 = (i2a) A.q();
            na3 r = A.r();
            na3 d = r.a(i2aVar8).d(i2aVar10);
            i2aVar = (i2a) d.o().a(d).a(i2aVar10).b();
            if (i2aVar.i()) {
                return new m2a(i, i2aVar, l2a.m);
            }
            i2aVar2 = (i2a) d.j(i2aVar10.a(i2aVar)).a(i2aVar).a(r).d(i2aVar).a(i2aVar);
            i2aVar3 = (i2a) i.m(da3.b);
        } else {
            h2a.w(c4, c4);
            long[] s3 = h2a.s(c3);
            h2a.q(jArr4, s3, c);
            h2a.q(jArr, s3, c2);
            i2a i2aVar11 = new i2a(c);
            h2a.o(c, c2, i2aVar11.g);
            if (i2aVar11.i()) {
                return new m2a(i, i2aVar11, l2a.m);
            }
            i2a i2aVar12 = new i2a(c3);
            h2a.q(c4, s3, i2aVar12.g);
            if (s2 != null) {
                long[] jArr5 = i2aVar12.g;
                h2a.q(jArr5, s2, jArr5);
            }
            long[] d2 = dt6.d();
            h2a.b(c2, c4, c4);
            h2a.x(c4, d2);
            h2a.b(i2aVar6.g, i2aVar7.g, c4);
            h2a.p(c4, i2aVar12.g, d2);
            i2a i2aVar13 = new i2a(c4);
            h2a.t(d2, i2aVar13.g);
            if (s != null) {
                long[] jArr6 = i2aVar12.g;
                h2a.q(jArr6, s, jArr6);
            }
            i2aVar = i2aVar11;
            i2aVar2 = i2aVar13;
            i2aVar3 = i2aVar12;
        }
        return new m2a(i, i2aVar, i2aVar2, new na3[]{i2aVar3});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new m2a(null, f(), g());
    }

    @Override // defpackage.jb3
    protected boolean h() {
        na3 n = n();
        if (n.i() || o().s() == n.s()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jb3
    public na3 r() {
        na3 na3Var = this.b;
        na3 na3Var2 = this.c;
        if (!u() && !na3Var.i()) {
            na3 j = na3Var2.a(na3Var).j(na3Var);
            na3 na3Var3 = this.d[0];
            if (!na3Var3.h()) {
                return j.d(na3Var3);
            }
            return j;
        }
        return na3Var2;
    }

    @Override // defpackage.jb3
    public jb3 z() {
        if (u()) {
            return this;
        }
        na3 na3Var = this.b;
        if (na3Var.i()) {
            return this;
        }
        na3 na3Var2 = this.c;
        na3 na3Var3 = this.d[0];
        return new m2a(this.a, na3Var, na3Var2.a(na3Var3), new na3[]{na3Var3});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2a(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
