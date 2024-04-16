package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.DateTimeException;
/* compiled from: WeekFields.java */
/* renamed from: l4c  reason: default package */
/* loaded from: classes3.dex */
public final class l4c implements Serializable {
    private static final ConcurrentMap<String, l4c> h = new ConcurrentHashMap(4, 0.75f, 2);
    public static final l4c i = new l4c(hn2.MONDAY, 4);
    public static final l4c j = e(hn2.SUNDAY, 1);
    private final hn2 a;
    private final int b;
    private final transient u8b c = a.h(this);
    private final transient u8b d = a.l(this);
    private final transient u8b e = a.n(this);
    private final transient u8b f = a.m(this);
    private final transient u8b g = a.j(this);

    /* compiled from: WeekFields.java */
    /* renamed from: l4c$a */
    /* loaded from: classes3.dex */
    static class a implements u8b {
        private static final kwb f = kwb.k(1, 7);
        private static final kwb g = kwb.m(0, 1, 4, 6);
        private static final kwb h = kwb.m(0, 1, 52, 54);
        private static final kwb i = kwb.l(1, 52, 53);
        private static final kwb j = h71.Y.s();
        private final String a;
        private final l4c b;
        private final x8b c;
        private final x8b d;
        private final kwb e;

        private a(String str, l4c l4cVar, x8b x8bVar, x8b x8bVar2, kwb kwbVar) {
            this.a = str;
            this.b = l4cVar;
            this.c = x8bVar;
            this.d = x8bVar2;
            this.e = kwbVar;
        }

        private int b(int i2, int i3) {
            return ((i2 + 7) + (i3 - 1)) / 7;
        }

        private int c(q8b q8bVar, int i2) {
            return g95.f(q8bVar.w(h71.t) - i2, 7) + 1;
        }

        private int d(q8b q8bVar) {
            int i2;
            int f2 = g95.f(q8bVar.w(h71.t) - this.b.c().getValue(), 7) + 1;
            int w = q8bVar.w(h71.Y);
            long g2 = g(q8bVar, f2);
            if (g2 == 0) {
                return w - 1;
            }
            if (g2 < 53) {
                return w;
            }
            int r = r(q8bVar.w(h71.x), f2);
            if (lcc.Q(w)) {
                i2 = 366;
            } else {
                i2 = 365;
            }
            if (g2 >= b(r, i2 + this.b.d())) {
                return w + 1;
            }
            return w;
        }

        private int e(q8b q8bVar) {
            int i2;
            int f2 = g95.f(q8bVar.w(h71.t) - this.b.c().getValue(), 7) + 1;
            long g2 = g(q8bVar, f2);
            if (g2 == 0) {
                return ((int) g(p71.w(q8bVar).k(q8bVar).i(1L, m71.WEEKS), f2)) + 1;
            }
            if (g2 >= 53) {
                int r = r(q8bVar.w(h71.x), f2);
                if (lcc.Q(q8bVar.w(h71.Y))) {
                    i2 = 366;
                } else {
                    i2 = 365;
                }
                int b = b(r, i2 + this.b.d());
                if (g2 >= b) {
                    return (int) (g2 - (b - 1));
                }
            }
            return (int) g2;
        }

        private long f(q8b q8bVar, int i2) {
            int w = q8bVar.w(h71.w);
            return b(r(w, i2), w);
        }

        private long g(q8b q8bVar, int i2) {
            int w = q8bVar.w(h71.x);
            return b(r(w, i2), w);
        }

        static a h(l4c l4cVar) {
            return new a("DayOfWeek", l4cVar, m71.DAYS, m71.WEEKS, f);
        }

        static a j(l4c l4cVar) {
            return new a("WeekBasedYear", l4cVar, v75.e, m71.FOREVER, j);
        }

        static a l(l4c l4cVar) {
            return new a("WeekOfMonth", l4cVar, m71.WEEKS, m71.MONTHS, g);
        }

        static a m(l4c l4cVar) {
            return new a("WeekOfWeekBasedYear", l4cVar, m71.WEEKS, v75.e, i);
        }

        static a n(l4c l4cVar) {
            return new a("WeekOfYear", l4cVar, m71.WEEKS, m71.YEARS, h);
        }

        private kwb p(q8b q8bVar) {
            int i2;
            int f2 = g95.f(q8bVar.w(h71.t) - this.b.c().getValue(), 7) + 1;
            long g2 = g(q8bVar, f2);
            if (g2 == 0) {
                return p(p71.w(q8bVar).k(q8bVar).i(2L, m71.WEEKS));
            }
            int r = r(q8bVar.w(h71.x), f2);
            if (lcc.Q(q8bVar.w(h71.Y))) {
                i2 = 366;
            } else {
                i2 = 365;
            }
            int b = b(r, i2 + this.b.d());
            if (g2 >= b) {
                return p(p71.w(q8bVar).k(q8bVar).L(2L, m71.WEEKS));
            }
            return kwb.k(1L, b - 1);
        }

