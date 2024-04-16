package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0015\u0018\u0000 (2\u00020\u0001:\u0001\fB[\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b&\u0010'J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001d\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010#\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0019\u0010%\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000f¨\u0006)"}, d2 = {"Lnw1;", "", "other", "", "equals", "", "hashCode", "", "toString", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "g", "value", "", c.a, "J", "expiresAt", "()J", DateTokenConverter.CONVERTER_KEY, "domain", "path", "Z", "secure", "()Z", "httpOnly", Image.TYPE_HIGH, "persistent", "i", "hostOnly", "j", "sameSite", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "k", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: nw1  reason: default package */
/* loaded from: classes3.dex */
public final class nw1 {
    public static final a k = new a(null);
    private static final Pattern l = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern n = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final String j;

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lnw1$a;", "", "", "urlHost", "domain", "", "b", Image.TYPE_SMALL, "", "pos", "limit", "", "g", "input", "invert", "a", Image.TYPE_HIGH, "f", "Lsq4;", RemoteMessageConst.Notification.URL, "setCookie", "Lnw1;", c.a, "currentTimeMillis", DateTokenConverter.CONVERTER_KEY, "(JLsq4;Ljava/lang/String;)Lnw1;", "Lgn4;", "headers", "", e.a, "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nw1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i, int i2, boolean z) {
            boolean z2;
            while (i < i2) {
                char charAt = str.charAt(i);
                if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        private final boolean b(String str, String str2) {
            boolean u;
            if (!z65.c(str, str2)) {
                u = l0b.u(str, str2, false, 2, null);
                if (u && str.charAt((str.length() - str2.length()) - 1) == '.' && !rdc.a(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        private final String f(String str) {
            boolean u;
            String p0;
            u = l0b.u(str, ".", false, 2, null);
            if (!u) {
                p0 = m0b.p0(str, ".");
                String k = rdc.k(p0);
                if (k != null) {
                    return k;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long g(String str, int i, int i2) {
            int Z;
            int a = a(str, i, i2, false);
            Matcher matcher = nw1.o.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (a < i2) {
                int a2 = a(str, a + 1, i2, true);
                matcher.region(a, a2);
                if (i4 == -1 && matcher.usePattern(nw1.o).matches()) {
                    String group = matcher.group(1);
                    z65.g(group, "group(...)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    z65.g(group2, "group(...)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    z65.g(group3, "group(...)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(nw1.n).matches()) {
                    String group4 = matcher.group(1);
                    z65.g(group4, "group(...)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(nw1.m).matches()) {
                    String group5 = matcher.group(1);
                    z65.g(group5, "group(...)");
                    Locale locale = Locale.US;
                    z65.g(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    z65.g(lowerCase, "toLowerCase(...)");
                    String pattern = nw1.m.pattern();
                    z65.g(pattern, "pattern(...)");
                    Z = m0b.Z(pattern, lowerCase, 0, false, 6, null);
                    i6 = Z / 4;
                } else if (i3 == -1 && matcher.usePattern(nw1.l).matches()) {
                    String group6 = matcher.group(1);
                    z65.g(group6, "group(...)");
                    i3 = Integer.parseInt(group6);
                }
                a = a(str, a2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                if (i6 != -1) {
                    if (1 <= i5 && i5 < 32) {
                        if (i4 >= 0 && i4 < 24) {
                            if (i7 >= 0 && i7 < 60) {
                                if (i8 >= 0 && i8 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(cec.d);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long h(String str) {
            boolean J;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new ec9("-?\\d+").f(str)) {
                    J = l0b.J(str, "-", false, 2, null);
                    if (J) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e;
            }
        }

        public final nw1 c(sq4 sq4Var, String str) {
            z65.h(sq4Var, RemoteMessageConst.Notification.URL);
            z65.h(str, "setCookie");
            return d(System.currentTimeMillis(), sq4Var, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
            if (r1 > 253402300799999L) goto L88;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final defpackage.nw1 d(long r27, defpackage.sq4 r29, java.lang.String r30) {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nw1.a.d(long, sq4, java.lang.String):nw1");
        }

        public final List<nw1> e(sq4 sq4Var, gn4 gn4Var) {
            List<nw1> l;
            z65.h(sq4Var, RemoteMessageConst.Notification.URL);
            z65.h(gn4Var, "headers");
            List<String> v = gn4Var.v("Set-Cookie");
            int size = v.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                nw1 c = c(sq4Var, v.get(i));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
            }
            if (arrayList == null) {
                l = kc1.l();
                return l;
            }
            List<nw1> unmodifiableList = Collections.unmodifiableList(arrayList);
            z65.e(unmodifiableList);
            return unmodifiableList;
        }
    }

    public /* synthetic */ nw1(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4, str5);
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof nw1) {
            nw1 nw1Var = (nw1) obj;
            if (z65.c(nw1Var.a, this.a) && z65.c(nw1Var.b, this.b) && nw1Var.c == this.c && z65.c(nw1Var.d, this.d) && z65.c(nw1Var.e, this.e) && nw1Var.f == this.f && nw1Var.g == this.g && nw1Var.h == this.h && nw1Var.i == this.i && z65.c(nw1Var.j, this.j)) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(gn2.b(new Date(this.c)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        if (this.j != null) {
            sb.append("; samesite=");
            sb.append(this.j);
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    public final String g() {
        return this.b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int i;
        int hashCode = (((((((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + ax1.a(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + a91.a(this.g)) * 31) + a91.a(this.h)) * 31) + a91.a(this.i)) * 31;
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return f(false);
    }

    private nw1(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }
}
