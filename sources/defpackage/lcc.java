package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: Year.java */
/* renamed from: lcc  reason: default package */
/* loaded from: classes3.dex */
public final class lcc extends lq2 implements p8b, r8b, Comparable<lcc>, Serializable {
    public static final w8b<lcc> b = new a();
    private static final an2 c = new bn2().p(h71.Y, 4, 10, ika.EXCEEDS_PAD).D();
    private final int a;

    /* compiled from: Year.java */
    /* renamed from: lcc$a */
    /* loaded from: classes3.dex */
    class a implements w8b<lcc> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public lcc a(q8b q8bVar) {
            return lcc.P(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Year.java */
    /* renamed from: lcc$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[m71.values().length];
            b = iArr;
            try {
                iArr[m71.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[m71.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[m71.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[m71.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[m71.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[h71.values().length];
            a = iArr2;
            try {
                iArr2[h71.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h71.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h71.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private lcc(int i) {
        this.a = i;
    }

    public static lcc P(q8b q8bVar) {
        if (q8bVar instanceof lcc) {
            return (lcc) q8bVar;
        }
        try {
            if (!t75.e.equals(p71.w(q8bVar))) {
                q8bVar = ds5.E0(q8bVar);
            }
            return b0(q8bVar.w(h71.Y));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
        }
    }

    public static boolean Q(long j) {
        if ((3 & j) == 0 && (j % 100 != 0 || j % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static lcc b0(int i) {
        h71.Y.E(i);
        return new lcc(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lcc h0(DataInput dataInput) throws IOException {
        return b0(dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 67, this);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.Y || u8bVar == h71.X || u8bVar == h71.Z) {
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
            if (this.a <= 0) {
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
            return (R) m71.YEARS;
        }
        if (w8bVar != v8b.b() && w8bVar != v8b.c() && w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d()) {
            return (R) super.M(w8bVar);
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    public int compareTo(lcc lccVar) {
        return this.a - lccVar.a;
    }

    @Override // defpackage.p8b
    /* renamed from: T */
    public lcc i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return L(Long.MAX_VALUE, x8bVar).L(1L, x8bVar);
        }
        return L(-j, x8bVar);
    }

    @Override // defpackage.p8b
    /* renamed from: e0 */
    public lcc L(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            int i = b.b[((m71) x8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                h71 h71Var = h71.Z;
                                return H(h71Var, g95.k(q(h71Var), j));
                            }
                            throw new UnsupportedTemporalTypeException("Unsupported unit: " + x8bVar);
                        }
                        return f0(g95.l(j, 1000));
                    }
                    return f0(g95.l(j, 100));
                }
                return f0(g95.l(j, 10));
            }
            return f0(j);
        }
        return (lcc) x8bVar.i(this, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lcc) && this.a == ((lcc) obj).a) {
            return true;
        }
        return false;
    }

    public lcc f0(long j) {
        if (j == 0) {
            return this;
        }
        return b0(h71.Y.x(this.a + j));
    }

    public int hashCode() {
        return this.a;
    }

    @Override // defpackage.p8b
    /* renamed from: l0 */
    public lcc s(r8b r8bVar) {
        return (lcc) r8bVar.o(this);
    }

    @Override // defpackage.p8b
    /* renamed from: m0 */
    public lcc H(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            h71Var.E(j);
            int i = b.a[h71Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (q(h71.Z) == j) {
                            return this;
                        }
                        return b0(1 - this.a);
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                }
                return b0((int) j);
            }
            if (this.a < 1) {
                j = 1 - j;
            }
            return b0((int) j);
        }
        return (lcc) u8bVar.o(this, j);
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        if (p71.w(p8bVar).equals(t75.e)) {
            return p8bVar.H(h71.Y, this.a);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = b.a[((h71) u8bVar).ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.a < 1) {
                            i2 = 0;
                        }
                        return i2;
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                }
                return this.a;
            }
            int i3 = this.a;
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        return u8bVar.q(this);
    }

    public String toString() {
        return Integer.toString(this.a);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }
}
