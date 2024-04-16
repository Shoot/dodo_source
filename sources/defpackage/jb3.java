package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.ea3;
import defpackage.na3;
import java.math.BigInteger;
import java.util.Hashtable;
/* renamed from: jb3  reason: default package */
/* loaded from: classes3.dex */
public abstract class jb3 {
    protected static final na3[] f = new na3[0];
    protected ea3 a;
    protected na3 b;
    protected na3 c;
    protected na3[] d;
    protected Hashtable e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jb3$a */
    /* loaded from: classes3.dex */
    public class a implements hg8 {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;

        a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // defpackage.hg8
        public ig8 a(ig8 ig8Var) {
            cwb cwbVar;
            if (ig8Var instanceof cwb) {
                cwbVar = (cwb) ig8Var;
            } else {
                cwbVar = null;
            }
            if (cwbVar == null) {
                cwbVar = new cwb();
            }
            if (cwbVar.b()) {
                return cwbVar;
            }
            if (!cwbVar.a()) {
                if (!this.a && !jb3.this.C()) {
                    cwbVar.e();
                    return cwbVar;
                }
                cwbVar.d();
            }
            if (this.b && !cwbVar.c()) {
                if (!jb3.this.D()) {
                    cwbVar.e();
                    return cwbVar;
                }
                cwbVar.f();
            }
            return cwbVar;
        }
    }

    /* renamed from: jb3$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends jb3 {
        /* JADX INFO: Access modifiers changed from: protected */
        public b(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
            super(ea3Var, na3Var, na3Var2);
        }

