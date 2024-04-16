package defpackage;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: JapaneseChronology.java */
/* renamed from: p85  reason: default package */
/* loaded from: classes3.dex */
public final class p85 extends p71 implements Serializable {
    static final Locale e = new Locale("ja", "JP", "JP");
    public static final p85 f = new p85();
    private static final Map<String, String[]> g;
    private static final Map<String, String[]> h;
    private static final Map<String, String[]> i;

    /* compiled from: JapaneseChronology.java */
    /* renamed from: p85$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h71.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h71.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h71.q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h71.o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h71.n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h71.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h71.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h71.k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h71.j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h71.i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[h71.f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[h71.e.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[h71.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[h71.p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[h71.y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[h71.I.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[h71.Z.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[h71.Y.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[h71.X.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[h71.B.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[h71.x.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        HashMap hashMap2 = new HashMap();
        h = hashMap2;
        HashMap hashMap3 = new HashMap();
        i = hashMap3;
        hashMap.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private p85() {
    }

    private Object readResolve() {
        return f;
    }

    @Override // defpackage.p71
    public j71<q85> G(q8b q8bVar) {
        return super.G(q8bVar);
    }

    @Override // defpackage.p71
    public n71<q85> P(b55 b55Var, vcc vccVar) {
        return super.P(b55Var, vccVar);
    }

    @Override // defpackage.p71
    /* renamed from: Q */
    public q85 i(int i2, int i3, int i4) {
        return new q85(ds5.X0(i2, i3, i4));
    }

    @Override // defpackage.p71
    /* renamed from: T */
    public q85 k(q8b q8bVar) {
        if (q8bVar instanceof q85) {
            return (q85) q8bVar;
        }
        return new q85(ds5.E0(q8bVar));
    }

    @Override // defpackage.p71
    /* renamed from: W */
    public r85 u(int i2) {
        return r85.Q(i2);
    }

    public int b0(ek3 ek3Var, int i2) {
        r85 r85Var;
        if (ek3Var instanceof r85) {
            int Q0 = (((r85) ek3Var).e0().Q0() + i2) - 1;
            kwb.k(1L, (r85Var.N().Q0() - r85Var.e0().Q0()) + 1).b(i2, h71.X);
            return Q0;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public kwb e0(h71 h71Var) {
        int[] iArr = a.a;
        switch (iArr[h71Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return h71Var.s();
            default:
                Calendar calendar = Calendar.getInstance(e);
                int i2 = 0;
                switch (iArr[h71Var.ordinal()]) {
                    case 19:
                        r85[] f0 = r85.f0();
                        return kwb.k(f0[0].getValue(), f0[f0.length - 1].getValue());
                    case 20:
                        r85[] f02 = r85.f0();
                        return kwb.k(q85.e.Q0(), f02[f02.length - 1].N().Q0());
                    case 21:
                        r85[] f03 = r85.f0();
                        int Q0 = (f03[f03.length - 1].N().Q0() - f03[f03.length - 1].e0().Q0()) + 1;
                        int i3 = Integer.MAX_VALUE;
                        while (i2 < f03.length) {
                            i3 = Math.min(i3, (f03[i2].N().Q0() - f03[i2].e0().Q0()) + 1);
                            i2++;
                        }
                        return kwb.m(1L, 6L, i3, Q0);
                    case 22:
                        return kwb.m(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case 23:
                        r85[] f04 = r85.f0();
                        int i4 = 366;
                        while (i2 < f04.length) {
                            i4 = Math.min(i4, (f04[i2].e0().T0() - f04[i2].e0().M0()) + 1);
                            i2++;
                        }
                        return kwb.l(1L, i4, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + h71Var);
                }
        }
    }

    @Override // defpackage.p71
    public String getId() {
        return "Japanese";
    }

    @Override // defpackage.p71
    public String x() {
        return "japanese";
    }
}
