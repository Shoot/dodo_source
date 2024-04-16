package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: Month.java */
/* renamed from: po6  reason: default package */
/* loaded from: classes3.dex */
public enum po6 implements q8b, r8b {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    public static final w8b<po6> m = new w8b<po6>() { // from class: po6.a
        @Override // defpackage.w8b
        /* renamed from: b */
        public po6 a(q8b q8bVar) {
            return po6.k(q8bVar);
        }
    };
    private static final po6[] n = values();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Month.java */
    /* renamed from: po6$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[po6.values().length];
            a = iArr;
            try {
                iArr[po6.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[po6.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[po6.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[po6.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[po6.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[po6.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[po6.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[po6.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[po6.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[po6.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[po6.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[po6.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static po6 N(int i) {
        if (i >= 1 && i <= 12) {
            return n[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    public static po6 k(q8b q8bVar) {
        if (q8bVar instanceof po6) {
            return (po6) q8bVar;
        }
        try {
            if (!t75.e.equals(p71.w(q8bVar))) {
                q8bVar = ds5.E0(q8bVar);
            }
            return N(q8bVar.w(h71.B));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName(), e);
        }
    }

    public int E() {
        int i = b.a[ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                return 31;
            }
            return 30;
        }
        return 28;
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.B) {
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
        if (u8bVar == h71.B) {
            return u8bVar.s();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    @Override // defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.a()) {
            return (R) t75.e;
        }
        if (w8bVar == v8b.e()) {
            return (R) m71.MONTHS;
        }
        if (w8bVar != v8b.b() && w8bVar != v8b.c() && w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d()) {
            return w8bVar.a(this);
        }
        return null;
    }

    public po6 P(long j) {
        return n[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    public int a(boolean z) {
        switch (b.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + SyslogConstants.LOG_LOCAL3;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        if (p71.w(p8bVar).equals(t75.e)) {
            return p8bVar.H(h71.B, getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar == h71.B) {
            return getValue();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.q(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    public int u(boolean z) {
        int i = b.a[ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                return 31;
            }
            return 30;
        } else if (z) {
            return 29;
        } else {
            return 28;
        }
    }

    @Override // defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar == h71.B) {
            return getValue();
        }
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }

    public int x() {
        int i = b.a[ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                return 31;
            }
            return 30;
        }
        return 29;
    }
}