        private int r(int i2, int i3) {
            int f2 = g95.f(i2 - i3, 7);
            int i4 = -f2;
            if (f2 + 1 > this.b.d()) {
                return 7 - f2;
            }
            return i4;
        }

        @Override // defpackage.u8b
        public boolean a() {
            return true;
        }

        @Override // defpackage.u8b
        public boolean i(q8b q8bVar) {
            if (q8bVar.G(h71.t)) {
                x8b x8bVar = this.d;
                if (x8bVar == m71.WEEKS) {
                    return true;
                }
                if (x8bVar == m71.MONTHS) {
                    return q8bVar.G(h71.w);
                }
                if (x8bVar == m71.YEARS) {
                    return q8bVar.G(h71.x);
                }
                if (x8bVar == v75.e) {
                    return q8bVar.G(h71.y);
                }
                if (x8bVar == m71.FOREVER) {
                    return q8bVar.G(h71.y);
                }
                return false;
            }
            return false;
        }

        @Override // defpackage.u8b
        public kwb k(q8b q8bVar) {
            h71 h71Var;
            x8b x8bVar = this.d;
            if (x8bVar == m71.WEEKS) {
                return this.e;
            }
            if (x8bVar == m71.MONTHS) {
                h71Var = h71.w;
            } else if (x8bVar == m71.YEARS) {
                h71Var = h71.x;
            } else if (x8bVar == v75.e) {
                return p(q8bVar);
            } else {
                if (x8bVar == m71.FOREVER) {
                    return q8bVar.K(h71.Y);
                }
                throw new IllegalStateException("unreachable");
            }
            int value = this.b.c().getValue();
            int r = r(q8bVar.w(h71Var), g95.f(q8bVar.w(h71.t) - value, 7) + 1);
            kwb K = q8bVar.K(h71Var);
            return kwb.k(b(r, (int) K.d()), b(r, (int) K.c()));
        }

        @Override // defpackage.u8b
        public <R extends p8b> R o(R r, long j2) {
            int a = this.e.a(j2, this);
            int w = r.w(this);
            if (a == w) {
                return r;
            }
            if (this.d == m71.FOREVER) {
                int w2 = r.w(this.b.f);
                m71 m71Var = m71.WEEKS;
                p8b L = r.L((long) ((j2 - w) * 52.1775d), m71Var);
                if (L.w(this) > a) {
                    return (R) L.i(L.w(this.b.f), m71Var);
                }
                if (L.w(this) < a) {
                    L = L.L(2L, m71Var);
                }
                R r2 = (R) L.L(w2 - L.w(this.b.f), m71Var);
                if (r2.w(this) > a) {
                    return (R) r2.i(1L, m71Var);
                }
                return r2;
            }
            return (R) r.L(a - w, this.c);
        }

        @Override // defpackage.u8b
        public long q(q8b q8bVar) {
            int d;
            int f2 = g95.f(q8bVar.w(h71.t) - this.b.c().getValue(), 7) + 1;
            x8b x8bVar = this.d;
            if (x8bVar == m71.WEEKS) {
                return f2;
            }
            if (x8bVar == m71.MONTHS) {
                int w = q8bVar.w(h71.w);
                d = b(r(w, f2), w);
            } else if (x8bVar == m71.YEARS) {
                int w2 = q8bVar.w(h71.x);
                d = b(r(w2, f2), w2);
            } else if (x8bVar == v75.e) {
                d = e(q8bVar);
            } else if (x8bVar == m71.FOREVER) {
                d = d(q8bVar);
            } else {
                throw new IllegalStateException("unreachable");
            }
            return d;
        }

        @Override // defpackage.u8b
        public kwb s() {
            return this.e;
        }

        public String toString() {
            return this.a + "[" + this.b.toString() + "]";
        }

        @Override // defpackage.u8b
        public boolean u() {
            return false;
        }

