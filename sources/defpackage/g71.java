package defpackage;

import defpackage.i71;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
/* compiled from: ChronoDateImpl.java */
/* renamed from: g71  reason: default package */
/* loaded from: classes3.dex */
abstract class g71<D extends i71> extends i71 implements p8b, r8b, Serializable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoDateImpl.java */
    /* renamed from: g71$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m71.values().length];
            a = iArr;
            try {
                iArr[m71.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m71.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[m71.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[m71.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[m71.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[m71.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[m71.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    abstract g71<D> E0(long j);

    @Override // defpackage.i71
    public j71<?> P(gs5 gs5Var) {
        return k71.z0(this, gs5Var);
    }

    @Override // defpackage.i71
    /* renamed from: r0 */
    public g71<D> h0(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            switch (a.a[((m71) x8bVar).ordinal()]) {
                case 1:
                    return x0(j);
                case 2:
                    return x0(g95.l(j, 7));
                case 3:
                    return z0(j);
                case 4:
                    return E0(j);
                case 5:
                    return E0(g95.l(j, 10));
                case 6:
                    return E0(g95.l(j, 100));
                case 7:
                    return E0(g95.l(j, 1000));
                default:
                    throw new DateTimeException(x8bVar + " not valid for chronology " + T().getId());
            }
        }
        return (g71) T().o(x8bVar.i(this, j));
    }

    abstract g71<D> x0(long j);

    abstract g71<D> z0(long j);
}
