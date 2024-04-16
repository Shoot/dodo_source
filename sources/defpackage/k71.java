package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import defpackage.i71;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChronoLocalDateTimeImpl.java */
/* renamed from: k71  reason: default package */
/* loaded from: classes3.dex */
public final class k71<D extends i71> extends j71<D> implements p8b, r8b, Serializable {
    private final D b;
    private final gs5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoLocalDateTimeImpl.java */
    /* renamed from: k71$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m71.values().length];
            a = iArr;
            try {
                iArr[m71.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m71.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[m71.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[m71.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[m71.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[m71.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[m71.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private k71(D d, gs5 gs5Var) {
        g95.i(d, "date");
        g95.i(gs5Var, CrashHianalyticsData.TIME);
        this.b = d;
        this.c = gs5Var;
    }

    private k71<D> F0(long j) {
        return P0(this.b.L(j, m71.DAYS), this.c);
    }

    private k71<D> J0(long j) {
        return N0(this.b, j, 0L, 0L, 0L);
    }

    private k71<D> K0(long j) {
        return N0(this.b, 0L, j, 0L, 0L);
    }

    private k71<D> L0(long j) {
        return N0(this.b, 0L, 0L, 0L, j);
    }

    private k71<D> N0(D d, long j, long j2, long j3, long j4) {
        gs5 r0;
        if ((j | j2 | j3 | j4) == 0) {
            return P0(d, this.c);
        }
        long N0 = this.c.N0();
        long j5 = (j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L) + N0;
        long e = (j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24) + g95.e(j5, 86400000000000L);
        long h = g95.h(j5, 86400000000000L);
        if (h == N0) {
            r0 = this.c;
        } else {
            r0 = gs5.r0(h);
        }
        return P0(d.L(e, m71.DAYS), r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j71<?> O0(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((i71) objectInput.readObject()).P((gs5) objectInput.readObject());
    }

    private k71<D> P0(p8b p8bVar, gs5 gs5Var) {
        D d = this.b;
        if (d == p8bVar && this.c == gs5Var) {
            return this;
        }
        return new k71<>(d.T().o(p8bVar), gs5Var);
    }

    private Object writeReplace() {
        return new hca((byte) 12, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <R extends i71> k71<R> z0(R r, gs5 gs5Var) {
        return new k71<>(r, gs5Var);
    }

    @Override // defpackage.j71
    /* renamed from: E0 */
    public k71<D> h0(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            switch (a.a[((m71) x8bVar).ordinal()]) {
                case 1:
                    return L0(j);
                case 2:
                    return F0(j / 86400000000L).L0((j % 86400000000L) * 1000);
                case 3:
                    return F0(j / CoreConstants.MILLIS_IN_ONE_DAY).L0((j % CoreConstants.MILLIS_IN_ONE_DAY) * 1000000);
                case 4:
                    return M0(j);
                case 5:
                    return K0(j);
                case 6:
                    return J0(j);
                case 7:
                    return F0(j / 256).J0((j % 256) * 12);
                default:
                    return P0(this.b.L(j, x8bVar), this.c);
            }
        }
        return this.b.T().q(x8bVar.i(this, j));
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.a() || u8bVar.u()) {
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
            if (u8bVar.u()) {
                return this.c.K(u8bVar);
            }
            return this.b.K(u8bVar);
        }
        return u8bVar.k(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k71<D> M0(long j) {
        return N0(this.b, 0L, 0L, j, 0L);
    }

    @Override // defpackage.j71
    public n71<D> P(vcc vccVar) {
        return o71.J0(this, vccVar, null);
    }

    @Override // defpackage.j71, defpackage.kq2, defpackage.p8b
    /* renamed from: Q0 */
    public k71<D> s(r8b r8bVar) {
        if (r8bVar instanceof i71) {
            return P0((i71) r8bVar, this.c);
        }
        if (r8bVar instanceof gs5) {
            return P0(this.b, (gs5) r8bVar);
        }
        if (r8bVar instanceof k71) {
            return this.b.T().q((k71) r8bVar);
        }
        return this.b.T().q((k71) r8bVar.o(this));
    }

    @Override // defpackage.j71
    /* renamed from: R0 */
    public k71<D> x0(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u()) {
                return P0(this.b, this.c.H(u8bVar, j));
            }
            return P0(this.b.H(u8bVar, j), this.c);
        }
        return this.b.T().q(u8bVar.o(this, j));
    }

    @Override // defpackage.j71
    public D o0() {
        return this.b;
    }

    @Override // defpackage.j71
    public gs5 p0() {
        return this.c;
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u()) {
                return this.c.q(u8bVar);
            }
            return this.b.q(u8bVar);
        }
        return u8bVar.q(this);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar.u()) {
                return this.c.w(u8bVar);
            }
            return this.b.w(u8bVar);
        }
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }
}
