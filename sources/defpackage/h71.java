package defpackage;

import java.util.Map;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: ChronoField.java */
/* renamed from: h71  reason: default package */
/* loaded from: classes3.dex */
public final class h71 implements u8b {
    public static final h71 A;
    public static final h71 B;
    public static final h71 I;
    public static final h71 S4;
    public static final h71 T4;
    private static final /* synthetic */ h71[] U4;
    public static final h71 X;
    public static final h71 Y;
    public static final h71 Z;
    public static final h71 e;
    public static final h71 f;
    public static final h71 g;
    public static final h71 h;
    public static final h71 i;
    public static final h71 j;
    public static final h71 k;
    public static final h71 l;
    public static final h71 m;
    public static final h71 n;
    public static final h71 o;
    public static final h71 p;
    public static final h71 q;
    public static final h71 r;
    public static final h71 s;
    public static final h71 t;
    public static final h71 u;
    public static final h71 v;
    public static final h71 w;
    public static final h71 x;
    public static final h71 y;
    public static final h71 z;
    private final String a;
    private final x8b b;
    private final x8b c;
    private final kwb d;

    static {
        m71 m71Var = m71.NANOS;
        m71 m71Var2 = m71.SECONDS;
        h71 h71Var = new h71("NANO_OF_SECOND", 0, "NanoOfSecond", m71Var, m71Var2, kwb.k(0L, 999999999L));
        e = h71Var;
        m71 m71Var3 = m71.DAYS;
        h71 h71Var2 = new h71("NANO_OF_DAY", 1, "NanoOfDay", m71Var, m71Var3, kwb.k(0L, 86399999999999L));
        f = h71Var2;
        m71 m71Var4 = m71.MICROS;
        h71 h71Var3 = new h71("MICRO_OF_SECOND", 2, "MicroOfSecond", m71Var4, m71Var2, kwb.k(0L, 999999L));
        g = h71Var3;
        h71 h71Var4 = new h71("MICRO_OF_DAY", 3, "MicroOfDay", m71Var4, m71Var3, kwb.k(0L, 86399999999L));
        h = h71Var4;
        m71 m71Var5 = m71.MILLIS;
        h71 h71Var5 = new h71("MILLI_OF_SECOND", 4, "MilliOfSecond", m71Var5, m71Var2, kwb.k(0L, 999L));
        i = h71Var5;
        h71 h71Var6 = new h71("MILLI_OF_DAY", 5, "MilliOfDay", m71Var5, m71Var3, kwb.k(0L, 86399999L));
        j = h71Var6;
        m71 m71Var6 = m71.MINUTES;
        h71 h71Var7 = new h71("SECOND_OF_MINUTE", 6, "SecondOfMinute", m71Var2, m71Var6, kwb.k(0L, 59L));
        k = h71Var7;
        h71 h71Var8 = new h71("SECOND_OF_DAY", 7, "SecondOfDay", m71Var2, m71Var3, kwb.k(0L, 86399L));
        l = h71Var8;
        m71 m71Var7 = m71.HOURS;
        h71 h71Var9 = new h71("MINUTE_OF_HOUR", 8, "MinuteOfHour", m71Var6, m71Var7, kwb.k(0L, 59L));
        m = h71Var9;
        h71 h71Var10 = new h71("MINUTE_OF_DAY", 9, "MinuteOfDay", m71Var6, m71Var3, kwb.k(0L, 1439L));
        n = h71Var10;
        m71 m71Var8 = m71.HALF_DAYS;
        h71 h71Var11 = new h71("HOUR_OF_AMPM", 10, "HourOfAmPm", m71Var7, m71Var8, kwb.k(0L, 11L));
        o = h71Var11;
        h71 h71Var12 = new h71("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", m71Var7, m71Var8, kwb.k(1L, 12L));
        p = h71Var12;
        h71 h71Var13 = new h71("HOUR_OF_DAY", 12, "HourOfDay", m71Var7, m71Var3, kwb.k(0L, 23L));
        q = h71Var13;
        h71 h71Var14 = new h71("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", m71Var7, m71Var3, kwb.k(1L, 24L));
        r = h71Var14;
        h71 h71Var15 = new h71("AMPM_OF_DAY", 14, "AmPmOfDay", m71Var8, m71Var3, kwb.k(0L, 1L));
        s = h71Var15;
        m71 m71Var9 = m71.WEEKS;
        h71 h71Var16 = new h71("DAY_OF_WEEK", 15, "DayOfWeek", m71Var3, m71Var9, kwb.k(1L, 7L));
        t = h71Var16;
        h71 h71Var17 = new h71("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", m71Var3, m71Var9, kwb.k(1L, 7L));
        u = h71Var17;
        h71 h71Var18 = new h71("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", m71Var3, m71Var9, kwb.k(1L, 7L));
        v = h71Var18;
        m71 m71Var10 = m71.MONTHS;
        h71 h71Var19 = new h71("DAY_OF_MONTH", 18, "DayOfMonth", m71Var3, m71Var10, kwb.l(1L, 28L, 31L));
        w = h71Var19;
        m71 m71Var11 = m71.YEARS;
        h71 h71Var20 = new h71("DAY_OF_YEAR", 19, "DayOfYear", m71Var3, m71Var11, kwb.l(1L, 365L, 366L));
        x = h71Var20;
        m71 m71Var12 = m71.FOREVER;
        h71 h71Var21 = new h71("EPOCH_DAY", 20, "EpochDay", m71Var3, m71Var12, kwb.k(-365243219162L, 365241780471L));
        y = h71Var21;
        h71 h71Var22 = new h71("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", m71Var9, m71Var10, kwb.l(1L, 4L, 5L));
        z = h71Var22;
        h71 h71Var23 = new h71("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", m71Var9, m71Var11, kwb.k(1L, 53L));
        A = h71Var23;
        h71 h71Var24 = new h71("MONTH_OF_YEAR", 23, "MonthOfYear", m71Var10, m71Var11, kwb.k(1L, 12L));
        B = h71Var24;
        h71 h71Var25 = new h71("PROLEPTIC_MONTH", 24, "ProlepticMonth", m71Var10, m71Var12, kwb.k(-11999999988L, 11999999999L));
        I = h71Var25;
        h71 h71Var26 = new h71("YEAR_OF_ERA", 25, "YearOfEra", m71Var11, m71Var12, kwb.l(1L, 999999999L, 1000000000L));
        X = h71Var26;
        h71 h71Var27 = new h71("YEAR", 26, "Year", m71Var11, m71Var12, kwb.k(-999999999L, 999999999L));
        Y = h71Var27;
        h71 h71Var28 = new h71("ERA", 27, "Era", m71.ERAS, m71Var12, kwb.k(0L, 1L));
        Z = h71Var28;
        h71 h71Var29 = new h71("INSTANT_SECONDS", 28, "InstantSeconds", m71Var2, m71Var12, kwb.k(Long.MIN_VALUE, Long.MAX_VALUE));
        S4 = h71Var29;
        h71 h71Var30 = new h71("OFFSET_SECONDS", 29, "OffsetSeconds", m71Var2, m71Var12, kwb.k(-64800L, 64800L));
        T4 = h71Var30;
        U4 = new h71[]{h71Var, h71Var2, h71Var3, h71Var4, h71Var5, h71Var6, h71Var7, h71Var8, h71Var9, h71Var10, h71Var11, h71Var12, h71Var13, h71Var14, h71Var15, h71Var16, h71Var17, h71Var18, h71Var19, h71Var20, h71Var21, h71Var22, h71Var23, h71Var24, h71Var25, h71Var26, h71Var27, h71Var28, h71Var29, h71Var30};
    }

