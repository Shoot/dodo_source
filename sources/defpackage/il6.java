package defpackage;

import java.io.Serializable;
/* compiled from: MinguoChronology.java */
/* renamed from: il6  reason: default package */
/* loaded from: classes3.dex */
public final class il6 extends p71 implements Serializable {
    public static final il6 e = new il6();

    /* compiled from: MinguoChronology.java */
    /* renamed from: il6$a */
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

    private il6() {
    }

    private Object readResolve() {
        return e;
    }

    @Override // defpackage.p71
    public j71<jl6> G(q8b q8bVar) {
        return super.G(q8bVar);
    }

    @Override // defpackage.p71
    public n71<jl6> P(b55 b55Var, vcc vccVar) {
        return super.P(b55Var, vccVar);
    }

    @Override // defpackage.p71
    /* renamed from: Q */
    public jl6 i(int i, int i2, int i3) {
        return new jl6(ds5.X0(i + 1911, i2, i3));
    }

    @Override // defpackage.p71
    /* renamed from: T */
    public jl6 k(q8b q8bVar) {
        if (q8bVar instanceof jl6) {
            return (jl6) q8bVar;
        }
        return new jl6(ds5.E0(q8bVar));
    }

    @Override // defpackage.p71
    /* renamed from: W */
    public kl6 u(int i) {
        return kl6.a(i);
    }

    public kwb b0(h71 h71Var) {
        int i = a.a[h71Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return h71Var.s();
                }
                kwb s = h71.Y.s();
                return kwb.k(s.d() - 1911, s.c() - 1911);
            }
            kwb s2 = h71.Y.s();
            return kwb.l(1L, s2.c() - 1911, (-s2.d()) + 1912);
        }
        kwb s3 = h71.I.s();
        return kwb.k(s3.d() - 22932, s3.c() - 22932);
    }

    @Override // defpackage.p71
    public String getId() {
        return "Minguo";
    }

    @Override // defpackage.p71
    public String x() {
        return "roc";
    }
}
