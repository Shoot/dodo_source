package defpackage;

import java.io.Serializable;
/* compiled from: ThaiBuddhistChronology.java */
/* renamed from: ldb  reason: default package */
/* loaded from: classes3.dex */
public final class ldb extends p71 implements Serializable {
    public static final ldb e = new ldb();

    /* compiled from: ThaiBuddhistChronology.java */
    /* renamed from: ldb$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.I.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.X.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h71.Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ldb() {
    }

    private Object readResolve() {
        return e;
    }

    @Override // defpackage.p71
    public j71<mdb> G(q8b q8bVar) {
        return super.G(q8bVar);
    }

    @Override // defpackage.p71
    public n71<mdb> P(b55 b55Var, vcc vccVar) {
        return super.P(b55Var, vccVar);
    }

    @Override // defpackage.p71
    /* renamed from: Q */
    public mdb i(int i, int i2, int i3) {
        return new mdb(ds5.X0(i - 543, i2, i3));
    }

    @Override // defpackage.p71
    /* renamed from: T */
    public mdb k(q8b q8bVar) {
        if (q8bVar instanceof mdb) {
            return (mdb) q8bVar;
        }
        return new mdb(ds5.E0(q8bVar));
    }

    @Override // defpackage.p71
    /* renamed from: W */
    public ndb u(int i) {
        return ndb.a(i);
    }

    public kwb b0(h71 h71Var) {
        int i = a.a[h71Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return h71Var.s();
                }
                kwb s = h71.Y.s();
                return kwb.k(s.d() + 543, s.c() + 543);
            }
            kwb s2 = h71.Y.s();
            return kwb.l(1L, 1 + (-(s2.d() + 543)), s2.c() + 543);
        }
        kwb s3 = h71.I.s();
        return kwb.k(s3.d() + 6516, s3.c() + 6516);
    }

    @Override // defpackage.p71
    public String getId() {
        return "ThaiBuddhist";
    }

    @Override // defpackage.p71
    public String x() {
        return "buddhist";
    }
}
