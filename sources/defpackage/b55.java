package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: Instant.java */
/* renamed from: b55  reason: default package */
/* loaded from: classes3.dex */
public final class b55 extends lq2 implements p8b, r8b, Comparable<b55>, Serializable {
    public static final b55 c = new b55(0, 0);
    public static final b55 d = m0(-31557014167219200L, 0);
    public static final b55 e = m0(31556889864403199L, 999999999);
    public static final w8b<b55> f = new a();
    private final long a;
    private final int b;

    /* compiled from: Instant.java */
    /* renamed from: b55$a */
    /* loaded from: classes3.dex */
    class a implements w8b<b55> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public b55 a(q8b q8bVar) {
            return b55.Q(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Instant.java */
    /* renamed from: b55$b */
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
            try {
                b[m71.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[h71.values().length];
            a = iArr2;
            try {
                iArr2[h71.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h71.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h71.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h71.S4.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private b55(long j, int i) {
        this.a = j;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b55 E0(DataInput dataInput) throws IOException {
        return m0(dataInput.readLong(), dataInput.readInt());
    }

    private static b55 P(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new b55(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    public static b55 Q(q8b q8bVar) {
        try {
            return m0(q8bVar.q(h71.S4), q8bVar.w(h71.e));
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName(), e2);
        }
    }

    public static b55 f0() {
        return w91.b().a();
    }

    public static b55 h0(long j) {
        return P(g95.e(j, 1000L), g95.g(j, 1000) * 1000000);
    }

    public static b55 l0(long j) {
        return P(j, 0);
    }

    public static b55 m0(long j, long j2) {
        return P(g95.k(j, g95.e(j2, 1000000000L)), g95.g(j2, 1000000000));
    }

    private b55 o0(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m0(g95.k(g95.k(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 2, this);
    }

    @Override // defpackage.p8b
    /* renamed from: F0 */
    public b55 s(r8b r8bVar) {
        return (b55) r8bVar.o(this);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.S4 || u8bVar == h71.e || u8bVar == h71.g || u8bVar == h71.i) {
                return true;
            }
            return false;
        } else if (u8bVar != null && u8bVar.i(this)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // defpackage.p8b
    /* renamed from: J0 */
    public b55 H(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            h71Var.E(j);
            int i = b.a[h71Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (j != this.a) {
                                return P(j, this.b);
                            }
                            return this;
                        }
                        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                    }
                    int i2 = ((int) j) * 1000000;
                    if (i2 != this.b) {
                        return P(this.a, i2);
                    }
                    return this;
                }
                int i3 = ((int) j) * 1000;
                if (i3 != this.b) {
                    return P(this.a, i3);
                }
                return this;
            } else if (j != this.b) {
                return P(this.a, (int) j);
            } else {
                return this;
            }
        }
        return (b55) u8bVar.o(this, j);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        return super.K(u8bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.e()) {
            return (R) m71.NANOS;
        }
        if (w8bVar != v8b.b() && w8bVar != v8b.c() && w8bVar != v8b.a() && w8bVar != v8b.g() && w8bVar != v8b.f() && w8bVar != v8b.d()) {
            return w8bVar.a(this);
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    public int compareTo(b55 b55Var) {
        int b2 = g95.b(this.a, b55Var.a);
        if (b2 != 0) {
            return b2;
        }
        return this.b - b55Var.b;
    }

    public long T() {
        return this.a;
    }

    public int b0() {
        return this.b;
    }

    @Override // defpackage.p8b
    /* renamed from: e0 */
    public b55 i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return L(Long.MAX_VALUE, x8bVar).L(1L, x8bVar);
        }
        return L(-j, x8bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b55)) {
            return false;
        }
        b55 b55Var = (b55) obj;
        if (this.a == b55Var.a && this.b == b55Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) + (this.b * 51);
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.S4, this.a).H(h71.e, this.b);
    }

    @Override // defpackage.p8b
    /* renamed from: p0 */
    public b55 L(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            switch (b.b[((m71) x8bVar).ordinal()]) {
                case 1:
                    return x0(j);
                case 2:
                    return o0(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return r0(j);
                case 4:
                    return z0(j);
                case 5:
                    return z0(g95.l(j, 60));
                case 6:
                    return z0(g95.l(j, 3600));
                case 7:
                    return z0(g95.l(j, 43200));
                case 8:
                    return z0(g95.l(j, RemoteMessageConst.DEFAULT_TTL));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + x8bVar);
            }
        }
        return (b55) x8bVar.i(this, j);
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        int i;
        if (u8bVar instanceof h71) {
            int i2 = b.a[((h71) u8bVar).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return this.a;
                        }
                        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                    }
                    i = this.b / 1000000;
                } else {
                    i = this.b / 1000;
                }
            } else {
                i = this.b;
            }
            return i;
        }
        return u8bVar.q(this);
    }

    public b55 r0(long j) {
        return o0(j / 1000, (j % 1000) * 1000000);
    }

    public String toString() {
        return an2.t.b(this);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = b.a[((h71) u8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.b / 1000000;
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                }
                return this.b / 1000;
            }
            return this.b;
        }
        return K(u8bVar).a(u8bVar.q(this), u8bVar);
    }

    public b55 x0(long j) {
        return o0(0L, j);
    }

    public b55 z0(long j) {
        return o0(j, 0L);
    }
}
