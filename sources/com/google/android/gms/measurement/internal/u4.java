package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class u4 {
    private long A;
    private String B;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private long H;
    private String I;
    private boolean J;
    private long K;
    private long L;
    private final u5 a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private String q;
    private Boolean r;
    private long s;
    private List<String> t;
    private String u;
    private boolean v;
    private long w;
    private long x;
    private int y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(u5 u5Var, String str) {
        gh8.j(u5Var);
        gh8.f(str);
        this.a = u5Var;
        this.b = str;
        u5Var.k().l();
    }

    public final long A() {
        this.a.k().l();
        return this.k;
    }

    public final void B(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.K != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.K = j;
    }

    public final void C(String str) {
        this.a.k().l();
        this.J |= !Objects.equals(this.l, str);
        this.l = str;
    }

    public final void D(boolean z) {
        boolean z2;
        this.a.k().l();
        boolean z3 = this.J;
        if (this.v != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.J = z3 | z2;
        this.v = z;
    }

    public final long E() {
        this.a.k().l();
        return this.A;
    }

    public final void F(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.F != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.F = j;
    }

    public final void G(String str) {
        this.a.k().l();
        this.J |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final void H(boolean z) {
        boolean z2;
        this.a.k().l();
        boolean z3 = this.J;
        if (this.z != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.J = z3 | z2;
        this.z = z;
    }

    public final long I() {
        this.a.k().l();
        return this.K;
    }

    public final void J(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.G != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.G = j;
    }

    public final void K(String str) {
        this.a.k().l();
        this.J |= !Objects.equals(this.f, str);
        this.f = str;
    }

    public final long L() {
        this.a.k().l();
        return this.F;
    }

    public final void M(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.E != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.E = j;
    }

    public final void N(String str) {
        this.a.k().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.J |= !Objects.equals(this.d, str);
        this.d = str;
    }

    public final long O() {
        this.a.k().l();
        return this.G;
    }

    public final void P(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.D != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.D = j;
    }

    public final void Q(String str) {
        this.a.k().l();
        this.J |= !Objects.equals(this.I, str);
        this.I = str;
    }

    public final long R() {
        this.a.k().l();
        return this.E;
    }

    public final void S(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.H != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.H = j;
    }

    public final void T(String str) {
        this.a.k().l();
        this.J |= !Objects.equals(this.e, str);
        this.e = str;
    }

    public final long U() {
        this.a.k().l();
        return this.D;
    }

    public final void V(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.C != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.C = j;
    }

    public final void W(String str) {
        this.a.k().l();
        this.J |= !Objects.equals(this.u, str);
        this.u = str;
    }

    public final long X() {
        this.a.k().l();
        return this.H;
    }

    public final void Y(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.n != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.n = j;
    }

    public final void Z(String str) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.B != str) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.B = str;
    }

    public final int a() {
        this.a.k().l();
        return this.y;
    }

    public final long a0() {
        this.a.k().l();
        return this.C;
    }

    public final void b(int i) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.y != i) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.y = i;
    }

    public final void b0(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.s != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.s = j;
    }

    public final void c(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.k != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.k = j;
    }

    public final long c0() {
        this.a.k().l();
        return this.n;
    }

    public final void d(Boolean bool) {
        this.a.k().l();
        this.J |= !Objects.equals(this.r, bool);
        this.r = bool;
    }

    public final void d0(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.L != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.L = j;
    }

    public final void e(String str) {
        this.a.k().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.J |= !Objects.equals(this.q, str);
        this.q = str;
    }

    public final long e0() {
        this.a.k().l();
        return this.s;
    }

    public final void f(List<String> list) {
        ArrayList arrayList;
        this.a.k().l();
        if (!Objects.equals(this.t, list)) {
            this.J = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.t = arrayList;
        }
    }

    public final void f0(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.m != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.m = j;
    }

    public final void g(boolean z) {
        boolean z2;
        this.a.k().l();
        boolean z3 = this.J;
        if (this.p != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.J = z3 | z2;
        this.p = z;
    }

    public final long g0() {
        this.a.k().l();
        return this.L;
    }

    public final String h() {
        this.a.k().l();
        return this.j;
    }

    public final void h0(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.i != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.i = j;
    }

    public final String i() {
        this.a.k().l();
        return this.f;
    }

    public final long i0() {
        this.a.k().l();
        return this.m;
    }

    public final String j() {
        this.a.k().l();
        return this.d;
    }

    public final void j0(long j) {
        boolean z;
        boolean z2 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        gh8.a(z);
        this.a.k().l();
        boolean z3 = this.J;
        if (this.g != j) {
            z2 = true;
        }
        this.J = z3 | z2;
        this.g = j;
    }

    public final String k() {
        this.a.k().l();
        return this.I;
    }

    public final long k0() {
        this.a.k().l();
        return this.i;
    }

    public final String l() {
        this.a.k().l();
        return this.e;
    }

    public final void l0(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.h != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.h = j;
    }

    public final String m() {
        this.a.k().l();
        return this.u;
    }

    public final long m0() {
        this.a.k().l();
        return this.g;
    }

    public final String n() {
        this.a.k().l();
        return this.B;
    }

    public final void n0(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.x != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.x = j;
    }

    public final List<String> o() {
        this.a.k().l();
        return this.t;
    }

    public final long o0() {
        this.a.k().l();
        return this.h;
    }

    public final void p() {
        this.a.k().l();
        this.J = false;
    }

    public final void p0(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.w != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.w = j;
    }

    public final void q() {
        this.a.k().l();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.n().K().b("Bundle index overflow. appId", k4.u(this.b));
            j = 0;
        }
        this.J = true;
        this.g = j;
    }

    public final long q0() {
        this.a.k().l();
        return this.x;
    }

    public final boolean r() {
        this.a.k().l();
        return this.p;
    }

    public final long r0() {
        this.a.k().l();
        return this.w;
    }

    public final boolean s() {
        this.a.k().l();
        return this.o;
    }

    public final Boolean s0() {
        this.a.k().l();
        return this.r;
    }

    public final boolean t() {
        this.a.k().l();
        return this.J;
    }

    public final String t0() {
        this.a.k().l();
        return this.q;
    }

    public final boolean u() {
        this.a.k().l();
        return this.v;
    }

    public final String u0() {
        this.a.k().l();
        String str = this.I;
        Q(null);
        return str;
    }

    public final boolean v() {
        this.a.k().l();
        return this.z;
    }

    public final String v0() {
        this.a.k().l();
        return this.b;
    }

    public final long w() {
        this.a.k().l();
        return 0L;
    }

    public final String w0() {
        this.a.k().l();
        return this.c;
    }

    public final void x(long j) {
        boolean z;
        this.a.k().l();
        boolean z2 = this.J;
        if (this.A != j) {
            z = true;
        } else {
            z = false;
        }
        this.J = z2 | z;
        this.A = j;
    }

    public final String x0() {
        this.a.k().l();
        return this.l;
    }

    public final void y(String str) {
        this.a.k().l();
        this.J |= !Objects.equals(this.c, str);
        this.c = str;
    }

    public final void z(boolean z) {
        boolean z2;
        this.a.k().l();
        boolean z3 = this.J;
        if (this.o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.J = z3 | z2;
        this.o = z;
    }
}