        @Override // defpackage.jb3
        protected boolean C() {
            na3 l;
            na3 p;
            ea3 i = i();
            na3 na3Var = this.b;
            na3 n = i.n();
            na3 o = i.o();
            int q = i.q();
            if (q == 6) {
                na3 na3Var2 = this.d[0];
                boolean h = na3Var2.h();
                if (na3Var.i()) {
                    na3 o2 = this.c.o();
                    if (!h) {
                        o = o.j(na3Var2.o());
                    }
                    return o2.equals(o);
                }
                na3 na3Var3 = this.c;
                na3 o3 = na3Var.o();
                if (h) {
                    l = na3Var3.o().a(na3Var3).a(n);
                    p = o3.o().a(o);
                } else {
                    na3 o4 = na3Var2.o();
                    na3 o5 = o4.o();
                    l = na3Var3.a(na3Var2).l(na3Var3, n, o4);
                    p = o3.p(o, o5);
                }
                return l.j(o3).equals(p);
            }
            na3 na3Var4 = this.c;
            na3 j = na3Var4.a(na3Var).j(na3Var4);
            if (q != 0) {
                if (q == 1) {
                    na3 na3Var5 = this.d[0];
                    if (!na3Var5.h()) {
                        na3 j2 = na3Var5.j(na3Var5.o());
                        j = j.j(na3Var5);
                        n = n.j(na3Var5);
                        o = o.j(j2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return j.equals(na3Var.a(n).j(na3Var.o()).a(o));
        }

        @Override // defpackage.jb3
        protected boolean D() {
            BigInteger p = this.a.p();
            if (da3.c.equals(p)) {
                if (((na3.a) A().f()).w() != 0) {
                    return true;
                }
                return false;
            } else if (da3.e.equals(p)) {
                jb3 A = A();
                na3 f = A.f();
                ea3 ea3Var = this.a;
                na3 J = ((ea3.b) ea3Var).J(f.a(ea3Var.n()));
                if (J == null) {
                    return false;
                }
                if (((na3.a) f.j(J).a(A.g())).w() == 0) {
                    return true;
                }
                return false;
            } else {
                return super.D();
            }
        }

        @Override // defpackage.jb3
        public jb3 E(na3 na3Var) {
            if (u()) {
                return this;
            }
            int j = j();
            if (j != 5) {
                if (j != 6) {
                    return super.E(na3Var);
                }
                na3 n = n();
                na3 o = o();
                na3 na3Var2 = p()[0];
                na3 j2 = n.j(na3Var.o());
                return i().i(j2, o.a(n).a(j2), new na3[]{na3Var2.j(na3Var)});
            }
            na3 n2 = n();
            return i().i(n2, o().a(n2).d(na3Var).a(n2.j(na3Var)), p());
        }

        @Override // defpackage.jb3
        public jb3 F(na3 na3Var) {
            if (u()) {
                return this;
            }
            int j = j();
            if (j != 5 && j != 6) {
                return super.F(na3Var);
            }
            na3 n = n();
            return i().i(n, o().a(n).j(na3Var).a(n), p());
        }

        @Override // defpackage.jb3
        public jb3 G(jb3 jb3Var) {
            if (jb3Var.u()) {
                return this;
            }
            return a(jb3Var.z());
        }

        public b L(int i) {
            jb3 h;
            if (u()) {
                return this;
            }
            ea3 i2 = i();
            int q = i2.q();
            na3 na3Var = this.b;
            if (q != 0) {
                if (q != 1) {
                    if (q != 5) {
                        if (q != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                h = i2.i(na3Var.q(i), this.c.q(i), new na3[]{this.d[0].q(i)});
                return (b) h;
            }
            h = i2.h(na3Var.q(i), this.c.q(i));
            return (b) h;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
            super(ea3Var, na3Var, na3Var2, na3VarArr);
        }
    }

    /* renamed from: jb3$c */
    /* loaded from: classes3.dex */
    public static abstract class c extends jb3 {
        /* JADX INFO: Access modifiers changed from: protected */
        public c(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
            super(ea3Var, na3Var, na3Var2);
        }

        @Override // defpackage.jb3
        protected boolean C() {
            na3 na3Var = this.b;
            na3 na3Var2 = this.c;
            na3 n = this.a.n();
            na3 o = this.a.o();
            na3 o2 = na3Var2.o();
            int j = j();
            if (j != 0) {
                if (j != 1) {
                    if (j != 2 && j != 3 && j != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    na3 na3Var3 = this.d[0];
                    if (!na3Var3.h()) {
                        na3 o3 = na3Var3.o();
                        na3 o4 = o3.o();
                        na3 j2 = o3.j(o4);
                        n = n.j(o4);
                        o = o.j(j2);
                    }
                } else {
                    na3 na3Var4 = this.d[0];
                    if (!na3Var4.h()) {
                        na3 o5 = na3Var4.o();
                        na3 j3 = na3Var4.j(o5);
                        o2 = o2.j(na3Var4);
                        n = n.j(o5);
                        o = o.j(j3);
                    }
                }
            }
            return o2.equals(na3Var.o().a(n).j(na3Var).a(o));
        }

        @Override // defpackage.jb3
        public jb3 G(jb3 jb3Var) {
            if (jb3Var.u()) {
                return this;
            }
            return a(jb3Var.z());
        }

        @Override // defpackage.jb3
        protected boolean h() {
            return g().s();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
            super(ea3Var, na3Var, na3Var2, na3VarArr);
        }
    }

    /* renamed from: jb3$d */
    /* loaded from: classes3.dex */
    public static class d extends b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public d(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
            super(ea3Var, na3Var, na3Var2);
        }

        @Override // defpackage.jb3
        public jb3 J() {
            na3 j;
            na3 j2;
            na3 o;
            na3 j3;
            na3 j4;
            na3 a;
            na3 p;
            if (u()) {
                return this;
            }
            ea3 i = i();
            na3 na3Var = this.b;
            if (na3Var.i()) {
                return i.u();
            }
            int q = i.q();
            if (q != 0) {
                if (q != 1) {
                    if (q == 6) {
                        na3 na3Var2 = this.c;
                        na3 na3Var3 = this.d[0];
                        boolean h = na3Var3.h();
                        if (h) {
                            j2 = na3Var2;
                        } else {
                            j2 = na3Var2.j(na3Var3);
                        }
                        if (h) {
                            o = na3Var3;
                        } else {
                            o = na3Var3.o();
                        }
                        na3 n = i.n();
                        if (h) {
                            j3 = n;
                        } else {
                            j3 = n.j(o);
                        }
                        na3 a2 = na3Var2.o().a(j2).a(j3);
                        if (a2.i()) {
                            return new d(i, a2, i.o().n());
                        }
                        na3 o2 = a2.o();
                        if (h) {
                            j4 = a2;
                        } else {
                            j4 = a2.j(o);
                        }
                        na3 o3 = i.o();
                        if (o3.c() < (i.t() >> 1)) {
                            na3 o4 = na3Var2.a(na3Var).o();
                            if (o3.h()) {
                                p = j3.a(o).o();
                            } else {
                                p = j3.p(o3, o.o());
                            }
                            a = o4.a(a2).a(o).j(o4).a(p).a(o2);
                            if (!n.i()) {
                                if (!n.h()) {
                                    a = a.a(n.b().j(j4));
                                }
                                return new d(i, o2, a, new na3[]{j4});
                            }
                        } else {
                            if (!h) {
                                na3Var = na3Var.j(na3Var3);
                            }
                            a = na3Var.p(a2, j2).a(o2);
                        }
                        a = a.a(j4);
                        return new d(i, o2, a, new na3[]{j4});
                    }
                    throw new IllegalStateException("unsupported coordinate system");
                }
                na3 na3Var4 = this.c;
                na3 na3Var5 = this.d[0];
                boolean h2 = na3Var5.h();
                if (h2) {
                    j = na3Var;
                } else {
                    j = na3Var.j(na3Var5);
                }
                if (!h2) {
                    na3Var4 = na3Var4.j(na3Var5);
                }
                na3 o5 = na3Var.o();
                na3 a3 = o5.a(na3Var4);
                na3 o6 = j.o();
                na3 a4 = a3.a(j);
                na3 l = a4.l(a3, o6, i.n());
                return new d(i, j.j(l), o5.o().l(j, l, a4), new na3[]{j.j(o6)});
            }
            na3 a5 = this.c.d(na3Var).a(na3Var);
            na3 a6 = a5.o().a(a5).a(i.n());
            return new d(i, a6, na3Var.p(a6, a5.b()));
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
            if (i.q() != 6) {
                return J().a(jb3Var);
            }
            na3 na3Var2 = jb3Var.b;
            na3 na3Var3 = jb3Var.d[0];
            if (!na3Var2.i() && na3Var3.h()) {
                na3 na3Var4 = this.c;
                na3 na3Var5 = this.d[0];
                na3 na3Var6 = jb3Var.c;
                na3 o = na3Var.o();
                na3 o2 = na3Var4.o();
                na3 o3 = na3Var5.o();
                na3 a = i.n().j(o3).a(o2).a(na3Var4.j(na3Var5));
                na3 b = na3Var6.b();
                na3 l = i.n().a(b).j(o3).a(o2).l(a, o, o3);
                na3 j = na3Var2.j(o3);
                na3 o4 = j.a(a).o();
                if (o4.i()) {
                    if (l.i()) {
                        return jb3Var.J();
                    }
                    return i.u();
                } else if (l.i()) {
                    return new d(i, l, i.o().n());
                } else {
                    na3 j2 = l.o().j(j);
                    na3 j3 = l.j(o4).j(o3);
                    return new d(i, j2, l.a(o4).o().l(a, b, j3), new na3[]{j3});
                }
            }
            return J().a(jb3Var);
        }

        @Override // defpackage.jb3
        public jb3 a(jb3 jb3Var) {
            na3 j;
            na3 j2;
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
            int q = i.q();
            na3 na3Var8 = this.b;
            na3 na3Var9 = jb3Var.b;
            if (q != 0) {
                if (q != 1) {
                    if (q == 6) {
                        if (na3Var8.i()) {
                            if (na3Var9.i()) {
                                return i.u();
                            }
                            return jb3Var.a(this);
                        }
                        na3 na3Var10 = this.c;
                        na3 na3Var11 = this.d[0];
                        na3 na3Var12 = jb3Var.c;
                        na3 na3Var13 = jb3Var.d[0];
                        boolean h = na3Var11.h();
                        if (!h) {
                            na3Var = na3Var9.j(na3Var11);
                            na3Var2 = na3Var12.j(na3Var11);
                        } else {
                            na3Var = na3Var9;
                            na3Var2 = na3Var12;
                        }
                        boolean h2 = na3Var13.h();
                        if (!h2) {
                            na3Var8 = na3Var8.j(na3Var13);
                            na3Var3 = na3Var10.j(na3Var13);
                        } else {
                            na3Var3 = na3Var10;
                        }
                        na3 a = na3Var3.a(na3Var2);
                        na3 a2 = na3Var8.a(na3Var);
                        if (a2.i()) {
                            if (a.i()) {
                                return J();
                            }
                            return i.u();
                        }
                        if (na3Var9.i()) {
                            jb3 A = A();
                            na3 q2 = A.q();
                            na3 r = A.r();
                            na3 d = r.a(na3Var12).d(q2);
                            na3Var5 = d.o().a(d).a(q2).a(i.n());
                            if (na3Var5.i()) {
                                return new d(i, na3Var5, i.o().n());
                            }
                            na3Var7 = d.j(q2.a(na3Var5)).a(na3Var5).a(r).d(na3Var5).a(na3Var5);
                            na3Var6 = i.m(da3.b);
                        } else {
                            na3 o = a2.o();
                            na3 j3 = a.j(na3Var8);
                            na3 j4 = a.j(na3Var);
                            na3 j5 = j3.j(j4);
                            if (j5.i()) {
                                return new d(i, j5, i.o().n());
                            }
                            na3 j6 = a.j(o);
                            if (!h2) {
                                na3Var4 = j6.j(na3Var13);
                            } else {
                                na3Var4 = j6;
                            }
                            na3 p = j4.a(o).p(na3Var4, na3Var10.a(na3Var11));
                            if (!h) {
                                na3Var4 = na3Var4.j(na3Var11);
                            }
                            na3Var5 = j5;
                            na3Var6 = na3Var4;
                            na3Var7 = p;
                        }
                        return new d(i, na3Var5, na3Var7, new na3[]{na3Var6});
                    }
                    throw new IllegalStateException("unsupported coordinate system");
                }
                na3 na3Var14 = this.c;
                na3 na3Var15 = this.d[0];
                na3 na3Var16 = jb3Var.c;
                na3 na3Var17 = jb3Var.d[0];
                boolean h3 = na3Var17.h();
                na3 j7 = na3Var15.j(na3Var16);
                if (h3) {
                    j = na3Var14;
                } else {
                    j = na3Var14.j(na3Var17);
                }
                na3 a3 = j7.a(j);
                na3 j8 = na3Var15.j(na3Var9);
                if (h3) {
                    j2 = na3Var8;
                } else {
                    j2 = na3Var8.j(na3Var17);
                }
                na3 a4 = j8.a(j2);
                if (a4.i()) {
                    if (a3.i()) {
                        return J();
                    }
                    return i.u();
                }
                na3 o2 = a4.o();
                na3 j9 = o2.j(a4);
                if (!h3) {
                    na3Var15 = na3Var15.j(na3Var17);
                }
                na3 a5 = a3.a(a4);
                na3 a6 = a5.l(a3, o2, i.n()).j(na3Var15).a(j9);
                na3 j10 = a4.j(a6);
                if (!h3) {
                    o2 = o2.j(na3Var17);
                }
                return new d(i, j10, a3.l(na3Var8, a4, na3Var14).l(o2, a5, a6), new na3[]{j9.j(na3Var15)});
            }
            na3 na3Var18 = this.c;
            na3 na3Var19 = jb3Var.c;
            na3 a7 = na3Var8.a(na3Var9);
            na3 a8 = na3Var18.a(na3Var19);
            if (a7.i()) {
                if (a8.i()) {
                    return J();
                }
                return i.u();
            }
            na3 d2 = a8.d(a7);
            na3 a9 = d2.o().a(d2).a(a7).a(i.n());
            return new d(i, a9, d2.j(na3Var8.a(a9)).a(a9).a(na3Var18));
        }

        @Override // defpackage.jb3
        protected jb3 d() {
            return new d(null, f(), g());
        }

        @Override // defpackage.jb3
        protected boolean h() {
            na3 n = n();
            if (n.i()) {
                return false;
            }
            na3 o = o();
            int j = j();
            if (j != 5 && j != 6) {
                return o.d(n).s();
            }
            if (o.s() == n.s()) {
                return false;
            }
            return true;
        }

        @Override // defpackage.jb3
        public na3 r() {
            int j = j();
            if (j != 5 && j != 6) {
                return this.c;
            }
            na3 na3Var = this.b;
            na3 na3Var2 = this.c;
            if (!u() && !na3Var.i()) {
                na3 j2 = na3Var2.a(na3Var).j(na3Var);
                if (6 == j) {
                    na3 na3Var3 = this.d[0];
                    if (!na3Var3.h()) {
                        return j2.d(na3Var3);
                    }
                    return j2;
                }
                return j2;
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
            int j = j();
            if (j != 0) {
                if (j != 1) {
                    if (j != 5) {
                        if (j == 6) {
                            na3 na3Var2 = this.c;
                            na3 na3Var3 = this.d[0];
                            return new d(this.a, na3Var, na3Var2.a(na3Var3), new na3[]{na3Var3});
                        }
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    return new d(this.a, na3Var, this.c.b());
                }
                return new d(this.a, na3Var, this.c.a(na3Var), new na3[]{this.d[0]});
            }
            return new d(this.a, na3Var, this.c.a(na3Var));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
            super(ea3Var, na3Var, na3Var2, na3VarArr);
        }
    }

    /* renamed from: jb3$e */
    /* loaded from: classes3.dex */
    public static class e extends c {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
            super(ea3Var, na3Var, na3Var2);
        }

        @Override // defpackage.jb3
        public jb3 H() {
            if (u()) {
                return this;
            }
            na3 na3Var = this.c;
            if (na3Var.i()) {
                return this;
            }
            ea3 i = i();
            int q = i.q();
            if (q != 0) {
                if (q != 4) {
                    return J().a(this);
                }
                return Q(false).a(this);
            }
            na3 na3Var2 = this.b;
            na3 R = R(na3Var);
            na3 o = R.o();
            na3 a = P(na3Var2.o()).a(i().n());
            na3 r = P(na3Var2).j(o).r(a.o());
            if (r.i()) {
                return i().u();
            }
            na3 g = r.j(R).g();
            na3 j = r.j(g).j(a);
            na3 r2 = o.o().j(g).r(j);
            na3 a2 = r2.r(j).j(j.a(r2)).a(na3Var2);
            return new e(i, a2, na3Var2.r(a2).j(r2).r(na3Var));
        }

        @Override // defpackage.jb3
        public jb3 I(int i) {
            na3 na3Var;
            na3 o;
            if (i >= 0) {
                if (i == 0 || u()) {
                    return this;
                }
                if (i == 1) {
                    return J();
                }
                ea3 i2 = i();
                na3 na3Var2 = this.c;
                if (na3Var2.i()) {
                    return i2.u();
                }
                int q = i2.q();
                na3 n = i2.n();
                na3 na3Var3 = this.b;
                na3[] na3VarArr = this.d;
                if (na3VarArr.length < 1) {
                    na3Var = i2.m(da3.b);
                } else {
                    na3Var = na3VarArr[0];
                }
                if (!na3Var.h() && q != 0) {
                    if (q != 1) {
                        if (q != 2) {
                            if (q == 4) {
                                n = O();
                            } else {
                                throw new IllegalStateException("unsupported coordinate system");
                            }
                        } else {
                            o = null;
                        }
                    } else {
                        o = na3Var.o();
                        na3Var3 = na3Var3.j(na3Var);
                        na3Var2 = na3Var2.j(o);
                    }
                    n = L(na3Var, o);
                }
                int i3 = 0;
                while (i3 < i) {
                    if (na3Var2.i()) {
                        return i2.u();
                    }
                    na3 P = P(na3Var3.o());
                    na3 R = R(na3Var2);
                    na3 j = R.j(na3Var2);
                    na3 R2 = R(na3Var3.j(j));
                    na3 R3 = R(j.o());
                    if (!n.i()) {
                        P = P.a(n);
                        n = R(R3.j(n));
                    }
                    na3 r = P.o().r(R(R2));
                    na3Var2 = P.j(R2.r(r)).r(R3);
                    if (na3Var.h()) {
                        na3Var = R;
                    } else {
                        na3Var = R.j(na3Var);
                    }
                    i3++;
                    na3Var3 = r;
                }
                if (q != 0) {
                    if (q != 1) {
                        if (q != 2) {
                            if (q == 4) {
                                return new e(i2, na3Var3, na3Var2, new na3[]{na3Var, n});
                            }
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                        return new e(i2, na3Var3, na3Var2, new na3[]{na3Var});
                    }
                    return new e(i2, na3Var3.j(na3Var), na3Var2, new na3[]{na3Var.j(na3Var.o())});
                }
                na3 g = na3Var.g();
                na3 o2 = g.o();
                return new e(i2, na3Var3.j(o2), na3Var2.j(o2.j(g)));
            }
            throw new IllegalArgumentException("'e' cannot be negative");
        }

        @Override // defpackage.jb3
        public jb3 J() {
            na3 j;
            na3 j2;
            na3 o;
            na3 na3Var;
            na3 j3;
            na3 o2;
            if (u()) {
                return this;
            }
            ea3 i = i();
            na3 na3Var2 = this.c;
            if (na3Var2.i()) {
                return i.u();
            }
            int q = i.q();
            na3 na3Var3 = this.b;
            if (q != 0) {
                if (q != 1) {
                    if (q != 2) {
                        if (q == 4) {
                            return Q(true);
                        }
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    na3 na3Var4 = this.d[0];
                    boolean h = na3Var4.h();
                    na3 o3 = na3Var2.o();
                    na3 o4 = o3.o();
                    na3 n = i.n();
                    na3 m = n.m();
                    if (m.t().equals(BigInteger.valueOf(3L))) {
                        if (h) {
                            o2 = na3Var4;
                        } else {
                            o2 = na3Var4.o();
                        }
                        na3Var = P(na3Var3.a(o2).j(na3Var3.r(o2)));
                        j3 = o3.j(na3Var3);
                    } else {
                        na3 P = P(na3Var3.o());
                        if (!h) {
                            if (!n.i()) {
                                na3 o5 = na3Var4.o().o();
                                if (m.c() < n.c()) {
                                    na3Var = P.r(o5.j(m));
                                } else {
                                    n = o5.j(n);
                                }
                            } else {
                                na3Var = P;
                            }
                            j3 = na3Var3.j(o3);
                        }
                        na3Var = P.a(n);
                        j3 = na3Var3.j(o3);
                    }
                    na3 N = N(j3);
                    na3 r = na3Var.o().r(R(N));
                    na3 r2 = N.r(r).j(na3Var).r(M(o4));
                    na3 R = R(na3Var2);
                    if (!h) {
                        R = R.j(na3Var4);
                    }
                    return new e(i, r, r2, new na3[]{R});
                }
                na3 na3Var5 = this.d[0];
                boolean h2 = na3Var5.h();
                na3 n2 = i.n();
                if (!n2.i() && !h2) {
                    n2 = n2.j(na3Var5.o());
                }
                na3 a = n2.a(P(na3Var3.o()));
                if (h2) {
                    j = na3Var2;
                } else {
                    j = na3Var2.j(na3Var5);
                }
                if (h2) {
                    j2 = na3Var2.o();
                } else {
                    j2 = j.j(na3Var2);
                }
                na3 N2 = N(na3Var3.j(j2));
                na3 r3 = a.o().r(R(N2));
                na3 R2 = R(j);
                na3 j4 = r3.j(R2);
                na3 R3 = R(j2);
                na3 r4 = N2.r(r3).j(a).r(R(R3.o()));
                if (h2) {
                    o = R(R3);
                } else {
                    o = R2.o();
                }
                return new e(i, j4, r4, new na3[]{R(o).j(j)});
            }
            na3 d = P(na3Var3.o()).a(i().n()).d(R(na3Var2));
            na3 r5 = d.o().r(R(na3Var3));
            return new e(i, r5, d.j(na3Var3.r(r5)).r(na3Var2));
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
            na3 na3Var = this.c;
            if (na3Var.i()) {
                return jb3Var;
            }
            ea3 i = i();
            int q = i.q();
            if (q != 0) {
                if (q != 4) {
                    return J().a(jb3Var);
                }
                return Q(false).a(jb3Var);
            }
            na3 na3Var2 = this.b;
            na3 na3Var3 = jb3Var.b;
            na3 na3Var4 = jb3Var.c;
            na3 r = na3Var3.r(na3Var2);
            na3 r2 = na3Var4.r(na3Var);
            if (r.i()) {
                if (r2.i()) {
                    return H();
                }
                return this;
            }
            na3 o = r.o();
            na3 r3 = o.j(R(na3Var2).a(na3Var3)).r(r2.o());
            if (r3.i()) {
                return i.u();
            }
            na3 g = r3.j(r).g();
            na3 j = r3.j(g).j(r2);
            na3 r4 = R(na3Var).j(o).j(r).j(g).r(j);
            na3 a = r4.r(j).j(j.a(r4)).a(na3Var3);
            return new e(i, a, na3Var2.r(a).j(r4).r(na3Var));
        }

        protected na3 L(na3 na3Var, na3 na3Var2) {
            na3 n = i().n();
            if (!n.i() && !na3Var.h()) {
                if (na3Var2 == null) {
                    na3Var2 = na3Var.o();
                }
                na3 o = na3Var2.o();
                na3 m = n.m();
                if (m.c() < n.c()) {
                    return o.j(m).m();
                }
                return o.j(n);
            }
            return n;
        }

        protected na3 M(na3 na3Var) {
            return N(R(na3Var));
        }

        protected na3 N(na3 na3Var) {
            return R(R(na3Var));
        }

        protected na3 O() {
            na3[] na3VarArr = this.d;
            na3 na3Var = na3VarArr[1];
            if (na3Var == null) {
                na3 L = L(na3VarArr[0], null);
                na3VarArr[1] = L;
                return L;
            }
            return na3Var;
        }

        protected na3 P(na3 na3Var) {
            return R(na3Var).a(na3Var);
        }

        protected e Q(boolean z) {
            na3 na3Var;
            na3 na3Var2 = this.b;
            na3 na3Var3 = this.c;
            na3 na3Var4 = this.d[0];
            na3 O = O();
            na3 a = P(na3Var2.o()).a(O);
            na3 R = R(na3Var3);
            na3 j = R.j(na3Var3);
            na3 R2 = R(na3Var2.j(j));
            na3 r = a.o().r(R(R2));
            na3 R3 = R(j.o());
            na3 r2 = a.j(R2.r(r)).r(R3);
            if (z) {
                na3Var = R(R3.j(O));
            } else {
                na3Var = null;
            }
            if (!na3Var4.h()) {
                R = R.j(na3Var4);
            }
            return new e(i(), r, r2, new na3[]{R, na3Var});
        }

        protected na3 R(na3 na3Var) {
            return na3Var.a(na3Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
        @Override // defpackage.jb3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public defpackage.jb3 a(defpackage.jb3 r17) {
            /*
                Method dump skipped, instructions count: 532
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jb3.e.a(jb3):jb3");
        }

        @Override // defpackage.jb3
        protected jb3 d() {
            return new e(null, f(), g());
        }

        @Override // defpackage.jb3
        public na3 s(int i) {
            if (i == 1 && 4 == j()) {
                return O();
            }
            return super.s(i);
        }

        @Override // defpackage.jb3
        public jb3 z() {
            if (u()) {
                return this;
            }
            ea3 i = i();
            if (i.q() != 0) {
                return new e(i, this.b, this.c.m(), this.d);
            }
            return new e(i, this.b, this.c.m());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
            super(ea3Var, na3Var, na3Var2, na3VarArr);
        }
    }

    protected jb3(ea3 ea3Var, na3 na3Var, na3 na3Var2) {
        this(ea3Var, na3Var, na3Var2, m(ea3Var));
    }

    protected static na3[] m(ea3 ea3Var) {
        int q;
        if (ea3Var == null) {
            q = 0;
        } else {
            q = ea3Var.q();
        }
        if (q != 0 && q != 5) {
            na3 m = ea3Var.m(da3.b);
            if (q != 1 && q != 2) {
                if (q == 3) {
                    return new na3[]{m, m, m};
                }
                if (q == 4) {
                    return new na3[]{m, ea3Var.n()};
                }
                if (q != 6) {
                    throw new IllegalArgumentException("unknown coordinate system");
                }
            }
            return new na3[]{m};
        }
        return f;
    }

    public jb3 A() {
        if (u()) {
            return this;
        }
        int j = j();
        if (j != 0 && j != 5) {
            na3 s = s(0);
            if (s.h()) {
                return this;
            }
            if (this.a != null) {
                na3 C = this.a.C(b32.b());
                return B(s.j(C).g().j(C));
            }
            throw new IllegalStateException("Detached points must be in affine coordinates");
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jb3 B(na3 na3Var) {
        int j = j();
        if (j != 1) {
            if (j != 2 && j != 3 && j != 4) {
                if (j != 6) {
                    throw new IllegalStateException("not a projective coordinate system");
                }
            } else {
                na3 o = na3Var.o();
                return c(o, o.j(na3Var));
            }
        }
        return c(na3Var, na3Var);
    }

    protected abstract boolean C();

    protected boolean D() {
        BigInteger w;
        if (da3.b.equals(this.a.p()) || (w = this.a.w()) == null || ca3.q(this, w).u()) {
            return true;
        }
        return false;
    }

    public jb3 E(na3 na3Var) {
        if (u()) {
            return this;
        }
        return i().i(n().j(na3Var), o(), p());
    }

    public jb3 F(na3 na3Var) {
        if (u()) {
            return this;
        }
        return i().i(n(), o().j(na3Var), p());
    }

    public abstract jb3 G(jb3 jb3Var);

    public jb3 H() {
        return K(this);
    }

    public jb3 I(int i) {
        if (i >= 0) {
            jb3 jb3Var = this;
            while (true) {
                i--;
                if (i >= 0) {
                    jb3Var = jb3Var.J();
                } else {
                    return jb3Var;
                }
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    public abstract jb3 J();

    public jb3 K(jb3 jb3Var) {
        return J().a(jb3Var);
    }

    public abstract jb3 a(jb3 jb3Var);

    protected void b() {
        if (v()) {
            return;
        }
        throw new IllegalStateException("point not in normal form");
    }

    protected jb3 c(na3 na3Var, na3 na3Var2) {
        return i().h(n().j(na3Var), o().j(na3Var2));
    }

    protected abstract jb3 d();

    public boolean e(jb3 jb3Var) {
        boolean z;
        boolean z2;
        jb3 jb3Var2;
        if (jb3Var == null) {
            return false;
        }
        ea3 i = i();
        ea3 i2 = jb3Var.i();
        if (i == null) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean u = u();
        boolean u2 = jb3Var.u();
        if (!u && !u2) {
            if (!z || !z2) {
                if (z) {
                    jb3Var = jb3Var.A();
                } else {
                    if (z2) {
                        jb3Var2 = A();
                    } else if (!i.l(i2)) {
                        return false;
                    } else {
                        jb3[] jb3VarArr = {this, i.x(jb3Var)};
                        i.z(jb3VarArr);
                        jb3Var2 = jb3VarArr[0];
                        jb3Var = jb3VarArr[1];
                    }
                    if (!jb3Var2.q().equals(jb3Var.q()) && jb3Var2.r().equals(jb3Var.r())) {
                        return true;
                    }
                }
            }
            jb3Var2 = this;
            return !jb3Var2.q().equals(jb3Var.q()) ? false : false;
        } else if (!u || !u2) {
            return false;
        } else {
            if (!z && !z2 && !i.l(i2)) {
                return false;
            }
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jb3)) {
            return false;
        }
        return e((jb3) obj);
    }

    public na3 f() {
        b();
        return q();
    }

    public na3 g() {
        b();
        return r();
    }

    protected abstract boolean h();

    public int hashCode() {
        int i;
        ea3 i2 = i();
        if (i2 == null) {
            i = 0;
        } else {
            i = ~i2.hashCode();
        }
        if (!u()) {
            jb3 A = A();
            return (i ^ (A.q().hashCode() * 17)) ^ (A.r().hashCode() * 257);
        }
        return i;
    }

    public ea3 i() {
        return this.a;
    }

    protected int j() {
        ea3 ea3Var = this.a;
        if (ea3Var == null) {
            return 0;
        }
        return ea3Var.q();
    }

    public final jb3 k() {
        return A().d();
    }

    public byte[] l(boolean z) {
        int i;
        if (u()) {
            return new byte[1];
        }
        jb3 A = A();
        byte[] e2 = A.q().e();
        if (z) {
            byte[] bArr = new byte[e2.length + 1];
            if (A.h()) {
                i = 3;
            } else {
                i = 2;
            }
            bArr[0] = (byte) i;
            System.arraycopy(e2, 0, bArr, 1, e2.length);
            return bArr;
        }
        byte[] e3 = A.r().e();
        byte[] bArr2 = new byte[e2.length + e3.length + 1];
        bArr2[0] = 4;
        System.arraycopy(e2, 0, bArr2, 1, e2.length);
        System.arraycopy(e3, 0, bArr2, e2.length + 1, e3.length);
        return bArr2;
    }

    public final na3 n() {
        return this.b;
    }

    public final na3 o() {
        return this.c;
    }

    protected final na3[] p() {
        return this.d;
    }

    public na3 q() {
        return this.b;
    }

    public na3 r() {
        return this.c;
    }

    public na3 s(int i) {
        if (i >= 0) {
            na3[] na3VarArr = this.d;
            if (i < na3VarArr.length) {
                return na3VarArr[i];
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(boolean z, boolean z2) {
        if (u()) {
            return true;
        }
        return !((cwb) i().B(this, "bc_validity", new a(z, z2))).b();
    }

    public String toString() {
        if (u()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        stringBuffer.append(n());
        stringBuffer.append(CoreConstants.COMMA_CHAR);
        stringBuffer.append(o());
        for (int i = 0; i < this.d.length; i++) {
            stringBuffer.append(CoreConstants.COMMA_CHAR);
            stringBuffer.append(this.d[i]);
        }
        stringBuffer.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return stringBuffer.toString();
    }

    public boolean u() {
        if (this.b != null && this.c != null) {
            na3[] na3VarArr = this.d;
            if (na3VarArr.length <= 0 || !na3VarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public boolean v() {
        int j = j();
        if (j != 0 && j != 5 && !u() && !this.d[0].h()) {
            return false;
        }
        return true;
    }

    public boolean w() {
        return t(false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return t(false, false);
    }

    public jb3 y(BigInteger bigInteger) {
        return i().v().a(this, bigInteger);
    }

    public abstract jb3 z();

    protected jb3(ea3 ea3Var, na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        this.e = null;
        this.a = ea3Var;
        this.b = na3Var;
        this.c = na3Var2;
        this.d = na3VarArr;
    }
}
