package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: YearMonth.java */
/* renamed from: mcc  reason: default package */
/* loaded from: classes3.dex */
public final class mcc extends lq2 implements p8b, r8b, Comparable<mcc>, Serializable {
    public static final w8b<mcc> c = new a();
    private static final an2 d = new bn2().p(h71.Y, 4, 10, ika.EXCEEDS_PAD).e(CoreConstants.DASH_CHAR).o(h71.B, 2).D();
    private final int a;
    private final int b;

    /* compiled from: YearMonth.java */
    /* renamed from: mcc$a */
    /* loaded from: classes3.dex */
    class a implements w8b<mcc> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public mcc a(q8b q8bVar) {
            return mcc.P(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearMonth.java */
    /* renamed from: mcc$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[m71.values().length];
            b = iArr;
            try {
                iArr[m71.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[m71.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[m71.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[m71.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[m71.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[m71.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[h71.values().length];
            a = iArr2;
            try {
                iArr2[h71.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h71.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h71.X.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h71.Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h71.Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private mcc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static mcc P(q8b q8bVar) {
        if (q8bVar instanceof mcc) {
            return (mcc) q8bVar;
        }
        try {
            if (!t75.e.equals(p71.w(q8bVar))) {
                q8bVar = ds5.E0(q8bVar);
            }
            return e0(q8bVar.w(h71.Y), q8bVar.w(h71.B));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
        }
    }

    private long Q() {
        return (this.a * 12) + (this.b - 1);
    }

    public static mcc e0(int i, int i2) {
        h71.Y.E(i);
        h71.B.E(i2);
        return new mcc(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mcc m0(DataInput dataInput) throws IOException {
        return e0(dataInput.readInt(), dataInput.readByte());
    }

    private mcc o0(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return this;
        }
        return new mcc(i, i2);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 68, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.Y || u8bVar == h71.B || u8bVar == h71.I || u8bVar == h71.X || u8bVar == h71.Z) {
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
        long j;
        if (u8bVar == h71.X) {
            if (T() <= 0) {
                j = 1000000000;
            } else {
                j = 999999999;
            }
            return kwb.k(1L, j);
        }
        return super.K(u8bVar);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.a()) {
            return (R) t75.e;
        }
        if (w8bVar == v8b.e()) {
            return (R) m71.MONTHS;
        }
        if (w8bVar != v8b.b() && w8bVar != v8b.c() && w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d()) {
            return (R) super.M(w8bVar);
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    public int compareTo(mcc mccVar) {
        int i = this.a - mccVar.a;
        if (i == 0) {
            return this.b - mccVar.b;
        }
        return i;
    }

    public int T() {
        return this.a;
    }

    @Override // defpackage.p8b
    /* renamed from: b0 */
    public mcc i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return L(Long.MAX_VALUE, x8bVar).L(1L, x8bVar);
        }
        return L(-j, x8bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcc)) {
            return false;
        }
        mcc mccVar = (mcc) obj;
        if (this.a == mccVar.a && this.b == mccVar.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.p8b
    /* renamed from: f0 */
    public mcc L(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            switch (b.b[((m71) x8bVar).ordinal()]) {
                case 1:
                    return h0(j);
                case 2:
                    return l0(j);
                case 3:
                    return l0(g95.l(j, 10));
                case 4:
                    return l0(g95.l(j, 100));
                case 5:
                    return l0(g95.l(j, 1000));
                case 6:
                    h71 h71Var = h71.Z;
                    return H(h71Var, g95.k(q(h71Var), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + x8bVar);
            }
        }
        return (mcc) x8bVar.i(this, j);
    }

    public mcc h0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        return o0(h71.Y.x(g95.e(j2, 12L)), g95.g(j2, 12) + 1);
    }

    public int hashCode() {
        return this.a ^ (this.b << 27);
    }

    public mcc l0(long j) {
        if (j == 0) {
            return this;
        }
        return o0(h71.Y.x(this.a + j), this.b);
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        if (p71.w(p8bVar).equals(t75.e)) {
            return p8bVar.H(h71.I, Q());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // defpackage.p8b
    /* renamed from: p0 */
    public mcc s(r8b r8bVar) {
        return (mcc) r8bVar.o(this);
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        int i;
        if (u8bVar instanceof h71) {
            int i2 = b.a[((h71) u8bVar).ordinal()];
            int i3 = 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                if (this.a < 1) {
                                    i3 = 0;
                                }
                                return i3;
                            }
                            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                        }
                        i = this.a;
                    } else {
                        int i4 = this.a;
                        if (i4 < 1) {
                            i4 = 1 - i4;
                        }
                        return i4;
                    }
                } else {
                    return Q();
                }
            } else {
                i = this.b;
            }
            return i;
        }
        return u8bVar.q(this);
    }

    @Override // defpackage.p8b
    /* renamed from: r0 */
    public mcc H(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            h71Var.E(j);
            int i = b.a[h71Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (q(h71.Z) == j) {
                                    return this;
                                }
                                return z0(1 - this.a);
                            }
                            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                        }
                        return z0((int) j);
                    }
                    if (this.a < 1) {
                        j = 1 - j;
                    }
                    return z0((int) j);
                }
                return h0(j - q(h71.I));
            }
            return x0((int) j);
        }
        return (mcc) u8bVar.o(this, j);
    }

    public String toString() {
        String str;
        int abs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.a);
        }
        if (this.b < 10) {
            str = "-0";
        } else {
            str = "-";
        }
        sb.append(str);
        sb.append(this.b);
        return sb.toString();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }

    public mcc x0(int i) {
        h71.B.E(i);
        return o0(this.a, i);
    }

    public mcc z0(int i) {
        h71.Y.E(i);
        return o0(i, this.b);
    }
}
