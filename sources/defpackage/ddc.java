package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.DateTimeException;
/* compiled from: ZonedDateTime.java */
/* renamed from: ddc  reason: default package */
/* loaded from: classes3.dex */
public final class ddc extends n71<ds5> implements p8b, Serializable {
    public static final w8b<ddc> e = new a();
    private final es5 b;
    private final wcc c;
    private final vcc d;

    /* compiled from: ZonedDateTime.java */
    /* renamed from: ddc$a */
    /* loaded from: classes3.dex */
    class a implements w8b<ddc> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public ddc a(q8b q8bVar) {
            return ddc.J0(q8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZonedDateTime.java */
    /* renamed from: ddc$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
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

    private ddc(es5 es5Var, wcc wccVar, vcc vccVar) {
        this.b = es5Var;
        this.c = wccVar;
        this.d = vccVar;
    }

    private static ddc F0(long j, int i, vcc vccVar) {
        wcc a2 = vccVar.u().a(b55.m0(j, i));
        return new ddc(es5.Q0(j, i, a2), a2, vccVar);
    }

    public static ddc J0(q8b q8bVar) {
        if (q8bVar instanceof ddc) {
            return (ddc) q8bVar;
        }
        try {
            vcc a2 = vcc.a(q8bVar);
            h71 h71Var = h71.S4;
            if (q8bVar.G(h71Var)) {
                try {
                    return F0(q8bVar.q(h71Var), q8bVar.w(h71.e), a2);
                } catch (DateTimeException unused) {
                }
            }
            return M0(es5.J0(q8bVar), a2);
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
        }
    }

    public static ddc M0(es5 es5Var, vcc vccVar) {
        return Q0(es5Var, vccVar, null);
    }

    public static ddc N0(b55 b55Var, vcc vccVar) {
        g95.i(b55Var, "instant");
        g95.i(vccVar, "zone");
        return F0(b55Var.T(), b55Var.b0(), vccVar);
    }

    public static ddc O0(es5 es5Var, wcc wccVar, vcc vccVar) {
        g95.i(es5Var, "localDateTime");
        g95.i(wccVar, "offset");
        g95.i(vccVar, "zone");
        return F0(es5Var.l0(wccVar), es5Var.K0(), vccVar);
    }

    private static ddc P0(es5 es5Var, wcc wccVar, vcc vccVar) {
        g95.i(es5Var, "localDateTime");
        g95.i(wccVar, "offset");
        g95.i(vccVar, "zone");
        if ((vccVar instanceof wcc) && !wccVar.equals(vccVar)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ddc(es5Var, wccVar, vccVar);
    }

    public static ddc Q0(es5 es5Var, vcc vccVar, wcc wccVar) {
        g95.i(es5Var, "localDateTime");
        g95.i(vccVar, "zone");
        if (vccVar instanceof wcc) {
            return new ddc(es5Var, (wcc) vccVar, vccVar);
        }
        adc u = vccVar.u();
        List<wcc> c = u.c(es5Var);
        if (c.size() == 1) {
            wccVar = c.get(0);
        } else if (c.size() == 0) {
            xcc b2 = u.b(es5Var);
            es5Var = es5Var.X0(b2.o().o());
            wccVar = b2.u();
        } else if (wccVar == null || !c.contains(wccVar)) {
            wccVar = (wcc) g95.i(c.get(0), "offset");
        }
        return new ddc(es5Var, wccVar, vccVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ddc S0(DataInput dataInput) throws IOException {
        return P0(es5.Z0(dataInput), wcc.m0(dataInput), (vcc) jca.a(dataInput));
    }

    private ddc T0(es5 es5Var) {
        return O0(es5Var, this.c, this.d);
    }

    private ddc U0(es5 es5Var) {
        return Q0(es5Var, this.d, this.c);
    }

    private ddc V0(wcc wccVar) {
        if (!wccVar.equals(this.c) && this.d.u().f(this.b, wccVar)) {
            return new ddc(this.b, wccVar, this.d);
        }
        return this;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 6, this);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (!(u8bVar instanceof h71) && (u8bVar == null || !u8bVar.i(this))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.n71, defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.S4 && u8bVar != h71.T4) {
                return this.b.K(u8bVar);
            }
            return u8bVar.s();
        }
        return u8bVar.k(this);
    }

    public int K0() {
        return this.b.K0();
    }

    @Override // defpackage.n71, defpackage.kq2, defpackage.p8b
    /* renamed from: L0 */
    public ddc i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return l0(Long.MAX_VALUE, x8bVar).l0(1L, x8bVar);
        }
        return l0(-j, x8bVar);
    }

