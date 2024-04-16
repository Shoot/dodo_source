package defpackage;

import defpackage.jb3;
/* renamed from: e1a  reason: default package */
/* loaded from: classes3.dex */
public class e1a extends jb3.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e1a(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
        super(ea3Var, na3Var, na3Var2);
    }

    @Override // defpackage.jb3
    public jb3 J() {
        na3 j;
        na3 o;
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
            j = na3Var2;
        } else {
            j = na3Var2.j(na3Var3);
        }
        if (h) {
            o = na3Var3;
        } else {
            o = na3Var3.o();
        }
        na3 a = na3Var2.o().a(j).a(o);
        if (a.i()) {
            return new e1a(i, a, i.o().n());
        }
        na3 o2 = a.o();
        if (h) {
            j2 = a;
        } else {
            j2 = a.j(o);
        }
        if (!h) {
            na3Var = na3Var.j(na3Var3);
        }
        return new e1a(i, o2, na3Var.p(a, j).a(o2).a(j2), new na3[]{j2});
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
            na3 a = o4.a(o3).a(na3Var2.j(na3Var3));
            na3 l = o.j(o4).a(o3).l(a, o2, o4);
            na3 j = n.j(o4);
            na3 o5 = j.a(a).o();
            if (o5.i()) {
                if (l.i()) {
                    return jb3Var.J();
                }
                return i.u();
            } else if (l.i()) {
                return new e1a(i, l, i.o().n());
            } else {
                na3 j2 = l.o().j(j);
                na3 j3 = l.j(o5).j(o4);
                return new e1a(i, j2, l.a(o5).o().l(a, o.b(), j3), new na3[]{j3});
            }
        }
        return J().a(jb3Var);
    }

    @Override // defpackage.jb3
    public jb3 a(jb3 jb3Var) {
        na3 na3Var;
        na3 na3Var2;
        na3 na3Var3;
        na3 na3Var4;
        na3 na3Var5;
        na3 na3Var6;
        na3 na3Var7;
        if (u()) {
            return jb3Var;
        }
        if (jb3Var.u()) {
            return this;
        }
        ea3 i = i();
        na3 na3Var8 = this.b;
        na3 n = jb3Var.n();
        if (na3Var8.i()) {
            if (n.i()) {
                return i.u();
            }
            return jb3Var.a(this);
        }
        na3 na3Var9 = this.c;
        na3 na3Var10 = this.d[0];
        na3 o = jb3Var.o();
        na3 s = jb3Var.s(0);
        boolean h = na3Var10.h();
        if (!h) {
            na3Var = n.j(na3Var10);
            na3Var2 = o.j(na3Var10);
        } else {
            na3Var = n;
            na3Var2 = o;
        }
        boolean h2 = s.h();
        if (!h2) {
            na3Var8 = na3Var8.j(s);
            na3Var3 = na3Var9.j(s);
        } else {
            na3Var3 = na3Var9;
        }
        na3 a = na3Var3.a(na3Var2);
        na3 a2 = na3Var8.a(na3Var);
        if (a2.i()) {
            if (a.i()) {
                return J();
            }
            return i.u();
        }
        if (n.i()) {
            jb3 A = A();
            na3 q = A.q();
            na3 r = A.r();
            na3 d = r.a(o).d(q);
            na3Var5 = d.o().a(d).a(q).b();
            if (na3Var5.i()) {
                return new e1a(i, na3Var5, i.o().n());
            }
            na3Var7 = d.j(q.a(na3Var5)).a(na3Var5).a(r).d(na3Var5).a(na3Var5);
            na3Var6 = i.m(da3.b);
        } else {
            na3 o2 = a2.o();
            na3 j = a.j(na3Var8);
            na3 j2 = a.j(na3Var);
            na3 j3 = j.j(j2);
            if (j3.i()) {
                return new e1a(i, j3, i.o().n());
            }
            na3 j4 = a.j(o2);
            if (!h2) {
                na3Var4 = j4.j(s);
            } else {
                na3Var4 = j4;
            }
            na3 p = j2.a(o2).p(na3Var4, na3Var9.a(na3Var10));
            if (!h) {
                na3Var4 = na3Var4.j(na3Var10);
            }
            na3Var5 = j3;
            na3Var6 = na3Var4;
            na3Var7 = p;
        }
        return new e1a(i, na3Var5, na3Var7, new na3[]{na3Var6});
    }

    @Override // defpackage.jb3
    protected jb3 d() {
        return new e1a(null, f(), g());
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
        return new e1a(this.a, na3Var, na3Var2.a(na3Var3), new na3[]{na3Var3});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1a(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        super(ea3Var, na3Var, na3Var2, na3VarArr);
    }
}
