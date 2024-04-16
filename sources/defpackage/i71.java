package defpackage;

import java.util.Comparator;
/* compiled from: ChronoLocalDate.java */
/* renamed from: i71  reason: default package */
/* loaded from: classes3.dex */
public abstract class i71 extends kq2 implements p8b, r8b, Comparable<i71> {
    private static final Comparator<i71> a = new a();

    /* compiled from: ChronoLocalDate.java */
    /* renamed from: i71$a */
    /* loaded from: classes3.dex */
    class a implements Comparator<i71> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i71 i71Var, i71 i71Var2) {
            return g95.b(i71Var.m0(), i71Var2.m0());
        }
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            return u8bVar.a();
        }
        if (u8bVar != null && u8bVar.i(this)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.a()) {
            return (R) T();
        }
        if (w8bVar == v8b.e()) {
            return (R) m71.DAYS;
        }
        if (w8bVar == v8b.b()) {
            return (R) ds5.Z0(m0());
        }
        if (w8bVar != v8b.c() && w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d()) {
            return (R) super.M(w8bVar);
        }
        return null;
    }

    public j71<?> P(gs5 gs5Var) {
        return k71.z0(this, gs5Var);
    }

    @Override // java.lang.Comparable
    /* renamed from: Q */
    public int compareTo(i71 i71Var) {
        int b = g95.b(m0(), i71Var.m0());
        if (b == 0) {
            return T().compareTo(i71Var.T());
        }
        return b;
    }

    public abstract p71 T();

    public ek3 b0() {
        return T().u(w(h71.Z));
    }

    public boolean e0(i71 i71Var) {
        if (m0() < i71Var.m0()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i71) && compareTo((i71) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: f0 */
    public i71 i(long j, x8b x8bVar) {
        return T().o(super.i(j, x8bVar));
    }

    @Override // defpackage.p8b
    /* renamed from: h0 */
    public abstract i71 L(long j, x8b x8bVar);

    public int hashCode() {
        long m0 = m0();
        return T().hashCode() ^ ((int) (m0 ^ (m0 >>> 32)));
    }

    public i71 l0(t8b t8bVar) {
        return T().o(super.N(t8bVar));
    }

    public long m0() {
        return q(h71.y);
    }

    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.y, m0());
    }

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: o0 */
    public i71 s(r8b r8bVar) {
        return T().o(super.s(r8bVar));
    }

    @Override // defpackage.p8b
    /* renamed from: p0 */
    public abstract i71 H(u8b u8bVar, long j);

    public String toString() {
        String str;
        long q = q(h71.X);
        long q2 = q(h71.B);
        long q3 = q(h71.w);
        StringBuilder sb = new StringBuilder(30);
        sb.append(T().toString());
        sb.append(" ");
        sb.append(b0());
        sb.append(" ");
        sb.append(q);
        String str2 = "-";
        if (q2 >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append(q2);
        if (q3 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append(q3);
        return sb.toString();
    }
}