    @Override // defpackage.n71, defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.b()) {
            return (R) o0();
        }
        return (R) super.M(w8bVar);
    }

    @Override // defpackage.n71
    public String Q(an2 an2Var) {
        return super.Q(an2Var);
    }

    @Override // defpackage.n71
    /* renamed from: R0 */
    public ddc l0(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            if (x8bVar.a()) {
                return U0(this.b.h0(j, x8bVar));
            }
            return T0(this.b.h0(j, x8bVar));
        }
        return (ddc) x8bVar.i(this, j);
    }

    @Override // defpackage.n71
    public wcc T() {
        return this.c;
    }

    @Override // defpackage.n71
    /* renamed from: W0 */
    public ds5 o0() {
        return this.b.o0();
    }

    @Override // defpackage.n71
    /* renamed from: X0 */
    public es5 p0() {
        return this.b;
    }

    @Override // defpackage.n71
    /* renamed from: Y0 */
    public ddc x0(r8b r8bVar) {
        if (r8bVar instanceof ds5) {
            return U0(es5.P0((ds5) r8bVar, this.b.p0()));
        }
        if (r8bVar instanceof gs5) {
            return U0(es5.P0(this.b.o0(), (gs5) r8bVar));
        }
        if (r8bVar instanceof es5) {
            return U0((es5) r8bVar);
        }
        if (r8bVar instanceof b55) {
            b55 b55Var = (b55) r8bVar;
            return F0(b55Var.T(), b55Var.b0(), this.d);
        } else if (r8bVar instanceof wcc) {
            return V0((wcc) r8bVar);
        } else {
            return (ddc) r8bVar.o(this);
        }
    }

    @Override // defpackage.n71
    /* renamed from: Z0 */
    public ddc z0(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            int i = b.a[h71Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return U0(this.b.x0(u8bVar, j));
                }
                return V0(wcc.h0(h71Var.x(j)));
            }
            return F0(j, K0(), this.d);
        }
        return (ddc) u8bVar.o(this, j);
    }

    @Override // defpackage.n71
    /* renamed from: a1 */
    public ddc E0(vcc vccVar) {
        g95.i(vccVar, "zone");
        if (this.d.equals(vccVar)) {
            return this;
        }
        return Q0(this.b, vccVar, this.c);
    }

    @Override // defpackage.n71
    public vcc b0() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(DataOutput dataOutput) throws IOException {
        this.b.e1(dataOutput);
        this.c.p0(dataOutput);
        this.d.P(dataOutput);
    }

    @Override // defpackage.n71
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddc)) {
            return false;
        }
        ddc ddcVar = (ddc) obj;
        if (this.b.equals(ddcVar.b) && this.c.equals(ddcVar.c) && this.d.equals(ddcVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.n71
    public int hashCode() {
        return (this.b.hashCode() ^ this.c.hashCode()) ^ Integer.rotateLeft(this.d.hashCode(), 3);
    }

    @Override // defpackage.n71, defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = b.a[((h71) u8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.b.q(u8bVar);
                }
                return T().b0();
            }
            return m0();
        }
        return u8bVar.q(this);
    }

    @Override // defpackage.n71
    public gs5 r0() {
        return this.b.p0();
    }

    @Override // defpackage.n71
    public String toString() {
        String str = this.b.toString() + this.c.toString();
        if (this.c != this.d) {
            return str + '[' + this.d.toString() + ']';
        }
        return str;
    }

    @Override // defpackage.n71, defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            int i = b.a[((h71) u8bVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.b.w(u8bVar);
                }
                return T().b0();
            }
            throw new DateTimeException("Field too large for an int: " + u8bVar);
        }
        return super.w(u8bVar);
    }
}
