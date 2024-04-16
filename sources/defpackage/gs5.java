package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: LocalTime.java */
/* renamed from: gs5  reason: default package */
/* loaded from: classes3.dex */
public final class gs5 extends lq2 implements p8b, r8b, Comparable<gs5>, Serializable {
    public static final gs5 e;
    public static final gs5 f;
    public static final gs5 g;
    public static final gs5 h;
    public static final w8b<gs5> i = new a();
    private static final gs5[] j = new gs5[24];
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    /* compiled from: LocalTime.java */
    /* renamed from: gs5$a */
    /* loaded from: classes3.dex */
    class a implements w8b<gs5> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public gs5 a(q8b q8bVar) {
            return gs5.T(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalTime.java */
    /* renamed from: gs5$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[m71.values().length];
            b = iArr;
            try {
                iArr[m71.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[m71.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[m71.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[m71.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[m71.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[m71.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[m71.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[h71.values().length];
            a = iArr2;
            try {
                iArr2[h71.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h71.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h71.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h71.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h71.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[h71.j.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[h71.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[h71.l.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[h71.m.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[h71.n.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[h71.o.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[h71.p.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[h71.q.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[h71.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[h71.s.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i2 = 0;
        while (true) {
            gs5[] gs5VarArr = j;
            if (i2 < gs5VarArr.length) {
                gs5VarArr[i2] = new gs5(i2, 0, 0, 0);
                i2++;
            } else {
                gs5 gs5Var = gs5VarArr[0];
                g = gs5Var;
                h = gs5VarArr[12];
                e = gs5Var;
                f = new gs5(23, 59, 59, 999999999);
                return;
            }
        }
    }

    private gs5(int i2, int i3, int i4, int i5) {
        this.a = (byte) i2;
        this.b = (byte) i3;
        this.c = (byte) i4;
        this.d = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    public static gs5 M0(DataInput dataInput) throws IOException {
        byte b2;
        int i2;
        byte b3;
        int readByte = dataInput.readByte();
        byte b4 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            b3 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r5 = ~readByte2;
                i2 = 0;
                b4 = r5;
                b2 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    b4 = readByte2;
                    b3 = ~readByte3;
                } else {
                    int readInt = dataInput.readInt();
                    b2 = readByte3;
                    i2 = readInt;
                    b4 = readByte2;
                }
            }
            return p0(readByte, b4, b2, i2);
        }
        i2 = 0;
        b2 = b3;
        return p0(readByte, b4, b2, i2);
    }

    private static gs5 Q(int i2, int i3, int i4, int i5) {
        if ((i3 | i4 | i5) == 0) {
            return j[i2];
        }
        return new gs5(i2, i3, i4, i5);
    }

    public static gs5 T(q8b q8bVar) {
        gs5 gs5Var = (gs5) q8bVar.M(v8b.c());
        if (gs5Var != null) {
            return gs5Var;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
    }

    private int b0(u8b u8bVar) {
        switch (b.a[((h71) u8bVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new DateTimeException("Field too large for an int: " + u8bVar);
            case 3:
                return this.d / 1000;
            case 4:
                throw new DateTimeException("Field too large for an int: " + u8bVar);
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (N0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return O0();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i2 = this.a % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 13:
                return this.a;
            case 14:
                byte b2 = this.a;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return this.a / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }
    }

    public static gs5 m0(int i2, int i3) {
        h71.q.E(i2);
        if (i3 == 0) {
            return j[i2];
        }
        h71.m.E(i3);
        return new gs5(i2, i3, 0, 0);
    }

    public static gs5 o0(int i2, int i3, int i4) {
        h71.q.E(i2);
        if ((i3 | i4) == 0) {
            return j[i2];
        }
        h71.m.E(i3);
        h71.k.E(i4);
        return new gs5(i2, i3, i4, 0);
    }

    public static gs5 p0(int i2, int i3, int i4, int i5) {
        h71.q.E(i2);
        h71.m.E(i3);
        h71.k.E(i4);
        h71.e.E(i5);
        return Q(i2, i3, i4, i5);
    }

    public static gs5 r0(long j2) {
        h71.f.E(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (i2 * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (i3 * 60000000000L);
        int i4 = (int) (j4 / 1000000000);
        return Q(i2, i3, i4, (int) (j4 - (i4 * 1000000000)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 5, this);
    }

    public static gs5 x0(long j2) {
        h71.l.E(j2);
        int i2 = (int) (j2 / 3600);
        long j3 = j2 - (i2 * 3600);
        int i3 = (int) (j3 / 60);
        return Q(i2, i3, (int) (j3 - (i3 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gs5 z0(long j2, int i2) {
        h71.l.E(j2);
        h71.e.E(i2);
        int i3 = (int) (j2 / 3600);
        long j3 = j2 - (i3 * 3600);
        int i4 = (int) (j3 / 60);
        return Q(i3, i4, (int) (j3 - (i4 * 60)), i2);
    }

    @Override // defpackage.p8b
    /* renamed from: E0 */
    public gs5 L(long j2, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            switch (b.b[((m71) x8bVar).ordinal()]) {
                case 1:
                    return K0(j2);
                case 2:
                    return K0((j2 % 86400000000L) * 1000);
                case 3:
                    return K0((j2 % CoreConstants.MILLIS_IN_ONE_DAY) * 1000000);
                case 4:
                    return L0(j2);
                case 5:
                    return J0(j2);
                case 6:
                    return F0(j2);
                case 7:
                    return F0((j2 % 2) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + x8bVar);
            }
        }
        return (gs5) x8bVar.i(this, j2);
    }

