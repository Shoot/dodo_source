package defpackage;

import defpackage.jb3;
/* renamed from: k2a  reason: default package */
/* loaded from: classes3.dex */
public class k2a extends jb3.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k2a(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
        super(ea3Var, na3Var, na3Var2);
    }

    @Override // defpackage.jb3
    public jb3 J() {
        na3 o;
        na3 j;
        na3 j2;
        if (u()) {
            return this;
        }
        ea3 i = i();
        na3 na3Var = this.b;
        if (na3Var.i()) {
            return i.u();
        }
        na3 na3Var2 = this.c;
        na3 na3Var3 = this.d[0];
        boolean h = na3Var3.h();
        if (h) {
            o = na3Var3;
        } else {
            o = na3Var3.o();
        }
        if (h) {
            j = na3Var2.o().a(na3Var2);
        } else {
            j = na3Var2.a(na3Var3).j(na3Var2);
        }
        if (j.i()) {
            return new k2a(i, j, i.o());
        }
        na3 o2 = j.o();
        if (h) {
            j2 = j;
        } else {
            j2 = j.j(o);
        }
        na3 o3 = na3Var2.a(na3Var).o();
        if (!h) {
            na3Var3 = o.o();
        }
        return new k2a(i, o2, o3.a(j).a(o).j(o3).a(na3Var3).a(o2).a(j2), new na3[]{j2});
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
        na3 na3Var = this.b;
        if (na3Var.i()) {
            return jb3Var;
        }
        na3 n = jb3Var.n();
        na3 s = jb3Var.s(0);
        if (!n.i() && s.h()) {
            na3 na3Var2 = this.c;
            na3 na3Var3 = this.d[0];
            na3 o = jb3Var.o();
            na3 o2 = na3Var.o();
            na3 o3 = na3Var2.o();
            na3 o4 = na3Var3.o();
            na3 a = o3.a(na3Var2.j(na3Var3));
            na3 b = o.b();
            na3 l = b.j(o4).a(o3).l(a, o2, o4);
            na3 j = n.j(o4);
            na3 o5 = j.a(a).o();
            if (o5.i()) {
                if (l.i()) {
                    return jb3Var.J();
                }
                return i.u();
            } else if (l.i()) {
                return new k2a(i, l, i.o());
            } else {
                na3 j2 = l.o().j(j);
                na3 j3 = l.j(o5).j(o4);
                return new k2a(i, j2, l.a(o5).o().l(a, b, j3), new na3[]{j3});
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
            i2aVar = (i2a) d.o().a(d).a(i2aVar10);
            if (i2aVar.i()) {
                return new k2a(i, i2aVar, i.o());
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
                return new k2a(i, i2aVar11, i.o());
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
        return new k2a(i, i2aVar, i2aVar2, new na3[]{i2aVar3});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new k2a(null, f(), g());
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
        return new k2a(this.a, na3Var, na3Var2.a(na3Var3), new na3[]{na3Var3});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2a(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
