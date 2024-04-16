package com.google.i18n.phonenumbers;

import ch.qos.logback.core.CoreConstants;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PhoneNumberUtil.java */
/* loaded from: classes.dex */
public class b {
    static final String A;
    static final Pattern B;
    private static final String C;
    private static final String D;
    private static final String E;
    private static final String F;
    static final Pattern G;
    private static final Pattern H;
    private static final Pattern I;
    static final Pattern J;
    private static final Pattern K;
    private static final Pattern L;
    private static b M;
    private static final Logger h = Logger.getLogger(b.class.getName());
    private static final Map<Integer, String> i;
    private static final Set<Integer> j;
    private static final Set<Integer> k;
    private static final Map<Character, Character> l;
    private static final Map<Character, Character> m;
    private static final Map<Character, Character> n;
    private static final Map<Character, Character> o;
    private static final Pattern p;
    private static final String q;
    static final Pattern r;
    private static final Pattern s;
    private static final Pattern t;
    private static final Pattern u;
    static final Pattern v;
    static final Pattern w;
    private static final Pattern x;
    private static final String y;
    private static final String z;
    private final ui6 a;
    private final Map<Integer, List<String>> b;
    private final v96 c = fc9.b();
    private final Set<String> d = new HashSet(35);
    private final gc9 e = new gc9(100);
    private final Set<String> f = new HashSet(320);
    private final Set<Integer> g = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberUtil.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[c.values().length];
            c = iArr;
            try {
                iArr[c.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[c.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[c.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[c.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[c.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[c.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[c.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[c.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[c.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[c.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[EnumC0248b.values().length];
            b = iArr2;
            try {
                iArr2[EnumC0248b.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[EnumC0248b.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[EnumC0248b.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[EnumC0248b.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[d.a.values().length];
            a = iArr3;
            try {
                iArr3[d.a.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[d.a.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[d.a.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[d.a.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* compiled from: PhoneNumberUtil.java */
    /* renamed from: com.google.i18n.phonenumbers.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0248b {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    /* compiled from: PhoneNumberUtil.java */
    /* loaded from: classes.dex */
    public enum c {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* compiled from: PhoneNumberUtil.java */
    /* loaded from: classes.dex */
    public enum d {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        k = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        m = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        n = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        l = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch2 : unmodifiableMap.keySet()) {
            char charValue = ch2.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap6.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put(Character.valueOf(CoreConstants.DASH_CHAR), Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 65293, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 8208, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 8209, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 8210, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 8211, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 8212, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 8213, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put((char) 8722, Character.valueOf(CoreConstants.DASH_CHAR));
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put(Character.valueOf(CoreConstants.DOT), Character.valueOf(CoreConstants.DOT));
        hashMap6.put((char) 65294, Character.valueOf(CoreConstants.DOT));
        o = Collections.unmodifiableMap(hashMap6);
        p = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = m;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        q = sb2;
        r = Pattern.compile("[+＋]+");
        s = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        t = Pattern.compile("(\\p{Nd})");
        u = Pattern.compile("[+＋\\p{Nd}]");
        v = Pattern.compile("[\\\\/] *x");
        w = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        x = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + sb2 + "\\p{Nd}]*";
        y = str;
        String d2 = d(true);
        z = d2;
        A = d(false);
        B = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String str2 = sb2 + "\\p{Nd}";
        C = str2;
        String str3 = "[" + str2 + "]+((\\-)*[" + str2 + "])*";
        D = str3;
        String str4 = "[" + sb2 + "]+((\\-)*[" + str2 + "])*";
        E = str4;
        String str5 = "^(" + str3 + "\\.)*" + str4 + "\\.?$";
        F = str5;
        G = Pattern.compile(str5);
        H = Pattern.compile("(?:" + d2 + ")$", 66);
        I = Pattern.compile(str + "(?:" + d2 + ")?", 66);
        J = Pattern.compile("(\\D+)");
        K = Pattern.compile("(\\$\\d)");
        L = Pattern.compile("\\(?\\$1\\)?");
        M = null;
    }

    b(ui6 ui6Var, Map<Integer, List<String>> map) {
        this.a = ui6Var;
        this.b = map;
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (value.size() == 1 && "001".equals(value.get(0))) {
                this.g.add(entry.getKey());
            } else {
                this.f.addAll(value);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll(map.get(1));
    }

    private c C(String str, com.google.i18n.phonenumbers.c cVar) {
        if (!I(str, cVar.c())) {
            return c.UNKNOWN;
        }
        if (I(str, cVar.s())) {
            return c.PREMIUM_RATE;
        }
        if (I(str, cVar.x())) {
            return c.TOLL_FREE;
        }
        if (I(str, cVar.w())) {
            return c.SHARED_COST;
        }
        if (I(str, cVar.G())) {
            return c.VOIP;
        }
        if (I(str, cVar.q())) {
            return c.PERSONAL_NUMBER;
        }
        if (I(str, cVar.o())) {
            return c.PAGER;
        }
        if (I(str, cVar.y())) {
            return c.UAN;
        }
        if (I(str, cVar.E())) {
            return c.VOICEMAIL;
        }
        if (I(str, cVar.b())) {
            if (cVar.u()) {
                return c.FIXED_LINE_OR_MOBILE;
            }
            if (I(str, cVar.j())) {
                return c.FIXED_LINE_OR_MOBILE;
            }
            return c.FIXED_LINE;
        } else if (!cVar.u() && I(str, cVar.j())) {
            return c.MOBILE;
        } else {
            return c.UNKNOWN;
        }
    }

    private String F(com.google.i18n.phonenumbers.d dVar, List<String> list) {
        String z2 = z(dVar);
        for (String str : list) {
            com.google.i18n.phonenumbers.c x2 = x(str);
            if (x2.H()) {
                if (this.e.a(x2.i()).matcher(z2).lookingAt()) {
                    return str;
                }
            } else if (C(z2, x2) != c.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    private boolean H(int i2) {
        return this.b.containsKey(Integer.valueOf(i2));
    }

    private boolean J(String str) {
        if (str == null) {
            return true;
        }
        if (str.length() == 0) {
            return false;
        }
        if (B.matcher(str).matches() || G.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    private boolean M(String str) {
        if (str != null && this.f.contains(str)) {
            return true;
        }
        return false;
    }

    static boolean N(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return I.matcher(charSequence).matches();
    }

    private void O(com.google.i18n.phonenumbers.d dVar, com.google.i18n.phonenumbers.c cVar, EnumC0248b enumC0248b, StringBuilder sb) {
        if (dVar.n() && dVar.e().length() > 0) {
            if (enumC0248b == EnumC0248b.RFC3966) {
                sb.append(";ext=");
                sb.append(dVar.e());
            } else if (cVar.L()) {
                sb.append(cVar.r());
                sb.append(dVar.e());
            } else {
                sb.append(" ext. ");
                sb.append(dVar.e());
            }
        }
    }

    static StringBuilder T(StringBuilder sb) {
        if (x.matcher(sb).matches()) {
            sb.replace(0, sb.length(), X(sb, n, true));
        } else {
            sb.replace(0, sb.length(), W(sb));
        }
        return sb;
    }

    public static String U(CharSequence charSequence) {
        return X(charSequence, l, true);
    }

    static StringBuilder V(CharSequence charSequence, boolean z2) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z2) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static String W(CharSequence charSequence) {
        return V(charSequence, false).toString();
    }

    private static String X(CharSequence charSequence, Map<Character, Character> map, boolean z2) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Character ch2 = map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch2 != null) {
                sb.append(ch2);
            } else if (!z2) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private void a(String str, StringBuilder sb) throws NumberParseException {
        int indexOf = str.indexOf(";phone-context=");
        String k2 = k(str, indexOf);
        if (J(k2)) {
            if (k2 != null) {
                int i2 = 0;
                if (k2.charAt(0) == '+') {
                    sb.append(k2);
                }
                int indexOf2 = str.indexOf("tel:");
                if (indexOf2 >= 0) {
                    i2 = indexOf2 + 4;
                }
                sb.append(str.substring(i2, indexOf));
            } else {
                sb.append(l(str));
            }
            int indexOf3 = sb.indexOf(";isub=");
            if (indexOf3 > 0) {
                sb.delete(indexOf3, sb.length());
                return;
            }
            return;
        }
        throw new NumberParseException(NumberParseException.a.NOT_A_NUMBER, "The phone-context value is invalid.");
    }

    private void a0(CharSequence charSequence, String str, boolean z2, boolean z3, com.google.i18n.phonenumbers.d dVar) throws NumberParseException {
        int P;
        if (charSequence != null) {
            if (charSequence.length() <= 250) {
                StringBuilder sb = new StringBuilder();
                String charSequence2 = charSequence.toString();
                a(charSequence2, sb);
                if (N(sb)) {
                    if (z3 && !b(sb, str)) {
                        throw new NumberParseException(NumberParseException.a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                    }
                    if (z2) {
                        dVar.K(charSequence2);
                    }
                    String Q = Q(sb);
                    if (Q.length() > 0) {
                        dVar.x(Q);
                    }
                    com.google.i18n.phonenumbers.c x2 = x(str);
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        P = P(sb, x2, sb2, z2, dVar);
                    } catch (NumberParseException e) {
                        Matcher matcher = r.matcher(sb);
                        if (e.a() == NumberParseException.a.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                            P = P(sb.substring(matcher.end()), x2, sb2, z2, dVar);
                            if (P == 0) {
                                throw new NumberParseException(NumberParseException.a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                            }
                        } else {
                            throw new NumberParseException(e.a(), e.getMessage());
                        }
                    }
                    if (P != 0) {
                        String D2 = D(P);
                        if (!D2.equals(str)) {
                            x2 = y(P, D2);
                        }
                    } else {
                        sb2.append(T(sb));
                        if (str != null) {
                            dVar.u(x2.a());
                        } else if (z2) {
                            dVar.a();
                        }
                    }
                    if (sb2.length() >= 2) {
                        if (x2 != null) {
                            StringBuilder sb3 = new StringBuilder();
                            StringBuilder sb4 = new StringBuilder(sb2);
                            S(sb4, x2, sb3);
                            d f0 = f0(sb4, x2);
                            if (f0 != d.TOO_SHORT && f0 != d.IS_POSSIBLE_LOCAL_ONLY && f0 != d.INVALID_LENGTH) {
                                if (z2 && sb3.length() > 0) {
                                    dVar.H(sb3.toString());
                                }
                                sb2 = sb4;
                            }
                        }
                        int length = sb2.length();
                        if (length >= 2) {
                            if (length <= 17) {
                                e0(sb2, dVar);
                                dVar.E(Long.parseLong(sb2.toString()));
                                return;
                            }
                            throw new NumberParseException(NumberParseException.a.TOO_LONG, "The string supplied is too long to be a phone number.");
                        }
                        throw new NumberParseException(NumberParseException.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    }
                    throw new NumberParseException(NumberParseException.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
                throw new NumberParseException(NumberParseException.a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            }
            throw new NumberParseException(NumberParseException.a.TOO_LONG, "The string supplied was too long to parse.");
        }
        throw new NumberParseException(NumberParseException.a.NOT_A_NUMBER, "The phone number supplied was null.");
    }

    private boolean b(CharSequence charSequence, String str) {
        if (!M(str)) {
            if (charSequence == null || charSequence.length() == 0 || !r.matcher(charSequence).lookingAt()) {
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean b0(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = t.matcher(sb.substring(end));
        if (matcher2.find() && W(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, end);
        return true;
    }

    private void c0(int i2, EnumC0248b enumC0248b, StringBuilder sb) {
        int i3 = a.b[enumC0248b.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
                return;
            }
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
            return;
        }
        sb.insert(0, i2).insert(0, '+');
    }

    private static String d(boolean z2) {
        String str = (";ext=" + i(20)) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + i(20) + "#?") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + i(9) + "#?") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[- ]+" + i(6) + "#");
        if (z2) {
            return str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + i(15) + "#?") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + i(9) + "#?");
        }
        return str;
    }

    static synchronized void d0(b bVar) {
        synchronized (b.class) {
            M = bVar;
        }
    }

    public static b e(si6 si6Var) {
        if (si6Var != null) {
            return f(new vi6(uq2.a().d(), si6Var, uq2.a().c()));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    static void e0(CharSequence charSequence, com.google.i18n.phonenumbers.d dVar) {
        if (charSequence.length() > 1 && charSequence.charAt(0) == '0') {
            dVar.y(true);
            int i2 = 1;
            while (i2 < charSequence.length() - 1 && charSequence.charAt(i2) == '0') {
                i2++;
            }
            if (i2 != 1) {
                dVar.G(i2);
            }
        }
    }

    private static b f(ui6 ui6Var) {
        if (ui6Var != null) {
            return new b(ui6Var, fy1.a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    private d f0(CharSequence charSequence, com.google.i18n.phonenumbers.c cVar) {
        return g0(charSequence, cVar, c.UNKNOWN);
    }

    private static boolean g(f58 f58Var) {
        if (f58Var.c() != 1 || f58Var.b(0) != -1) {
            return true;
        }
        return false;
    }

    private d g0(CharSequence charSequence, com.google.i18n.phonenumbers.c cVar, c cVar2) {
        ArrayList d2;
        List<Integer> d3;
        f58 A2 = A(cVar, cVar2);
        if (A2.d().isEmpty()) {
            d2 = cVar.c().d();
        } else {
            d2 = A2.d();
        }
        List<Integer> f = A2.f();
        if (cVar2 == c.FIXED_LINE_OR_MOBILE) {
            if (!g(A(cVar, c.FIXED_LINE))) {
                return g0(charSequence, cVar, c.MOBILE);
            }
            f58 A3 = A(cVar, c.MOBILE);
            if (g(A3)) {
                ArrayList arrayList = new ArrayList(d2);
                if (A3.c() == 0) {
                    d3 = cVar.c().d();
                } else {
                    d3 = A3.d();
                }
                arrayList.addAll(d3);
                Collections.sort(arrayList);
                if (f.isEmpty()) {
                    f = A3.f();
                } else {
                    ArrayList arrayList2 = new ArrayList(f);
                    arrayList2.addAll(A3.f());
                    Collections.sort(arrayList2);
                    f = arrayList2;
                }
                d2 = arrayList;
            }
        }
        if (d2.get(0).intValue() == -1) {
            return d.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (f.contains(Integer.valueOf(length))) {
            return d.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = d2.get(0).intValue();
        if (intValue == length) {
            return d.IS_POSSIBLE;
        }
        if (intValue > length) {
            return d.TOO_SHORT;
        }
        if (d2.get(d2.size() - 1).intValue() < length) {
            return d.TOO_LONG;
        }
        if (d2.subList(1, d2.size()).contains(Integer.valueOf(length))) {
            return d.IS_POSSIBLE;
        }
        return d.INVALID_LENGTH;
    }

    private static void h(com.google.i18n.phonenumbers.c cVar, String str) {
        if (cVar != null) {
            return;
        }
        throw new MissingMetadataException(str);
    }

    private static String i(int i2) {
        return "(\\p{Nd}{1," + i2 + "})";
    }

    private String k(String str, int i2) {
        if (i2 == -1) {
            return null;
        }
        int i3 = i2 + 15;
        if (i3 >= str.length()) {
            return "";
        }
        int indexOf = str.indexOf(59, i3);
        if (indexOf != -1) {
            return str.substring(i3, indexOf);
        }
        return str.substring(i3);
    }

    static CharSequence l(CharSequence charSequence) {
        Matcher matcher = u.matcher(charSequence);
        if (matcher.find()) {
            CharSequence subSequence = charSequence.subSequence(matcher.start(), charSequence.length());
            Matcher matcher2 = w.matcher(subSequence);
            if (matcher2.find()) {
                subSequence = subSequence.subSequence(0, matcher2.start());
            }
            Matcher matcher3 = v.matcher(subSequence);
            if (matcher3.find()) {
                return subSequence.subSequence(0, matcher3.start());
            }
            return subSequence;
        }
        return "";
    }

    private String o(String str, com.google.i18n.phonenumbers.c cVar, EnumC0248b enumC0248b) {
        return p(str, cVar, enumC0248b, null);
    }

    private String p(String str, com.google.i18n.phonenumbers.c cVar, EnumC0248b enumC0248b, CharSequence charSequence) {
        List<d58> n2;
        if (cVar.f().size() != 0 && enumC0248b != EnumC0248b.NATIONAL) {
            n2 = cVar.f();
        } else {
            n2 = cVar.n();
        }
        d58 c2 = c(n2, str);
        if (c2 != null) {
            return q(str, c2, enumC0248b, charSequence);
        }
        return str;
    }

    private String q(String str, d58 d58Var, EnumC0248b enumC0248b, CharSequence charSequence) {
        String replaceAll;
        String format = d58Var.getFormat();
        Matcher matcher = this.e.a(d58Var.f()).matcher(str);
        EnumC0248b enumC0248b2 = EnumC0248b.NATIONAL;
        if (enumC0248b == enumC0248b2 && charSequence != null && charSequence.length() > 0 && d58Var.a().length() > 0) {
            replaceAll = matcher.replaceAll(K.matcher(format).replaceFirst(d58Var.a().replace("$CC", charSequence)));
        } else {
            String d2 = d58Var.d();
            if (enumC0248b == enumC0248b2 && d2 != null && d2.length() > 0) {
                replaceAll = matcher.replaceAll(K.matcher(format).replaceFirst(d2));
            } else {
                replaceAll = matcher.replaceAll(format);
            }
        }
        if (enumC0248b == EnumC0248b.RFC3966) {
            Matcher matcher2 = s.matcher(replaceAll);
            if (matcher2.lookingAt()) {
                replaceAll = matcher2.replaceFirst("");
            }
            return matcher2.reset(replaceAll).replaceAll("-");
        }
        return replaceAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(String str) {
        if (str.length() != 0 && !L.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    private int u(String str) {
        com.google.i18n.phonenumbers.c x2 = x(str);
        if (x2 != null) {
            return x2.a();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    public static synchronized b v() {
        b bVar;
        synchronized (b.class) {
            try {
                if (M == null) {
                    d0(e(uq2.a().b()));
                }
                bVar = M;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private com.google.i18n.phonenumbers.c y(int i2, String str) {
        if ("001".equals(str)) {
            return w(i2);
        }
        return x(str);
    }

    f58 A(com.google.i18n.phonenumbers.c cVar, c cVar2) {
        switch (a.c[cVar2.ordinal()]) {
            case 1:
                return cVar.s();
            case 2:
                return cVar.x();
            case 3:
                return cVar.j();
            case 4:
            case 5:
                return cVar.b();
            case 6:
                return cVar.w();
            case 7:
                return cVar.G();
            case 8:
                return cVar.q();
            case 9:
                return cVar.o();
            case 10:
                return cVar.y();
            case 11:
                return cVar.E();
            default:
                return cVar.c();
        }
    }

    public c B(com.google.i18n.phonenumbers.d dVar) {
        com.google.i18n.phonenumbers.c y2 = y(dVar.c(), E(dVar));
        if (y2 == null) {
            return c.UNKNOWN;
        }
        return C(z(dVar), y2);
    }

    public String D(int i2) {
        List<String> list = this.b.get(Integer.valueOf(i2));
        if (list == null) {
            return "ZZ";
        }
        return list.get(0);
    }

    public String E(com.google.i18n.phonenumbers.d dVar) {
        int c2 = dVar.c();
        List<String> list = this.b.get(Integer.valueOf(c2));
        if (list == null) {
            Logger logger = h;
            Level level = Level.INFO;
            logger.log(level, "Missing/invalid country_code (" + c2 + ")");
            return null;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return F(dVar, list);
        }
    }

    public List<String> G(int i2) {
        List<String> list = this.b.get(Integer.valueOf(i2));
        if (list == null) {
            list = new ArrayList<>(0);
        }
        return Collections.unmodifiableList(list);
    }

    boolean I(String str, f58 f58Var) {
        int length = str.length();
        List<Integer> d2 = f58Var.d();
        if (d2.size() > 0 && !d2.contains(Integer.valueOf(length))) {
            return false;
        }
        return this.c.a(str, f58Var, false);
    }

    public boolean K(com.google.i18n.phonenumbers.d dVar) {
        return L(dVar, E(dVar));
    }

    public boolean L(com.google.i18n.phonenumbers.d dVar, String str) {
        int c2 = dVar.c();
        com.google.i18n.phonenumbers.c y2 = y(c2, str);
        if (y2 == null) {
            return false;
        }
        if ((!"001".equals(str) && c2 != u(str)) || C(z(dVar), y2) == c.UNKNOWN) {
            return false;
        }
        return true;
    }

    int P(CharSequence charSequence, com.google.i18n.phonenumbers.c cVar, StringBuilder sb, boolean z2, com.google.i18n.phonenumbers.d dVar) throws NumberParseException {
        String str;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        if (cVar != null) {
            str = cVar.d();
        } else {
            str = "NonMatch";
        }
        d.a R = R(sb2, str);
        if (z2) {
            dVar.w(R);
        }
        if (R != d.a.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() > 2) {
                int j2 = j(sb2, sb);
                if (j2 != 0) {
                    dVar.u(j2);
                    return j2;
                }
                throw new NumberParseException(NumberParseException.a.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            throw new NumberParseException(NumberParseException.a.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (cVar != null) {
            int a2 = cVar.a();
            String valueOf = String.valueOf(a2);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                f58 c2 = cVar.c();
                S(sb4, cVar, null);
                if ((!this.c.a(sb2, c2, false) && this.c.a(sb4, c2, false)) || f0(sb2, cVar) == d.TOO_LONG) {
                    sb.append((CharSequence) sb4);
                    if (z2) {
                        dVar.w(d.a.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    dVar.u(a2);
                    return a2;
                }
            }
        }
        dVar.u(0);
        return 0;
    }

    String Q(StringBuilder sb) {
        Matcher matcher = H.matcher(sb);
        if (matcher.find() && N(sb.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i2 = 1; i2 <= groupCount; i2++) {
                if (matcher.group(i2) != null) {
                    String group = matcher.group(i2);
                    sb.delete(matcher.start(), sb.length());
                    return group;
                }
            }
            return "";
        }
        return "";
    }

    d.a R(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return d.a.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = r.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            T(sb);
            return d.a.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern a2 = this.e.a(str);
        T(sb);
        if (b0(a2, sb)) {
            return d.a.FROM_NUMBER_WITH_IDD;
        }
        return d.a.FROM_DEFAULT_COUNTRY;
    }

    boolean S(StringBuilder sb, com.google.i18n.phonenumbers.c cVar, StringBuilder sb2) {
        int length = sb.length();
        String k2 = cVar.k();
        if (length != 0 && k2.length() != 0) {
            Matcher matcher = this.e.a(k2).matcher(sb);
            if (matcher.lookingAt()) {
                f58 c2 = cVar.c();
                boolean a2 = this.c.a(sb, c2, false);
                int groupCount = matcher.groupCount();
                String l2 = cVar.l();
                if (l2 != null && l2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(l2));
                    if (a2 && !this.c.a(sb3.toString(), c2, false)) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                    return true;
                } else if (a2 && !this.c.a(sb.substring(matcher.end()), c2, false)) {
                    return false;
                } else {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    public com.google.i18n.phonenumbers.d Y(CharSequence charSequence, String str) throws NumberParseException {
        com.google.i18n.phonenumbers.d dVar = new com.google.i18n.phonenumbers.d();
        Z(charSequence, str, dVar);
        return dVar;
    }

    public void Z(CharSequence charSequence, String str, com.google.i18n.phonenumbers.d dVar) throws NumberParseException {
        a0(charSequence, str, true, true, dVar);
    }

    d58 c(List<d58> list, String str) {
        for (d58 d58Var : list) {
            int c2 = d58Var.c();
            if (c2 == 0 || this.e.a(d58Var.b(c2 - 1)).matcher(str).lookingAt()) {
                if (this.e.a(d58Var.f()).matcher(str).matches()) {
                    return d58Var;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int parseInt = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i2));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public String m(com.google.i18n.phonenumbers.d dVar, EnumC0248b enumC0248b) {
        if (dVar.f() == 0) {
            String k2 = dVar.k();
            if (k2.length() > 0 || !dVar.l()) {
                return k2;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        n(dVar, enumC0248b, sb);
        return sb.toString();
    }

    public void n(com.google.i18n.phonenumbers.d dVar, EnumC0248b enumC0248b, StringBuilder sb) {
        sb.setLength(0);
        int c2 = dVar.c();
        String z2 = z(dVar);
        EnumC0248b enumC0248b2 = EnumC0248b.E164;
        if (enumC0248b == enumC0248b2) {
            sb.append(z2);
            c0(c2, enumC0248b2, sb);
        } else if (!H(c2)) {
            sb.append(z2);
        } else {
            com.google.i18n.phonenumbers.c y2 = y(c2, D(c2));
            sb.append(o(z2, y2, enumC0248b));
            O(dVar, y2, enumC0248b, sb);
            c0(c2, enumC0248b, sb);
        }
    }

    public com.google.i18n.phonenumbers.a s(String str) {
        return new com.google.i18n.phonenumbers.a(str);
    }

    public int t(String str) {
        if (!M(str)) {
            Logger logger = h;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(") provided.");
            logger.log(level, sb.toString());
            return 0;
        }
        return u(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.i18n.phonenumbers.c w(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        com.google.i18n.phonenumbers.c b = this.a.b(i2);
        h(b, "Missing metadata for country code " + i2);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.i18n.phonenumbers.c x(String str) {
        if (!M(str)) {
            return null;
        }
        com.google.i18n.phonenumbers.c a2 = this.a.a(str);
        h(a2, "Missing metadata for region code " + str);
        return a2;
    }

    public String z(com.google.i18n.phonenumbers.d dVar) {
        StringBuilder sb = new StringBuilder();
        if (dVar.s() && dVar.i() > 0) {
            char[] cArr = new char[dVar.i()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(dVar.f());
        return sb.toString();
    }
}
