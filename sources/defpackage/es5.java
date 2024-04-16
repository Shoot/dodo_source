package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
/* compiled from: LocalDateTime.java */
/* renamed from: es5  reason: default package */
/* loaded from: classes3.dex */
public final class es5 extends j71<ds5> implements p8b, r8b, Serializable {
    public static final es5 d = P0(ds5.e, gs5.e);
    public static final es5 e = P0(ds5.f, gs5.f);
    public static final w8b<es5> f = new a();
    private final ds5 b;
    private final gs5 c;

    /* compiled from: LocalDateTime.java */
    /* renamed from: es5$a */
    /* loaded from: classes3.dex */
    class a implements w8b<es5> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public es5 a(q8b q8bVar) {
            return es5.J0(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDateTime.java */
    /* renamed from: es5$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m71.values().length];
            a = iArr;
            try {
                iArr[m71.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m71.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[m71.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[m71.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[m71.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[m71.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[m71.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private es5(ds5 ds5Var, gs5 gs5Var) {
        this.b = ds5Var;
        this.c = gs5Var;
    }

    private int F0(es5 es5Var) {
        int x0 = this.b.x0(es5Var.o0());
        if (x0 == 0) {
            return this.c.compareTo(es5Var.p0());
        }
        return x0;
    }

    public static es5 J0(q8b q8bVar) {
        if (q8bVar instanceof es5) {
            return (es5) q8bVar;
        }
        if (q8bVar instanceof ddc) {
            return ((ddc) q8bVar).p0();
        }
        try {
            return new es5(ds5.E0(q8bVar), gs5.T(q8bVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
        }
    }

    public static es5 O0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new es5(ds5.X0(i, i2, i3), gs5.p0(i4, i5, i6, i7));
    }

    public static es5 P0(ds5 ds5Var, gs5 gs5Var) {
        g95.i(ds5Var, "date");
        g95.i(gs5Var, CrashHianalyticsData.TIME);
        return new es5(ds5Var, gs5Var);
    }

    public static es5 Q0(long j, int i, wcc wccVar) {
        g95.i(wccVar, "offset");
        long b0 = j + wccVar.b0();
        return new es5(ds5.Z0(g95.e(b0, 86400L)), gs5.z0(g95.g(b0, RemoteMessageConst.DEFAULT_TTL), i));
    }

    public static es5 R0(CharSequence charSequence, an2 an2Var) {
        g95.i(an2Var, "formatter");
        return (es5) an2Var.i(charSequence, f);
    }

    private es5 Y0(ds5 ds5Var, long j, long j2, long j3, long j4, int i) {
        gs5 r0;
        if ((j | j2 | j3 | j4) == 0) {
            return b1(ds5Var, this.c);
        }
        long j5 = i;
        long N0 = this.c.N0();
        long j6 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L)) * j5) + N0;
        long e2 = (((j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24)) * j5) + g95.e(j6, 86400000000000L);
        long h = g95.h(j6, 86400000000000L);
        if (h == N0) {
            r0 = this.c;
        } else {
            r0 = gs5.r0(h);
        }
        return b1(ds5Var.d1(e2), r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static es5 Z0(DataInput dataInput) throws IOException {
        return P0(ds5.h1(dataInput), gs5.M0(dataInput));
    }

    private es5 b1(ds5 ds5Var, gs5 gs5Var) {
        if (this.b == ds5Var && this.c == gs5Var) {
            return this;
        }
        return new es5(ds5Var, gs5Var);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 4, this);
    }

    @Override // defpackage.j71
    /* renamed from: E0 */
    public ddc P(vcc vccVar) {
        return ddc.M0(this, vccVar);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.a() || u8bVar.u()) {
                return true;
            }
            return false;
        } else if (u8bVar != null && u8bVar.i(this)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u()) {
                return this.c.K(u8bVar);
            }
            return this.b.K(u8bVar);
        }
        return u8bVar.k(this);
    }

    public int K0() {
        return this.c.f0();
    }

    public int L0() {
        return this.c.h0();
    }

    @Override // defpackage.j71, defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.b()) {
            return (R) o0();
        }
        return (R) super.M(w8bVar);
    }

    public int M0() {
        return this.b.Q0();
    }

    @Override // defpackage.j71, defpackage.kq2, defpackage.p8b
    /* renamed from: N0 */
    public es5 i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return h0(Long.MAX_VALUE, x8bVar).h0(1L, x8bVar);
        }
        return h0(-j, x8bVar);
    }

    @Override // defpackage.j71, java.lang.Comparable
    /* renamed from: Q */
    public int compareTo(j71<?> j71Var) {
        if (j71Var instanceof es5) {
            return F0((es5) j71Var);
        }
        return super.compareTo(j71Var);
    }

    @Override // defpackage.j71
    /* renamed from: S0 */
    public es5 h0(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            switch (b.a[((m71) x8bVar).ordinal()]) {
                case 1:
                    return W0(j);
                case 2:
                    return T0(j / 86400000000L).W0((j % 86400000000L) * 1000);
                case 3:
                    return T0(j / CoreConstants.MILLIS_IN_ONE_DAY).W0((j % CoreConstants.MILLIS_IN_ONE_DAY) * 1000000);
                case 4:
                    return X0(j);
                case 5:
                    return V0(j);
                case 6:
                    return U0(j);
                case 7:
                    return T0(j / 256).U0((j % 256) * 12);
                default:
                    return b1(this.b.h0(j, x8bVar), this.c);
            }
        }
        return (es5) x8bVar.i(this, j);
    }

    public es5 T0(long j) {
        return b1(this.b.d1(j), this.c);
    }

    public es5 U0(long j) {
        return Y0(this.b, j, 0L, 0L, 0L, 1);
    }

    public es5 V0(long j) {
        return Y0(this.b, 0L, j, 0L, 0L, 1);
    }

    public es5 W0(long j) {
        return Y0(this.b, 0L, 0L, 0L, j, 1);
    }

    public es5 X0(long j) {
        return Y0(this.b, 0L, 0L, j, 0L, 1);
    }

    @Override // defpackage.j71
    /* renamed from: a1 */
    public ds5 o0() {
        return this.b;
    }

    @Override // defpackage.j71
    public boolean b0(j71<?> j71Var) {
        if (j71Var instanceof es5) {
            if (F0((es5) j71Var) > 0) {
                return true;
            }
            return false;
        }
        return super.b0(j71Var);
    }

    @Override // defpackage.j71, defpackage.kq2, defpackage.p8b
    /* renamed from: c1 */
    public es5 s(r8b r8bVar) {
        if (r8bVar instanceof ds5) {
            return b1((ds5) r8bVar, this.c);
        }
        if (r8bVar instanceof gs5) {
            return b1(this.b, (gs5) r8bVar);
        }
        if (r8bVar instanceof es5) {
            return (es5) r8bVar;
        }
        return (es5) r8bVar.o(this);
    }

    @Override // defpackage.j71
    /* renamed from: d1 */
    public es5 x0(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u()) {
                return b1(this.b, this.c.H(u8bVar, j));
            }
            return b1(this.b.p0(u8bVar, j), this.c);
        }
        return (es5) u8bVar.o(this, j);
    }

    @Override // defpackage.j71
    public boolean e0(j71<?> j71Var) {
        if (j71Var instanceof es5) {
            if (F0((es5) j71Var) < 0) {
                return true;
            }
            return false;
        }
        return super.e0(j71Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(DataOutput dataOutput) throws IOException {
        this.b.r1(dataOutput);
        this.c.V0(dataOutput);
    }

    @Override // defpackage.j71
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es5)) {
            return false;
        }
        es5 es5Var = (es5) obj;
        if (this.b.equals(es5Var.b) && this.c.equals(es5Var.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j71
    public int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override // defpackage.j71, defpackage.r8b
    public p8b o(p8b p8bVar) {
        return super.o(p8bVar);
    }

    @Override // defpackage.j71
    public gs5 p0() {
        return this.c;
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u()) {
                return this.c.q(u8bVar);
            }
            return this.b.q(u8bVar);
        }
        return u8bVar.q(this);
    }

    @Override // defpackage.j71
    public String toString() {
        return this.b.toString() + 'T' + this.c.toString();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u()) {
                return this.c.w(u8bVar);
            }
            return this.b.w(u8bVar);
        }
        return super.w(u8bVar);
    }

    public v67 z0(wcc wccVar) {
        return v67.f0(this, wccVar);
    }
}
