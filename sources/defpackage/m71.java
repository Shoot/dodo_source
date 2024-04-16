package defpackage;
/* compiled from: ChronoUnit.java */
/* renamed from: m71  reason: default package */
/* loaded from: classes3.dex */
public enum m71 implements x8b {
    NANOS("Nanos", j93.q(1)),
    MICROS("Micros", j93.q(1000)),
    MILLIS("Millis", j93.q(1000000)),
    SECONDS("Seconds", j93.s(1)),
    MINUTES("Minutes", j93.s(60)),
    HOURS("Hours", j93.s(3600)),
    HALF_DAYS("HalfDays", j93.s(43200)),
    DAYS("Days", j93.s(86400)),
    WEEKS("Weeks", j93.s(604800)),
    MONTHS("Months", j93.s(2629746)),
    YEARS("Years", j93.s(31556952)),
    DECADES("Decades", j93.s(315569520)),
    CENTURIES("Centuries", j93.s(3155695200L)),
    MILLENNIA("Millennia", j93.s(31556952000L)),
    ERAS("Eras", j93.s(31556952000000000L)),
    FOREVER("Forever", j93.u(Long.MAX_VALUE, 999999999));
    
    private final String a;
    private final j93 b;

    m71(String str, j93 j93Var) {
        this.a = str;
        this.b = j93Var;
    }

    @Override // defpackage.x8b
    public boolean a() {
        if (compareTo(DAYS) >= 0 && this != FOREVER) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x8b
    public <R extends p8b> R i(R r, long j) {
        return (R) r.L(j, this);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
