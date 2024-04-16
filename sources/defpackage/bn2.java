package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.huawei.hms.framework.common.ExceptionCode;
import defpackage.bla;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import org.slf4j.Marker;
import org.threeten.bp.DateTimeException;
/* compiled from: DateTimeFormatterBuilder.java */
/* renamed from: bn2  reason: default package */
/* loaded from: classes3.dex */
public final class bn2 {
    private static final w8b<vcc> h = new a();
    private static final Map<Character, u8b> i;
    static final Comparator<String> j;
    private bn2 a;
    private final bn2 b;
    private final List<g> c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$a */
    /* loaded from: classes3.dex */
    public class a implements w8b<vcc> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public vcc a(q8b q8bVar) {
            vcc vccVar = (vcc) q8bVar.M(v8b.g());
            if (vccVar == null || (vccVar instanceof wcc)) {
                return null;
            }
            return vccVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$b */
    /* loaded from: classes3.dex */
    public class b extends fn2 {
        final /* synthetic */ bla.b b;

        b(bla.b bVar) {
            this.b = bVar;
        }

        @Override // defpackage.fn2
        public String c(u8b u8bVar, long j, scb scbVar, Locale locale) {
            return this.b.a(j, scbVar);
        }

        @Override // defpackage.fn2
        public Iterator<Map.Entry<String, Long>> d(u8b u8bVar, scb scbVar, Locale locale) {
            return this.b.b(scbVar);
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$c */
    /* loaded from: classes3.dex */
    class c implements Comparator<String> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            return str.length() - str2.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$d */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ika.values().length];
            a = iArr;
            try {
                iArr[ika.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ika.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ika.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ika.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$e */
    /* loaded from: classes3.dex */
    public static final class e implements g {
        private final char a;

        e(char c) {
            this.a = c;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            if (!cn2Var.c(this.a, charSequence.charAt(i))) {
                return ~i;
            }
            return i + 1;
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            return "'" + this.a + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$f */
    /* loaded from: classes3.dex */
    public static final class f implements g {
        private final g[] a;
        private final boolean b;

        f(List<g> list, boolean z) {
            this((g[]) list.toArray(new g[list.size()]), z);
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            if (this.b) {
                cn2Var.s();
                int i2 = i;
                for (g gVar : this.a) {
                    i2 = gVar.a(cn2Var, charSequence, i2);
                    if (i2 < 0) {
                        cn2Var.g(false);
                        return i;
                    }
                }
                cn2Var.g(true);
                return i2;
            }
            for (g gVar2 : this.a) {
                i = gVar2.a(cn2Var, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }

        public f b(boolean z) {
            if (z == this.b) {
                return this;
            }
            return new f(this.a, z);
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            int length = sb.length();
            if (this.b) {
                dn2Var.h();
            }
            try {
                for (g gVar : this.a) {
                    if (!gVar.i(dn2Var, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.b) {
                    dn2Var.b();
                }
                return true;
            } finally {
                if (this.b) {
                    dn2Var.b();
                }
            }
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                if (this.b) {
                    str = "[";
                } else {
                    str = "(";
                }
                sb.append(str);
                for (g gVar : this.a) {
                    sb.append(gVar);
                }
                if (this.b) {
                    str2 = "]";
                } else {
                    str2 = ")";
                }
                sb.append(str2);
            }
            return sb.toString();
        }

        f(g[] gVarArr, boolean z) {
            this.a = gVarArr;
            this.b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$g */
    /* loaded from: classes3.dex */
    public interface g {
        int a(cn2 cn2Var, CharSequence charSequence, int i);

        boolean i(dn2 dn2Var, StringBuilder sb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$h */
    /* loaded from: classes3.dex */
    public static final class h implements g {
        private final u8b a;
        private final int b;
        private final int c;
        private final boolean d;

        h(u8b u8bVar, int i, int i2, boolean z) {
            g95.i(u8bVar, "field");
            if (u8bVar.s().e()) {
                if (i >= 0 && i <= 9) {
                    if (i2 >= 1 && i2 <= 9) {
                        if (i2 >= i) {
                            this.a = u8bVar;
                            this.b = i;
                            this.c = i2;
                            this.d = z;
                            return;
                        }
                        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
                    }
                    throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
                }
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            }
            throw new IllegalArgumentException("Field must have a fixed set of values: " + u8bVar);
        }

        private long b(BigDecimal bigDecimal) {
            kwb s = this.a.s();
            BigDecimal valueOf = BigDecimal.valueOf(s.d());
            return bigDecimal.multiply(BigDecimal.valueOf(s.c()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        private BigDecimal c(long j) {
            kwb s = this.a.s();
            s.b(j, this.a);
            BigDecimal valueOf = BigDecimal.valueOf(s.d());
            BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(s.c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (divide.compareTo(bigDecimal) != 0) {
                return divide.stripTrailingZeros();
            }
            return bigDecimal;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4 = 0;
            if (cn2Var.m()) {
                i2 = this.b;
            } else {
                i2 = 0;
            }
            if (cn2Var.m()) {
                i3 = this.c;
            } else {
                i3 = 9;
            }
            int length = charSequence.length();
            if (i == length) {
                if (i2 > 0) {
                    return ~i;
                }
                return i;
            }
            if (this.d) {
                if (charSequence.charAt(i) != cn2Var.k().c()) {
                    if (i2 > 0) {
                        return ~i;
                    }
                    return i;
                }
                i++;
            }
            int i5 = i;
            int i6 = i2 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int min = Math.min(i3 + i5, length);
            int i7 = i5;
            while (true) {
                if (i7 >= min) {
                    break;
                }
                int i8 = i7 + 1;
                int b = cn2Var.k().b(charSequence.charAt(i7));
                if (b < 0) {
                    if (i8 < i6) {
                        return ~i5;
                    }
                } else {
                    i4 = (i4 * 10) + b;
                    i7 = i8;
                }
            }
            return cn2Var.p(this.a, b(new BigDecimal(i4).movePointLeft(i7 - i5)), i5, i7);
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            Long f = dn2Var.f(this.a);
            if (f == null) {
                return false;
            }
            oo2 d = dn2Var.d();
            BigDecimal c = c(f.longValue());
            if (c.scale() == 0) {
                if (this.b > 0) {
                    if (this.d) {
                        sb.append(d.c());
                    }
                    for (int i = 0; i < this.b; i++) {
                        sb.append(d.f());
                    }
                    return true;
                }
                return true;
            }
            String a = d.a(c.setScale(Math.min(Math.max(c.scale(), this.b), this.c), RoundingMode.FLOOR).toPlainString().substring(2));
            if (this.d) {
                sb.append(d.c());
            }
            sb.append(a);
            return true;
        }

        public String toString() {
            String str;
            if (this.d) {
                str = ",DecimalPoint";
            } else {
                str = "";
            }
            return "Fraction(" + this.a + "," + this.b + "," + this.c + str + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$i */
    /* loaded from: classes3.dex */
    public static final class i implements g {
        private final int a;

        i(int i) {
            this.a = i;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            cn2 e = cn2Var.e();
            int i7 = this.a;
            int i8 = 0;
            if (i7 < 0) {
                i2 = 0;
            } else {
                i2 = i7;
            }
            if (i7 < 0) {
                i7 = 9;
            }
            bn2 e2 = new bn2().a(an2.h).e('T');
            h71 h71Var = h71.q;
            bn2 e3 = e2.o(h71Var, 2).e(CoreConstants.COLON_CHAR);
            h71 h71Var2 = h71.m;
            bn2 e4 = e3.o(h71Var2, 2).e(CoreConstants.COLON_CHAR);
            h71 h71Var3 = h71.k;
            bn2 o = e4.o(h71Var3, 2);
            h71 h71Var4 = h71.e;
            int a = o.b(h71Var4, i2, i7, true).e('Z').D().l(false).a(e, charSequence, i);
            if (a < 0) {
                return a;
            }
            long longValue = e.j(h71.Y).longValue();
            int intValue = e.j(h71.B).intValue();
            int intValue2 = e.j(h71.w).intValue();
            int intValue3 = e.j(h71Var).intValue();
            int intValue4 = e.j(h71Var2).intValue();
            Long j = e.j(h71Var3);
            Long j2 = e.j(h71Var4);
            if (j != null) {
                i3 = j.intValue();
            } else {
                i3 = 0;
            }
            if (j2 != null) {
                i4 = j2.intValue();
            } else {
                i4 = 0;
            }
            int i9 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && i3 == 0 && i4 == 0) {
                i6 = i3;
                i8 = 1;
                i5 = 0;
            } else if (intValue3 == 23 && intValue4 == 59 && i3 == 60) {
                cn2Var.q();
                i5 = intValue3;
                i6 = 59;
            } else {
                i5 = intValue3;
                i6 = i3;
            }
            try {
                return cn2Var.p(h71Var4, i4, i, cn2Var.p(h71.S4, g95.m(longValue / AbstractComponentTracker.LINGERING_TIMEOUT, 315569520000L) + es5.O0(i9, intValue, intValue2, i5, intValue4, i6, 0).T0(i8).l0(wcc.h), i, a));
            } catch (RuntimeException unused) {
                return ~i;
            }
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            Long f = dn2Var.f(h71.S4);
            Long l = 0L;
            q8b e = dn2Var.e();
            h71 h71Var = h71.e;
            if (e.G(h71Var)) {
                l = Long.valueOf(dn2Var.e().q(h71Var));
            }
            int i = 0;
            if (f == null) {
                return false;
            }
            long longValue = f.longValue();
            int x = h71Var.x(l.longValue());
            if (longValue >= -62167219200L) {
                long j = longValue - 253402300800L;
                long e2 = g95.e(j, 315569520000L) + 1;
                es5 Q0 = es5.Q0(g95.h(j, 315569520000L) - 62167219200L, 0, wcc.h);
                if (e2 > 0) {
                    sb.append('+');
                    sb.append(e2);
                }
                sb.append(Q0);
                if (Q0.L0() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                es5 Q02 = es5.Q0(j4 - 62167219200L, 0, wcc.h);
                int length = sb.length();
                sb.append(Q02);
                if (Q02.L0() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (Q02.M0() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.a;
            if (i2 == -2) {
                if (x != 0) {
                    sb.append(CoreConstants.DOT);
                    if (x % 1000000 == 0) {
                        sb.append(Integer.toString((x / 1000000) + 1000).substring(1));
                    } else if (x % 1000 == 0) {
                        sb.append(Integer.toString((x / 1000) + 1000000).substring(1));
                    } else {
                        sb.append(Integer.toString(x + 1000000000).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && x > 0)) {
                sb.append(CoreConstants.DOT);
                int i3 = 100000000;
                while (true) {
                    int i4 = this.a;
                    if ((i4 != -1 || x <= 0) && i >= i4) {
                        break;
                    }
                    int i5 = x / i3;
                    sb.append((char) (i5 + 48));
                    x -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$j */
    /* loaded from: classes3.dex */
    public static final class j implements g {
        private final scb a;

        public j(scb scbVar) {
            this.a = scbVar;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            char charAt;
            if (!cn2Var.t(charSequence, i, "GMT", 0, 3)) {
                return ~i;
            }
            int i5 = i + 3;
            if (this.a == scb.FULL) {
                return new l("", "+HH:MM:ss").a(cn2Var, charSequence, i5);
            }
            int length = charSequence.length();
            if (i5 == length) {
                return cn2Var.p(h71.T4, 0L, i5, i5);
            }
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 != '+' && charAt2 != '-') {
                return cn2Var.p(h71.T4, 0L, i5, i5);
            }
            if (charAt2 == '-') {
                i2 = -1;
            } else {
                i2 = 1;
            }
            if (i5 == length) {
                return ~i5;
            }
            int i6 = i + 4;
            char charAt3 = charSequence.charAt(i6);
            if (charAt3 >= '0' && charAt3 <= '9') {
                int i7 = i + 5;
                int i8 = charAt3 - '0';
                if (i7 != length && (charAt = charSequence.charAt(i7)) >= '0' && charAt <= '9') {
                    i8 = (i8 * 10) + (charAt - '0');
                    if (i8 > 23) {
                        return ~i7;
                    }
                    i7 = i + 6;
                }
                int i9 = i7;
                if (i9 != length && charSequence.charAt(i9) == ':') {
                    int i10 = i9 + 1;
                    int i11 = length - 2;
                    if (i10 > i11) {
                        return ~i10;
                    }
                    char charAt4 = charSequence.charAt(i10);
                    if (charAt4 >= '0' && charAt4 <= '9') {
                        int i12 = i9 + 2;
                        int i13 = charAt4 - '0';
                        char charAt5 = charSequence.charAt(i12);
                        if (charAt5 >= '0' && charAt5 <= '9') {
                            int i14 = i9 + 3;
                            if ((i13 * 10) + (charAt5 - '0') > 59) {
                                return ~i14;
                            }
                            if (i14 != length && charSequence.charAt(i14) == ':') {
                                int i15 = i9 + 4;
                                if (i15 > i11) {
                                    return ~i15;
                                }
                                char charAt6 = charSequence.charAt(i15);
                                if (charAt6 >= '0' && charAt6 <= '9') {
                                    int i16 = i9 + 5;
                                    int i17 = charAt6 - '0';
                                    char charAt7 = charSequence.charAt(i16);
                                    if (charAt7 >= '0' && charAt7 <= '9') {
                                        int i18 = i9 + 6;
                                        if ((i17 * 10) + (charAt7 - '0') > 59) {
                                            return ~i18;
                                        }
                                        return cn2Var.p(h71.T4, i2 * ((i8 * 3600) + (i3 * 60) + i4), i18, i18);
                                    }
                                    return ~i16;
                                }
                                return ~i15;
                            }
                            return cn2Var.p(h71.T4, i2 * ((i8 * 3600) + (i3 * 60)), i14, i14);
                        }
                        return ~i12;
                    }
                    return ~i10;
                }
                return cn2Var.p(h71.T4, i2 * 3600 * i8, i9, i9);
            }
            return ~i6;
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            String str;
            Long f = dn2Var.f(h71.T4);
            if (f == null) {
                return false;
            }
            sb.append("GMT");
            if (this.a == scb.FULL) {
                return new l("", "+HH:MM:ss").i(dn2Var, sb);
            }
            int p = g95.p(f.longValue());
            if (p != 0) {
                int abs = Math.abs((p / 3600) % 100);
                int abs2 = Math.abs((p / 60) % 60);
                int abs3 = Math.abs(p % 60);
                if (p < 0) {
                    str = "-";
                } else {
                    str = Marker.ANY_NON_NULL_MARKER;
                }
                sb.append(str);
                sb.append(abs);
                if (abs2 > 0 || abs3 > 0) {
                    sb.append(":");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    if (abs3 > 0) {
                        sb.append(":");
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$k */
    /* loaded from: classes3.dex */
    public static class k implements g {
        static final int[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};
        final u8b a;
        final int b;
        final int c;
        final ika d;
        final int e;

        /* synthetic */ k(u8b u8bVar, int i, int i2, ika ikaVar, int i3, a aVar) {
            this(u8bVar, i, i2, ikaVar, i3);
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x017f  */
        @Override // defpackage.bn2.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(defpackage.cn2 r20, java.lang.CharSequence r21, int r22) {
            /*
                Method dump skipped, instructions count: 393
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bn2.k.a(cn2, java.lang.CharSequence, int):int");
        }

        boolean c(cn2 cn2Var) {
            int i = this.e;
            if (i != -1 && (i <= 0 || this.b != this.c || this.d != ika.NOT_NEGATIVE)) {
                return false;
            }
            return true;
        }

        int d(cn2 cn2Var, long j, int i, int i2) {
            return cn2Var.p(this.a, j, i, i2);
        }

        k e() {
            if (this.e == -1) {
                return this;
            }
            return new k(this.a, this.b, this.c, this.d, -1);
        }

        k f(int i) {
            return new k(this.a, this.b, this.c, this.d, this.e + i);
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            String l;
            Long f2 = dn2Var.f(this.a);
            if (f2 == null) {
                return false;
            }
            long b = b(dn2Var, f2.longValue());
            oo2 d = dn2Var.d();
            if (b == Long.MIN_VALUE) {
                l = "9223372036854775808";
            } else {
                l = Long.toString(Math.abs(b));
            }
            if (l.length() <= this.c) {
                String a = d.a(l);
                if (b >= 0) {
                    int i = d.a[this.d.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            sb.append(d.e());
                        }
                    } else {
                        int i2 = this.b;
                        if (i2 < 19 && b >= f[i2]) {
                            sb.append(d.e());
                        }
                    }
                } else {
                    int i3 = d.a[this.d.ordinal()];
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        if (i3 == 4) {
                            throw new DateTimeException("Field " + this.a + " cannot be printed as the value " + b + " cannot be negative according to the SignStyle");
                        }
                    } else {
                        sb.append(d.d());
                    }
                }
                for (int i4 = 0; i4 < this.b - a.length(); i4++) {
                    sb.append(d.f());
                }
                sb.append(a);
                return true;
            }
            throw new DateTimeException("Field " + this.a + " cannot be printed as the value " + b + " exceeds the maximum print width of " + this.c);
        }

        public String toString() {
            int i = this.b;
            if (i == 1 && this.c == 19 && this.d == ika.NORMAL) {
                return "Value(" + this.a + ")";
            } else if (i == this.c && this.d == ika.NOT_NEGATIVE) {
                return "Value(" + this.a + "," + this.b + ")";
            } else {
                return "Value(" + this.a + "," + this.b + "," + this.c + "," + this.d + ")";
            }
        }

        k(u8b u8bVar, int i, int i2, ika ikaVar) {
            this.a = u8bVar;
            this.b = i;
            this.c = i2;
            this.d = ikaVar;
            this.e = 0;
        }

        private k(u8b u8bVar, int i, int i2, ika ikaVar, int i3) {
            this.a = u8bVar;
            this.b = i;
            this.c = i2;
            this.d = ikaVar;
            this.e = i3;
        }

        long b(dn2 dn2Var, long j) {
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$l */
    /* loaded from: classes3.dex */
    public static final class l implements g {
        static final String[] c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        static final l d = new l("Z", "+HH:MM:ss");
        static final l e = new l("0", "+HH:MM:ss");
        private final String a;
        private final int b;

        l(String str, String str2) {
            g95.i(str, "noOffsetText");
            g95.i(str2, "pattern");
            this.a = str;
            this.b = b(str2);
        }

        private int b(String str) {
            int i = 0;
            while (true) {
                String[] strArr = c;
                if (i < strArr.length) {
                    if (strArr[i].equals(str)) {
                        return i;
                    }
                    i++;
                } else {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                }
            }
        }

        private boolean c(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.b;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 <= charSequence.length() && charSequence.charAt(i4) == ':') {
                    i4 = i5;
                } else {
                    return z;
                }
            }
            if (i4 + 2 > charSequence.length()) {
                return z;
            }
            int i6 = i4 + 1;
            char charAt = charSequence.charAt(i4);
            int i7 = i4 + 2;
            char charAt2 = charSequence.charAt(i6);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9' && (i2 = ((charAt - '0') * 10) + (charAt2 - '0')) >= 0 && i2 <= 59) {
                iArr[i] = i2;
                iArr[0] = i7;
                return false;
            }
            return z;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            int i2;
            boolean z;
            int length = charSequence.length();
            int length2 = this.a.length();
            if (length2 == 0) {
                if (i == length) {
                    return cn2Var.p(h71.T4, 0L, i, i);
                }
            } else if (i == length) {
                return ~i;
            } else {
                if (cn2Var.t(charSequence, i, this.a, 0, length2)) {
                    return cn2Var.p(h71.T4, 0L, i, i + length2);
                }
            }
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '-') {
                if (charAt == '-') {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                int[] iArr = new int[4];
                iArr[0] = i + 1;
                if (!c(iArr, 1, charSequence, true)) {
                    if (this.b >= 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!c(iArr, 2, charSequence, z) && !c(iArr, 3, charSequence, false)) {
                        return cn2Var.p(h71.T4, i2 * ((iArr[1] * 3600) + (iArr[2] * 60) + iArr[3]), i, iArr[0]);
                    }
                }
            }
            if (length2 == 0) {
                return cn2Var.p(h71.T4, 0L, i, i + length2);
            }
            return ~i;
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            String str;
            String str2;
            Long f = dn2Var.f(h71.T4);
            if (f == null) {
                return false;
            }
            int p = g95.p(f.longValue());
            if (p == 0) {
                sb.append(this.a);
            } else {
                int abs = Math.abs((p / 3600) % 100);
                int abs2 = Math.abs((p / 60) % 60);
                int abs3 = Math.abs(p % 60);
                int length = sb.length();
                if (p < 0) {
                    str = "-";
                } else {
                    str = Marker.ANY_NON_NULL_MARKER;
                }
                sb.append(str);
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i = this.b;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    String str3 = "";
                    if (i % 2 != 0) {
                        str2 = "";
                    } else {
                        str2 = ":";
                    }
                    sb.append(str2);
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i2 = this.b;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 % 2 == 0) {
                            str3 = ":";
                        }
                        sb.append(str3);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.a);
                }
            }
            return true;
        }

        public String toString() {
            String replace = this.a.replace("'", "''");
            return "Offset(" + c[this.b] + ",'" + replace + "')";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$m */
    /* loaded from: classes3.dex */
    public static final class m implements g {
        private final g a;
        private final int b;
        private final char c;

        m(g gVar, int i, char c) {
            this.a = gVar;
            this.b = i;
            this.c = c;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            boolean m = cn2Var.m();
            boolean l = cn2Var.l();
            if (i <= charSequence.length()) {
                if (i == charSequence.length()) {
                    return ~i;
                }
                int i2 = this.b + i;
                if (i2 > charSequence.length()) {
                    if (m) {
                        return ~i;
                    }
                    i2 = charSequence.length();
                }
                int i3 = i;
                while (i3 < i2) {
                    if (l) {
                        if (charSequence.charAt(i3) != this.c) {
                            break;
                        }
                        i3++;
                    } else if (!cn2Var.c(charSequence.charAt(i3), this.c)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                int a = this.a.a(cn2Var, charSequence.subSequence(0, i2), i3);
                if (a != i2 && m) {
                    return ~(i + i3);
                }
                return a;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            int length = sb.length();
            if (!this.a.i(dn2Var, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.b) {
                for (int i = 0; i < this.b - length2; i++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.b);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b);
            if (this.c == ' ') {
                str = ")";
            } else {
                str = ",'" + this.c + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$o */
    /* loaded from: classes3.dex */
    public enum o implements g {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            cn2Var.r(false);
                        }
                    } else {
                        cn2Var.r(true);
                    }
                } else {
                    cn2Var.n(false);
                }
            } else {
                cn2Var.n(true);
            }
            return i;
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return "ParseStrict(false)";
                        }
                        throw new IllegalStateException("Unreachable");
                    }
                    return "ParseStrict(true)";
                }
                return "ParseCaseSensitive(false)";
            }
            return "ParseCaseSensitive(true)";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$p */
    /* loaded from: classes3.dex */
    public static final class p implements g {
        private final String a;

        p(String str) {
            this.a = str;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            if (i <= charSequence.length() && i >= 0) {
                String str = this.a;
                if (!cn2Var.t(charSequence, i, str, 0, str.length())) {
                    return ~i;
                }
                return i + this.a.length();
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            String replace = this.a.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$q */
    /* loaded from: classes3.dex */
    public static final class q implements g {
        private final u8b a;
        private final scb b;
        private final fn2 c;
        private volatile k d;

        q(u8b u8bVar, scb scbVar, fn2 fn2Var) {
            this.a = u8bVar;
            this.b = scbVar;
            this.c = fn2Var;
        }

        private k b() {
            if (this.d == null) {
                this.d = new k(this.a, 1, 19, ika.NORMAL);
            }
            return this.d;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            scb scbVar;
            int length = charSequence.length();
            if (i >= 0 && i <= length) {
                if (cn2Var.m()) {
                    scbVar = this.b;
                } else {
                    scbVar = null;
                }
                Iterator<Map.Entry<String, Long>> d = this.c.d(this.a, scbVar, cn2Var.i());
                if (d != null) {
                    while (d.hasNext()) {
                        Map.Entry<String, Long> next = d.next();
                        String key = next.getKey();
                        if (cn2Var.t(key, 0, charSequence, i, key.length())) {
                            return cn2Var.p(this.a, next.getValue().longValue(), i, i + key.length());
                        }
                    }
                    if (cn2Var.m()) {
                        return ~i;
                    }
                }
                return b().a(cn2Var, charSequence, i);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            Long f = dn2Var.f(this.a);
            if (f == null) {
                return false;
            }
            String c = this.c.c(this.a, f.longValue(), this.b, dn2Var.c());
            if (c == null) {
                return b().i(dn2Var, sb);
            }
            sb.append(c);
            return true;
        }

        public String toString() {
            if (this.b == scb.FULL) {
                return "Text(" + this.a + ")";
            }
            return "Text(" + this.a + "," + this.b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$r */
    /* loaded from: classes3.dex */
    public static final class r implements g {
        private final char a;
        private final int b;

        public r(char c, int i) {
            this.a = c;
            this.b = i;
        }

        private g b(l4c l4cVar) {
            ika ikaVar;
            char c = this.a;
            if (c != 'W') {
                if (c != 'Y') {
                    if (c != 'c') {
                        if (c != 'e') {
                            if (c != 'w') {
                                return null;
                            }
                            return new k(l4cVar.k(), this.b, 2, ika.NOT_NEGATIVE);
                        }
                        return new k(l4cVar.b(), this.b, 2, ika.NOT_NEGATIVE);
                    }
                    return new k(l4cVar.b(), this.b, 2, ika.NOT_NEGATIVE);
                } else if (this.b == 2) {
                    return new n(l4cVar.i(), 2, 2, 0, n.i);
                } else {
                    u8b i = l4cVar.i();
                    int i2 = this.b;
                    if (i2 < 4) {
                        ikaVar = ika.NORMAL;
                    } else {
                        ikaVar = ika.EXCEEDS_PAD;
                    }
                    return new k(i, i2, 19, ikaVar, -1, null);
                }
            }
            return new k(l4cVar.j(), 1, 2, ika.NOT_NEGATIVE);
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            return b(l4c.f(cn2Var.i())).a(cn2Var, charSequence, i);
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            return b(l4c.f(dn2Var.c())).i(dn2Var, sb);
        }

        public String toString() {
            ika ikaVar;
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.a;
            if (c == 'Y') {
                int i = this.b;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.b);
                    sb.append(",");
                    sb.append(19);
                    sb.append(",");
                    if (this.b < 4) {
                        ikaVar = ika.NORMAL;
                    } else {
                        ikaVar = ika.EXCEEDS_PAD;
                    }
                    sb.append(ikaVar);
                }
            } else {
                if (c != 'c' && c != 'e') {
                    if (c == 'w') {
                        sb.append("WeekOfWeekBasedYear");
                    } else if (c == 'W') {
                        sb.append("WeekOfMonth");
                    }
                } else {
                    sb.append("DayOfWeek");
                }
                sb.append(",");
                sb.append(this.b);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$s */
    /* loaded from: classes3.dex */
    public static final class s implements g {
        private static volatile Map.Entry<Integer, a> c;
        private final w8b<vcc> a;
        private final String b;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DateTimeFormatterBuilder.java */
        /* renamed from: bn2$s$a */
        /* loaded from: classes3.dex */
        public static final class a {
            final int a;
            private final Map<CharSequence, a> b;
            private final Map<String, a> c;

            /* synthetic */ a(int i, a aVar) {
                this(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(String str) {
                int length = str.length();
                int i = this.a;
                if (length == i) {
                    this.b.put(str, null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i) {
                    String substring = str.substring(0, i);
                    a aVar = this.b.get(substring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.b.put(substring, aVar);
                        this.c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(CharSequence charSequence, boolean z) {
                if (z) {
                    return this.b.get(charSequence);
                }
                return this.c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            private a(int i) {
                this.b = new HashMap();
                this.c = new HashMap();
                this.a = i;
            }
        }

        s(w8b<vcc> w8bVar, String str) {
            this.a = w8bVar;
            this.b = str;
        }

        private vcc b(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (z) {
                if (!set.contains(str)) {
                    return null;
                }
                return vcc.E(str);
            }
            for (String str2 : set) {
                if (str2.equalsIgnoreCase(str)) {
                    return vcc.E(str2);
                }
            }
            return null;
        }

        private int c(cn2 cn2Var, CharSequence charSequence, int i, int i2) {
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            cn2 e = cn2Var.e();
            if (i2 < charSequence.length() && cn2Var.c(charSequence.charAt(i2), 'Z')) {
                cn2Var.o(vcc.N(upperCase, wcc.h));
                return i2;
            }
            int a2 = l.d.a(e, charSequence, i2);
            if (a2 < 0) {
                cn2Var.o(vcc.N(upperCase, wcc.h));
                return i2;
            }
            cn2Var.o(vcc.N(upperCase, wcc.h0((int) e.j(h71.T4).longValue())));
            return a2;
        }

        private static a d(Set<String> set) {
            ArrayList<String> arrayList = new ArrayList(set);
            Collections.sort(arrayList, bn2.j);
            a aVar = new a(((String) arrayList.get(0)).length(), null);
            for (String str : arrayList) {
                aVar.c(str);
            }
            return aVar;
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i <= length) {
                if (i == length) {
                    return ~i;
                }
                char charAt = charSequence.charAt(i);
                if (charAt != '+' && charAt != '-') {
                    int i3 = i + 2;
                    if (length >= i3) {
                        char charAt2 = charSequence.charAt(i + 1);
                        if (cn2Var.c(charAt, 'U') && cn2Var.c(charAt2, 'T')) {
                            int i4 = i + 3;
                            if (length >= i4 && cn2Var.c(charSequence.charAt(i3), 'C')) {
                                return c(cn2Var, charSequence, i, i4);
                            }
                            return c(cn2Var, charSequence, i, i3);
                        } else if (cn2Var.c(charAt, 'G') && length >= (i2 = i + 3) && cn2Var.c(charAt2, 'M') && cn2Var.c(charSequence.charAt(i3), 'T')) {
                            return c(cn2Var, charSequence, i, i2);
                        }
                    }
                    Set<String> a2 = cdc.a();
                    int size = a2.size();
                    Map.Entry<Integer, a> entry = c;
                    if (entry == null || entry.getKey().intValue() != size) {
                        synchronized (this) {
                            try {
                                entry = c;
                                if (entry != null) {
                                    if (entry.getKey().intValue() != size) {
                                    }
                                }
                                entry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), d(a2));
                                c = entry;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    a value = entry.getValue();
                    String str = null;
                    String str2 = null;
                    while (value != null) {
                        int i5 = value.a + i;
                        if (i5 > length) {
                            break;
                        }
                        String charSequence2 = charSequence.subSequence(i, i5).toString();
                        value = value.d(charSequence2, cn2Var.l());
                        str2 = str;
                        str = charSequence2;
                    }
                    vcc b = b(a2, str, cn2Var.l());
                    if (b == null) {
                        b = b(a2, str2, cn2Var.l());
                        if (b == null) {
                            if (cn2Var.c(charAt, 'Z')) {
                                cn2Var.o(wcc.h);
                                return i + 1;
                            }
                            return ~i;
                        }
                        str = str2;
                    }
                    cn2Var.o(b);
                    return i + str.length();
                }
                cn2 e = cn2Var.e();
                int a3 = l.d.a(e, charSequence, i);
                if (a3 < 0) {
                    return a3;
                }
                cn2Var.o(wcc.h0((int) e.j(h71.T4).longValue()));
                return a3;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            vcc vccVar = (vcc) dn2Var.g(this.a);
            if (vccVar == null) {
                return false;
            }
            sb.append(vccVar.getId());
            return true;
        }

        public String toString() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$t */
    /* loaded from: classes3.dex */
    public static final class t implements g {
        private static final Comparator<String> b = new a();
        private final scb a;

        /* compiled from: DateTimeFormatterBuilder.java */
        /* renamed from: bn2$t$a */
        /* loaded from: classes3.dex */
        class a implements Comparator<String> {
            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                if (length == 0) {
                    return str.compareTo(str2);
                }
                return length;
            }
        }

        t(scb scbVar) {
            this.a = (scb) g95.i(scbVar, "textStyle");
        }

        private int b(cn2 cn2Var, CharSequence charSequence, int i, String str) {
            int length = str.length();
            int i2 = i + length;
            if (i2 >= charSequence.length()) {
                cn2Var.o(vcc.E(str));
                return i2;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt != '+' && charAt != '-') {
                cn2Var.o(vcc.E(str));
                return i2;
            }
            cn2 e = cn2Var.e();
            try {
                int a2 = l.e.a(e, charSequence, i2);
                if (a2 < 0) {
                    cn2Var.o(vcc.E(str));
                    return i2;
                }
                wcc h0 = wcc.h0((int) e.j(h71.T4).longValue());
                cn2Var.o(length == 0 ? h0 : vcc.N(str, h0));
                return a2;
            } catch (DateTimeException unused) {
                return ~i;
            }
        }

        @Override // defpackage.bn2.g
        public int a(cn2 cn2Var, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i <= length) {
                if (i == length) {
                    return ~i;
                }
                char charAt = charSequence.charAt(i);
                if (charAt != '+' && charAt != '-') {
                    if (cn2Var.t(charSequence, i, "GMT", 0, 3)) {
                        return b(cn2Var, charSequence, i, "GMT");
                    }
                    if (cn2Var.t(charSequence, i, "UTC", 0, 3)) {
                        return b(cn2Var, charSequence, i, "UTC");
                    }
                    if (cn2Var.t(charSequence, i, "UT", 0, 2)) {
                        return b(cn2Var, charSequence, i, "UT");
                    }
                    TreeMap treeMap = new TreeMap(b);
                    for (String str : vcc.k()) {
                        treeMap.put(str, str);
                        TimeZone timeZone = TimeZone.getTimeZone(str);
                        if (this.a.a() == scb.FULL) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        String displayName = timeZone.getDisplayName(false, i2, cn2Var.i());
                        if (str.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                            treeMap.put(displayName, str);
                        }
                        String displayName2 = timeZone.getDisplayName(true, i2, cn2Var.i());
                        if (str.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                            treeMap.put(displayName2, str);
                        }
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        if (cn2Var.t(charSequence, i, str2, 0, str2.length())) {
                            cn2Var.o(vcc.E((String) entry.getValue()));
                            return i + str2.length();
                        }
                    }
                    if (charAt == 'Z') {
                        cn2Var.o(wcc.h);
                        return i + 1;
                    }
                    return ~i;
                } else if (i + 6 > length) {
                    return ~i;
                } else {
                    return b(cn2Var, charSequence, i, "");
                }
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.bn2.g
        public boolean i(dn2 dn2Var, StringBuilder sb) {
            boolean z;
            vcc vccVar = (vcc) dn2Var.g(v8b.g());
            int i = 0;
            if (vccVar == null) {
                return false;
            }
            if (vccVar.x() instanceof wcc) {
                sb.append(vccVar.getId());
                return true;
            }
            q8b e = dn2Var.e();
            h71 h71Var = h71.S4;
            if (e.G(h71Var)) {
                z = vccVar.u().d(b55.l0(e.q(h71Var)));
            } else {
                z = false;
            }
            TimeZone timeZone = TimeZone.getTimeZone(vccVar.getId());
            if (this.a.a() == scb.FULL) {
                i = 1;
            }
            sb.append(timeZone.getDisplayName(z, i, dn2Var.c()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.a + ")";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', h71.Z);
        hashMap.put('y', h71.X);
        hashMap.put('u', h71.Y);
        u8b u8bVar = v75.b;
        hashMap.put('Q', u8bVar);
        hashMap.put('q', u8bVar);
        h71 h71Var = h71.B;
        hashMap.put('M', h71Var);
        hashMap.put('L', h71Var);
        hashMap.put('D', h71.x);
        hashMap.put('d', h71.w);
        hashMap.put('F', h71.u);
        h71 h71Var2 = h71.t;
        hashMap.put('E', h71Var2);
        hashMap.put('c', h71Var2);
        hashMap.put('e', h71Var2);
        hashMap.put('a', h71.s);
        hashMap.put('H', h71.q);
        hashMap.put('k', h71.r);
        hashMap.put('K', h71.o);
        hashMap.put('h', h71.p);
        hashMap.put('m', h71.m);
        hashMap.put('s', h71.k);
        h71 h71Var3 = h71.e;
        hashMap.put('S', h71Var3);
        hashMap.put('A', h71.j);
        hashMap.put('n', h71Var3);
        hashMap.put('N', h71.f);
        j = new c();
    }

    public bn2() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void A(char c2, int i2, u8b u8bVar) {
        if (c2 != 'Q') {
            if (c2 != 'S') {
                if (c2 != 'a') {
                    if (c2 != 'h' && c2 != 'k' && c2 != 'm') {
                        if (c2 != 'q') {
                            if (c2 != 's') {
                                if (c2 != 'u' && c2 != 'y') {
                                    switch (c2) {
                                        case 'D':
                                            if (i2 == 1) {
                                                n(u8bVar);
                                                return;
                                            } else if (i2 <= 3) {
                                                o(u8bVar, i2);
                                                return;
                                            } else {
                                                throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                            }
                                        case 'E':
                                        case 'G':
                                            if (i2 != 1 && i2 != 2 && i2 != 3) {
                                                if (i2 != 4) {
                                                    if (i2 == 5) {
                                                        k(u8bVar, scb.NARROW);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                }
                                                k(u8bVar, scb.FULL);
                                                return;
                                            }
                                            k(u8bVar, scb.SHORT);
                                            return;
                                        case 'F':
                                            if (i2 == 1) {
                                                n(u8bVar);
                                                return;
                                            }
                                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                        case 'H':
                                            break;
                                        default:
                                            switch (c2) {
                                                case 'K':
                                                    break;
                                                case 'L':
                                                    break;
                                                case 'M':
                                                    break;
                                                default:
                                                    switch (c2) {
                                                        case 'c':
                                                            if (i2 != 1) {
                                                                if (i2 != 2) {
                                                                    if (i2 != 3) {
                                                                        if (i2 != 4) {
                                                                            if (i2 == 5) {
                                                                                k(u8bVar, scb.NARROW_STANDALONE);
                                                                                return;
                                                                            }
                                                                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                                        }
                                                                        k(u8bVar, scb.FULL_STANDALONE);
                                                                        return;
                                                                    }
                                                                    k(u8bVar, scb.SHORT_STANDALONE);
                                                                    return;
                                                                }
                                                                throw new IllegalArgumentException("Invalid number of pattern letters: " + c2);
                                                            }
                                                            d(new r('c', i2));
                                                            return;
                                                        case 'd':
                                                            break;
                                                        case 'e':
                                                            if (i2 != 1 && i2 != 2) {
                                                                if (i2 != 3) {
                                                                    if (i2 != 4) {
                                                                        if (i2 == 5) {
                                                                            k(u8bVar, scb.NARROW);
                                                                            return;
                                                                        }
                                                                        throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                                    }
                                                                    k(u8bVar, scb.FULL);
                                                                    return;
                                                                }
                                                                k(u8bVar, scb.SHORT);
                                                                return;
                                                            }
                                                            d(new r('e', i2));
                                                            return;
                                                        default:
                                                            if (i2 == 1) {
                                                                n(u8bVar);
                                                                return;
                                                            } else {
                                                                o(u8bVar, i2);
                                                                return;
                                                            }
                                                    }
                                            }
                                    }
                                } else if (i2 == 2) {
                                    q(u8bVar, 2, 2, n.i);
                                    return;
                                } else if (i2 < 4) {
                                    p(u8bVar, i2, 19, ika.NORMAL);
                                    return;
                                } else {
                                    p(u8bVar, i2, 19, ika.EXCEEDS_PAD);
                                    return;
                                }
                            }
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            k(u8bVar, scb.NARROW_STANDALONE);
                                            return;
                                        }
                                        throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                    }
                                    k(u8bVar, scb.FULL_STANDALONE);
                                    return;
                                }
                                k(u8bVar, scb.SHORT_STANDALONE);
                                return;
                            }
                            o(u8bVar, 2);
                            return;
                        }
                        n(u8bVar);
                        return;
                    }
                    if (i2 == 1) {
                        n(u8bVar);
                        return;
                    } else if (i2 == 2) {
                        o(u8bVar, i2);
                        return;
                    } else {
                        throw new IllegalArgumentException("Too many pattern letters: " + c2);
                    }
                } else if (i2 == 1) {
                    k(u8bVar, scb.SHORT);
                    return;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                }
            }
            b(h71.e, i2, i2, false);
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            k(u8bVar, scb.NARROW);
                            return;
                        }
                        throw new IllegalArgumentException("Too many pattern letters: " + c2);
                    }
                    k(u8bVar, scb.FULL);
                    return;
                }
                k(u8bVar, scb.SHORT);
                return;
            }
            o(u8bVar, 2);
            return;
        }
        n(u8bVar);
    }

    private void C(String str) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i6 = i5 + 1;
                while (i6 < str.length() && str.charAt(i6) == charAt) {
                    i6++;
                }
                int i7 = i6 - i5;
                if (charAt == 'p') {
                    if (i6 < str.length() && (((charAt = str.charAt(i6)) >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                        int i8 = i6 + 1;
                        while (i8 < str.length() && str.charAt(i8) == charAt) {
                            i8++;
                        }
                        i4 = i8 - i6;
                        i6 = i8;
                    } else {
                        i4 = i7;
                        i7 = 0;
                    }
                    if (i7 != 0) {
                        w(i7);
                        i7 = i4;
                    } else {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                }
                u8b u8bVar = i.get(Character.valueOf(charAt));
                if (u8bVar != null) {
                    A(charAt, i7, u8bVar);
                } else if (charAt == 'z') {
                    if (i7 <= 4) {
                        if (i7 == 4) {
                            t(scb.FULL);
                        } else {
                            t(scb.SHORT);
                        }
                    } else {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                } else if (charAt == 'V') {
                    if (i7 == 2) {
                        r();
                    } else {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                    }
                } else {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i7 < 4) {
                            h("+HHMM", "+0000");
                        } else if (i7 == 4) {
                            g(scb.FULL);
                        } else if (i7 == 5) {
                            h("+HH:MM:ss", "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'O') {
                        if (i7 == 1) {
                            g(scb.SHORT);
                        } else if (i7 == 4) {
                            g(scb.FULL);
                        } else {
                            throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                        }
                    } else if (charAt == 'X') {
                        if (i7 <= 5) {
                            String[] strArr = l.c;
                            if (i7 == 1) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            h(strArr[i7 + i3], "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'x') {
                        if (i7 <= 5) {
                            if (i7 == 1) {
                                str2 = "+00";
                            } else if (i7 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            String[] strArr2 = l.c;
                            if (i7 == 1) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            h(strArr2[i7 + i2], str2);
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'W') {
                        if (i7 <= 1) {
                            d(new r('W', i7));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'w') {
                        if (i7 <= 2) {
                            d(new r('w', i7));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'Y') {
                        d(new r('Y', i7));
                    } else {
                        throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                    }
                }
                i5 = i6 - 1;
            } else if (charAt == '\'') {
                int i9 = i5 + 1;
                int i10 = i9;
                while (i10 < str.length()) {
                    if (str.charAt(i10) == '\'') {
                        int i11 = i10 + 1;
                        if (i11 >= str.length() || str.charAt(i11) != '\'') {
                            break;
                        }
                        i10 = i11;
                    }
                    i10++;
                }
                if (i10 < str.length()) {
                    String substring = str.substring(i9, i10);
                    if (substring.length() == 0) {
                        e(CoreConstants.SINGLE_QUOTE_CHAR);
                    } else {
                        f(substring.replace("''", "'"));
                    }
                    i5 = i10;
                } else {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
            } else if (charAt == '[') {
                v();
            } else if (charAt == ']') {
                if (this.a.b != null) {
                    u();
                } else {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
            } else if (charAt != '{' && charAt != '}' && charAt != '#') {
                e(charAt);
            } else {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            }
            i5++;
        }
    }

    private int d(g gVar) {
        g95.i(gVar, "pp");
        bn2 bn2Var = this.a;
        int i2 = bn2Var.e;
        if (i2 > 0) {
            if (gVar != null) {
                gVar = new m(gVar, i2, bn2Var.f);
            }
            bn2 bn2Var2 = this.a;
            bn2Var2.e = 0;
            bn2Var2.f = (char) 0;
        }
        this.a.c.add(gVar);
        bn2 bn2Var3 = this.a;
        bn2Var3.g = -1;
        return bn2Var3.c.size() - 1;
    }

    private bn2 m(k kVar) {
        k e2;
        bn2 bn2Var = this.a;
        int i2 = bn2Var.g;
        if (i2 >= 0 && (bn2Var.c.get(i2) instanceof k)) {
            bn2 bn2Var2 = this.a;
            int i3 = bn2Var2.g;
            k kVar2 = (k) bn2Var2.c.get(i3);
            int i4 = kVar.b;
            int i5 = kVar.c;
            if (i4 == i5 && kVar.d == ika.NOT_NEGATIVE) {
                e2 = kVar2.f(i5);
                d(kVar.e());
                this.a.g = i3;
            } else {
                e2 = kVar2.e();
                this.a.g = d(kVar);
            }
            this.a.c.set(i3, e2);
        } else {
            this.a.g = d(kVar);
        }
        return this;
    }

    public bn2 B() {
        d(o.LENIENT);
        return this;
    }

    public an2 D() {
        return F(Locale.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public an2 E(mj9 mj9Var) {
        return D().n(mj9Var);
    }

    public an2 F(Locale locale) {
        g95.i(locale, "locale");
        while (this.a.b != null) {
            u();
        }
        return new an2(new f(this.c, false), locale, oo2.e, mj9.SMART, null, null, null);
    }

    public bn2 a(an2 an2Var) {
        g95.i(an2Var, "formatter");
        d(an2Var.l(false));
        return this;
    }

    public bn2 b(u8b u8bVar, int i2, int i3, boolean z) {
        d(new h(u8bVar, i2, i3, z));
        return this;
    }

    public bn2 c() {
        d(new i(-2));
        return this;
    }

    public bn2 e(char c2) {
        d(new e(c2));
        return this;
    }

    public bn2 f(String str) {
        g95.i(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                d(new e(str.charAt(0)));
            } else {
                d(new p(str));
            }
        }
        return this;
    }

    public bn2 g(scb scbVar) {
        g95.i(scbVar, "style");
        if (scbVar != scb.FULL && scbVar != scb.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new j(scbVar));
        return this;
    }

    public bn2 h(String str, String str2) {
        d(new l(str2, str));
        return this;
    }

    public bn2 i() {
        d(l.d);
        return this;
    }

    public bn2 j(String str) {
        g95.i(str, "pattern");
        C(str);
        return this;
    }

    public bn2 k(u8b u8bVar, scb scbVar) {
        g95.i(u8bVar, "field");
        g95.i(scbVar, "textStyle");
        d(new q(u8bVar, scbVar, fn2.b()));
        return this;
    }

    public bn2 l(u8b u8bVar, Map<Long, String> map) {
        g95.i(u8bVar, "field");
        g95.i(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        scb scbVar = scb.FULL;
        d(new q(u8bVar, scbVar, new b(new bla.b(Collections.singletonMap(scbVar, linkedHashMap)))));
        return this;
    }

    public bn2 n(u8b u8bVar) {
        g95.i(u8bVar, "field");
        m(new k(u8bVar, 1, 19, ika.NORMAL));
        return this;
    }

    public bn2 o(u8b u8bVar, int i2) {
        g95.i(u8bVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            m(new k(u8bVar, i2, i2, ika.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
    }

    public bn2 p(u8b u8bVar, int i2, int i3, ika ikaVar) {
        if (i2 == i3 && ikaVar == ika.NOT_NEGATIVE) {
            return o(u8bVar, i3);
        }
        g95.i(u8bVar, "field");
        g95.i(ikaVar, "signStyle");
        if (i2 >= 1 && i2 <= 19) {
            if (i3 >= 1 && i3 <= 19) {
                if (i3 >= i2) {
                    m(new k(u8bVar, i2, i3, ikaVar));
                    return this;
                }
                throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
            }
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
    }

    public bn2 q(u8b u8bVar, int i2, int i3, i71 i71Var) {
        g95.i(u8bVar, "field");
        g95.i(i71Var, "baseDate");
        m(new n(u8bVar, i2, i3, 0, i71Var));
        return this;
    }

    public bn2 r() {
        d(new s(v8b.g(), "ZoneId()"));
        return this;
    }

    public bn2 s() {
        d(new s(h, "ZoneRegionId()"));
        return this;
    }

    public bn2 t(scb scbVar) {
        d(new t(scbVar));
        return this;
    }

    public bn2 u() {
        bn2 bn2Var = this.a;
        if (bn2Var.b != null) {
            if (bn2Var.c.size() > 0) {
                bn2 bn2Var2 = this.a;
                f fVar = new f(bn2Var2.c, bn2Var2.d);
                this.a = this.a.b;
                d(fVar);
            } else {
                this.a = this.a.b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public bn2 v() {
        bn2 bn2Var = this.a;
        bn2Var.g = -1;
        this.a = new bn2(bn2Var, true);
        return this;
    }

    public bn2 w(int i2) {
        return x(i2, ' ');
    }

    public bn2 x(int i2, char c2) {
        if (i2 >= 1) {
            bn2 bn2Var = this.a;
            bn2Var.e = i2;
            bn2Var.f = c2;
            bn2Var.g = -1;
            return this;
        }
        throw new IllegalArgumentException("The pad width must be at least one but was " + i2);
    }

    public bn2 y() {
        d(o.INSENSITIVE);
        return this;
    }

    public bn2 z() {
        d(o.SENSITIVE);
        return this;
    }

    private bn2(bn2 bn2Var, boolean z) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = bn2Var;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: bn2$n */
    /* loaded from: classes3.dex */
    public static final class n extends k {
        static final ds5 i = ds5.X0(2000, 1, 1);
        private final int g;
        private final i71 h;

        n(u8b u8bVar, int i2, int i3, int i4, i71 i71Var) {
            super(u8bVar, i2, i3, ika.NOT_NEGATIVE);
            if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The width must be from 1 to 10 inclusive but was " + i2);
            } else if (i3 < 1 || i3 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i3);
            } else if (i3 < i2) {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            } else {
                if (i71Var == null) {
                    long j = i4;
                    if (u8bVar.s().j(j)) {
                        if (j + k.f[i2] > 2147483647L) {
                            throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                        }
                    } else {
                        throw new IllegalArgumentException("The base value must be within the range of the field");
                    }
                }
                this.g = i4;
                this.h = i71Var;
            }
        }

        @Override // defpackage.bn2.k
        long b(dn2 dn2Var, long j) {
            long abs = Math.abs(j);
            int i2 = this.g;
            if (this.h != null) {
                i2 = p71.w(dn2Var.e()).k(this.h).w(this.a);
            }
            if (j >= i2) {
                int i3 = k.f[this.b];
                if (j < i2 + i3) {
                    return abs % i3;
                }
            }
            return abs % k.f[this.c];
        }

        @Override // defpackage.bn2.k
        boolean c(cn2 cn2Var) {
            if (!cn2Var.m()) {
                return false;
            }
            return super.c(cn2Var);
        }

        @Override // defpackage.bn2.k
        int d(cn2 cn2Var, long j, int i2, int i3) {
            long j2;
            int i4 = this.g;
            if (this.h != null) {
                i4 = cn2Var.h().k(this.h).w(this.a);
                cn2Var.b(this, j, i2, i3);
            }
            int i5 = i3 - i2;
            int i6 = this.b;
            if (i5 == i6 && j >= 0) {
                long j3 = k.f[i6];
                long j4 = i4;
                long j5 = j4 - (j4 % j3);
                if (i4 > 0) {
                    j2 = j5 + j;
                } else {
                    j2 = j5 - j;
                }
                j = j2;
                if (j < j4) {
                    j += j3;
                }
            }
            return cn2Var.p(this.a, j, i2, i3);
        }

        @Override // defpackage.bn2.k
        k e() {
            if (this.e == -1) {
                return this;
            }
            return new n(this.a, this.b, this.c, this.g, this.h, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bn2.k
        /* renamed from: g */
        public n f(int i2) {
            return new n(this.a, this.b, this.c, this.g, this.h, this.e + i2);
        }

        @Override // defpackage.bn2.k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReducedValue(");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b);
            sb.append(",");
            sb.append(this.c);
            sb.append(",");
            Object obj = this.h;
            if (obj == null) {
                obj = Integer.valueOf(this.g);
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        private n(u8b u8bVar, int i2, int i3, int i4, i71 i71Var, int i5) {
            super(u8bVar, i2, i3, ika.NOT_NEGATIVE, i5, null);
            this.g = i4;
            this.h = i71Var;
        }
    }
}
