package defpackage;

import defpackage.i71;
import java.util.Comparator;
/* compiled from: ChronoLocalDateTime.java */
/* renamed from: j71  reason: default package */
/* loaded from: classes3.dex */
public abstract class j71<D extends i71> extends kq2 implements p8b, r8b, Comparable<j71<?>> {
    private static final Comparator<j71<?>> a = new a();

    /* compiled from: ChronoLocalDateTime.java */
    /* renamed from: j71$a */
    /* loaded from: classes3.dex */
    class a implements Comparator<j71<?>> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [i71] */
        /* JADX WARN: Type inference failed for: r2v0, types: [i71] */
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(j71<?> j71Var, j71<?> j71Var2) {
            int b = g95.b(j71Var.o0().m0(), j71Var2.o0().m0());
            if (b == 0) {
                return g95.b(j71Var.p0().N0(), j71Var2.p0().N0());
            }
            return b;
        }
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.a()) {
            return (R) T();
        }
        if (w8bVar == v8b.e()) {
            return (R) m71.NANOS;
        }
        if (w8bVar == v8b.b()) {
            return (R) ds5.Z0(o0().m0());
        }
        if (w8bVar == v8b.c()) {
            return (R) p0();
        }
        if (w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d()) {
            return (R) super.M(w8bVar);
        }
        return null;
    }

    public abstract n71<D> P(vcc vccVar);

    @Override // java.lang.Comparable
    /* renamed from: Q */
    public int compareTo(j71<?> j71Var) {
        int compareTo = o0().compareTo(j71Var.o0());
        if (compareTo == 0) {
            int compareTo2 = p0().compareTo(j71Var.p0());
            if (compareTo2 == 0) {
                return T().compareTo(j71Var.T());
            }
            return compareTo2;
        }
        return compareTo;
    }

    public p71 T() {
        return o0().T();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i71] */
    public boolean b0(j71<?> j71Var) {
        int i = (o0().m0() > j71Var.o0().m0() ? 1 : (o0().m0() == j71Var.o0().m0() ? 0 : -1));
        if (i <= 0 && (i != 0 || p0().N0() <= j71Var.p0().N0())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i71] */
    public boolean e0(j71<?> j71Var) {
        int i = (o0().m0() > j71Var.o0().m0() ? 1 : (o0().m0() == j71Var.o0().m0() ? 0 : -1));
        if (i >= 0 && (i != 0 || p0().N0() >= j71Var.p0().N0())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j71) && compareTo((j71) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: f0 */
    public j71<D> i(long j, x8b x8bVar) {
        return o0().T().q(super.i(j, x8bVar));
    }

    @Override // defpackage.p8b
    /* renamed from: h0 */
    public abstract j71<D> L(long j, x8b x8bVar);

    public int hashCode() {
        return o0().hashCode() ^ p0().hashCode();
    }

    public long l0(wcc wccVar) {
        g95.i(wccVar, "offset");
        return ((o0().m0() * 86400) + p0().O0()) - wccVar.b0();
    }

    public b55 m0(wcc wccVar) {
        return b55.m0(l0(wccVar), p0().f0());
    }

    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.y, o0().m0()).H(h71.f, p0().N0());
    }

    public abstract D o0();

    public abstract gs5 p0();

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: r0 */
    public j71<D> s(r8b r8bVar) {
        return o0().T().q(super.s(r8bVar));
    }

    public String toString() {
        return o0().toString() + 'T' + p0().toString();
    }

    @Override // defpackage.p8b
    /* renamed from: x0 */
    public abstract j71<D> H(u8b u8bVar, long j);
}
