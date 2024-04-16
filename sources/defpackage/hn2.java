package defpackage;

import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: DayOfWeek.java */
/* renamed from: hn2  reason: default package */
/* loaded from: classes3.dex */
public enum hn2 implements q8b, r8b {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    public static final w8b<hn2> h = new w8b<hn2>() { // from class: hn2.a
        @Override // defpackage.w8b
        /* renamed from: b */
        public hn2 a(q8b q8bVar) {
            return hn2.a(q8bVar);
        }
    };
    private static final hn2[] i = values();

    public static hn2 a(q8b q8bVar) {
        if (q8bVar instanceof hn2) {
            return (hn2) q8bVar;
        }
        try {
            return k(q8bVar.w(h71.t));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName(), e);
        }
    }

    public static hn2 k(int i2) {
        if (i2 >= 1 && i2 <= 7) {
            return i[i2 - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i2);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.t) {
                return false;
            }
            return true;
        } else if (u8bVar == null || !u8bVar.i(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar == h71.t) {
            return u8bVar.s();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    @Override // defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.e()) {
            return (R) m71.DAYS;
        }
        if (w8bVar != v8b.b() && w8bVar != v8b.c() && w8bVar != v8b.a() && w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d()) {
            return w8bVar.a(this);
        }
        return null;
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.t, getValue());
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar == h71.t) {
            return getValue();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.q(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    public hn2 u(long j2) {
        return i[(ordinal() + (((int) (j2 % 7)) + 7)) % 7];
    }

    @Override // defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar == h71.t) {
            return getValue();
        }
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }
}