    private h71(String str, int i2, String str2, x8b x8bVar, x8b x8bVar2, kwb kwbVar) {
        this.a = str2;
        this.b = x8bVar;
        this.c = x8bVar2;
        this.d = kwbVar;
    }

    public static h71 valueOf(String str) {
        return (h71) Enum.valueOf(h71.class, str);
    }

    public static h71[] values() {
        return (h71[]) U4.clone();
    }

    public long E(long j2) {
        return s().b(j2, this);
    }

    @Override // defpackage.u8b
    public boolean a() {
        if (ordinal() >= t.ordinal() && ordinal() <= Z.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.u8b
    public boolean i(q8b q8bVar) {
        return q8bVar.G(this);
    }

    @Override // defpackage.u8b
    public kwb k(q8b q8bVar) {
        return q8bVar.K(this);
    }

    @Override // defpackage.u8b
    public <R extends p8b> R o(R r2, long j2) {
        return (R) r2.H(this, j2);
    }

    @Override // defpackage.u8b
    public long q(q8b q8bVar) {
        return q8bVar.q(this);
    }

    @Override // defpackage.u8b
    public kwb s() {
        return this.d;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }

    @Override // defpackage.u8b
    public boolean u() {
        if (ordinal() < t.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.u8b
    public q8b w(Map<u8b, Long> map, q8b q8bVar, mj9 mj9Var) {
        return null;
    }

    public int x(long j2) {
        return s().a(j2, this);
    }
}
