package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;
import org.threeten.bp.DateTimeException;
/* compiled from: OffsetDateTime.java */
/* renamed from: v67  reason: default package */
/* loaded from: classes3.dex */
public final class v67 extends kq2 implements p8b, r8b, Comparable<v67>, Serializable {
    public static final v67 c = es5.d.z0(wcc.j);
    public static final v67 d = es5.e.z0(wcc.i);
    public static final w8b<v67> e = new a();
    private static final Comparator<v67> f = new b();
    private final es5 a;
    private final wcc b;

    /* compiled from: OffsetDateTime.java */
    /* renamed from: v67$a */
    /* loaded from: classes3.dex */
    class a implements w8b<v67> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public v67 a(q8b q8bVar) {
            return v67.Q(q8bVar);
        }
    }

    /* compiled from: OffsetDateTime.java */
    /* renamed from: v67$b */
    /* loaded from: classes3.dex */
    class b implements Comparator<v67> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(v67 v67Var, v67 v67Var2) {
            int b = g95.b(v67Var.o0(), v67Var2.o0());
            if (b == 0) {
                return g95.b(v67Var.T(), v67Var2.T());
            }
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OffsetDateTime.java */
    /* renamed from: v67$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {
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

    private v67(es5 es5Var, wcc wccVar) {
        this.a = (es5) g95.i(es5Var, "dateTime");
        this.b = (wcc) g95.i(wccVar, "offset");
    }

    public static v67 Q(q8b q8bVar) {
        if (q8bVar instanceof v67) {
            return (v67) q8bVar;
        }
        try {
            wcc W = wcc.W(q8bVar);
            try {
                return f0(es5.J0(q8bVar), W);
            } catch (DateTimeException unused) {
                return h0(b55.Q(q8bVar), W);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
        }
    }

    public static v67 f0(es5 es5Var, wcc wccVar) {
        return new v67(es5Var, wccVar);
    }

    public static v67 h0(b55 b55Var, vcc vccVar) {
        g95.i(b55Var, "instant");
        g95.i(vccVar, "zone");
        wcc a2 = vccVar.u().a(b55Var);
        return new v67(es5.Q0(b55Var.T(), b55Var.b0(), a2), a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v67 m0(DataInput dataInput) throws IOException {
        return f0(es5.Z0(dataInput), wcc.m0(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 69, this);
    }

    private v67 z0(es5 es5Var, wcc wccVar) {
        if (this.a == es5Var && this.b.equals(wccVar)) {
            return this;
        }
        return new v67(es5Var, wccVar);
    }

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: E0 */
    public v67 s(r8b r8bVar) {
        if (!(r8bVar instanceof ds5) && !(r8bVar instanceof gs5) && !(r8bVar instanceof es5)) {
            if (r8bVar instanceof b55) {
                return h0((b55) r8bVar, this.b);
            }
            if (r8bVar instanceof wcc) {
                return z0(this.a, (wcc) r8bVar);
            }
            if (r8bVar instanceof v67) {
                return (v67) r8bVar;
            }
            return (v67) r8bVar.o(this);
        }
        return z0(this.a.s(r8bVar), this.b);
    }

    @Override // defpackage.p8b
    /* renamed from: F0 */
    public v67 H(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            int i = c.a[h71Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return z0(this.a.x0(u8bVar, j), this.b);
                }
                return z0(this.a, wcc.h0(h71Var.x(j)));
            }
            return h0(b55.m0(j, T()), this.b);
        }
        return (v67) u8bVar.o(this, j);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (!(u8bVar instanceof h71) && (u8bVar == null || !u8bVar.i(this))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(DataOutput dataOutput) throws IOException {
        this.a.e1(dataOutput);
        this.b.p0(dataOutput);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.S4 && u8bVar != h71.T4) {
                return this.a.K(u8bVar);
            }
            return u8bVar.s();
        }
        return u8bVar.k(this);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.a()) {
            return (R) t75.e;
        }
        if (w8bVar == v8b.e()) {
            return (R) m71.NANOS;
        }
        if (w8bVar != v8b.d() && w8bVar != v8b.f()) {
            if (w8bVar == v8b.b()) {
                return (R) p0();
            }
            if (w8bVar == v8b.c()) {
                return (R) x0();
            }
            if (w8bVar == v8b.g()) {
                return null;
            }
            return (R) super.M(w8bVar);
        }
        return (R) b0();
    }

    @Override // java.lang.Comparable
    /* renamed from: P */
    public int compareTo(v67 v67Var) {
        if (b0().equals(v67Var.b0())) {
            return r0().compareTo(v67Var.r0());
        }
        int b2 = g95.b(o0(), v67Var.o0());
        if (b2 == 0) {
            int f0 = x0().f0() - v67Var.x0().f0();
            if (f0 == 0) {
                return r0().compareTo(v67Var.r0());
            }
            return f0;
        }
        return b2;
    }

    public int T() {
        return this.a.K0();
    }

    public wcc b0() {
        return this.b;
    }

    @Override // defpackage.kq2, defpackage.p8b
    /* renamed from: e0 */
    public v67 i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return L(Long.MAX_VALUE, x8bVar).L(1L, x8bVar);
        }
        return L(-j, x8bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v67)) {
            return false;
        }
        v67 v67Var = (v67) obj;
        if (this.a.equals(v67Var.a) && this.b.equals(v67Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // defpackage.p8b
    /* renamed from: l0 */
    public v67 L(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            return z0(this.a.h0(j, x8bVar), this.b);
        }
        return (v67) x8bVar.i(this, j);
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.y, p0().m0()).H(h71.f, x0().N0()).H(h71.T4, b0().b0());
    }

    public long o0() {
        return this.a.l0(this.b);
    }

    public ds5 p0() {
        return this.a.o0();
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = c.a[((h71) u8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.q(u8bVar);
                }
                return b0().b0();
            }
            return o0();
        }
        return u8bVar.q(this);
    }

    public es5 r0() {
        return this.a;
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = c.a[((h71) u8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.w(u8bVar);
                }
                return b0().b0();
            }
            throw new DateTimeException("Field too large for an int: " + u8bVar);
        }
        return super.w(u8bVar);
    }

    public gs5 x0() {
        return this.a.p0();
    }
}
