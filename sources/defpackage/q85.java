package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: JapaneseDate.java */
/* renamed from: q85  reason: default package */
/* loaded from: classes3.dex */
public final class q85 extends g71<q85> implements Serializable {
    static final ds5 e = ds5.X0(1873, 1, 1);
    private final ds5 b;
    private transient r85 c;
    private transient int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JapaneseDate.java */
    /* renamed from: q85$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.X.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h71.u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h71.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h71.z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h71.A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h71.Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q85(ds5 ds5Var) {
        if (!ds5Var.e0(e)) {
            r85 P = r85.P(ds5Var);
            this.c = P;
            this.d = ds5Var.Q0() - (P.e0().Q0() - 1);
            this.b = ds5Var;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    private kwb F0(int i) {
        Calendar calendar = Calendar.getInstance(p85.e);
        calendar.set(0, this.c.getValue() + 2);
        calendar.set(this.d, this.b.O0() - 1, this.b.K0());
        return kwb.k(calendar.getActualMinimum(i), calendar.getActualMaximum(i));
    }

    private long K0() {
        int M0;
        if (this.d == 1) {
            M0 = (this.b.M0() - this.c.e0().M0()) + 1;
        } else {
            M0 = this.b.M0();
        }
        return M0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i71 S0(DataInput dataInput) throws IOException {
        return p85.f.i(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private q85 T0(ds5 ds5Var) {
        if (ds5Var.equals(this.b)) {
            return this;
        }
        return new q85(ds5Var);
    }

    private q85 W0(int i) {
        return X0(b0(), i);
    }

    private q85 X0(r85 r85Var, int i) {
        return T0(this.b.p1(p85.f.b0(r85Var, i)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        r85 P = r85.P(this.b);
        this.c = P;
        this.d = this.b.Q0() - (P.e0().Q0() - 1);
    }

    private Object writeReplace() {
        return new hca((byte) 1, this);
    }

    @Override // defpackage.i71, defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar != h71.u && u8bVar != h71.v && u8bVar != h71.z && u8bVar != h71.A) {
            return super.G(u8bVar);
        }
        return false;
    }

    @Override // defpackage.i71
    /* renamed from: J0 */
    public p85 T() {
        return p85.f;
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (G(u8bVar)) {
                h71 h71Var = (h71) u8bVar;
                int i = a.a[h71Var.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return T().e0(h71Var);
                    }
                    return F0(1);
                }
                return F0(6);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }
        return u8bVar.k(this);
    }

    @Override // defpackage.i71
    /* renamed from: L0 */
    public r85 b0() {
        return this.c;
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: M0 */
    public q85 i(long j, x8b x8bVar) {
        return (q85) super.i(j, x8bVar);
    }

    @Override // defpackage.g71
    /* renamed from: N0 */
    public q85 r0(long j, x8b x8bVar) {
        return (q85) super.h0(j, x8bVar);
    }

    @Override // defpackage.i71
    /* renamed from: O0 */
    public q85 l0(t8b t8bVar) {
        return (q85) super.l0(t8bVar);
    }

    @Override // defpackage.g71, defpackage.i71
    public final j71<q85> P(gs5 gs5Var) {
        return super.P(gs5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: P0 */
    public q85 x0(long j) {
        return T0(this.b.d1(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: Q0 */
    public q85 z0(long j) {
        return T0(this.b.e1(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: R0 */
    public q85 E0(long j) {
        return T0(this.b.g1(j));
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: U0 */
    public q85 s(r8b r8bVar) {
        return (q85) super.s(r8bVar);
    }

    @Override // defpackage.i71
    /* renamed from: V0 */
    public q85 p0(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            if (q(h71Var) == j) {
                return this;
            }
            int[] iArr = a.a;
            int i = iArr[h71Var.ordinal()];
            if (i == 1 || i == 2 || i == 7) {
                int a2 = T().e0(h71Var).a(j, h71Var);
                int i2 = iArr[h71Var.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 7) {
                            return X0(r85.Q(a2), this.d);
                        }
                    } else {
                        return W0(a2);
                    }
                } else {
                    return T0(this.b.d1(a2 - K0()));
                }
            }
            return T0(this.b.p0(u8bVar, j));
        }
        return (q85) u8bVar.o(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(w(h71.Y));
        dataOutput.writeByte(w(h71.B));
        dataOutput.writeByte(w(h71.w));
    }

    @Override // defpackage.i71
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q85) {
            return this.b.equals(((q85) obj).b);
        }
        return false;
    }

    @Override // defpackage.i71
    public int hashCode() {
        return T().getId().hashCode() ^ this.b.hashCode();
    }

    @Override // defpackage.i71
    public long m0() {
        return this.b.m0();
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            switch (a.a[((h71) u8bVar).ordinal()]) {
                case 1:
                    return K0();
                case 2:
                    return this.d;
                case 3:
                case 4:
                case 5:
                case 6:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
                case 7:
                    return this.c.getValue();
                default:
                    return this.b.q(u8bVar);
            }
        }
        return u8bVar.q(this);
    }
}