        @Override // defpackage.u8b
        public q8b w(Map<u8b, Long> map, q8b q8bVar, mj9 mj9Var) {
            long j2;
            int c;
            long a;
            i71 i2;
            int c2;
            long a2;
            int c3;
            i71 i3;
            long a3;
            int c4;
            long g2;
            int value = this.b.c().getValue();
            if (this.d == m71.WEEKS) {
                map.put(h71.t, Long.valueOf(g95.f((value - 1) + (this.e.a(map.remove(this).longValue(), this) - 1), 7) + 1));
                return null;
            }
            h71 h71Var = h71.t;
            if (!map.containsKey(h71Var)) {
                return null;
            }
            if (this.d == m71.FOREVER) {
                if (!map.containsKey(this.b.f)) {
                    return null;
                }
                p71 w = p71.w(q8bVar);
                int f2 = g95.f(h71Var.x(map.get(h71Var).longValue()) - value, 7) + 1;
                int a4 = s().a(map.get(this).longValue(), this);
                if (mj9Var == mj9.LENIENT) {
                    i3 = w.i(a4, 1, this.b.d());
                    a3 = map.get(this.b.f).longValue();
                    c4 = c(i3, value);
                    g2 = g(i3, c4);
                } else {
                    i3 = w.i(a4, 1, this.b.d());
                    a3 = this.b.f.s().a(map.get(this.b.f).longValue(), this.b.f);
                    c4 = c(i3, value);
                    g2 = g(i3, c4);
                }
                i71 L = i3.L(((a3 - g2) * 7) + (f2 - c4), m71.DAYS);
                if (mj9Var == mj9.STRICT && L.q(this) != map.get(this).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(this.b.f);
                map.remove(h71Var);
                return L;
            }
            h71 h71Var2 = h71.Y;
            if (!map.containsKey(h71Var2)) {
                return null;
            }
            int f3 = g95.f(h71Var.x(map.get(h71Var).longValue()) - value, 7) + 1;
            int x = h71Var2.x(map.get(h71Var2).longValue());
            p71 w2 = p71.w(q8bVar);
            x8b x8bVar = this.d;
            m71 m71Var = m71.MONTHS;
            if (x8bVar == m71Var) {
                h71 h71Var3 = h71.B;
                if (!map.containsKey(h71Var3)) {
                    return null;
                }
                long longValue = map.remove(this).longValue();
                if (mj9Var == mj9.LENIENT) {
                    i2 = w2.i(x, 1, 1).L(map.get(h71Var3).longValue() - 1, m71Var);
                    a2 = ((longValue - f(i2, c(i2, value))) * 7) + (f3 - c3);
                } else {
                    i2 = w2.i(x, h71Var3.x(map.get(h71Var3).longValue()), 8);
                    a2 = (f3 - c2) + ((this.e.a(longValue, this) - f(i2, c(i2, value))) * 7);
                }
                i71 L2 = i2.L(a2, m71.DAYS);
                if (mj9Var == mj9.STRICT && L2.q(h71Var3) != map.get(h71Var3).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
                map.remove(this);
                map.remove(h71Var2);
                map.remove(h71Var3);
                map.remove(h71Var);
                return L2;
            } else if (x8bVar == m71.YEARS) {
                long longValue2 = map.remove(this).longValue();
                i71 i4 = w2.i(x, 1, 1);
                if (mj9Var == mj9.LENIENT) {
                    c = c(i4, value);
                    a = longValue2 - g(i4, c);
                    j2 = 7;
                } else {
                    j2 = 7;
                    c = c(i4, value);
                    a = this.e.a(longValue2, this) - g(i4, c);
                }
                i71 L3 = i4.L((a * j2) + (f3 - c), m71.DAYS);
                if (mj9Var == mj9.STRICT && L3.q(h71Var2) != map.get(h71Var2).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(h71Var2);
                map.remove(h71Var);
                return L3;
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
    }

    private l4c(hn2 hn2Var, int i2) {
        g95.i(hn2Var, "firstDayOfWeek");
        if (i2 >= 1 && i2 <= 7) {
            this.a = hn2Var;
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException("Minimal number of days is invalid");
    }

    public static l4c e(hn2 hn2Var, int i2) {
        String str = hn2Var.toString() + i2;
        ConcurrentMap<String, l4c> concurrentMap = h;
        l4c l4cVar = concurrentMap.get(str);
        if (l4cVar == null) {
            concurrentMap.putIfAbsent(str, new l4c(hn2Var, i2));
            return concurrentMap.get(str);
        }
        return l4cVar;
    }

    public static l4c f(Locale locale) {
        g95.i(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return e(hn2.SUNDAY.u(gregorianCalendar.getFirstDayOfWeek() - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return e(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid WeekFields" + e.getMessage());
        }
    }

    public u8b b() {
        return this.c;
    }

    public hn2 c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l4c) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public u8b i() {
        return this.g;
    }

    public u8b j() {
        return this.d;
    }

    public u8b k() {
        return this.f;
    }

    public String toString() {
        return "WeekFields[" + this.a + CoreConstants.COMMA_CHAR + this.b + ']';
    }
}
