package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: MinguoDate.java */
/* renamed from: jl6  reason: default package */
/* loaded from: classes3.dex */
public final class jl6 extends g71<jl6> implements Serializable {
    private final ds5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MinguoDate.java */
    /* renamed from: jl6$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h71.z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h71.X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h71.I.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h71.Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h71.Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jl6(ds5 ds5Var) {
        g95.i(ds5Var, "date");
        this.b = ds5Var;
    }

    private long K0() {
        return ((L0() * 12) + this.b.O0()) - 1;
    }

    private int L0() {
        return this.b.Q0() - 1911;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i71 S0(DataInput dataInput) throws IOException {
        return il6.e.i(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private jl6 T0(ds5 ds5Var) {
        if (ds5Var.equals(this.b)) {
            return this;
        }
        return new jl6(ds5Var);
    }

    private Object writeReplace() {
        return new hca((byte) 5, this);
    }

    @Override // defpackage.i71
    /* renamed from: F0 */
    public il6 T() {
        return il6.e;
    }

    @Override // defpackage.i71
    /* renamed from: J0 */
    public kl6 b0() {
        return (kl6) super.b0();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        long c;
        if (u8bVar instanceof h71) {
            if (G(u8bVar)) {
                h71 h71Var = (h71) u8bVar;
                int i = a.a[h71Var.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    if (i != 4) {
                        return T().b0(h71Var);
                    }
                    kwb s = h71.Y.s();
                    if (L0() <= 0) {
                        c = (-s.d()) + 1912;
                    } else {
                        c = s.c() - 1911;
                    }
                    return kwb.k(1L, c);
                }
                return this.b.K(u8bVar);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }
        return u8bVar.k(this);
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: M0 */
    public jl6 i(long j, x8b x8bVar) {
        return (jl6) super.i(j, x8bVar);
    }

    @Override // defpackage.g71
    /* renamed from: N0 */
    public jl6 r0(long j, x8b x8bVar) {
        return (jl6) super.h0(j, x8bVar);
    }

    @Override // defpackage.i71
    /* renamed from: O0 */
    public jl6 l0(t8b t8bVar) {
        return (jl6) super.l0(t8bVar);
    }

    @Override // defpackage.g71, defpackage.i71
    public final j71<jl6> P(gs5 gs5Var) {
        return super.P(gs5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: P0 */
    public jl6 x0(long j) {
        return T0(this.b.d1(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: Q0 */
    public jl6 z0(long j) {
        return T0(this.b.e1(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.g71
    /* renamed from: R0 */
    public jl6 E0(long j) {
        return T0(this.b.g1(j));
    }

    @Override // defpackage.i71, defpackage.kq2, defpackage.p8b
    /* renamed from: U0 */
    public jl6 s(r8b r8bVar) {
        return (jl6) super.s(r8bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // defpackage.i71
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jl6 p0(defpackage.u8b r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.h71
            if (r0 == 0) goto L92
            r0 = r8
            h71 r0 = (defpackage.h71) r0
            long r1 = r7.q(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r7
        L10:
            int[] r1 = defpackage.jl6.a.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L3a
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L3a
            if (r2 == r3) goto L3a
            goto L52
        L25:
            il6 r8 = r7.T()
            kwb r8 = r8.b0(r0)
            r8.b(r9, r0)
            long r0 = r7.K0()
            long r9 = r9 - r0
            jl6 r8 = r7.z0(r9)
            return r8
        L3a:
            il6 r2 = r7.T()
            kwb r2 = r2.b0(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L7b
            if (r0 == r4) goto L6e
            if (r0 == r3) goto L5d
        L52:
            ds5 r0 = r7.b
            ds5 r8 = r0.p0(r8, r9)
            jl6 r8 = r7.T0(r8)
            return r8
        L5d:
            ds5 r8 = r7.b
            int r9 = r7.L0()
            int r9 = 1912 - r9
            ds5 r8 = r8.p1(r9)
            jl6 r8 = r7.T0(r8)
            return r8
        L6e:
            ds5 r8 = r7.b
            int r2 = r2 + 1911
            ds5 r8 = r8.p1(r2)
            jl6 r8 = r7.T0(r8)
            return r8
        L7b:
            ds5 r8 = r7.b
            int r9 = r7.L0()
            r10 = 1
            if (r9 < r10) goto L87
            int r2 = r2 + 1911
            goto L89
        L87:
            int r2 = 1912 - r2
        L89:
            ds5 r8 = r8.p1(r2)
            jl6 r8 = r7.T0(r8)
            return r8
        L92:
            p8b r8 = r8.o(r7, r9)
            jl6 r8 = (defpackage.jl6) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl6.p0(u8b, long):jl6");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(w(h71.Y));
        dataOutput.writeByte(w(h71.B));
        dataOutput.writeByte(w(h71.w));
    }

    @Override // defpackage.i71
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jl6) {
            return this.b.equals(((jl6) obj).b);
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
            int i = a.a[((h71) u8bVar).ordinal()];
            int i2 = 1;
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return this.b.q(u8bVar);
                        }
                        if (L0() < 1) {
                            i2 = 0;
                        }
                        return i2;
                    }
                    return L0();
                }
                return K0();
            }
            int L0 = L0();
            if (L0 < 1) {
                L0 = 1 - L0;
            }
            return L0;
        }
        return u8bVar.q(this);
    }
}
