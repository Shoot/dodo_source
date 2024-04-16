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
/* compiled from: MonthDay.java */
/* renamed from: qo6  reason: default package */
/* loaded from: classes3.dex */
public final class qo6 extends lq2 implements q8b, r8b, Comparable<qo6>, Serializable {
    public static final w8b<qo6> c = new a();
    private static final an2 d = new bn2().f("--").o(h71.B, 2).e(CoreConstants.DASH_CHAR).o(h71.w, 2).D();
    private final int a;
    private final int b;

    /* compiled from: MonthDay.java */
    /* renamed from: qo6$a */
    /* loaded from: classes3.dex */
    class a implements w8b<qo6> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public qo6 a(q8b q8bVar) {
            return qo6.P(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthDay.java */
    /* renamed from: qo6$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private qo6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static qo6 P(q8b q8bVar) {
        if (q8bVar instanceof qo6) {
            return (qo6) q8bVar;
        }
        try {
            if (!t75.e.equals(p71.w(q8bVar))) {
                q8bVar = ds5.E0(q8bVar);
            }
            return T(q8bVar.w(h71.B), q8bVar.w(h71.w));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
        }
    }

    public static qo6 T(int i, int i2) {
        return b0(po6.N(i), i2);
    }

    public static qo6 b0(po6 po6Var, int i) {
        g95.i(po6Var, "month");
        h71.w.E(i);
        if (i <= po6Var.x()) {
            return new qo6(po6Var.getValue(), i);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i + " is not valid for month " + po6Var.name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qo6 e0(DataInput dataInput) throws IOException {
        return T(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 64, this);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.B || u8bVar == h71.w) {
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
        if (u8bVar == h71.B) {
            return u8bVar.s();
        }
        if (u8bVar == h71.w) {
            return kwb.l(1L, Q().E(), Q().x());
        }
        return super.K(u8bVar);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.a()) {
            return (R) t75.e;
        }
        return (R) super.M(w8bVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    public int compareTo(qo6 qo6Var) {
        int i = this.a - qo6Var.a;
        if (i == 0) {
            return this.b - qo6Var.b;
        }
        return i;
    }

    public po6 Q() {
        return po6.N(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo6)) {
            return false;
        }
        qo6 qo6Var = (qo6) obj;
        if (this.a == qo6Var.a && this.b == qo6Var.b) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    public int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        if (p71.w(p8bVar).equals(t75.e)) {
            p8b H = p8bVar.H(h71.B, this.a);
            h71 h71Var = h71.w;
            return H.H(h71Var, Math.min(H.K(h71Var).c(), this.b));
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        int i;
        if (u8bVar instanceof h71) {
            int i2 = b.a[((h71) u8bVar).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.a;
                } else {
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                }
            } else {
                i = this.b;
            }
            return i;
        }
        return u8bVar.q(this);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        if (this.a < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(this.a);
        if (this.b < 10) {
            str2 = "-0";
        } else {
            str2 = "-";
        }
        sb.append(str2);
        sb.append(this.b);
        return sb.toString();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }
}
