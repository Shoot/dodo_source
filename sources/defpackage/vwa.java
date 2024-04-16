package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: StdDateFormat.java */
/* renamed from: vwa  reason: default package */
/* loaded from: classes2.dex */
public class vwa extends DateFormat {
    protected static final Pattern g = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    protected static final Pattern h;
    protected static final String[] i;
    protected static final TimeZone j;
    protected static final Locale k;
    protected static final DateFormat l;
    public static final vwa m;
    protected static final Calendar n;
    protected transient TimeZone a;
    protected final Locale b;
    protected Boolean c;
    private transient Calendar d;
    private transient DateFormat e;
    private boolean f;

    static {
        try {
            h = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            i = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            j = timeZone;
            Locale locale = Locale.US;
            k = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            l = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            m = new vwa();
            n = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public vwa() {
        this.f = true;
        this.b = k;
    }

    private static final DateFormat c(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat dateFormat2;
        if (!locale.equals(k)) {
            dateFormat2 = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = j;
            }
            dateFormat2.setTimeZone(timeZone);
        } else {
            dateFormat2 = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                dateFormat2.setTimeZone(timeZone);
            }
        }
        if (bool != null) {
            dateFormat2.setLenient(bool.booleanValue());
        }
        return dateFormat2;
    }

    protected static <T> boolean d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null && t.equals(t2)) {
            return true;
        }
        return false;
    }

    private static int j(String str, int i2) {
        return ((str.charAt(i2) - '0') * 10) + (str.charAt(i2 + 1) - '0');
    }

    private static int l(String str, int i2) {
        return ((str.charAt(i2) - '0') * 1000) + ((str.charAt(i2 + 1) - '0') * 100) + ((str.charAt(i2 + 2) - '0') * 10) + (str.charAt(i2 + 3) - '0');
    }

    private Date o(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(x37.c(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    private static void s(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 10;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 10;
        }
        stringBuffer.append((char) (i2 + 48));
    }

    private static void w(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 100;
        }
        s(stringBuffer, i2);
    }

    private static void y(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i3 > 99) {
                stringBuffer.append(i3);
            } else {
                s(stringBuffer, i3);
            }
            i2 -= i3 * 100;
        }
        s(stringBuffer, i2);
    }

    protected Date G(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return m(str, parsePosition);
        } catch (IllegalArgumentException e) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e.getMessage()), parsePosition.getErrorIndex());
        }
    }

    protected Date H(String str, ParsePosition parsePosition) {
        if (this.e == null) {
            this.e = c(l, "EEE, dd MMM yyyy HH:mm:ss zzz", this.a, this.b, this.c);
        }
        return this.e.parse(str, parsePosition);
    }

    public vwa K(Locale locale) {
        if (locale.equals(this.b)) {
            return this;
        }
        return new vwa(this.a, locale, this.c, this.f);
    }

    public vwa L(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = j;
        }
        TimeZone timeZone2 = this.a;
        if (timeZone != timeZone2 && !timeZone.equals(timeZone2)) {
            return new vwa(timeZone, this.b, this.c, this.f);
        }
        return this;
    }

    protected void b() {
        this.e = null;
    }

    protected void e(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar i2 = i(timeZone);
        i2.setTime(date);
        int i3 = i2.get(1);
        char c = '+';
        if (i2.get(0) == 0) {
            f(stringBuffer, i3);
        } else {
            if (i3 > 9999) {
                stringBuffer.append('+');
            }
            y(stringBuffer, i3);
        }
        stringBuffer.append(CoreConstants.DASH_CHAR);
        s(stringBuffer, i2.get(2) + 1);
        stringBuffer.append(CoreConstants.DASH_CHAR);
        s(stringBuffer, i2.get(5));
        stringBuffer.append('T');
        s(stringBuffer, i2.get(11));
        stringBuffer.append(CoreConstants.COLON_CHAR);
        s(stringBuffer, i2.get(12));
        stringBuffer.append(CoreConstants.COLON_CHAR);
        s(stringBuffer, i2.get(13));
        stringBuffer.append(CoreConstants.DOT);
        w(stringBuffer, i2.get(14));
        int offset = timeZone.getOffset(i2.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / 60000;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            if (offset < 0) {
                c = CoreConstants.DASH_CHAR;
            }
            stringBuffer.append(c);
            s(stringBuffer, abs);
            if (this.f) {
                stringBuffer.append(CoreConstants.COLON_CHAR);
            }
            s(stringBuffer, abs2);
        } else if (this.f) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    protected void f(StringBuffer stringBuffer, int i2) {
        if (i2 == 1) {
            stringBuffer.append("+0000");
            return;
        }
        stringBuffer.append(CoreConstants.DASH_CHAR);
        y(stringBuffer, i2 - 1);
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.a;
        if (timeZone == null) {
            timeZone = j;
        }
        e(timeZone, this.b, date, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.a;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    protected Calendar i(TimeZone timeZone) {
        Calendar calendar = this.d;
        if (calendar == null) {
            calendar = (Calendar) n.clone();
            this.d = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this.c;
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    protected Date m(String str, ParsePosition parsePosition) throws IllegalArgumentException, ParseException {
        char c;
        String str2;
        int i2;
        int i3;
        int length = str.length();
        TimeZone timeZone = j;
        if (this.a != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this.a;
        }
        Calendar i4 = i(timeZone);
        i4.clear();
        int i5 = 0;
        if (length <= 10) {
            if (g.matcher(str).matches()) {
                i4.set(l(str, 0), j(str, 5) - 1, j(str, 8), 0, 0, 0);
                i4.set(14, 0);
                return i4.getTime();
            }
            str2 = "yyyy-MM-dd";
            c = 1;
        } else {
            Matcher matcher = h.matcher(str);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i6 = end - start;
                if (i6 > 1) {
                    int j2 = j(str, start + 1) * 3600;
                    if (i6 >= 5) {
                        j2 += j(str, end - 2) * 60;
                    }
                    if (str.charAt(start) == '-') {
                        i3 = j2 * (-1000);
                    } else {
                        i3 = j2 * 1000;
                    }
                    i4.set(15, i3);
                    i4.set(16, 0);
                }
                int l2 = l(str, 0);
                int j3 = j(str, 5) - 1;
                int j4 = j(str, 8);
                int j5 = j(str, 11);
                int j6 = j(str, 14);
                if (length > 16 && str.charAt(16) == ':') {
                    i2 = j(str, 17);
                } else {
                    i2 = 0;
                }
                i4.set(l2, j3, j4, j5, j6, i2);
                int start2 = matcher.start(1);
                int i7 = start2 + 1;
                int end2 = matcher.end(1);
                if (i7 >= end2) {
                    i4.set(14, 0);
                } else {
                    int i8 = end2 - i7;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3 && i8 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i7);
                                }
                                i5 = str.charAt(start2 + 3) - '0';
                            }
                            i5 += (str.charAt(start2 + 2) - '0') * 10;
                        }
                        i5 += (str.charAt(i7) - '0') * 100;
                    }
                    i4.set(14, i5);
                }
                return i4.getTime();
            }
            c = 1;
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        }
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[c] = str2;
        objArr[2] = this.c;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr), 0);
    }

    protected Date n(String str, ParsePosition parsePosition) throws ParseException {
        if (r(str)) {
            return G(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (length > 0 || charAt != '-') {
                    break;
                }
            }
        }
        if (length < 0 && (str.charAt(0) == '-' || x37.a(str, false))) {
            return o(str, parsePosition);
        }
        return H(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String[] strArr;
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date n2 = n(trim, parsePosition);
        if (n2 != null) {
            return n2;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : i) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            sb.append(str2);
        }
        sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", trim, sb.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat, java.text.Format
    /* renamed from: q */
    public vwa clone() {
        return new vwa(this.a, this.b, this.c, this.f);
    }

    protected boolean r(String str) {
        if (str.length() < 7 || !Character.isDigit(str.charAt(0)) || !Character.isDigit(str.charAt(3)) || str.charAt(4) != '-' || !Character.isDigit(str.charAt(5))) {
            return false;
        }
        return true;
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!d(valueOf, this.c)) {
            this.c = valueOf;
            b();
        }
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this.a)) {
            b();
            this.a = timeZone;
        }
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.a, this.b, this.c);
    }

    protected vwa(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.a = timeZone;
        this.b = locale;
        this.c = bool;
        this.f = z;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return n(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
