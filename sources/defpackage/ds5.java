package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: LocalDate.java */
/* renamed from: ds5  reason: default package */
/* loaded from: classes3.dex */
public final class ds5 extends i71 implements p8b, r8b, Serializable {
    public static final ds5 e = X0(-999999999, 1, 1);
    public static final ds5 f = X0(999999999, 12, 31);
    public static final w8b<ds5> g = new a();
    private final int b;
    private final short c;
    private final short d;

    /* compiled from: LocalDate.java */
    /* renamed from: ds5$a */
    /* loaded from: classes3.dex */
    class a implements w8b<ds5> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public ds5 a(q8b q8bVar) {
            return ds5.E0(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDate.java */
    /* renamed from: ds5$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[m71.values().length];
            b = iArr;
            try {
                iArr[m71.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[m71.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[m71.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[m71.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[m71.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[m71.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[m71.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[m71.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[h71.values().length];
            a = iArr2;
            try {
                iArr2[h71.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h71.x.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h71.z.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h71.X.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[h71.t.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[h71.u.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[h71.v.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[h71.y.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[h71.A.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[h71.B.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[h71.I.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[h71.Y.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[h71.Z.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private ds5(int i, int i2, int i3) {
        this.b = i;
        this.c = (short) i2;
        this.d = (short) i3;
    }

    public static ds5 E0(q8b q8bVar) {
        ds5 ds5Var = (ds5) q8bVar.M(v8b.b());
        if (ds5Var != null) {
            return ds5Var;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
    }

    private int F0(u8b u8bVar) {
        switch (b.a[((h71) u8bVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return M0();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                int i = this.b;
                if (i < 1) {
                    return 1 - i;
                }
                return i;
            case 5:
                return L0().getValue();
            case 6:
                return ((this.d - 1) % 7) + 1;
            case 7:
                return ((M0() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Field too large for an int: " + u8bVar);
            case 9:
                return ((M0() - 1) / 7) + 1;
            case 10:
                return this.c;
            case 11:
                throw new DateTimeException("Field too large for an int: " + u8bVar);
            case 12:
                return this.b;
            case 13:
                if (this.b >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }
    }

    private long P0() {
        return (this.b * 12) + (this.c - 1);
    }

    public static ds5 X0(int i, int i2, int i3) {
        h71.Y.E(i);
        h71.B.E(i2);
        h71.w.E(i3);
        return z0(i, po6.N(i2), i3);
    }

    public static ds5 Y0(int i, po6 po6Var, int i2) {
        h71.Y.E(i);
        g95.i(po6Var, "month");
        h71.w.E(i2);
        return z0(i, po6Var, i2);
    }

    public static ds5 Z0(long j) {
        long j2;
        h71.y.E(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new ds5(h71.Y.x(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static ds5 a1(int i, int i2) {
        long j = i;
        h71.Y.E(j);
        h71.x.E(i2);
        boolean b0 = t75.e.b0(j);
        if (i2 == 366 && !b0) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        po6 N = po6.N(((i2 - 1) / 31) + 1);
        if (i2 > (N.a(b0) + N.u(b0)) - 1) {
            N = N.P(1L);
        }
        return z0(i, N, (i2 - N.a(b0)) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ds5 h1(DataInput dataInput) throws IOException {
        return X0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static ds5 i1(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i3 = Math.min(i3, 30);
            }
        } else {
            if (t75.e.b0(i)) {
                i4 = 29;
            } else {
                i4 = 28;
            }
            i3 = Math.min(i3, i4);
        }
        return X0(i, i2, i3);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 3, this);
    }

    private static ds5 z0(int i, po6 po6Var, int i2) {
        if (i2 > 28 && i2 > po6Var.u(t75.e.b0(i))) {
            if (i2 == 29) {
                throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
            }
            throw new DateTimeException("Invalid date '" + po6Var.name() + " " + i2 + "'");
        }
        return new ds5(i, po6Var.getValue(), i2);
    }

    @Override // defpackage.i71, defpackage.q8b
    public boolean G(u8b u8bVar) {
        return super.G(u8bVar);
    }

    @Override // defpackage.i71
    /* renamed from: J0 */
    public t75 T() {
        return t75.e;
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        long j;
        long j2;
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            if (h71Var.a()) {
                int i = b.a[h71Var.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return u8bVar.s();
                            }
                            if (Q0() <= 0) {
                                j2 = 1000000000;
                            } else {
                                j2 = 999999999;
                            }
                            return kwb.k(1L, j2);
                        }
                        if (N0() == po6.FEBRUARY && !R0()) {
                            j = 4;
                        } else {
                            j = 5;
                        }
                        return kwb.k(1L, j);
                    }
                    return kwb.k(1L, T0());
                }
                return kwb.k(1L, S0());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }
        return u8bVar.k(this);
    }

    public int K0() {
        return this.d;
    }

    public hn2 L0() {
        return hn2.k(g95.g(m0() + 3, 7) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i71, defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.b()) {
            return this;
        }
        return (R) super.M(w8bVar);
    }

    public int M0() {
        return (N0().a(R0()) + this.d) - 1;
    }

    public po6 N0() {
        return po6.N(this.c);
    }

    public int O0() {
        return this.c;
    }

    @Override // defpackage.i71, java.lang.Comparable
    /* renamed from: Q */
    public int compareTo(i71 i71Var) {
        if (i71Var instanceof ds5) {
            return x0((ds5) i71Var);
        }
        return super.compareTo(i71Var);
    }

    public int Q0() {
        return this.b;
    }

    public boolean R0() {
        return t75.e.b0(this.b);
    }

    public int S0() {
        short s = this.c;
        if (s != 2) {
            if (s != 4 && s != 6 && s != 9 && s != 11) {
                return 31;
            }
            return 30;
        } else if (R0()) {
            return 29;
        } else {
            return 28;
        }
    }

    public int T0() {
        if (R0()) {
            return 366;
        }
        return 365;
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: U0 */
    public ds5 i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return h0(Long.MAX_VALUE, x8bVar).h0(1L, x8bVar);
        }
        return h0(-j, x8bVar);
    }

    public ds5 V0(long j) {
        if (j == Long.MIN_VALUE) {
            return d1(Long.MAX_VALUE).d1(1L);
        }
        return d1(-j);
    }

    public ds5 W0(long j) {
        if (j == Long.MIN_VALUE) {
            return g1(Long.MAX_VALUE).g1(1L);
        }
        return g1(-j);
    }

    @Override // defpackage.i71
    public ek3 b0() {
        return super.b0();
    }

    @Override // defpackage.i71
    /* renamed from: b1 */
    public ds5 h0(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            switch (b.b[((m71) x8bVar).ordinal()]) {
                case 1:
                    return d1(j);
                case 2:
                    return f1(j);
                case 3:
                    return e1(j);
                case 4:
                    return g1(j);
                case 5:
                    return g1(g95.l(j, 10));
                case 6:
                    return g1(g95.l(j, 100));
                case 7:
                    return g1(g95.l(j, 1000));
                case 8:
                    h71 h71Var = h71.Z;
                    return p0(h71Var, g95.k(q(h71Var), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + x8bVar);
            }
        }
        return (ds5) x8bVar.i(this, j);
    }

    @Override // defpackage.i71
    /* renamed from: c1 */
    public ds5 l0(t8b t8bVar) {
        return (ds5) t8bVar.a(this);
    }

    public ds5 d1(long j) {
        if (j == 0) {
            return this;
        }
        return Z0(g95.k(m0(), j));
    }

    @Override // defpackage.i71
    public boolean e0(i71 i71Var) {
        if (i71Var instanceof ds5) {
            if (x0((ds5) i71Var) < 0) {
                return true;
            }
            return false;
        }
        return super.e0(i71Var);
    }

    public ds5 e1(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return i1(h71.Y.x(g95.e(j2, 12L)), g95.g(j2, 12) + 1, this.d);
    }

    @Override // defpackage.i71
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ds5) && x0((ds5) obj) == 0) {
            return true;
        }
        return false;
    }

    public ds5 f1(long j) {
        return d1(g95.l(j, 7));
    }

    public ds5 g1(long j) {
        if (j == 0) {
            return this;
        }
        return i1(h71.Y.x(this.b + j), this.c, this.d);
    }

    @Override // defpackage.i71
    public int hashCode() {
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ (i & (-2048));
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: j1 */
    public ds5 s(r8b r8bVar) {
        if (r8bVar instanceof ds5) {
            return (ds5) r8bVar;
        }
        return (ds5) r8bVar.o(this);
    }

    @Override // defpackage.i71
    /* renamed from: k1 */
    public ds5 p0(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            h71Var.E(j);
            switch (b.a[h71Var.ordinal()]) {
                case 1:
                    return l1((int) j);
                case 2:
                    return m1((int) j);
                case 3:
                    return f1(j - q(h71.z));
                case 4:
                    if (this.b < 1) {
                        j = 1 - j;
                    }
                    return p1((int) j);
                case 5:
                    return d1(j - L0().getValue());
                case 6:
                    return d1(j - q(h71.u));
                case 7:
                    return d1(j - q(h71.v));
                case 8:
                    return Z0(j);
                case 9:
                    return f1(j - q(h71.A));
                case 10:
                    return n1((int) j);
                case 11:
                    return e1(j - q(h71.I));
                case 12:
                    return p1((int) j);
                case 13:
                    if (q(h71.Z) == j) {
                        return this;
                    }
                    return p1(1 - this.b);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
            }
        }
        return (ds5) u8bVar.o(this, j);
    }

    public ds5 l1(int i) {
        if (this.d == i) {
            return this;
        }
        return X0(this.b, this.c, i);
    }

    @Override // defpackage.i71
    public long m0() {
        long j;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j4 - (((j2 / (-4)) - (j2 / (-100))) + (j2 / (-400)));
        }
        long j5 = j + (((367 * j3) - 362) / 12) + (this.d - 1);
        if (j3 > 2) {
            long j6 = j5 - 1;
            if (!R0()) {
                j5 -= 2;
            } else {
                j5 = j6;
            }
        }
        return j5 - 719528;
    }

    public ds5 m1(int i) {
        if (M0() == i) {
            return this;
        }
        return a1(this.b, i);
    }

    public ds5 n1(int i) {
        if (this.c == i) {
            return this;
        }
        h71.B.E(i);
        return i1(this.b, i, this.d);
    }

    @Override // defpackage.i71, defpackage.r8b
    public p8b o(p8b p8bVar) {
        return super.o(p8bVar);
    }

    public ds5 p1(int i) {
        if (this.b == i) {
            return this;
        }
        h71.Y.E(i);
        return i1(i, this.c, this.d);
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.y) {
                return m0();
            }
            if (u8bVar == h71.I) {
                return P0();
            }
            return F0(u8bVar);
        }
        return u8bVar.q(this);
    }

    @Override // defpackage.i71
    /* renamed from: r0 */
    public es5 P(gs5 gs5Var) {
        return es5.P0(this, gs5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r1(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.b);
        dataOutput.writeByte(this.c);
        dataOutput.writeByte(this.d);
    }

    @Override // defpackage.i71
    public String toString() {
        String str;
        int i = this.b;
        short s = this.c;
        short s2 = this.d;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        }
        String str2 = "-";
        if (s >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append((int) s);
        if (s2 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            return F0(u8bVar);
        }
        return super.w(u8bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x0(ds5 ds5Var) {
        int i = this.b - ds5Var.b;
        if (i == 0) {
            int i2 = this.c - ds5Var.c;
            if (i2 == 0) {
                return this.d - ds5Var.d;
            }
            return i2;
        }
        return i;
    }
}
