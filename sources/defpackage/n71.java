package defpackage;

import defpackage.i71;
import java.util.Comparator;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: ChronoZonedDateTime.java */
/* renamed from: n71  reason: default package */
/* loaded from: classes3.dex */
public abstract class n71<D extends i71> extends kq2 implements p8b, Comparable<n71<?>> {
    private static Comparator<n71<?>> a = new a();

    /* compiled from: ChronoZonedDateTime.java */
    /* renamed from: n71$a */
    /* loaded from: classes3.dex */
    class a implements Comparator<n71<?>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(n71<?> n71Var, n71<?> n71Var2) {
            int b = g95.b(n71Var.m0(), n71Var2.m0());
            if (b == 0) {
                return g95.b(n71Var.r0().N0(), n71Var2.r0().N0());
            }
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoZonedDateTime.java */
    /* renamed from: n71$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.S4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.T4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract n71<D> E0(vcc vccVar);

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.S4 && u8bVar != h71.T4) {
                return p0().K(u8bVar);
            }
            return u8bVar.s();
        }
        return u8bVar.k(this);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar != v8b.g() && w8bVar != v8b.f()) {
            if (w8bVar == v8b.a()) {
                return (R) o0().T();
            }
            if (w8bVar == v8b.e()) {
                return (R) m71.NANOS;
            }
            if (w8bVar == v8b.d()) {
                return (R) T();
            }
            if (w8bVar == v8b.b()) {
                return (R) ds5.Z0(o0().m0());
            }
            if (w8bVar == v8b.c()) {
                return (R) r0();
            }
            return (R) super.M(w8bVar);
        }
        return (R) b0();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [i71] */
    @Override // java.lang.Comparable
    /* renamed from: P */
    public int compareTo(n71<?> n71Var) {
        int b2 = g95.b(m0(), n71Var.m0());
        if (b2 == 0) {
            int f0 = r0().f0() - n71Var.r0().f0();
            if (f0 == 0) {
                int compareTo = p0().compareTo(n71Var.p0());
                if (compareTo == 0) {
                    int compareTo2 = b0().getId().compareTo(n71Var.b0().getId());
                    if (compareTo2 == 0) {
                        return o0().T().compareTo(n71Var.o0().T());
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return f0;
        }
        return b2;
    }

    public String Q(an2 an2Var) {
        g95.i(an2Var, "formatter");
        return an2Var.b(this);
    }

    public abstract wcc T();

    public abstract vcc b0();

    public boolean e0(n71<?> n71Var) {
        int i = (m0() > n71Var.m0() ? 1 : (m0() == n71Var.m0() ? 0 : -1));
        if (i <= 0 && (i != 0 || r0().f0() <= n71Var.r0().f0())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n71) && compareTo((n71) obj) == 0) {
            return true;
        }
        return false;
    }

    public boolean f0(n71<?> n71Var) {
        int i = (m0() > n71Var.m0() ? 1 : (m0() == n71Var.m0() ? 0 : -1));
        if (i >= 0 && (i != 0 || r0().f0() >= n71Var.r0().f0())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: h0 */
    public n71<D> i(long j, x8b x8bVar) {
        return o0().T().s(super.i(j, x8bVar));
    }

    public int hashCode() {
        return (p0().hashCode() ^ T().hashCode()) ^ Integer.rotateLeft(b0().hashCode(), 3);
    }

    @Override // defpackage.p8b
    /* renamed from: l0 */
    public abstract n71<D> L(long j, x8b x8bVar);

    public long m0() {
        return ((o0().m0() * 86400) + r0().O0()) - T().b0();
    }

    public D o0() {
        return p0().o0();
    }

    public abstract j71<D> p0();

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = b.a[((h71) u8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return p0().q(u8bVar);
                }
                return T().b0();
            }
            return m0();
        }
        return u8bVar.q(this);
    }

    public gs5 r0() {
        return p0().p0();
    }

    public String toString() {
        String str = p0().toString() + T().toString();
        if (T() != b0()) {
            return str + '[' + b0().toString() + ']';
        }
        return str;
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = b.a[((h71) u8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return p0().w(u8bVar);
                }
                return T().b0();
            }
            throw new UnsupportedTemporalTypeException("Field too large for an int: " + u8bVar);
        }
        return super.w(u8bVar);
    }

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: x0 */
    public n71<D> s(r8b r8bVar) {
        return o0().T().s(super.s(r8bVar));
    }

    @Override // defpackage.p8b
    /* renamed from: z0 */
    public abstract n71<D> H(u8b u8bVar, long j);
}
