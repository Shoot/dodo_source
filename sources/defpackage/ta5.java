package defpackage;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: JsonFormat.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ta5  reason: default package */
/* loaded from: classes2.dex */
public @interface ta5 {

    /* compiled from: JsonFormat.java */
    /* renamed from: ta5$a */
    /* loaded from: classes2.dex */
    public enum a {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    /* compiled from: JsonFormat.java */
    /* renamed from: ta5$b */
    /* loaded from: classes2.dex */
    public static class b {
        private static final b c = new b(0, 0);
        private final int a;
        private final int b;

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static b a(ta5 ta5Var) {
            return b(ta5Var.with(), ta5Var.without());
        }

        public static b b(a[] aVarArr, a[] aVarArr2) {
            int i = 0;
            for (a aVar : aVarArr) {
                i |= 1 << aVar.ordinal();
            }
            int i2 = 0;
            for (a aVar2 : aVarArr2) {
                i2 |= 1 << aVar2.ordinal();
            }
            return new b(i, i2);
        }

        public static b c() {
            return c;
        }

        public Boolean d(a aVar) {
            int ordinal = 1 << aVar.ordinal();
            if ((this.b & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this.a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public b e(b bVar) {
            if (bVar == null) {
                return this;
            }
            int i = bVar.b;
            int i2 = bVar.a;
            if (i == 0 && i2 == 0) {
                return this;
            }
            int i3 = this.a;
            if (i3 == 0 && this.b == 0) {
                return bVar;
            }
            int i4 = ((~i) & i3) | i2;
            int i5 = this.b;
            int i6 = i | ((~i2) & i5);
            if (i4 == i3 && i6 == i5) {
                return this;
            }
            return new b(i4, i6);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.a == this.a && bVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b + this.a;
        }

        public String toString() {
            if (this == c) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    /* compiled from: JsonFormat.java */
    /* renamed from: ta5$c */
    /* loaded from: classes2.dex */
    public enum c {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean a() {
            if (this != NUMBER && this != NUMBER_INT && this != NUMBER_FLOAT) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: JsonFormat.java */
    /* renamed from: ta5$d */
    /* loaded from: classes2.dex */
    public static class d implements Serializable {
        private static final d h = new d();
        private final String a;
        private final c b;
        private final Locale c;
        private final String d;
        private final Boolean e;
        private final b f;
        private transient TimeZone g;

        public d() {
            this("", c.ANY, "", "", b.c(), null);
        }

        private static <T> boolean a(T t, T t2) {
            if (t == null) {
                if (t2 != null) {
                    return false;
                }
                return true;
            } else if (t2 == null) {
                return false;
            } else {
                return t.equals(t2);
            }
        }

        public static final d b() {
            return h;
        }

        public static d c(boolean z) {
            return new d("", null, null, null, null, b.c(), Boolean.valueOf(z));
        }

        public static final d d(ta5 ta5Var) {
            if (ta5Var == null) {
                return h;
            }
            return new d(ta5Var);
        }

        public static d r(d dVar, d dVar2) {
            if (dVar != null) {
                return dVar.u(dVar2);
            }
            return dVar2;
        }

        public Boolean e(a aVar) {
            return this.f.d(aVar);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && this.f.equals(dVar.f) && a(this.e, dVar.e) && a(this.d, dVar.d) && a(this.a, dVar.a) && a(this.g, dVar.g) && a(this.c, dVar.c)) {
                return true;
            }
            return false;
        }

        public Locale f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode;
            String str = this.d;
            if (str == null) {
                hashCode = 1;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.a;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = hashCode + this.b.hashCode();
            Boolean bool = this.e;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this.c;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return hashCode2 ^ this.f.hashCode();
        }

        public String i() {
            return this.a;
        }

        public c j() {
            return this.b;
        }

        public TimeZone k() {
            TimeZone timeZone = this.g;
            if (timeZone == null) {
                String str = this.d;
                if (str == null) {
                    return null;
                }
                TimeZone timeZone2 = TimeZone.getTimeZone(str);
                this.g = timeZone2;
                return timeZone2;
            }
            return timeZone;
        }

        public boolean l() {
            if (this.e != null) {
                return true;
            }
            return false;
        }

        public boolean m() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        public boolean n() {
            String str = this.a;
            if (str != null && str.length() > 0) {
                return true;
            }
            return false;
        }

        public boolean o() {
            if (this.b != c.ANY) {
                return true;
            }
            return false;
        }

        public boolean q() {
            String str;
            if (this.g == null && ((str = this.d) == null || str.isEmpty())) {
                return false;
            }
            return true;
        }

        public d s(Boolean bool) {
            if (bool == this.e) {
                return this;
            }
            return new d(this.a, this.b, this.c, this.d, this.g, this.f, bool);
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.a, this.b, this.e, this.c, this.d, this.f);
        }

        public final d u(d dVar) {
            d dVar2;
            b e;
            String str;
            TimeZone timeZone;
            if (dVar != null && dVar != (dVar2 = h) && dVar != this) {
                if (this == dVar2) {
                    return dVar;
                }
                String str2 = dVar.a;
                if (str2 == null || str2.isEmpty()) {
                    str2 = this.a;
                }
                String str3 = str2;
                c cVar = dVar.b;
                if (cVar == c.ANY) {
                    cVar = this.b;
                }
                c cVar2 = cVar;
                Locale locale = dVar.c;
                if (locale == null) {
                    locale = this.c;
                }
                Locale locale2 = locale;
                b bVar = this.f;
                if (bVar == null) {
                    e = dVar.f;
                } else {
                    e = bVar.e(dVar.f);
                }
                b bVar2 = e;
                Boolean bool = dVar.e;
                if (bool == null) {
                    bool = this.e;
                }
                Boolean bool2 = bool;
                String str4 = dVar.d;
                if (str4 != null && !str4.isEmpty()) {
                    timeZone = dVar.g;
                    str = str4;
                } else {
                    str = this.d;
                    timeZone = this.g;
                }
                return new d(str3, cVar2, locale2, str, timeZone, bVar2, bool2);
            }
            return this;
        }

        public d(ta5 ta5Var) {
            this(ta5Var.pattern(), ta5Var.shape(), ta5Var.locale(), ta5Var.timezone(), b.a(ta5Var), ta5Var.lenient().a());
        }

        public d(String str, c cVar, String str2, String str3, b bVar, Boolean bool) {
            this(str, cVar, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, bVar, bool);
        }

        public d(String str, c cVar, Locale locale, String str2, TimeZone timeZone, b bVar, Boolean bool) {
            this.a = str == null ? "" : str;
            this.b = cVar == null ? c.ANY : cVar;
            this.c = locale;
            this.g = timeZone;
            this.d = str2;
            this.f = bVar == null ? b.c() : bVar;
            this.e = bool;
        }
    }

    kb7 lenient() default kb7.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    c shape() default c.ANY;

    String timezone() default "##default";

    a[] with() default {};

    a[] without() default {};
}
