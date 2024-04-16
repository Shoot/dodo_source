package defpackage;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
/* compiled from: OffsetTime.java */
/* renamed from: y67  reason: default package */
/* loaded from: classes3.dex */
public final class y67 extends lq2 implements p8b, r8b, Comparable<y67>, Serializable {
    public static final y67 c = gs5.e.N(wcc.j);
    public static final y67 d = gs5.f.N(wcc.i);
    public static final w8b<y67> e = new a();
    private final gs5 a;
    private final wcc b;

    /* compiled from: OffsetTime.java */
    /* renamed from: y67$a */
    /* loaded from: classes3.dex */
    class a implements w8b<y67> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public y67 a(q8b q8bVar) {
            return y67.P(q8bVar);
        }
    }

    private y67(gs5 gs5Var, wcc wccVar) {
        this.a = (gs5) g95.i(gs5Var, CrashHianalyticsData.TIME);
        this.b = (wcc) g95.i(wccVar, "offset");
    }

    public static y67 P(q8b q8bVar) {
        if (q8bVar instanceof y67) {
            return (y67) q8bVar;
        }
        try {
            return new y67(gs5.T(q8bVar), wcc.W(q8bVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
        }
    }

    public static y67 b0(gs5 gs5Var, wcc wccVar) {
        return new y67(gs5Var, wccVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y67 f0(DataInput dataInput) throws IOException {
        return b0(gs5.M0(dataInput), wcc.m0(dataInput));
    }

    private long h0() {
        return this.a.N0() - (this.b.b0() * 1000000000);
    }

    private y67 l0(gs5 gs5Var, wcc wccVar) {
        if (this.a == gs5Var && this.b.equals(wccVar)) {
            return this;
        }
        return new y67(gs5Var, wccVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 66, this);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u() || u8bVar == h71.T4) {
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
            if (u8bVar == h71.T4) {
                return u8bVar.s();
            }
            return this.a.K(u8bVar);
        }
        return u8bVar.k(this);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.e()) {
            return (R) m71.NANOS;
        }
        if (w8bVar != v8b.d() && w8bVar != v8b.f()) {
            if (w8bVar == v8b.c()) {
                return (R) this.a;
            }
            if (w8bVar != v8b.a() && w8bVar != v8b.b() && w8bVar != v8b.g()) {
                return (R) super.M(w8bVar);
            }
            return null;
        }
        return (R) Q();
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    public int compareTo(y67 y67Var) {
        if (this.b.equals(y67Var.b)) {
            return this.a.compareTo(y67Var.a);
        }
        int b = g95.b(h0(), y67Var.h0());
        if (b == 0) {
            return this.a.compareTo(y67Var.a);
        }
        return b;
    }

    public wcc Q() {
        return this.b;
    }

    @Override // defpackage.p8b
    /* renamed from: T */
    public y67 i(long j, x8b x8bVar) {
        if (j == Long.MIN_VALUE) {
            return L(Long.MAX_VALUE, x8bVar).L(1L, x8bVar);
        }
        return L(-j, x8bVar);
    }

    @Override // defpackage.p8b
    /* renamed from: e0 */
    public y67 L(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            return l0(this.a.L(j, x8bVar), this.b);
        }
        return (y67) x8bVar.i(this, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y67)) {
            return false;
        }
        y67 y67Var = (y67) obj;
        if (this.a.equals(y67Var.a) && this.b.equals(y67Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // defpackage.p8b
    /* renamed from: m0 */
    public y67 s(r8b r8bVar) {
        if (r8bVar instanceof gs5) {
            return l0((gs5) r8bVar, this.b);
        }
        if (r8bVar instanceof wcc) {
            return l0(this.a, (wcc) r8bVar);
        }
        if (r8bVar instanceof y67) {
            return (y67) r8bVar;
        }
        return (y67) r8bVar.o(this);
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.f, this.a.N0()).H(h71.T4, Q().b0());
    }

    @Override // defpackage.p8b
    /* renamed from: o0 */
    public y67 H(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.T4) {
                return l0(this.a, wcc.h0(((h71) u8bVar).x(j)));
            }
            return l0(this.a.H(u8bVar, j), this.b);
        }
        return (y67) u8bVar.o(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p0(DataOutput dataOutput) throws IOException {
        this.a.V0(dataOutput);
        this.b.p0(dataOutput);
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar == h71.T4) {
                return Q().b0();
            }
            return this.a.q(u8bVar);
        }
        return u8bVar.q(this);
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        return super.w(u8bVar);
    }
}
