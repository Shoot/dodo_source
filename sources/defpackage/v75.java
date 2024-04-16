package defpackage;

import java.util.Map;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: IsoFields.java */
/* renamed from: v75  reason: default package */
/* loaded from: classes3.dex */
public final class v75 {
    public static final u8b a = b.a;
    public static final u8b b = b.b;
    public static final u8b c = b.c;
    public static final u8b d = b.d;
    public static final x8b e = c.WEEK_BASED_YEARS;
    public static final x8b f = c.QUARTER_YEARS;

    /* compiled from: IsoFields.java */
    /* renamed from: v75$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IsoFields.java */
    /* renamed from: v75$b */
    /* loaded from: classes3.dex */
    public static abstract class b implements u8b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final int[] e;
        private static final /* synthetic */ b[] f;

        /* compiled from: IsoFields.java */
        /* renamed from: v75$b$a */
        /* loaded from: classes3.dex */
        enum a extends b {
            a(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.u8b
            public boolean i(q8b q8bVar) {
                if (q8bVar.G(h71.x) && q8bVar.G(h71.B) && q8bVar.G(h71.Y) && b.T(q8bVar)) {
                    return true;
                }
                return false;
            }

            @Override // defpackage.u8b
            public kwb k(q8b q8bVar) {
                if (q8bVar.G(this)) {
                    long q = q8bVar.q(b.b);
                    if (q == 1) {
                        if (t75.e.b0(q8bVar.q(h71.Y))) {
                            return kwb.k(1L, 91L);
                        }
                        return kwb.k(1L, 90L);
                    } else if (q == 2) {
                        return kwb.k(1L, 91L);
                    } else {
                        if (q != 3 && q != 4) {
                            return s();
                        }
                        return kwb.k(1L, 92L);
                    }
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            @Override // defpackage.u8b
            public <R extends p8b> R o(R r, long j) {
                long q = q(r);
                s().b(j, this);
                h71 h71Var = h71.x;
                return (R) r.H(h71Var, r.q(h71Var) + (j - q));
            }

            @Override // defpackage.u8b
            public long q(q8b q8bVar) {
                int i;
                if (q8bVar.G(this)) {
                    int w = q8bVar.w(h71.x);
                    int w2 = q8bVar.w(h71.B);
                    long q = q8bVar.q(h71.Y);
                    int[] iArr = b.e;
                    int i2 = (w2 - 1) / 3;
                    if (t75.e.b0(q)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    return w - iArr[i2 + i];
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            @Override // defpackage.u8b
            public kwb s() {
                return kwb.l(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }

            @Override // defpackage.v75.b, defpackage.u8b
            public q8b w(Map<u8b, Long> map, q8b q8bVar, mj9 mj9Var) {
                ds5 d1;
                h71 h71Var = h71.Y;
                Long l = map.get(h71Var);
                u8b u8bVar = b.b;
                Long l2 = map.get(u8bVar);
                if (l != null && l2 != null) {
                    int x = h71Var.x(l.longValue());
                    long longValue = map.get(b.a).longValue();
                    if (mj9Var == mj9.LENIENT) {
                        d1 = ds5.X0(x, 1, 1).e1(g95.l(g95.o(l2.longValue(), 1L), 3)).d1(g95.o(longValue, 1L));
                    } else {
                        int a = u8bVar.s().a(l2.longValue(), u8bVar);
                        if (mj9Var == mj9.STRICT) {
                            int i = 91;
                            if (a == 1) {
                                if (!t75.e.b0(x)) {
                                    i = 90;
                                }
                            } else if (a != 2) {
                                i = 92;
                            }
                            kwb.k(1L, i).b(longValue, this);
                        } else {
                            s().b(longValue, this);
                        }
                        d1 = ds5.X0(x, ((a - 1) * 3) + 1, 1).d1(longValue - 1);
                    }
                    map.remove(this);
                    map.remove(h71Var);
                    map.remove(u8bVar);
                    return d1;
                }
                return null;
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: v75$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        enum C0697b extends b {
            C0697b(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.u8b
            public boolean i(q8b q8bVar) {
                if (q8bVar.G(h71.B) && b.T(q8bVar)) {
                    return true;
                }
                return false;
            }

            @Override // defpackage.u8b
            public kwb k(q8b q8bVar) {
                return s();
            }

            @Override // defpackage.u8b
            public <R extends p8b> R o(R r, long j) {
                long q = q(r);
                s().b(j, this);
                h71 h71Var = h71.B;
                return (R) r.H(h71Var, r.q(h71Var) + ((j - q) * 3));
            }

            @Override // defpackage.u8b
            public long q(q8b q8bVar) {
                if (q8bVar.G(this)) {
                    return (q8bVar.q(h71.B) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // defpackage.u8b
            public kwb s() {
                return kwb.k(1L, 4L);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: v75$b$c */
        /* loaded from: classes3.dex */
        enum c extends b {
            c(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.u8b
            public boolean i(q8b q8bVar) {
                if (q8bVar.G(h71.y) && b.T(q8bVar)) {
                    return true;
                }
                return false;
            }

            @Override // defpackage.u8b
            public kwb k(q8b q8bVar) {
                if (q8bVar.G(this)) {
                    return b.Q(ds5.E0(q8bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // defpackage.u8b
            public <R extends p8b> R o(R r, long j) {
                s().b(j, this);
                return (R) r.L(g95.o(j, q(r)), m71.WEEKS);
            }

            @Override // defpackage.u8b
            public long q(q8b q8bVar) {
                if (q8bVar.G(this)) {
                    return b.M(ds5.E0(q8bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // defpackage.u8b
            public kwb s() {
                return kwb.l(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // defpackage.v75.b, defpackage.u8b
            public q8b w(Map<u8b, Long> map, q8b q8bVar, mj9 mj9Var) {
                u8b u8bVar;
                ds5 p0;
                long j;
                u8b u8bVar2 = b.d;
                Long l = map.get(u8bVar2);
                h71 h71Var = h71.t;
                Long l2 = map.get(h71Var);
                if (l != null && l2 != null) {
                    int a = u8bVar2.s().a(l.longValue(), u8bVar2);
                    long longValue = map.get(b.c).longValue();
                    if (mj9Var == mj9.LENIENT) {
                        long longValue2 = l2.longValue();
                        if (longValue2 > 7) {
                            long j2 = longValue2 - 1;
                            j = j2 / 7;
                            longValue2 = (j2 % 7) + 1;
                        } else if (longValue2 < 1) {
                            j = (longValue2 / 7) - 1;
                            longValue2 = (longValue2 % 7) + 7;
                        } else {
                            j = 0;
                        }
                        u8bVar = u8bVar2;
                        p0 = ds5.X0(a, 1, 4).f1(longValue - 1).f1(j).p0(h71Var, longValue2);
                    } else {
                        u8bVar = u8bVar2;
                        int x = h71Var.x(l2.longValue());
                        if (mj9Var == mj9.STRICT) {
                            b.Q(ds5.X0(a, 1, 4)).b(longValue, this);
                        } else {
                            s().b(longValue, this);
                        }
                        p0 = ds5.X0(a, 1, 4).f1(longValue - 1).p0(h71Var, x);
                    }
                    map.remove(this);
                    map.remove(u8bVar);
                    map.remove(h71Var);
                    return p0;
                }
                return null;
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: v75$b$d */
        /* loaded from: classes3.dex */
        enum d extends b {
            d(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.u8b
            public boolean i(q8b q8bVar) {
                if (q8bVar.G(h71.y) && b.T(q8bVar)) {
                    return true;
                }
                return false;
            }

            @Override // defpackage.u8b
            public kwb k(q8b q8bVar) {
                return h71.Y.s();
            }

            @Override // defpackage.u8b
            public <R extends p8b> R o(R r, long j) {
                if (i(r)) {
                    int a = s().a(j, b.d);
                    ds5 E0 = ds5.E0(r);
                    h71 h71Var = h71.t;
                    int w = E0.w(h71Var);
                    int M = b.M(E0);
                    if (M == 53 && b.P(a) == 52) {
                        M = 52;
                    }
                    ds5 X0 = ds5.X0(a, 1, 4);
                    return (R) r.s(X0.d1((w - X0.w(h71Var)) + ((M - 1) * 7)));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // defpackage.u8b
            public long q(q8b q8bVar) {
                if (q8bVar.G(this)) {
                    return b.N(ds5.E0(q8bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // defpackage.u8b
            public kwb s() {
                return h71.Y.s();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            a = aVar;
            C0697b c0697b = new C0697b("QUARTER_OF_YEAR", 1);
            b = c0697b;
            c cVar = new c("WEEK_OF_WEEK_BASED_YEAR", 2);
            c = cVar;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            d = dVar;
            f = new b[]{aVar, c0697b, cVar, dVar};
            e = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private b(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int M(ds5 ds5Var) {
            int ordinal = ds5Var.L0().ordinal();
            int M0 = ds5Var.M0() - 1;
            int i = (3 - ordinal) + M0;
            int i2 = i - ((i / 7) * 7);
            int i3 = i2 - 3;
            if (i3 < -3) {
                i3 = i2 + 4;
            }
            if (M0 < i3) {
                return (int) Q(ds5Var.m1(180).W0(1L)).c();
            }
            int i4 = ((M0 - i3) / 7) + 1;
            if (i4 == 53 && i3 != -3 && (i3 != -2 || !ds5Var.R0())) {
                return 1;
            }
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int N(ds5 ds5Var) {
            int Q0 = ds5Var.Q0();
            int M0 = ds5Var.M0();
            if (M0 <= 3) {
                if (M0 - ds5Var.L0().ordinal() < -2) {
                    return Q0 - 1;
                }
                return Q0;
            } else if (M0 >= 363) {
                if (((M0 - 363) - (ds5Var.R0() ? 1 : 0)) - ds5Var.L0().ordinal() >= 0) {
                    return Q0 + 1;
                }
                return Q0;
            } else {
                return Q0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int P(int i) {
            ds5 X0 = ds5.X0(i, 1, 1);
            if (X0.L0() != hn2.THURSDAY) {
                if (X0.L0() != hn2.WEDNESDAY || !X0.R0()) {
                    return 52;
                }
                return 53;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static kwb Q(ds5 ds5Var) {
            return kwb.k(1L, P(N(ds5Var)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean T(q8b q8bVar) {
            return p71.w(q8bVar).equals(t75.e);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }

        @Override // defpackage.u8b
        public boolean a() {
            return true;
        }

        @Override // defpackage.u8b
        public boolean u() {
            return false;
        }

        @Override // defpackage.u8b
        public q8b w(Map<u8b, Long> map, q8b q8bVar, mj9 mj9Var) {
            return null;
        }

        /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* compiled from: IsoFields.java */
    /* renamed from: v75$c */
    /* loaded from: classes3.dex */
    private enum c implements x8b {
        WEEK_BASED_YEARS("WeekBasedYears", j93.s(31556952)),
        QUARTER_YEARS("QuarterYears", j93.s(7889238));
        
        private final String a;
        private final j93 b;

        c(String str, j93 j93Var) {
            this.a = str;
            this.b = j93Var;
        }

        @Override // defpackage.x8b
        public boolean a() {
            return true;
        }

        @Override // defpackage.x8b
        public <R extends p8b> R i(R r, long j) {
            int i = a.a[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return (R) r.L(j / 256, m71.YEARS).L((j % 256) * 3, m71.MONTHS);
                }
                throw new IllegalStateException("Unreachable");
            }
            u8b u8bVar = v75.d;
            return (R) r.H(u8bVar, g95.k(r.w(u8bVar), j));
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }
}