    public gs5 F0(long j2) {
        if (j2 == 0) {
            return this;
        }
        return Q(((((int) (j2 % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            return u8bVar.u();
        }
        if (u8bVar != null && u8bVar.i(this)) {
            return true;
        }
        return false;
    }

    public gs5 J0(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.a * 60) + this.b;
        int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
        if (i2 == i3) {
            return this;
        }
        return Q(i3 / 60, i3 % 60, this.c, this.d);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        return super.K(u8bVar);
    }

    public gs5 K0(long j2) {
        if (j2 == 0) {
            return this;
        }
        long N0 = N0();
        long j3 = (((j2 % 86400000000000L) + N0) + 86400000000000L) % 86400000000000L;
        if (N0 == j3) {
            return this;
        }
        return Q((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
    }

    public gs5 L0(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.a * 3600) + (this.b * 60) + this.c;
        int i3 = ((((int) (j2 % 86400)) + i2) + RemoteMessageConst.DEFAULT_TTL) % RemoteMessageConst.DEFAULT_TTL;
        if (i2 == i3) {
            return this;
        }
        return Q(i3 / 3600, (i3 / 60) % 60, i3 % 60, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.e()) {
            return (R) m71.NANOS;
        }
        if (w8bVar == v8b.c()) {
            return this;
        }
        if (w8bVar != v8b.a() && w8bVar != v8b.g() && w8bVar != v8b.f() && w8bVar != v8b.d() && w8bVar != v8b.b()) {
            return w8bVar.a(this);
        }
        return null;
    }

    public y67 N(wcc wccVar) {
        return y67.b0(this, wccVar);
    }

    public long N0() {
        return (this.a * 3600000000000L) + (this.b * 60000000000L) + (this.c * 1000000000) + this.d;
    }

    public int O0() {
        return (this.a * 3600) + (this.b * 60) + this.c;
    }

    @Override // java.lang.Comparable
    /* renamed from: P */
    public int compareTo(gs5 gs5Var) {
        int a2 = g95.a(this.a, gs5Var.a);
        if (a2 == 0) {
            int a3 = g95.a(this.b, gs5Var.b);
            if (a3 == 0) {
                int a4 = g95.a(this.c, gs5Var.c);
                if (a4 == 0) {
                    return g95.a(this.d, gs5Var.d);
                }
                return a4;
            }
            return a3;
        }
        return a2;
    }

    @Override // defpackage.p8b
    /* renamed from: P0 */
    public gs5 s(r8b r8bVar) {
        if (r8bVar instanceof gs5) {
            return (gs5) r8bVar;
        }
        return (gs5) r8bVar.o(this);
    }

    @Override // defpackage.p8b
    /* renamed from: Q0 */
    public gs5 H(u8b u8bVar, long j2) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            h71Var.E(j2);
            switch (b.a[h71Var.ordinal()]) {
                case 1:
                    return T0((int) j2);
                case 2:
                    return r0(j2);
                case 3:
                    return T0(((int) j2) * 1000);
                case 4:
                    return r0(j2 * 1000);
                case 5:
                    return T0(((int) j2) * 1000000);
                case 6:
                    return r0(j2 * 1000000);
                case 7:
                    return U0((int) j2);
                case 8:
                    return L0(j2 - O0());
                case 9:
                    return S0((int) j2);
                case 10:
                    return J0(j2 - ((this.a * 60) + this.b));
                case 11:
                    return F0(j2 - (this.a % 12));
                case 12:
                    if (j2 == 12) {
                        j2 = 0;
                    }
                    return F0(j2 - (this.a % 12));
                case 13:
                    return R0((int) j2);
                case 14:
                    if (j2 == 24) {
                        j2 = 0;
                    }
                    return R0((int) j2);
                case 15:
                    return F0((j2 - (this.a / 12)) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
            }
        }
        return (gs5) u8bVar.o(this, j2);
    }

    public gs5 R0(int i2) {
        if (this.a == i2) {
            return this;
        }
        h71.q.E(i2);
        return Q(i2, this.b, this.c, this.d);
    }

    public gs5 S0(int i2) {
        if (this.b == i2) {
            return this;
        }
        h71.m.E(i2);
        return Q(this.a, i2, this.c, this.d);
    }

    public gs5 T0(int i2) {
        if (this.d == i2) {
            return this;
        }
        h71.e.E(i2);
        return Q(this.a, this.b, this.c, i2);
    }

    public gs5 U0(int i2) {
        if (this.c == i2) {
            return this;
        }
        h71.k.E(i2);
        return Q(this.a, this.b, i2, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0(DataOutput dataOutput) throws IOException {
        if (this.d == 0) {
            if (this.c == 0) {
                if (this.b == 0) {
                    dataOutput.writeByte(~this.a);
                    return;
                }
                dataOutput.writeByte(this.a);
                dataOutput.writeByte(~this.b);
                return;
            }
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
        dataOutput.writeInt(this.d);
    }

    public int e0() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs5)) {
            return false;
        }
        gs5 gs5Var = (gs5) obj;
        if (this.a == gs5Var.a && this.b == gs5Var.b && this.c == gs5Var.c && this.d == gs5Var.d) {
            return true;
        }
        return false;
    }

    public int f0() {
        return this.d;
    }

    public int h0() {
        return this.c;
    }

    public int hashCode() {
        long N0 = N0();
        return (int) (N0 ^ (N0 >>> 32));
    }

    @Override // defpackage.p8b
    /* renamed from: l0 */
    public gs5 i(long j2, x8b x8bVar) {
        if (j2 == Long.MIN_VALUE) {
            return L(Long.MAX_VALUE, x8bVar).L(1L, x8bVar);
        }
        return L(-j2, x8bVar);
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.f, N0());
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.f) {
                return N0();
            }
            if (u8bVar == h71.h) {
                return N0() / 1000;
            }
            return b0(u8bVar);
        }
        return u8bVar.q(this);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.a;
        byte b3 = this.b;
        byte b4 = this.c;
        int i2 = this.d;
        if (b2 < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append((int) b2);
        String str3 = ":";
        if (b3 >= 10) {
            str2 = ":";
        } else {
            str2 = ":0";
        }
        sb.append(str2);
        sb.append((int) b3);
        if (b4 > 0 || i2 > 0) {
            if (b4 < 10) {
                str3 = ":0";
            }
            sb.append(str3);
            sb.append((int) b4);
            if (i2 > 0) {
                sb.append(CoreConstants.DOT);
                if (i2 % 1000000 == 0) {
                    sb.append(Integer.toString((i2 / 1000000) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            return b0(u8bVar);
        }
        return super.w(u8bVar);
    }
}
